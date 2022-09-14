package com.hemenace;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megaBytes, remainingKilo;

        megaBytes = kiloBytes / 1024;

        remainingKilo = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else
            System.out.println(kiloBytes + " KB = " +
                    megaBytes + " MB and " +
                    remainingKilo + " KB");
    }

}

