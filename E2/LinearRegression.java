

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class LinearRegression {
    private static final List<Integer> x = asList(23,26,30,34,43,48,52,57,58); // Consecutive hours developer codes
    private static final List<Integer> y = asList(651,762,856,1063,1190,1298,1421,1440,1518); // Number of bugs produced

    private static Double predictForValue(int predictForDependentVariable) {
        if (x.size() != y.size())
            throw new IllegalStateException("Must have equal X and Y data points");

        Integer numberOfDataValues = x.size();

        List<Double> xSquared = x.stream()
                .map(position -> Math.pow(position, 2))
                .collect(Collectors.toList());

        List<Integer> xMultipliedByY = IntStream.range(0, numberOfDataValues)
                .map(i -> x.get(i) * y.get(i))
                .boxed()
                .collect(Collectors.toList());

        Integer xSummed = x
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        Integer ySummed = y
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        Double sumOfXSquared = xSquared
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        Integer sumOfXMultipliedByY = xMultipliedByY
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();
	System.out.println("numberOfDataValues "+numberOfDataValues);
	System.out.println("sumOfXMultipliedByY "+sumOfXMultipliedByY);
	System.out.println("ySummed "+ySummed);
	System.out.println("xSummed "+xSummed);
	System.out.println("sumOfXSquared "+sumOfXSquared);
	System.out.println("Math.pow(xSummed, 2)  "+Math.pow(xSummed, 2));
	System.out.println("\n");
        int slopeNominator = numberOfDataValues * sumOfXMultipliedByY - ySummed * xSummed;
        Double slopeDenominator = numberOfDataValues * sumOfXSquared - Math.pow(xSummed, 2);
        Double slope = slopeNominator / slopeDenominator;
	 System.out.println("B1 N "+slopeNominator+" D "+slopeDenominator+" R "+slope);

        double interceptNominator = ySummed - slope * xSummed;
        double interceptDenominator = numberOfDataValues;

        Double intercept = interceptNominator / interceptDenominator;
        System.out.println("B0 N "+interceptNominator+" D "+interceptDenominator+" R "+intercept);
        return (slope * predictForDependentVariable) + intercept;
    }

    public static void main(String[] args) {
        System.out.println(predictForValue(52));
    }
}

