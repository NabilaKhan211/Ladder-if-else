/*

9.Number Sign – Negative, Zero, Positive.

*/

public class Sign{
   public static void main (String[] args){

int num = -10;

if (num >= -100 && num <= -1){
  System.out.println("Negative");
}
else if (num >=1 && num <= 100){
  System.out.println("Positive");
}
else {
  System.out.println("Zero");
}

}
}