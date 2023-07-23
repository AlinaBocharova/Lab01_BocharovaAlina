package src.shoppingList;

public class Statistic {
    public static long countSum(Integer[] masOfCosts, Integer[] masOfCounts) {
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += (long) masOfCosts[i] * masOfCounts[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static int countTopProduct(Integer[] masOfCounts) {
        int indexOfMostPopularProduct = 0;
        for (int j = 0; j < 3; j++) {
//            indexOfMostPopularProduct = 0;
            for (int i = 0; i < 5; i++) {
                if (masOfCounts[i] > masOfCounts[indexOfMostPopularProduct]) {
                    indexOfMostPopularProduct = i;
                }
            }
        }
        return indexOfMostPopularProduct;
    }
}