package com.opckev.Fonctionnement1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Nbdepersonne {
    private Scanner sc = new Scanner(System.in);
    void PartieUn () {
        // Choix du nombre de personne
        System.out.println("Combien de participants êtes vous ?");
        int people = -1;
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
        String[] tableau = new String[people];
        // Boucle pour donner un nom à chaque participant
        for (int i = 0; i < people; i++) {
            int nb = i + 1;
            System.out.println("Veuillez donner le nom du participant " + nb);
            String name = sc.next();
            tableau[i] = name;
        }
            homepage();
            int nbresponse;
            nbresponse = sc.nextInt();
            if (nbresponse == 1) {
                // Tirage manuel avec une vérification de chiffre
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
                System.out.println("La personne que vous avez choisie est " + tableau[choix - 1]);
                homepage();
            } else if (nbresponse == 2) {
                // Tirage aléatoire
                int lower = 0;
                int random = (int) (Math.random() * (people - lower)) + lower;
                System.out.println("Le gagnant aléatoire est " + tableau[random]);
                homepage();
            } else {
                System.out.println("Au revoir");
            }
        }
    private void homepage () {
        System.out.println("Que souhaitez vous faire maintenant ?");
        System.out.println("1 - Un tirage manuel");
        System.out.println("2 - Un tirage aléatoire");
        System.out.println("3 - Arrêter l'application");

    }
}

