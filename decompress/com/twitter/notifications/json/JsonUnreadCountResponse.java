// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUnreadCountResponse extends fih<x0w>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    
    public final Object s() {
        return new x0w(this.a, this.b);
    }
}
