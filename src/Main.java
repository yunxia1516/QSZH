package src;

public class Main {
    public static void main(String[] args) {
        //实例化各个类
        player1 p1 = new player1();
        player2 p2 = new player2();
        RoundData rd = new RoundData();
        PreGamePreparation pre = new PreGamePreparation();
        //首先打印
        System.out.println("七圣召唤重制版(by 蒹葭采采)\n");
        System.out.println("请玩家1、2就位，现在正式开始比赛。");
        while (rd.winningParty == null) {
            p1.dice = pre.setElementDice();
            p2.dice = pre.setElementDice();
            System.out.println("玩家1的骰子是：" + p1.dice);
            System.out.println("玩家2的骰子是：" + p2.dice);
            break;
        }
        System.out.println("玩家" + rd.winningParty + "赢得比赛");
        System.out.println("想要继续比赛，请重启程序");
    }
}
