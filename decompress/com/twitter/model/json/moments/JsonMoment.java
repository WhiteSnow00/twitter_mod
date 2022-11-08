// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMoment extends lhh<moh>
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
    public z51 m;
    @JsonField
    public hil n;
    @JsonField
    public aca o;
    @JsonField
    public long p;
    @JsonField
    public Map<String, hfv> q;
    @JsonField
    public w87 r;
    @JsonField
    public boolean s;
    @JsonField
    public long t;
    @JsonField
    public JsonMomentCoverMedia u;
    @JsonField
    public l73 v;
    @JsonField
    public hph w;
    @JsonField(name = { "moment_access" })
    public noh x;
    @JsonField
    public nph y;
    
    @Override
    public final h4j t() {
        final moh$a moh$a = new moh$a();
        moh$a.a = this.a;
        moh$a.b = this.b;
        moh$a.j = this.c;
        moh$a.d = this.d;
        moh$a.e = this.e;
        moh$a.f = this.f;
        moh$a.g = this.g;
        moh$a.h = this.h;
        moh$a.c = this.i;
        moh$a.i = this.j;
        moh$a.k = this.k;
        moh$a.l = this.l;
        moh$a.m = this.m;
        moh$a.n = this.n;
        moh$a.o = this.o;
        moh$a.p = this.p;
        moh$a.q = this.r;
        moh$a.r = this.s;
        moh$a.s = this.t;
        final JsonMomentCoverMedia u = this.u;
        voh t;
        if (u != null && u.b != null) {
            t = u.t();
        }
        else {
            t = null;
        }
        moh$a.t = t;
        moh$a.u = this.v;
        moh$a.v = this.w;
        moh$a.w = this.x;
        final nph y = this.y;
        final nph c0 = nph.C0;
        nph x = y;
        if (y == null) {
            x = c0;
        }
        moh$a.x = x;
        return (h4j)moh$a;
    }
}
