// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public final class JsonNotificationChannel extends tih<kqi>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField(typeConverter = yge.class)
    public int c;
    @JsonField
    public String d;
    @JsonField
    public boolean e;
    @JsonField
    public boolean f;
    @JsonField(typeConverter = bhe.class)
    public nqi g;
    
    @Override
    public final Object s() {
        return new kqi(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
