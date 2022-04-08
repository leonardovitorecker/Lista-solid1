/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author LVECKER
 */
public class Losango implements Figura {
    
    public double  Lado1;
    public double Lado2;
    public double Lado3;
    public double Lado4;

    public double getLado1() {
        return Lado1;
    }

    public void setLado1(double Lado1) {
        this.Lado1 = Lado1;
    }

    public double getLado2() {
        return Lado2;
    }

    public void setLado2(double Lado2) {
        this.Lado2 = Lado2;
    }

    public double getLado3() {
        return Lado3;
    }

    public void setLado3(double Lado3) {
        this.Lado3 = Lado3;
    }

    public double getLado4() {
        return Lado4;
    }

    public void setLado4(double Lado4) {
        this.Lado4 = Lado4;
    }
public int Diagonal1;
public int Diagonal2;

    public double getDiagonal1() {
        
        
        return Diagonal1;
    }

    public void setDiagonal1(int Diagonal1) {
        this.Diagonal1 = Diagonal1;
    }

    public double getDiagonal2() {
        return Diagonal2;
    }

    public void setDiagonal2(int Diagonal2) {
        this.Diagonal2 = Diagonal2;
    }


    @Override
    public int getArea() {
       int area=0;
       area=(int) ((Diagonal1 *Diagonal2)/2);
       
       return area;
    }

    @Override
    public int getPerimetro() {
     int perimetro=0;
     perimetro=(int) (Lado1+Lado2+Lado3+Lado4);
     
     return perimetro;
    }

    
    
}
