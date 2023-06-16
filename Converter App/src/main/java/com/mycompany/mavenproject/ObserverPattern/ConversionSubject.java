/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject.ObserverPattern;

/**
 *
 * @author merty
 */
import static com.mycompany.mavenproject.HomePage.convert;
import com.mycompany.mavenproject.Singleton;
import java.util.ArrayList;
import java.util.List;


public class ConversionSubject {
     private List<ConversionObserver> observers;
    private ConversionSubject subject;
    private SuccessNotification successNotification;
    
    public ConversionSubject() {
        observers = new ArrayList<>();
        //subject = this; // Kendi nesnenizi kullanın
        successNotification = new SuccessNotification();
        subject.addObserver(successNotification);
    }

   
    public void addObserver(ConversionObserver observer) {
        observers.add(observer);
    }
    
    public void removeObserver(ConversionObserver observer) {
        observers.remove(observer);
    }
    
    public void notifyFailure(Singleton singleton) {
        for (ConversionObserver observer : observers) {
            observer.onFailure();
        }
        
    }

    public void notifySuccess() {
    for (ConversionObserver observer : observers) {
        observer.onSuccess();
    }
}
}

    
    /* 
    // Dönüştürme işlemini gerçekleştiren metod
    public void performConversion() {
        // Dönüştürme işlemi
        boolean successNotify = performActualConversion();
        
        if (successNotify) {
            notifySuccess();
            System.out.println("islem success");
        } else {
            notifyFailure();
        }
    }
    
    public static boolean performActualConversion() {
       boolean success=true;
    return success;
    
       
    
} */


