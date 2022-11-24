// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonProfessional extends tih<t4l>
{
    @JsonField(typeConverter = v7l.class)
    public t7l a;
    @JsonField
    public JsonProfessionalCategory[] b;
    @JsonField
    public JsonProfessionalQuickPromoteEligibility c;
    
    public JsonProfessional() {
        this.a = t7l.H0;
    }
    
    @Override
    public final Object s() {
        final t7l a = this.a;
        Object o;
        if (a == t7l.H0) {
            o = null;
        }
        else {
            final t4l$a t4l$a = new t4l$a();
            e0e.f((Object)a, "type");
            t4l$a.a = a;
            final JsonProfessionalCategory[] b = this.b;
            if (b != null && !kr4.v((Object[])b)) {
                final ojf h = ojf.H();
                final JsonProfessionalCategory[] b2 = this.b;
                for (int length = b2.length, i = 0; i < length; ++i) {
                    h.p((Object)b2[i].t());
                }
                t4l$a.b = (List)((z4j)h).e();
            }
            else {
                final ged$b g0 = ged.G0;
                final int a2 = o5j.a;
                t4l$a.o((List)g0);
            }
            final JsonProfessionalQuickPromoteEligibility c = this.c;
            if (c == null) {
                t4l$a.c = new o5l(false, a5l.I0);
            }
            else {
                t4l$a.c = c.t();
            }
            o = ((z4j)t4l$a).e();
        }
        return o;
    }
}
