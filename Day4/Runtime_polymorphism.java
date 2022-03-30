package Day4;

class Animals
{  
void eat()
{
	System.out.println("eating...");
	}  
}  
class Dogs extends Animal
{  
void eat()
{
	System.out.println("eating bread...");
	}  
}  
class Cats extends Animal
{  
void eat()
{
	System.out.println("eating rat...");
	}  
}  
class Lion extends Animal
{  
void eat()
{
	System.out.println("eating meat...");
	}  
}  
class Testing
{  
public static void main(String[] args){  
Animal a;  
a=new Dog();  
a.eat();  
a=new Cat();  
a.eat();  
a=new Lion();  
a.eat();  
}

}  
