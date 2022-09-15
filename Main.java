package lessons.lesson13_2;


public class Main {
    public static void main(String[] args) {


        System.out.println("\nThe game is being started. Enter 7 numbers from 0 - 9: ");

        UserInput user1 = new UserInput();
        user1.enterNumber();
        System.out.println("\nYour numbers: \n" + user1.getUserNumbers());


        System.out.println("\nLottery numbers: ");

        LotteryNumbers game1 = new LotteryNumbers();
        game1.generateLotteryNumber();
        System.out.println(game1.getHappyNumbers());


        LotteryResult resultOfGame1 = new LotteryResult();
        resultOfGame1.getResult(game1.getHappyNumbers(), user1.getUserNumbers());
        resultOfGame1.guessedNumbers(game1.getHappyNumbers(), user1.getUserNumbers());


    }
}