package basic_study;

public class If_study {
	public static void main(String[] args){
		int a=2016;
		if(a%4==0 && a%400==0)
			System.out.println("2016是闰年");
		else
			System.out.println("2016不是闰年");
	}
}