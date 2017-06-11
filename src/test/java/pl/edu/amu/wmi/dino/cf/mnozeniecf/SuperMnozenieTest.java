/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.cf.mnozeniecf;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bikol
 */
public class SuperMnozenieTest {

    
    public SuperMnozenieTest() {
    }

    @Test
    public void testMul() {
        assertEquals("1", SuperMnozenie.mul("1", "1"));
    }

    /**
     * Patryk Żywica
     */
    @Test
    public void testMul1() {
        assertEquals("0", SuperMnozenie.mul("1", "0"));
    }

    @Test
    public void testMul2() {
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            int r = rand.nextInt();
            assertEquals("0", SuperMnozenie.mul("0", Integer.toString(r)));
            assertEquals("0", SuperMnozenie.mul(Integer.toString(r), "0"));
        }
    }

    @Test
    public void testMul3() {
        assertEquals("-1", SuperMnozenie.mul("1", "-1"));
    }
    
     /**
     * Maciej Wanat
     */
    
    @Test
    public void testMul4() {       
        assertEquals("1000000000000", SuperMnozenie.mul("1000000", "1000000"));      
    }
    
    @Test
    public void testMul5() {       
        assertEquals("1.5", SuperMnozenie.mul("1.5", "1"));      
    }
    
    @Test 
    public void testMul6() {       
        assertEquals("-1.5", SuperMnozenie.mul("-1.5", "1"));      
    }
    
    
    /**
     * Adrian Witczak
     */
    
    @Test
    public void testMul7() {       
        assertEquals("0.222332666778", SuperMnozenie.mul("0.333666", "0.666333"));      
    }
    
    @Test
    public void testMul8() {       
        assertEquals("0", SuperMnozenie.mul("0.0", "100000000000"));      
    }
    
    @Test 
    public void testMul9() {       
        assertEquals("0", SuperMnozenie.mul("-1.5", "0"));      
    }
    
     /**
     * Dymitr Sołtysiak
     */
    
    @Test
    public void testMul10()
    {
        assertEquals("1", SuperMnozenie.mul("" + Math.pow(2,0), "1"));
    }
    
    @Test
    public void testMul11()
    {
        
        assertEquals("2.718281828459045", SuperMnozenie.mul(""+ Math.E,"1"));
    }
    
    @Test
    public void testMul12()
    {
        assertEquals("-0.625", SuperMnozenie.mul("-0.625000","1"));
    }
    
    /*
    Mikołaj Stasiak
    */
     @Test
    public void testMS1()
    {
        assertEquals("0.00025", SuperMnozenie.mul("0.00025","1"));
    }
    @Test
    public void testMS2()
    {
        assertEquals("0.00015707963267948965", SuperMnozenie.mul(""+Math.PI,"0.00005"));
    }
    @Test
    public void testMS3()
    {
        assertEquals("0.02718281828459045", SuperMnozenie.mul("0.01",""+Math.E));
    }
}