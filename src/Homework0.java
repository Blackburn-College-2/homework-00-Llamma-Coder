/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jason.hendricks
 */
public class Homework0 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        /*This generates a sudo random number */
        Scanner scan = new Scanner(System.in);
        boolean endgame = false;
        int numChosen = rand.nextInt(3);

        String[] food = new String[3];
        food[0] = "Shrimp";
        food[1] = "Tacos";
        food[2] = "Sushi";

        String[] answerForUser = new String[3];
        int shrimp = 0;
        int tacos = 0;
        int sushi = 0;
        String foodChosen = food[numChosen];
//        System.out.println(foodChosen);
        List<String> inputedUserAnswers = new ArrayList<>();
//hihyihi
        System.out.println("The secret meal MUST be one of the following:\nShrimp\nTacos\nSushi");

        while (!endgame) {
            int round = 1;
            System.out.print("Guess the secret meal:");

            String userInput = scan.nextLine();

//            if (round > 1) {
//                inputedUserAnswers.add(userInput);
//
//            }
//          int size = inputedUserAnswers.size();
            if (userInput.toLowerCase().equals(food[0].toLowerCase()) || userInput.toLowerCase().equals(food[1].toLowerCase()) || userInput.toLowerCase().equals(food[2].toLowerCase())) {

                if (userInput.toLowerCase().equals(foodChosen.toLowerCase())) {
                    System.out.println("You win Good Job");
                    endgame = true;

                } else {
                    if (userInput.toLowerCase().equals(food[0].toLowerCase())) {
                        if (shrimp > 0) {
                            System.out.println("You have already geussed that");
                            endgame = true;
                        } else {
                            shrimp++;
                        }
                    } else if (userInput.toLowerCase().equals(food[1].toLowerCase())) {
                        if (tacos > 0) {
                            System.out.println("You have already geussed that");
                            endgame = true;
                        } else {
                            tacos++;
                        }
                    } else if (userInput.toLowerCase().equals(food[2].toLowerCase())) {
                        if (sushi > 0) {
                            System.out.println("You have already geussed that");
                            endgame = true;
                        } else {
                            sushi++;
                        }
                    }
                    System.out.println("Wrong Answer");

                }

            } else {
                System.out.println("Wrong that isn't even one of the answers.");

            }

        }
    }

//    public static boolean isRepeated(String usersAnswer, List previousAnswer, int size) {
//
//        boolean thing = true;
//        for (int i = 0; i < size; i++) {
//            if (!previousAnswer.toString().contains(usersAnswer.toLowerCase())) {
//                thing = true;
//
//            } else {
//                thing = false;
//                break;
//            }
//        }
//        return thing;
//    }
}
