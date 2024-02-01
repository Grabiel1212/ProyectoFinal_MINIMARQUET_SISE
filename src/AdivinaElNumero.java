
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author grabiel
 */


public class AdivinaElNumero {
    public static void main(String[] args) {
        double numero = 123.456789;
DecimalFormat formato = new DecimalFormat("#.##");
System.out.println(formato.format(numero));

    }
}

