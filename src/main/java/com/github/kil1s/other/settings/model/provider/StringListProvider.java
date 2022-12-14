package com.github.kil1s.other.settings.model.provider;

import com.github.kil1s.other.settings.exceptions.WrongSettingsDataException;
import com.github.kil1s.other.settings.typ.SettingsTyp;

import java.util.List;

public class StringListProvider extends SettingProvider<List<String>> {
    public StringListProvider(List<String> defaultData) throws WrongSettingsDataException {
        super(defaultData, SettingsTyp.LIST);
    }
}
