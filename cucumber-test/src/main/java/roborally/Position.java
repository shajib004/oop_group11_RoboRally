package roborally;


public class Position {
	protected  int x;
	protected  int y;
	//protected static boolean isEmpty = true;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
 
    public  int getX() {
        return this.x;
    }

    public  int getY() {
        return this.y;
    }
    public void  setX(int x) {
         this.x=x;
    }

    public void setY(int y) {
         this.y =y;
    }
    
    public  void setPosition(int x, int y) {
		this.x = x;
	    this.y = y;	   
	}
    
    public Position getPosition() { 
			this.x = this.getX();
			this.y = this.getY();
			return this;
	}
    public boolean equals(Object obj) {
		 if (obj instanceof Position) {
			 return (
					 this.x == ((Position) obj).x 
					 && 
					 this.y == ((Position) obj).y 					
					 )
					 ;
		    }
	         return false;
	    	} 
			
    //need to define what is empty
    public static boolean isEmpty(int x,int y) {
    	return true; // The board should check if the there is a free spot (is "empty") not the position itselft.
    				//Position is just a x coordinate and y coordinate.
    }
}
