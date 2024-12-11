package com.example.app;
import com.example.data.FruitHelper;
import com.example.data.Fruits;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.data.*;

public class Main {
    public static void main(String[] args) {
        List<Fruits> fruitBasket = new ArrayList<>();
        fruitBasket.add(new Apple(FruitHelper.APPLE.name, FruitHelper.APPLE.color, FruitHelper.APPLE.isRipe));
        fruitBasket.add(new Watermelon(FruitHelper.WATERMELON.name, FruitHelper.WATERMELON.color, FruitHelper.WATERMELON.isRipe));
        fruitBasket.add(new PineApple(FruitHelper.PINEAPPLE.name, FruitHelper.PINEAPPLE.color,FruitHelper.PINEAPPLE.isRipe));

        for(Fruits i : fruitBasket){
            System.out.println(i.outputFormatter(i.getName(),i.getColor(),i.isRipe()));
            for (int j = 0; j < i.returnCountOfLastItem(i.isRipe()); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to change anything? (Y or N)");
        String changingFlow = scanner.nextLine();
        try{
            switch (changingFlow.toLowerCase()){
                case "y":
                    System.out.println("Features to be added in next Release!");
                    break;
                case "n":
                    System.out.println("Well that's a relief! Enjoy Your Picnic");
                    break;
                default:
                    throw new IndexOutOfBoundsException();
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Y or N ONLY !");
            scanner.nextLine();
            System.out.flush();
            main(args);
        }


    }
}
