
package jptv21polzovatelj;

import java.util.Scanner;


public class JPTV21Polzovatelj {


    public static void main(String[] args) {
    System.out.println("Vvedite imja: ");
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();
    System.out.println("Vvedite familiju: ");
    String surname = input.nextLine();
    System.out.println("Vvedite Id code: ");
    String code = input.nextLine();
    String dateYear = (code.substring(1,3));
    String dateMonth = (code.substring(3,5));
    String dateDay = (code.substring(5,7));
    System.out.println(name+" "+surname+" rodilsja "+dateYear +"goda "+dateMonth + " mesjatsa "+dateDay+" 4isla");
    

                    
    }
    
}
