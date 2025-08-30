/*

5.Exam Result – Excellent, Very Good, Good, Pass, Fail.

*/

public class Result{
     public static void main (String[] agrs){

int grade = 32;

if (grade <=100 && grade >= 81){
  System.out.println("Outstanding");
}
else if(grade <= 80 && grade >= 70){
  System.out.println("Excellent");
}
else if (grade <= 70 && grade >= 65){
  System.out.println("Very Good");
}
else if (grade <= 65 && grade >= 45){
  System.out.println("Good");
}
else if (grade <= 45 && grade >=33){
  System.out.println("Pass");
}
else{
  System.out.println("Fail");
}
 
}
}