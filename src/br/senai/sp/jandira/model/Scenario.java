package br.senai.sp.jandira.model;

public class Scenario {

    public String Scenario (int scenarioOption) {

        String scenario = "Senai Jandira";

        switch (scenarioOption) {
            case 1:
                scenario = "Forest";
                break;

            case 2:
                scenario = "Cave";
                break;

            case 3:
                scenario = "Desert";
                break;
        }

        return scenario;
    }


}
