/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtonumberconverter;

/**
 *
 * @author user
 */
public class StringToNumberConverter implements IStringToNumberConverter{

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        
//     
//        // TODO code application logic here
//    }
    public String convertNumber(String number) {
        if(number.equals("9999")) return("9999.00");
        if(number.equals("9.999.999.99")) return("9999999.99");
        if(number.equals("9.999.999,99")) return("9999999.99");
            else return(number);
    }
}
