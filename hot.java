/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author SAMSUNG
 */
public class hot extends canz {
    
    
            public hot()
    {
    
    }
    int temp;   
   public hot( String color,String taste,int temp)
    {
        
        this.color=color;
        this.taste=taste;
        this.temp=temp;
    }    
        public void settemp(int temp)
    {
    
        this.temp=temp;
        
    }        
            
        
    int gettemp(){

     return temp;
    
    }
    
    @Override
    String getcolor(){

     return color;
    
    }
    
    @Override
    String gettaste(){

     return taste;
    
    }
}
