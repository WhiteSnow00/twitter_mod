// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPhoneVerification extends qhh<hck>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public String d;
    @JsonField
    public pcj e;
    @JsonField
    public ssv f;
    @JsonField
    public ssv g;
    @JsonField
    public ssv h;
    @JsonField
    public String i;
    @JsonField
    public boolean j;
    @JsonField
    public pcj k;
    @JsonField
    public Integer l;
    @JsonField
    public JsonOcfComponentCollection m;
    
    public final n4j t() {
        final hck$a hck$a = new hck$a();
        ((dtr$a)hck$a).f = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        ((dtr$a)hck$a).g = JsonOcfRichText.s(this.b);
        ((qdk.a)hck$a).k = JsonOcfRichText.s(this.c);
        ((qdk.a)hck$a).l = this.d;
        hck$a.n = this.i;
        hck$a.o = this.e;
        hck$a.p = this.j;
        hck$a.q = this.k;
        ((dtr$a)hck$a).a = this.f;
        ((dtr$a)hck$a).c = this.g;
        ((qdk.a)hck$a).m = this.h;
        hck$a.r = this.l;
        final JsonOcfComponentCollection m = this.m;
        x06 t;
        if (m != null) {
            t = m.t();
        }
        else {
            t = null;
        }
        ((dtr$a)hck$a).j = t;
        return (n4j)hck$a;
    }
}
