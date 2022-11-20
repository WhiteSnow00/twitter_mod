// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.common;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTwitterError extends fih<hbv>
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
    public yzi j;
    
    public JsonTwitterError() {
        this.i = -1;
    }
    
    public final Object s() {
        final int a = this.a;
        Object o = null;
        final u9v u9v = null;
        if (a > 0) {
            final int b = this.b;
            u9v u9v2 = null;
            Label_0060: {
                if (b <= 0 && this.f == null) {
                    u9v2 = u9v;
                    if (this.g == null) {
                        break Label_0060;
                    }
                }
                u9v2 = new u9v(b, this.f, this.g);
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
            o = new hbv(a, c, d, e, this.h, this.i, u9v2, this.j, (String)null, (q6c)null);
        }
        return o;
    }
}
