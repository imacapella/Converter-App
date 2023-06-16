package com.mycompany.mavenproject;

import com.mycompany.mavenproject.ObserverPattern.ConversionObserver;
import com.mycompany.mavenproject.ObserverPattern.ConversionSubject;
import java.io.File;
import java.util.ArrayList;
import static java.util.Collections.singleton;
import java.util.List;
import javax.swing.JFileChooser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author karad
 */
public class Singleton {
    private static Singleton instance;
    private String textFieldData;
    private String username;
    private String password; 
    private boolean loginControl;
    boolean success;
    JFileChooser fileChooser;
    public  String fileName = "dosya.txt";
    public  String fileExtension=null;
    public  String comboBoxSelection;
    public  String totalName;
    private List<ConversionObserver> observers;
    
    private Singleton() {
        observers = new ArrayList<>();
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
    
    public void notifySuccess() {
    if (!observers.isEmpty()) {
        for (ConversionObserver observer : observers) {
            observer.onSuccess();
        }
    }
}   
    public void notifyFailure() {
        if (!observers.isEmpty()) {
            for (ConversionObserver observer : observers) {
            observer.onFailure();
            }
    }
    }

    public JFileChooser getFileChooser() {
        return fileChooser;
    }

    public void setFileChooser(JFileChooser fileChooser) {
        this.fileChooser = fileChooser;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtension(File file) {
        if (file != null) {
            setFileName(file.getName());    
        } else {
        } 
        int dotIndex = fileName.lastIndexOf(".");
        if (dotIndex != -1 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1);      
        } else {
            return "";
        }
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getComboBoxSelection() {
        return comboBoxSelection;
    }

    public void setComboBoxSelection(String comboBoxSelection) {
        this.comboBoxSelection = comboBoxSelection;
    }

    public String getTotalName() {
        return totalName;
    }

    public void setTotalName(String totalName) {
        this.totalName = totalName;
    }

    public File getSelectedFile() {
        return selectedFile;
    }

    public void setSelectedFile(File selectedFile) {
        this.selectedFile = selectedFile;
    }

    public File getPreviousFile() {
        return previousFile;
    }

    public void setPreviousFile(File previousFile) {
        this.previousFile = previousFile;
    }

    public String getPreviousExtension() {
        return previousExtension;
    }

    public void setPreviousExtension(String previousExtension) {
        this.previousExtension = previousExtension;
    }

    public FileMementoManager getMementoManager() {
        return mementoManager;
    }

    public void setMementoManager(FileMementoManager mementoManager) {
        this.mementoManager = mementoManager;
    }
    public  File selectedFile;
    public  File previousFile;
    public  String previousExtension;
    FileMementoManager mementoManager;
    

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getTextFieldData() {
        return textFieldData;
    }

    public void setTextFieldData(String data) {
        textFieldData = data;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
     public boolean getLoginControl() {
        return loginControl;
    }
    
    public void setLoginControl(boolean loginControl) {
        this.loginControl = loginControl;
    }

}

