/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ruirui
 */
public class Person {

    String FirstName;
    String LastName;
    String sex;
    String age;
    
    String wAddress1;
    String wAddress2;
    String wCity;
    String wState;
    String wZip;
    String wPhone;
    
    String hAddress1;
    String hAddress2;
    String hCity;
    String hState;
    String hZip;
    String hPhone;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getwAddress1() {
        return wAddress1;
    }

    public void setwAddress1(String wAddress1) {
        this.wAddress1 = wAddress1;
    }

    public String getwAddress2() {
        return wAddress2;
    }

    public void setwAddress2(String wAddress2) {
        this.wAddress2 = wAddress2;
    }

    public String getwCity() {
        return wCity;
    }

    public void setwCity(String wCity) {
        this.wCity = wCity;
    }

    public String getwState() {
        return wState;
    }

    public void setwState(String wState) {
        this.wState = wState;
    }

    public String getwZip() {
        return wZip;
    }

    public void setwZip(String wZip) {
        this.wZip = wZip;
    }

    public String getwPhone() {
        return wPhone;
    }

    public void setwPhone(String wPhone) {
        this.wPhone = wPhone;
    }

    public String gethAddress1() {
        return hAddress1;
    }

    public void sethAddress1(String hAddress1) {
        this.hAddress1 = hAddress1;
    }

    public String gethAddress2() {
        return hAddress2;
    }

    public void sethAddress2(String hAddress2) {
        this.hAddress2 = hAddress2;
    }

    public String gethCity() {
        return hCity;
    }

    public void sethCity(String hCity) {
        this.hCity = hCity;
    }

    public String gethState() {
        return hState;
    }

    public void sethState(String hState) {
        this.hState = hState;
    }

    public String gethZip() {
        return hZip;
    }

    public void sethZip(String hZip) {
        this.hZip = hZip;
    }

    public String gethPhone() {
        return hPhone;
    }

    public void sethPhone(String hPhone) {
        this.hPhone = hPhone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return FirstName;
    }
    
}
