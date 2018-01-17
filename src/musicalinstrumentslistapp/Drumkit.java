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
public class Drumkit extends MusicalInstrument {

    //instance variables
    private int numberOfPieces;
    private int numberOfCymbals;
    private String shellMaterial;
    private String headMaterial;

    //Default constructor
    public Drumkit() {
    }

    //Parameterized Constructor
    public Drumkit(String name, String origin, String commonClassification, String pathPicture, String pathSoundSample, int numberOfPieces, int numberOfCymbals, String shellMaterial, String headMaterial) {
        super(name, origin, commonClassification, pathPicture, pathSoundSample);
        this.headMaterial = headMaterial;
        this.numberOfCymbals = numberOfCymbals;
        this.numberOfPieces = numberOfPieces;
        this.shellMaterial = shellMaterial;
    }

    //accessor methods - returning values of the instance variables - attributes
    public int getNumberOfPieces() {
        return numberOfPieces;
    }
    
    public int getNumberOfCymbals() {
        return numberOfCymbals;
    }
     
    public String getShellMaterial() {
        return shellMaterial;
    }

    public String getHeadMaterial() {
        return headMaterial;
    }

    //mutator methods - changing value of the instance variables - behaviour
    public void setNumberOfPieces(int numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }
   
    public void setNumberOfCymbals(int numberOfCymbals) {
        this.numberOfCymbals = numberOfCymbals;
    }
    
    public void setShellMaterial(String shellMaterial) {
        this.shellMaterial = shellMaterial;
    } 

    public void setHeadMaterial(String headMaterial) {
        this.headMaterial = headMaterial;
    }

}
