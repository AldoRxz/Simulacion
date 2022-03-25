package com.company;

public class Sumatorias extends DataSet{

    double  SumX=0, SumY=0, SumXY=0, SumXCuad=0,
            nSumXCuad=0, SumX_Cuad=0, nSumXY=0;


    double SumatoriaX(int[] x){
        SumX=0;

        for( i=0; i<n; i++){
            SumX+=x[i];
        }
        return SumX;
    }

    double SumatoriaY(int[] y){
        SumY=0;

        for( i=0; i<n; i++){
            SumY+=y[i];
        }
        return SumY;
    }

    double SumatoriaXY(int[] x, int[] y){
        SumXY=0;

        for( i=0; i<n; i++){
            SumXY+=x[i]*y[i];
        }
        return SumXY;
    }

    double SumatoriaXCuad(int[] x){
        SumXCuad=0;

        for( i=0; i<n; i++){
            SumXCuad+=x[i]*x[i];
        }
        return SumXCuad;
    }

    double DeterminanteSystem = (n * SumatoriaXCuad(x)) - (SumatoriaX(x) * SumatoriaX(x));
    double DeterminanteB0 = (SumatoriaY(y) * SumatoriaXCuad(x)) - (SumatoriaX(x) * SumatoriaXY(x, y));
    double DeterminanteB1 = (n * SumatoriaXY(x, y)) - (SumatoriaX(x) * SumatoriaY(y));
}
