package SocialNetwork;

import java.util.ArrayList;

public class person {
    private String inform ; // person information 
    private int PID ;
    private ArrayList<Integer> friendList ; // use Friend ID Friends List 
    private int MachineID ; // person store in which machine 
    private Server server = new Server() ;
    
    public person(String inform, int PID , int machineID )
    {
        this.inform = inform ;
        this.PID = PID ;
        this.MachineID = machineID ;
    }
    public void setPeronInform(String inform)
    {
        this.inform = inform ;
    }
    public void setPersonID(int ID)
    {
        this.PID = ID ;
    }
    public void addToFreindList(int FreindID)
    {
        friendList.add(FreindID) ;
    }
    public int getPersonID ()
    {
        return PID ; 
    }
    public String getPersonInform()
    {
        return inform ;
    }
    public int getItsMachineID()
    {
        return MachineID ;
    }
    
    public int[] getFriendList() // get friendID from the freindList
    {
        int[] temp = new int[friendList.size()] ;
        for(int i = 0 ; i <friendList.size(); i ++ )
        {
            temp[i] = friendList.get(i) ;
        }
        return temp ;
    }
    public person LookUpFriends(int ID, int machineID) // give a userID, machineID look for friend
    {
        for(Machine m : server.machineList)
        {       
            if (m.machineID == machineID) 
            {
                for(person p : m.personList)
                {
                    if (p.PID== ID)
                        return p;
                }
            }   
        }
        return null ;
    }
    public Machine LookUpMachine(int machineID) // given a machineID to look for machine 
    {
          for(Machine m : server.machineList)
          {
              if (m.machineID == machineID)
                  return m ;
          }   
          return null ;
    }


}
