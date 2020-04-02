
package zadatak2;

import java.util.Scanner;

public class GlavnaKlasa {
    public static void main(String[] args) {
        
        
        String string = null, reverse = null ;
        Scanner unos = new Scanner(System.in);
       
        DarkoPuzovic dp1 = new DarkoPuzovic(string, reverse);
        dp1.ispis();
    }
}