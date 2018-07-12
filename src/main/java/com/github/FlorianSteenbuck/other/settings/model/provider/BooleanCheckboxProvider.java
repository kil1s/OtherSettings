package com.github.FlorianSteenbuck.other.settings.model.provider;

import com.github.FlorianSteenbuck.other.settings.exceptions.WrongSettingsDataException;

import static com.github.FlorianSteenbuck.other.settings.typ.SettingsTyp.CHECKBOX;

public class BooleanCheckboxProvider extends SettingProvider<Boolean> {
    public BooleanCheckboxProvider(Boolean defaultData) throws WrongSettingsDataException {
        super(defaultData, CHECKBOX);
    }
}
