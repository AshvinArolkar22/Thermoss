public class Thermos {
	String Brand;
	double Liquid;
	String Liq_name;
	
	Thermos(String Brand,double Liquid,String Liq_name)
	{
		this.Brand=Brand;
		this.Liquid=Liquid;
		this.Liq_name=Liq_name;
	}
	void addLiquid(double Liq)
	{
		Liquid=Liquid+Liq;
	}
	void display()
	{
		System.out.println("Brand:"+Brand);
		System.out.println("Liquid:"+Liquid);
		System.out.println("Liquid:"+Liquid+"litres");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thermos u1=new Thermos("Godrej",0,"Orange Juice");
		u1.addLiquid(0.5);
		u1.display();
	}

}