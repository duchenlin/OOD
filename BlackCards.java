package Cards;


public class BlackCards extends Cards
{
/*
	public BlackCards(int c, Suit suits) {
		super(c, suits);
		// TODO Auto-generated constructor stub
	}

	
	
	public int Value()
	{
		int r =super.cardValue() ;
		if ( r == 1) return 11 ;
		if ( r <10) return r ;
		return 10;
	}
		public boolean isAce()
		{
			return super.cardValue() ==1 ;
		} 
		*/
    public BlackCards (int c, Suit s)
    {
        super(c,s) ;
    }
    public int Value()
    {
        if( super.cardValue() ==1 )  return 11 ;
        if ( super.cardValue() <10 ) 
            return super.cardValue() ;
            return 10 ;
    }
    boolean isAce()
    {
        return super.cardValue()==1 ;
    }
	}
	
	
