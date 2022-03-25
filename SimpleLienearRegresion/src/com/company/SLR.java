package com.company;

public class SLR extends Sumatorias {

    public int Valor;
    public int Beta0;
    public int Beta1;
    public int Resultado;


    public void setBeta0(int Beta0){
        this.Beta0=Beta0;
    }
    double getBeta0(){
        return  (DeterminanteB0 / DeterminanteSystem);
    }


    public void setBeta1(int Beta1){
        this.Beta1=Beta1;
    }
    double getBeta1(){
        return  (DeterminanteB1 / DeterminanteSystem);
    }


    public void setValor(int Valor){

        this.Valor=Valor;
    }
    double getValor(){
        return (Valor);
    }


    public void setResultado(int Resultado){

        this.Resultado=Resultado;
    }
    double getResultado(){

        return (getBeta0()+getBeta1()*Valor);
    }

}
