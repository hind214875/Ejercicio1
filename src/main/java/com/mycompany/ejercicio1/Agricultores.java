/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Agricultores {

    public static void main(String[] args) {
  //declare variables
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int Total;
        int entrada;
        int numAgricultores = 0;

        //declarar la lista
        ArrayList<Integer> sList = new ArrayList<Integer>();

        do {
            System.out.println("Introduce el reculto del agricultores");
            entrada = sc.nextInt();
            sList.add(numAgricultores, entrada);
            numAgricultores++;
            sum += entrada;

        } while (entrada != 0);

        for (int i = 0; i < numAgricultores - 1; i++) {
            System.out.println("la agricultor " + i + "tiene :" + sList.get(i));

        }
        
        Total = sum % numAgricultores-1;
        if (Total != 0) {
            System.out.println("No");
        } else {
            System.out.println("Si");
        }
    
 }
}

