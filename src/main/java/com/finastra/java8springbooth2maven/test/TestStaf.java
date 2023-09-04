package com.finastra.java8springbooth2maven.test;


import java.nio.charset.StandardCharsets;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStaf {
 private static int SIDE = 30;

    private static int[] side;

//    public static void main(String[] args) {
//        test();
////        JSONObject json = new JSONObject();
////        json.put("is","test");
////        System.out.println("value " + json.get("id"));
////
////        List list = new ArrayList();
////        list.add(1);
////         list.add("2");
////          Integer number0 = (Integer)list.get(0);
////      Integer number1 = (Integer)list.get(1);
//
//
//    }

    public static void MiddleIndexCalculation(int numCharacters){
//            int numCharacters = 10; // For example, a sequence of 10 characters
            int lastIndex = numCharacters - 1;

            // Calculate the middle index using bitwise right shift
            int middleIndex = (lastIndex) >> 1;

            System.out.println("Middle Index: " + middleIndex);
    }

    private static void test(){

        Predicate<Integer> p1 = i -> i > 2;
        Stream.of(1, 2, 3, 4)
                .filter(p1) // 1
                .forEach(System.out::print);
        String str2 = "ababba";
//        str2.re
        String str = new StringBuilder(str2).reverse().toString();

    }

    public static void someMethod(long arg, int... args) {
        // assume implementation here
    }

    private static String getMessage(String msg) {
        return msg.substring(msg.indexOf(":")+1,getLastIndex(msg));
    }

     private static int getLastIndex(String msg){
        int nextLineIndex = !msg.contains("\n") ? msg.length()-1 : msg.indexOf("\n");
        int sogerIndex = !msg.contains("(") ? msg.length()-1 : msg.indexOf("(");
        return Math.min(nextLineIndex, sogerIndex);
     }
    static Function<String, String> apply(BiFunction<String, String, String> f, String a) {
        return b -> f.apply(a, b);
    }

    static Function<String, String> apply(String s) {
                return (a) -> a + s;
    }

    public static void main(String args[]) {

        String uid= "ZA1^AUTO_SELECT_BOOK";
       String result =  java.util.Base64.getUrlEncoder().encodeToString(uid.getBytes(StandardCharsets.UTF_8));
        System.out.println(result);
        MiddleIndexCalculation(10);
        MiddleIndexCalculation(7);
//                Function<String, String> trim = String::trim;
//                Function<String, String> partial = apply((a, b) -> a+b, "x");
//                 Predicate<String> filter = s -> s.length() > 3;
//                List<String> words = Arrays.asList("one", "two", "three");
//                 words.stream()
//                    .map((String s1) -> filter.test(s1)? partial : trim)
//                      .map(f -> f.andThen(s2 -> s2 + "X"))
//                     .forEach(System.out::print);
    }
}


