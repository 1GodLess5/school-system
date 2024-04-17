package cz.godless.utility;

import cz.godless.domain.Clazz;
import cz.godless.domain.Student;

public class PrintUtils {
    public static void printDivider(int howLong) {
        String divider = "";
        for (int i = 0; i < howLong; i++) {
            divider += "-";
        }
        System.out.println(divider);
    }

}
