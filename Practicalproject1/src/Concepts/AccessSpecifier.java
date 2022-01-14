package Concepts;

class defAccessSpecifier
{
	void display()
	{
		System.out.println("You are using default access specifier");
	}
}

public class AccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier();
		obj.display();

	}

}
class priaccessspecifier
{
	private void display()
	{
		System.out.println("You are using Private Access Specifier");
		priaccessspecifier obj=new priaccessspecifier();
	}
}


