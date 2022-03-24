package Dota2Game.src;

import java.util.*;

public class Dota2App {
    public static void main (String[] args){
        boolean GG = false;
        char turn;
        Scanner reader = new Scanner(System.in);
        Set <Integer> checkDuplicate= new HashSet<>();
        ArrayList <Hero> teamA = new ArrayList<>();
        ArrayList <Hero> teamB = new ArrayList<>();
        int userinput=0,userinput2=0,userinput3 = 0,userinput4 = 0,userinput5 = 0,userinput6 = 0;
        //this line to line 45 is for user to choose the heroes
        while(checkDuplicate.size()!=6) {
            System.out.println("PlayerA, choose 3 heroes (1-10) *no duplicates*");
            userinput = reader.nextInt();
            userinput2 = reader.nextInt();
            userinput3 = reader.nextInt();
            System.out.println("PlayerB, choose 3 heroes (1-10) *no duplicates*");
            userinput4 = reader.nextInt();
            userinput5 = reader.nextInt();
            userinput6 = reader.nextInt();
            checkDuplicate.add(userinput);
            checkDuplicate.add(userinput2);
            checkDuplicate.add(userinput3);
            checkDuplicate.add(userinput4);
            checkDuplicate.add(userinput5);
            checkDuplicate.add(userinput6);
            if(checkDuplicate.size()!=6){
                System.out.println("Duplicates detected, enter again");
                checkDuplicate.clear();
            }
        }
        Hero P1_hero1 = new Hero(userinput);
        Hero P1_hero2 = new Hero(userinput2);
        Hero P1_hero3 = new Hero(userinput3);
        teamA.add(P1_hero1);
        teamA.add(P1_hero2);
        teamA.add(P1_hero3);

        Hero P2_hero1 = new Hero(userinput4);
        Hero P2_hero2 = new Hero(userinput5);
        Hero P2_hero3 = new Hero(userinput6);
        teamB.add(P2_hero1);
        teamB.add(P2_hero2);
        teamB.add(P2_hero3);

//        **THIS IS THE MAKEUP DATA**
//        Hero P1_hero1 = new Hero(1);
//        Hero P1_hero2 = new Hero(2);
//        Hero P1_hero3 = new Hero(3);
//        teamA.add(P1_hero1);
//        teamA.add(P1_hero2);
//        teamA.add(P1_hero3);
//        Hero P2_hero1 = new Hero(4);
//        Hero P2_hero2 = new Hero(5);
//        Hero P2_hero3 = new Hero(6);
//        teamB.add(P2_hero1);
//        teamB.add(P2_hero2);
//        teamB.add(P2_hero3);



        Random rn = new Random();
        int randomnum = rn.nextInt()%2;
        if(randomnum==0){
            turn = 'A';
        }else{
            turn = 'B';
        }
        while (GG!=true){
            System.out.println("------------------------------------------------------------------------------");
            printGame(teamA,teamB);
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("The command format is: Hero number, Action, Hero number");
            System.out.println("Player "+turn+", What is your move?:");
            int chosen_hero = reader.nextInt();
            char chosen_action = reader.next().charAt(0);
            int chosen_target = reader.nextInt();
            if(turn =='A'){
                switch (chosen_hero) {
                    case 1 -> {
                        if(P1_hero1.isAlive()){
                            switch (chosen_action) {
                                case 'A' -> { //normal attack
                                    P1_hero1.attack();
                                    switch (chosen_target) {
                                        case 1 -> P2_hero1.getAttackedBy(P1_hero1);
                                        case 2 -> P2_hero2.getAttackedBy(P1_hero1);
                                        case 3 -> P2_hero3.getAttackedBy(P1_hero1);
                                        default -> System.out.println("Not recognised");
                                    }
                                }
                                case 'U' -> { //ultimate
                                    P1_hero1.ultimate();
                                    switch (chosen_target) {
                                        case 1 -> P2_hero1.ultimatedby(P1_hero1);
                                        case 2 -> P2_hero2.ultimatedby(P1_hero1);
                                        case 3 -> P2_hero3.ultimatedby(P1_hero1);
                                        default -> System.out.println("Not recognised");
                                    }
                                }
                                default -> System.out.println("Not recognised");
                            }
                            turn = 'B';
                        }else{
                            System.out.println("The chosen hero is ded lmao :3 skipping turn..");
                            turn = 'B';
                        }
                    }
                    case 2 -> {
                        if(P1_hero2.isAlive()){
                            switch (chosen_action) {
                                case 'A' -> {
                                    P1_hero2.attack();
                                    switch (chosen_target) {
                                        case 1 -> P2_hero1.getAttackedBy(P1_hero2);
                                        case 2 -> P2_hero2.getAttackedBy(P1_hero2);
                                        case 3 -> P2_hero3.getAttackedBy(P1_hero2);
                                        default -> System.out.println("Not recognised");
                                    }
                                }
                                case 'U' -> {
                                    P1_hero2.ultimate();
                                    switch (chosen_target) {
                                        case 1 -> P2_hero1.ultimatedby(P1_hero2);
                                        case 2 -> P2_hero2.ultimatedby(P1_hero2);
                                        case 3 -> P2_hero3.ultimatedby(P1_hero2);
                                        default -> System.out.println("Not recognised");
                                    }
                                }
                                default -> System.out.println("Not recognised");
                            }
                            turn = 'B';
                        }else{
                            System.out.println("The chosen hero is ded lmao :3 skipping turn..");
                            turn = 'B';
                        }
                    }
                    case 3 -> {
                        if(P1_hero3.isAlive()){
                            switch (chosen_action) {
                                case 'A' -> {
                                    P1_hero3.attack();
                                    switch (chosen_target) {
                                        case 1 -> P2_hero1.getAttackedBy(P1_hero3);
                                        case 2 -> P2_hero2.getAttackedBy(P1_hero3);
                                        case 3 -> P2_hero3.getAttackedBy(P1_hero3);
                                        default -> System.out.println("Not recognised");
                                    }
                                }
                                case 'U' -> {
                                    P1_hero3.ultimate();
                                    switch (chosen_target) {
                                        case 1 -> P2_hero1.ultimatedby(P1_hero3);
                                        case 2 -> P2_hero2.ultimatedby(P1_hero3);
                                        case 3 -> P2_hero3.ultimatedby(P1_hero3);
                                        default -> System.out.println("Not recognised");
                                    }
                                }
                                default -> System.out.println("Not recognised");
                            }
                            turn = 'B';
                        }else{
                            System.out.println("The chosen hero is ded lmao :3 skipping turn..");
                            turn = 'B';
                        }
                    }
                    default -> System.out.println("Not recognised");
                }
            }
            else{ // turn B
                switch (chosen_hero) {
                    case 1 -> {
                        if(P2_hero1.isAlive()){
                            switch (chosen_action) {
                                case 'A' -> {
                                    P2_hero1.attack();
                                    switch (chosen_target) {
                                        case 1 -> P1_hero1.getAttackedBy(P2_hero1);
                                        case 2 -> P1_hero2.getAttackedBy(P2_hero1);
                                        case 3 -> P1_hero3.getAttackedBy(P2_hero1);
                                        default -> System.out.println("Not recognised");
                                    }
                                }
                                case 'U' -> {
                                    P2_hero1.ultimate();
                                    switch (chosen_target) {
                                        case 1 -> P1_hero1.ultimatedby(P2_hero1);
                                        case 2 -> P1_hero2.ultimatedby(P2_hero1);
                                        case 3 -> P1_hero3.ultimatedby(P2_hero1);
                                        default -> System.out.println("Not recognised");
                                    }
                                }
                                default -> System.out.println("Not recognised");
                            }
                            turn = 'A';
                        }else{
                            System.out.println("The chosen hero is ded lmao :3 skipping turn..");
                            turn = 'A';
                        }

                    }
                    case 2 -> {
                        if(P2_hero2.isAlive()){
                            switch (chosen_action) {
                                case 'A' -> {
                                    P2_hero2.attack();
                                    switch (chosen_target) {
                                        case 1 -> P1_hero1.getAttackedBy(P2_hero2);
                                        case 2 -> P1_hero2.getAttackedBy(P2_hero2);
                                        case 3 -> P1_hero3.getAttackedBy(P2_hero2);
                                        default -> System.out.println("Not recognised");
                                    }
                                }
                                case 'U' -> {
                                    P2_hero2.ultimate();
                                    switch (chosen_target) {
                                        case 1 -> P1_hero1.ultimatedby(P2_hero2);
                                        case 2 -> P1_hero2.ultimatedby(P2_hero2);
                                        case 3 -> P1_hero3.ultimatedby(P2_hero2);
                                        default -> System.out.println("Not recognised");
                                    }
                                }
                                default -> System.out.println("Not recognised");
                            }
                            turn = 'A';
                        }else{
                            System.out.println("The chosen hero is ded lmao :3 skipping turn..");
                            turn = 'A';
                        }

                    }
                    case 3 -> {
                        if(P2_hero3.isAlive()){
                            switch (chosen_action) {
                                case 'A' -> {
                                    P2_hero3.attack();
                                    switch (chosen_target) {
                                        case 1 -> P1_hero1.getAttackedBy(P2_hero3);
                                        case 2 -> P1_hero2.getAttackedBy(P2_hero3);
                                        case 3 -> P1_hero3.getAttackedBy(P2_hero3);
                                        default -> System.out.println("Not recognised");
                                    }
                                }
                                case 'U' -> {
                                    P2_hero3.ultimate();
                                    switch (chosen_target) {
                                        case 1 -> P1_hero1.ultimatedby(P2_hero3);
                                        case 2 -> P1_hero2.ultimatedby(P2_hero3);
                                        case 3 -> P1_hero3.ultimatedby(P2_hero3);
                                        default -> System.out.println("Not recognised");
                                    }
                                }
                                default -> System.out.println("Not recognised");
                            }
                            turn = 'A';
                        }else{
                            System.out.println("The chosen hero is ded lmao :3 skipping turn..");
                            turn = 'A';
                        }

                    }
                    default -> System.out.println("Not recognised");
                }

            }


            if(alldead(teamA)){
                System.out.println("PlayerB has won this game :)))");
                GG = true;
            }else if(alldead(teamB)){
                System.out.println("PlayerA has won this game :3333");
                GG = true;
            }else{
                GG = false;
            }
        }


    }

