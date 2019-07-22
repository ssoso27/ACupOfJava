package sohi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    public String name();
}

@MyAnno(name="ssoso")
class AAA {

}

public class TempTest {

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("sohi.AAA");

        MyAnno anno = (MyAnno) cls.getAnnotation(MyAnno.class);

        System.out.println(anno.name());
    }
}