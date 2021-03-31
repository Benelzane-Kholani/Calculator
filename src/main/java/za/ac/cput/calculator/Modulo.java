<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.calculator;

/**
 *
 * @author Benelzane Kholani 218257465
 */
public class Modulo {
    
    private int number1;
    private int number2;
    
    public Modulo(int number1, int number2)
    {
        this.number1 = number1;
        this.number2 = number2;
    }
    
    public void setNumber1(int number1)
    {
        this.number1 = number1;
    }
    
    public int getNumber1()
    {
        return this.number1;
    }
    
    public void setNumber2(int number2)
    {
        this.number1 = number2;
    }
    
    public int getNumber2()
    {
        return this.number2;
    }
    
    public int Answer()
    { 
    return this.number1 % this.number2;  
    }
    
    public String toString()
    {
        return String.format("The modulo is %d",this.Answer());
    }
    
}
=======

>>>>>>> 51f2bc2fbea2e4783bf37186707b636e9a51ae24
