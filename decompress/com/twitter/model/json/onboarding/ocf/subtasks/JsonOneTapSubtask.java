// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOneTapSubtask extends lhh<ilj>
{
    @JsonField
    public xrv a;
    @JsonField
    public xrv b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public boolean e;
    @JsonField
    public boolean f;
    @JsonField
    public boolean g;
    
    @Override
    public final h4j t() {
        final ilj$a ilj$a = new ilj$a();
        ((lsr$a)ilj$a).a = this.a;
        final int a = w4j.a;
        final String c = this.c;
        zzd.f((Object)c, "state");
        ilj$a.k = c;
        final xrv b = this.b;
        zzd.f((Object)b, "successLink");
        ilj$a.l = b;
        ilj$a.m = this.d;
        ilj$a.n = this.e;
        ilj$a.o = this.f;
        ilj$a.p = this.g;
        return (h4j)ilj$a;
    }
}
