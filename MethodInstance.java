
public class MethodInstance{
	int age;
	String name;
	public void introduce()
		{
			System.out.println("Hello , My Name is "+ name + " and I am " + age + "old");
		
		}
	public static void main(String[] args)
	{
		MethodInstance person = new MethodInstance();
		person.age = 22;
		person.name = "Malleseh";
		person.introduce();	
	}
}