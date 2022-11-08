// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonAppLocaleUpdateSubtask extends lhh<qn0>
{
    @JsonField
    public xrv a;
    @JsonField
    public hn0 b;
    @JsonField
    public boolean c;
    
    @Override
    public final h4j t() {
        final qn0$a qn0$a = new qn0$a();
        final xrv a = this.a;
        pf8.r(a);
        ((lsr$a)qn0$a).a = a;
        final int a2 = w4j.a;
        final hn0 b = this.b;
        zzd.f((Object)b, "locale");
        qn0$a.k = b;
        qn0$a.l = this.c;
        return (h4j)qn0$a;
    }
}
