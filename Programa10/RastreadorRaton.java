package Unidad11.Programa10;

import javax.swing.JFrame;

 public class RastreadorRaton
 {
 public static void main( String args[] )
 {
 MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton();
 marcoRastreadorRaton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 marcoRastreadorRaton.setSize( 300, 100 ); // establece el tamaño del marco
 marcoRastreadorRaton.setVisible( true ); // muestra el marco
 } // fin de main
 } // fin de la clase