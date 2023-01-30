import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class reWrite01 {
    public static void main(String[] args) {
        //初始化测试变量
        //List<String> dice = new ArrayList<>(Arrays.asList("风", "雷", "水", "冰", "火", "岩", "风", "水"));
        int[] otherHP = {10, 10, 10};
        int mainRoleNumber = 1;
        //输入战技编号用来判断战斗耗元素骰暨削减血量
        Scanner inputCombatSkillNumber = new Scanner(System.in);
        System.out.println("请输入战技编号:");
        int combatSkillNumber = inputCombatSkillNumber.nextInt();
//        System.out.println(reWrite01.combatConsumeDice(dice, combatSkillNumber));
        System.out.println(Arrays.toString(reWrite01.combatConsumeHP(combatSkillNumber, otherHP, mainRoleNumber)));
    }

    static List<String> combatConsumeDice(List<String> dice, int combatSkillNumber) {
        //根据战技编号选定削减骰子数量
        int consumeDiceNumber = 0;
        switch (combatSkillNumber) {
            case 1:
            case 2:
                consumeDiceNumber = 3;
                break;
            case 3:
                consumeDiceNumber = 5;
                break;
        }
        System.out.println(consumeDiceNumber);

        //循环吃掉骰子
        int[] inp = new int[consumeDiceNumber];
        Scanner reduceDiceInputReader = new Scanner(System.in);
        for (int i = 0; i < consumeDiceNumber; i++) {
            System.out.println("第" + (i + 1) + "个骰子：");
            inp[i] = reduceDiceInputReader.nextInt();
        }
        System.out.println(dice);
        int reduceDiceCycleCounter = 0;
        for (int ignored : inp) {
            dice.remove(ignored - reduceDiceCycleCounter - 1);
            reduceDiceCycleCounter += 1;
        }
        return dice;
    }

    static int[] combatConsumeHP(int combatSkillNumber, int[] otherHPList, int mainRoleNumber) {
        //根据战技编号选定削减血量数量
        int consumeHPNumber = 1;
        switch (combatSkillNumber) {
            case 2:
            case 3:
                consumeHPNumber = 3;
        }
        System.out.println(consumeHPNumber);
        System.out.println(otherHPList[mainRoleNumber]);
        otherHPList[mainRoleNumber] -= consumeHPNumber;
        System.out.println(Arrays.toString(otherHPList));
    return otherHPList;
    }
}
