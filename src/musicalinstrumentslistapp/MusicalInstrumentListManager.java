/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicalinstrumentslistapp;

import java.util.Scanner;

/**
 *
 * @author Ekta/Navreet/Nilton
 */
public class MusicalInstrumentListManager {

    private static MusicalInstrumentDB musicalInstrumentList = new MusicalInstrumentDB();
    private static Scanner keyBoard = new Scanner(System.in);

    // shows the menu
    public static void musicalInstrumentDBMenu() {

        int choice = 0;
        String choiceForMusicalInstrument;
        do {
            System.out.println("***************** Musical Instrument Database Menu *****************");
            System.out.println("1. Add a new musical instrument");
            System.out.println("2. Update musical instrument");
            System.out.println("3. Delete musical instrument");
            System.out.println("4. Find a musical instrument");
            System.out.println("5. List all musical instruments");
            System.out.println("6. List musical instruments by origin");

            System.out.println("9. Exit");
            System.out.print("Enter your choice -> ");
            choice = Integer.parseInt(keyBoard.nextLine());

            if (choice == 1) {
                System.out.println("Enter the class of the instrument: (1)Keyboard, (2)Guitar or (3)Drum kit");
                choiceForMusicalInstrument = keyBoard.nextLine();

                if (choiceForMusicalInstrument.equalsIgnoreCase("1")) {
                    addMusicalInstrument(createKeyboardInstrument());
                } else if (choiceForMusicalInstrument.equalsIgnoreCase("2")) {
                    addMusicalInstrument(createGuitarInstrument());
                } else if (choiceForMusicalInstrument.equalsIgnoreCase("3")) {
                    addMusicalInstrument(createDrumkitInstrument());
                }

            } else if (choice == 2) {
                editMusicalInstrument(createName());
            } else if (choice == 3) {
                deleteMusicalInstrument(createName());
            } else if (choice == 4) {
                findMusicalInstrument(createName());
            } else if (choice == 5) {
                listMusicalInstruments();
            } else if (choice == 6) {
                listMusicalInstrumentsByOrigin(createOrigin());
            } else if (choice != 9) {
                System.err.println("Invalid choice!!!");
            }

        } while (choice != 9);
    }

    public static void addMusicalInstrument(MusicalInstrument musicalInstrument) {
        if (musicalInstrumentList.addMusicalInstrument(musicalInstrument)) {
            System.out.println("------------- Musical Instrument is added successfully -------------");
        } else {
            System.out.println("------- Failed to add musical instrument as the list is full -------");
        }
    }

    //create a musical instrument of class Keyboard
    public static Keyboard createKeyboardInstrument() {

        Keyboard musicalInstrument;
        musicalInstrument = new Keyboard();

        System.out.println("Instrument is: KEYBOARD");

        // information about the musical instrument
        System.out.print("Enter the name : ");
        musicalInstrument.setName(keyBoard.nextLine());
        System.out.print("Enter the origin : ");
        musicalInstrument.setOrigin(keyBoard.nextLine());
        musicalInstrument.setCommonClassification("Keyboard");
        System.out.print("Enter the picture path : ");
        musicalInstrument.setPathPicture(keyBoard.nextLine());
        System.out.print("Enter the sound sample path : ");
        musicalInstrument.setPathSoundSample(keyBoard.nextLine());
        System.out.print("Enter the number of Keys : ");
        musicalInstrument.setNumberOfKeys(Integer.parseInt(keyBoard.nextLine()));

        return musicalInstrument;
    }

