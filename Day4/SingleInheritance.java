package Day4;

class shapes{
	void display() {
		System.out.println("Perimeter");
	}
}
class Square extends shapes{
	void area() {
		System.out.println("Area");
	}
}
    class Test{
	   public static void main(String[] args) {
		   Square sq = new Square();
		   sq.display();
		   sq.area();
   }
	
		

	}
