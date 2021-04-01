
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
*This class is used to calculate the modulus of two numbers
*/
package za.ac.cput.calculator;

/**
 *
 * @author Benelzane Kholani 218257465
 */
public class Modulo {

    private int number1;
    private int number2;

    public Modulo()
    {
    }//end of null agurmanet constructor

    public Modulo(int number1, int number2)
    {
        this.number1 = number1;
        this.number2 = number2;
    }//end of modulo constructor

    public void setNumber1(int number1)
    {
        this.number1 = number1;
    }//end of setNumber1 method

    public int getNumber1()
    {
        return this.number1;
    }//end of getNumber1 method

    public void setNumber2(int number2)
    {
        this.number1 = number2;
    }//end of setNumber2 method

    public int getNumber2()
    {
        return this.number2;
    }//end of getNumber2 method

    public int answer()
    {
    int modulo;

    modulo = this.number1 % this.number2;
    return modulo;
    }//end of answer method


    public String toString(){
    return String.format("The modulus of %d and %d is %d",this.number1,this.number2,answer());
}//end of toString method

}//end of Modulo class
