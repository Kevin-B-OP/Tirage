package com.opckev.Fonctionnement2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manuel {

    public void Manual(int people, String []tableau) {

        Scanner sc = new Scanner(System.in);
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
        RunProgram.homepage();
    }
}