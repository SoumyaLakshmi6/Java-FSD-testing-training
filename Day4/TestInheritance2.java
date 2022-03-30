package Day4;

//multilevel inheritance
/*class Animal
{
	void eat()
	{
	System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
	System.out.println("Dog is barking");
	}
}*/
class Puppy extends Dog{
	void weeping()
	{
		System.out.println("Puppy is weeping");
	}
}
class TestInheritance2
{
	public static void main(String[] args)
	{
		// syntax for creating a object
		// Class_name object_name=new Class_name();
		Puppy obj=new Puppy();
		obj.weeping();
		obj.bark();
		obj.eat();
	}
}
