import java.util.Scanner;
// boss here I am going to use a class scanner class which is available in java.util package.
// to use it pls load it into the memory and help us.

public class Main {

	// with arg with return
	// mehthod function :

	public static float add(float a, float b) {
		return a + b;

	}

	public static float sub(float a, float b) {
		return a - b;
	}

	public static float mul(float a, float b) {
		return a * b;
	}

	public static float div(float a, float b) {
		return a / b;
	}

	public static void main(String[] args) {
		// we need to call all the functionalities and it should be like a menu driven
		// program.

		// how to show all methods as an option to my user?
		// switch case

		// we need to render our options.
		//

		// Scanner Class : scanner is designed to accept the inputs from the user.
		// this scanner class is defined by java from the version 1.5.
		// it has built in functions / methods to accept specific type values.
		// to accept the integer : nextInt()
		// to accept float : nextFloat()
		// ...
		// Scanner class is available in java.utils package.
		// package : location where class / interfaces are available.

		Scanner scanner = new Scanner(System.in);
		// scanner : reference : it will refer teh object.
		// it will help us to use data / methods from object(which you will get it from
		// the RHS).
		// new : it will inform the java to create the object.
		// Scanner(): it is used to initialize the object===>
		// System.in : to accept the values from the commandline.

		while (true) {
			System.out
					.println("Enter the options based on choice " + "1. Add \n 2. sub  \n 3. div \n 4. mul \n 5. exit");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("addition case");
				System.out.println("Pls enter 2 numbers ");
				float number1 = scanner.nextFloat();
				float number2= scanner.nextFloat();
				
				System.out.println(number1);
				System.out.println(number2);
				float result = add(number1,number2);
				
				System.out.println("addition result is "+result);				

			}
				break;
			case 2: {

				System.out.println("Substraction case");
				System.out.println("Pls enter 2 numbers ");
				float number1 = scanner.nextFloat();
				float number2= scanner.nextFloat();
				
				System.out.println(number1);
				System.out.println(number2);
				float result = sub(number1,number2);
				
				System.out.println("substraction result is "+result);
			}
				break;
				
			case 3: {
				System.out.println("Division case");
				System.out.println("Pls enter 2 numbers ");
				float number1 = scanner.nextFloat();
				float number2= scanner.nextFloat();
				
				System.out.println(number1);
				System.out.println(number2);
				float result = div(number1,number2);
				
				System.out.println("division result is "+result);

			}
			case 4: {
				System.out.println("4");

			}
			case 5: {
				System.out.println("5");

				System.exit(0);// end the execution of the program.

			}
			break;
			default: {
				System.out.println("default case");
			}

			}
		}

	}

}

//public class Main {

// public static void main(String[] args) {
// TODO Auto-generated method stub

// print a simple message
// System.out.println("Hello from Java");

// float numberA = 10.4f;
// float numberB = 14.2f;

// float result = 0;

// result = numberA + numberB;

// System.out.println("result is " + result);

// }

// }
