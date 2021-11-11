/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class RockPaperSithors {

    public static void main(String[] args) {
        /*People can play rock paper sithors with rock is 1,
     sothors is 2 and paper is 3 and then the players have to choose a number and the first one with 3 points wins... 
        1 win 2 ,2 win 3, 3 win 1*/

        //declaracion variables
        int jugador1 = 0, jugador2 = 0, opcion = 0,
                contadorJ2 = 0, contadorJ1 = 0;
        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;

        do {//repitir hasta que opcion es 3
            //Menu
            System.out.println("-------- Menu opciones -----------");
            System.out.println("1.Jugar Manual");
            System.out.println("2.Jugar Automatic");
            System.out.println("3.Salir");
            System.out.println("----------------------------------");

            do {
                try {//controla si el usuario Introduce letra o algo mal
                    System.out.println("Elija una opción: ");
                    opcion = sc.nextInt();
                    solicitarDatos = false;
                } catch (InputMismatchException ime) {
                    System.out.println("Se ha introducido texto en lugar de números. Vuelva a introducir los datos");
                    sc.nextLine();
                }
            } while (solicitarDatos);

            switch (opcion) {
                case 1://1 win 2 ,2 win 3, 3 win 1
                     contadorJ1=0;contadorJ2=0;
                    do {
                        
                        do {
                            System.out.println("Jugador1:Elige 1,2,3");
                            jugador1 = sc.nextInt();
                        } while (jugador1 != 1 && jugador1 != 2 && jugador1 != 3);

                        do {
                            System.out.println("Jugador2:Elige 1,2,3");
                            jugador2 = sc.nextInt();
                        } while (jugador2 != 1 && jugador2 != 2 && jugador2 != 3);
                  
                        if (jugador1 == 1) {
                            if (jugador2 == 3) {
                                System.out.println("Jugador2 gana");
                                contadorJ2++;
                            } else if(jugador2==2){
                                System.out.println("Jugador1 gana");
                                contadorJ1++;
                            }else if(jugador2==1){
                                System.out.println("ninguno gana");
                            }
                        } else if (jugador1 == 2) {
                            if (jugador2 == 3) {
                                System.out.println("Jugador1 gana");
                                contadorJ1++;
                            } else if (jugador2 == 1) {
                                System.out.println("Jugador2 gana");
                                contadorJ2++;
                            } else if(jugador2==2){
                                System.out.println("ninguno gana");
                            }

                        } else if (jugador1 == 3) {
                            if (jugador2 == 1) {
                                System.out.println("jugador1 gana");
                                contadorJ1++;
                            } else if (jugador2 == 2) {
                                System.out.println("jugador2 gana");
                                contadorJ2++;
                            } else if(jugador2==3){
                                System.out.println("ninguno gana");
                            }
                        }
                        System.out.println("scor Jugador1: " + contadorJ1 + " Jugador2: " + contadorJ2);

                    } while (!(contadorJ1 == 3 || contadorJ2 == 3));
                      if (contadorJ1 > contadorJ2) {
                            System.out.println("Jugador1 gana");
                        } else {
                            System.out.println("Jugador2 gana");
                        }                 
                    break;

                case 2:
                    break;

                case 3:
                    System.out.println("Finalizar");
                    break;

                default:
                    System.out.println("Elige opcion valida");
            }
        } while (opcion != 3);

    }
}
