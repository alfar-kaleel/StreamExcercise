/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamexcercise;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author alfar
 */
public class StreamExcercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map <String,Integer> students = new HashMap<String,Integer>();
        
        students.put("Alfar", 60);
        students.put("Siva", 80);
        students.put("Vimal", 70);
        students.put("Perera", 65);
        students.put("Khan", 73);
        students.put("Kusal", 90);
        students.put("Ishan", 60);
        students.put("kannan", 90);
        students.put("Aruni", 100);
        
    //  List <String> filtered = students
                          //       .keySet()
                            ///     .stream()
                               //  .sorted()
                                 //.filter(e -> students.get(e)>60).collect(Collectors.toList());
     
        //System.out.println(filtered.stream().collect(Collectors.toList()));
        
        
        System.out.println(students.entrySet().stream().filter(e -> e.getValue()>60).sorted(Map.Entry.comparingByKey()).collect(Collectors.toList()));
    }
    
}
