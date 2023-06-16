/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author merty
 */
public class FileMementoManager {
    private final List<FileMemento> mementos;
    private int currentIndex;

    public FileMementoManager() {
        mementos = new ArrayList<>();
        currentIndex = -1;
    }

    public void addMemento(FileMemento memento) {
       
        mementos.subList(currentIndex + 1, mementos.size()).clear();

        mementos.add(memento);
        currentIndex++;
        
    }

 public FileMemento getPreviousMemento(int undoCount) {
    if (currentIndex - undoCount >= 0) {
        currentIndex -= undoCount;
        return mementos.get(currentIndex);
    }
    return null;
}


    public FileMemento getNextMemento() {
        if (currentIndex < mementos.size() - 1) {
            currentIndex++;
            return mementos.get(currentIndex);
        }
        return null;
    }
}

