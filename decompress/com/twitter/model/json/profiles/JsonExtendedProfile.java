// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.profiles;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonExtendedProfile extends lhh<ona>
{
    @JsonField
    public long a;
    @JsonField
    public JsonBirthdate b;
    @JsonField
    public ldx c;
    
    @Override
    public final h4j t() {
        ona$c f = ona$c.G0;
        final JsonBirthdate b = this.b;
        final int n = 0;
        final boolean b2 = b == null;
        final ona.a a = new ona.a();
        a.a = this.a;
        int a2;
        if (b2) {
            a2 = 0;
        }
        else {
            a2 = b.a;
        }
        a.b = a2;
        int b3;
        if (b2) {
            b3 = 0;
        }
        else {
            b3 = b.b;
        }
        a.c = b3;
        int c;
        if (b2) {
            c = n;
        }
        else {
            c = b.c;
        }
        a.d = c;
        ona$c d;
        if (b2) {
            d = f;
        }
        else {
            d = b.d;
        }
        a.e = d;
        if (!b2) {
            f = b.e;
        }
        a.f = f;
        a.g = this.c;
        return a;
    }
}
