package gitTutorial;


public class Main {

   public static void main(String[] args) {
       SalesData data = new SalesData();
       displayGreeting();
       data.display();
   } //End main


  private static void displayGreeting() {
           System.out.println("hellow happy sales people!");
           System.out.println("This app shows sales data");
           System.out.println("___________________________");
           System.out.println("Test 1");
           System.out.println("Test 2");
  } //End displayGreeting

}  //End class Main