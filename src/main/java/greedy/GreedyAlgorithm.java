package greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class GreedyAlgorithm {

    public static void main(String[] args) {
        ArrayList<Integer> coinList = new ArrayList<>(Arrays.asList(500,100,50,1));
        GreedyAlgorithm ga = new GreedyAlgorithm();
        ga.coinFunc(4720,coinList);
    }
    public void coinFunc(int price, ArrayList<Integer> coinList) {

        int totalCoinCount = 0;
        int coinNum = 0;

        for (int index = 0;index<coinList.size();index++){
            coinNum = price/coinList.get(index);
            totalCoinCount += coinNum;
            price-=coinNum*coinList.get(index);
            System.out.println(coinList.get(index)+"원: "+coinNum+"개");
        }
        System.out.println("총 동전갯수: "+totalCoinCount);
    }

}
