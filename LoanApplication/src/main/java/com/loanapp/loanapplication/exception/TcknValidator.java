package com.loanapp.loanapplication.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TcknValidator {

    private static final String TCKN_REGEX = "^[0-9]{11}";

    private TcknValidator() {
    }

    public static boolean validate(Long tckn) {
        String tcknString = String.valueOf(tckn);
        Pattern pattern = Pattern.compile(TCKN_REGEX);
        Matcher matcher = pattern.matcher(tcknString);
        if (!matcher.matches()) {
            throw new IllegalTcknException("TCKN needs to be 11 digits and can only contain only numbers.");
        } else {
            return true;
        }
    }
}