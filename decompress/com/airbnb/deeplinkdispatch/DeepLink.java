// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.deeplinkdispatch;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface DeepLink {
    public static final String IS_DEEP_LINK = "is_deep_link_flag";
    public static final String REFERRER_URI = "android.intent.extra.REFERRER";
    public static final String URI = "deep_link_uri";
    
    String[] value();
}
