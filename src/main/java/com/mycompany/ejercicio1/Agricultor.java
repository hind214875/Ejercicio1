package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author hinda
 */
public class Agricultor {

    public static void main(String[] args) {
        //declaracion constantes 
        final String pass = "root";
        final ImageIcon ICON = new ImageIcon("iconPassword.png");
        final ImageIcon iconError = new ImageIcon("ErrorPassword1.png");
        final ImageIcon iconWarning = new ImageIcon("iconWarning.png");
        //declaracion y Inicialisacion variables
        int sum = 0, numAgricultores = 0, total, entrada;
        String text;
        Object opcion;
        Object[] tipoEligido = {"Recultos Manual", "Random Recultos", "Salir"}; //guardamos los opciones que hay in object
        Random random = new Random();//creat random object para utilisarlo generate a random recultos de frutas 
        int randomEntrada;//variable donde guardar el random number de recultos

        //declarar la lista
        ArrayList<Integer> sList = new ArrayList<Integer>();

        do {
            /*--------------------------------------- Menu -----------------------------------------------*/
            opcion = JOptionPane.showInputDialog(null, "Selecciona tu opcion", "Elegir", JOptionPane.QUESTION_MESSAGE, null, tipoEligido, tipoEligido[0]);
        
            switch(opcion.toString()){
                /*----------------------------------Recultos Manual----------------------------------------------*/
                case "Recultos Manual":
                     do {
                    //pedir el nombre y la contraseña del user
                    String nombre = JOptionPane.showInputDialog(null, "escribe tu nombre");
                    text = JOptionPane.showInputDialog(null, "escribe el password para puede entrar");

                    //comprovar si la contraseña correcta/no correcta/o no ha escrito nada
                    if (text.equalsIgnoreCase(pass)) {
                        JOptionPane.showMessageDialog(null, "estás conectado " + nombre, "Agricultor", JOptionPane.INFORMATION_MESSAGE, ICON);

                        do {
                            entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el reculto del agricultores"));
                            sList.add(numAgricultores, entrada);
                            numAgricultores++;
                            sum += entrada;

                        } while (entrada != 0);

                        String details = " \n los recoltos son: \n"; // variable para mostrar el contenido de la lista luego
                        for (int i = 0; i < numAgricultores - 1; i++) {
                            details += "\n el agricultor numero " + (i + 1) + " tiene :\n " + sList.get(i);
                        }
                        JOptionPane.showMessageDialog(null, details, "Printing results", JOptionPane.DEFAULT_OPTION);//muestrar el contenido de la lista

                        total = sum % numAgricultores - 1;
                        if (total != 0) {

                            JOptionPane.showMessageDialog(null, "<html><div color=orange>No</div></html>", "Warning", JOptionPane.WARNING_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Si");
                        }
                    } else if (text.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "<html><div color=orange>No has escrito nada!</div></html>", "Warning", JOptionPane.WARNING_MESSAGE, iconWarning);

                    } else if (!text.equalsIgnoreCase(pass)) {
                        JOptionPane.showMessageDialog(null, "<html><div color=#D80C24>error contraseña</div></html>", "Error", JOptionPane.ERROR_MESSAGE, iconError);
                    }

                } while (!text.equalsIgnoreCase(pass) || text.isEmpty());
                     break;
                       /*--------------------------------si el opcion es Automatica-------------------------------------*/
                case "Random Recultos":
                    //hace esto si la condicion=true
                JOptionPane.showMessageDialog(null, "El modo Random Reculta", "Automatico", JOptionPane.INFORMATION_MESSAGE);
                do {

                    //guardar random variable entre el rango 0 y 5 en el variable randomEntrada
                    randomEntrada = (int) (random.nextDouble() * 5 + 0);
                    JOptionPane.showMessageDialog(null, "Valor de numero aleatorio: " + randomEntrada);
                    sList.add(numAgricultores, randomEntrada);//guardar el numero de agricultores y el random entrada de frutas en la lista
                    numAgricultores++;
                    sum += randomEntrada;

                } while (randomEntrada != 0);

                String details = " \n los recoltos son: \n"; // variable para mostrar el contenido de la lista luego
                for (int i = 0; i < numAgricultores - 1; i++) {
                    details += "\n el agricultor numero " + (i + 1) + " tiene :\n " + sList.get(i);
                }
                JOptionPane.showMessageDialog(null, details, "Printing results", JOptionPane.DEFAULT_OPTION);//muestrar el contenido de la lista

                //operaciones
                total = sum % numAgricultores - 1;//
                if (total != 0) {

                    JOptionPane.showMessageDialog(null, "<html><div color=orange>No</div></html>", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Si");
                }
                break;
                    
            }
            
 
        } while (!opcion.toString().equalsIgnoreCase("salir"));

    }
}
