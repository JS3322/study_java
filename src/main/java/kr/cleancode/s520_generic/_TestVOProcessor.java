package kr.cleancode.s520_generic;

import java.lang.reflect.Field;

public class _TestVOProcessor {

  public static <T> void printFieldsAndValues(T object) {
    Class<?> objClass = object.getClass();
    System.out.println(objClass.getSimpleName());

    Field[] fields = objClass.getDeclaredFields();
    for (Field field : fields) {
      try {
        field.setAccessible(true);
        System.out.println(field.getName() + "//" + field.get(object));
      } catch (IllegalAccessException e) {
        System.out.println("error" + field.getName());
      }
    }
    System.out.println("-----");
  }
}
