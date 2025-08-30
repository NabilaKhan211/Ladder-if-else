/*

10. Blood Pressure Check – Low, Normal, High.

*/

public class Blood{
    public static void main (String[] args){


int bp = 150;

if (bp > 120){
  System.out.println("High");
}
else if (bp == 90 ){
  System.out.println("Normal");
}
else if (bp <= 50){
  System.out.println("Low");
}

}
}