// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonWeb3NFTCollection extends tih<jmx>
{
    @JsonField
    public String a;
    @JsonField
    public Integer b;
    @JsonField
    public String c;
    @JsonField
    public b5i d;
    
    @Override
    public final Object s() {
        final String a = this.a;
        final String c = this.c;
        final Integer b = this.b;
        int intValue;
        if (b == null) {
            intValue = 0;
        }
        else {
            intValue = b;
        }
        return new jmx(a, c, intValue, this.d);
    }
}
