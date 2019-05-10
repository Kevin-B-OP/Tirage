package com.opckev.Fonctionnement2;

import java.util.InputMismatchException;
import java.util.Scanner;

class Participants {
    private Scanner sc = new Scanner(System.in);
    private int people;
    private String []tableau;


    void PartieUn() {
        // Choix du nombre de personne
        System.out.println("Combien de participants êtes vous ?");
        // Permet de catcher une erreur si jamais la personne rentre une lettre
        boolean responseIsGood;
        do {
            try {
                people = sc.nextInt();
                responseIsGood = true;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Vous devez saisir un nombre, correspondant au nombre de partcipants souhaités");
                responseIsGood = false;
            }
        }
        while (!responseIsGood);
        tableau = new String[people];
        // Boucle pour donner un nom à chaque participant
        for (int i = 0; i < people; i++) {
            int nb = i + 1;
            System.out.println("Veuillez donner le nom du participant " + nb);
            String name = sc.next();
            tableau[i] = name;
        }
        RunProgram.homepage();
    }

    private String[] getTableau() {
        return tableau;
    }

    private int getPeople() {
        return people;
    }
    void PartieDeux (){
        getTableau();
        getPeople();
        System.out.println("Veuillez choisir un chiffre entre 1 et " + people);
        int choix = -1;
        boolean response;
        do {
            try {
                choix = sc.nextInt();
                response = true;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Vous devez saisir un nombre, correspondant au nombre de partcipants souhaités");
                response = false;
            }
        }
        while (!response);
        System.out.println("La personne que vous avez choisie est " + getTableau()[choix - 1]);
        RunProgram.homepage();
    }
    void PartieTrois(){
        int lower = 0;
        int random = (int) (Math.random() * (people - lower)) + lower;
        System.out.println("Le gagnant aléatoire est " + tableau[random]);
    }
}
