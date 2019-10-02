package io.github.czar_ec.neurons;

import java.util.ArrayList;

public abstract class NeuronFactory {
    /**
     * NeuronFactory variables
     */
    protected ArrayList<Double> output, delta, weight, weightChange;

    /**
     * Function thst calculates what the output of the neuron should be
     * according to the input value
     * @param in
     */
    protected abstract void calcOutput(Double in);

    /**
     * Function that send outputs to other neurons
     * @param n
     */
    protected abstract void sendOutput(Integer n);

    /**
     * Function to calculate the difference between neuron's calcultaion and the real answer
     * @param errors
     */
    protected abstract void calcDelta(Double errors);

    /**
     * Function that calculates a new weight using rhe delta, input, learning rate and momentum
     * @param in
     * @param learnRate
     * @param momentum
     */
    protected abstract void changeWeight(Double in, Double learnRate, Double momentum);

    /**
     * Function that returns the weighted delta
     * @return
     */
    protected abstract Double WeightedDelta();

    /**
     * initialise weights in the neuron
     */
    public abstract void setWeight();

    /**
     * Function that returns the neuron weight
     * @return
     */
    public abstract Double getWeight();
}
