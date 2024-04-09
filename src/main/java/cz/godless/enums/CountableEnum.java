package cz.godless.enums;

import java.lang.reflect.Method;

public interface CountableEnum {
    String getDescription();

    int getCount();

    static <T extends Enum<T>> String getDescriptionByCount(int count, Class<T> enumClass) {
        for (T enumConstant : enumClass.getEnumConstants()) {
            try {
                Method getCountMethod = enumClass.getMethod("getCount");
                int enumCount = (int) getCountMethod.invoke(enumConstant);
                if (enumCount == count) {
                    Method getDescriptionMethod = enumClass.getMethod("getDescription");
                    return (String) getDescriptionMethod.invoke(enumConstant);
                }
            } catch (Exception e) {
                System.out.println("Sorry, we have encountered an error on our side.");
            }
        }
        return null;
    }
}
