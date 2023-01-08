public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 111;
        final int UPPERBOUND = 8899;

        int count = 0;

        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
            sum += i;
            count++;
        }
//        int number = LOWERBOUND;

//        while (number <= UPPERBOUND){
//            sum += number;
//            number++;
//        }

//        do {
//            sum += number;
//            number++;
//        } while (number <= UPPERBOUND);

//        average = (double) sum/(UPPERBOUND - LOWERBOUND + 1);
        average = (double) sum/count;

        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);

        long sumSquares = 0;
        for (int i = LOWERBOUND; i <= UPPERBOUND; i++){
            sumSquares += i * i;
        }

        System.out.println("Sum of the squares: " + sumSquares);

        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;

        for (int i = LOWERBOUND; i <= UPPERBOUND; i++){
            if (i % 2 == 0){
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
        }

        absDiff = Math.abs(sumEven - sumOdd);

        System.out.println(sumOdd);
        System.out.println(sumEven);
        System.out.println(absDiff);
    }
}
