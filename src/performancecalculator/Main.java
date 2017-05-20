/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package performancecalculator;

/**
 *
 * @author wasif
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float true_Negative,
                false_Positive,
                false_Negative,
                true_Positive,
                accuracy,
                precision,
                recall,
                f_Measure;

        /*
         * Set values here..
         *
         * 1. Top left
         * 2. Top right
         * 3. Left bottom
         * 4. Right bottom
         */
        true_Negative = 1811;
        false_Positive = 188;
        false_Negative = 0;
        true_Positive = 0;
               

        /*
         * calculate accuracy
         */
        accuracy = (true_Negative + true_Positive) / (false_Negative + false_Positive + true_Negative + true_Positive);
        
        /*
         * precision
         */
        precision = true_Positive / (true_Positive + false_Positive);

        /*
         * recall
         */
        recall = true_Positive / (true_Positive + false_Negative);

        /*
         * f measure
         */
        f_Measure = (2 * precision * recall)/ (precision + recall);

        /*
         * Print
         */
        System.out.println("accuracy :: " + accuracy);
        System.out.println("precision :: " + precision);
        System.out.println("recall :: " + recall);
        System.out.println("f_Measure :: " + f_Measure);

        System.out.println("\n" +accuracy + "\n" + precision + "\n" + recall + "\n" + f_Measure);

    }
}
