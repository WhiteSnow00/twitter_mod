// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGraphQlVerifyCredentialsResponse extends aih<hfv>
{
    @JsonField
    public rhw a;
    @JsonField
    public ffw b;
    
    @Override
    public final Object s() {
        final hfv e = ffa.e(this.a);
        hfv hfv;
        if (e != null) {
            hfv = (hfv)((h4j)new hfv$b(e)).e();
        }
        else {
            hfv = null;
        }
        return hfv;
    }
}
