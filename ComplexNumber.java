package week03.math;

public class ComplexNumber {
    private double real;
    private double imag;
    
    // Constructor to initialize real and imaginary parts
    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    // Getter for real part
    public double getReal() {
        return real;
    }
    
    // Getter for imaginary part
    public double getImag() {
        return imag;
    }
    
    // Setter for real part
    public void setReal(double real) {
        this.real = real;
    }
    
    // Setter for imaginary part
    public void setImag(double imag) {
        this.imag = imag;
    }
    
    // toString method for displaying the complex number
    @Override
    public String toString() {
        if (imag >= 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + Math.abs(imag) + "i";
        }
    }
}