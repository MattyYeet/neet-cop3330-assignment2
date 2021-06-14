package example36;

import java.util.ArrayList;

public class Calculator {
    int i;

    public double Average(ArrayList<Double> LIST){
        double avg=0;
        for(i=0;i <= LIST.size();i++){
            avg = LIST.indexOf(i) + avg;
        }
        avg = avg/LIST.size();
        System.out.println("The average is "+avg);
        return 0;
    }
    public double Max(ArrayList<Double> LIST){
        double max=0;
        for(i=0;i <= LIST.size();i++){
            if(max <= LIST.indexOf(i)){
                max = LIST.indexOf(i);
            }
        }
        System.out.println("The maximum is "+max);
        return 0;
    }
    public double Min(ArrayList<Double> LIST){
        double min=1000000;
        for(i=0;i <= LIST.size();i++){
            if(min >= LIST.indexOf(i)){
                min = LIST.indexOf(i);
            }
        }
        System.out.println("The minimum is "+min);
        return 0;
    }
    public double STD(ArrayList<Double> LIST){
        double sum=0;
        double std=0;
        for(double num : LIST) {
            sum += num;
        }
        double mean = sum/ LIST.size();
        for(double num: LIST) {
            std += Math.pow(num - mean, 2);
        }
        std = Math.sqrt(std / LIST.size());
        System.out.println("The standard deviation is "+std);
        return 0;
    }
}
