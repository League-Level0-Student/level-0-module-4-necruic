package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for (int i = 0; i < 1;) {
	

		// 1. Get 2 numbers from the user and convert them to integer.
String number1 = JOptionPane.showInputDialog("enter one number.");
String number2 = JOptionPane.showInputDialog("give me a number.");
int numberint1 = Integer.parseInt(number1);
int numberint2 = Integer.parseInt(number2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What operation would you like to use?", "Operations", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
System.out.println(operation);
if (operation == 0) {
	add(numberint1, numberint2);
}
else if (operation == 1) {
	subtract(numberint1, numberint2);
}
else if (operation ==2) {
	multiply(numberint1, numberint2);
}
else if (operation ==3) {
	divide(numberint1, numberint2);
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	}
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int a, int b) {
	JOptionPane.showMessageDialog(null, a+"+"+b+"="+(a+b));
}
static void subtract(int a, int b) {
	JOptionPane.showMessageDialog(null, a+"-"+b+"="+(a-b));
}
static void multiply(int a, int b) {
	JOptionPane.showMessageDialog(null, a+"x"+b+"="+(a*b));
}
static void divide(int a, int b) {
	JOptionPane.showMessageDialog(null, a+"÷"
			+ ""+b+"="+(a/b));
}
	// 4. Create similar methods for subtraction, multiplication and division.
}