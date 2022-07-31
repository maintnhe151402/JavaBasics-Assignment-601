package bmi;

import java.util.Scanner;

public class Calculator {

	public enum Operator {
		ADD("+"), SUBTRACT("-"), MULTIPLE("*"), DIVIDE("/"), POWER("^"), EQUAL("=");

		final String abb;

		private Operator(String abb) {
			this.abb = abb;
		}

		public String getAbb() {
			return abb;
		}
	}

	public enum BMI {
		UNDER_STANDARD, STANDARD, OVERWEIGHT, OBESE_1, OBESE_2
	}

	public double calculate(double a, Operator operator, double b) {
		switch (operator) {
		case ADD:
			return a + b;
		case SUBTRACT:
			return a - b;
		case MULTIPLE:
			return a * b;
		case DIVIDE:
			return a / b;
		case POWER:
			return Math.pow(a, b);
		default:
			break;
		}
		return a;
	}

	public BMI calculateBMI(double weight, double height) {
		BMI bmi = BMI.OBESE_2;
		double BMI_Value = weight / (height * height);
		if (BMI_Value < 19) {
			bmi = BMI.UNDER_STANDARD;
		} else if (BMI_Value < 25) {
			bmi = BMI.STANDARD;
		} else if (BMI_Value < 30) {
			bmi = BMI.OVERWEIGHT;
		} else if (BMI_Value < 40) {
			bmi = BMI.OBESE_1;
		}

		return bmi;
	}

	public void calculate() {
		Double memory = checkIn("Enter number: ");
		Operator ope = null;
		do {

			ope = checkOperator();
			if (ope.getAbb().equals("=")) {
				System.out.println("Result: " + memory);
				break;
			}
			double b = checkIn("Enter number: ");
			memory = calculate(memory, ope, b);
			System.out.println("Memory: " + memory);
		} while (!ope.getAbb().equals("="));
	}

	public void calculateBMI() {
		double weight = checkIn("Enter weight: ");
		double height = checkIn("Enter height: ");
		System.out.println("BMI Status: " + calculateBMI(weight, height / 100));
	}

	public Double checkIn(String inputVal) {
		double i;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print(inputVal);
			try {
				i = Double.parseDouble(sc.nextLine());
				if (i >= Double.NEGATIVE_INFINITY && i <= Double.POSITIVE_INFINITY)
					return i;
				else
					System.out.println("Out of range");

			} catch (Exception e) {
				System.out.println("Please input number.");
			}
		} while (true);
	}

	public Operator checkOperator() {
		String i;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter operator: ");
			try {
				i = sc.next().trim();
				boolean check = false;
				Operator ope = null;
				for (Operator op : Operator.values()) {
					if (op.getAbb().equalsIgnoreCase(i)) {
						check = true;
						ope = op;
					}
				}
				if (check)
					return ope;
				else
					System.out.println("Please input (+, -, *, /, ^, =)");
			} catch (Exception e) {
				System.out.println("Please input operator.");
			}
		} while (true);

	}

	public int GetInt(String msg, int min, int max) {
		int i;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print(msg);
			try {
				i = Integer.parseInt(sc.nextLine());
				if (i >= min && i <= max)
					return i;
				else
					System.out.println("Out of range");

			} catch (Exception e) {
				System.err.println(e);
			}
		} while (true);
	}

}
