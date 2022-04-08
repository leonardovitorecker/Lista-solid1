/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author LVECKER
 */
public class Circulo implements Figura {
public int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public int getArea() 
    {
        
       double area=0;
        double PI=3.14;
       area=(PI*(raio *raio));
    return (int) area;
    }

    @Override
    public int getPerimetro() 
    {
  double perimetro=0;
   double PI=3.14;
   perimetro = 2 * PI *raio;
  return  (int)  perimetro;
    }
public int diametro()
{
int diametro=0;
diametro=2*raio;
return diametro;

}    
}

