import java.util.Scanner;

public class Player {
    private  double name;
    private  int age;
    private String type;
    private double stat;
    private int totalwickets;
    private int totalballs;
    double battingAvg;
    double bowlingAvg;


    public Player(double name, int age, String  type, double stat) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.stat = stat;
    }

    void getType(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1 for batting,2 for bowling:");
        int num=input.nextInt();
        switch (num){
            case 1: {
                System.out.println("A batsman");
            }
            case 2:{
                System.out.println("A bowler");
            }
    }
}

    void calcAvg(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1 for batting,2 for bowling:");
        int num=input.nextInt();
        switch (num){
            case 1: {
                battingAvg=totalwickets / 15;
                System.out.println("batting average:"+ battingAvg);
            }
            case 2:{
                bowlingAvg=totalballs/15;
                System.out.println("bowling average:" + bowlingAvg );
            }


        }

    void viewPlayeyrDetails(){
            System.out.println("player name:"+name);
            System.out.println("player age:"+age);
            System.out.println("player type:"+type);

        }

    void getDetails(){
            System.out.println("enter name:");
            String name=input.nextLine();
            System.out.println("enter age:");
            int age=input.nextInt();
            System.out.println("enter type:");
            String type=input.nextLine();
            System.out.println("enter total wickets:");
            int totalwickets=input.nextInt();
            System.out.println("enter total runs:");
            int totalballs=input.nextInt();

        }
        void getBestPerformance() {
            //Scanner sc = new Scanner(System.in);
            //System.out.println("enter 1 for batting,2 for bowling:");
            //int Num = sc.nextInt();
            getType();
            switch (num) {
                case 1: {
                    if (p1.battingAvg > p2.battingAvg) {
                        System.out.println("player with best batting performance is p1");
                    } else {
                        System.out.println("player with best batting performance is p2");
                    }
                }
                case 2: {
                    if (p1.bowlingAvg > p2.bowlingAvg) {
                        System.out.println("player with best bowling performance is p1");
                    } else {
                        System.out.println("player with best bowling performance is p2");
                    }
                }

            }
        }

    void getOtherData(){

        }

        }
}