    // create a musical instrument of class Guitar
    public static Guitar createGuitarInstrument() {

        Guitar musicalInstrument;
        musicalInstrument = new Guitar();

        System.out.println("Instrument is: GUITAR");

        // information about the musical instrument
        System.out.print("Enter the name : ");
        musicalInstrument.setName(keyBoard.nextLine());
        System.out.print("Enter the origin : ");
        musicalInstrument.setOrigin(keyBoard.nextLine());
        musicalInstrument.setCommonClassification("Guitar");
        System.out.print("Enter the picture path : ");
        musicalInstrument.setPathPicture(keyBoard.nextLine());
        System.out.print("Enter the sound sample path : ");
        musicalInstrument.setPathSoundSample(keyBoard.nextLine());
        System.out.print("Enter the body material : ");
        musicalInstrument.setBodyMaterial(keyBoard.nextLine());
        System.out.print("Enter the number of strings : ");
        musicalInstrument.setNumberOfStrings(Integer.parseInt(keyBoard.nextLine()));
        System.out.print("Enter the number of pickups : ");
        musicalInstrument.setNumberOfPickups(Integer.parseInt(keyBoard.nextLine()));

        return musicalInstrument;
    }

    // create a musical instrument of class Drumkit
    public static Drumkit createDrumkitInstrument() {

        Drumkit musicalInstrument;
        musicalInstrument = new Drumkit();

        System.out.println("Instrument is: DRUM KIT");

        // information about the musical instrument
        System.out.print("Enter the name : ");
        musicalInstrument.setName(keyBoard.nextLine());
        System.out.print("Enter the origin : ");
        musicalInstrument.setOrigin(keyBoard.nextLine());
        musicalInstrument.setCommonClassification("Drum Kit");
        System.out.print("Enter the picture path : ");
        musicalInstrument.setPathPicture(keyBoard.nextLine());
        System.out.print("Enter the sound sample path : ");
        musicalInstrument.setPathSoundSample(keyBoard.nextLine());
        System.out.print("Enter the number of pieces : ");
        musicalInstrument.setNumberOfPieces(Integer.parseInt(keyBoard.nextLine()));
        System.out.print("Enter the number of cymbals : ");
        musicalInstrument.setNumberOfCymbals(Integer.parseInt(keyBoard.nextLine()));
        System.out.print("Enter the shell material : ");
        musicalInstrument.setShellMaterial(keyBoard.nextLine());
        System.out.print("Enter the head material : ");
        musicalInstrument.setHeadMaterial(keyBoard.nextLine());

        return musicalInstrument;
    }

    // list all instruments from the list
    public static void listMusicalInstruments() {
        if (musicalInstrumentList.getCount() > 0) {
            System.out.println("***************** List of musical instruments **********************" + "#" + musicalInstrumentList.getCount());

            MusicalInstrument musicalInstrument;

            for (int index = 0; index < musicalInstrumentList.getCount(); index++) {

                musicalInstrument = musicalInstrumentList.getMusicalInstrument(index);
                printInstrumentInfo(musicalInstrument);
                System.out.println(" ");

            }
        } else {
            System.out.println("----------------------- List is empty ! ----------------------------");
        }
    }

    // list all musical instruments from an especific origin
    public static void listMusicalInstrumentsByOrigin(String origin) {
        if (musicalInstrumentList.getCount() > 0) {

            System.out.println("************* List of musical instruments by origin ****************" + " from " + origin);

            MusicalInstrument musicalInstrument;

            for (int index = 0; index < musicalInstrumentList.getCount(); index++) {

                musicalInstrument = musicalInstrumentList.getMusicalInstrument(index);

                if (origin.equalsIgnoreCase(musicalInstrument.getOrigin())) {
                    printInstrumentInfo(musicalInstrument);
                    System.out.println(" ");
                }
            }
        } else {
            System.out.println("----------------------- List is empty ! ----------------------------");
        }
    }

    // find a musical instrument in the list
    public static int findMusicalInstrument(String name) {
        int index = musicalInstrumentList.findByName(name);

        if (index >= 0) {
            MusicalInstrument musicalInstrument;
            musicalInstrument = musicalInstrumentList.getMusicalInstrument(index);

            System.out.println("************* Musical instrument is found successfully *************");

            // print musical instrument information
            printInstrumentInfo(musicalInstrument);
        } else {
            System.out.println("------------- Musical instrument is not in the list ----------------");
        }
        return index;
    }

