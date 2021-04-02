/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.calculator;

/**
 *
 * @author 220229171
 */
public class Multiplication {
 
    public int CalculateSum,CalculateVolume;
    public double CalculateCircumference,TaxPay;
    
    int num1, num2;
    
    public double getTaxPay() {
        return TaxPay;
    }

    public void setTaxPay(int Salary) {
        this.TaxPay = 0.15 * Salary;
    }

    public int getCalculateSum() {
        return CalculateSum;
    }

    public void setCalculateSum(int num1, int num2) {
        this.CalculateSum = num1 * num2;
    }

    public int getCalculateVolume() {
        return CalculateVolume;
    }

    public void setCalculateVolume(int length, int width, int height) {
        this.CalculateVolume = length * width * height;
    }

    public double getCircumference() {
        return CalculateCircumference;
    }

    public void setCalulateRadius(int CalulateRadius) {
        this.CalculateCircumference = 2 * 3.142 * CalulateRadius;
    }
    
    @Override
    public String toString(){
           return "CalculateSum = " + CalculateSum +"/t Calculate Volume = " +
                   CalculateVolume + "/tCalculate Raduis = " +
                   CalculateCircumference + "/t Calculate Sum = " +CalculateSum;
    }
    
}
