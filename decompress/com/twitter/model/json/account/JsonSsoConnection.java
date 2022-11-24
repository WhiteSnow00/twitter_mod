// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSsoConnection extends tih<g6r>
{
    @JsonField
    public String a;
    @JsonField(typeConverter = j6r.class)
    public i6r b;
    
    @Override
    public final Object s() {
        final String a = this.a;
        Object o = null;
        if (a != null) {
            final i6r b = this.b;
            final i6r h0 = i6r.H0;
            i6r i6r;
            if (b == null) {
                i6r = h0;
            }
            else {
                i6r = b;
            }
            o = o;
            if (i6r != h0) {
                o = new g6r(a, b, (String)null);
            }
        }
        return o;
    }
}
