/*

2.Age Category – Child, Teenager, Young, Adult, Senior.

*/

public class LadderAge{
    public static void main(String[] args){

int age = 180;	

if (age >= 0 && age <= 12){
  System.out.println("Child");
}
else if (age >= 0 && age <= 20){
  System.out.println("Teenager");
}
else if (age >= 0 && age <= 35){
  System.out.println("Young");
}
else if (age >= 0 && age <= 60){
  System.out.println("Adult");
}
else if (age >= 60){
  System.out.println("Senior");
}
else{
  System.out.println("Invalid");
}

}
}