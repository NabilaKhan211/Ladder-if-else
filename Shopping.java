/*

8.Shopping Discount – ₹1–500 (No discount), 500–1000 (10%), 1000–2000 (20%), >2000 (30%).

*/

public class Shopping{
  public static void main (String[] agrs){

int discount = 0;

if (discount > 2000){
  System.out.println("30 % discount");
}
else if (discount <=2000 && discount >= 1000){
  System.out.println("20 % discount");
}
else if (discount <= 1000 && discount >= 500){
  System.out.println("10 % discount");
}
else if (discount <= 500 && discount >= 1){
  System.out.println("No discount");
}
else{
  System.out.println("Close offer");
}

}
}