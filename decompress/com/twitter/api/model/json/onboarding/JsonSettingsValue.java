// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.onboarding;

import com.twitter.api.model.json.core.JsonApiTweet;
import java.util.Objects;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSettingsValue extends fih<wqp>
{
    @Deprecated
    @JsonField
    public JsonOcfRichText a;
    @Deprecated
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public String c;
    @JsonField(typeConverter = xqp.class)
    public int d;
    @JsonField
    public JsonSettingsValue.JsonSettingsValue$JsonValueData e;
    
    public final /* bridge */ Object s() {
        return this.u();
    }
    
    public final <T extends wqp$a<? extends wqp, T>> T t(final T t) {
        t.a = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        t.b = JsonOcfRichText.s(this.b);
        t.c = this.c;
        t.d = this.d;
        return t;
    }
    
    public final wqp u() {
        switch (this.d) {
            default: {
                final b2j$a b2j$a = new b2j$a();
                this.t(b2j$a);
                return (wqp)((n4j)b2j$a).e();
            }
            case 17: {
                final ki3$a u = this.e.o.u();
                this.t(u);
                return (wqp)((n4j)u).e();
            }
            case 16: {
                final JsonSettingsValue.JsonSettingsValue$JsonSpacerData n = this.e.n;
                Objects.requireNonNull(n);
                final hoq.a a = new hoq.a();
                a.e = n.a;
                this.t(a);
                return (wqp)((n4j)a).e();
            }
            case 15: {
                final JsonSettingsValue.JsonSettingsValue$JsonAlertExampleData m = this.e.m;
                this.a = m.a;
                this.b = m.b;
                final yw$b u2 = m.u();
                this.t(u2);
                return (wqp)((n4j)u2).e();
            }
            case 14: {
                final JsonSettingsValue.JsonSettingsValue$JsonInfoItemData l = this.e.l;
                this.a = l.a;
                final tld$a u3 = l.u();
                this.t(u3);
                return (wqp)((n4j)u3).e();
            }
            case 13: {
                final f8d$a u4 = this.e.k.u();
                this.t(u4);
                return (wqp)((n4j)u4).e();
            }
            case 12: {
                final z43.a u5 = this.e.j.u();
                this.t(u5);
                return (wqp)((n4j)u5).e();
            }
            case 11: {
                final JsonSettingsValue.JsonSettingsValue$JsonButtonItemData i = this.e.i;
                this.a = i.d;
                this.b = i.e;
                final r43$a u6 = i.u();
                this.t(u6);
                return (wqp)((n4j)u6).e();
            }
            case 10: {
                final JsonSettingsValue.JsonSettingsValue$JsonTweetData h = this.e.h;
                Objects.requireNonNull(h);
                final rsu$a rsu$a = new rsu$a();
                final JsonApiTweet a2 = h.a;
                if (a2 != null) {
                    final nh0 e = (nh0)((qhh)a2).s();
                    if (e != null) {
                        rsu$a.e = e;
                    }
                }
                this.t(rsu$a);
                return (wqp)((n4j)rsu$a).e();
            }
            case 9: {
                final igt.a u7 = this.e.g.u();
                this.t(u7);
                return (wqp)((n4j)u7).e();
            }
            case 8: {
                final JsonSettingsValue.JsonSettingsValue$JsonProgressIndicatorData f = this.e.f;
                this.a = f.a;
                this.b = f.b;
                final rhl$a u8 = f.u();
                this.t(u8);
                return (wqp)((n4j)u8).e();
            }
            case 7: {
                final JsonSettingsValue.JsonSettingsValue$JsonListData e2 = this.e.e;
                Objects.requireNonNull(e2);
                final vlf$a vlf$a = new vlf$a();
                vlf$a.e = e2.a;
                vlf$a.f = e2.b;
                vlf$a.g = e2.c;
                this.t(vlf$a);
                return (wqp)((n4j)vlf$a).e();
            }
            case 5: {
                final JsonSettingsValue.JsonSettingsValue$JsonGroupSettingsData d = this.e.d;
                Objects.requireNonNull(d);
                final i8c.a a3 = new i8c.a();
                a3.e = d.a;
                a3.f = d.b;
                this.t(a3);
                return (wqp)((n4j)a3).e();
            }
            case 4: {
                final zk.b u9 = this.e.c.u();
                u9.f = true;
                this.t(u9);
                return (wqp)((n4j)u9).e();
            }
            case 3: {
                final zk.b u10 = this.e.c.u();
                this.t(u10);
                return (wqp)((n4j)u10).e();
            }
            case 2:
            case 6: {
                final JsonSettingsValue.JsonSettingsValue$JsonBooleanData b = this.e.b;
                Objects.requireNonNull(b);
                final g72.b b2 = new g72.b();
                b2.e = b.a;
                this.t(b2);
                return (wqp)((n4j)b2).e();
            }
            case 1: {
                final JsonSettingsValue.JsonSettingsValue$JsonValueData e3 = this.e;
                wqp$a<par, par.a> wqp$a = null;
                Label_0760: {
                    if (e3 != null) {
                        final JsonSettingsValue.JsonSettingsValue$JsonStaticTextData a4 = e3.a;
                        if (a4 != null) {
                            final par.a u11 = a4.u();
                            final JsonSettingsValue.JsonSettingsValue$JsonStaticTextData a5 = this.e.a;
                            final JsonOcfRichText a6 = a5.a;
                            if (a6 != null) {
                                this.a = a6;
                            }
                            final JsonOcfRichText b3 = a5.b;
                            wqp$a = u11;
                            if (b3 != null) {
                                this.b = b3;
                                wqp$a = u11;
                            }
                            break Label_0760;
                        }
                    }
                    wqp$a = new par.a();
                }
                this.t((n4j)wqp$a);
                return (wqp)((n4j)wqp$a).e();
            }
        }
    }
}
