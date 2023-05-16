package com.furiosaming.singleLayerNeuralNetwork.model;

import java.util.Random;

public class Perceptron {

    double[] weights;
    double threshold;
    public void train(double[][] inputVectors, int[] requiredOutputVectors, double threshold, double lrate, int trainingCyclesCount)
    {
        this.threshold = threshold;
        int inputLength = inputVectors[0].length;
        int outputsLength = requiredOutputVectors.length;
        weights = new double[inputLength];
        Random randomWeights = new Random();

        //initialize start weights with random
        for(int i=0;i<inputLength;i++)
        {
            weights[i] = randomWeights.nextDouble();
        }

        //correct weights
        for(int i=0;i<trainingCyclesCount;i++)
        {
            int totalError = 0;
            for(int j =0;j<outputsLength;j++)
            {
                int actualOutput  = outputSignalComputing(inputVectors[j]);
                int currentVectorError = requiredOutputVectors[j] - actualOutput ;

                totalError +=currentVectorError;

                if(currentVectorError !=0){
                    for(int k = 0;k<inputLength;k++)
                    {
                        double delta = lrate * inputVectors[j][k] * currentVectorError;
                        weights[k] += delta;
                    }
                }
            }
            if(totalError == 0)
                for(int p=0;p<weights.length;p++){
                    System.out.println(weights[p]);
                }
                break;
        }
    }

    public int outputSignalComputing (double[] input)
    {
        double sum = 0.0;
        for(int i=0;i<input.length;i++)
        {
            sum += weights[i]*input[i];
        }
        return sum>threshold? 1:0;
    }
}
