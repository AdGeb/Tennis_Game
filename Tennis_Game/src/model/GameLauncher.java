package model;

import java.util.Scanner;

public class GameLauncher {
    private static Server server = new Server();
    private static Receiver receiver = new Receiver();
    private static int winner;

    public static void startTheGame(){
        int choice;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Server = 1");
            System.out.println("Receiver = 2");
            System.out.println("Please enter the player that wins the point: ");
            choice = sc.nextInt();
            winner = 0;
            switch (choice) {
                case 1:
                    //case when server's points are 40 and receiver's points are <=30
                    if(server.getServerPoints().getValue().equals("40") && !receiver.getReceiverPoints().getValue().equals("A") && !receiver.getReceiverPoints().getValue().equals("40")){
                        winner = 1;
                    }
                    //case when server has A advantage
                    else if(server.getServerPoints().getValue().equals("A")){
                        winner = 1;
                    }
                    //case when opponent has advantage and server's score is 40
                    else if (receiver.getReceiverPoints().getValue().equals("A")){
                        receiver.removeAdvantage();
                    }else {
                        //add points and sout if none statement is true
                        server.addPoints();
                    }
                    if(winner == 0) {
                        System.out.println("\t\tSCORE");
                        System.out.println(server.getServerPoints().getValue() + ":" + receiver.getReceiverPoints().getValue());
                    }
                    break;

                case 2:
                    //case when receiver's points are 40 and server's points are <=30
                    if(receiver.getReceiverPoints().getValue().equals("40") && !server.getServerPoints().getValue().equals("A") && !server.getServerPoints().getValue().equals("40")){
                        winner = 2;
                    }
                    //case when receiver has A advantage
                    else if(receiver.getReceiverPoints().getValue().equals("A")){
                        winner = 2;
                    }
                    //case when opponent has advantage and receiver's score is 40
                    else if (server.getServerPoints().getValue().equals("A")){
                        server.removeAdvantage();
                    }
                        else {
                        //add points and sout if none statement is true
                        receiver.addPoints();
                    }
                    if(winner == 0) {
                        System.out.println("\t\tSCORE");
                        System.out.println(server.getServerPoints().getValue() + ":" + receiver.getReceiverPoints().getValue());
                    }
                    break;
                default:
                    System.out.println("Server = 1");
                    System.out.println("Receiver = 2");
                    System.out.println("Please enter the player that wins the point: ");
                    choice = sc.nextInt();
            }

        }while (winner == 0);
        if(winner == 1){
            System.out.println("Server wins!");
        }else System.out.println("Receiver wins!");
    }
}
