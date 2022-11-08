// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.traffic;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonDnsRecord extends aih<s49>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        Object o;
        if (pjr.e((CharSequence)this.a)) {
            o = null;
        }
        else {
            o = new s49(this.a, this.b);
        }
        return o;
    }
}
