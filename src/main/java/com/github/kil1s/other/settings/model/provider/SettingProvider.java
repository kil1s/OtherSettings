package com.github.kil1s.other.settings.model.provider;

import com.github.kil1s.other.settings.exceptions.WrongSettingsDataException;
import com.github.kil1s.other.settings.helper.SettingsHelper;
import com.github.kil1s.other.settings.typ.SettingsTyp;

public abstract class SettingProvider<D> {
    private D data;
    private SettingsTyp typ;

    public SettingProvider(D defaultData, SettingsTyp typ) throws WrongSettingsDataException {
        this.typ = typ;
        setData(defaultData);
    }

    public D getData() {
        return data;
    }

    public void setData(D data) throws WrongSettingsDataException {
        if (!SettingsHelper.instanceOfSettingsTyp(data, typ)) {
            throw new WrongSettingsDataException("data is not compatible with the SettingsTyp "+typ.name());
        }
        this.data = data;
    }
}
