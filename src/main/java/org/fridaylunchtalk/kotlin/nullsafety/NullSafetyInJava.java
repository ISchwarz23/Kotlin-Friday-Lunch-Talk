package org.fridaylunchtalk.kotlin.nullsafety;

/**
 * Created by Ingo on 20.04.2016.
 */
public class NullSafetyInJava {

    public static void main(String[] args) {
        NestedData data = new NestedData();
        System.out.println(data.getNestedInnerData().getNestedInnerInnerData().getValue().toUpperCase());

        NestedInnerData nestedInnerData = data.getNestedInnerData();
        if (nestedInnerData != null) {
            NestedInnerInnerData nestedInnerInnerData = nestedInnerData.getNestedInnerInnerData();
            if (nestedInnerInnerData != null) {
                String value = nestedInnerInnerData.getValue();
                if (value != null) {
                    System.out.println(value.toUpperCase());
                } else {
                    System.out.println("");
                }
            } else {
                System.out.println("");
            }
        } else {
            System.out.println("");
        }
    }

}
