package org.IntroToOops;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
//        st.age = 30;
//        Student st2 = st;
//        st2.age += 10;
//        System.out.println(st.age);
//        System.out.println(st2.age);

        st.setName("Stalin");
        System.out.println(st.getName());
    }
}
