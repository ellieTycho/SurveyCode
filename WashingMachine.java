public class WashingMachine{
	
	private int limescaleLevel = 0;
	
	public ArrayList<ClothingItem> washClothes(
		ArrayList<ClothingItem> clothes,
		int washingPowder )
	{	
		if( washingPowder/clothes.size() > 2 ){		
			for(ClothingItem c: clothes){
				c.clean();		
			}
		}
		
		limescaleLevel = limescaleLevel + 10;	
		return clothes;
	}
	
	public void cleanMachine(){
		if(limescaleLevel<50){
			limescaleLevel = 0;
		}
		else{
			limescaleLevel = limescaleLevel - 50;
		}
	}
	
	public ArrayList<ClothingItem> dryClothes(
		ArrayList<ClothingItem> clothes)
	{
		for(ClothingItem c: clothes){
			c.dry();		
		}
			
		return clothes;
	}
	
	public void hangClothesUp(
		ArrayList<ClothingItem> clothes,
		ClothesLine line )
	{
		for(ClothingItem c: clothes){
			line.addItem(c);		
		}
	}
	
	public ArrayList<ClothingItem> takeClothesDown(
		ClothesLine line )
	{	
		return line.getClothes();	
	}
}
