// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.List;
import android.annotation.SuppressLint;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTwitterAccountUser extends lhh<hfv>
{
    @JsonField
    public long a;
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
    @JsonField(name = { "url_https" })
    public String g;
    @JsonField
    public String h;
    @JsonField
    public String i;
    @JsonField
    public int j;
    @JsonField
    public int k;
    @JsonField
    public int l;
    @JsonField
    public int m;
    @JsonField
    public int n;
    @JsonField(name = { "protected" })
    public boolean o;
    @JsonField
    public boolean p;
    @JsonField
    public boolean q;
    @JsonField
    public boolean r;
    @JsonField
    public boolean s;
    @JsonField
    public boolean t;
    @JsonField(name = { "has_extended_profile" })
    public boolean u;
    @SuppressLint({ "NullableEnum" })
    @JsonField(typeConverter = oje.class)
    public k0u v;
    @JsonField(name = { "advertiser_account_service_levels" }, typeConverter = dge.class)
    public List<wv> w;
    
    public JsonTwitterAccountUser() {
        this.n = -1;
    }
    
    public static JsonTwitterAccountUser u(final hfv hfv) {
        final JsonTwitterAccountUser jsonTwitterAccountUser = new JsonTwitterAccountUser();
        jsonTwitterAccountUser.a = hfv.C0;
        jsonTwitterAccountUser.b = hfv.c();
        jsonTwitterAccountUser.c = hfv.J0;
        jsonTwitterAccountUser.d = hfv.D0;
        jsonTwitterAccountUser.e = hfv.d1;
        jsonTwitterAccountUser.f = ((xwm)hfv.F0).C0;
        jsonTwitterAccountUser.g = hfv.G0;
        jsonTwitterAccountUser.h = hfv.P0;
        jsonTwitterAccountUser.i = Long.toString(hfv.L1);
        jsonTwitterAccountUser.l = hfv.U0;
        jsonTwitterAccountUser.j = hfv.K1;
        jsonTwitterAccountUser.k = hfv.T0;
        jsonTwitterAccountUser.m = hfv.V0;
        jsonTwitterAccountUser.n = hfv.W0;
        jsonTwitterAccountUser.p = hfv.X0;
        jsonTwitterAccountUser.o = hfv.L0;
        jsonTwitterAccountUser.q = hfv.M0;
        jsonTwitterAccountUser.r = hfv.N0;
        jsonTwitterAccountUser.s = hfv.K0;
        jsonTwitterAccountUser.t = hfv.f1;
        jsonTwitterAccountUser.u = (hfv.R0 ^ true);
        jsonTwitterAccountUser.v = hfv.l1;
        jsonTwitterAccountUser.w = hfv.m1;
        return jsonTwitterAccountUser;
    }
    
    @Override
    public final h4j<hfv> t() {
        final hfv$b hfv$b = new hfv$b();
        ((hfv$a)hfv$b).a = this.a;
        final int a = w4j.a;
        ((hfv$a)hfv$b).b = this.b;
        ((hfv$a)hfv$b).i = this.c;
        ((hfv$a)hfv$b).z(this.d);
        ((hfv$a)hfv$b).x(this.e);
        ((hfv$a)hfv$b).w(new jeu(this.f, (kju)null, (Map)null));
        ((hfv$a)hfv$b).A(this.g);
        ((hfv$a)hfv$b).t(this.h);
        ((hfv$a)hfv$b).u = this.l;
        ((hfv$a)hfv$b).s = this.j;
        ((hfv$a)hfv$b).t = this.k;
        ((hfv$a)hfv$b).w = this.m;
        ((hfv$a)hfv$b).x = this.n;
        ((hfv$a)hfv$b).y = this.p;
        ((hfv$a)hfv$b).k = this.o;
        ((hfv$a)hfv$b).l = this.q;
        ((hfv$a)hfv$b).m = this.r;
        ((hfv$a)hfv$b).j = this.s;
        ((hfv$a)hfv$b).I = this.t;
        ((hfv$a)hfv$b).q = (this.u ^ true);
        final k0u v = this.v;
        final k0u d0 = k0u.D0;
        k0u p = v;
        if (v == null) {
            p = d0;
        }
        ((hfv$a)hfv$b).P = p;
        ((hfv$a)hfv$b).Q = this.w;
        try {
            ((hfv$a)hfv$b).v = Long.parseLong(this.i);
        }
        catch (final NumberFormatException ex) {
            ((hfv$a)hfv$b).v = mq1.h((SimpleDateFormat)mq1.b, this.i);
            final int a2 = w4j.a;
        }
        return (h4j<hfv>)hfv$b;
    }
}
