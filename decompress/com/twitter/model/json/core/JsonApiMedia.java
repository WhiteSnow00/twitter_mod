// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.twitter.model.stratostore.MediaColorData;
import com.twitter.model.json.media.JsonOriginalInfo;
import java.util.Objects;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "Lcom/twitter/model/json/core/JsonApiMedia;", "Ltih;", "Lwtg;", "<init>", "()V", "Companion", "a", "subsystem.tfa.legacy.model.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonApiMedia extends tih<wtg>
{
    public static final JsonApiMedia.JsonApiMedia$a Companion;
    @JsonField(name = { "cta" })
    public JsonMediaCallToActions a;
    @JsonField(name = { "is360" })
    public boolean b;
    @JsonField
    public xrg c;
    @JsonField
    public String d;
    @JsonField(typeConverter = rg0.class)
    public og0 e;
    @JsonField(name = { "info" })
    public JsonApiMediaInfo f;
    @JsonField
    public String g;
    
    static {
        Companion = new JsonApiMedia.JsonApiMedia$a();
    }
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final wtg t() {
        final wtg$a wtg$a = new wtg$a();
        final String d = this.d;
        if (d != null) {
            final Long f1 = rlr.f1(d);
            if (f1 != null) {
                wtg$a.g = f1.longValue();
            }
        }
        final String g = this.g;
        if (g != null) {
            wtg$a.B = ywg.Companion.a(g);
        }
        wtg$a.D = this.c;
        wtg$a.A = this.b;
        final JsonMediaCallToActions a = this.a;
        final c1h c1h = null;
        final String s = null;
        final List list = null;
        lyw s2;
        if (a != null) {
            s2 = a.s();
        }
        else {
            s2 = null;
        }
        wtg$a.q = s2;
        Object e = null;
        Label_0288: {
            if ((e = this.e) == null) {
                final JsonApiMediaInfo f2 = this.f;
                Label_0176: {
                    if (f2 != null) {
                        final JsonApiImage a2 = f2.a;
                        if (a2 != null) {
                            e = new pf0(a2.a, a2.b, a2.c, a2.d, a2.e, a2.f);
                            break Label_0176;
                        }
                    }
                    e = null;
                }
                if (e == null) {
                    final JsonApiMediaInfo f3 = this.f;
                    Label_0234: {
                        if (f3 != null) {
                            final JsonApiVideo b = f3.b;
                            if (b != null) {
                                e = new hi0(b.a, b.b, b.c, b.d, b.e);
                                break Label_0234;
                            }
                        }
                        e = null;
                    }
                    if (e == null) {
                        final JsonApiMediaInfo f4 = this.f;
                        if (f4 != null) {
                            final JsonApiGif c = f4.c;
                            if (c != null) {
                                e = new jf0(c.a, c.b, c.c, (List)c.d);
                                break Label_0288;
                            }
                        }
                        e = null;
                    }
                }
            }
        }
        if (e instanceof pf0) {
            wtg$a.l = wtg$c.H0;
            final JsonApiMedia.JsonApiMedia$a companion = JsonApiMedia.Companion;
            final pf0 pf0 = (pf0)e;
            Objects.requireNonNull(companion);
            final JsonOriginalInfo jsonOriginalInfo = new JsonOriginalInfo();
            jsonOriginalInfo.a = pf0.c;
            jsonOriginalInfo.b = pf0.d;
            jsonOriginalInfo.c = pf0.e;
            wtg$a.p((hpj)jsonOriginalInfo.u().e());
            wtg$a.w = pf0.a;
            wtg$a.j = pf0.c;
            final MediaColorData b2 = pf0.b;
            List a3 = list;
            if (b2 != null) {
                a3 = b2.a;
            }
            wtg$a.z = a3;
            wtg$a.m = JsonApiMedia.JsonApiMedia$a.a(companion, pf0);
        }
        else if (e instanceof hi0) {
            wtg$a.l = wtg$c.J0;
            final JsonApiMedia.JsonApiMedia$a companion2 = JsonApiMedia.Companion;
            final hi0 hi0 = (hi0)e;
            Objects.requireNonNull(companion2);
            final JsonMediaVideoInfo jsonMediaVideoInfo = new JsonMediaVideoInfo();
            final ne0 a4 = hi0.a;
            jsonMediaVideoInfo.a = new int[] { a4.b, a4.a };
            jsonMediaVideoInfo.b = (float)hi0.b;
            jsonMediaVideoInfo.c = hi0.d;
            wtg$a.o = jsonMediaVideoInfo.t();
            final pf0 c2 = hi0.c;
            String c3;
            if (c2 != null) {
                c3 = c2.c;
            }
            else {
                c3 = null;
            }
            wtg$a.j = c3;
            final String e2 = hi0.e;
            c1h y = c1h;
            if (e2 != null) {
                final Long value = Long.valueOf(e2);
                e0e.e((Object)value, "valueOf(it)");
                y = new c1h(value.longValue());
            }
            wtg$a.y = y;
            wtg$a.m = JsonApiMedia.JsonApiMedia$a.a(companion2, hi0.c);
        }
        else if (e instanceof jf0) {
            wtg$a.l = wtg$c.I0;
            final JsonApiMedia.JsonApiMedia$a companion3 = JsonApiMedia.Companion;
            final jf0 jf0 = (jf0)e;
            Objects.requireNonNull(companion3);
            final JsonMediaVideoInfo jsonMediaVideoInfo2 = new JsonMediaVideoInfo();
            final ne0 b3 = jf0.b;
            jsonMediaVideoInfo2.a = new int[] { b3.b, b3.a };
            jsonMediaVideoInfo2.c = jf0.d;
            wtg$a.o = jsonMediaVideoInfo2.t();
            wtg$a.w = jf0.a;
            final pf0 c4 = jf0.c;
            String c5 = s;
            if (c4 != null) {
                c5 = c4.c;
            }
            wtg$a.j = c5;
            wtg$a.m = JsonApiMedia.JsonApiMedia$a.a(companion3, c4);
        }
        return (wtg)((z4j)wtg$a).e();
    }
}
