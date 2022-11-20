// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonInAppMessageInfo extends fih<gfd>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    public final Object s() {
        return new gfd(this.a, this.b);
    }
}
