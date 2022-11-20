// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCreateAccount extends qhh<t07>
{
    @JsonField
    public cgv a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public ssv e;
    @JsonField(typeConverter = ey0.class)
    public int f;
    
    public JsonCreateAccount() {
        this.f = 2;
    }
    
    public final n4j t() {
        final t07$a t07$a = new t07$a();
        final cgv a = this.a;
        jee.l((Object)a);
        t07$a.k = a;
        final String b = this.b;
        jee.l((Object)b);
        t07$a.l = b;
        final String c = this.c;
        jee.l((Object)c);
        t07$a.m = c;
        t07$a.n = this.d;
        final ssv e = this.e;
        jee.l((Object)e);
        ((dtr$a)t07$a).a = e;
        final int a2 = c5j.a;
        t07$a.o = this.f;
        return (n4j)t07$a;
    }
}
