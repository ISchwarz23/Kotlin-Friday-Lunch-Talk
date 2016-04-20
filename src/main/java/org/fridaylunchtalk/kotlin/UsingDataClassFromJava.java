package org.fridaylunchtalk.kotlin;

/**
 * Created by Ingo on 19.04.2016.
 */
public class UsingDataClassFromJava {

    public static void main(String[] args) {
        DataClassInJava dataClassInJava = new DataClassInJava(0, "Java Class");
        dataClassInJava.setNickname("Nick");
        System.out.println(dataClassInJava);

        DataClassInKotlin dataClassInKotlin = new DataClassInKotlin(1, "Kotlin Class");
        dataClassInKotlin.setNickname("Nick");
        System.out.println(dataClassInKotlin);
    }

}
