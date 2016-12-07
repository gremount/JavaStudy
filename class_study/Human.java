package class_study;

class Human implements Animal{
	/*
	 Human的构造函数
	 */
	Human(int h){
		this.height=h;
		System.out.println("I am born");
	}
	void say(){
		System.out.println("Human say Hello");
	}
	int height;
	
	@Override
	public void drinkWater() {
		System.out.println("drink water");
	}
}