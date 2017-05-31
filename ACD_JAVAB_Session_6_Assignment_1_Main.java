/* ACD_JAVAB_Session_6_Assignment_1_Main :
 * Defining an interface and its implementation in two different classes in different ways.
 */
package session6;

import java.util.Scanner;

interface testInterface 
{
	void testFunction(int testParameter);
}


class testClass1 implements testInterface 
{
    public void testFunction(int a) 
    {
         System.out.println("Implementing Interface from testClass1 : " + a);
 
    }
}


class testClass2 implements testInterface 
{
	public void testFunction(int a) 
	{
	    System.out.println("Implementing Interface from testClass2 ");
	
	    System.out.println("Square of " + a + " : " + (a * a));
	
	 }
}

public class ACD_JAVAB_Session_6_Assignment_1_Main 
{
	public static void main(String[] args) 
	{
		int x;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Value : ");
		x = s.nextInt();
		
		 testClass1 tc1 = new testClass1();
		 
		 testClass2 tc2 = new testClass2();
	 
		 tc1.testFunction(x);
	 
	     tc2.testFunction(x); 
	}
}

/* OUTPUT
Enter a Value :
10
Implementing Interface from testClass1 : 10
Implementing Interface from testClass2
Square of 10 : 100
*/