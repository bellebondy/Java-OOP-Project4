/*********************************************************************
 Author    : Belle Bondy
 Course    : COP3804 Intermediate Java
 Professor : Michael Robinson 
 Program # : COP3804pgm4b_4
             { This file defines the super class used to explore
               polymorphism, inheritance, and method behaviour.
               It includes three core methods. One final, one with 
               parameters, and one simple message to be inherited or
               extended by subclasses later in the program. }

 Due Date  : 07/25/2025


 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Belle Bondy }..........
*********************************************************************/

public class bondyBSuperPgm4
{

    // This method will accept one int value and display it
    // The keyword final is used so it will not be able to be inherited 
    public final static void method1( int num1 )
    {

        // Displaying the int value received
        System.out.printf( "%d\n", num1 );        

    } // End of public final static void method1( int num1 )


    // This method will accept two String values and display them 
    // This method CAN be inherited
    public static void method2( String str1, String str2 )
    {

        // Displaying strings and "I am super method2"
        System.out.printf( "%s, %s\n", str1, str2 );
        System.out.printf( "%s\n", "I am super method2" );


    } // End of public static void method2( String str1, String str2 )


    // This method accepts no parameters and displays "I am super method3"
    // This method CAN be inherited 
    public static void method3()
    {

        // Displaying the requested message
        System.out.printf( "%s\n", "I am super method3" );

    } // End of static void method3()


} // End of public class bondyBSuperPgm4
