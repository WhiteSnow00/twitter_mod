// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonActionList extends lhh<qk>
{
    @JsonField
    public xrv a;
    @JsonField
    public xrv b;
    @JsonField
    public iej c;
    @JsonField
    public List<hk> d;
    @JsonField(typeConverter = ok.class)
    public qk.c e;
    
    public JsonActionList() {
        this.e = qk.c.C0;
    }
    
    @Override
    public final h4j t() {
        final qk$a qk$a = new qk$a();
        ((lsr$a)qk$a).h = this.c;
        final int a = w4j.a;
        ((lsr$a)qk$a).a = this.a;
        ((lsr$a)qk$a).b = this.b;
        final ArrayList d = this.d;
        zzd.f((Object)d, "actionListItems");
        qk$a.k = d;
        final qk.c e = this.e;
        zzd.f((Object)e, "style");
        qk$a.l = e;
        return (h4j)qk$a;
    }
}
