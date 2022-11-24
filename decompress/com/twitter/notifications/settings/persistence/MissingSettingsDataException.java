// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.settings.persistence;

public class MissingSettingsDataException extends Exception
{
    public MissingSettingsDataException() {
        super("Could not find required settings data on disk");
    }
    
    public MissingSettingsDataException(final String s) {
        super(s);
    }
}
