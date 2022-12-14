package com.github.kil1s.other.settings.model.settings.abstracts;

import com.github.kil1s.other.settings.exceptions.UnsupportedSettingValueException;
import com.github.kil1s.other.settings.exceptions.WrongSettingsDataException;
import com.github.kil1s.other.settings.model.settings.interfaces.WriteableSettings;

public abstract class PreSupportWriteableSettings implements WriteableSettings {
    @Override
    public void set(String id, Object settingValue) throws UnsupportedSettingValueException, WrongSettingsDataException {
        if (settingValue instanceof String) {
            setString(id, (String) settingValue);
        } else if (settingValue instanceof Number) {
            setNumber(id, (Number) settingValue);
        } else if (settingValue instanceof Boolean) {
            setBoolean(id, (Boolean) settingValue);
        } else {
            throw new UnsupportedSettingValueException(settingValue.getClass().getName()+" is unsupported");
        }
    }
}
