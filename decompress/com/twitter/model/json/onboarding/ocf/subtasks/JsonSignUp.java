// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSignUp extends qhh<e7q>
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
    public ssv j;
    @JsonField
    public boolean k;
    @JsonField
    public ssv l;
    @JsonField
    public ssv m;
    @JsonField
    public JsonJsInstrumentationConfig n;
    @JsonField
    public JsonOcfComponentCollection o;
    
    public final n4j t() {
        final JsonJsInstrumentationConfig n = this.n;
        String a;
        if (n != null) {
            a = n.a;
        }
        else {
            a = "";
        }
        final e7q$a e7q$a = new e7q$a();
        e7q$a.k = this.a;
        e7q$a.l = this.b;
        e7q$a.m = this.c;
        e7q$a.n = this.d;
        e7q$a.o = this.e;
        e7q$a.p = this.f;
        e7q$a.q = this.g;
        e7q$a.r = this.h;
        e7q$a.s = this.i;
        ((dtr$a)e7q$a).a = this.j;
        final int a2 = c5j.a;
        e7q$a.w = this.k;
        e7q$a.t = a;
        e7q$a.u = this.l;
        e7q$a.v = this.m;
        final JsonOcfComponentCollection o = this.o;
        x06 t;
        if (o != null) {
            t = o.t();
        }
        else {
            t = null;
        }
        ((dtr$a)e7q$a).j = t;
        return (n4j)e7q$a;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonJsInstrumentationConfig extends qfe
    {
        @JsonField
        public String a;
    }
}
