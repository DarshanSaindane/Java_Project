import java.util.Scanner;
class Guesser{
    int GuesserNum;
    public int GuesserNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guesser kindly guess the number: ");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}

class Player{
    int PlayerNum;
    public int PlayerNum() {
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }
}

class umpire{
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;

    public void CollectNumFromGuesser() {
        Guesser Gu = new Guesser();
        Guessernum = Gu.GuesserNum();
    }

    public void CollectNumFromPlayer() {
        System.out.print("Player1 kindly guess the number: ");
        Player P1 = new Player();
        Playernum1 = P1.PlayerNum();

        System.out.print("Player2 kindly guess the number: ");
        Player P2 = new Player();
        Playernum2 = P2.PlayerNum();
         
        System.out.print("Player3 kindly guess the number: ");
        Player P3 = new Player();
        Playernum3 = P3.PlayerNum();

        
        
        
    }

    public void Compare() {

        if(Guessernum==Playernum1){
            if(Guessernum==Playernum2 && Guessernum == Playernum3) {
                System.out.println("All Players Won The Gane");
            }

            else if(Guessernum==Playernum2) {
                System.out.println("Player1 and Player2 won the game");
            }
            else if(Guessernum==Playernum3){
                System.out.println("Player1 and Player3 won the game");
            }
            else{
                System.out.println("Only player1 won the game");
            }
        }

        else if(Guessernum==Playernum2){
            if(Guessernum==Playernum3){
                System.out.println("Player2 and Player3 won the game");
            }
            else{
                System.out.println("Player 2 won the game");
            }
        }
        else if(Guessernum==Playernum3){
            System.out.println("Player3 won the game");
        }
        else{
            System.out.println("All player loos the game");
        }
    }
}




public class GuesserGame{
    public static void main(String[] args){
        System.out.println("-----Game Started-----");
        umpire UM = new umpire();
        UM.CollectNumFromGuesser();
        UM.CollectNumFromPlayer();
        UM.Compare();
        System.out.println("-----Game Over-----");
    }
}