package org.example.tasks;

import org.junit.jupiter.api.Test;

/**
 * 1108. Defanging an IP Address
 * <p>
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * <p>
 * A defanged IP address replaces every period "." with "[.]".
 */
public class DefangingAnIPAddress {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    @Test
    public void test() {
        String s = "somejava";
//        System.out.println("abc".compareTo("aba"));
//        System.out.println("SELECT".substring(0,5));
        System.out.println(s.substring(s.length()-5));
        System.out.println(s.charAt(s.length()-4) == 'j');
        System.out.println(s.charAt(s.length()-3) == 'a');
        System.out.println(s.lastIndexOf("java"));


//        System.out.println(x);
        System.out.println((int) 'n');
//        System.out.println((int)c);
        System.out.println(Math.round(3.6));
        System.out.println(Math.cos(Math.PI));
        System.out.println(Math.asin(0.5));
        System.out.println(Math.PI / 2);
        System.out.println(Math.PI / 4);
        System.out.println(Math.toRadians(30));
//        Assertions.assertEquals("1[.]1[.]1[.]1", defangIPaddr("1.1.1.1"));
//        Assertions.assertEquals("255[.]100[.]50[.]0", defangIPaddr("255.100.50.0"));
    }
}
