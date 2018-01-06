/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Asus
 */
public class SuperClass_Perent {
    public double ChikenBegur;
    public double ChikenBegurM;
    public double BeconChisees;
    public double ChikenLegon;
    public double FiletOFish;
    
    public double MilkShake;
    public double VanilaCone;
    public double VanilaMilkshake;
    public double classicvaniShake;
    public double CocoMilkShake;
    
    public double Meal;
    public double Drinks;
    public double TotalOfMd;
    public double AllTotalOfMd;
    
    
    public double GetAmount()
    {
        Meal=FiletOFish+ChikenBegur +ChikenBegurM+BeconChisees+ChikenLegon;
        Drinks=MilkShake+VanilaCone+VanilaMilkshake+classicvaniShake+CocoMilkShake;
        TotalOfMd=Meal+Drinks;
        AllTotalOfMd=TotalOfMd;
        return AllTotalOfMd;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Comfrome if You Wont to Quit","Quit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
            
        }
        
     
     
        
    }
    public double pChikenBegur=480;
    public double pChikenBegurM=850;
    public double pBeconChisees=520;
    public double pChikenLegon=700;
    public double pFiletOFish=320;
    
    public double pMilkShake=300;
    public double pVanilaCone=450;
    public double pVanilaMilkshak=400;
    public double pclassicvaniShake=350;
    public double pCocoMilkShake=350;
    
    
    
    
    
    
}
