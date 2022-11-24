// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineTweet extends tih<o7t>
{
    @JsonField
    public gqu$a a;
    @JsonField
    public String b;
    @JsonField(name = { "tweetDisplayType", "displayType" }, typeConverter = JsonTimelineTweet.JsonTimelineTweet$b.class)
    public String c;
    @JsonField(typeConverter = JsonTimelineTweet.JsonTimelineTweet$a.class)
    public String d;
    @JsonField(name = { "tweetPromotedMetadata", "promotedMetadata" })
    public JsonPromotedContentUrt e;
    @JsonField(typeConverter = d.class)
    public o5t f;
    @JsonField
    public JsonTweetHighlights g;
    @JsonField
    public hsv h;
    @JsonField
    public nat i;
    @JsonField
    public lxk j;
    @JsonField(typeConverter = a2t.class)
    public z1t k;
    @JsonField
    public boolean l;
    @JsonField
    public boolean m;
    @JsonField
    public ufu n;
    @JsonField(name = { "tweetSocialProof" }, typeConverter = d.class)
    public o5t o;
    @JsonField
    public kmu p;
    @JsonField
    public kmu q;
    @JsonField
    public List<n0m.b> r;
    @JsonField
    public p7t s;
    @JsonField
    public yus t;
    @JsonField
    public vg1 u;
    
    public JsonTimelineTweet() {
        this.c = "unknown";
        this.d = "unknown";
    }
    
    @Override
    public final Object s() {
        final boolean a = p4l.a(this.a);
        final o7t o7t = null;
        final List list = null;
        Object o;
        Object o3;
        Object o2;
        Object o4;
        Object b;
        nnu nnu2;
        if (a) {
            final oh0$a v = nv8.v(this.a);
            Object value = null;
            n0j i0 = null;
            vcf j0 = null;
            Label_0116: {
                if (v != null) {
                    final vg3$b l0 = v.L0;
                    if (l0 != null) {
                        value = String.valueOf(l0.o(true));
                        y4c.d().p(v);
                        final gqu k0 = v.K0;
                        if (k0 instanceof e1v) {
                            final e1v e1v = (e1v)k0;
                            i0 = e1v.I0;
                            j0 = e1v.J0;
                        }
                        else {
                            j0 = null;
                            i0 = null;
                        }
                        this.t((gqu)nv8.t(this.a));
                        break Label_0116;
                    }
                }
                j0 = null;
                value = (i0 = null);
            }
            o = j0;
            final nnu nnu = null;
            o2 = (o3 = null);
            o4 = i0;
            b = value;
            nnu2 = nnu;
        }
        else if (p4l.e(this.a) && ita.b().b("tweet_with_visibility_results_parse_twvr_enabled", false)) {
            final gqu$a a2 = this.a;
            e1v e1v2;
            if (p4l.e(a2)) {
                e1v2 = (e1v)((z4j)a2).e();
            }
            else {
                e1v2 = null;
            }
            Object h0;
            n0j i2;
            Object i4;
            Object o5;
            if (e1v2 != null) {
                final String value2 = String.valueOf(e1v2.F0.K0.a(true));
                this.p = e1v2.G0;
                h0 = e1v2.H0;
                i2 = e1v2.I0;
                final vcf j2 = e1v2.J0;
                final gqu i3 = e1v2.F0.I0;
                vcf j3;
                if (i3 instanceof e1v) {
                    final e1v e1v3 = (e1v)i3;
                    i4 = e1v3.I0;
                    j3 = e1v3.J0;
                }
                else {
                    j3 = null;
                    i4 = null;
                }
                y4c.d().p(new oh0$a(e1v2.F0));
                this.t((gqu)e1v2);
                o = j3;
                b = value2;
                o5 = j2;
            }
            else {
                o = null;
                b = null;
                h0 = (i2 = (n0j)b);
                o5 = (i4 = i2);
            }
            final Object o6 = h0;
            o3 = o5;
            final Object o7 = i4;
            nnu2 = (nnu)o6;
            o2 = i2;
            o4 = o7;
        }
        else {
            if (p4l.c(this.a)) {
                final nuu x = nv8.x(this.a);
                if (x != null && x.F0 != null) {
                    return new o7t("", "TweetTombstone", (String)null, (gjl)null, (o5t)null, (List)null, (hsv)null, (nat)null, (lxk)null, (z1t)null, false, false, (ufu)null, (agv)null, (kmu)null, (kmu)null, (nnu)null, (n0j)null, (n0j)null, (vcf)null, (vcf)null, (List)null, (p7t)null, x.F0, (yus)null, (vg1)null, (tdk)tdk.G0);
                }
                b = null;
            }
            else {
                b = this.b;
            }
            nnu2 = null;
            o2 = (o4 = null);
            o3 = (o = o4);
        }
        o7t o7t2 = o7t;
        if (b != null) {
            o7t2 = o7t;
            if (!this.c.equals("unknown")) {
                final gjl gjl = yih.b(this.e);
                if (ita.c().b("contextv2_plus_projectnah_context_enabled", false) && this.f == null) {
                    final ufu n = this.n;
                    if (n != null) {
                        final agv.b b2 = new agv.b();
                        b2.j = n.a;
                        b2.k = n.b;
                        b2.m = n.c;
                        b2.l = n.d;
                        this.f = (o5t)b2.e();
                    }
                }
                final String c = this.c;
                final String d = this.d;
                final o5t f = this.f;
                final JsonTweetHighlights g = this.g;
                Object a3 = list;
                if (g != null) {
                    a3 = g.a;
                }
                o7t2 = new o7t((String)b, c, d, gjl, f, (List)a3, this.h, this.i, this.j, this.k, this.l, this.m, this.n, ix.w(this.o), this.p, this.q, nnu2, (n0j)o2, (n0j)o4, (vcf)o3, (vcf)o, (List)this.r, this.s, (hsv)null, this.t, this.u, (tdk)tdk.G0);
            }
        }
        return o7t2;
    }
    
    public final void t(gqu i0) {
        final oh0 u = nv8.u(i0);
        if (u != null) {
            i0 = u.I0;
            if (i0 != null) {
                if (i0 instanceof e1v) {
                    final int a = o5j.a;
                    final e1v e1v = (e1v)i0;
                    if (e1v.G0 != null && ita.b().b("tweet_with_visibility_results_prefer_gql_soft_interventions_enabled", false)) {
                        this.q = e1v.G0;
                    }
                    if (e1v.H0 != null && ita.b().b("tweet_with_visibility_results_prefer_gql_tweet_interstitials_enabled", false)) {
                        this.h = (hsv)((z4j)hsv.a.o(e1v.H0)).e();
                    }
                }
                else if (i0 instanceof nuu) {
                    final int a2 = o5j.a;
                    this.h = ((nuu)i0).F0;
                }
            }
        }
    }
}
