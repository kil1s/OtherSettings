package com.github.kil1s.other.settings.exceptions;

public class SettingException extends Exception {
    public SettingException(String message) {
        super(message);
    }

    public SettingException(Throwable cause) {
        super(cause);
    }

    public SettingException(String message, Throwable cause) {
        super(message, cause);
    }
}
