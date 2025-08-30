/*

3.Temperature Check – Very Cold, Cold, Warm, Hot, Very Hot.

*/

public class Temperature{
   public static void main(String[] agrs){

int temp = 5;

if (temp <= 0){
   System.out.println("Very cold");
}
else if (temp >= 1 && temp <= 15){
  System.out.println("Cold");
}
else if ( temp >= 16 && temp <= 25){
  System.out.println("Warm");
}
else if (temp >= 26 && temp <= 40){
  System.out.println("Hot");
}
else {
  System.out.println("Very hot");
}

} 
}
