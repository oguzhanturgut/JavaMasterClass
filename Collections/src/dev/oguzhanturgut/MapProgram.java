package dev.oguzhanturgut;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independant language");
        languages.put("Python", "an interpreted, object-oriented, high level programming language with dynamci semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness"); // returns null

//        System.out.println(languages);
        System.out.println(languages.get("Java"));
        System.out.println(languages.put("Java", "this will overwrite the Java value")); // returns the previous value
        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the Map");
        } else {
            languages.put("Java", "new value");
        }

        System.out.println("------------------------------------");

//        languages.remove("Lisp");

        if (languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features")); // returns previous value
        System.out.println(languages.replace("Scala", "this will not be added")); // returns null
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
