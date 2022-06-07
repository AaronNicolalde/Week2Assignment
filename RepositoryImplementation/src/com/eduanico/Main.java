package com.eduanico;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Aaron1", "Eduardo", "Nicolalde");
        User user2 = new User("Aaron2", "Steven", "Nicolalde");
        User user3 = new User("Aaron3", "Alfredo", "Nicolalde");

        Element<User> elements = new Element<>();

        elements.save(user1);
        elements.save(user2);
        elements.save(user3);

        System.out.println("Count of users : "+elements.count());
        System.out.println("User at index 0: "+elements.find(0));
        System.out.printf("Array sorted by first name : " );
        //elements.getAllSortedBy("firstName");

        int stock1 = 11;
        Product product = new Product("Egg", stock1);
        int stock2 = 20;
        Product product2 = new Product("Egg2", stock2);


        Element<Product> elements2 = new Element<>();
        elements2.save(product);
        elements2.save(product2);

        System.out.println("Count of products: "+ elements2.count());
        System.out.println("Product at index 1: "+elements2.find(1));


        int isoCodes1 = 1;
        Country country1 = new Country("Colombia",isoCodes1);
        int isoCodes2 = 2;
        Country country2 = new Country("Ecuador",isoCodes2);
        int isoCodes3 = 3;
        Country country3 = new Country("USA",isoCodes3);
        int isoCodes4 = 4;
        Country country4 = new Country("Argentina",isoCodes4);

        Element<Country> elements3 = new Element<>();
        elements3.save(country1);
        elements3.save(country1);
        elements3.save(country2);
        elements3.save(country3);
        elements3.save(country4);

        System.out.println("Count of countries : "+ elements3.count());
        System.out.println("Country at index 2: "+ elements3.find(5));

    }
}
