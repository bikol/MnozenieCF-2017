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
        assertEquals("0.027182818284590453", SuperMnozenie.mul("0.01",""+Math.E));
    }
    /*
    Krzysztof Strzelecki
    */
    // argumenty w postaci binarnej
    @Test
    public void testKS1() {       
        assertEquals("8", SuperMnozenie.mul("0b100", "2"));
    }
    
    @Test
    public void testKS2() {       
        assertEquals("8", SuperMnozenie.mul("0b10", "0b100"));
    }
    
    @Test 
    public void testKS3() {       
        assertEquals("-15", SuperMnozenie.mul("-5", "0b11"));      
    }
    
    /*
    Maciej Strelczuk
    */
    @Test
    public void testMul13()
    {
        assertEquals("282.7013101597407", SuperMnozenie.mul(""+Math.round(103.54334),Math.E+""));
    }
    @Test
    public void testMul14()
    {
        assertEquals("3.411011580162108", SuperMnozenie.mul(""+Math.sqrt(11.635), "1"));
    }
    @Test
    public void testMul15()
    {
        assertEquals("100.55550561215456", SuperMnozenie.mul(""+Math.sqrt(1024.50), Math.PI+""));
    }
    
    /**
     * Karol Kot
     */
    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenLongOverflow() {
        SuperMnozenie.mul(String.valueOf(Long.MAX_VALUE), "2");
    }

    @Test
    public void test20(){
    	assertEquals("148.6411", SuperMnozenie.mul(String.valueOf(Math.sqrt(8128)), String.valueOf(Math.sqrt(Math.E))));
    }
    
    @Test
    public void test21()
    {
    	assertEquals("2", SuperMnozenie.mul(String.valueOf(Math.abs(-8128)), String.valueOf(Math.cosh(255))));
    }
    
}
