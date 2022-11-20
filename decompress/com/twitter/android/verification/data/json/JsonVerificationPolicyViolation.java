// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.verification.data.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVerificationPolicyViolation extends fih<irw>
{
    @JsonField
    public String a;
    @JsonField
    public oxm b;
    @JsonField
    public jrw c;
    @JsonField
    public krw d;
    
    public final Object s() {
        return new irw(this.c, this.a, this.b, this.d);
    }
}
