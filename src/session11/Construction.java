package session11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Construction {
    private List<Resource> availabeResources;
    private List<Resource> neededResources;

    public Construction(){
        availabeResources = new ArrayList<>(Arrays.asList());
        neededResources = new ArrayList<>(Arrays.asList());
    }

    public void getAvailabeResources(){
        for (Resource resource: availabeResources){
            System.out.print(resource.getName() + ": ");
            System.out.print(resource.getQuantity() + ", ");
        }
    }

    public void setAvailabeResources(Resource resource) {
        if (availabeResources.contains(resource)){
            System.out.println(resource.getName() + " already exists");
        }else {
            availabeResources.add(resource);
        }
    }
}

class Resource{
    private final String name;
    private int quantity;
    private int quantityNeeded;

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
//        if (quantityNeeded < quantity){
//            return quantityNeeded - quantity;
//        }else {
//            return quantity;
//        }

    }

    public void setQuantityNeeded(int quantityNeeded) {
        System.out.print("Quantity needed set to: " + quantityNeeded + " " + name + "'s");
        this.quantityNeeded = quantityNeeded;
    }
}


