import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int eachNumber : list) {
            sum += eachNumber;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double sumAll = 0;
        return sum(list)/(double)list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double average = average(list);
        double wholeSum = 0.0;
        for ( double eachNumber : list) {
            double difference = eachNumber - average;
            difference *= difference;
            wholeSum += difference;
        }
        return wholeSum/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
