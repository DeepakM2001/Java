/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtcr;

/**
 *
 * @author Deepak Murugesan
 */
public class Light {
    public static void main(String[]args){
        int lightspeed;
        long days;
        long seconds;
        long distance;
        
        lightspeed = 186000;
        days = 365;
        seconds = days * 24 * 60 *60;
        distance = lightspeed * seconds;
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.print(distance + " miles.");
}
}       

