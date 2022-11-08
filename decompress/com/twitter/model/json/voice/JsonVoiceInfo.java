// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.voice;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVoiceInfo extends aih<efx>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public long c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    
    @Override
    public final Object s() {
        final efx.a a = new efx.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        a.d = this.d;
        a.e = this.e;
        return a.e();
    }
}
