package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;


public class DataGenerator {
    private DataGenerator() {
    }

    public static String generateCity() {
        var list = Arrays.asList("Красноярск", "Новосибирск", "Барнаул", "Омск", "Иркутск", "Чита", "Улан-Удэ",
                "Абакан", "Томск", "Хабаровск", "Владивосток", "Екатеринбург", "Пермь");
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    public static String fakerName() {
        Faker faker = new Faker(new Locale("ru"));
        return faker.name().fullName();
    }

    public static String fakerPhone() {
        Faker faker = new Faker(new Locale("ru"));
        return faker.phoneNumber().phoneNumber();
    }

    public static String generateDate(int shift) {
        int random = 3 + (int) (Math.random() * 30);
        return LocalDate.now().plusDays(random).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}


