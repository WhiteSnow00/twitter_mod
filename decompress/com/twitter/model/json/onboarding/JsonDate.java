// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonDate extends tih<sa8>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    
    @Override
    public final Object s() {
        return new sa8(this.c, this.b, this.a);
    }
}
