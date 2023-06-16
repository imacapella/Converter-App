/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

/**
 *
 * @author merty
 */
import java.io.File;

public class FileMemento {
    private final File file;
    private final String extension;

    public FileMemento(File file, String extension) {
        this.file = file;
        this.extension = extension;
    }

    public File getFile() {
        return file;
    }

    public String getExtension() {
        return extension;
    }
}
