package Models;

import Service.ItemService;
import org.jetbrains.annotations.Contract;

import java.util.*;

public class Inventory {

    static Map<String, ItemService> inventoryList = new TreeMap<>();

    @Contract(pure = true)
    public static Boolean nameExists(String str){
        if(inventoryList.containsKey(str)){
            return true;
        }else{
            return false;
        }

    }

    public static void Create(String name, Double CP, Double SP, Integer quantity) throws Exception {

       if(!inventoryList.containsKey(name)){
           ItemService itemService = new ItemService(name, CP, SP, quantity);
           inventoryList.put(name, itemService);
       }else{
//           throw new DuplicateException("Duplicate entry | Not accepted");
           throw new Exception("Duplicate entry | Not accepted");
       }
    }

    public static void delete(String name) throws Exception{

        if(!inventoryList.containsKey(name)){
            //value not found
            throw new Exception("item not found");
        }else{
            inventoryList.remove(name);
        }

    }

    public static void updateBuy(String name, int quantity) throws Exception{
        if(inventoryList.containsKey(name)){
            ItemService oldItemService = inventoryList.get(name);
            ItemService newItemService = new ItemService(name, oldItemService.getItemCP(), oldItemService.getItemSP(), (oldItemService.getQuantity() + quantity));
            inventoryList.put(name, newItemService);
        }else{
            throw new Exception("item not found");
        }
    }

    public static void updateSell(String name, int quantity) throws  Exception{
        if(inventoryList.containsKey(name)){
           ItemService oldItemService = inventoryList.get(name);
           if(oldItemService.getQuantity() < quantity){
               throw new Exception("item quantity less than required");
           }else{

               ItemService newItemService = new ItemService(name, oldItemService.getItemCP(), oldItemService.getItemSP(), (oldItemService.getQuantity() - quantity));
               inventoryList.put(name, newItemService);
           }
        }else{
            throw new Exception("item not found in the list");
        }
    }


    public static void report(){
        String response = "";

        System.out.println("Report: -------------------------------");
        List<String> itemNames = new ArrayList<>(inventoryList.keySet());
        Collections.sort(itemNames);
        for(String itemName: itemNames){
            inventoryList.get(itemName).printRow();
        }



    }


}
