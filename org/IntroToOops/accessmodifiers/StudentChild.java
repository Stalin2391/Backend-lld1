package org.IntroToOops.accessmodifiers;

import org.IntroToOops.Student;

public class StudentChild extends Student {
    public void test() {
//        System.out.println(psp); -- protected can access the derived class
//        System.out.println(age); -- default value not access in the derived class
//        System.out.println(name);  -- private can access the derived class
        System.out.println(batch);
    }
}
