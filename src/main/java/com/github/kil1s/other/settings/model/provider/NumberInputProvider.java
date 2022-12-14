package com.github.kil1s.other.settings.model.provider;

import com.github.kil1s.other.settings.exceptions.WrongSettingsDataException;

import static com.github.kil1s.other.settings.typ.SettingsTyp.INPUT_NUMBER;

public class NumberInputProvider extends SettingProvider<Number> {
    public NumberInputProvider(Number defaultData) throws WrongSettingsDataException {
        super(defaultData, INPUT_NUMBER);
    }
}
