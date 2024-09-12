package CollectionAndGenerics.Enums;

import CollectionAndGenerics.Enums.EnumClass.Grade;
import CollectionAndGenerics.Enums.EnumClass.TraficLight;
import CollectionAndGenerics.Enums.EnumClass.WeekDay;

public class EnumsTest {
    public static void main(String[] args) {

        Grade grade = Grade.valueOf("A");

        for (Grade value : Grade.values()) {
            
            // System.out.println(value);
        }

        TraficLight traficLight = TraficLight.valueOf("RED");

        for (TraficLight value : TraficLight.values()) {

            // System.out.println(value);
        }

        for (WeekDay values : WeekDay.values()) {
            System.out.println(values + " : " + values.getType());

        }
    } 

}
