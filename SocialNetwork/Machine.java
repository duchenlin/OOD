package SocialNetwork;

import java.util.ArrayList;

public class Machine {
    public ArrayList<person> personList = new ArrayList<person>() ;
    public int MachineID ;
    
    public Machine(int id)
    {
        this.MachineID = id ;
    }
    public void setMachineID(int id)
    {
        this.MachineID = id ;
    }
    
    public boolean LookUpPerson(person p)
    {
        return this.MachineID == p.getItsMachineID() ;     // look up if the person in this machine        
    }
    public void addToMachine(person p)
    {
        personList.add(p);
    }
    public ArrayList<person> getPersonListFromMachine()
    {
       return personList ;
    }
}
