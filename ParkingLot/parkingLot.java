package ParkingLot;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class parkingLot {
	
	      //public parkingSpot spot ;
	       // public Car car ;
	       // public ParkingMeter parkingMeter ;
	       //  public int Limitation ; 
	        
	        static final int PARKING_LEVEL =3 ; // free parking  , meter parking, monthly parking
	        static final int FREE_LOTS_NUMER = 10 ; 
	        static final int METER_LOTS_NUMER = 20 ; 
	        static final int MONTH_LOTS_NUMER = 15 ;
	                
	         ArrayList<parkingSpot>[] parkingLeveList = new ArrayList[PARKING_LEVEL] ;  // linkedList for each category parking
	         Queue<Car>[] carQue = new LinkedList[PARKING_LEVEL] ;
	        public parkingLot()
	        {
	            ArrayList<parkingSpot> freeParkingLotList = new ArrayList(FREE_LOTS_NUMER ) ;
	            for (int i = 0 ; i < FREE_LOTS_NUMER; i++  )
	            {
	                freeParkingLotList.add(new FreeParkingSpot()) ;
	            }
	            parkingLeveList[0]= freeParkingLotList ;
	            
	            ArrayList<parkingSpot> MeterParkingLotList = new ArrayList(METER_LOTS_NUMER) ;
	            for(int i = 0 ; i <METER_LOTS_NUMER ; i++)
	            {
	                MeterParkingLotList.add(new MeterParkingSpot() );
	            }
	            parkingLeveList[1] = MeterParkingLotList ;
	            
	            ArrayList<parkingSpot> MonthParkingLotList = new ArrayList(MONTH_LOTS_NUMER ) ;
	            for(int i = 0 ; i<MONTH_LOTS_NUMER; i++)
	            {
	                MonthParkingLotList.add(new MonthlyParkingSpot()) ;
	            }
	            parkingLeveList[2] = MonthParkingLotList;
	        }
	        
	        public parkingSpot getNextLot(Car car)
	        {
	            for(int i = car.Plevel; i<PARKING_LEVEL ; i++)
	            {
	                ArrayList<parkingSpot> spotList = parkingLeveList[i] ;
	                    for(parkingSpot sp: spotList )
	                    {
	                        if( sp.isFree == true  )
	                        {
	                            return sp ;
	                        }
	                    }
	            }
	            return null ;
	        }
	        public void EsclateParkingLot (Car car)
	        {
	            parkingSpot sp = getNextLot(car) ;
	            if (sp !=null)
	            {
	                sp.CarOccupied(car);
	            }
	            else
	            {
	                carQue[car.Plevel].add(car) ; // car waiting queue
	            }
	        }
}



