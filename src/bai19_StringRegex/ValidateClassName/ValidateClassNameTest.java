package bai19_StringRegex.ValidateClassName;

import bai19_StringRegex.ValidateClassName.ClassName;

public class ValidateClassNameTest {

    private static ClassName classNameExample;

    public static final String[] validClassName = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidClassName = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String args[]) {
        classNameExample = new ClassName();
        for (String className : validClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Account is " + className + " is valid: " + isvalid);
        }
        for (String className : invalidClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Account is " + className + " is valid: " + isvalid);
        }
    }
}
