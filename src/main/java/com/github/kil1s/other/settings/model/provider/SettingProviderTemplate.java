package com.github.kil1s.other.settings.model.provider;

import com.github.kil1s.other.settings.exceptions.WrongSettingsDataException;
import com.github.kil1s.other.settings.typ.SettingsTypInterface;

public abstract class SettingProviderTemplate<D> {
    public SettingProviderTemplate(SettingsTypInterface typ) throws WrongSettingsDataException {
        // template
    }

    abstract public D getData();
    abstract public void setData(D data) throws WrongSettingsDataException;
}
