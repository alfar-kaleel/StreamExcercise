/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamexcercise;

/**
 *
 * @author alfar
 */
public class student {
    
    
     
    private String Name;
    private int Marks;

    public student(String name,int marks){
    
    this.Name = name;
    this.Marks = marks;
    
    }
    
    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Marks
     */
    public int getMarks() {
        return Marks;
    }

    /**
     * @param Marks the Marks to set
     */
    public void setMarks(int Marks) {
        this.Marks = Marks;
    }
   
    
    public String ToString(){
    
    return ("Name : " + this.getName()+ " " + "Marks : " + this.getMarks() );
    
    
    }
    
}
