package reWrite;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static void main(String[] args) {
    }
}
class player1 {
    //角色信息
    int mainRoleNumber;
    String[] roleNameList = {"","",""};
    int[] roleHPList = {10, 10, 10};
    //角色攻击信息：变量名数字代表技能
    int[] roleCombatSkillDice1 = {};
    int[] roleCombatSkillDice2 = {};
    int[] roleCombatSkillDice3 = {};
    int[] roleCombatSkillHurtNumber1 = {};
    int[] roleCombatSkillHurtNumber2 = {};
    int[] roleCombatSkillHurtNumber3 = {};
    //玩家资产
    List<String> dice = new ArrayList<>();
}
class player2 {
    //角色信息
    int mainRoleNumber;
    String[] roleNameList = {"","",""};
    int[] roleHPList = {10, 10, 10};
    //角色攻击信息：变量名数字代表技能
    int[] roleCombatSkillDice1 = {};
    int[] roleCombatSkillDice2 = {};
    int[] roleCombatSkillDice3 = {};
    int[] roleCombatSkillHurtNumber1 = {};
    int[] roleCombatSkillHurtNumber2 = {};
    int[] roleCombatSkillHurtNumber3 = {};
    //玩家资产
    List<String> dice = new ArrayList<>();
}
class RoundData {
    String winningParty; //玩家一的胜负，空值则是回合还未结束
    boolean thisRoundOffensive; //玩家一是否在下一局中扮演先手
}
