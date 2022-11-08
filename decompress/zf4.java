import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Iterator;
import org.apache.thrift.TException;
import android.util.Base64;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class zf4 extends d0p<zf4>
{
    public long A0;
    public Integer B0;
    public int C0;
    public String D0;
    public String E0;
    public String F0;
    public yac G0;
    public String H0;
    public String I0;
    public String J0;
    public String K0;
    public String L0;
    public String M0;
    public String N0;
    public String O0;
    public String P0;
    public String Q0;
    public List<String> R0;
    public String S0;
    public String T0;
    public String U0;
    public dnr V0;
    public azo W0;
    public d3k X0;
    public rzo Y0;
    public String p0;
    public int q0;
    public String r0;
    public String s0;
    public String t0;
    public List<lev> u0;
    public e1p v0;
    public String w0;
    public long x0;
    public String y0;
    public long z0;
    
    public zf4() {
        final ced$b d0 = ced.D0;
        final int a = w4j.a;
        this.u0 = (List<lev>)d0;
        this.x0 = -1L;
        this.z0 = -1L;
        this.A0 = -1L;
        this.C0 = -1;
        this.R0 = rth.a(0);
    }
    
    public zf4(final UserIdentifier userIdentifier) {
        super(userIdentifier);
        final ced$b d0 = ced.D0;
        final int a = w4j.a;
        this.u0 = (List<lev>)d0;
        this.x0 = -1L;
        this.z0 = -1L;
        this.A0 = -1L;
        this.C0 = -1;
        this.R0 = rth.a(0);
    }
    
    public zf4(final UserIdentifier userIdentifier, final nca nca) {
        super(userIdentifier);
        super.T = nca.toString();
        final int a = w4j.a;
        this.u0 = (List<lev>)ced.D0;
        this.x0 = -1L;
        this.z0 = -1L;
        this.A0 = -1L;
        this.C0 = -1;
        this.R0 = rth.a(0);
    }
    
    public zf4(final UserIdentifier userIdentifier, final String... array) {
        super(userIdentifier);
        super.T = d0p.o(array);
        final ced$b d0 = ced.D0;
        final int a = w4j.a;
        this.u0 = (List<lev>)d0;
        this.x0 = -1L;
        this.z0 = -1L;
        this.A0 = -1L;
        this.C0 = -1;
        this.R0 = rth.a(0);
    }
    
    public zf4(final nca nca) {
        super.T = nca.toString();
        final int a = w4j.a;
        this.u0 = (List<lev>)ced.D0;
        this.x0 = -1L;
        this.z0 = -1L;
        this.A0 = -1L;
        this.C0 = -1;
        this.R0 = rth.a(0);
    }
    
    public zf4(final c c) {
        super((d0p$a)c);
        final ced$b d0 = ced.D0;
        final int a = w4j.a;
        this.u0 = (List<lev>)d0;
        this.x0 = -1L;
        this.z0 = -1L;
        this.A0 = -1L;
        this.C0 = -1;
        rth.a(0);
        this.p0 = c.l0;
        this.q0 = c.m0;
        this.r0 = c.n0;
        this.s0 = c.o0;
        this.t0 = c.p0;
        this.w0 = c.q0;
        this.x0 = c.r0;
        this.y0 = c.s0;
        this.z0 = c.t0;
        this.A0 = c.u0;
        this.B0 = c.v0;
        this.D0 = null;
        this.C0 = -1;
        this.E0 = c.w0;
        this.F0 = c.x0;
        this.u0 = c.y0;
        this.G0 = c.z0;
        this.H0 = c.A0;
        this.T0 = c.B0;
        this.I0 = c.C0;
        this.J0 = c.D0;
        this.K0 = c.E0;
        this.L0 = c.F0;
        this.M0 = c.G0;
        this.N0 = c.H0;
        this.O0 = c.I0;
        this.P0 = c.J0;
        this.Q0 = c.K0;
        this.R0 = c.L0;
        this.S0 = c.M0;
        this.V0 = c.N0;
        this.U0 = null;
        this.W0 = c.O0;
        this.X0 = c.P0;
        this.Y0 = c.Q0;
    }
    
    public zf4(final String... array) {
        super.T = d0p.o(array);
        final ced$b d0 = ced.D0;
        final int a = w4j.a;
        this.u0 = (List<lev>)d0;
        this.x0 = -1L;
        this.z0 = -1L;
        this.A0 = -1L;
        this.C0 = -1;
        this.R0 = rth.a(0);
    }
    
    public static String E(final jev jev, final String s, final String s2, final String s3) {
        return d0p.o(new String[] { G(jev), H(jev), s, s2, s3 });
    }
    
    public static nca F(final jev jev, String s, String s2, final String s3) {
        final String g = G(jev);
        final String h = H(jev);
        String s4 = s;
        if (s == null) {
            s4 = "";
        }
        if ((s = s2) == null) {
            s = "";
        }
        if ((s2 = s3) == null) {
            s2 = "";
        }
        return nca.g(g, h, s4, s, s2);
    }
    
    public static String G(final jev jev) {
        final String s = "tweet";
        String d;
        if (jev == null) {
            d = s;
        }
        else {
            d = ((vyo)jev).d;
            if (d == null) {
                d = s;
            }
        }
        return d;
    }
    
    public static String H(final jev jev) {
        String e;
        if (jev == null) {
            e = null;
        }
        else {
            e = ((vyo)jev).e;
        }
        String s = e;
        if (e == null) {
            s = "";
        }
        return s;
    }
    
    public void B(final tfe tfe) throws IOException {
        if (this.s0 != null && this.t0 != null) {
            tfe.i0("settings_version_details");
            tfe.u0("feature_switches", this.s0);
            tfe.u0("experiments", this.t0);
            tfe.h();
        }
        final String p = this.p0;
        if (p != null) {
            tfe.u0("experiment_key", p);
            tfe.T("version", this.q0);
            tfe.u0("bucket", this.r0);
            final fia$a fia$a = new fia$a();
            fia$a.a(fia.O0, (Object)this.p0);
            fia$a.a(fia.Q0, (Object)this.q0);
            fia$a.a(fia.P0, (Object)this.r0);
            final String a = fia$a.a;
            final String b = fia$a.b;
            final Integer c = fia$a.c;
            final String d = fia$a.d;
            final String e = fia$a.e;
            final fia fia = new fia();
            if (a != null) {
                fia.C0 = a;
            }
            if (b != null) {
                fia.D0 = b;
            }
            if (c != null) {
                fia.E0 = c;
                fia.H0.set(0, true);
            }
            if (d != null) {
                fia.F0 = d;
            }
            if (e != null) {
                fia.G0 = e;
            }
            String encodeToString;
            try {
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final p5s p5s = new p5s((y5s)new s5s((OutputStream)byteArrayOutputStream), -1L, -1L);
                byteArrayOutputStream.reset();
                fia.e((w5s)p5s);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            catch (final TException ex) {
                e9a.d((Throwable)ex);
                encodeToString = null;
            }
            tfe.u0("experiment_details_binary", encodeToString);
        }
        final String w0 = this.w0;
        if (w0 != null) {
            tfe.u0("conversation_id", w0);
        }
        final long x0 = this.x0;
        if (x0 != -1L) {
            tfe.W("status_id", x0);
        }
        final String y0 = this.y0;
        if (y0 != null) {
            tfe.u0("impression_id", y0);
        }
        final long z0 = this.z0;
        if (z0 != -1L) {
            tfe.W("dm_id", z0);
        }
        final long a2 = this.A0;
        if (a2 != -1L) {
            tfe.W("dm_create_time", a2);
        }
        final Integer b2 = this.B0;
        if (b2 != null) {
            tfe.T("conversation_type", b2);
        }
        final String d2 = this.D0;
        if (d2 != null) {
            tfe.u0("dm_search_result_type", d2);
        }
        final int c2 = this.C0;
        if (c2 != -1) {
            tfe.T("conversation_participant_count", c2);
        }
        final String f0 = this.F0;
        if (f0 != null) {
            tfe.u0("custom_json_payload", f0);
        }
        if (pjr.g((CharSequence)this.E0)) {
            tfe.i0("event_details");
            tfe.u0("url", this.E0);
            tfe.h();
        }
        if (!this.u0.isEmpty()) {
            tfe.b("nav_items");
            final Iterator<lev> iterator = this.u0.iterator();
            while (iterator.hasNext()) {
                ((szo)iterator.next()).b(tfe);
            }
            tfe.f();
        }
        if (dta.b().b("report_flow_id_enabled", false)) {
            final e1p v0 = this.v0;
            if (v0 != null) {
                tfe.i("report_details");
                tfe.r0();
                tfe.u0("report_flow_id", v0.a);
                tfe.h();
            }
        }
        final yac g0 = this.G0;
        if (g0 != null) {
            g0.a(tfe);
        }
        final String h0 = this.H0;
        if (h0 != null) {
            tfe.u0("relationship", h0);
        }
        final String t0 = this.T0;
        if (t0 != null) {
            tfe.u0("author_id", t0);
        }
        final String i0 = this.I0;
        if (i0 != null) {
            tfe.u0("relationship_type", i0);
        }
        final String j0 = this.J0;
        if (j0 != null) {
            tfe.u0("inbox_type", j0);
        }
        final String k0 = this.K0;
        if (k0 != null) {
            tfe.u0("message_type", k0);
        }
        final String l0 = this.L0;
        if (l0 != null) {
            tfe.u0("input_method", l0);
        }
        final String m0 = this.M0;
        if (m0 != null) {
            tfe.u0("entry_point", m0);
        }
        final String n0 = this.N0;
        if (n0 != null) {
            tfe.u0("reaction_type", n0);
        }
        final String o0 = this.O0;
        if (o0 != null) {
            tfe.u0("conversation_count", o0);
        }
        final String p2 = this.P0;
        if (p2 != null) {
            tfe.u0("unread_conversation_count", p2);
        }
        final String q0 = this.Q0;
        if (q0 != null) {
            tfe.u0("pinned_conversation_count", q0);
        }
        if (!this.R0.isEmpty()) {
            tfe.i("conversation_labels");
            tfe.q0();
            final Iterator<String> iterator2 = this.R0.iterator();
            while (iterator2.hasNext()) {
                tfe.s0(iterator2.next());
            }
            tfe.f();
        }
        final String s0 = this.S0;
        if (s0 != null) {
            tfe.u0("error_type", s0);
        }
        final dnr v2 = this.V0;
        if (v2 != null) {
            tfe.i("subscription_details");
            tfe.r0();
            final Long a3 = v2.a;
            if (a3 != null) {
                a3.longValue();
                tfe.W("draft_id", v2.a);
            }
            final Integer b3 = v2.b;
            if (b3 != null) {
                b3.intValue();
                tfe.T("undo_period", v2.b);
            }
            final String f2 = v2.f;
            if (f2 != null) {
                tfe.u0("referring_page", f2);
            }
            final String g2 = v2.g;
            if (g2 != null) {
                tfe.u0("carousel_item_title", g2);
            }
            final String h2 = v2.h;
            if (h2 != null) {
                tfe.u0("subscription_error_message", h2);
            }
            final String i2 = v2.i;
            if (i2 != null) {
                tfe.u0("end_session_reason", i2);
            }
            final Integer j2 = v2.j;
            if (j2 != null) {
                j2.intValue();
                tfe.T("session_duration_in_s", v2.j);
            }
            final Integer c3 = v2.c;
            if (c3 != null) {
                c3.intValue();
                tfe.T("undo_count", v2.c);
            }
            final Integer d3 = v2.d;
            if (d3 != null) {
                d3.intValue();
                tfe.T("number_of_tweets", v2.d);
            }
            final Boolean e2 = v2.e;
            if (e2 != null) {
                e2.booleanValue();
                tfe.e("is_reply", v2.e);
            }
            final Boolean k2 = v2.k;
            if (k2 != null) {
                k2.booleanValue();
                tfe.e("subscriptions_enabled", v2.k);
            }
            final Boolean l2 = v2.l;
            if (l2 != null) {
                l2.booleanValue();
                tfe.e("user_has_twitter_blue_claim", v2.l);
            }
            final String m2 = v2.m;
            if (m2 != null) {
                tfe.u0("app_icon_id", m2);
            }
            final String n2 = v2.n;
            if (n2 != null) {
                tfe.u0("update_reason", n2);
            }
            final Boolean o2 = v2.o;
            if (o2 != null) {
                o2.booleanValue();
                tfe.e("success", v2.o);
            }
            final String p3 = v2.p;
            if (p3 != null) {
                tfe.u0("product_feature_id", p3);
            }
            final String q2 = v2.q;
            if (q2 != null) {
                tfe.u0("product_feature_settings_element", q2);
            }
            final String r = v2.r;
            if (r != null) {
                tfe.u0("product_feature_settings_value", r);
            }
            final String s2 = v2.s;
            if (s2 != null) {
                tfe.u0("surface", s2);
            }
            final String t2 = v2.t;
            if (t2 != null) {
                tfe.u0("surfaces", t2);
            }
            final String u = v2.u;
            if (u != null) {
                tfe.u0("error_message", u);
            }
            tfe.h();
        }
        final String u2 = this.U0;
        if (u2 != null) {
            tfe.u0("navigation_source_element", u2);
        }
        final azo w2 = this.W0;
        if (w2 != null) {
            tfe.i("client_shutdown_details");
            tfe.r0();
            final Integer a4 = w2.a;
            if (a4 != null) {
                a4.intValue();
                tfe.T("min_target_version_int", w2.a);
            }
            final Long b4 = w2.b;
            if (b4 != null) {
                b4.longValue();
                tfe.W("duration_ms", w2.b);
            }
            final String c4 = w2.c;
            if (c4 != null) {
                tfe.u0("content_remover_identifier", c4);
            }
            final String d4 = w2.d;
            if (d4 != null) {
                tfe.u0("deeplink_url", d4);
            }
            tfe.h();
        }
        final d3k x2 = this.X0;
        if (x2 != null) {
            tfe.i("performance_details");
            tfe.r0();
            tfe.W("duration_ms", x2.a);
            tfe.h();
        }
        final rzo y2 = this.Y0;
        if (y2 != null) {
            tfe.i0("interactive_conversation_details");
            tfe.T("id", y2.a);
            tfe.u0("original_tweet_id", String.valueOf(y2.b));
            tfe.h();
        }
    }
    
    public final void D(final List<lev> list) {
        final Iterator<lev> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.i((szo)iterator.next());
        }
    }
    
    public final zf4 I(final azo w0) {
        if (w0.a()) {
            this.W0 = w0;
        }
        return this;
    }
    
    public final zf4 J(final List<hl7> list) {
        this.R0 = new ArrayList<String>(list.size());
        final Iterator<hl7> iterator = list.iterator();
        while (iterator.hasNext()) {
            final int ordinal = iterator.next().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    continue;
                }
                this.R0.add("ReplyLater");
            }
            else {
                this.R0.add("Pinned");
            }
        }
        return this;
    }
    
    public static final class a extends h4j<zf4>
    {
        public final zf4 a;
        
        public a(final UserIdentifier userIdentifier) {
            this.a = new zf4(userIdentifier);
        }
        
        public final Object i() {
            return this.a;
        }
        
        public final a o(final String s, final String s2, final String s3, final String s4, final String s5) {
            this.a.q(new String[] { s, s2, s3, s4, s5 });
            return this;
        }
    }
    
    public static final class b extends js2<zf4, c>
    {
        public b() {
            super(2);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final zf4 zf4 = (zf4)o;
            flp.C((Object)zf4, (alp)d0p.n0);
            flp.G(zf4.p0);
            flp.z(zf4.q0);
            flp.G(zf4.r0);
            flp.G(zf4.s0);
            flp.G(zf4.t0);
            flp.G(zf4.w0);
            flp.A(zf4.x0);
            flp.G(zf4.y0);
            flp.A(zf4.z0);
            flp.A(zf4.A0);
            flp.G(zf4.E0);
            flp.G(zf4.F0);
            ((s4j)new xq4$a((alp)lev.w1)).c(flp, (Object)zf4.u0);
            final int a = w4j.a;
            flp.C((Object)zf4.G0, (alp)yac.d);
            flp.C((Object)zf4.v0, (alp)e1p.b);
            flp.G(zf4.H0);
            flp.G(zf4.T0);
            final Integer b0 = zf4.B0;
            if (b0 != null) {
                flp.z((int)b0);
            }
            else {
                flp.z(-1);
            }
            flp.G(zf4.I0);
            flp.G(zf4.J0);
            flp.G(zf4.K0);
            flp.G(zf4.L0);
            flp.G(zf4.M0);
            flp.G(zf4.N0);
            flp.G(zf4.O0);
            flp.G(zf4.P0);
            flp.G(zf4.Q0);
            ((s4j)new xq4$a((alp)new kx6())).c(flp, (Object)zf4.R0);
            flp.G(zf4.S0);
            final dnr v0 = zf4.V0;
            Objects.requireNonNull(dnr.Companion);
            ((s4j)dnr$b.b).c(flp, (Object)v0);
            final azo w0 = zf4.W0;
            Objects.requireNonNull(azo.Companion);
            ((s4j)azo$b.b).c(flp, (Object)w0);
            ((s4j)d3k.b).c(flp, (Object)zf4.X0);
            rzo.c.c(flp, (Object)zf4.Y0);
        }
        
        public final h4j g() {
            return (h4j)new c();
        }
        
        public final void h(final elp elp, final h4j h4j, int z) throws IOException, ClassNotFoundException {
            final c c = (c)h4j;
            final d0p$b n0 = d0p.n0;
            final int a = w4j.a;
            elp.E((js2)n0, (h4j)c);
            c.l0 = elp.I();
            c.m0 = elp.z();
            c.n0 = elp.I();
            c.o0 = elp.I();
            c.p0 = elp.I();
            c.q0 = elp.I();
            c.r0 = elp.A();
            c.s0 = elp.I();
            c.t0 = elp.A();
            c.u0 = elp.A();
            c.w0 = elp.I();
            if (z < 1) {
                tkp.d(elp);
            }
            c.x0 = elp.I();
            c.y0 = (List)((s4j)new xq4$a((alp)lev.w1)).a(elp);
            c.z0 = (yac)((s4j)yac.d).a(elp);
            final e1p e1p = (e1p)((s4j)e1p.b).a(elp);
            c.A0 = elp.I();
            c.B0 = elp.I();
            if (z >= 2) {
                z = elp.z();
                if (z != -1) {
                    c.v0 = z;
                }
            }
            c.C0 = elp.I();
            c.D0 = elp.I();
            c.E0 = elp.I();
            c.F0 = elp.I();
            c.G0 = elp.I();
            c.H0 = elp.I();
            c.I0 = elp.I();
            c.J0 = elp.I();
            c.K0 = elp.I();
            c.L0 = (List)((s4j)new xq4$a((alp)new kx6())).a(elp);
            c.M0 = elp.I();
            Objects.requireNonNull(dnr.Companion);
            c.N0 = (dnr)((s4j)dnr$b.b).a(elp);
            Objects.requireNonNull(azo.Companion);
            final azo o0 = (azo)((s4j)azo$b.b).a(elp);
            if (o0 == null || o0.a()) {
                c.O0 = o0;
            }
            c.P0 = (d3k)((s4j)d3k.b).a(elp);
            c.Q0 = (rzo)rzo.c.a(elp);
        }
    }
    
    public static final class c extends d0p$a<zf4, c>
    {
        public String A0;
        public String B0;
        public String C0;
        public String D0;
        public String E0;
        public String F0;
        public String G0;
        public String H0;
        public String I0;
        public String J0;
        public String K0;
        public List<String> L0;
        public String M0;
        public dnr N0;
        public azo O0;
        public d3k P0;
        public rzo Q0;
        public String l0;
        public int m0;
        public String n0;
        public String o0;
        public String p0;
        public String q0;
        public long r0;
        public String s0;
        public long t0;
        public long u0;
        public Integer v0;
        public String w0;
        public String x0;
        public List<lev> y0;
        public yac z0;
        
        public final Object i() {
            return new zf4(this);
        }
    }
}
