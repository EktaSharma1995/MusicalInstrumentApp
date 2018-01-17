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
public class MusicalInstrumentDB {

    private MusicalInstrument[] musicalInstrumentList;
    private int count;
    private final int capacity;

    public MusicalInstrumentDB(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        musicalInstrumentList = new MusicalInstrument[capacity];
    }

    public MusicalInstrumentDB() {
        this(10);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCount() {
        return this.count;
    }

    public int findByName(String name) {
        int loc = -1;
        MusicalInstrument musicalInst;

        for (int index = 0; index < count; index++) {
            musicalInst = musicalInstrumentList[index];

            if (name.equalsIgnoreCase(musicalInst.getName())) {
                loc = index;
                break;
            }
        }
        return loc;
    }

    public MusicalInstrument getMusicalInstrument(int index) {
        return (musicalInstrumentList[index]);
    }

    public boolean addMusicalInstrument(MusicalInstrument musicalInstrument) {
        boolean added = false;
        if (count < capacity) {
            musicalInstrumentList[count++] = musicalInstrument;
            added = true;
        }
        return added;
    }

    public void updateMusicalInstrument(int index, MusicalInstrument newMusicalInstrument) {
        musicalInstrumentList[index] = newMusicalInstrument;
    }

    public void deleteMusicalInstrument(int indexDelete) {
        for (int index = indexDelete; index < count - 1; index++) {
            musicalInstrumentList[index] = musicalInstrumentList[index + 1];
        }

        count--;
    }

}
