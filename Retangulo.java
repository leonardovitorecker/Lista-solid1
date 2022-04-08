/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import static javax.management.Query.and;

/**
 *
 * @author LVECKER
 */
public class Retangulo implements Figura {
public int base;
public int baseSuperior;
public int ladoEsq;
public int ladoDir;
    public int getBase() {
        return base;
    }

    public void setBase(int Base) {
        this.base = Base;
    }

    public int getBaseSuperior() {
        return baseSuperior;
    }

    public void setBaseSuperior(int BaseSuperior) {
        this.baseSuperior = BaseSuperior;
    }

    public int getLadoEsq() {
        return ladoEsq;
    }

    public void setLadoEsq(int ladoEsq) {
        this.ladoEsq = ladoEsq;
    }

    public int getLadoDir() {
        return ladoDir;
    }

    public void setLadoDir(int ladoDir) {
        this.ladoDir = ladoDir;
    }

    @Override
    public int getArea() {
       int area=0;
       
       if(ladoEsq==ladoDir && base==baseSuperior
               && ladoEsq!=base && ladoDir!=base
               && ladoEsq!=baseSuperior &&  ladoDir!=baseSuperior)
       {
       area=base *ladoEsq;
       return area;
       }
       else
       {
           return -1;
       }
    }

    @Override
    public int getPerimetro()
    {
       int perimetro=0;
        
        if(ladoEsq==ladoDir && base==baseSuperior
               && ladoEsq!=base && ladoDir!=base
               && ladoEsq!=baseSuperior &&  ladoDir!=baseSuperior)
       {
       perimetro= 2*(base + ladoDir);
       return perimetro;
       }
       else
       {
           return -1;
       }
    }
    
    
}
