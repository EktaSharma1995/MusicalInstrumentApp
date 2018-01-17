/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicalinstrumentslistapp;

/**
 *
 * @author Ekta/Navreet/Nilton
 */
public class Keyboard extends MusicalInstrument {

    //instance variables
    private int numberOfKeys;

    //Default constructor
    public Keyboard() {
    }

    //Parameterized Constructor
    public Keyboard(String name, String origin, String commonClassification, String pathPicture, String pathSoundSample, int numberOfKeys) {
        super(name, origin, commonClassification, pathPicture, pathSoundSample);
        this.numberOfKeys = numberOfKeys;
    }

    //accessor methods - returning values of the instance variables - attributes
    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    //mutator methods - changing value of the instance variables - behaviour
    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }
    
    
}
