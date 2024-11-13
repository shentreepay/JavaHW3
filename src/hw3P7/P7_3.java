package hw3P7;

public class P7_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.num = 123455;
		car1.gas = 20.5;
		
		Car car2 = new Car();
		car2.num = 4564665;
		car2.gas = 40.5;
		
		System.out.println("一號車號是:"+car1.num);
		System.out.println("一號汽油量是:"+car1.gas);
		System.out.println("二號車號是:"+car2.num);
		System.out.print("二號汽油量是:"+car2.gas);
	}

}
class Car
{
	int num;
	double gas;
}