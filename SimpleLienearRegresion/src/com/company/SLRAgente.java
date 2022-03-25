package com.company;
import jade.core.Agent;
import jade.core.behaviours.*;

import java.util.Scanner;


public class SLRAgente extends Agent {

    //Nombramos al agente y lo mandamos a la funcion
    protected void setup() {
        System.out.println("Agent "+getLocalName()+" started.");
        addBehaviour(new SLRBehaviour());
    }



    private class SLRBehaviour extends Behaviour {

        boolean end=false;

        //Donde va a realizar las operaciones el agente
        public void action() {
            DataSet datos = new DataSet();
            Sumatorias sum = new Sumatorias();
            SLR operacion = new SLR();
            Scanner in = new Scanner(System.in);


            operacion.setValor(10);

            datos.DataS();   //Esto lo usamos para llamar a la funcion y imprimir el DataSet

            System.out.println("\n");
            System.out.println("Valor inicial:  "+operacion.getValor());
            System.out.println("Beta0 = "+operacion.getBeta0());
            System.out.println("Beta1 = "+operacion.getBeta1()+"\n");


            System.out.printf("Resultado = Beta0 + Beta1 * Valor ");
            System.out.printf("\nResultado = %.2f", operacion.getResultado()+"\n");
            end=true;
        }

        //Para comprobar si ya se hizo el procedimiento
        public boolean done() {
            if(end){
                return true;
            }else
                return false;
        }

        //Cerrar el agente una vez ya hecho su procedimiento
        public int onEnd() {
            myAgent.doDelete();
            System.out.println("AgentSLR: "+getLocalName()+" muerto!");
            return super.onEnd();
        }

    }
}
