package com.wualtervera.inventory.util;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static com.wualtervera.inventory.util.Constants.RANDOM_CHARACTERS;

public class Utils {
    private Utils() {
    }

    public static String generateProductCode(String nameProduct) {

        String initialLetters = nameProduct.substring(0, 3);
        String randomCharacters = generateRandomCharacters(4);
        String currentDate = getCurrentDateTime();
        String productCode = initialLetters  + currentDate + randomCharacters + "EMPRESA";

        return productCode.toUpperCase();
    }

    public static String generateRandomCharacters(int longitud) {
        Random random = new SecureRandom();
        StringBuilder sb = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(RANDOM_CHARACTERS.length());
            sb.append(RANDOM_CHARACTERS.charAt(index));
        }
        return sb.toString();
    }

    public static String getCurrentDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return sdf.format(new Date());
    }
}
