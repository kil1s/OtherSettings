package com.github.kil1s.other.settings.model.typing;

import com.github.kil1s.other.settings.exceptions.WrongSettingsDataException;
import com.github.kil1s.other.settings.model.provider.SettingProvider;

import static com.github.kil1s.other.settings.typ.SettingsTyp.CHECKBOX;

public class BooleanCheckboxProvider extends SettingProvider<Boolean> {
    public BooleanCheckboxProvider(Boolean defaultData) throws WrongSettingsDataException {
        super(defaultData, CHECKBOX);
    }
}
