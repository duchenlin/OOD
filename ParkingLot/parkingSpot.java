package ParkingLot;

public class parkingSpot {
		public boolean isFree ;  // whether the spot is free or not 
	    public int rank ; //  parking spot level 
	    parkingLot plot ;
	    public parkingSpot(int rank)
	    {
	        this.rank = rank ;
	    }
	    void CarOccupied(Car car)
	    {
	        isFree = false ;
	    }
	    void ReleasedLot(Car car)
	    {
	       isFree = true ; 
	       plot.getNextLot(car) ;
	    }
	    void CantParkCar(Car car) // can't park car
	    {
	    	car.Plevel =car.Plevel + 1;
	    	plot.EsclateParkingLot(car) ;
	    	isFree = true ;
	    	plot.getNextLot(car) ;
	    }
	   


}
