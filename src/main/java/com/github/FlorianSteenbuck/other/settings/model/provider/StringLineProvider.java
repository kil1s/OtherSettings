package com.github.FlorianSteenbuck.other.settings.model.provider;

import com.github.FlorianSteenbuck.other.settings.exceptions.WrongSettingsDataException;
import com.github.FlorianSteenbuck.other.settings.typ.SettingsTyp;

public class StringLineProvider extends SettingProvider<String> {
    public StringLineProvider(String defaultData) throws WrongSettingsDataException {
        super(defaultData, SettingsTyp.TEXT_LINE);
    }
}
