public class Thermos {
	String Brand;
	double Liquid;
	String Liq_name;
	double Liq;
	double Liq2;
	
	Thermos(String Brand,double Liquid,String Liq_name,double Liq,double Liq2)
	{
		this.Brand=Brand;
		this.Liquid=Liquid;
		this.Liq_name=Liq_name;
		this.Liq=Liq;
		this.Liq2=Liq2;
	}
	double addLiquid()
	{
		Liquid=Liquid+Liq;
		return Liquid;
	}
	double pourLiq()
	{
		Liquid=Liquid-Liq2;
		return Liquid;
	}
	void display()
	{
		System.out.println("Brand:"+Brand);
		System.out.println("Liquid:"+Liq_name);
		System.out.println("Liquid:"+Liq+"litres");
		System.out.println("After Poured:"+Liq2+"litres");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thermos u1=new Thermos("Godrej",0,"Orange Juice",0.5,0.25);
		u1.addLiquid();
		u1.pourLiq();
		u1.display();
	}

}