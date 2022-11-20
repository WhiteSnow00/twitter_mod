// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonDate extends fih<o98>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    
    public final Object s() {
        return new o98(this.c, this.b, this.a);
    }
}
