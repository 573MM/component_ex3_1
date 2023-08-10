/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermailapplication;

/**
 *
 * @author LENOVO
 */
public class CustomerFactory {
    public static Customer getCustomerTypeFromUser(String customerType) {
        /*if (customerType.equals("Regular")){
            return new RegularCustomer();
        } 
        else if (customerType.equals("Mountain")){
            return new RegularCustomer();
        } 
        else {
            return new DelinquentCustomer();
        }*/
            
        switch(customerType) {
            case "Regular":
                return new RegularCustomer();
                
            case "Mountain":
                return new MountainCustomer();
                
            case "Delinquent":
                return new DelinquentCustomer();
        }
        return null;
    }
}