    public static void printGame(ArrayList<Hero>teamA,ArrayList<Hero>teamB){
        int counter =1;
        System.out.println("PlayerA\t\t\t\t\t\t\t\t\t PlayerB");
        System.out.printf("%-5s %5s %5s %5s\t\t\t\t\t%-5s %5s %5s %5s \n","Name","Dmg","HP","MP"," Name","Dmg","HP","MP");
        for(int i=0;i<3;i++){
            System.out.printf("%d.%-5s %5s %5s %5s\t\t\t\t %d.%-5s %5s %5s %5s \n",counter,teamA.get(i).getHeroname(),(int)teamA.get(i).getAttackDamage(),(int)teamA.get(i).getCurrentHP(),(int)teamA.get(i).getCurrentMP(),counter
                    ,teamB.get(i).getHeroname(),(int)teamB.get(i).getAttackDamage(),(int)teamB.get(i).getCurrentHP(),(int)teamB.get(i).getCurrentMP());
            counter++;
        }

    }

    public static boolean alldead (ArrayList<Hero>team){
        int counter =0;
        for(Hero hero:team){
            if(!hero.isAlive()){
                counter++;  // +1 for every single death
            }
        }
        if (counter ==3){ // +3 means every hero died
            return true;
        }else{
            return false;
        }
    }


}
