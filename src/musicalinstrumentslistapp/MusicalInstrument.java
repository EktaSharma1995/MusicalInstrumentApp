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
public class MusicalInstrument {

    //instance variables
    private String name, origin, commonClassification, pathPicture, pathSoundSample;

    //Default constructor    
    public MusicalInstrument() {
    }
    
    //Parameterized Constructor
    public MusicalInstrument(String name, String origin, String commonClassification, String pathPicture, String pathSoundSample) {
        this.name= name;
        this.origin = origin;
        this.commonClassification = commonClassification;
        this.pathPicture = pathPicture;
        this.pathSoundSample = pathSoundSample;
    }

    //accessor methods - returning values of the instance variables - attributes
    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public String getCommonClassification() {
        return commonClassification;
    }

    public String getPathPicture() {
        return pathPicture;
    }

    public String getPathSoundSample() {
        return pathSoundSample;
    }

    //mutator methods - changing value of the instance variables - behaviour
    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setCommonClassification(String commonClassification) {
        this.commonClassification = commonClassification;
    }

    public void setPathPicture(String pathPicture) {
        this.pathPicture = pathPicture;
    }

    public void setPathSoundSample(String pathSoundSample) {
        this.pathSoundSample = pathSoundSample;
    }

}
