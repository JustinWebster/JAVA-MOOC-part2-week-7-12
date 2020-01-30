package validation;

public class Calculator {

    public int multiplication(int fromInteger) {
        if(fromInteger < 0){
            throw new IllegalArgumentException("Parameter must be equal to or greater than 0");
        }
        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if(subsetSize >= setSize){
            throw new IllegalArgumentException("Invalid argument, subsetSize must be less than setSize");
        }
        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
