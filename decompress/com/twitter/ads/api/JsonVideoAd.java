// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.ads.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVideoAd extends fih<lm9>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    @JsonField
    public uil c;
    @JsonField
    public String d;
    @JsonField
    public int e;
    @JsonField
    public pm9 f;
    
    public final Object s() {
        final bm9 bm9 = new bm9(this.a, this.b);
        final boolean valid = bm9.isValid();
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
            final pm9 f = this.f;
            final uil c = this.c;
            qm9 qm9;
            if (c == null) {
                qm9 = null;
            }
            else {
                final qm9.a a = new qm9.a();
                a.a = c.b;
                a.b = c.a;
                a.c = c.c;
                qm9 = (qm9)a.e();
            }
            o2 = new lm9(new bbv(d, e, f, qm9), bm9);
            return o2;
        }
        catch (final NumberFormatException ex) {
            o2 = o;
            return o2;
        }
    }
}
