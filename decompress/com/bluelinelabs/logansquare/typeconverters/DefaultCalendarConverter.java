// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.logansquare.typeconverters;

import java.text.DateFormat;

public class DefaultCalendarConverter extends CalendarTypeConverter
{
    private DateFormat mDateFormat;
    
    public DefaultCalendarConverter() {
        this.mDateFormat = (DateFormat)new DefaultDateFormatter();
    }
    
    public DateFormat getDateFormat() {
        return this.mDateFormat;
    }
}
