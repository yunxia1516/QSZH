package copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class CombatSkill {
    public static void main(String[] args) {
        //初始化测试变量
        List<String> dice = new ArrayList<>(Arrays.asList("风", "雷", "水", "冰", "火", "岩", "风", "水"));
        int[] otherHP = {10, 10, 10};
        int mainRoleNumber = 1;
        //角色要求：123指技能
        int[] roleCombatSkillDice1 = {3, 3, 3};
        int[] roleCombatSkillDice2 = {3, 3, 3};
        int[] roleCombatSkillDice3 = {7, 5, 6};
        int[] roleCombatSkillHurtNumber1 = {2, 1, 2};
        int[] roleCombatSkillHurtNumber2 = {3, 3, 1};
        int[] roleCombatSkillHurtNumber3 = {8, 1, 4};
        //输入战技编号用来判断战斗耗元素骰暨削减血量
        Scanner inputCombatSkillNumber = new Scanner(System.in);
        System.out.println("请输入战技编号:");
        int combatSkillNumber = inputCombatSkillNumber.nextInt();
        //返回运行结果
        System.out.println(copy.CombatSkill.combatConsumeDice(dice, combatSkillNumber, roleCombatSkillDice1, roleCombatSkillDice2, roleCombatSkillDice3, mainRoleNumber));
        System.out.println(Arrays.toString(copy.CombatSkill.combatConsumeHP(combatSkillNumber, otherHP, mainRoleNumber, roleCombatSkillHurtNumber1, roleCombatSkillHurtNumber2, roleCombatSkillHurtNumber3)));
    }

    static List<String> combatConsumeDice(List<String> dice, int combatSkillNumber, int[] rcsd1, int[] rcsd2, int[] rcsd3, int mainrolenum) {
        //根据战技编号选定削减骰子数量
        int consumeDiceNumber = 0;
        switch (combatSkillNumber) {
            case 1:
                consumeDiceNumber = rcsd1[mainrolenum];
                break;
            case 2:
                consumeDiceNumber = rcsd2[mainrolenum];
                break;
            case 3:
                consumeDiceNumber = rcsd3[mainrolenum];
                break;
        }

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

    static int[] combatConsumeHP(int combatSkillNumber, int[] otherHPList, int mainRoleNumber, int[] rcsh1, int[] rcsh2, int[] rcsh3) {
        //根据战技编号选定削减血量数量
        int consumeHPNumber = 1;
        switch (combatSkillNumber) {
            case 1:
                consumeHPNumber = rcsh1[mainRoleNumber];
                break;
            case 2:
                consumeHPNumber = rcsh2[mainRoleNumber];
                break;
            case 3:
                consumeHPNumber = rcsh3[mainRoleNumber];
                break;
        }
        otherHPList[mainRoleNumber] -= consumeHPNumber;
    return otherHPList;
    }
}
