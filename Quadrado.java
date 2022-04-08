/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author LVECKER
 */
public class Quadrado implements Figura {

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }
    
     public int ladoA;
    public int ladoB;
     public int ladoC;
    public int ladoD;
    

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public int getLadoD() {
        return ladoD;
    }

    public void setLadoD(int ladoD) {
        this.ladoD = ladoD;
    }
   
    //GETTER E SETTERS
     
     public int getlado()
    {
        return ladoA;
    }
  
    
    //METODOS
    @Override
   public int getArea()
   {
        int area=0;
   if((ladoA+ladoB+ladoC+ladoD)%4==0)
   {   
    
     area=ladoA + ladoB+ladoC +ladoD;
     
     return area;
   }else {
    return -1;
   }
   }

    /**
     *
     * @return
     */
    @Override
    public int getPerimetro() 
    {
        int perimetro=0;
        
        if((ladoA+ladoB+ladoC+ladoD)%4==0)
        {
        perimetro=ladoA *4;
        return perimetro;
        }else 
        {
            return -1;
        }
        
    }
     
}
