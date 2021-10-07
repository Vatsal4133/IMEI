/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eIMEI.IMEchecker.front;
import static com.eIMEI.IMEchecker.front.sumDig.sumDig;
/**
 *
 * @author vbhat
 */
public class Checker {
    static boolean Checker(long n)
    {
        // Converting the number into String
        // for finding length
        String s = Long.toString(n);
        int len = s.length();
 
        if (len != 15)
            return false;
 
        int sum = 0;
        for (int i = len; i >= 1; i--)
        {
            int d = (int)(n % 10);
 
            // Doubling every alternate digit
            if (i % 2 == 0)
                d = 2 * d;
 
            // Finding sum of the digits
            sum += sumDig(d);
            n = n / 10;
        }
        return (sum % 10 == 0);
    }
}
