import com.twitter.model.notification.NotificationSettingsLink;
import java.util.Collection;
import android.os.Build$VERSION;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cti implements jub
{
    public final dti F0;
    public final y0k G0;
    public final String H0;
    public final ewi I0;
    public final bwi J0;
    public final nbe K0;
    public final h57 L0;
    public final String M0;
    public final String N0;
    public final List O0;
    public final eqi P0;
    public final UserIdentifier Q0;
    public final int R0;
    public final String S0;
    public final long T0;
    
    public cti(final dti f0, final y0k g0, final String h0, final ewi i0, final bwi j0, final nbe k0, final h57 l0, final String m0, final String n0, final List o0, final eqi p15, final UserIdentifier q0, final int r0, final String s0, final long t0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p15;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
    }
    
    public final Object a(Object s, final Object o, final Object o2) {
        final dti f0 = this.F0;
        final y0k g0 = this.G0;
        final String h0 = this.H0;
        final ewi i0 = this.I0;
        final bwi j0 = this.J0;
        final nbe k0 = this.K0;
        final h57 l0 = this.L0;
        final String m0 = this.M0;
        final String n0 = this.N0;
        final List o3 = this.O0;
        final eqi p3 = this.P0;
        final UserIdentifier q0 = this.Q0;
        final int r0 = this.R0;
        final String s2 = this.S0;
        final long t0 = this.T0;
        final ojf ojf = (ojf)s;
        final ojf ojf2 = (ojf)o;
        final Integer n2 = (Integer)o2;
        Objects.requireNonNull(f0);
        final rg7 h2 = rg7.H0;
        final pid.a a = new pid.a();
        a.a = t0;
        a.b = h0;
        a.e = s2;
        a.d = m0;
        a.c = n0;
        final pid pid = (pid)a.e();
        final bti$a bti$a = new bti$a();
        bti$a.l = t0;
        bti$a.b = flr.n((String)g0.a.get("badge_count"), 1);
        bti$a.q = n2 + 1;
        final String s3 = g0.a.get("impression_id");
        final String s4 = "not_provided";
        String c = s3;
        if (s3 == null) {
            c = "not_provided";
        }
        bti$a.c = c;
        bti$a.e = h0;
        bti$a.f = g0.a.get("subtext");
        bti$a.d = g0.a.get("title");
        bti$a.g = m0;
        final String s5 = g0.a.get("scribe_target");
        vmw.g((Object)s5);
        bti$a.q(s5);
        bti$a.w = n0;
        final n87 n3 = null;
        String j2;
        if (j0 != null) {
            j2 = j0.e;
        }
        else {
            j2 = null;
        }
        boolean b = false;
        Label_0393: {
            if (l0 != null) {
                final ek1 m2 = l0.m;
                if (m2 != null && m2.a() == h2) {
                    b = true;
                    break Label_0393;
                }
            }
            b = false;
        }
        if (b) {
            final tr7 tr7 = (tr7)l0.m;
            vmw.g((Object)tr7);
            j2 = tr7.d();
        }
        bti$a.j = j2;
        int n4;
        if (g0.a.containsKey("priority")) {
            n4 = flr.n((String)g0.a.get("priority"), 0);
        }
        else {
            n4 = 0;
        }
        bti$a.m = n4;
        bti$a.t = i0;
        bti$a.s = j0;
        bti$a.n = g0.a.get("header");
        bti$a.o = g0.a.get("ticker");
        bti$a.a = r0;
        boolean b2 = false;
        Label_0566: {
            if (l0 != null) {
                final ek1 m3 = l0.m;
                if (m3 != null && m3.a() == h2) {
                    b2 = true;
                    break Label_0566;
                }
            }
            b2 = false;
        }
        boolean e1;
        if (b2) {
            final tr7 tr8 = (tr7)l0.m;
            vmw.g((Object)tr8);
            e1 = tr8.g.e1;
        }
        else {
            e1 = false;
        }
        bti$a.k = e1;
        bti$a.i = g0.a.get("uri");
        final pev d = f0.d;
        final String s6 = g0.a.get("channel");
        final long id = g0.e().getId();
        String a2 = s6;
        if (Build$VERSION.SDK_INT >= 26) {
            a2 = g0.a(d, s6);
        }
        String p4;
        if (flr.e((CharSequence)a2)) {
            p4 = null;
        }
        else {
            p4 = b1b.p(String.valueOf(id), a2);
        }
        bti$a.x = p4;
        bti$a.z = g0.a.get("sound");
        final boolean b3 = f0.a.m().g() && yds.b();
        List<ypi> list = null;
        Label_0897: {
            if (!kr4.t((Collection)o3)) {
                list = o3;
            }
            else if (r0 == 23) {
                list = ypi.g;
            }
            else if (r0 == 24) {
                list = ypi.h;
            }
            else if (r0 != 308 && !b3) {
                if (r0 != 22 && r0 != 253 && r0 != 274) {
                    if (r0 != 74 && r0 != 307 && r0 != 4) {
                        list = o3;
                        if (r0 != 27) {
                            break Label_0897;
                        }
                    }
                    list = ypi.f;
                }
                else {
                    list = ypi.i;
                }
            }
            else {
                list = ypi.j;
            }
        }
        bti$a.o((List)list);
        bti$a.v = p3;
        ojf.p((Object)pid);
        bti$a.p = (List)((z4j)ojf).e();
        e0e.f((Object)q0, "userIdentifier");
        bti$a.A = q0;
        bti$a.B = k0;
        bti$a.C = l0;
        bti$a.G = g0.a.get("small_icon");
        bti$a.y = s2;
        ojf2.p((Object)pid);
        bti$a.r = (List)((z4j)ojf2).e();
        bti$a.D = g0.a.get("endpoint_url");
        final String s7 = g0.a.get("badge_count_map");
        z0k e2;
        if (flr.g((CharSequence)s7)) {
            e2 = uih.e(s7, z0k.class, false);
        }
        else {
            e2 = null;
        }
        bti$a.E = e2;
        final String s8 = g0.a.get("notification_images");
        ati f2;
        if (s8 == null) {
            f2 = null;
        }
        else {
            f2 = uih.e(s8, (Class<ati>)hqi.class, false);
        }
        bti$a.F = f2;
        final String s9 = g0.a.get("settings_link");
        NotificationSettingsLink h3;
        if (s9 == null) {
            h3 = null;
        }
        else {
            h3 = uih.e(s9, NotificationSettingsLink.class, false);
        }
        bti$a.H = h3;
        String i2 = g0.a.get("overriding_impression_id");
        if (i2 == null) {
            i2 = s4;
        }
        bti$a.I = i2;
        final String s10 = g0.a.get("smart_notification_configuration");
        wvi k2;
        if (s10 == null) {
            k2 = null;
        }
        else {
            k2 = uih.e(s10, wvi.class, false);
        }
        bti$a.K = k2;
        final String s11 = g0.a.get("in_app_message");
        ggd l2;
        if (flr.g((CharSequence)s11)) {
            l2 = uih.e(s11, ggd.class, false);
        }
        else {
            l2 = null;
        }
        bti$a.L = l2;
        bti$a.M = flr.o((String)g0.a.get("sent_time"), -1L);
        bti$a.N = g0.a.get("topic_id");
        bti$a.T = Boolean.parseBoolean(g0.a.get("is_author_verified"));
        bti$a.O = g0.a.get("notification_type_metadata");
        final String s12 = g0.a.get("custom_formatting");
        uri r2;
        if (s12 == null) {
            r2 = null;
        }
        else {
            r2 = uih.e(s12, uri.class, false);
        }
        bti$a.R = r2;
        final String s13 = g0.a.get("notification_layout");
        Label_1485: {
            if (!flr.e((CharSequence)s13)) {
                final y50 y50 = (y50)qsz.m(qi1.a(s13), (ara)j0p.c);
                if (y50 != null) {
                    s = new pti(y50);
                    break Label_1485;
                }
            }
            s = null;
        }
        bti$a.S = (pti)s;
        bti$a.U = g0.a.get("subtitle");
        final String s14 = g0.a.get("quoted_tweet");
        uvl v;
        if (s14 == null) {
            v = null;
        }
        else {
            v = uih.e(s14, uvl.class, false);
        }
        bti$a.V = v;
        bti$a.W = g0.a.get("compact_state_colour");
        bti$a.X = g0.a.get("expanded_state_colour");
        final String s15 = g0.a.get("cta_suffix");
        n87 y51;
        if (s15 == null) {
            y51 = n3;
        }
        else {
            y51 = uih.e(s15, n87.class, false);
        }
        bti$a.Y = y51;
        final bti bti = (bti)((z4j)bti$a).e();
        if (nag.i()) {
            nag.a("dti", bti.toString());
        }
        return bti;
    }
}
