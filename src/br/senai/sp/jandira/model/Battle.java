package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Battle {

    Scanner reader = new Scanner(System.in);

    String battleScenario;

    Scenario scenario = new Scenario();

    public void battle (Player player, Enemy enemy) {
        boolean end = false;
        while (!end) {

            int playerHealth = player.getHealth();
            int enemyHealth = enemy.getHealth();


            System.out.println("------------------ BATTLE ------------------");
            System.out.println("Player Attack [ A ] " + player.getName() + " HP: " + player.getHealth());
            System.out.println("Player Defense [ 1 ] " + player.getName() + " HP: " + player.getHealth());
            System.out.println("--------------------------------------------");
            System.out.println("Enemy Attack [ B ] " + enemy.getName() + " HP: " + enemy.getHealth());
            System.out.println("Enemy Defense [ 2 ] " + enemy.getName() + " HP: " + enemy.getHealth());
            System.out.println("--------------------------------------------");

            String attack = reader.nextLine();

            if (attack.equalsIgnoreCase("A")) {
                System.out.println("----------------------------------------------");
                System.out.println("--------------- Player Attacked --------------");
                System.out.println("----------------------------------------------");

                int playerDamage = (int) (Math.random() + 20) + 1;
                enemy.reduceHealth(playerDamage);

                System.out.println("----------------------------------------------");
                System.out.println("O ataque foi de: " + playerDamage);
                System.out.println("----------------------------------------------");

            } else if (attack == "1") {
                System.out.println("----------------------------------------------");
                System.out.println("--------------- Player Blocked --------------");
                System.out.println("----------------------------------------------");

                int enemyDamage = (int) (Math.random() + 0);
                enemy.reduceHealth(enemyDamage);

                System.out.println("----------------------------------------------");
                System.out.println("A defesa foi de: " + enemyDamage);
                System.out.println("----------------------------------------------");

            } else if (attack.equalsIgnoreCase("B")) {
                System.out.println("----------------------------------------------");
                System.out.println("--------------- Enemy Attacked --------------");
                System.out.println("----------------------------------------------");

                int enemyDamage = (int) (Math.random() + 20) - 10;
                enemy.reduceHealth(enemyDamage);

                System.out.println("----------------------------------------------");
                System.out.println("O ataque foi de: " + enemyDamage);
                System.out.println("----------------------------------------------");

            } else if (attack == "2") {
                System.out.println("----------------------------------------------");
                System.out.println("--------------- Enemy Blocked --------------");
                System.out.println("----------------------------------------------");

                int playerDamage = (int) (Math.random() + 20) - 10;
                enemy.reduceHealth(playerDamage);

                System.out.println("----------------------------------------------");
                System.out.println("A defesa foi de: " + playerDamage);
                System.out.println("----------------------------------------------");
            } else {
                System.out.println();
            }
            if (playerHealth == 0) {
                System.out.println("O inimigo " + enemy.getName() + " venceu!");
                end = true;

            } else if (enemyHealth == 0) {
                System.out.println("O jogador " + player.getName() + " venceu!");
                end = true;

            }

        }

    }
    public void scenarioChoice () {
        System.out.println("----------------------------------------------");
        System.out.println("Choose a Scenario: (1 - Forest) (2 - Cave) (3 - Desert) (Default - Senai Jandira");
        System.out.println("----------------------------------------------");

        int scenarioPlayerChoice = reader.nextInt();
        battleScenario = scenario.Scenario(scenarioPlayerChoice);
        System.out.println(battleScenario);
    }


}
