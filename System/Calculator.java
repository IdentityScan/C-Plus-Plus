import java.util.Scanner;
import java.lang.String;
import java.lang.Float;
import java.util.Locale;

// 09:35 19/09/2026 (Brazilian System Date)
// @Author: Sahel_Cavalieri (IdentityScan)
// @Version 5.0
// @Repositório https://github.com/IdentityScan/Java/System
// @Total Lines:  144
// @Website: mundopauta.com.br/
// @License: MIT

/*
DISCLAIMER

The OperationCalculatorMath class is designed to perform basic mathematical calculations using numeric values provided as input strings. The class contains private attributes, a constructor responsible for receiving the input values, a private verifyEmptyValues() method used to validate empty inputs, and a public processCalculation() method responsible for processing the selected mathematical operation.

The system allows the user to enter floating-point values and select one of the following mathematical operations: addition, subtraction, multiplication, or division.

The system also handles situations in which one or both numeric values are not provided, as well as cases in which no mathematical operation is selected.

If numeric values are not entered but a mathematical operation is selected, the missing values are treated as zero. As a result, addition, subtraction, and multiplication may produce zero as the calculation result.

Division requires additional validation. A division by zero does not produce a valid mathematical result. Therefore, when the divisor is zero, the operation must be rejected instead of returning an invalid or undefined result such as NaN or Infinity.
*/

/*
Note 1

java.lang.Float is used to convert textual input into float values, especially when input is first captured with Scanner.nextLine(), avoiding newline (\n) issues when different data types are read sequentially.

java.util.Locale is used to define the U.S. numeric format, where "." is used as the decimal separator instead of ",". This choice is appropriate here because floating-point values in Java source notation conventionally use "." as the decimal separator.
*/

/* 
Note 2

For this program, Class OperationCalculatorMath inner same source code. But if you want put in two files. If you settings the class for public class.*/


class OperationCalculatorMath
{
	private float valueA, valueB ,resultAB;
	private String operatorSymbol, getFactorA, getFactorB;
	
	public OperationCalculatorMath(String factorA, String factorB, String symbol)
	{
		getFactorA = factorA;
		getFactorB = factorB;
		operatorSymbol = symbol;
	}

	// Test if valueA and ValueB is empty or NULL
	private void verifyEmptyValues()
	{
		if (getFactorA.isBlank())
		{
			valueA = 0.0f; // If true, valueA receive 0.0f
			
		} else 
		{
			valueA = Float.parseFloat(getFactorA);
		}

		if (getFactorB.isBlank())
		{
			valueB = 0.0f; // If true, valueB receive 0.0f
		} else 
		{
			valueB= Float.parseFloat(getFactorB);
		}
	}

	void processCalculation()
	{
		verifyEmptyValues();
		if (!operatorSymbol.isBlank())
		{
			if (operatorSymbol.equals("+"))
			{
				resultAB = valueA + valueB;
				System.out.println("Result (sum) is " + resultAB);
			}	 

			if (operatorSymbol.equals("-"))
			{
				resultAB = valueA - valueB;
				System.out.println("Result (minus) is " + resultAB);
			}

			if (operatorSymbol.equals("*") || operatorSymbol.equals("x"))
			{
				resultAB = valueA * valueB;
				System.out.println("Result (mutiply) is " + resultAB);
			}
			
			if (operatorSymbol.equals("/"))
			{
				if (valueB == 0.0f)
				{
					System.out.println("Result (divided) is undefined.");
				} else
				{
				resultAB = valueA / valueB;
				System.out.println("Result (divided) is " + resultAB);
				}
			}
		} else 
		{
			System.out.println("Please, input a valid operator.");
		}
	}
}

public class Calculator
{
	public static String operatorSymbolInput = " ", valueInputA = " ", valueInputB = " ";

	public static void main (String[]args)
	{
		Scanner getValue = new Scanner(System.in);
		getValue.useLocale(Locale.US); // If you outside metric
		// system US

		// Get some value from user
		// Float number get like String for a test is NULL
		// So Float.parse inside the class Calculator
		System.out.println("Input first number");
		valueInputA = getValue.nextLine();
		
		System.out.println("Which math operation?");
		operatorSymbolInput = getValue.nextLine();

		System.out.println("Input second number");
		valueInputB = getValue.nextLine();

		// Call class Calculator
		OperationCalculatorMath math = new OperationCalculatorMath(valueInputA, valueInputB, operatorSymbolInput);
		
		// Result if sum, minus, divided or multiply
		math.processCalculation();
		
	}
}
