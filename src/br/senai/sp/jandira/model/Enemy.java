package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Enemy {

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

    public Enemy() {
        health = 100;
    }

    public void registerEnemy () {
        System.out.println("---------------------------- Register Enemy ----------------------------");
        System.out.println("What is your name: ");
        this.name = reader.nextLine();
        System.out.println("What is your skin: ");
        this.skin = reader.nextLine();
        System.out.println("-------------------------------------------------------------------------");


    }

    public void showEnemy () {
        System.out.println("---------------- Enemy ----------------");
        System.out.println("Enemy name: " + this.name);
        System.out.println("Enemy skin: " + this.skin);
        System.out.println("Enemy HP: " + this.health);
        System.out.println("----------------------------------------");

    }
    public void reduceHealth (int enemyDamage) {
        health -= enemyDamage;

        if (health < 0) {
            health = 0;
        }
    }
}
