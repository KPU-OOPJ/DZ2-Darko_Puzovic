package zadatak2;

import java.util.Scanner;


public class DarkoPuzovic {
    private String string;
    private String reverse;

    public DarkoPuzovic(String string, String reverse) {
        this.string = string;
        this.reverse = reverse;
    }

    
    public String getString() {
        return string;
    }

    public String getReverse() {
        return reverse;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setReverse(String reverse) {
        this.reverse = reverse;
    }
 
    public void ispis(){
    
    String string, reverse = "";   
    Scanner unos = new Scanner(System.in);
    System.out.println("Unesi recenicu: ");
    string = unos.nextLine();

    int length = string.length();

    for (int i = length - 1; i >= 0; i--)
      reverse = reverse + string.charAt(i);

    if (string.equals(reverse)) {
        System.out.println("Recenica je palindrom.");
    } else {
        System.out.println("Recenica nije palindrom.");
    }
  }
}
