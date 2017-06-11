/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.cf.mnozeniecf;

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
        else if (aa.contains("0.") || bb.contains("0."))
        {
            double aL = Double.parseDouble(a);
            double bL = Double.parseDouble(b);
            double value = aL * bL;
            
            return Double.toString(value);
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
            double aL = Double.parseDouble(a);
            double bL = Double.parseDouble(b);
            double valueD = aL * bL;
            return Double.toString(valueD);
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