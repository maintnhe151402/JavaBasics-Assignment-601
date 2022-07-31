package bmi;

public class Main {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int i;
		do {
			System.out.println("======= Calculator Program =======");
			System.out.println("1. Normal Calculator");
			System.out.println("2. BMI Calculator");
			System.out.println("3. Exit");
			i=cal.GetInt("Please choice one option: ", 1, 3);
			switch(i) {
			case 1:
				cal.calculate();
				break;
			case 2:
				cal.calculateBMI();
				break;
			case 3:
				break;
			}
		}while(i!=3);
		
	}

}
