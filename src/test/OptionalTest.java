package test;

import com.sun.javafx.scene.control.behavior.OptionalBoolean;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/**
 * @author tcs
 */
public class OptionalTest {
    public static void main(String[] args) {
        testOptional();
    }

    public static void testOptional() {
//        String temp = "hello";
        String temp = null;
        Optional<String> optional = Optional.ofNullable(temp);
        optional.ifPresent(System.out::println);
        // 如果为空返回else
        String orElse = optional.orElse("null");
        System.out.println("orElse: " + orElse);

        String orElseGet = optional.orElseGet(() -> "null");
        System.out.println("orElseGet: " + orElseGet);
        // 有值就执行map中的方法然后返回，不然就返回else
        String hello = optional.map(String::toUpperCase).orElse("null");
        System.out.println(hello);

        String aNull = optional.flatMap(s -> Optional.of(s)).orElse("null");
        System.out.println(aNull);

        String s1 = optional.filter(s -> s.contains("lo")).orElse("不包含lo");
        System.out.println(s1);
    }

    public static void testOptionalOther() {
        OptionalDouble optionalDouble = OptionalDouble.of(11.10);
        double asDouble = optionalDouble.getAsDouble();

        OptionalInt optionalInt = OptionalInt.of(11);
    }
}
