package model.tile;

public class TileFactory {
	
	private static TileFactory instance;

    private TileFactory() {}
    
    // Singleton -> This guarentess that we just create one instance
    public static TileFactory getInstance() {
        if(instance == null){
            instance = new TileFactory();
        }
        return instance;
    }
    
    
    public Tile generateTile(int tileCategory) {
        Tile tile = null;
        
        switch(tileCategory) {
        	// Blank Tile
        	case 0:
        		tile = new BlankTile();
        		break;
        	// Pit
        	case 1:
        		tile = new Pit();
        		break;
        	default:
        		tile = new BlankTile();
        }
		return tile;
    	
    }
}
