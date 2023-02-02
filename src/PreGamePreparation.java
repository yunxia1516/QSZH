package src;

import java.util.*;

public class PreGamePreparation {
    public static void main(String[] args) {
        List<String> dice = new ArrayList<>(Arrays.asList("风", "雷", "水", "冰", "火", "岩", "风", "水"));
        System.out.println(PreGamePreparation.resetDice(dice));
    }
    final static List<String> ALL_ELEMENT_DICE = new ArrayList<>(Arrays.asList("风","岩","雷","草","水","火","冰","万能"));
    //投掷元素骰子
    static List<String> setElementDice() {
        List<String> getElementDice = new ArrayList<>();
        Random rand = new Random();
        //得出投掷结果
        for (int i = 0; i < 8; i++) {
            int diceRandNum = rand.nextInt(8);
            getElementDice.add(ALL_ELEMENT_DICE.get(diceRandNum));
        }
        return getElementDice;
    }
    //重投骰子
    static List<String> resetDice(List<String> myDice) {
        final List<String> ALL_ELEMENT_DICE = new ArrayList<>(Arrays.asList("风","岩","雷","草","水","火","冰","万能"));
        Scanner reader = new Scanner(System.in);
        String number = reader.nextLine();
        //重投骰子序列
        List<String> resetDice = new ArrayList<>(Arrays.asList(number.split(" "))); //重投索引序列号
        Random reRand = new Random();
        for (String s : resetDice) {
            int reRandNumber = reRand.nextInt(8);
            String rethrowString = ALL_ELEMENT_DICE.get(reRandNumber);
            int reindex = Integer.parseInt(s);
            myDice.set((reindex - 1), rethrowString);
        }
        return myDice;
    }
}
