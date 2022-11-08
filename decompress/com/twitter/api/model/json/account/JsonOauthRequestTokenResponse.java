// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOauthRequestTokenResponse extends aih<f3j>
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
    public String j;
    @JsonField
    public String k;
    @JsonField
    public String l;
    @JsonField
    public String m;
    @JsonField
    public String n;
    @JsonField
    public String o;
    @JsonField
    public String p;
    @JsonField
    public String q;
    @JsonField
    public String r;
    @JsonField
    public String s;
    @JsonField
    public String t;
    @JsonField
    public String u;
    @JsonField
    public e3j v;
    
    @Override
    public final Object s() {
        final f3j.a a = new f3j.a();
        a.b = this.m;
        a.d = this.l;
        a.c = this.h;
        a.e = this.o;
        a.f = this.c;
        a.g = this.q;
        a.i = Boolean.parseBoolean(this.a);
        a.j = Boolean.parseBoolean(this.g);
        a.k = Boolean.parseBoolean(this.t);
        a.l = Boolean.parseBoolean(this.n);
        a.m = Boolean.parseBoolean(this.d);
        a.h = this.v;
        a.a = this.u;
        return a.e();
    }
}
