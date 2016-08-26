
public class UsedCar extends Car {
	private int miles;
	
	public UsedCar(String mk, String md, int y, double p, int m) 
	{
		super(mk, md, y, p);
		miles =  m;	
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

}