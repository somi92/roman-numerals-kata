/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.romankata;

/**
 *
 * @author milos
 * 
 * I - 1
 * IV -4
 * V - 5
 * IX - 9
 * X - 10
 * XL -40
 * L - 50
 * XC - 90
 * C - 100
 * CD - 400
 * D - 500
 * CM - 900
 * M - 1000
 * 
 */
public class RomanNumeralsConverter {

    private final int[] numbers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 
                                   500, 900, 1000};
    private final String[] numerals = {"I", "IV", "V", "IX", "X", "XL", "L",
                                 "XC", "C", "CD", "D", "CM", "M"};
    
    public String convertArabicToRoman(int arabic) {
        String numeral = "";
        for(int i=(numerals.length-1); i>=0; i--) {
            while(arabic >= numbers[i]) {
                numeral += numerals[i];
                arabic -= numbers[i];
            }
        }
        return numeral;
    }

    public int convertRomanToArabic(String roman) {
        int arabic = 0;
        for(int i=(numerals.length-1); i>=0; i--) {
            while(roman.startsWith(numerals[i])) {
                arabic += numbers[i];
                roman = roman.substring(numerals[i].length());
            }
        }
        return arabic;
    }

    
}
