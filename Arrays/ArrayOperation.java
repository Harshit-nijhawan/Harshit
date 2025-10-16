// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         int arr[] = new int[100];
//         int TotalMarks = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter marks of subjects: ");
//         for(int i = 0;i<5;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0;i<5;i++){
//             TotalMarks += arr[i];
//         }
//         int percentage = TotalMarks/5;
//         System.out.println("Total Marks out of 500 are: "+ TotalMarks);
//         System.out.println("Percentage: "+ percentage);
//         if(percentage>=80){
//             System.out.println("A Grade");
//         }
//         else if(percentage<=79 && percentage>= 70){
//             System.out.println("B Grade");
//         }
//         else if(percentage<=69 && percentage>=60){
//             System.out.println("C Grade");
//         }
//         else if(percentage<=59 && percentage>=50){
//             System.out.println("D Grade");
//         }
//         else {
//             System.out.println("F Grade");
//         }

//     }
// }

// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         int arr[] = new int[100];
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Annual Income: ");
//         int AnnualIncome = sc.nextInt();
//         double IncomeAfterTax = 0;
//         System.out.println("Annual Income is: "+ AnnualIncome);
//         if(AnnualIncome<=250000){
//             IncomeAfterTax = AnnualIncome;
//             System.out.println("Income after tax: "+IncomeAfterTax);
//         }
//         else if(AnnualIncome>250000 && AnnualIncome<=500000){
//             IncomeAfterTax = AnnualIncome- (AnnualIncome - 250000)* 0.05;
//             System.out.println("Income after Tax: "+ IncomeAfterTax);

//         }   
//         else if(AnnualIncome>500001 && AnnualIncome<=1000000){
//             IncomeAfterTax = AnnualIncome - (250000 * 0.05) - (AnnualIncome-500000)*0.1;
//             System.out.println("Income after Tax: "+ IncomeAfterTax);

//         }
//         else if(AnnualIncome>1000001 && AnnualIncome<=1500000){
//             IncomeAfterTax = AnnualIncome - (250000*0.05) - (500000*0.1) - (AnnualIncome-1000000)*0.2;
//             System.out.println("Income after Tax: "+ IncomeAfterTax);
//         }
//         else {
//             IncomeAfterTax = AnnualIncome - (250000*0.05) - (500000*0.1) - (1000000*0.2) - (AnnualIncome-1500000)*0.3;
//             System.out.println("Income after Tax: "+ IncomeAfterTax);

//         }

//     }
// }

// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 1st no: ");
//         double n1 = sc.nextInt();
//         System.out.print("Enter 1st no: ");
//         double n2 = sc.nextInt();
//         System.out.print("Enter operator: ");
//         char op = sc.next().charAt(0);
//         switch(op){
//             case '+':{
//                 System.out.print("Addition of two number are: "+ (n1+n2));
//                 break;
//             }
//             case '-':{
//                 System.out.print("Subtraction of two number are: "+ (n1-n2));
//                 break;
//             }
//             case '*':{
//                 System.out.print("Multiplication of two number are: "+ (n1*n2));
//                 break;
//             }
//             case '/':{
//                 if (n2 != 0) {
//                     System.out.println("Division of two numbers is: " + (n1 / n2));
//                 } else {
//                     System.out.println("Division by zero is not allowed!");
//                 }                
//                 break;
//             }
//             case '%':{
//                 if (n2 != 0) {
//                     System.out.println("Modulus of two numbers is: " + (n1 % n2));
//                 } else {
//                     System.out.println("Modulus by zero is not allowed!");
//                 }                
//                 break;
//             }
//             default:{
//                 System.out.println("Please select proper operator: ");
//                 break;
//             }

//         }

//     }
// }

// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         switch(num){
//             case 11:
//             case 12:
//             case 1:
//             case 2:{
//                 System.out.print("Winter");
//                 break;
//             }
//             case 3:
//             case 4:
//             case 5:
//             case 6:{
//                 System.out.print("Summer");
//                 break;
//             }
//             case 7:
//             case 8:
//             case 9:
//             case 10:{
//                 System.out.print("Rainy");
//                 break;
//             }
//             default:{
//                 System.out.print("Enter valid month number from 1 to 12");
//                 break;
//             }
//         }
//     }
// }

// import java.util.*;

// class practice {
//     public static void main(String[] args) {
//         // Create a scanner object to take input
//         Scanner sc = new Scanner(System.in);

//         // Input the 4-digit number
//         int n = sc.nextInt();

//         // Start with an empty result string
//         String result = "";

//         // Extract digits from the back (ones digit first)
//         for (int i = 0; i < 4; i++) {
//             int digit = n % 10; // Extract the rightmost digit
//             n = n / 10; // Remove the rightmost digit from n
//             result = (digit + 1) % 10 + result; // Add 1 to the digit and add it to the result
//         }

//         // Output the new number
//         System.out.println(result);
//     }
// }

import java.util.*;

class ArrayOperation{
    public static void main(String args[]){
		int arr[]= {};
        System.out.println("Enter Your Choice: ");
        System.out.println("To Create Array Enter 1");
        System.out.println("To Show Data Enter 2");
        System.out.println("To Insert Element At Last Enter 3");
        System.out.println("To Insert Element At First Enter 4");
        System.out.println("To Insert Element At Given Position Enter 5");
        System.out.println("To Delete Element At Last Enter 6");
        System.out.println("To Delete Element At First Enter 7");
        System.out.println("To Delete Element At Given Position Enter 8");
        System.out.println("To Update Element At Given Position Enter 9");
        System.out.println("To Search Element Enter 10");
        System.out.println("To Sort Array Enter 11");
        System.out.println("To Reverse Array Enter 12");
        System.out.println("To Exit Enter 13");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Enter Size Of Array:");
            int size = sc.nextInt();
            arr = new int[size];
            for(int i = 0;i<arr.length;i++){
                arr[i]= sc.nextInt();
            }
            break;
            
            case 2:
            for(int i = 0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
			break;

            case 3: 
            // int ElementLast = sc.nextInt();
        }
        sc.close();
    }
            
}





// import java.util.Scanner;

// public class ArrayOperation {

// 	public static void main(String[] args) {
// int num[]= {};
// int i;
// int ch;
// String choice="";
// Scanner sc=new Scanner(System.in);

// do {
// 	System.out.println("Enter Your Choice");
// 	System.out.println("1. To crerate an Array");
// 	System.out.println("2. To show the data");
// 	System.out.println("3. To Add  data at last");
	
	
// 	ch=sc.nextInt();
// 	switch(ch)
// 	{
// 	case 1:
// 		int element;
// 		System.out.println("No of Element");
// 		element=sc.nextInt();
// 		num=new int[element];
// 		for(i=0;i<element;i++)
// 		{ System.out.println("Enter a number at["+i+"]");
// 			num[i]=sc.nextInt();
// 		}
// 		break;
		
// 	case 2:
// 		System.out.println("The data in array are");
// 		for(i=0;i<num.length;i++)
// 		{
// 			System.out.println(num[i]);
// 		}
// 		break;
// 	case 3:
// 		 int data;
// 		 System.out.println("Enter a data");
// 		 data=sc.nextInt();
// 		 int newarray[]=new int[num.length+1];
// 		 for(i=0;i<num.length;i++)
// 		 {
// 			newarray[i]=num[i]; 
// 		 }
// 		 newarray[i]=data;
// 		 num=new int[newarray.length];
// 		 for(i=0;i<newarray.length;i++)
// 			 num[i]=newarray[i];
		
// 	}
	
	
// 	System.out.println("Do You Want to Continue<Y/N>");
// 	choice=sc.next();
// }while(choice.equalsIgnoreCase("Y"));
		
// 	}

// }
