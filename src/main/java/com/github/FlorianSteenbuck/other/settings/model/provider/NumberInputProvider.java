package com.github.FlorianSteenbuck.other.settings.model.provider;

import com.github.FlorianSteenbuck.other.settings.exceptions.WrongSettingsDataException;

import static com.github.FlorianSteenbuck.other.settings.typ.SettingsTyp.INPUT_NUMBER;

public class NumberInputProvider extends SettingProvider<Number> {
    public NumberInputProvider(Number defaultData) throws WrongSettingsDataException {
        super(defaultData, INPUT_NUMBER);
    }
}
