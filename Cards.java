package Cards;

public class Cards {
	/*public enum Suit{
		CLUBS(1),SPADES(2),HEARTS(3),DIAMONDS(4);
		int value;
		private Suit(int value)
		{
			this.value = value ;
		}
	};
	protected int cards ;
	protected Suit suits ;
	
	public Cards(int c, Suit suits)
	{
		this.cards = c ;
		this.suits = suits;
	}
	public int Value ()
	{
		return cards;
	}
	public Suit suit()
	{
		return suits;
	}*/

	    public enum Suit
	    {
	       Heart(1), Spade(2),club(3),Diamond(4) ;
	       
	       private int v ;
	       private Suit(int i)
	       {
	           this.v = i;
	       }
	    } ;
	    
	    public int card; // card value
	    public Suit suit ; // card suit
	    
	    public Cards(int r, Suit s) // construct the card
	    {
	        this.card = r ;
	        this.suit = s ;
	    }
	    
	    public int cardValue()
	    {
	        return card ;
	    }
	    public Suit cardSuit()
	    {
	        return suit ;
	    }
	}

