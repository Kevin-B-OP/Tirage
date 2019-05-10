package com.opckev.Fonctionnement2;

import java.util.Scanner;

class RunProgram {

    static void homepage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que souhaitez vous faire maintenant ?");
        System.out.println("1 - Un tirage manuel");
        System.out.println("2 - Un tirage aléatoire");
        System.out.println("3 - Changer la liste des participants");
        System.out.println("4 - Arrêter l'application");
        int nbresponse;
        nbresponse = sc.nextInt();
        if (nbresponse == 1) {
            Participants test = new Participants();
            test.PartieDeux();
        } else if (nbresponse == 2) {
            Participants ras = new Participants();
            ras.PartieTrois();
        } else if (nbresponse == 3) {
            Participants loterie = new Participants();
            loterie.PartieUn();
        } else if (nbresponse == 4) {
            System.out.println("Au revoir");
        } else {
            System.out.println("Veuillez choisir un chiffre entre 1 et 4");
            homepage();
        }
    }
}