package com.company;
import java.util.*;

class Tour {
    String place,hotel,mode;
    int hotel_charge=0,ticket_cost=0;
    Scanner s=new Scanner(System.in);

    void show_places(){

        int sc1,sc2,sc;
        int nights;

        System.out.println("According  to your choices we will add the cost of your journey ");
        System.out.println("choose your favourite destination that you want to visit::");
        System.out.println(" 1 for Agra : costs Rs.230000");
        System.out.println(" 2 for Goa : costs Rs.600000");
        System.out.println(" 3 for Manali : costs Rs.450000");
        System.out.println(" 4 for Jaipur : costs Rs.380000");

        System.out.println("which place you want to visit::");
        sc1=s.nextInt();
        switch(sc1){
            case 1:{
                ticket_cost=ticket_cost+230000;
                place="Agra";
                System.out.println("In which hotel to want to stay::");
                System.out.println(" 1 for Hotel Taj Resorts : costs 100000");
                System.out.println(" 2 for ITC Mughal : costs 90000");
                System.out.println(" 3 for Crystal Sarovar premiere : costs 80000");
                System.out.println(" 4 for Radission Hotel Agra: costs 70000");
                System.out.println("which hotel you want to select::");
                sc2=s.nextInt();
                switch(sc2){
                    case 1:{
                        hotel_charge=hotel_charge+100000;
                        hotel="Hotel Taj Resorts";
                    }break;

                    case 2:{
                        hotel_charge=hotel_charge+90000;
                        hotel="ITC Mughal ";
                    }break;

                    case 3:{
                        hotel_charge=hotel_charge+80000;
                        hotel="Crystal Sarovar premiere";
                    }break;

                    case 4:{
                        hotel_charge=hotel_charge+70000;
                        hotel="Radission Hotel Agra";
                    }break;
                    default:
                        break;
                }
            }break;

            case 2:{
                ticket_cost=ticket_cost+600000;
                place="Goa";
                System.out.println("In which hotel tou want to stay::");
                System.out.println(" 1 for Resort Rio: costs 100000");
                System.out.println(" 2 for Goa Marriot Resort&Spa : costs 90000");
                System.out.println(" 3 for Caravela Beach Resort : costs 80000");
                System.out.println(" 4 for ITC Grand Goa: costs 70000");
                System.out.println("which hotel you want to select::");
                sc2=s.nextInt();

                switch(sc2){
                    case 1:{
                        hotel_charge=hotel_charge+100000;
                        hotel="Resort Rio";
                    }break;
                    case 2:{
                        hotel_charge=hotel_charge+90000;
                        hotel="Goa Marriot Resort&Spa";
                    }break;
                    case 3:{
                        hotel_charge=hotel_charge+80000;
                        hotel="Caravela Beach Resort";
                    }break;
                    case 4:{
                        hotel_charge=hotel_charge+70000;
                        hotel=" ITC Grand Goa";
                    }break;

                    default:
                        break;
                }
            }break;

            case 3:{
                ticket_cost=ticket_cost+450000;
                place="Manali";
                System.out.println("In which hotel  you want to stay::");
                System.out.println(" 1 for Sun Park Resort Manali: costs 100000");
                System.out.println(" 2 for Apple country Resort : costs 90000");
                System.out.println(" 3 for Orchards House : costs 80000");
                System.out.println(" 4 for Princess Villa: costs 70000");
                System.out.println("which hotel you want to select");
                sc2=s.nextInt();

                switch(sc2){
                    case 1:{
                        hotel_charge=hotel_charge+100000;
                        hotel="Sun Park Resort Manali";
                    }break;
                    case 2:{
                        hotel_charge=hotel_charge+90000;
                        hotel="Apple country Resort";
                    }break;
                    case 3:{
                        hotel_charge=hotel_charge+80000;
                        hotel="Orchards House";
                    }break;
                    case 4:{
                        hotel_charge=hotel_charge+70000;
                        hotel="Princess Villa";
                    }break;
                    default:
                        break;
                }
            }break;

            case 4:{
                ticket_cost=ticket_cost+380000;
                place="Jaipur";
                System.out.println("In which hotel tou want to stay::");
                System.out.println(" 1 for Royal Heritage Haveli : costs 100000");
                System.out.println(" 2 for The Lalit Jaipur: costs 90000");
                System.out.println(" 3 for Hilton Jaipur : costs 80000");
                System.out.println(" 4 for Golden Tulip Jaipur: costs 70000");
                System.out.println("which hotel you want to select::");
                sc2=s.nextInt();

                switch(sc2){
                    case 1:{
                        hotel_charge=hotel_charge+100000;
                        hotel="Royal Heritage Haveli";
                    }break;
                    case 2:{
                        hotel_charge=hotel_charge+90000;
                        hotel="The Lalit Jaipur";
                    }break;
                    case 3:{
                        hotel_charge=hotel_charge+80000;
                        hotel="Hilton Jaipur";
                    }break;
                    case 4:{
                        hotel_charge=hotel_charge+70000;
                        hotel="Golden Tulip Jaipur";
                    }break;
                    default:
                        break;
                }
            }break;

            default:
                break;
        }
        System.out.println(" please select the mode of Travelling");
        System.out.println(" 1 for Railway: costs Rs.5000");
        System.out.println(" 2 for Flight: costs Rs.4000");
        System.out.println(" 3 for Roadways: costs Rs.3000");
        System.out.println(" 4 for charter Plane: costs Rs.20000");
        sc=s.nextInt();
        switch(sc){
            case 1:{
                hotel_charge=hotel_charge+5000;
                mode="Railway";
            }break;
            case 2:{
                hotel_charge=hotel_charge+4000;
                mode="Flight";
            }break;
            case 3:{
                hotel_charge=hotel_charge+3000;
                mode="Roadways";
            }break;
            case 4:{
                hotel_charge=hotel_charge+20000;
                mode="charter plane";
            }break;

            default:
                break;
        }

        System.out.println("How many nights you want to stay");
        nights=s.nextInt();
        hotel_charge=hotel_charge*nights;
        System.out.println("ticketcost::"+ticket_cost);
        System.out.println("Hotelcharge::"+hotel_charge);


    }
    void show_detail(){
        System.out.println("Place:::"+place);
        System.out.println("Hotel:::"+hotel);
        System.out.println("Mode of travel:::"+mode);
        System.out.println("Total_Cost:::"+(hotel_charge+ticket_cost));

    }

}



