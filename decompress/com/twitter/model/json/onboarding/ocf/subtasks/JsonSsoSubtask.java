// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSsoSubtask extends lhh<w4r>
{
    @JsonField
    public xrv a;
    @JsonField
    public xrv b;
    @JsonField
    public xrv c;
    @JsonField(typeConverter = r4r.class)
    public q4r d;
    @JsonField
    public List<String> e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField
    public String h;
    @JsonField
    public String i;
    @JsonField
    public JsonOcfComponentCollection j;
    
    @Override
    public final h4j t() {
        final w4r$a w4r$a = new w4r$a();
        ((lsr$a)w4r$a).a = this.a;
        final int a = w4j.a;
        ((lsr$a)w4r$a).c = this.c;
        final xrv b = this.b;
        zzd.f((Object)b, "failLink");
        w4r$a.q = b;
        final q4r d = this.d;
        zzd.f((Object)d, "provider");
        w4r$a.k = d;
        final ArrayList e = this.e;
        pf8.r(e);
        zzd.f((Object)e, "scopes");
        w4r$a.o = e;
        w4r$a.l = this.f;
        w4r$a.m = this.g;
        w4r$a.n = this.h;
        final String i = this.i;
        pf8.r(i);
        zzd.f((Object)i, "state");
        w4r$a.p = i;
        final JsonOcfComponentCollection j = this.j;
        n16 t;
        if (j != null) {
            t = j.t();
        }
        else {
            t = null;
        }
        ((lsr$a)w4r$a).j = t;
        return (h4j)w4r$a;
    }
}
