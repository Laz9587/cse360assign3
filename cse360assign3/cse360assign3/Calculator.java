/**
 * Class to perform basic calculator functions add, subtract, 
 * multiply, and divide. It can also return the running total of the
 * operations performed and the history of the input.
 * 
 * @author Lazaro Ortiz pin # 621
 */
package cse360assign3;

public class Calculator {

	private int total;
	private String historyString;
	
	/**
	 * Initializes the calculator's total to zero
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		historyString = "0";
	}
	
	/**
	 * getTotal - provides the calculator's total value
	 * @return the value of total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add - adds the value in the parameter to the calculator total
	 * @param value the value that will be added to the total
	 */
	public void add (int value) {
		total += value;
		historyString += " " + '+' + " " + value;
	}
	
	/**
	 * subtract - subtracts the value in the parameter from the calculator total
	 * @param value the value that will be subtracted from total
	 */
	public void subtract (int value) {
		total -= value;
		historyString += " " + '-' + " " + value;
	}
	
	/**
	 * multiply - multiplies the value in the parameter to the total
	 * @param value the value that the total will be multiplied by
	 */
	public void multiply (int value) {
		total *= value;
		historyString += " " + '*' + " " + value;
	}
	
	/**
	 * divide - divides the total by the value in the parameter
	 * @param value the value that total will be divided by
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total /= value;
		historyString += " " + '/' + " " + value;
	}
	
	/**
	 * getHistory - provides the history of all the inputs the calculator received to include operators and operands
	 * @return string of the history created from the inputs the calculator received
	 */
	public String getHistory() {
		return historyString;
	}
}