package com.furiosaming.singleLayerNeuralNetwork;

import com.furiosaming.singleLayerNeuralNetwork.model.Perceptron;

public class singleLayerNeuralNetworkApp {

    public static void main(String[] args) {
        Perceptron perceptronForNumber1 = new Perceptron();
        /**входные значения - представления цифр от 0 до 9 в матрице размером 15х10**/
        double inputVectors[][] = {
                {0, 0, 1, 1, 0, 0,
                 0, 0, 1, 1, 0, 0,
                 0, 0, 1, 1, 0, 0,
                 0, 0, 1, 1, 0, 0,
                 0, 0, 1, 1, 0, 0,
                 0, 0, 1, 1, 0, 0,
                 0, 0, 1, 1, 0, 0,
                 0, 0, 1, 1, 0, 0
                },//1
                {1, 1, 1, 1, 1, 1,
                 1, 1, 1, 1, 1, 1,
                 0, 0, 0, 0, 1, 1,
                 0, 0, 0, 0, 1, 1,
                 0, 0, 0, 0, 1, 1,
                 0, 0, 0, 0, 1, 1,
                 0, 0, 0, 0, 1, 1,
                 0, 0, 0, 0, 1, 1
                },//7
        };

        int requiredOutputVectors[] =
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0};//0
//                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},//1
//                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},//2
//                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},//3
//                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},//4
//                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},//5
//                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},//6
//                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},//7
//                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},//8
//                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},//9
        // };


        double inputVectorsLetters[][] = {
                {1, 1, 1, 1, 1, 1,
                 1, 1, 1, 1, 1, 1,
                 1, 1, 0, 0, 0, 0,
                 1, 1, 0, 0, 0, 0,
                 1, 1, 0, 0, 0, 0,
                 1, 1, 0, 0, 0, 0,
                 1, 1, 1, 1, 1, 1,
                 1, 1, 1, 1, 1, 1
                },//C
                {1, 1, 1, 1, 1, 1,
                 1, 1, 1, 1, 1, 1,
                 1, 1, 0, 0, 1, 1,
                 1, 1, 0, 0, 1, 1,
                 1, 1, 1, 1, 1, 1,
                 1, 1, 1, 1, 1, 1,
                 1, 1, 0, 0, 1, 1,
                 1, 1, 0, 0, 1, 1
                 },//A
                {1, 1, 1, 1, 1, 1,
                 1, 1, 1, 1, 1, 1,
                 1, 1, 0, 0, 0, 0,
                 1, 1, 0, 0, 0, 0,
                 1, 1, 0, 0, 0, 0,
                 1, 1, 0, 0, 0, 0,
                 1, 1, 0, 0, 0, 0,
                 1, 1, 0, 0, 0, 0
                },//Г
        };

        int requiredOutputVectorsLetters[] =
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0};//0
//                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},//1
//                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},//2
//                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},//3
//                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},//4
//                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},//5
//                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},//6
//                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},//7
//                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},//8
//                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},//9
        // };




        perceptronForNumber1.train(inputVectors, requiredOutputVectors,0.2, 1, 200);
//        for(double d: perceptronForNumber1.weights){
//            System.out.println(d);
//        }
        System.out.println(perceptronForNumber1.outputSignalComputing(new double[]{+1, +1, +1, +1, 0, +1, +1, 0, +1, +1, 0, +1, +1, +1, +1}));//0
        System.out.println(perceptronForNumber1.outputSignalComputing(new double[]{0, +1, 0, 0, +1, 0, 0, +1, 0, 0, +1, 0, 0, +1, 0}));//1
        System.out.println(perceptronForNumber1.outputSignalComputing(new double[]{0, +1, 0, 0, +1, 0, 0, +1, 0, 0, +1, 0, 0, +1, 0}));//1
        System.out.println(perceptronForNumber1.outputSignalComputing(new double[]{+1, +1, +1, 0, 0, +1, +1, +1, +1, +1, 0, 0, +1, +1, +1}));//2
        System.out.println(perceptronForNumber1.outputSignalComputing(new double[]{+1, +1, +1, 0, 0, +1, +1, +1, +1, 0, 0, +1, +1, +1, +1}));//3
    }

}
