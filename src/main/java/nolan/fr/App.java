package nolan.fr;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        double cafeCreme = 1;
        double piece1Centimes = 0.1;
        double piece5Centimes = 0.5;
        double piece10Centimes = 0.10;
        double piece20Centimes = 0.20;
        double piece50Centimes = 0.50;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Combien de pièces de 1 centimes possédez vous");
        int nombrePiece1Centimes = clavier.nextInt();
        System.out.println("Combien de pièces de 5 centimes possédez vous");
        int nombrePiece5Centimes = clavier.nextInt();
        System.out.println("Combien de pièces de 10 centimes possédez vous");
        int nombrePiece10Centimes = clavier.nextInt();
        System.out.println("Combien de pièces de 20 centimes possédez vous");
        int nombrePiece20Centimes = clavier.nextInt();
        System.out.println("Combien de pièces de 50 centimes possédez vous");
        int nombrePiece50Centimes = clavier.nextInt();
        double totalPiece1cts = piece1Centimes * nombrePiece1Centimes;
        double totalPiece5cts = piece5Centimes * nombrePiece5Centimes;
        double totalPiece10cts = piece10Centimes * nombrePiece10Centimes;
        double totalPiece20cts = piece20Centimes * nombrePiece20Centimes;
        double totalPiece50cts = piece50Centimes * nombrePiece50Centimes;
        double argentTotal = totalPiece1cts + totalPiece5cts + totalPiece10cts + totalPiece20cts + totalPiece50cts ;
        if(argentTotal<cafeCreme)
        {
            double argentManquant = cafeCreme - argentTotal ;
            System.out.println("Il vous manque" + argentManquant + "centimes pour prendre votre café crème !" );
        }
        else if(argentTotal>cafeCreme)
        {
            double argentEnTrop = argentTotal - cafeCreme ;
            System.out.println("Il vous restera " + argentEnTrop + "centimes après avoir pris votre café crème !");
        }
        else
        {
            System.out.println("Vous avez exactement de quoi vous payer le café crème !");
        }
        
    }
    
}
