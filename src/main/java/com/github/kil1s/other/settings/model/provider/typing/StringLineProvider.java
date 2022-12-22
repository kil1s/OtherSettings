package com.github.kil1s.other.settings.model.provider.typing;

import com.github.kil1s.other.settings.exceptions.WrongSettingsDataException;
import com.github.kil1s.other.settings.model.provider.SettingProvider;
import com.github.kil1s.other.settings.typ.SettingsTyp;

public class StringLineProvider extends SettingProvider<String> {
    public StringLineProvider(String defaultData) throws WrongSettingsDataException {
        super(defaultData, SettingsTyp.TEXT_LINE);
    }
}
