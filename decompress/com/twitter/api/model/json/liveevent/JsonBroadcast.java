// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.liveevent;

import tv.periscope.model.b$a;
import tv.periscope.model.NarrowcastSpaceType;
import java.util.Collection;
import java.util.ArrayList;
import tv.periscope.model.a$a;
import com.twitter.api.model.json.core.JsonApiTweet;
import com.twitter.api.model.json.core.GraphqlJsonTwitterUser;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import tv.periscope.model.b;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonBroadcast extends lhh<b>
{
    public static final Long w0;
    @JsonField
    public Boolean A;
    @JsonField
    public int B;
    @JsonField
    public int C;
    @JsonField
    public int D;
    @JsonField(name = { "is_360" })
    public boolean E;
    @JsonField
    public boolean F;
    @JsonField
    public String G;
    @JsonField
    public String H;
    @JsonField
    public String I;
    @JsonField
    public String J;
    @JsonField
    public double K;
    @JsonField
    public double L;
    @JsonField
    public String M;
    @JsonField
    public String N;
    @JsonField
    public String O;
    @JsonField
    public String P;
    @JsonField(name = { "start_ms", "start_time" })
    public String Q;
    @JsonField(name = { "end_ms", "end_time" })
    public String R;
    @JsonField(name = { "ping_ms", "ping_time" })
    public String S;
    @JsonField(name = { "timedout_ms", "timedout_time" })
    public String T;
    @JsonField
    public String U;
    @JsonField
    public Integer V;
    @JsonField
    public boolean W;
    @JsonField(name = { "copyright_violation_interstitial" })
    public boolean X;
    @JsonField(name = { "copyright_violation_copyright_holder_name" })
    public String Y;
    @JsonField(name = { "copyright_violation_copyright_content_name" })
    public String Z;
    @JsonField(name = { "broadcast_id", "rest_id" })
    public String a;
    @JsonField(name = { "copyright_violation_broadcaster_whitelisted" })
    public boolean a0;
    @JsonField
    public String b;
    @JsonField(name = { "copyright_violation_match_disputed" })
    public boolean b0;
    @JsonField
    public String c;
    @JsonField(name = { "copyright_violation_match_accepted" })
    public boolean c0;
    @JsonField
    public String d;
    @JsonField
    public JsonBroadcast.JsonBroadcast$JsonBroadcastCopyrightViolation d0;
    @JsonField
    public String e;
    @JsonField(name = { "replay_edited_start_time" })
    public Long e0;
    @JsonField
    public String f;
    @JsonField(name = { "replay_edited_thumbnail_time" })
    public Long f0;
    @JsonField
    public String g;
    @JsonField(name = { "replay_title_edited" })
    public Boolean g0;
    @JsonField
    public String h;
    @JsonField(name = { "replay_title_editing_disabled" })
    public Boolean h0;
    @JsonField
    public String i;
    @JsonField(name = { "call_in_disabled" })
    public Boolean i0;
    @JsonField
    public String j;
    @JsonField(name = { "scheduled_start_time", "scheduled_start_ms" })
    public Long j0;
    @JsonField
    public String k;
    @JsonField(name = { "scheduled_end_ms" })
    public Long k0;
    @JsonField
    public List<String> l;
    @JsonField
    public Boolean l0;
    @JsonField(name = { "broadcast_source", "source" })
    public String m;
    @JsonField(name = { "pre_live_slate_url" })
    public String m0;
    @JsonField
    public boolean n;
    @JsonField
    public JsonBroadcast.JsonBroadcast$JsonBroadcastLocation n0;
    @JsonField
    public String o;
    @JsonField
    public JsonBroadcast.JsonBroadcast$JsonPeriscopeUser o0;
    @JsonField
    public String p;
    @JsonField
    public Boolean p0;
    @JsonField
    public String q;
    @JsonField
    public GraphqlJsonTwitterUser q0;
    @JsonField
    public String r;
    @JsonField
    public JsonApiTweet r0;
    @JsonField
    public String s;
    @JsonField
    public JsonBroadcast.JsonBroadcast$JsonBroadcastEditedReplay s0;
    @JsonField
    public String t;
    @JsonField(name = { "scheduled_start" })
    public String t0;
    @JsonField
    public String u;
    @JsonField(name = { "enable_server_audio_transcription" })
    public boolean u0;
    @JsonField
    public boolean v;
    @JsonField(name = { "narrow_cast_space_type" })
    public int v0;
    @JsonField
    public boolean w;
    @JsonField
    public boolean x;
    @JsonField
    public boolean y;
    @JsonField
    public boolean z;
    
    static {
        w0 = -1L;
    }
    
    @Override
    public final h4j t() {
        final String o = this.O;
        final gw6 gw6 = null;
        Long value;
        if (o == null) {
            value = null;
        }
        else {
            value = pjr.o(o, 0L);
        }
        final String p = this.P;
        Long value2;
        if (p == null) {
            value2 = null;
        }
        else {
            value2 = pjr.o(p, 0L);
        }
        final b$a g = tv.periscope.model.b.g();
        final String a = this.a;
        final String s = "";
        String c = a;
        if (a == null) {
            c = "";
        }
        final a$a a$a = (a$a)g;
        a$a.c = c;
        a$a.d = this.b;
        a$a.j(pjr.o(this.e, 0L));
        a$a.z(pjr.o(this.f, 0L));
        a$a.i = this.g;
        a$a.t = this.h;
        a$a.u = this.i;
        a$a.e = this.k;
        ArrayList f;
        if (this.l != null) {
            f = new ArrayList(this.l);
        }
        else {
            f = null;
        }
        a$a.F = f;
        final JsonBroadcast.JsonBroadcast$JsonPeriscopeUser o2 = this.o0;
        String s2;
        if (o2 != null && pjr.g((CharSequence)o2.a)) {
            s2 = this.o0.a;
        }
        else {
            s2 = this.o;
        }
        String n = s2;
        if (s2 == null) {
            n = "";
        }
        a$a.n = n;
        final JsonBroadcast.JsonBroadcast$JsonPeriscopeUser o3 = this.o0;
        String l;
        if (o3 != null && pjr.g((CharSequence)o3.b)) {
            l = this.o0.b;
        }
        else {
            l = this.p;
        }
        a$a.L = l;
        String q = this.q;
        if (q == null) {
            q = s;
        }
        a$a.z = q;
        a$a.A = this.r;
        a$a.B = this.u();
        a$a.C = this.v();
        a$a.q(this.v);
        a$a.v(this.w);
        a$a.l(this.x);
        a$a.n(this.y);
        a$a.s = this.U;
        a$a.g(this.z);
        final Boolean a2 = this.A;
        final boolean b = true;
        a$a.y(a2 != null && a2);
        a$a.c(this.B);
        a$a.C(this.C);
        a$a.b(this.D);
        a$a.f(this.E);
        a$a.m(this.n0 != null || this.F);
        final JsonBroadcast.JsonBroadcast$JsonBroadcastLocation n2 = this.n0;
        lb1 f2;
        if (n2 != null) {
            f2 = new lb1(n2.d, n2.c, n2.e);
        }
        else {
            f2 = new lb1(this.H, this.G, this.I);
        }
        a$a.f = (w5g)f2;
        double n3;
        if (n2 != null) {
            n3 = n2.a;
        }
        else {
            n3 = this.K;
        }
        a$a.o(n3);
        final JsonBroadcast.JsonBroadcast$JsonBroadcastLocation n4 = this.n0;
        double n5;
        if (n4 != null) {
            n5 = n4.b;
        }
        else {
            n5 = this.L;
        }
        a$a.p(n5);
        final JsonApiTweet r0 = this.r0;
        String m = null;
        Label_0665: {
            if (r0 != null) {
                final long u = r0.U;
                if (u != -1L) {
                    m = String.valueOf(u);
                    break Label_0665;
                }
            }
            m = this.M;
        }
        a$a.M = m;
        a$a.K = this.N;
        a$a.D = wl2.b(this.m);
        a$a.w(pjr.o(this.Q, 0L));
        a$a.s(pjr.o(this.S, 0L));
        a$a.d(this.W);
        a$a.x(pjr.o(this.T, 0L));
        final JsonBroadcast.JsonBroadcast$JsonBroadcastCopyrightViolation d0 = this.d0;
        gw6 t;
        if (d0 != null) {
            if (!d0.d) {
                t = gw6;
            }
            else {
                final gw6$a b2 = gw6.b();
                final JsonBroadcast.JsonBroadcast$JsonBroadcastCopyrightViolation d2 = this.d0;
                final String c2 = d2.c;
                final y91$a y91$a = (y91$a)b2;
                y91$a.a = c2;
                y91$a.b = d2.b;
                y91$a.d((boolean)d2.a);
                y91$a.b((boolean)this.d0.f);
                y91$a.c((boolean)this.d0.e);
                t = y91$a.a();
            }
        }
        else if (!this.X) {
            t = gw6;
        }
        else {
            final gw6$a b3 = gw6.b();
            final String y = this.Y;
            final y91$a y91$a2 = (y91$a)b3;
            y91$a2.a = y;
            y91$a2.b = this.Z;
            y91$a2.d(this.a0);
            y91$a2.b(this.b0);
            y91$a2.c(this.c0);
            t = y91$a2.a();
        }
        a$a.T = t;
        a$a.U = this.V;
        final JsonBroadcast.JsonBroadcast$JsonBroadcastEditedReplay s3 = this.s0;
        Long v;
        if (s3 != null) {
            v = s3.a;
        }
        else {
            v = this.e0;
        }
        a$a.v = v;
        Long w = null;
        Label_1001: {
            if (s3 != null) {
                w = s3.b;
                if (w != null) {
                    break Label_1001;
                }
            }
            w = this.f0;
        }
        a$a.w = w;
        boolean b4 = false;
        Label_1057: {
            Label_1054: {
                if (s3 != null) {
                    final Boolean d3 = s3.d;
                    if (d3 == null || !d3) {
                        break Label_1054;
                    }
                }
                else {
                    final Boolean g2 = this.g0;
                    if (g2 == null || !g2) {
                        break Label_1054;
                    }
                }
                b4 = true;
                break Label_1057;
            }
            b4 = false;
        }
        a$a.t(b4);
        final JsonBroadcast.JsonBroadcast$JsonBroadcastEditedReplay s4 = this.s0;
        boolean b5 = false;
        Label_1118: {
            Label_1115: {
                if (s4 != null) {
                    final Boolean c3 = s4.c;
                    if (c3 == null || !c3) {
                        break Label_1115;
                    }
                }
                else {
                    final Boolean h0 = this.h0;
                    if (h0 == null || !h0) {
                        break Label_1115;
                    }
                }
                b5 = true;
                break Label_1118;
            }
            b5 = false;
        }
        a$a.u(b5);
        final Boolean i0 = this.i0;
        a$a.i(i0 != null && i0);
        a$a.V = this.j0;
        a$a.W = this.k0;
        a$a.X = this.m0;
        final Boolean l2 = this.l0;
        a$a.h(l2 != null && l2 && b);
        a$a.Z = this.t0;
        a$a.k(this.u0);
        a$a.r(NarrowcastSpaceType.fromInt(this.v0));
        return (h4j)new JsonBroadcast.JsonBroadcast$a((b$a)a$a, this.d, xl2.b(this.u), this.n, value, value2, pjr.o(this.R, 0L));
    }
    
    public final String u() {
        final GraphqlJsonTwitterUser q0 = this.q0;
        if (q0 != null) {
            final GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser m0 = q0.m0;
            if (m0 != null && m0.a != JsonBroadcast.w0) {
                return String.valueOf(this.q0.m0.a);
            }
        }
        return this.s;
    }
    
    public final String v() {
        final GraphqlJsonTwitterUser q0 = this.q0;
        if (q0 != null) {
            final GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser m0 = q0.m0;
            if (m0 != null && pjr.g((CharSequence)m0.c)) {
                return this.q0.m0.c;
            }
        }
        return this.t;
    }
}
