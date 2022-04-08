/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author LVECKER
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     Quadrado q=new Quadrado();
     q.setLadoA(1);
     q.setLadoB(2);
     q.setLadoC(2);
     q.setLadoD(2);
     
      System.out.printf(" area do quadrado " + q.getArea()+"\n"+ 
                       " O perimetro do quadrado "+ q.getPerimetro()+ "\n" +"\n");
    
       
      Circulo c =new Circulo();
      c.setRaio(2);
      System.out.printf(" area do Circulo " + c.getArea()+ "\n"+
                       " O perimetro do Circulo "+ c.getPerimetro() +"\n"+
                        "o diametro do Circulo" + c.diametro()+"\n" +"\n");
      
      
      Retangulo r=new Retangulo();
      r.setBase(10);
      r.setBaseSuperior(10);
      r.setLadoDir(5);
      r.setLadoEsq(1);
       System.out.printf(" area do retangulo " +  r.getArea() + "\n" +
                        " o perimetro do retangulo "  +  r.getPerimetro() +"\n" +"\n");
      
       
       Triangulo t=new Triangulo();
       t.setLadoB(5);
       t.setBase(10);
       t.setLadoA(5);
       t.setAltura(5);
       
        System.out.printf(" area do triangulo " +  t.getArea() + "\n" +
                        " o perimetro do triangulo "  +  t.getPerimetro() +"\n" +
                        "o tipo de triangulo é " + t.TipoTriangulo()+ "\n");
      
       
           
  Losango l=new Losango();
       l.setLado1(5);
       l.setLado2(10);
       l.setLado3(5);
       l.setLado4(5);
       l.setDiagonal1(5);
       l.setDiagonal2(5);
       
        System.out.printf(" area do losango " +  l.getArea() + "\n" +
                        " o perimetro do losango "  +  l.getPerimetro() +"\n");
    
    }
    
}
