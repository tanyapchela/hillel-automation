package com.ithillel.utils;

import java.nio.charset.Charset;
import java.util.Random;

public class DataProvider {
    public String getRandomString() {
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }

    public int getRandomInt() {
        return new Random().nextInt();
    }
}
