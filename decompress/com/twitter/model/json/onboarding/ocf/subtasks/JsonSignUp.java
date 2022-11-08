// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSignUp extends lhh<m6q>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField
    public String h;
    @JsonField
    public String i;
    @JsonField
    public xrv j;
    @JsonField
    public boolean k;
    @JsonField
    public xrv l;
    @JsonField
    public xrv m;
    @JsonField
    public JsonJsInstrumentationConfig n;
    @JsonField
    public JsonOcfComponentCollection o;
    
    @Override
    public final h4j t() {
        final JsonJsInstrumentationConfig n = this.n;
        String a;
        if (n != null) {
            a = n.a;
        }
        else {
            a = "";
        }
        final m6q.a a2 = new m6q.a();
        a2.k = this.a;
        a2.l = this.b;
        a2.m = this.c;
        a2.n = this.d;
        a2.o = this.e;
        a2.p = this.f;
        a2.q = this.g;
        a2.r = this.h;
        a2.s = this.i;
        a2.a = this.j;
        final int a3 = w4j.a;
        a2.w = this.k;
        a2.t = a;
        a2.u = this.l;
        a2.v = this.m;
        final JsonOcfComponentCollection o = this.o;
        n16 t;
        if (o != null) {
            t = o.t();
        }
        else {
            t = null;
        }
        a2.j = t;
        return (h4j)a2;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonJsInstrumentationConfig extends ige
    {
        @JsonField
        public String a;
    }
}
