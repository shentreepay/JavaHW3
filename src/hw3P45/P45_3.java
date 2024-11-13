package hw3P45;

public class P45_3 {
	public static void main(String[] args) {
		System.out.println("宣告了car1");
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		System.out.println("宣告car2");
		Car car2;
		
		System.out.println("將car1指定給了car2");
		car2 = car1;
		
		System.out.print("car1的");
		car1.show();
		System.out.print("car2的");
		car2.show();
		
		System.out.println("改變car1的相關資料");
		car1.setCar(2345, 30.5);
		
		System.out.print("car1的");
		car1.show();
		System.out.print("car2的");
		car2.show();
	}
}
class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.print("生產了車子，");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("車號為"+ num +"，汽油量為"+ gas);
	}
	
	public void show()
	{
		System.out.print("車號是:"+this.num);
		System.out.println(" 汽油量是:"+this.gas);
	}
}