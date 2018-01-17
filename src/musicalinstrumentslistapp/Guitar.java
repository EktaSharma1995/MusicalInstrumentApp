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
public class Guitar extends MusicalInstrument {

    //instance variables
    private String bodyMaterial;
    private int numberOfStrings;
    private int numberOfPickups;

    //Default constructor
    public Guitar() {
    }

    //Parameterized Constructor
    public Guitar(String name, String origin, String commonClassification, String pathPicture, String pathSoundSample, String bodyMaterial, int numberOfStrings, int numberOfPickups) {
        super(name, origin, commonClassification, pathPicture, pathSoundSample);
        this.bodyMaterial = bodyMaterial;
        this.numberOfStrings = numberOfStrings;
        this.numberOfPickups = numberOfPickups;
    }

    //accessor methods - returning values of the instance variables - attributes
    public String getBodyMaterial() {
        return bodyMaterial;
    }
    
    public int getNumberOfStrings() {
        return numberOfStrings;
    }
       
    public int getNumberOfPickups() {
        return numberOfPickups;
    }

    //mutator methods - changing value of the instance variables - behaviour
    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    } 

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }  

    public void setNumberOfPickups(int numberOfPickups) {
        this.numberOfPickups = numberOfPickups;
    }

}
