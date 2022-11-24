// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonAvailability extends tih<pd1>
{
    @JsonField
    public boolean a;
    @JsonField
    public String b;
    @JsonField
    public boolean c;
    
    @Override
    public final Object s() {
        return new pd1(this.a, this.b, this.c);
    }
}
