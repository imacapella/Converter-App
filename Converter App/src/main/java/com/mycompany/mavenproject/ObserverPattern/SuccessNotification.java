/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject.ObserverPattern;

import javax.swing.JOptionPane;

/**
 *
 * @author merty
 */
public class SuccessNotification implements ConversionObserver {
    @Override
    public void onSuccess() {
        // Başarı bildirimi için yapılacak işlemler
        JOptionPane.showMessageDialog(null, "Dönüştürme başarıyla tamamlandı.", "Başarı", JOptionPane.INFORMATION_MESSAGE);
    }
    @Override
    public void onFailure() {
          JOptionPane.showMessageDialog(null, "Dönüştürme başarısız oldu.", "Başarısızlık", JOptionPane.ERROR_MESSAGE);
        
    }
}  
 

