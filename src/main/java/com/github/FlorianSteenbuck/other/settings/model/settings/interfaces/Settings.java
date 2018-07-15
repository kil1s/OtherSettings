package com.github.FlorianSteenbuck.other.settings.model.settings.interfaces;

import com.github.FlorianSteenbuck.other.settings.model.provider.SettingProvider;

import java.util.Map;

public interface Settings {
    int getId();
    Map<String, SettingProvider> getSettingProviders();
    boolean has(String id);
    Object get(String id);
    String getString(String id);
    Number getNumber(String id);
    Boolean getBoolean(String id);
}
