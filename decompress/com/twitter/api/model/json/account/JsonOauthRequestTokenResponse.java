// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOauthRequestTokenResponse extends fih<l3j>
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
    public k3j v;
    
    public final Object s() {
        final l3j$a l3j$a = new l3j$a();
        l3j$a.b = this.m;
        l3j$a.d = this.l;
        l3j$a.c = this.h;
        l3j$a.e = this.o;
        l3j$a.f = this.c;
        l3j$a.g = this.q;
        l3j$a.i = Boolean.parseBoolean(this.a);
        l3j$a.j = Boolean.parseBoolean(this.g);
        l3j$a.k = Boolean.parseBoolean(this.t);
        l3j$a.l = Boolean.parseBoolean(this.n);
        l3j$a.m = Boolean.parseBoolean(this.d);
        l3j$a.h = this.v;
        l3j$a.a = this.u;
        return ((n4j)l3j$a).e();
    }
}
