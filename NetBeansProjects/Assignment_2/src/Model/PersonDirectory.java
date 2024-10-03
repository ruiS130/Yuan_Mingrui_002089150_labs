/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.*;

/**
 *
 * @author ruirui
 */
public class PersonDirectory {
    private ArrayList<Person> personList;
    
    public PersonDirectory() {
        this.personList = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getPerson(){
        return personList;
    }
    
    public void setPerson(ArrayList<Person> personL) {
        this.personList = personL;
    }
    
    public Person addPerson() {
        Person p = new Person();
        personList.add(p);
        return p;
    }
    
    public void deletePerson(Person personX) {
        personList.remove(personX);
    }
    
    public Person searchPerson(String fName) {
        for(Person a : personList) {
            if(a.getFirstName().contains(fName)) {
                return a;
            }
        }
        return null;
    }
}
