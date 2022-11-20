// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGraphQlVerifyCredentialsResponse extends fih<cgv>
{
    @JsonField
    public kiw a;
    @JsonField
    public sfw b;
    
    public final Object s() {
        final cgv d = toe.d(this.a);
        cgv cgv;
        if (d != null) {
            cgv = (cgv)((n4j)new cgv$b(d)).e();
        }
        else {
            cgv = null;
        }
        return cgv;
    }
}
