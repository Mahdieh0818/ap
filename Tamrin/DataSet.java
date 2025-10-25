package Tamrin;

public class DataSet {

    private double sum;
    private double smallest;
    private double largest;
    private int count;


    public DataSet() {
        sum = 0;
        smallest = Double.MAX_VALUE;
        largest = -Double.MAX_VALUE;
        count = 0;
    }

    public void add(double value) {
        sum += value;
        if (value < smallest) smallest = value;
        if (value > largest) largest = value;
        count++;
    }

    public double getAverage() {
        if (count == 0) return 0;
        return sum / count;
    }

    public double getSmallest() {
        if (count == 0) return 0;
        return smallest;
    }

    public double getLargest() {
        if (count == 0) return 0;
        return largest;
    }

    public double getRange() {
        if (count == 0) return 0;
        return largest - smallest;
    }
}

