// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.ads.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVideoAd extends aih<cn9>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    @JsonField
    public hil c;
    @JsonField
    public String d;
    @JsonField
    public int e;
    @JsonField
    public gn9 f;
    
    @Override
    public final Object s() {
        final sm9 sm9 = new sm9(this.a, this.b);
        final boolean valid = sm9.isValid();
        Object o2;
        final Object o = o2 = null;
        if (!valid) {
            return o2;
        }
        final String d = this.d;
        if (d == null) {
            o2 = o;
            return o2;
        }
        try {
            final int e = this.e;
            final gn9 f = this.f;
            final hil c = this.c;
            hn9 hn9;
            if (c == null) {
                hn9 = null;
            }
            else {
                final hn9$a hn9$a = new hn9$a();
                hn9$a.a = c.b;
                hn9$a.b = c.a;
                hn9$a.c = c.c;
                hn9 = (hn9)((h4j)hn9$a).e();
            }
            o2 = new cn9(new gav(d, e, f, hn9), sm9);
            return o2;
        }
        catch (final NumberFormatException ex) {
            o2 = o;
            return o2;
        }
    }
}
