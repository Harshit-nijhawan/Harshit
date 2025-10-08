public class Calculator {
   public int calculate(int a,int b,String operation){
      switch (operation) {
         case "+":
            return a + b;
         case "-":
            return a - b;
         case "*":
            return a * b;
         case "/":
            return a / b;
         case "%":
            return a % b;
      }
      return Integer.MIN_VALUE;
   }
   public double calculate(double a,double b){
      return a*b;
   }
   public int calculate(int a,int b,int c){
      return a + b + c;
   }
   public static void main(String[] args) {
      Calculator cal = new Calculator();
      System.out.println("Multiply of two Integer "+cal.calculate(10, 20,"*"));
      System.out.println("Multiply of two double "+cal.calculate(10.5, 20.5));
      System.out.println("Sum of three Integers "+cal.calculate(10, 20,30));

   }
}
