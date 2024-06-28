package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Battle;
import br.senai.sp.jandira.model.Enemy;
import br.senai.sp.jandira.model.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Player player = new Player();
        Enemy enemy = new Enemy();

        boolean exit = false;

        while (!exit) {
            System.out.println("------------- MENU -------------");
            System.out.println("Choose an option: ");
            System.out.println("1 - Register a new Player");
            System.out.println("2 - Register a new Enemy");
            System.out.println("3 - Player information");
            System.out.println("4 - Enemy information");
            System.out.println("5 - New battle");
            System.out.println("6 - Quit");
            System.out.println("---------------------------------");

            int userOption = reader.nextInt();

            switch (userOption) {
                case 1:
                    player.registerPlayer();
                    break;

                case 2:
                    enemy.registerEnemy();
                    break;

                case 3:
                    player.showPlayer();
                    break;

                case 4:
                    enemy.showEnemy();
                    break;

                case 5:
                    Battle battle = new Battle();
                    battle.scenarioChoice();
                    battle.battle(player, enemy);
                    player.setHealth(100);
                    enemy.setHealth(100);
                    break;

                case 6:
                    exit = true;
                    break;
            }


        }

    }

}
