package com.github.FlorianSteenbuck.other.settings.model.provider;

import com.github.FlorianSteenbuck.other.settings.exceptions.WrongSettingsDataException;
import com.github.FlorianSteenbuck.other.settings.typ.SettingsTyp;

import java.util.List;

public class StringListProvider extends SettingProvider<List<String>> {
    public StringListProvider(List<String> defaultData) throws WrongSettingsDataException {
        super(defaultData, SettingsTyp.LIST);
    }
}
