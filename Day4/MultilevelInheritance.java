package Day4;

class Car{
	void Car()
{
	System.out.println("Car Class");
}
    void vehicleType()
{
	System.out.println("Type of vehicle: Car");
}
}
class Tiago extends Car{
	void Tiago()
	{
		System.out.println("Car Tiago");
	}
	void Brand()
	{
		System.out.println("Brand is Tiago");
		
	}
	void speed()
	{
		System.out.println("Maximum speed is 10Kmph");
	}
}
class TiagoXZ extends Tiago{
	void TiagoXZ()
	{
		System.out.println("Tiago Model: XZ");
	}
	void speed() 
	{
	System.out.println("Maximum speed is 100Kmph");	
	}
	public static void main(String[] args) {
	  
		TiagoXZ tiago = new TiagoXZ();
		tiago.speed();
		tiago.Brand();
	}

}
