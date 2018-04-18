/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssclubfair2017problema;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class TSSClubFair2017ProblemA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            String w1=sc.next();
            String w2=sc.next();
            String w3=sc.next();
            if (w1.equals(w2) || w1.equals(w3)) {
                System.out.println(w1);
            } else if (w2.equals(w3)) {
                System.out.println(w2);
            } else {
                System.out.println("???");
            }
        }
    }
}
