// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMoment extends qhh<roh>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public boolean d;
    @JsonField(name = { "sensitive" })
    public boolean e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField
    public String h;
    @JsonField
    public boolean i;
    @JsonField
    public boolean j;
    @JsonField
    public int k;
    @JsonField
    public String l;
    @JsonField
    public t51 m;
    @JsonField
    public uil n;
    @JsonField
    public iba o;
    @JsonField
    public long p;
    @JsonField
    public Map<String, cgv> q;
    @JsonField
    public a87 r;
    @JsonField
    public boolean s;
    @JsonField
    public long t;
    @JsonField
    public JsonMomentCoverMedia u;
    @JsonField
    public c73 v;
    @JsonField
    public mph w;
    @JsonField(name = { "moment_access" })
    public soh x;
    @JsonField
    public sph y;
    
    public final n4j t() {
        final roh$a roh$a = new roh$a();
        roh$a.a = this.a;
        roh$a.b = this.b;
        roh$a.j = this.c;
        roh$a.d = this.d;
        roh$a.e = this.e;
        roh$a.f = this.f;
        roh$a.g = this.g;
        roh$a.h = this.h;
        roh$a.c = this.i;
        roh$a.i = this.j;
        roh$a.k = this.k;
        roh$a.l = this.l;
        roh$a.m = this.m;
        roh$a.n = this.n;
        roh$a.o = this.o;
        roh$a.p = this.p;
        roh$a.q = this.r;
        roh$a.r = this.s;
        roh$a.s = this.t;
        final JsonMomentCoverMedia u = this.u;
        aph t;
        if (u != null && u.b != null) {
            t = u.t();
        }
        else {
            t = null;
        }
        roh$a.t = t;
        roh$a.u = this.v;
        roh$a.v = this.w;
        roh$a.w = this.x;
        final sph y = this.y;
        final sph d0 = sph.D0;
        sph x = y;
        if (y == null) {
            x = d0;
        }
        roh$a.x = x;
        return (n4j)roh$a;
    }
}
