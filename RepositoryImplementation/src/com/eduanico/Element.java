package com.eduanico;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Element<T extends Element>{
    private List<T> array;

    public Element() {
        array = new ArrayList<T>();
    }

    boolean save(T element){
        if(array == null){
            System.out.println("Array is null.");
            return false;
        }
        if(array.contains(element)){
            int index = array.indexOf(element);
            System.out.println("Element already in the list : " + array.get(index));
            return false;
        }
        array.add(element);
        return true;
    }

    int count(){
        return array.size();
    }

    T find(int index) {
        if(index > array.size()){
            System.out.println("Index out of range");
            return null;
        }else if(index < 0){
            System.out.println("Index can't be negative.");
            return null;
        }
        return array.get(index);
    }

    public List<T> getArray() {
        return array;
    }


    boolean getAllSortedBy(String field){

        if(field == null )
            return false;
        if( field == "name"){
            Collections.sort(array, (o1, o2) -> (Product) o1.getName().compareTo( (Product) o2.getName()));
        }else if( field == "stock"){
            Collections.sort(array, (o1,o2)-> Integer.valueOf(o1.getStock()).compareTo(o2.getStock()));
        }else
            return false;
    }

    List<User> getDomains(ArrayList<User> userArray){
        return userArray;
    }




}
