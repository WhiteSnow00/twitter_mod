// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.logansquare.typeconverters;

import java.text.DateFormat;

public class DefaultDateConverter extends DateTypeConverter
{
    private DateFormat mDateFormat;
    
    public DefaultDateConverter() {
        this.mDateFormat = (DateFormat)new DefaultDateFormatter();
    }
    
    public DateFormat getDateFormat() {
        return this.mDateFormat;
    }
}
