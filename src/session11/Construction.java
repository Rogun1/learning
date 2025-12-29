package session11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// I CAN DO IT WITH A SEPPARATE CLASS LIKE Construction OR IN RESOURCES
//public class Construction {
//    private List<Resource> availabeResources;
//
//    public Construction(){
//        availabeResources = new ArrayList<>(Arrays.asList());
//    }
//
//    public void getAvailabeResources(){
//        for (Resource resource: availabeResources){
//            System.out.print(resource.getName() + ": ");
//            System.out.print(resource.getQuantity() + ", ");
//        }
//    }
//
//    public void setAvailabeResources(Resource resource) {
//        if (availabeResources.contains(resource)){
//            System.out.println(resource.getName() + " already exists");
//        }else {
//            availabeResources.add(resource);
//        }
//    }
//}

class Resource{
    private final String name;
    private int quantity;
    private int quantityNeeded;
    private final List<Resource> available = new ArrayList<>(Arrays.asList());;

    public Resource(String name, int quantity, int quantityNeeded){
        this.name = name;
        this.quantity = quantity;
        this.quantityNeeded = quantityNeeded;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        System.out.print(name + " quantity set to: " + quantity);
        this.quantity = quantity;
    }

    public int getQuantityNeeded() {
        return quantityNeeded;
    }

    public void setQuantityNeeded(int quantityNeeded) {
        System.out.print("Quantity needed set to: " + quantityNeeded + " " + name + "'s");
        this.quantityNeeded = quantityNeeded;
    }

    public void setAvailable(Resource resource) {
        if (available.contains(resource)){
            System.out.println(resource.getName() + " already exists");
        }else {
            available.add(resource);
        }
    }
    public void getAvailable(){
        System.out.println();
        System.out.print("Available ");
        for (Resource resource: available){
            System.out.println(resource.getName() + ": ");
            System.out.print(resource.getName() + ": ");
            System.out.print(resource.getQuantity() + ", ");
        }
    }
}