    // delete a musical from the list
    public static void deleteMusicalInstrument(String name) {
        int index = findMusicalInstrument(name);
        if (index >= 0) {
            musicalInstrumentList.deleteMusicalInstrument(index);
            System.out.println("----------- Musical instrument was deleted successfully ------------");
        }
    }

    // edit a musical instrument in the list 
    public static void editMusicalInstrument(String name) {

        String choiceForMusicalInstrument;
        // first try to find the musical instrument by name in the list

        int index = findMusicalInstrument(name);

        // if the instrument is found
        if (index >= 0) {

            // asks for new information
            System.out.println("*************** Provide the NEW information ************************");

            System.out.println("Enter the class of the instrument: (1)Keyboard, (2)Guitar or (3)Drumkkit");
            choiceForMusicalInstrument = keyBoard.nextLine();

            // asks for new information accordingly to the class of the instrument
            if (choiceForMusicalInstrument.equalsIgnoreCase("1")) {
                musicalInstrumentList.updateMusicalInstrument(index, createKeyboardInstrument());
            } else if (choiceForMusicalInstrument.equalsIgnoreCase("2")) {
                musicalInstrumentList.updateMusicalInstrument(index, createGuitarInstrument());
            } else if (choiceForMusicalInstrument.equalsIgnoreCase("3")) {
                musicalInstrumentList.updateMusicalInstrument(index, createDrumkitInstrument());
            }

            System.out.println("----------- Musical instrument was updated successfully ------------");
        }
    }

    // used to get the name of the musical instrument  
    public static String createName() {
        System.out.print("Enter the name : ");
        String name = keyBoard.nextLine();
        return name;
    }

    // used to get the name of the coutry 
    public static String createOrigin() {
        System.out.print("Enter the origin : ");
        String name = keyBoard.nextLine();
        return name;
    }

    // print Instruments Information
    public static void printInstrumentInfo(MusicalInstrument musicalInstrument) {
        // create the the objects of all the possible sub classes 
        Drumkit dk;
        Guitar gt;
        Keyboard kb;

        // used to get the type of the sub class  
        String getMusicalInstrumentClass;

        System.out.println("Name: " + musicalInstrument.getName());
        System.out.println("Origin: " + musicalInstrument.getOrigin());
        System.out.println("Classification: " + musicalInstrument.getCommonClassification());
        System.out.println("Picture path: " + musicalInstrument.getPathPicture());
        System.out.println("Sound sample path: " + musicalInstrument.getPathSoundSample());

        // print the additional information accordingly to each possible subclass
        getMusicalInstrumentClass = musicalInstrument.getClass().toString();
        if (getMusicalInstrumentClass.equalsIgnoreCase("class musicalinstrumentslistapp.Drumkit")) {
            dk = (Drumkit) musicalInstrument;
            System.out.println("Number of Pieces: " + dk.getNumberOfPieces());
            System.out.println("Number of Cymbals: " + dk.getNumberOfCymbals());
            System.out.println("Shell material: " + dk.getShellMaterial());
            System.out.println("Head material: " + dk.getHeadMaterial());
        } else if (getMusicalInstrumentClass.equalsIgnoreCase("class musicalinstrumentslistapp.Keyboard")) {
            kb = (Keyboard) musicalInstrument;
            System.out.println("Number of keys: " + kb.getNumberOfKeys());
        } else if (getMusicalInstrumentClass.equalsIgnoreCase("class musicalinstrumentslistapp.Guitar")) {
            gt = (Guitar) musicalInstrument;
            System.out.println("Number of strings: " + gt.getNumberOfStrings());
            System.out.println("Number of pickups: " + gt.getNumberOfPickups());
            System.out.println("Body material: " + gt.getBodyMaterial());
        }
    }

}
