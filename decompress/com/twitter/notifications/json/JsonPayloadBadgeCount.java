// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonPayloadBadgeCount extends fih<j0k>
{
    @JsonField(name = { "app_icon" })
    public Integer a;
    @JsonField(name = { "ntab" })
    public Integer b;
    @JsonField(name = { "dm" })
    public Integer c;
    
    public final Object s() {
        return new j0k(this.a, this.b, this.c);
    }
}