abstract class LOGIN{
    String name="NULL",pass="NULL",email="NULL",username="NULL", adno;

    {
        adno = "NULL";
    }

    int cid;
    Tour[] tour =new Tour[10];
    Scanner s=new Scanner(System.in);
    void flogin(int cid){



        String usrname,usrpass;
        System.out.println("enter your user name: ");
        usrname=s.nextLine();
        System.out.println("enter your Password: ");
        usrpass=s.nextLine();



        if(Objects.equals(usrname, username) || Objects.equals(usrpass, pass)){
            System.out.println("inside checking");
            flogin(cid);
        }
        else{

            tour[cid]=new Tour();
            tour[cid].show_places();
            tour[cid].show_detail();
        }

    }
}

class SIGNIN extends LOGIN{
    void fsignin(int customerno){
        Scanner s=new Scanner(System.in);
        System.out.println("enter your User Name:: ");
        name=s.nextLine();
        System.out.println("enter your email:: ");
        email=s.nextLine();
        System.out.println("enter your Mobile no:: ");
        adno=s.nextLine();
        System.out.println("enter your address::");
        username=s.nextLine();
        System.out.println("enter your password:: ");
        pass=s.nextLine();
        cid=customerno;
    }
}

class Done{

    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        //LOGIN lg[]=new SIGNIN[10];
        SIGNIN[] sn =new SIGNIN[10];

        int sc1;
        int sc2;
        int customerno=0;
        for(int x=0;x<10;){
            System.out.println("************WELCOME TO TOUR AND TRAVEL MANAGEMENT SYSTEM**************");
            System.out.println("Press1: SIGNIN YOUR ACCOUNT::");
            System.out.println("press2: LOGIN YOUR ACCOUNT::");
            sc1=s.nextInt();
            switch (sc1) {
                case 1 -> {
                    sn[customerno] = new SIGNIN();
                    sn[customerno].fsignin(customerno);
                    System.out.println("enter username and password for login:");
                    sn[customerno].flogin(customerno);
                    System.out.println("in main");
                    customerno++;
                }
                case 2 -> {
                    sn[customerno] = new SIGNIN();
                    sn[customerno].flogin(customerno);
                    customerno++;
                }
            }
            System.out.println("press 1: for Main menu and press any key to exit");
            sc2=s.nextInt();
            if(sc2==1)
                x++;
            else
                x=20;

        }
    }
}

