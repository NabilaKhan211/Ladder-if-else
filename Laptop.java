/*

7.Laptop Battery Percentage – <20% Low, 20–50 Medium, 50–80 Good, 80–100 Full.

*/
 
public class Laptop{
    public static void main (String[] agrs){

int battery = 19;

if (battery <=100 && battery >= 80){
   System.out.println("Full battery");
}
else if (battery <= 80 && battery >= 50){
  System.out.println("Good battery");
}
else if (battery <= 50 && battery >= 20){
  System.out.println("Medium battery");
}
else if (battery < 20){
  System.out.println("Low battery");
}
else {
  System.out.println("empty");
}




}
}