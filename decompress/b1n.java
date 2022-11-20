import android.util.Log;
import android.os.Bundle;
import tv.periscope.android.api.PsAudioSpace;
import tv.periscope.android.api.PsGuest;
import tv.periscope.android.api.PsShow;
import tv.periscope.android.api.PsPodcastEpisode;
import com.twitter.rooms.model.PodcastEpisode;
import com.twitter.rooms.model.Show;
import com.twitter.rooms.model.Guest;
import tv.periscope.android.api.PsTrack;
import com.twitter.rooms.model.StationsSocialProof;
import tv.periscope.android.api.PsStationsSocialProof;
import tv.periscope.android.api.PsSocialProof;
import com.twitter.rooms.model.Image;
import tv.periscope.android.api.PsImage;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import android.content.SharedPreferences$Editor;
import android.preference.PreferenceManager;
import android.content.SharedPreferences;
import android.content.Context;
import com.twitter.core.ui.styles.icons.implementation.Icon;
import java.util.Objects;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.JsonDecodingException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b1n implements c00
{
    public static final Class A(final ClassLoader classLoader, final String s) {
        czd.f((Object)classLoader, "<this>");
        czd.f((Object)s, "fqName");
        Class<?> forName;
        try {
            forName = Class.forName(s, false, classLoader);
        }
        catch (final ClassNotFoundException ex) {
            forName = null;
        }
        return forName;
    }
    
    public static final String B(final Number n, final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected special floating-point value ");
        sb.append(n);
        sb.append(" with key ");
        sb.append(s);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        sb.append((Object)o(s2, -1));
        return sb.toString();
    }
    
    public static final JsonDecodingException a(final Number n, final String s, final String s2) {
        czd.f((Object)n, "value");
        czd.f((Object)s, "key");
        czd.f((Object)s2, "output");
        return e(-1, B(n, s, s2));
    }
    
    public static final JsonEncodingException b(final Number n, final String s) {
        czd.f((Object)n, "value");
        czd.f((Object)s, "output");
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected special floating-point value ");
        sb.append(n);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        sb.append((Object)o(s, -1));
        return new JsonEncodingException(sb.toString());
    }
    
    public static final JsonEncodingException c(final Number n, final String s, final String s2) {
        czd.f((Object)n, "value");
        czd.f((Object)s, "key");
        czd.f((Object)s2, "output");
        return new JsonEncodingException(B(n, s, s2));
    }
    
    public static final JsonEncodingException d(final SerialDescriptor serialDescriptor) {
        czd.f((Object)serialDescriptor, "keyDescriptor");
        final StringBuilder j = fu8.j("Value of type '");
        j.append(serialDescriptor.h());
        j.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        j.append(serialDescriptor.i());
        j.append("'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
        return new JsonEncodingException(j.toString());
    }
    
    public static final JsonDecodingException e(final int n, final String s) {
        czd.f((Object)s, "message");
        String string = s;
        if (n >= 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected JSON token at offset ");
            sb.append(n);
            sb.append(": ");
            sb.append(s);
            string = sb.toString();
        }
        return new JsonDecodingException(string);
    }
    
    public static final JsonDecodingException f(final int n, final String s, final CharSequence charSequence) {
        czd.f((Object)s, "message");
        czd.f((Object)charSequence, "input");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("\nJSON input: ");
        sb.append((Object)o(charSequence, n));
        return e(n, sb.toString());
    }
    
    public static final void g(final nsb nsb, okh companion, final x66 x66, final int n, final int n2) {
        final x66 h = x66.h(978550314);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)nsb)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n3 | 0x30);
        }
        else {
            n6 = n3;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (h.P((Object)companion)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n3 | n7);
            }
        }
        if ((n6 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            if (n5 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final n3p s = omy.s(h);
            final yzq a2 = yzq.a;
            final okh u = omy.u(nza.E1(companion, yzq.i, 0.0f, 2), s);
            h.x(-483455358);
            final ds0 a3 = ds0.a;
            final ds0$k d = ds0.d;
            Objects.requireNonNull(ex.Companion);
            final fqg a4 = nr4.a((ds0.l)d, (ex.b)ex.a.n, h);
            h.x(-1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a5 = ove.a(u);
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b);
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)a4, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a5).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            zzq.d(h, 0);
            final Icon j1 = joc.j1;
            Objects.requireNonNull(vn9.Companion);
            final eoc a6 = eoc.a;
            final long b2 = eoc.b;
            final long n8 = eoc.n;
            s9i.h(b2, n8, n8, h);
            final long c = eoc.c;
            final long m = eoc.m;
            s9i.h(c, m, m, h);
            final long d2 = eoc.d;
            final long l = eoc.l;
            s9i.h(d2, l, l, h);
            final long e = eoc.e;
            final long k = eoc.k;
            s9i.h(e, k, k, h);
            final long f = eoc.f;
            final long i = eoc.j;
            s9i.h(f, i, i, h);
            final long g = eoc.g;
            final long i2 = eoc.i;
            s9i.h(g, i2, i2, h);
            final long h2 = eoc.h;
            s9i.h(h2, h2, h2, h);
            s9i.h(i2, g, g, h);
            s9i.h(i, f, f, h);
            s9i.h(k, e, e, h);
            s9i.h(l, d2, d2, h);
            s9i.h(m, c, c, h);
            s9i.h(n8, b2, b2, h);
            final long o = eoc.o;
            final long a7 = eoc.A;
            s9i.h(o, a7, a7, h);
            final long p5 = eoc.p;
            final long z = eoc.z;
            s9i.h(p5, z, z, h);
            final long q = eoc.q;
            final long y = eoc.y;
            s9i.h(q, y, y, h);
            final long r = eoc.r;
            final long x67 = eoc.x;
            s9i.h(r, x67, x67, h);
            final long s2 = eoc.s;
            final long w = eoc.w;
            s9i.h(s2, w, w, h);
            final long t = eoc.t;
            final long v = eoc.v;
            s9i.h(t, v, v, h);
            final long u2 = eoc.u;
            s9i.h(u2, u2, u2, h);
            s9i.h(v, t, t, h);
            s9i.h(w, s2, s2, h);
            s9i.h(x67, r, r, h);
            s9i.h(y, q, q, h);
            s9i.h(z, p5, p5, h);
            s9i.h(a7, o, o, h);
            final long b3 = eoc.B;
            final long n9 = eoc.N;
            s9i.h(b3, n9, n9, h);
            final long c2 = eoc.C;
            final long m2 = eoc.M;
            s9i.h(c2, m2, m2, h);
            final long d3 = eoc.D;
            final long l2 = eoc.L;
            s9i.h(d3, l2, l2, h);
            final long e2 = eoc.E;
            final long k2 = eoc.K;
            s9i.h(e2, k2, k2, h);
            final long f2 = eoc.F;
            final long j2 = eoc.J;
            s9i.h(f2, j2, j2, h);
            final long g2 = eoc.G;
            final long i3 = eoc.I;
            s9i.h(g2, i3, i3, h);
            final long h3 = eoc.H;
            s9i.h(h3, h3, h3, h);
            s9i.h(i3, g2, g2, h);
            s9i.h(j2, f2, f2, h);
            s9i.h(k2, e2, e2, h);
            s9i.h(l2, d3, d3, h);
            s9i.h(m2, c2, c2, h);
            s9i.h(n9, b3, b3, h);
            final long o2 = eoc.O;
            final long a8 = eoc.a0;
            s9i.h(o2, a8, a8, h);
            final long p6 = eoc.P;
            final long z2 = eoc.Z;
            s9i.h(p6, z2, z2, h);
            final long q2 = eoc.Q;
            final long y2 = eoc.Y;
            s9i.h(q2, y2, y2, h);
            final long r2 = eoc.R;
            final long x68 = eoc.X;
            s9i.h(r2, x68, x68, h);
            final long s3 = eoc.S;
            final long w2 = eoc.W;
            s9i.h(s3, w2, w2, h);
            final long t2 = eoc.T;
            final long v2 = eoc.V;
            s9i.h(t2, v2, v2, h);
            final long u3 = eoc.U;
            s9i.h(u3, u3, u3, h);
            s9i.h(v2, t2, t2, h);
            s9i.h(w2, s3, s3, h);
            s9i.h(x68, r2, r2, h);
            s9i.h(y2, q2, q2, h);
            s9i.h(z2, p6, p6, h);
            s9i.h(a8, o2, o2, h);
            final long b4 = eoc.b0;
            final long n10 = eoc.n0;
            s9i.h(b4, n10, n10, h);
            final long c3 = eoc.c0;
            final long m3 = eoc.m0;
            s9i.h(c3, m3, m3, h);
            final long d4 = eoc.d0;
            final long l3 = eoc.l0;
            s9i.h(d4, l3, l3, h);
            final long e3 = eoc.e0;
            final long k3 = eoc.k0;
            s9i.h(e3, k3, k3, h);
            final long f3 = eoc.f0;
            final long j3 = eoc.j0;
            s9i.h(f3, j3, j3, h);
            final long g3 = eoc.g0;
            final long i4 = eoc.i0;
            s9i.h(g3, i4, i4, h);
            final long h4 = eoc.h0;
            s9i.h(h4, h4, h4, h);
            s9i.h(i4, g3, g3, h);
            s9i.h(j3, f3, f3, h);
            s9i.h(k3, e3, e3, h);
            s9i.h(l3, d4, d4, h);
            s9i.h(m3, c3, c3, h);
            s9i.h(n10, b4, b4, h);
            final long o3 = eoc.o0;
            final long a9 = eoc.A0;
            s9i.h(o3, a9, a9, h);
            final long p7 = eoc.p0;
            final long z3 = eoc.z0;
            s9i.h(p7, z3, z3, h);
            final long q3 = eoc.q0;
            final long y3 = eoc.y0;
            s9i.h(q3, y3, y3, h);
            final long r3 = eoc.r0;
            final long x69 = eoc.x0;
            s9i.h(r3, x69, x69, h);
            final long s4 = eoc.s0;
            final long w3 = eoc.w0;
            s9i.h(s4, w3, w3, h);
            final long t3 = eoc.t0;
            final long v3 = eoc.v0;
            s9i.h(t3, v3, v3, h);
            final long u4 = eoc.u0;
            s9i.h(u4, u4, u4, h);
            s9i.h(v3, t3, t3, h);
            s9i.h(w3, s4, s4, h);
            s9i.h(x69, r3, r3, h);
            s9i.h(y3, q3, q3, h);
            s9i.h(z3, p7, p7, h);
            s9i.h(a9, o3, o3, h);
            final long b5 = eoc.B0;
            final long n11 = eoc.N0;
            s9i.h(b5, n11, n11, h);
            final long c4 = eoc.C0;
            final long m4 = eoc.M0;
            s9i.h(c4, m4, m4, h);
            final long d5 = eoc.D0;
            final long l4 = eoc.L0;
            s9i.h(d5, l4, l4, h);
            final long e4 = eoc.E0;
            final long k4 = eoc.K0;
            s9i.h(e4, k4, k4, h);
            final long f4 = eoc.F0;
            final long j4 = eoc.J0;
            s9i.h(f4, j4, j4, h);
            final long g4 = eoc.G0;
            final long i5 = eoc.I0;
            s9i.h(g4, i5, i5, h);
            final long h5 = eoc.H0;
            final long h6 = s9i.h(h5, h5, h5, h);
            s9i.h(i5, g4, g4, h);
            s9i.h(j4, f4, f4, h);
            s9i.h(k4, e4, e4, h);
            s9i.h(l4, d5, d5, h);
            s9i.h(m4, c4, c4, h);
            s9i.h(n11, b5, b5, h);
            final long o4 = eoc.O0;
            final long a10 = eoc.a1;
            s9i.h(o4, a10, a10, h);
            final long p8 = eoc.P0;
            final long z4 = eoc.Z0;
            s9i.h(p8, z4, z4, h);
            final long q4 = eoc.Q0;
            final long y4 = eoc.Y0;
            s9i.h(q4, y4, y4, h);
            final long r4 = eoc.R0;
            final long x70 = eoc.X0;
            s9i.h(r4, x70, x70, h);
            final long s5 = eoc.S0;
            final long w4 = eoc.W0;
            s9i.h(s5, w4, w4, h);
            final long t4 = eoc.T0;
            final long v4 = eoc.V0;
            s9i.h(t4, v4, v4, h);
            final long u5 = eoc.U0;
            s9i.h(u5, u5, u5, h);
            s9i.h(v4, t4, t4, h);
            s9i.h(w4, s5, s5, h);
            s9i.h(x70, r4, r4, h);
            s9i.h(y4, q4, q4, h);
            s9i.h(z4, p8, p8, h);
            s9i.h(a10, o4, o4, h);
            final long b6 = eoc.b1;
            final long n12 = eoc.n1;
            s9i.h(b6, n12, n12, h);
            final long c5 = eoc.c1;
            final long m5 = eoc.m1;
            s9i.h(c5, m5, m5, h);
            final long d6 = eoc.d1;
            final long l5 = eoc.l1;
            s9i.h(d6, l5, l5, h);
            final long e5 = eoc.e1;
            final long k5 = eoc.k1;
            s9i.h(e5, k5, k5, h);
            final long f5 = eoc.f1;
            final long j5 = eoc.j1;
            s9i.h(f5, j5, j5, h);
            final long g5 = eoc.g1;
            final long i6 = eoc.i1;
            s9i.h(g5, i6, i6, h);
            final long h7 = eoc.h1;
            s9i.h(h7, h7, h7, h);
            s9i.h(i6, g5, g5, h);
            s9i.h(j5, f5, f5, h);
            s9i.h(k5, e5, e5, h);
            s9i.h(l5, d6, d6, h);
            s9i.h(m5, c5, c5, h);
            s9i.h(n12, b6, b6, h);
            final long o5 = eoc.o1;
            final long a11 = eoc.A1;
            s9i.h(o5, a11, a11, h);
            final long p9 = eoc.p1;
            final long z5 = eoc.z1;
            s9i.h(p9, z5, z5, h);
            final long q5 = eoc.q1;
            final long y5 = eoc.y1;
            s9i.h(q5, y5, y5, h);
            final long r5 = eoc.r1;
            final long x71 = eoc.x1;
            s9i.h(r5, x71, x71, h);
            final long s6 = eoc.s1;
            final long w5 = eoc.w1;
            s9i.h(s6, w5, w5, h);
            final long t5 = eoc.t1;
            final long v5 = eoc.v1;
            s9i.h(t5, v5, v5, h);
            final long u6 = eoc.u1;
            s9i.h(u6, u6, u6, h);
            s9i.h(v5, t5, t5, h);
            s9i.h(w5, s6, s6, h);
            s9i.h(x71, r5, r5, h);
            s9i.h(y5, q5, q5, h);
            s9i.h(z5, p9, p9, h);
            s9i.h(a11, o5, o5, h);
            final okh m6 = kdq.m((okh)okh.Companion, (float)96);
            final bw1.a o6 = ex.a.o;
            czd.f((Object)m6, "<this>");
            final wrd$a a12 = wrd.a;
            final wrd$a a13 = wrd.a;
            koc.a(j1, (String)null, m6.E((okh)new lpc((ex.b)o6)), h6, false, h, 56, 16);
            zzq.f(h, 0);
            final String a14 = wd.A(2131953546, h);
            final kpc$a companion2 = kpc.Companion;
            sis.a(a14, (okh)null, 0L, 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 0, companion2.a(h).e, false, h, 0, 0, 49150);
            zzq.f(h, 0);
            h.x(-492369756);
            final Object y6 = h.y();
            Objects.requireNonNull(x66.Companion);
            final x66$a$a b7 = x66$a.b;
            Object value = y6;
            if (y6 == b7) {
                int n13;
                if (asa.b().b("dm_voice_brazil_education_modal_enabled", false)) {
                    n13 = 2131953541;
                }
                else if (asa.b().b("dm_voice_india_education_modal_enabled", false)) {
                    n13 = 2131953542;
                }
                else if (asa.b().b("dm_voice_japan_education_modal_enabled", false)) {
                    n13 = 2131953543;
                }
                else if (asa.b().b("dm_voice_turkey_education_modal_enabled", false)) {
                    n13 = 2131953545;
                }
                else if (asa.b().b("dm_voice_nigeria_education_modal_enabled", false)) {
                    n13 = 2131953544;
                }
                else if (asa.b().b("dm_voice_argentina_education_modal_enabled", false)) {
                    n13 = 2131953540;
                }
                else {
                    n13 = 2131953539;
                }
                value = n13;
                h.p(value);
            }
            h.O();
            final String a15 = wd.A(((Number)value).intValue(), h);
            final sjs h8 = companion2.a(h).h;
            s9i.h(b2, n8, n8, h);
            s9i.h(c, m, m, h);
            s9i.h(d2, l, l, h);
            s9i.h(e, k, k, h);
            s9i.h(f, i, i, h);
            s9i.h(g, i2, i2, h);
            s9i.h(h2, h2, h2, h);
            s9i.h(i2, g, g, h);
            s9i.h(i, f, f, h);
            s9i.h(k, e, e, h);
            s9i.h(l, d2, d2, h);
            s9i.h(m, c, c, h);
            s9i.h(n8, b2, b2, h);
            s9i.h(o, a7, a7, h);
            s9i.h(p5, z, z, h);
            s9i.h(q, y, y, h);
            s9i.h(r, x67, x67, h);
            s9i.h(s2, w, w, h);
            s9i.h(t, v, v, h);
            s9i.h(u2, u2, u2, h);
            s9i.h(v, t, t, h);
            final long h9 = s9i.h(w, s2, s2, h);
            s9i.h(x67, r, r, h);
            s9i.h(y, q, q, h);
            s9i.h(z, p5, p5, h);
            s9i.h(a7, o, o, h);
            s9i.h(b3, n9, n9, h);
            s9i.h(c2, m2, m2, h);
            s9i.h(d3, l2, l2, h);
            s9i.h(e2, k2, k2, h);
            s9i.h(f2, j2, j2, h);
            s9i.h(g2, i3, i3, h);
            s9i.h(h3, h3, h3, h);
            s9i.h(i3, g2, g2, h);
            s9i.h(j2, f2, f2, h);
            s9i.h(k2, e2, e2, h);
            s9i.h(l2, d3, d3, h);
            s9i.h(m2, c2, c2, h);
            s9i.h(n9, b3, b3, h);
            s9i.h(o2, a8, a8, h);
            s9i.h(p6, z2, z2, h);
            s9i.h(q2, y2, y2, h);
            s9i.h(r2, x68, x68, h);
            s9i.h(s3, w2, w2, h);
            s9i.h(t2, v2, v2, h);
            s9i.h(u3, u3, u3, h);
            s9i.h(v2, t2, t2, h);
            s9i.h(w2, s3, s3, h);
            s9i.h(x68, r2, r2, h);
            s9i.h(y2, q2, q2, h);
            s9i.h(z2, p6, p6, h);
            s9i.h(a8, o2, o2, h);
            s9i.h(b4, n10, n10, h);
            s9i.h(c3, m3, m3, h);
            s9i.h(d4, l3, l3, h);
            s9i.h(e3, k3, k3, h);
            s9i.h(f3, j3, j3, h);
            s9i.h(g3, i4, i4, h);
            s9i.h(h4, h4, h4, h);
            s9i.h(i4, g3, g3, h);
            s9i.h(j3, f3, f3, h);
            s9i.h(k3, e3, e3, h);
            s9i.h(l3, d4, d4, h);
            s9i.h(m3, c3, c3, h);
            s9i.h(n10, b4, b4, h);
            s9i.h(o3, a9, a9, h);
            s9i.h(p7, z3, z3, h);
            s9i.h(q3, y3, y3, h);
            s9i.h(r3, x69, x69, h);
            s9i.h(s4, w3, w3, h);
            s9i.h(t3, v3, v3, h);
            s9i.h(u4, u4, u4, h);
            s9i.h(v3, t3, t3, h);
            s9i.h(w3, s4, s4, h);
            s9i.h(x69, r3, r3, h);
            s9i.h(y3, q3, q3, h);
            s9i.h(z3, p7, p7, h);
            s9i.h(a9, o3, o3, h);
            s9i.h(b5, n11, n11, h);
            s9i.h(c4, m4, m4, h);
            s9i.h(d5, l4, l4, h);
            s9i.h(e4, k4, k4, h);
            s9i.h(f4, j4, j4, h);
            s9i.h(g4, i5, i5, h);
            s9i.h(h5, h5, h5, h);
            s9i.h(i5, g4, g4, h);
            s9i.h(j4, f4, f4, h);
            s9i.h(k4, e4, e4, h);
            s9i.h(l4, d5, d5, h);
            s9i.h(m4, c4, c4, h);
            s9i.h(n11, b5, b5, h);
            s9i.h(o4, a10, a10, h);
            s9i.h(p8, z4, z4, h);
            s9i.h(q4, y4, y4, h);
            s9i.h(r4, x70, x70, h);
            s9i.h(s5, w4, w4, h);
            s9i.h(t4, v4, v4, h);
            s9i.h(u5, u5, u5, h);
            s9i.h(v4, t4, t4, h);
            s9i.h(w4, s5, s5, h);
            s9i.h(x70, r4, r4, h);
            s9i.h(y4, q4, q4, h);
            s9i.h(z4, p8, p8, h);
            s9i.h(a10, o4, o4, h);
            s9i.h(b6, n12, n12, h);
            s9i.h(c5, m5, m5, h);
            s9i.h(d6, l5, l5, h);
            s9i.h(e5, k5, k5, h);
            s9i.h(f5, j5, j5, h);
            s9i.h(g5, i6, i6, h);
            s9i.h(h7, h7, h7, h);
            s9i.h(i6, g5, g5, h);
            s9i.h(j5, f5, f5, h);
            s9i.h(k5, e5, e5, h);
            s9i.h(l5, d6, d6, h);
            s9i.h(m5, c5, c5, h);
            s9i.h(n12, b6, b6, h);
            s9i.h(o5, a11, a11, h);
            s9i.h(p9, z5, z5, h);
            s9i.h(q5, y5, y5, h);
            s9i.h(r5, x71, x71, h);
            s9i.h(s6, w5, w5, h);
            s9i.h(t5, v5, v5, h);
            s9i.h(u6, u6, u6, h);
            s9i.h(v5, t5, t5, h);
            s9i.h(w5, s6, s6, h);
            s9i.h(x71, r5, r5, h);
            s9i.h(y5, q5, q5, h);
            s9i.h(z5, p9, p9, h);
            s9i.h(a11, o5, o5, h);
            sis.a(a15, (okh)null, h9, 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 0, h8, false, h, 0, 0, 49146);
            zzq.f(h, 0);
            final String a16 = wd.A(2131954239, h);
            final b53$a b53$a = new b53$a(true);
            h.x(1157296644);
            final boolean p10 = h.P((Object)nsb);
            final Object y7 = h.y();
            Object o7;
            if (p10 || (o7 = y7) == b7) {
                o7 = new s54(nsb);
                h.p(o7);
            }
            h.O();
            coc.d((okh)null, a16, (q33)null, (b53)b53$a, (Icon)null, (String)null, (ffs)null, false, (nsb)o7, h, 4096, 245);
            zzq.d(h, 0);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
        }
        final lxo k6 = h.k();
        if (k6 != null) {
            k6.a((ftb)new t54(nsb, companion, n, n2));
        }
    }
    
    public static final Object h(final Throwable t) {
        czd.f((Object)t, "exception");
        return new nsm$b(t);
    }
    
    public static final void i(final sx6 sx6) {
        final int j = k9e.J;
        final k9e k9e = (k9e)sx6.c((sx6$b)k9e$b.D0);
        if (k9e != null) {
            j(k9e);
        }
    }
    
    public static final void j(final k9e k9e) {
        if (k9e.b()) {
            return;
        }
        throw k9e.k();
    }
    
    public static final k9e l(final sx6 sx6) {
        final int j = k9e.J;
        final k9e k9e = (k9e)sx6.c((sx6$b)k9e$b.D0);
        if (k9e != null) {
            return k9e;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Current context doesn't contain Job in it: ");
        sb.append(sx6);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public static vl2 m(final Context context, final SharedPreferences sharedPreferences, final l9w l9w, final rl2 rl2) {
        final String packageName = context.getPackageName();
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Object o;
        if ((packageName.equals("tv.periscope.android.dev") || packageName.equals("tv.periscope.android.beta")) && defaultSharedPreferences.getBoolean("pref_profile_is_employee", false) && defaultSharedPreferences.getBoolean("pref_force_broadcast_tips", false)) {
            o = new j8a();
        }
        else {
            final jjw v = l9w.v();
            if (sharedPreferences.contains("broadcast_tips.initial_has_low_broadcast_count")) {
                o = new kjw(Boolean.valueOf(sharedPreferences.getBoolean("broadcast_tips.initial_has_low_broadcast_count", false)));
            }
            else if (v != null && v.b() != null) {
                final Boolean b = v.b();
                final SharedPreferences$Editor edit = sharedPreferences.edit();
                edit.putBoolean("broadcast_tips.initial_has_low_broadcast_count", (boolean)b);
                edit.apply();
                o = new kjw(b);
            }
            else {
                o = new kjw((Boolean)null);
            }
        }
        return (vl2)new wl2(sharedPreferences, (ul2)o, rl2);
    }
    
    public static final boolean n(final sx6 sx6) {
        final int j = k9e.J;
        final k9e k9e = (k9e)sx6.c((sx6$b)k9e$b.D0);
        boolean b = true;
        if (k9e == null || !k9e.b()) {
            b = false;
        }
        return b;
    }
    
    public static final CharSequence o(final CharSequence charSequence, int n) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String s = ".....";
        if (n != -1) {
            final int n2 = n - 30;
            final int n3 = n + 30;
            String s2;
            if (n2 <= 0) {
                s2 = "";
            }
            else {
                s2 = ".....";
            }
            if (n3 >= charSequence.length()) {
                s = "";
            }
            final StringBuilder j = fu8.j(s2);
            if ((n = n2) < 0) {
                n = 0;
            }
            final int length = charSequence.length();
            int n4;
            if ((n4 = n3) > length) {
                n4 = length;
            }
            j.append(charSequence.subSequence(n, n4).toString());
            j.append(s);
            return j.toString();
        }
        n = charSequence.length() - 60;
        if (n <= 0) {
            return charSequence;
        }
        final StringBuilder i = fu8.j(".....");
        i.append(charSequence.subSequence(n, charSequence.length()).toString());
        return i.toString();
    }
    
    public static final sy5 p(final nsb nsb) {
        return rw0.d(gmw.x(), (oj)new boo(nsb, 1));
    }
    
    public static RuntimeException q(final Throwable t) {
        r(t);
        throw new RuntimeException(t);
    }
    
    public static void r(final Throwable t) {
        if (Error.class.isInstance(t)) {
            throw Error.class.cast(t);
        }
        if (!RuntimeException.class.isInstance(t)) {
            return;
        }
        throw RuntimeException.class.cast(t);
    }
    
    public static final mjv s(final mjv mjv, final td0 td0) {
        czd.f((Object)mjv, "<this>");
        if (wd0.a(mjv) == td0) {
            return mjv;
        }
        final vd0 b = wd0.b(mjv);
        boolean b2 = true;
        mjv mjv2 = mjv;
        if (b != null) {
            Label_0142: {
                if (!((ra)mjv).isEmpty()) {
                    final us0 d0 = ((ay0)mjv).D0;
                    final ArrayList list = new ArrayList();
                    for (final Object next : d0) {
                        if (czd.a((Object)next, (Object)b) ^ true) {
                            list.add(next);
                        }
                    }
                    if (list.size() != ((ay0)mjv).D0.getSize()) {
                        mjv2 = mjv.Companion.c((List)list);
                        break Label_0142;
                    }
                }
                mjv2 = mjv;
            }
            if (mjv2 == null) {
                mjv2 = mjv;
            }
        }
        if (!((Iterable<Object>)td0).iterator().hasNext() && td0.isEmpty()) {
            return mjv2;
        }
        final vd0 vd0 = new vd0(td0);
        final mjv$a companion = mjv.Companion;
        if (((ay0)mjv2).D0.get(((tkv)companion).b(vd0.b())) == null) {
            b2 = false;
        }
        if (!b2) {
            if (((ra)mjv2).isEmpty()) {
                mjv2 = new mjv(s9i.r(vd0));
            }
            else {
                mjv2 = companion.c(mq4.y0((Collection)mq4.M0((Iterable)mjv2), (Object)vd0));
            }
        }
        return mjv2;
    }
    
    public static final Void t(final dc dc, final Number n) {
        czd.f((Object)dc, "<this>");
        czd.f((Object)n, "result");
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected special floating-point value ");
        sb.append(n);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification");
        dc.p(dc, sb.toString(), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, (Object)null);
        throw null;
    }
    
    public static final void u(final Object o) {
        if (!(o instanceof nsm$b)) {
            return;
        }
        throw ((nsm$b)o).D0;
    }
    
    public static final mjv v(final td0 td0) {
        czd.f((Object)td0, "<this>");
        mjv mjv;
        if (td0.isEmpty()) {
            Objects.requireNonNull(mjv.Companion);
            mjv = mjv.E0;
        }
        else {
            mjv = mjv.Companion.c(s9i.r(new vd0(td0)));
        }
        return mjv;
    }
    
    public static final Image w(final PsImage psImage) {
        return new Image(psImage.is_profile_image(), psImage.getUrl());
    }
    
    public static final ijq x(final PsSocialProof psSocialProof) {
        return new ijq(psSocialProof.getLabel(), psSocialProof.getIcon(), psSocialProof.getUrl(), psSocialProof.getRounded());
    }
    
    public static final StationsSocialProof y(final PsStationsSocialProof psStationsSocialProof) {
        final String text = psStationsSocialProof.getText();
        final List facePiles = psStationsSocialProof.getFacePiles();
        ArrayList list2;
        if (facePiles != null) {
            final ArrayList list = new ArrayList(iq4.H((Iterable)facePiles, 10));
            final Iterator iterator = facePiles.iterator();
            while (true) {
                list2 = list;
                if (!iterator.hasNext()) {
                    break;
                }
                list.add((Object)w((PsImage)iterator.next()));
            }
        }
        else {
            list2 = null;
        }
        return new StationsSocialProof(text, (List)list2, psStationsSocialProof.getIcon());
    }
    
    public static final xvt z(final PsTrack psTrack) {
        final Image w = w(psTrack.getImage());
        final String trackMetadata = psTrack.getTrackMetadata();
        final PsPodcastEpisode podcastEpisode = psTrack.getPodcastEpisode();
        PodcastEpisode podcastEpisode2;
        if (podcastEpisode != null) {
            final String audioUrl = podcastEpisode.getAudioUrl();
            final String description = podcastEpisode.getDescription();
            final String id = podcastEpisode.getId();
            final PsShow show = podcastEpisode.getShow();
            final String artUrl = show.getArtUrl();
            final String id2 = show.getId();
            final int listenScore = show.getListenScore();
            final String title = show.getTitle();
            final boolean following = show.getFollowing();
            final String twitterHandle = show.getTwitterHandle();
            final PsGuest guest = show.getGuest();
            Guest guest2;
            if (guest != null) {
                guest2 = new Guest(guest.getUserId(), guest.getUsername(), guest.getDisplayName(), guest.getAvatarUrl(), guest.getTwitterUserId());
            }
            else {
                guest2 = null;
            }
            podcastEpisode2 = new PodcastEpisode(audioUrl, description, id, new Show(artUrl, id2, listenScore, title, following, twitterHandle, guest2, show.getDescription()), podcastEpisode.getTitle(), podcastEpisode.getPublishDateMs());
        }
        else {
            podcastEpisode2 = null;
        }
        final PsAudioSpace space = psTrack.getSpace();
        r21 n;
        if (space != null) {
            n = rml.n(space, false);
        }
        else {
            n = null;
        }
        final List socialProof = psTrack.getSocialProof();
        List list2;
        if (socialProof != null) {
            final ArrayList list = new ArrayList(iq4.H((Iterable)socialProof, 10));
            final Iterator iterator = socialProof.iterator();
            while (true) {
                list2 = list;
                if (!iterator.hasNext()) {
                    break;
                }
                final PsStationsSocialProof psStationsSocialProof = (PsStationsSocialProof)iterator.next();
                StationsSocialProof y;
                if (psStationsSocialProof != null) {
                    y = y(psStationsSocialProof);
                }
                else {
                    y = null;
                }
                list.add((Object)y);
            }
        }
        else {
            list2 = null;
        }
        return new xvt(w, podcastEpisode2, n, trackMetadata, list2);
    }
    
    public void k(final Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", (Throwable)null);
        }
    }
}
