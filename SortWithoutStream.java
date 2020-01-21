/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamexcercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author alfar
 */
public class SortWithoutStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List <student> students = new ArrayList();
        
        students.add(new student("Alfar",90));
        students.add(new student("Ishan",85));
        students.add(new student("Kasun",50));
        students.add(new student("Nandu",65));
        students.add(new student("Dinuka",70));
        students.add(new student("Hasitha",60));
        students.add(new student("Zaheer",100));
        students.add(new student("Sandun",61));
        students.add(new student("Sugasan",76));
        students.add(new student("Hemal",30));
        
        
        Comparator <student> StudentComparator = (s1,s2) -> (s1.getMarks()>s2.getMarks()?+1:s1.getMarks()<s2.getMarks()?-1:0);
                            
        Collections.sort(students,StudentComparator);
        
        for(int i = 0;i < students.size();i++){
        
        System.out.println(students.get(i).ToString());
        
        }
  
    }
    
}
