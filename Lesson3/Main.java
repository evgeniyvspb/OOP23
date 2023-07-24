package Lesson3;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.addComponent(new Component("Peneciline", "0.6", 15))
                .addComponent(new Component("Water", "1.2", 4));

        // while(pharmacy.hasNext()){
        // System.out.println(pharmacy.next());
        // }

        // for (Component item : pharmacy) {
        // System.out.println(item);
        // }

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponent(new Component("Peneciline", "0.6", 14))
                .addComponent(new Component("Water", "1.2", 2));

        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponent(new Component("Peneciline", "0.6", 24))
                .addComponent(new Component("Water", "1.2", 6));

        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(pharmacy);
        pharmacyList.add(pharmacy2);
        pharmacyList.add(pharmacy3);
        // System.out.println(pharmacyList);
        // System.out.println("----------");

        // Collections.sort(pharmacyList);
        // System.out.println(pharmacyList);

        // Так не работает:
        // System.out.println(pharmacy > pharmacy2);

        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponent(new Component("Peneciline", "0.6", 24))
                .addComponent(new Component("Water", "1.2", 6));

        // System.out.println(pharmacy3.equals(pharmacy4));

        System.out.println("\n------------------------------");
        System.out.println("    ДОМАШНЕЕ ЗАДАНИЕ К УРОКУ 3");
        System.out.println("------------------------------");

        Pharmacy pharmacy5 = new Pharmacy();
        pharmacy5.addComponent(new Component("NatryChlorid", "0.6", 24))
                .addComponent(new Component("Water", "1.2", 6));
        System.out.println("Фарм3 такой же как Фарм4: "+pharmacy3.equals(pharmacy4));
        System.out.println("Фарм2 такой же как Фарм4: "+pharmacy2.equals(pharmacy4));
        System.out.println("Фарм5 такой же как Фарм4: "+pharmacy5.equals(pharmacy4));
         // так как хоть поля и одинаковы по количеству но наименование
                                                         // нейм поля отличаетс

        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);

        System.out.println("хэш pharmacy1 = " + pharmacy.hashCode());
        System.out.println("хэш pharmacy2 = " + pharmacy2.hashCode());
        System.out.println("хэш pharmacy3 = " + pharmacy3.hashCode());
        System.out.println("хэш pharmacy4 = " + pharmacy4.hashCode()); //не добавился в сет хотя одинаковый! работает...

        System.out.println("Добавили в СЕТ 4 элемента, а так как один такой же то всего в сете оказалось "+result.size() +" pharmacy");// 4-1 =3 :-)

        // System.out.println("\n------------------------------");
        // pharmacyList = new ArrayList<>();
        // pharmacyList.add(pharmacy);
        // pharmacyList.add(pharmacy2);
        // pharmacy3 = new Pharmacy();
        // pharmacy3.addComponent(new Component("1", "0.6", 10))
        //         .addComponent(new Component("2", "1.2", 3))
        //         .addComponent(new Component("3", "1.2", 3));
        // pharmacyList.add(pharmacy3);
        // pharmacy = new Pharmacy();
        // pharmacy.addComponent(new Component("Peneceline", "0.6", 15))
        //         .addComponent(new Component("Vater", "1.2", 4));
        // pharmacyList.add(pharmacy);

        // System.out.println(pharmacyList);
        // System.out.println("----------");

        // Collections.sort(pharmacyList);
        // System.out.println(pharmacyList);

    }
}