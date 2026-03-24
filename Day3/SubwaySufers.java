import java.util.*;

class SubwaySurfers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        boolean game = true;

        System.out.println("Game Started!");
        System.out.println("Controls:\n r=right\n l=left\n u=jump\n d=slide\n x=exit");

        while(game){
            int obstacle = rand.nextInt(3); 
            // 0 = train (jump)
            // 1 = barrier (slide)
            // 2 = clear

            System.out.println("\nEnter move: ");
            char ch = sc.next().charAt(0);

            if(ch == 'x'){
                System.out.println("You exited the game");
                break;
            }

            switch(ch){
                case 'u':
                    if(obstacle == 0){
                        System.out.println("Jumped over train!");
                        score++;
                    } else {
                        System.out.println("Wrong move! You crashed.");
                        game = false;
                    }
                    break;

                case 'd':
                    if(obstacle == 1){
                        System.out.println("Slid under barrier!");
                        score++;
                    } else {
                        System.out.println("Wrong move! You crashed.");
                        game = false;
                    }
                    break;
                case 'r':
                    System.out.println("Moved Right safely");
                    score++;
                    break;

                case 'l':
                    System.out.println("Moved Left safely");
                    score++;
                    break;

                default:
                        System.out.println("Out. Exiting game...");
                        game = false;
            }

            System.out.println("Score: " + score);
        }

        System.out.println("Game Over! Final Score: " + score);
    }
}