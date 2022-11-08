// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonWebModal extends lhh<jlx>
{
    @JsonField
    public String a;
    @JsonField(typeConverter = flx.class)
    public elx b;
    @JsonField
    public xrv c;
    @JsonField
    public xrv d;
    @JsonField
    public xrv e;
    @JsonField
    public JsonOcfComponentCollection f;
    
    public JsonWebModal() {
        this.b = elx.D0;
    }
    
    @Override
    public final h4j t() {
        final jlx$a jlx$a = new jlx$a();
        final String a = this.a;
        pf8.r(a);
        zzd.f((Object)a, "newUrl");
        jlx$a.k = a;
        final elx b = this.b;
        zzd.f((Object)b, "newStyle");
        jlx$a.l = b;
        final xrv c = this.c;
        pf8.r(c);
        ((lsr$a)jlx$a).a = c;
        final int a2 = w4j.a;
        ((lsr$a)jlx$a).b = this.d;
        final xrv e = this.e;
        pf8.r(e);
        ((lsr$a)jlx$a).c = e;
        final JsonOcfComponentCollection f = this.f;
        n16 t;
        if (f != null) {
            t = f.t();
        }
        else {
            t = null;
        }
        ((lsr$a)jlx$a).j = t;
        return (h4j)jlx$a;
    }
}
