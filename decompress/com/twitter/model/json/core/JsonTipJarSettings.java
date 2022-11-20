// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTipJarSettings extends qhh<udt>
{
    @JsonField(name = { "bandcamp_handle" })
    public String a;
    @JsonField(name = { "bitcoin_handle" })
    public String b;
    @JsonField(name = { "cash_app_handle" })
    public String c;
    @JsonField(name = { "chipper_handle" })
    public String d;
    @JsonField(name = { "ethereum_handle" })
    public String e;
    @JsonField(name = { "flutterwave_handle" })
    public String f;
    @JsonField(name = { "gofundme_handle" })
    public String g;
    @JsonField(name = { "is_enabled" })
    public boolean h;
    @JsonField(name = { "paga_handle" })
    public String i;
    @JsonField(name = { "patreon_handle" })
    public String j;
    @JsonField(name = { "pay_pal_handle" })
    public String k;
    @JsonField(name = { "paytm_handle" })
    public String l;
    @JsonField(name = { "picpay_handle" })
    public String m;
    @JsonField(name = { "razorpay_handle" })
    public String n;
    @JsonField(name = { "strike_handle" })
    public String o;
    @JsonField(name = { "venmo_handle" })
    public String p;
    @JsonField(name = { "wealthsimple_handle" })
    public String q;
    @JsonField(name = { "kakao_handle" })
    public String r;
    
    public final n4j t() {
        final udt$a udt$a = new udt$a();
        udt$a.a = this.a;
        udt$a.b = this.b;
        udt$a.c = this.c;
        udt$a.d = this.d;
        udt$a.e = this.e;
        udt$a.f = this.f;
        udt$a.g = this.g;
        udt$a.o(this.h);
        udt$a.j = this.j;
        udt$a.i = this.i;
        udt$a.k = this.k;
        udt$a.l = this.l;
        udt$a.m = this.m;
        udt$a.n = this.n;
        udt$a.o = this.o;
        udt$a.p = this.p;
        udt$a.q = this.q;
        udt$a.r = this.r;
        return (n4j)udt$a;
    }
}
