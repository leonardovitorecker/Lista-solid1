/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author LVECKER
 */
public class Triangulo implements Figura{

    // ATRIBUTOS
    public  int base;
public int ladoB;
    public int ladoA;
public int altura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }
  
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    
    
    //GETTER E SETTERS
 
    
   
  
    //METODOS
   

    @Override
    public int getArea() 
    {

     int area=0;
     area=(base * altura)/2;
     return area;
    }

    @Override
    public int getPerimetro() 
    {
        
      int perimetro=0;
      perimetro=altura+base+ladoA;
        return perimetro;
        
    }
   
    public String TipoTriangulo()
    {
     
     if(ladoB!=base && ladoB!=ladoA && ladoA!=base)
     {
         return "Escaleno";
     }
     else if(ladoB==base && ladoB!=ladoA && ladoA!=base ||
             base==ladoA && base!=ladoB && ladoB!=ladoA ||
             ladoA==ladoB && ladoA!=base && base!=ladoB)
     {
         return "Isoceles";
     }
     else if(ladoA==ladoB && ladoB==base && ladoA==base)
     {
         return "Equilatero";
     }else {
        return "Não é nenhum desses";
     }
    }

   
}
