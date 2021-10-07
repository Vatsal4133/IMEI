/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eIMEI.IMEchecker.front;

/**
 *
 * @author vbhat
 */
public class sumDig {
    static int sumDig(int n)
    {
        int a = 0;
        while (n > 0)
        {
            a = a + n % 10;
            n = n / 10;
        }
        return a;
    }
}
