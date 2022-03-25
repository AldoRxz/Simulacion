//Rodriguez Ruiz Aldo Roman
// 22/03/2022
//Simulacion

package com.company;

public class Main {

    public static void main(String[] args) {


        DataSet datos= new DataSet();
        Sumatorias sum = new Sumatorias();
        SLR operacion = new SLR();

        operacion.setValor(10);

        datos.DataS();   //Esto lo usamos para llamar a la funcion y imprimir el DataSet

        System.out.println("\n");
        System.out.println("Valor inicial:  "+operacion.getValor());
        System.out.println("Beta0 = "+operacion.getBeta0());
        System.out.println("Beta1 = "+operacion.getBeta1()+"\n");


        System.out.printf("Resultado = Beta0 + Beta1 * Valor ");
        System.out.printf("\nResultado = %.2f", operacion.getResultado());

    }
}
