// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCreateAccount extends lhh<o17>
{
    @JsonField
    public hfv a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public xrv e;
    @JsonField(typeConverter = jy0.class)
    public int f;
    
    public JsonCreateAccount() {
        this.f = 2;
    }
    
    @Override
    public final h4j t() {
        final o17$a o17$a = new o17$a();
        final hfv a = this.a;
        pf8.r(a);
        o17$a.k = a;
        final String b = this.b;
        pf8.r(b);
        o17$a.l = b;
        final String c = this.c;
        pf8.r(c);
        o17$a.m = c;
        o17$a.n = this.d;
        final xrv e = this.e;
        pf8.r(e);
        ((lsr$a)o17$a).a = e;
        final int a2 = w4j.a;
        o17$a.o = this.f;
        return (h4j)o17$a;
    }
}
