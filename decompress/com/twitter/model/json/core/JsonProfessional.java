// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonProfessional extends fih<e4l>
{
    @JsonField(typeConverter = e7l.class)
    public c7l a;
    @JsonField
    public JsonProfessionalCategory[] b;
    @JsonField
    public JsonProfessionalQuickPromoteEligibility c;
    
    public JsonProfessional() {
        this.a = c7l.F0;
    }
    
    public final Object s() {
        final c7l a = this.a;
        Object o;
        if (a == c7l.F0) {
            o = null;
        }
        else {
            final e4l$a e4l$a = new e4l$a();
            czd.f((Object)a, "type");
            e4l$a.a = a;
            final JsonProfessionalCategory[] b = this.b;
            if (b != null && !fq4.v((Object[])b)) {
                final rif h = rif.H();
                final JsonProfessionalCategory[] b2 = this.b;
                for (int length = b2.length, i = 0; i < length; ++i) {
                    h.p((Object)b2[i].t());
                }
                e4l$a.b = (List)((n4j)h).e();
            }
            else {
                final gdd$b e0 = gdd.E0;
                final int a2 = c5j.a;
                e4l$a.o((List)e0);
            }
            final JsonProfessionalQuickPromoteEligibility c = this.c;
            if (c == null) {
                e4l$a.c = new z4l(false, l4l.G0);
            }
            else {
                e4l$a.c = c.t();
            }
            o = ((n4j)e4l$a).e();
        }
        return o;
    }
}
