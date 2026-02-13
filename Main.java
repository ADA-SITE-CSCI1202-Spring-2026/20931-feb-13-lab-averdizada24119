import week03.math.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        // Create complex numbers
        ComplexNumber c1 = new ComplexNumber(3.0, 4.0);
        ComplexNumber c2 = new ComplexNumber(2.5, -1.5);
        
        // Display them
        System.out.println("Complex Number 1: " + c1);
        System.out.println("Complex Number 2: " + c2);
        
        // Test getters
        System.out.println("Real part of c1: " + c1.getReal());
        System.out.println("Imaginary part of c1: " + c1.getImag());
    }
}