/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.cf.mnozeniecf;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
/**
 *
 * @author bikol
 */
public class SuperMnozenie {
    
   
    
    
    /**
     * Wylicza iloczyn dwóch liczb (dowolnych).
     * 
     * @param a
     * @param b
     * @return 
     */
    public static String mul(String a, String b){
        
        String aa = a;
        String bb = b;
        
        
        
        if (aa == "0" || bb == "0")
        {
            int value = 0;
            return Integer.toString(value);
        }
        else if (aa == "0.0" || bb == "0.0")
        {
           int value = 0;
           return Integer.toString(value);
        }
        else if (aa.contains(".") || bb.contains("."))
        {
            float aFloat = Float.parseFloat(a);
            float bFloat = Float.parseFloat(b);
            
            if (aFloat%1 == 0 && bFloat%1 == 0)
            {
                int value1 = Math.round(aFloat)*Math.round(bFloat);
                return Integer.toString(value1);
            }
            else      
            {
            Double aL = Double.valueOf(a);
            Double bL = Double.valueOf(b);
            DecimalFormat valueD = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            valueD.setMaximumFractionDigits(340);
            return valueD.format(aL * bL);
            }
        }
        else 
        {
        long aLong = Long.parseLong(a);
        long bLong = Long.parseLong(b);  
        
        long value = aLong*bLong;
        return Long.toString(value);
        }
        
        
        
        
    }
    
}