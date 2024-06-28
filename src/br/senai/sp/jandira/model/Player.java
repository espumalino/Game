package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Player {

    Scanner reader = new Scanner(System.in);
    private String name;
    private String skin;
    private int health;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Player() {
        health = 100;
    }

    public void registerPlayer () {
        System.out.println("-------- Register Player --------");
        System.out.println("What is your name: ");
        this.name = reader.nextLine();
        System.out.println("What is your skin: ");
        this.skin = reader.nextLine();
        System.out.println("---------------------------------");


    }

    public void showPlayer () {
        System.out.println("------------- Player -------------");
        System.out.println("Player name: " + this.name);
        System.out.println("Player skin: " + this.skin);
        System.out.println("Player HP: " + this.health);
        System.out.println("----------------------------------");

    }

    public void reduceHealth (int enemyDamage) {
        health -= enemyDamage;

        if (health < 0) {
            health = 0;
        }
    }

}
