/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.romankata;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author milos
 */
public class RomanNumeralsKataTest {
    
    private RomanNumeralsConverter rnc;
    
    @Before
    public void setUp() {
        rnc = new RomanNumeralsConverter();
    }
    
    @Test
    public void convertOneToRoman() {
        assertEquals("I", rnc.convertArabicToRoman(1));
    }
    
    @Test
    public void convertThreeToRoman() {
        assertEquals("III", rnc.convertArabicToRoman(3));
    }
    
    @Test
    public void convertSixToRoman() {
        assertEquals("VI", rnc.convertArabicToRoman(6));
    }
    
    @Test
    public void convertNineToRoman() {
        assertEquals("IX", rnc.convertArabicToRoman(9));
    }
    
    @Test
    public void convertLargeToRoman() {
        assertEquals("MLXVI", rnc.convertArabicToRoman(1066));
        assertEquals("MCMLXXXIX", rnc.convertArabicToRoman(1989));
        assertEquals("MMMDCCCLXVII", rnc.convertArabicToRoman(3867));
    }
    
    @Test
    public void convertOneToArabic() {
        assertEquals(1, rnc.convertRomanToArabic("I"));
    }
    
    @Test
    public void convertThreeToArabic() {
        assertEquals(3, rnc.convertRomanToArabic("III"));
    }
    
    @Test
    public void convertNineToArabic() {
        assertEquals(9, rnc.convertRomanToArabic("IX"));
    }
    
    @Test
    public void convertLargeToArabic() {
        assertEquals(1066, rnc.convertRomanToArabic("MLXVI"));
        assertEquals(1989, rnc.convertRomanToArabic("MCMLXXXIX"));
        assertEquals(3867, rnc.convertRomanToArabic("MMMDCCCLXVII"));
    }
}
