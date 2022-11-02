/*
 * Cafe Class
 * Assignment 6
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Leah Marville
 * @version 2 November 2022
 */
public class Cafe extends Building {

    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe(String name, String address, int nFloors, int coffee, int sugar, int cream, int cups) {
        super (name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.nCoffeeOunces = coffee;
        this.nSugarPackets = sugar;
        this.nCreams = cream;
        this.nCups = cups;

    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {

    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        nCoffeeOunces += 
    }

    public static void main(String[] args) {
        new Cafe();
    }
    
}
