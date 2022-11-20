import android.graphics.Bitmap;
import android.util.Log;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.IOException;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.InputStream;
import com.twitter.rooms.model.PodcastEpisode;
import com.twitter.rooms.subsystem.api.models.StationTrack$TrackData;
import android.graphics.Rect;
import android.graphics.Region$Op;
import android.graphics.Region;
import java.util.Map;
import android.content.Context;
import com.twitter.util.user.UserIdentifier$Companion;
import java.util.Objects;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.Set;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import android.view.View;
import java.util.concurrent.Executor;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w9i implements lrm, psb, fzy, e16
{
    public static final w9i D0;
    public static final w9i E0;
    public static final int[] F0;
    public static final int[] G0;
    public static final int[] H0;
    public static final int[] I0;
    public static final int[] J0;
    public static final int[] K0;
    public static final int[] L0;
    public static final int[] M0;
    public static final int[] N0;
    public static final int[] O0;
    public static final int[] P0;
    public static final int[] Q0;
    public static final int[] R0;
    public static final int[] S0;
    public static final int[] T0;
    public static final int[] U0;
    public static final int[] V0;
    public static final int[] W0;
    public static final int[] X0;
    public static final int[] Y0;
    public static final int[] Z0;
    public static final int[] a1;
    public static final int[] b1;
    public static final int[] c1;
    public static final int[] d1;
    public static final int[] e1;
    public static final int[] f1;
    public static final int[] g1;
    public static final int[] h1;
    public static w9i i1;
    public static final w9i j1;
    public static final w9i k1;
    public static final w9i l1;
    
    static {
        D0 = new w9i();
        E0 = new w9i();
        F0 = new int[] { 2130968870, 2130970933 };
        G0 = new int[] { 2130968736, 2130968905, 2130968906, 2130968907, 2130968908, 2130970253, 2130970254, 2130970255, 2130970256, 2130970257 };
        H0 = new int[] { 2130968733, 2130969708, 2130970633 };
        I0 = new int[] { 2130968842, 2130968843, 2130969852, 2130970287 };
        J0 = new int[] { 16842927, 2130968854, 2130970077, 2130970371, 2130970372, 2130970380 };
        K0 = new int[] { 2130969563, 2130969824, 2130969826, 2130969827 };
        L0 = new int[] { 2130968918, 2130968919, 2130968920, 2130968921 };
        M0 = new int[] { 2130969139, 2130969140, 2130969141, 2130969142, 2130969236, 2130969596, 2130970622, 2130970974 };
        N0 = new int[] { 2130970934, 2130970944, 2130970947 };
        O0 = new int[] { 2130968705, 2130968782, 2130968785, 2130969202, 2130970529, 2130970993, 2130970997, 2130971023 };
        P0 = new int[] { 2130969247, 2130969494, 2130969766, 2130969917 };
        Q0 = new int[] { 2130968581, 2130968582, 2130969570, 2130969861, 2130970996, 2130971066, 2130971067 };
        R0 = new int[] { 2130969807 };
        S0 = new int[] { 2130968773, 2130968775, 2130969485, 2130969579, 2130969629, 2130969820 };
        T0 = new int[] { 2130968778, 2130968863, 2130970317, 2130970558, 2130970559, 2130971062, 2130971064 };
        U0 = new int[] { 2130970330, 2130970331, 2130970609, 2130970621, 2130970630, 2130970733, 2130970901 };
        V0 = new int[] { 2130968948, 2130971146 };
        W0 = new int[] { 2130970615, 2130970624, 2130970625, 2130970626, 2130970635, 2130971076, 2130971162 };
        X0 = new int[] { 2130968874, 2130968881, 2130970244, 2130971058 };
        Y0 = new int[] { 16842901, 16842904, 16842907, 16843087, 16843287, 16843288, 2130970653 };
        Z0 = new int[] { 16842901, 2130970915, 2130970916, 2130970919, 2130970920 };
        a1 = new int[] { 2130969646, 2130970816, 2130970890, 2130970891, 2130970892, 2130971104 };
        b1 = new int[] { 2130968682, 2130968683, 2130969012, 2130969014, 2130969015, 2130970261, 2130970701, 2130970712, 2130970713, 2130970952 };
        c1 = new int[] { 2130968690, 2130968692, 2130969118, 2130970521, 2130970818, 2130970987, 2130970990, 2130971012, 2130971164, 2130971165 };
        d1 = new int[] { 2130968859, 2130968860, 2130968997, 2130969622, 2130969906, 2130969907, 2130969910, 2130969912, 2130970121, 2130970147, 2130970148, 2130970149, 2130970723, 2130970724, 2130971059 };
        e1 = new int[] { 2130970051, 2130970489, 2130970490, 2130971144 };
        f1 = new int[] { 2130969200, 2130969207, 2130969269, 2130969270, 2130969272, 2130970027, 2130970561, 2130970629 };
        g1 = new int[] { 16843173, 16843181, 16843183 };
        h1 = new int[] { 2130970477, 2130970479 };
        j1 = new w9i();
        k1 = new w9i();
        l1 = new w9i();
    }
    
    public static final boolean L() {
        return asa.d().b("responsive_web_delegate_enabled", false);
    }
    
    public static final boolean M() {
        return czd.a((Object)asa.b().k("tweet_detail_inline_reply_bar_full_composer_type"), (Object)"all_actions") || czd.a((Object)asa.b().k("tweet_detail_inline_reply_bar_full_composer_type"), (Object)"multi_media");
    }
    
    public static final boolean O(final String s) {
        czd.f((Object)s, "eventId");
        final fmv b = asa.b();
        boolean b2 = false;
        if (!b.b("live_event_landing_page_score_card_redesign", false)) {
            final List g = asa.b().g("live_event_landing_page_score_card_redesign_event_ids");
            czd.e((Object)g, "getCurrent()\n    .getLis\u2026_CARD_REDESIGN_EVENT_IDS)");
            if (!g.contains(s)) {
                return b2;
            }
        }
        b2 = true;
        return b2;
    }
    
    public static final void V(final smf smf, final UserIdentifier userIdentifier) {
        ((qd)smf).e((Runnable)new g01((Object)smf, (Object)userIdentifier, 11), (Executor)n3c.a().b(4));
    }
    
    public static final void W(final boolean b, final UserIdentifier userIdentifier) {
        final qbu b2 = qbu.Companion.b(userIdentifier);
        if (b != b2.e("notifications_enabled", false)) {
            String s;
            if (b) {
                s = "enabled_change";
            }
            else {
                s = "disabled_change";
            }
            Y(userIdentifier, s);
            b2.i().f("notifications_enabled", b).e();
        }
        String s2;
        if (b) {
            s2 = "enabled";
        }
        else {
            s2 = "disabled";
        }
        Y(userIdentifier, s2);
        final boolean b3 = hol.a(userIdentifier).b();
        if (userIdentifier.isRegularUser()) {
            String s3;
            if (b3) {
                s3 = "enabled";
            }
            else {
                s3 = "disabled";
            }
            cbw.b((elm)new af4(userIdentifier, vba.Companion.e("app", "notifications", "settings", "master_switch", s3)));
        }
    }
    
    public static final void X(final UserIdentifier userIdentifier, final String s) {
        cbw.b((elm)new af4(userIdentifier, vba.Companion.e("app", "notifications", "restriction", "status", s)));
    }
    
    public static final void Y(final UserIdentifier userIdentifier, final String s) {
        cbw.b((elm)new af4(userIdentifier, vba.Companion.e("notification", "", "", "system_push_setting", s)));
    }
    
    public static final void Z(final View view, final nsb nsb) {
        czd.f((Object)view, "<this>");
        czd.f((Object)nsb, "evaluateStringRes");
        j6x.z(view, (vf)new dd4(nsb));
    }
    
    public static final boolean a0(final adw adw) {
        czd.f((Object)adw, "userInfo");
        return adw.g() && L();
    }
    
    public static final int b0(final u0l u0l, final WorkDatabase workDatabase, final a a, final List list, final rsx rsx, final Set set) {
        final String a2 = rsx.a;
        final rsx h = workDatabase.y().h(a2);
        if (h == null) {
            throw new IllegalArgumentException(da8.j("Worker with ", a2, " doesn't exist"));
        }
        if (h.b.b()) {
            return 1;
        }
        if (!(h.d() ^ rsx.d())) {
            final boolean d = u0l.d(a2);
            if (!d) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    ((hwo)iterator.next()).c(a2);
                }
            }
            final ctx ctx = new ctx(workDatabase, rsx, h, list, a2, set, d);
            ((tcn)workDatabase).c();
            try {
                ctx.run();
                ((tcn)workDatabase).q();
                ((tcn)workDatabase).l();
                if (!d) {
                    pwo.a(a, workDatabase, list);
                }
                int n;
                if (d) {
                    n = 3;
                }
                else {
                    n = 2;
                }
                return n;
            }
            finally {
                ((tcn)workDatabase).l();
            }
        }
        final etx d2 = etx.D0;
        final StringBuilder j = fu8.j("Can't update ");
        j.append((String)d2.invoke((Object)h));
        j.append(" Worker to ");
        throw new UnsupportedOperationException(ed.B(j, (String)d2.invoke((Object)rsx), " Worker. Update operation must preserve worker's type."));
    }
    
    public static final boolean c(final wgp wgp) {
        final pgp f = wgp.f();
        final zgp a = zgp.a;
        return qgp.a(f, (ehp<Object>)zgp.j) == null;
    }
    
    public static int c0(int abs, int n, final RoundingMode roundingMode) {
        Objects.requireNonNull(roundingMode);
        if (n == 0) {
            throw new ArithmeticException("/ by zero");
        }
        final int n2 = abs / n;
        final int n3 = abs - n * n2;
        if (n3 == 0) {
            return n2;
        }
        final int n4 = 1;
        final int n5 = 1;
        final int n6 = (abs ^ n) >> 31 | 0x1;
        abs = n4;
        Label_0225: {
            switch (oky.a[roundingMode.ordinal()]) {
                default: {
                    throw new AssertionError();
                }
                case 6:
                case 7:
                case 8: {
                    abs = Math.abs(n3);
                    abs -= Math.abs(n) - abs;
                    if (abs == 0) {
                        abs = n4;
                        if (roundingMode == RoundingMode.HALF_UP) {
                            break Label_0225;
                        }
                        if (roundingMode == RoundingMode.HALF_EVEN) {
                            abs = 1;
                        }
                        else {
                            abs = 0;
                        }
                        if ((n2 & 0x1) != 0x0) {
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                        if ((abs & n) != 0x0) {
                            abs = n4;
                            break Label_0225;
                        }
                        break Label_0225;
                    }
                    else {
                        if (abs > 0) {
                            abs = n4;
                            break Label_0225;
                        }
                        break Label_0225;
                    }
                    break;
                }
                case 5: {
                    if (n6 > 0) {
                        abs = n4;
                        break Label_0225;
                    }
                    break Label_0225;
                }
                case 3: {
                    if (n6 < 0) {
                        abs = n4;
                        break Label_0225;
                    }
                    break Label_0225;
                }
                case 1: {
                    if (n3 == 0) {
                        abs = n5;
                    }
                    else {
                        abs = 0;
                    }
                    if (abs != 0) {
                        break Label_0225;
                    }
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                case 2: {
                    abs = 0;
                }
                case 4: {
                    n = n2;
                    if (abs != 0) {
                        n = n2 + n6;
                    }
                    return n;
                }
            }
        }
    }
    
    public static final boolean d(final wgp wgp) {
        final pgp f = wgp.f;
        final ogp a = ogp.a;
        final boolean g = f.g(ogp.i);
        final boolean b = false;
        if (g) {
            final pgp f2 = wgp.f;
            final zgp a2 = zgp.a;
            if (!czd.a(qgp.a(f2, (ehp<Object>)zgp.l), (Object)Boolean.TRUE)) {
                return true;
            }
        }
        final vve m = m(wgp.c, (qsb)u20.D0);
        boolean b2 = b;
        if (m == null) {
            return b2;
        }
        final tgp e0 = rp9.e0(m);
        boolean a4 = false;
        Label_0118: {
            if (e0 != null) {
                final pgp f3 = msy.f(e0);
                if (f3 != null) {
                    final zgp a3 = zgp.a;
                    a4 = czd.a(qgp.a(f3, (ehp<Object>)zgp.l), (Object)Boolean.TRUE);
                    break Label_0118;
                }
            }
            a4 = false;
        }
        b2 = b;
        if (a4) {
            return b2;
        }
        b2 = true;
        return b2;
    }
    
    public static int d0(final int n, final RoundingMode roundingMode) {
        if (n <= 0) {
            final StringBuilder sb = new StringBuilder("x".length() + 26);
            sb.append("x");
            sb.append(" (");
            sb.append(n);
            sb.append(") must be > 0");
            throw new IllegalArgumentException(sb.toString());
        }
        final int n2 = oky.a[roundingMode.ordinal()];
        int n3 = true ? 1 : 0;
        switch (n2) {
            default: {
                throw new AssertionError();
            }
            case 6:
            case 7:
            case 8: {
                final int numberOfLeadingZeros = Integer.numberOfLeadingZeros(n);
                return 31 - numberOfLeadingZeros + (~(~((-1257966797 >>> numberOfLeadingZeros) - n)) >>> 31);
            }
            case 4:
            case 5: {
                return 32 - Integer.numberOfLeadingZeros(n - 1);
            }
            case 1: {
                final boolean b = n > 0;
                if ((n - 1 & n) != 0x0) {
                    n3 = (false ? 1 : 0);
                }
                if (((b ? 1 : 0) & n3) != 0x0) {
                    return 31 - Integer.numberOfLeadingZeros(n);
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            }
            case 2:
            case 3: {
                return 31 - Integer.numberOfLeadingZeros(n);
            }
        }
    }
    
    public static final boolean e() {
        final UserIdentifier$Companion companion = UserIdentifier.Companion;
        boolean b = false;
        if (m1f.m(companion, "c9s_enabled", false)) {
            b = b;
            if (asa.b().b("c9s_tweet_anatomy_conversation_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public static final boolean f(final wgp wgp) {
        return wgp.c.T0 == fve.E0;
    }
    
    public static final boolean g(final wgp wgp) {
        final pgp f = wgp.f;
        final ogp a = ogp.a;
        return f.g(ogp.i);
    }
    
    public static final boolean h() {
        final uor.g companion = uor.Companion;
        final boolean d = companion.d();
        final boolean b = false;
        if (!d) {
            boolean b2 = b;
            if (!asa.b().b("subscriptions_enabled", false)) {
                return b2;
            }
            b2 = b;
            if (!asa.b().b("subscriptions_dash_item_enabled", false)) {
                return b2;
            }
            b2 = b;
            if (!companion.c()) {
                return b2;
            }
        }
        return true;
    }
    
    public static final n7c i(final Context context, final o2t o2t, final yov yov) {
        final UserIdentifier b = eli.B(o2t);
        final UserIdentifier a = eli.A(o2t);
        final lws a2 = o2t.a.a;
        final int a3 = a2.a;
        final int g = o2t.g;
        final String b2 = a2.b;
        final pqv k = o2t.k;
        final vav c = eli.C(o2t);
        final String s = "list";
        String s2 = "viewer";
        final boolean b3 = false;
        boolean b4 = false;
        final String s3 = "user";
        String s4 = null;
        String s9 = null;
        String s10 = null;
        Label_0405: {
            String s7 = null;
            String s8 = null;
            Label_0394: {
                if (a3 != 12) {
                    String s5 = null;
                    Label_0367: {
                        if (a3 != 52) {
                            if (a3 != 56) {
                                if (a3 == 67) {
                                    s4 = a.getStringId();
                                    s5 = "user_incoming_friendships_timeline_query";
                                    break Label_0367;
                                }
                                if (a3 != 48) {
                                    if (a3 == 49) {
                                        final String s6 = "list_subscribers_timeline_query";
                                        s4 = b2;
                                        s2 = s;
                                        s5 = s6;
                                        b4 = b3;
                                        break Label_0367;
                                    }
                                    switch (a3) {
                                        default: {
                                            throw new UnsupportedOperationException(udu.z("GraphQlURTUserListRequest should not be called for timeline type ", a3));
                                        }
                                        case 44: {
                                            s4 = a.getStringId();
                                            s7 = "user_friends_following_timeline_query";
                                            s8 = s3;
                                            break Label_0394;
                                        }
                                        case 43: {
                                            s4 = a.getStringId();
                                            s5 = "viewer_muting_timeline_query";
                                            break Label_0367;
                                        }
                                        case 42: {
                                            s4 = a.getStringId();
                                            s5 = "viewer_imported_blocking_timeline_query";
                                            break;
                                        }
                                        case 41: {
                                            s4 = a.getStringId();
                                            s5 = "viewer_blocking_timeline_query";
                                            break;
                                        }
                                        case 40: {
                                            s4 = a.getStringId();
                                            s5 = "viewer_vit_followers_timeline_query";
                                            break Label_0367;
                                        }
                                        case 39: {
                                            s4 = a.getStringId();
                                            s7 = "user_following_timeline_query";
                                            s8 = s3;
                                            break Label_0394;
                                        }
                                        case 38: {
                                            s4 = a.getStringId();
                                            s7 = "user_followers_timeline_query";
                                            s8 = s3;
                                            break Label_0394;
                                        }
                                    }
                                }
                                else {
                                    s2 = "list";
                                    s5 = "list_members_timeline_query";
                                    s4 = b2;
                                }
                            }
                            else {
                                s4 = a.getStringId();
                                s5 = "viewer_smart_blocking_timeline_query";
                            }
                            b4 = true;
                        }
                        else {
                            s4 = a.getStringId();
                            s5 = "dm_muted_users_timeline_query";
                        }
                    }
                    s9 = s5;
                    s10 = s2;
                    break Label_0405;
                }
                s4 = a.getStringId();
                s7 = "user_super_followers_timeline_query";
                s8 = "viewer_v2";
            }
            s9 = s7;
            s10 = s8;
            b4 = false;
        }
        final boolean e = ikr.e((CharSequence)s4);
        final StringBuilder q = tqf.q("GraphQlURTUserListRequest requires a restId. graphQlOperationName=", s9, ", graphQlParsingPathKey=", s10, ", timelineOwner.id=");
        q.append(a.getStringId());
        q.append(", timelineTag=");
        q.append(b2);
        cj1.c(e ^ true, q.toString());
        return new n7c(context, s9, s10, b, a, a3, g, yov, b2, k, c, s4, b4);
    }
    
    public static final oov j(final Context context, final o2t o2t, final yov yov, final ir0 ir0) {
        czd.f((Object)context, "context");
        czd.f((Object)o2t, "requestConfig");
        czd.f((Object)yov, "urtCursorProvider");
        czd.f((Object)ir0, "userNavigationTracker");
        final qjg t = qjg.t();
        final hfw a = ir0.a;
        final gfw b = a.b(1);
        if (b != null) {
            t.w((Object)"referrer", (Object)b.a);
            final gfw b2 = a.b(0);
            h0p d;
            if (b2 != null) {
                d = b2.d;
            }
            else {
                d = null;
            }
            if (d != null) {
                final h0p d2 = b2.d;
                czd.c((Object)d2);
                t.w((Object)"controller_data", (Object)d2.d);
            }
        }
        final boolean k = o2t.a.a.a == 61;
        final UserIdentifier b3 = eli.B(o2t);
        final UserIdentifier a2 = eli.A(o2t);
        final lws a3 = o2t.a.a;
        final int a4 = a3.a;
        final String b4 = a3.b;
        long long1;
        if (b4 != null) {
            long1 = Long.parseLong(b4);
        }
        else {
            long1 = 0L;
        }
        final oov$a oov$a = new oov$a(context, b3, a2, a4, long1, o2t.g, yov, eli.C(o2t), new pqv((Map)((n4j)t).j()));
        oov$a.k = k;
        oov$a.j = o2t.q;
        return (oov)((n4j)oov$a).e();
    }
    
    public static final boolean k(final ew9 ew9) {
        czd.f((Object)ew9, "image");
        final String q0 = ew9.Q0;
        final boolean b = false;
        if (q0 == null || vkr.V((CharSequence)q0)) {
            final String p = ew9.P0;
            boolean b2 = b;
            if (p == null) {
                return b2;
            }
            b2 = b;
            if (!(vkr.V((CharSequence)p) ^ true)) {
                return b2;
            }
        }
        else {
            final boolean b2 = b;
            if (czd.a((Object)ew9.Q0, (Object)ew9.P0)) {
                return b2;
            }
        }
        return true;
    }
    
    public static final j3p l(final List list, final int n) {
        czd.f((Object)list, "<this>");
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (((j3p)list.get(i)).D0 == n) {
                return (j3p)list.get(i);
            }
        }
        return null;
    }
    
    public static final vve m(vve vve, final qsb qsb) {
        for (vve = vve.x(); vve != null; vve = vve.x()) {
            if (qsb.invoke((Object)vve)) {
                return vve;
            }
        }
        return null;
    }
    
    public static final void n(final Region region, final wgp wgp, final Map map, final wgp wgp2) {
        final vve c = wgp2.c;
        final boolean v0 = c.V0;
        boolean b = true;
        final boolean b2 = !v0 || !c.H();
        if ((region.isEmpty() && wgp2.g != wgp.g) || (b2 && !wgp2.d)) {
            return;
        }
        tgp tgp;
        if (wgp2.f.E0) {
            if ((tgp = rp9.d0(wgp2.c)) == null) {
                tgp = wgp2.a;
            }
        }
        else {
            tgp = wgp2.a;
        }
        czd.f((Object)tgp, "<this>");
        c6m c6m = null;
        Label_0435: {
            if (!((yl8)tgp).l().J0) {
                Objects.requireNonNull(c6m.Companion);
                c6m = c6m.e;
            }
            else {
                final pgp z = tgp.z();
                final ogp a = ogp.a;
                if (qgp.a(z, (ehp<Object>)ogp.c) == null) {
                    c6m = af8.g((eve)wd.x((yl8)tgp, 8));
                }
                else {
                    zmi zmi = wd.x((yl8)tgp, 8);
                    if (!zmi.j()) {
                        Objects.requireNonNull(c6m.Companion);
                        c6m = c6m.e;
                    }
                    else {
                        final eve q = af8.q((eve)zmi);
                        kuh w0;
                        if ((w0 = zmi.W0) == null) {
                            w0 = new kuh();
                            zmi.W0 = w0;
                        }
                        final long w2 = zmi.W0(zmi.f1());
                        w0.a = -ddq.d(w2);
                        w0.b = -ddq.b(w2);
                        w0.c = ddq.d(w2) + ((wgk)zmi).F0();
                        w0.d = ddq.b(w2) + ((wgk)zmi).A0();
                        while (zmi != q) {
                            zmi.t1(w0, false, true);
                            if (w0.b()) {
                                Objects.requireNonNull(c6m.Companion);
                                c6m = c6m.e;
                                break Label_0435;
                            }
                            zmi = zmi.L0;
                            czd.c((Object)zmi);
                        }
                        c6m = new c6m(w0.a, w0.b, w0.c, w0.d);
                    }
                }
            }
        }
        final Rect q2 = rp9.Q0(c6m);
        final Region region2 = new Region();
        region2.set(q2);
        int g;
        if ((g = wgp2.g) == wgp.g) {
            g = -1;
        }
        if (region2.op(region, region2, Region$Op.INTERSECT)) {
            final Rect bounds = region2.getBounds();
            czd.e((Object)bounds, "region.bounds");
            map.put(g, new xgp(wgp2, bounds));
            final List e = wgp2.e(false);
            for (int n = e.size() - 1; -1 < n; --n) {
                n(region, wgp, map, (wgp)e.get(n));
            }
            region.op(q2, region, Region$Op.REVERSE_DIFFERENCE);
        }
        else if (wgp2.d) {
            final wgp g2 = wgp2.g();
            Label_0630: {
                if (g2 != null) {
                    final vve c2 = g2.c;
                    if (c2 != null && c2.V0) {
                        break Label_0630;
                    }
                }
                b = false;
            }
            c6m d;
            if (b) {
                d = g2.d();
            }
            else {
                d = new c6m(0.0f, 0.0f, 10.0f, 10.0f);
            }
            map.put(g, new xgp(wgp2, rp9.Q0(d)));
        }
        else if (g == -1) {
            final Rect bounds2 = region2.getBounds();
            czd.e((Object)bounds2, "region.bounds");
            map.put(g, new xgp(wgp2, bounds2));
        }
    }
    
    public static String o(final Context context) {
        if (asa.b().b("media_async_upload_gif_enabled", false)) {
            final float e = asa.b().e("media_async_upload_max_gif_size", 0.0f);
            if (e > 0.0f) {
                return context.getString(2131954811, new Object[] { e });
            }
        }
        return context.getString(2131954812);
    }
    
    public static final l6j p(final amq amq, final m1d m1d) {
        czd.f((Object)amq, "<this>");
        return (l6j)new l1d(amq, m1d);
    }
    
    public static w9i q() {
        if (w9i.i1 == null) {
            w9i.i1 = new w9i();
        }
        return w9i.i1;
    }
    
    public static int s() {
        if (asa.b().b("media_async_upload_gif_enabled", false)) {
            final float e = asa.b().e("media_async_upload_max_gif_size", 0.0f);
            if (e > 0.0f) {
                return (int)(e * 1048576.0f);
            }
        }
        return 5242880;
    }
    
    public static final StationTrack$TrackData t(final List list, int n) {
        czd.f((Object)list, "<this>");
        final int size = list.size();
        final int n2 = 0;
        int n3;
        if (n == size - 1) {
            n3 = 0;
        }
        else {
            n3 = n + 1;
        }
        final StationTrack$TrackData stationTrack$TrackData = null;
        final String s = null;
        StationTrack$TrackData stationTrack$TrackData2 = stationTrack$TrackData;
        if (n3 != n) {
            final xvt xvt = list.get(n3);
            ++n3;
            czd.f((Object)xvt, "<this>");
            final Object y = af8.y(xvt);
            if (y instanceof PodcastEpisode) {
                stationTrack$TrackData2 = new StationTrack$TrackData(((PodcastEpisode)y).getShow().getArtUrl(), owt.D0, n3);
            }
            else {
                stationTrack$TrackData2 = stationTrack$TrackData;
                if (y instanceof r21) {
                    final r21 r21 = (r21)y;
                    czd.f((Object)r21, "<this>");
                    final nl2 b = nl2.b(r21.i);
                    czd.e((Object)b, "safeValueOf(this.state)");
                    n = n2;
                    Label_0175: {
                        if (r21.J) {
                            if (b != nl2.G0) {
                                n = n2;
                                if (b != nl2.H0) {
                                    break Label_0175;
                                }
                            }
                            n = 1;
                        }
                    }
                    owt owt;
                    if (n != 0) {
                        owt = owt.F0;
                    }
                    else {
                        owt = owt.E0;
                    }
                    final s21 o = r21.O;
                    String b2 = s;
                    if (o != null) {
                        b2 = o.b();
                    }
                    stationTrack$TrackData2 = new StationTrack$TrackData(b2, owt, n3);
                }
            }
        }
        return stationTrack$TrackData2;
    }
    
    public static int u(int n) {
        if (f8t.b(n)) {
            n = 500;
        }
        else {
            n = 100;
        }
        return n;
    }
    
    public static void v(final int n) {
        f8t.b(n);
    }
    
    public static void w(final InputStream inputStream, final File file) throws IOException {
        final byte[] array = new byte[8192];
        final Closeable closeable = null;
        Closeable closeable2;
        try {
            final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(new FileOutputStream(file));
            try {
                while (true) {
                    final int read = inputStream.read(array);
                    if (read <= 0) {
                        break;
                    }
                    gzipOutputStream.write(array, 0, read);
                }
                gzipOutputStream.finish();
                yw4.b((Closeable)gzipOutputStream);
                return;
            }
            finally {}
        }
        finally {
            closeable2 = closeable;
        }
        yw4.b(closeable2);
    }
    
    public static final void x(final zu1 zu1, final String s) {
        czd.f((Object)zu1, "bceNotificationHelper");
        switch (s) {
            case "dismiss": {
                zu1.b((lri)lri$c.b);
                break;
            }
            case "background_open": {
                zu1.b((lri)lri$a.b);
                break;
            }
            case "impression": {
                zu1.a((lri)lri$a.b);
                break;
            }
            case "open": {
                zu1.b((lri)lri$d.b);
                break;
            }
            case "background_dismiss": {
                zu1.b((lri)lri$b.b);
                break;
            }
            default:
                break;
        }
    }
    
    public boolean A() {
        final boolean z = this.z();
        boolean b = false;
        if (z) {
            b = b;
            if (asa.b().b("c9s_invites_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean B() {
        final boolean e = this.E();
        boolean b = false;
        if (e) {
            b = b;
            if (asa.b().b("twitter_chat_c9s_entry_point_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean C() {
        final boolean z = this.z();
        boolean b = false;
        if (z) {
            b = b;
            if (asa.b().b("c9s_edit_moderators_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean D() {
        final boolean z = this.z();
        boolean b = false;
        if (z) {
            b = b;
            if (asa.b().b("c9s_membership_settings_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean E() {
        final boolean z = this.z();
        boolean b = false;
        if (z) {
            b = b;
            if (asa.b().b("c9s_notification_settings_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean F() {
        final boolean e = this.E();
        boolean b = false;
        if (e) {
            b = b;
            if (asa.b().b("c9s_notification_settings_pinned_tweet_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean G() {
        final boolean z = this.z();
        boolean b = false;
        if (z) {
            b = b;
            if (asa.b().b("c9s_remove_member_list_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean H() {
        final boolean z = this.z();
        boolean b = false;
        if (z) {
            b = b;
            if (asa.b().b("c9s_request_to_join_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean I() {
        final boolean z = this.z();
        boolean b2;
        final boolean b = b2 = false;
        if (z) {
            b2 = b;
            if (this.H()) {
                b2 = b;
                if (asa.b().b("c9s_request_to_join_moderation_enabled", false)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public boolean J() {
        final boolean e = this.E();
        boolean b = false;
        if (e) {
            b = b;
            if (asa.b().b("spaces_2022_h2_spaces_communities", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean K() {
        final boolean z = this.z();
        boolean b = false;
        if (z) {
            b = b;
            if (asa.b().b("c9s_spotlight_creation_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean N(final int n) {
        return 5 <= n;
    }
    
    public boolean P() {
        final boolean z = this.z();
        boolean b = false;
        if (z) {
            b = b;
            if (asa.b().b("c9s_superc9s_indication_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean Q() {
        return this.R() || this.S();
    }
    
    public boolean R() {
        final boolean z = this.z();
        boolean b = false;
        if (z) {
            b = b;
            if (asa.b().b("c9s_unread_indicator_mod_actions_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean S() {
        final boolean z = this.z();
        boolean b = false;
        if (z) {
            b = b;
            if (asa.b().b("c9s_unread_indicator_tweets_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public String T(final String s) {
        return da8.j("unknown", ":", s);
    }
    
    public void U(final int n, String string, final String s, final Throwable t) {
        final String t2 = this.T(string);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append('\n');
        if (t == null) {
            string = "";
        }
        else {
            final StringWriter stringWriter = new StringWriter();
            t.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        sb.append(string);
        Log.println(n, t2, sb.toString());
    }
    
    public Object a() {
        final qzy c = uzy.c;
        return (int)tsz.E0.b().i();
    }
    
    public Object apply(final Object o) {
        final eaq eaq = (eaq)o;
        czd.g((Object)eaq, "it");
        return eaq;
    }
    
    public void b(final Object o) {
        ((Bitmap)o).recycle();
    }
    
    public Object r(final y06 y06) {
        return new dfa(((ism)y06).I((Class)hch.class));
    }
    
    public boolean y() {
        final boolean z = this.z();
        boolean b = false;
        if (z) {
            b = b;
            if (asa.b().b("c9s_admin_tools_reported_tweets_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean z() {
        return m1f.m(UserIdentifier.Companion, "c9s_enabled", false);
    }
}
