// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.common;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTwitterError extends aih<mav>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public String c;
    @JsonField
    public long d;
    @JsonField
    public String e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField
    public String h;
    @JsonField
    public int i;
    @JsonField
    public szi j;
    
    public JsonTwitterError() {
        this.i = -1;
    }
    
    @Override
    public final Object s() {
        final int a = this.a;
        Object o = null;
        final y8v y8v = null;
        if (a > 0) {
            final int b = this.b;
            y8v y8v2 = null;
            Label_0058: {
                if (b <= 0 && this.f == null) {
                    y8v2 = y8v;
                    if (this.g == null) {
                        break Label_0058;
                    }
                }
                y8v2 = new y8v(b, this.f, this.g);
            }
            String c = this.c;
            if (c == null) {
                c = "";
            }
            final long d = this.d;
            String e = this.e;
            if (e == null) {
                e = "";
            }
            o = new mav(a, c, d, e, this.h, this.i, y8v2, this.j, null, null);
        }
        return o;
    }
}
