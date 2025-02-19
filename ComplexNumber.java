public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor to initialize the complex number
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter for the real part
    public double getReal() {
        return real;
    }

    // Getter for the imaginary part
    public double getImaginary() {
        return imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.getReal();
        double newImaginary = this.imaginary + other.getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    // Method to represent the complex number as a string
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }

    public static void main(String[] args) {
        // Create two complex numbers
        ComplexNumber num1 = new ComplexNumber(4, 5);
        ComplexNumber num2 = new ComplexNumber(3, -2);

        // Add the two complex numbers
        ComplexNumber result = num1.add(num2);

        // Print the result
        System.out.println("Sum of the complex numbers: " + result);
    }
}
