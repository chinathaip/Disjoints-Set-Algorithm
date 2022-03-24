package Dota2Game.src;

public class Hero {
    //missing current HP, current Mana
    String Heroname,AttackMsg;
    float HP,currentHP,MP,currentMP,AttackDamage,Armor,UltimateCost,UltimateDamge;


    //constructor
    public Hero (int Heronum){
        switch(Heronum){
            case 1: //axe
                Heroname="Axe";
                AttackMsg="Axe hits...";
                HP = 1000;
                currentHP =HP;
                MP = 600;
                currentMP = MP;
                AttackDamage = 55;
                Armor = 2;
                UltimateCost = 200;
                UltimateDamge = 300;
                break;
            case 2: //slark
                Heroname="Slark";
                AttackMsg="zeeeeeee Slarked!";
                HP = 800;
                MP = 650;
                currentHP =HP;
                currentMP = MP;
                AttackDamage = 68;
                Armor = -1;
                UltimateCost = 300;
                UltimateDamge = 400;
                break;
            case 3: //Lion
                Heroname="Lion";
                AttackMsg="Lion Roaring...";
                HP = 1200 ;
                MP = 400;
                currentHP =HP;
                currentMP = MP;
                AttackDamage = 70;
                Armor = -2;
                UltimateCost = 300;
                UltimateDamge = 500;
                break;
            case 4: //LifeStealer
                Heroname="LifeStealer";
                AttackMsg="LS Tagh tagh!";
                HP = 1100 ;
                MP = 300;
                currentHP =HP;
                currentMP = MP;
                AttackDamage = 50;
                Armor = 3;
                UltimateCost = 100;
                UltimateDamge = 300;
                break;
            case 5: //Beastmaster
                Heroname = "Beastmaster";
                AttackMsg = "Beatmaster shooooweah";
                HP = 800 ;
                MP = 600;
                currentHP =HP;
                currentMP = MP;
                AttackDamage = 60;
                Armor = 0;
                UltimateCost = 200;
                UltimateDamge = 300;
                break;
            case 6: //Bristleback
                Heroname = "Bristleback";
                AttackMsg = "BB is coming...";
                HP = 1300 ;
                MP = 200;
                currentHP =HP;
                currentMP = MP;
                AttackDamage = 48;
                Armor = 4;
                UltimateCost = 150;
                UltimateDamge = 800;
                break;
            case 7: //Tiny
                Heroname = "Tiny";
                AttackMsg = "Tiny punch!";
                HP = 1100 ;
                MP = 400;
                currentHP =HP;
                currentMP = MP;
                AttackDamage = 55;
                Armor = 4;
                UltimateCost = 130;
                UltimateDamge = 300;
                break;
            case 8: //Phoenix
                Heroname = "Phoenix";
                AttackMsg = "Hoooooooooowa Phoenix";
                HP = 800 ;
                MP = 800;
                currentHP =HP;
                currentMP = MP;
                AttackDamage = 75;
                Armor = 0;
                UltimateCost = 250;
                UltimateDamge = 350;
                break;
            case 9: //Medusa
                Heroname = "Medusa";
                AttackMsg = "Die by Medusa!";
                HP = 1000 ;
                MP = 700;
                currentHP =HP;
                currentMP = MP;
                AttackDamage = 50;
                Armor = 1;
                UltimateCost = 350;
                UltimateDamge = 400;
                break;
            case 10: //Mirana
                Heroname = "Mirana";
                AttackMsg = "Mirana! Get my mighty arrow.";
                HP = 900 ;
                MP = 800;
                currentHP =HP;
                currentMP = MP;
                AttackDamage = 55;
                Armor = 1;
                UltimateCost = 270;
                UltimateDamge = 320;
                break;
            default:
                Heroname ="XD";
        }

    }

    public String getHeroname(){
        return Heroname;
    }

    public String getAttackMsg(){
        return AttackMsg;
    }
    public float getHP(){
        return HP;
    }
    public float getCurrentHP(){
        return currentHP;
    }
    public float getCurrentMP(){
        return currentMP;
    }
    public float getMP() {
        return MP;
    }
    public float getAttackDamage() {
        return AttackDamage;
    }
    public float getArmor() {
        return Armor;
    }
    public float getUltimateCost() {
        return UltimateCost;
    }
    public float getUltimateDamge() {
        return UltimateDamge;
    }

    void attack(){
        System.out.println(AttackMsg);
    }

    void ultimate(){
        if(currentMP>=UltimateCost){
            System.out.println("Ulti ! "+AttackMsg);

        }else{
            System.out.println("Nub, no mana ecksdee :3 skipping turn...");
        }

    }

    void ultimatedby(Hero hero){
        if (hero.currentMP>= hero.UltimateCost){
            hero.currentMP = hero.currentMP - hero.UltimateCost;
            this.currentHP = currentHP - ((hero.getUltimateDamge()*5)/(this.Armor+3));
            if(!this.isAlive()){
                hero.addmana();
            }
        }else{
            System.out.print("");
        }

    }

    void getAttackedBy (Hero hero){
        this.currentHP = currentHP - ((hero.getAttackDamage()*5) / (this.Armor+3));
        if(!this.isAlive()){
            hero.addmana();
        }
    }

    boolean isAlive(){
        if (currentHP>0){
            return true;
        }else{
            return false;
        }
    }

    void addmana (){
        currentMP += 200;
    }

}
