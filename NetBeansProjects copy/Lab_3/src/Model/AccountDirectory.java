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
public class AccountDirectory {
    private ArrayList<Account> accounts;
    
    public AccountDirectory() {
        this.accounts = new ArrayList<Account>();
    }
    
    public ArrayList<Account> getAccount(){
        return accounts;
    }
    
    public void setAccount(ArrayList<Account> account) {
        this.accounts = account;
    }
    
    public Account addAccount() {
        Account acc = new Account();
        accounts.add(acc);
        return acc;
    }
    
    public void deleteAccount(Account account) {
        accounts.remove(account);
    }
    
    public Account searchAccounts(String accNum) {
        for(Account a : accounts) {
            if(a.getAccNum().contains(accNum)) {
                return a;
            }
        }
        return null;
    }
}
