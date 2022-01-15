package interfacesancCollection;

class Emplnfo{
	int id;
	String name;
	
	void display() {
		System.out.println(id+""+name);
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emplnfo emp1=new Emplnfo();
		Emplnfo emp2=new Emplnfo();
		
		emp1.display();
		emp2.display();

	}

}
//parameterized constructor
class Std{
	int id;
	String name;
	
	Std(int i,String n)
	{
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+""+name);
	}
	

public class paramConstrDemo{
	public static void main(String[] args) {
		
		Std std1=new Std(2,"Nisha");
		Std std2=new Std(5,"Sakshi");
		std1.display();
		std2.display();
	}
		
		
	}
}