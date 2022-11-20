// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOneTapSubtask extends qhh<nlj>
{
    @JsonField
    public ssv a;
    @JsonField
    public ssv b;
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
    
    public final n4j t() {
        final nlj$a nlj$a = new nlj$a();
        ((dtr$a)nlj$a).a = this.a;
        final int a = c5j.a;
        final String c = this.c;
        czd.f((Object)c, "state");
        nlj$a.k = c;
        final ssv b = this.b;
        czd.f((Object)b, "successLink");
        nlj$a.l = b;
        nlj$a.m = this.d;
        nlj$a.n = this.e;
        nlj$a.o = this.f;
        nlj$a.p = this.g;
        return (n4j)nlj$a;
    }
}
