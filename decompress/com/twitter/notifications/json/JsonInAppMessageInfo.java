// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonInAppMessageInfo extends tih<ggd>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        return new ggd(this.a, this.b);
    }
}
