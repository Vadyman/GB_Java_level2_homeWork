package homeWork_3;

import java.util.*;

public class Main {
    private static Contacts contacts = new Contacts();
    private static String[] randomWords = {
            "glow",
            "runner",
            "flexible",
            "differ",
            "glow",
            "glow",
            "flexible",
            "drain",
            "bring",
            "flexible",
            "glow",
            "ally",
            "flexible",
            "countryside",
            "category",
            "wolf",
            "wolf"
    };

    public static void main(String[] args) {
        Map<String, Integer> words = new TreeMap<>();

        for (String word : randomWords) {
            words.merge(word, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> wordPlus : words.entrySet()) {
            System.out.println("Слово " + wordPlus.getKey() + " встречается " + wordPlus.getValue() + ";");
        }

        //Второе задание
        add("Шабанов", "+78005553535");
        add("Шабанов", "88005553535");
        add("Шабанов", "+79525252525");
        add("Шабанов", "89525252525");
        add("Донцов", "Not yet"); //incorrect
        add("Донцов", "+70"); //incorrect
        add("Донцов", "80"); //incorrect
        add("Решетников", "+74950000000");
        add("Решетников", "84950000000");
        add("Донцов", "84930000000");
        add("Донцов", "+72002020202");

        print("Шабанов");
        print("Донцов");
        print("Решетников");
        //Второе задание
    }

    private static void print(String name) {
        System.out.println("----------\n" + name);
        for (String s : contacts.get("Шабанов")) {
            System.out.println(s);
        }
    }

    private static void add(String name, String number) {
        try {
            contacts.add(name, number);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
