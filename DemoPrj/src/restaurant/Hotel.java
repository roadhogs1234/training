package restaurant;

public class Hotel implements Veg,NonVeg{
	int total = 0;
	@Override
	public void alootikka() {
		System.out.println("Aloo Tikka = 130");
		total+=130;
	}
	@Override
	public void Chi65() {
		// TODO Auto-generated method stub
		System.out.println("Chicken 65 = 150");
		total+=150;
	}
	@Override
	public void chickensando() {
		// TODO Auto-generated method stub
		System.out.println("Chicken Sandwich = 220");
		total+=220;
		
	}
	@Override
	public void gobim() {
		// TODO Auto-generated method stub
		System.out.println("Gobi Manchurian = 140");
		total+=140;
		
	}
	public void total() {
		System.out.println("Total = "+total);
	}
}
