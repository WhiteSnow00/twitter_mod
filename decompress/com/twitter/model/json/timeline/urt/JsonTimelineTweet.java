// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineTweet extends aih<c6t>
{
    @JsonField
    public apu$a a;
    @JsonField
    public String b;
    @JsonField(name = { "tweetDisplayType", "displayType" }, typeConverter = JsonTimelineTweet.JsonTimelineTweet$b.class)
    public String c;
    @JsonField(typeConverter = JsonTimelineTweet.JsonTimelineTweet$a.class)
    public String d;
    @JsonField(name = { "tweetPromotedMetadata", "promotedMetadata" })
    public JsonPromotedContentUrt e;
    @JsonField(typeConverter = d.class)
    public d4t f;
    @JsonField
    public JsonTweetHighlights g;
    @JsonField
    public brv h;
    @JsonField
    public b9t i;
    @JsonField
    public mwk j;
    @JsonField(typeConverter = r0t.class)
    public q0t k;
    @JsonField
    public boolean l;
    @JsonField
    public boolean m;
    @JsonField
    public meu n;
    @JsonField(name = { "tweetSocialProof" }, typeConverter = d.class)
    public d4t o;
    @JsonField
    public elu p;
    @JsonField
    public elu q;
    @JsonField
    public List<ozl.b> r;
    @JsonField
    public d6t s;
    @JsonField
    public nts t;
    @JsonField
    public wg1 u;
    
    public JsonTimelineTweet() {
        this.c = "unknown";
        this.d = "unknown";
    }
    
    @Override
    public final Object s() {
        final boolean e = sbl.e(this.a);
        final c6t c6t = null;
        final List list = null;
        Object o;
        Object o3;
        Object o5;
        Object o4;
        Object o6;
        Object b;
        if (e) {
            final rh0$a f = t4a.f(this.a);
            Object value = null;
            uzi f2 = null;
            Object g0 = null;
            Label_0133: {
                if (f != null) {
                    final mg3$b i0 = f.I0;
                    if (i0 != null) {
                        value = String.valueOf(i0.o(true));
                        u4c.d().p(f);
                        final apu h0 = f.H0;
                        if (h0 instanceof yzu) {
                            final yzu yzu = (yzu)h0;
                            f2 = yzu.F0;
                            g0 = yzu.G0;
                        }
                        else {
                            g0 = (f2 = null);
                        }
                        this.t((apu)t4a.d(this.a));
                        break Label_0133;
                    }
                }
                g0 = null;
                value = (f2 = (uzi)g0);
            }
            o = g0;
            final Object o2 = value;
            o3 = null;
            o4 = (o5 = o3);
            o6 = f2;
            b = o2;
        }
        else if (sbl.i(this.a) && dta.b().b("tweet_with_visibility_results_parse_twvr_enabled", false)) {
            final apu$a a = this.a;
            yzu yzu2;
            if (sbl.i(a)) {
                yzu2 = (yzu)((yzu.a)a).e();
            }
            else {
                yzu2 = null;
            }
            Object e2;
            uzi f3;
            Object f5;
            Object o7;
            if (yzu2 != null) {
                final String value2 = String.valueOf(yzu2.C0.H0.a(true));
                this.p = yzu2.D0;
                e2 = yzu2.E0;
                f3 = yzu2.F0;
                final mcf g2 = yzu2.G0;
                final apu f4 = yzu2.C0.F0;
                Object g3;
                if (f4 instanceof yzu) {
                    final yzu yzu3 = (yzu)f4;
                    f5 = yzu3.F0;
                    g3 = yzu3.G0;
                }
                else {
                    g3 = (f5 = null);
                }
                u4c.d().p(new rh0$a(yzu2.C0));
                this.t((apu)yzu2);
                o = g3;
                b = value2;
                o7 = g2;
            }
            else {
                o = (b = null);
                e2 = (f3 = (uzi)b);
                o7 = (f5 = f3);
            }
            final Object o8 = e2;
            o5 = o7;
            final Object o9 = f5;
            o3 = o8;
            o4 = f3;
            o6 = o9;
        }
        else {
            if (sbl.g(this.a)) {
                final ftu h2 = t4a.h(this.a);
                if (h2 != null && h2.C0 != null) {
                    return new c6t("", "TweetTombstone", (String)null, (hil)null, (d4t)null, (List)null, (brv)null, (b9t)null, (mwk)null, (q0t)null, false, false, (meu)null, (rev)null, (elu)null, (elu)null, (hmu)null, (uzi)null, (uzi)null, (mcf)null, (mcf)null, (List)null, (d6t)null, h2.C0, (nts)null, (wg1)null, (zck)zck.D0);
                }
                b = null;
            }
            else {
                b = this.b;
            }
            o3 = null;
            o4 = (o6 = o3);
            o5 = (o = o6);
        }
        c6t c6t2 = c6t;
        if (b != null) {
            c6t2 = c6t;
            if (!this.c.equals("unknown")) {
                final hil hil = (hil)fih.b((aih)this.e);
                if (dta.c().b("contextv2_plus_projectnah_context_enabled", false) && this.f == null) {
                    final meu n = this.n;
                    if (n != null) {
                        final rev$b rev$b = new rev$b();
                        rev$b.j = n.a;
                        rev$b.k = n.b;
                        rev$b.m = n.c;
                        rev$b.l = n.d;
                        this.f = (d4t)((h4j)rev$b).e();
                    }
                }
                final String c = this.c;
                final String d = this.d;
                final d4t f6 = this.f;
                final JsonTweetHighlights g4 = this.g;
                Object a2 = list;
                if (g4 != null) {
                    a2 = g4.a;
                }
                c6t2 = new c6t((String)b, c, d, hil, f6, (List)a2, this.h, this.i, this.j, this.k, this.l, this.m, this.n, poa.V(this.o), this.p, this.q, (hmu)o3, (uzi)o4, (uzi)o6, (mcf)o5, (mcf)o, (List)this.r, this.s, (brv)null, this.t, this.u, (zck)zck.D0);
            }
        }
        return c6t2;
    }
    
    public final void t(apu f0) {
        final rh0 e = t4a.e(f0);
        if (e != null) {
            f0 = e.F0;
            if (f0 != null) {
                if (f0 instanceof yzu) {
                    final int a = w4j.a;
                    final yzu yzu = (yzu)f0;
                    if (yzu.D0 != null && dta.b().b("tweet_with_visibility_results_prefer_gql_soft_interventions_enabled", false)) {
                        this.q = yzu.D0;
                    }
                    if (yzu.E0 != null && dta.b().b("tweet_with_visibility_results_prefer_gql_tweet_interstitials_enabled", false)) {
                        this.h = (brv)((h4j)brv$a.o(yzu.E0)).e();
                    }
                }
                else if (f0 instanceof ftu) {
                    final int a2 = w4j.a;
                    this.h = ((ftu)f0).C0;
                }
            }
        }
    }
}
