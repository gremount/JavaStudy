package basic_study;

public class TestRTTI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human aPerson = new Human();
		Class c1=aPerson.getClass();
		System.out.println(c1.getName());
		Human anotherPerson=new Woman();
		Class c2=anotherPerson.getClass();
		System.out.println(c2.getName());
	}
}

class Human
{
	public int getHeight(){
		return this.height;
	}
	public void growHeight(int h)
	{
		this.height=this.height+h;
	}
	private int height;
	
}

class Woman extends Human
{
	/*
	 * new method
	 */
	public Human giveBirth()
	{
		System.out.println("Give birth");
		return (new Human());
	}
}