package bai19_StringRegex.ValidateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASSNAME_REGEX = "^[CAP][\\d]{4}[GHIKLM]$";

    public ClassName() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
