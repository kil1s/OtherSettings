package com.github.kil1s.other.settings.model.settings.interfaces;

import com.github.kil1s.other.settings.model.provider.SettingProvider;

import java.util.Collection;
import java.util.Map;

public interface Settings {
    int getId();
    Collection<String> getMandatories();
    Map<String, SettingProvider> getSettingProviders();
    boolean has(String id);
    Object get(String id);
    String getString(String id);
    Number getNumber(String id);
    Boolean getBoolean(String id);
}
