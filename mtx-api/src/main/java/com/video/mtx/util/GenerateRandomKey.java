package com.video.mtx.util;

import java.security.SecureRandom;
import java.util.UUID;

public class GenerateRandomKey {
	public static String key()
    {
        UUID uuid = UUID.randomUUID();

        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String chars =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ-"+uuid.toString()+"-0123456789-abcdefghijklmnopqrstuvwxyz";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance

        for (int i = 0; i < 15; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        String str = sb.toString().replaceAll("-","");
        return str.toUpperCase();
    }
}
