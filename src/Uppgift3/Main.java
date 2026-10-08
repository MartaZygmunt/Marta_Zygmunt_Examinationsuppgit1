package Uppgift3;

public class Main {
    public static void main(String[] args){

        Person me = new Person("1985-07-30");
        Person friend = new Person("1989-05-24");

        me.setName("Marta");
        friend.setName("Angelica");

        me.setStreetAdress("Gata 16");
        me.setZipCode("123 45");
        me.setCity("Stockholm");

        friend.setStreetAdress("Vägen 50");
        friend.setZipCode("543 21");
        friend.setCity("Göteborg");

        System.out.println("Before moving in: ");
        System.out.println(me.getName() + " lives at: " + me.getStreetAdress() + ", " + me.getZipCode() + " " + me.getCity());
        System.out.println(friend.getName() + " lives at: " + friend.getStreetAdress() + ", " + friend.getZipCode() + " " + friend.getCity());

        friend.setStreetAdress(me.getStreetAdress());
        friend.setZipCode(me.getZipCode());
        friend.setCity(me.getCity());

        System.out.println("After moving in: ");
        System.out.println(me.getName() + " still lives att: " +  me.getStreetAdress() + ", " + me.getZipCode() + " " + me.getCity());
        System.out.println(friend.getName() + " lives at: " + friend.getStreetAdress() + ", " + friend.getZipCode() + " " + friend.getCity());
        System.out.println("A friend Angelica lives now with Marta. ");
    }
}



