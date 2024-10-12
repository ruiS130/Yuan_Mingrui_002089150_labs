/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ruirui
 */
import java.util.*;

/**
 *
 * @author ruirui
 */
public class VitalSignsHistory {
    ArrayList<VitalSigns> history;
    
    public VitalSignsHistory() {
        history = new ArrayList<VitalSigns>();
    }
    
    public VitalSigns addNewVitals() {
        VitalSigns newVitSign = new VitalSigns();
        history.add(newVitSign);
        return newVitSign;
    }
    
    public void removeVitals(VitalSigns vs) {
        history.remove(vs);
    }
    
    public ArrayList<VitalSigns> getHistory() {
        return history;
    }
    
    }