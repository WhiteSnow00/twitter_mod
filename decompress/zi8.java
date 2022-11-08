import androidx.fragment.app.Fragment;
import android.widget.TextView;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.Set;
import android.graphics.Point;
import java.util.Arrays;
import android.os.Bundle;
import com.twitter.safety.leaveconversation.LeaveConversationDialogFragmentArgs;
import android.net.Uri;
import java.util.Locale;
import android.text.Layout;
import android.graphics.Rect;
import java.util.Map;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.Decoder;
import com.twitter.permissions.PermissionContentViewResult;
import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import android.view.animation.Interpolator;
import android.view.View;
import java.util.Collection;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.ArrayList;
import java.util.List;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import java.util.Objects;
import androidx.appcompat.widget.Toolbar;
import kotlin.NoWhenBranchMatchedException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class zi8 implements kkb$b, vnk$a, bsl, zw8, pyy, uyz
{
    public static final zi8 C0;
    public static final zi8 D0;
    public static final char[] E0;
    public static final char[] F0;
    public static final zi8 G0;
    public static final int[] H0;
    public static final int[] I0;
    public static final int[] J0;
    
    public static final om9 A(final v3 v3) {
        final boolean b = v3 instanceof czr;
        om9 c0 = null;
        wm9 b2;
        if (b) {
            final int a = w4j.a;
            zzd.e((Object)v3, "cast(avMediaPlaylist)");
            b2 = ((czr)v3).b();
        }
        else {
            b2 = null;
        }
        if (b2 != null) {
            c0 = b2.C0;
        }
        return c0;
    }
    
    public static final b0j B(final Resources resources, final vo6 vo6, elu elu) {
        zzd.f((Object)resources, "res");
        zzd.f((Object)vo6, "tweet");
        final zvj zvj = new zvj(17);
        final elu s0 = vo6.S0;
        if (s0 != null) {
            elu = s0;
        }
        if (elu != null && elu.e == glu.F0) {
            final String c0 = elu.a.C0;
            zzd.e((Object)c0, "forwardPivot.text.toString()");
            if (c0.length() > 0 && zvj.f(vo6, dta.b().b("soft_interventions_like_nudge_enabled", false))) {
                return new b0j(2, mt0.Companion.a(elu, vo6.D()), elu.a.C0, 2131958144, (String)null, 2131232059, ColorStateList.valueOf(resources.getColor(2131100865)), 2131230837, (String)null, 0, resources.getString(2131958147), true, "soft_intervention_nudge", (String)null, 17168);
            }
        }
        final b0j a = c0j.a;
        return c0j.b;
    }
    
    public static final int C(int n, int n2, int n3) {
        if (n3 > 0) {
            if (n < n2) {
                int n4 = n2 % n3;
                if (n4 < 0) {
                    n4 += n3;
                }
                n %= n3;
                if (n < 0) {
                    n += n3;
                }
                n = (n4 - n) % n3;
                if (n < 0) {
                    n += n3;
                }
                n2 -= n;
            }
        }
        else {
            if (n3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (n > n2) {
                final int n5 = -n3;
                n %= n5;
                if (n < 0) {
                    n += n5;
                }
                n3 = n2 % n5;
                if (n3 < 0) {
                    n3 += n5;
                }
                n = (n - n3) % n5;
                if (n < 0) {
                    n += n5;
                }
                n2 += n;
            }
        }
        return n2;
    }
    
    public static final kip D(final ryu ryu, final keu keu, final giw giw) {
        Object o;
        if (!ryu.h() && ryu.b(keu, giw) == 4) {
            if (ryu.a.b0() && q0b.r()) {
                o = kip$c.a;
            }
            else {
                o = kip$b.a;
            }
        }
        else {
            o = kip$a.a;
        }
        return (kip)o;
    }
    
    public static boolean E() {
        return dta.c().b("android_enable_audio_transcription_for_vod", false);
    }
    
    public static final boolean F(final tsc tsc) {
        zzd.f((Object)tsc, "<this>");
        final boolean b = tsc.b;
        final boolean b2 = false;
        boolean d;
        if (b) {
            d = b2;
        }
        else {
            if (b) {
                throw new NoWhenBranchMatchedException();
            }
            final xrc f = tsc.f;
            d = b2;
            if (f != null) {
                final xsc n = f.n;
                d = b2;
                if (n != null) {
                    d = n.d;
                }
            }
        }
        return d;
    }
    
    public static final boolean G(final tsc tsc, final boolean b) {
        zzd.f((Object)tsc, "result");
        return tsc.b && (!b || tsc.g != null);
    }
    
    public static final boolean H(final tsc tsc) {
        zzd.f((Object)tsc, "result");
        final boolean e = tsc.e();
        final boolean b = false;
        boolean g;
        if (e) {
            g = b;
            if (tsc.b) {
                g = b;
                if (tsc.h == null) {
                    g = true;
                }
            }
        }
        else {
            g = G(tsc, false);
        }
        return g;
    }
    
    public static final boolean I(final rs6 rs6) {
        zzd.f((Object)rs6, "<this>");
        final long id = rs6.getId();
        boolean b = true;
        if (id != -1L) {
            final String conversationId = rs6.getConversationId();
            zzd.f((Object)conversationId, "<this>");
            if ((ckr.h1((CharSequence)conversationId) ^ true) && rs6.a() > 0L) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static final b5j J(final Toolbar toolbar) {
        zzd.g((Object)toolbar, "$this$itemClicks");
        return new rht(toolbar);
    }
    
    public static final long K(long n, final long n2) {
        n %= n2;
        if (n < 0L) {
            n += n2;
        }
        return n;
    }
    
    public static final b5j L(final Toolbar toolbar) {
        zzd.g((Object)toolbar, "$this$navigationClicks");
        return new sht(toolbar);
    }
    
    public static final v2p O(final m76 m76) {
        m76.x(-1464256199);
        final ea6$b a = ea6.a;
        Objects.requireNonNull(v2p.Companion);
        final dto<Object, Object> f = (dto<Object, Object>)v2p.f;
        m76.x(1157296644);
        final boolean p = m76.P((Object)0);
        final Object y = m76.y();
        Object o = null;
        Label_0090: {
            if (!p) {
                Objects.requireNonNull(m76.Companion);
                if ((o = y) != m76$a.b) {
                    break Label_0090;
                }
            }
            o = new j2p(0);
            m76.p(o);
        }
        m76.O();
        final v2p v2p = (v2p)rez.E(new Object[0], (dto)f, (String)null, (otb)o, m76, 4);
        m76.O();
        return v2p;
    }
    
    public static final Object P(final Object o, final Class clazz) {
        if (o != null && !clazz.isAssignableFrom(o.getClass())) {
            final Class<?> class1 = o.getClass();
            final StringBuilder sb = new StringBuilder();
            sb.append("ThisType method returned unexpected type ");
            sb.append(class1);
            throw new IllegalArgumentException(sb.toString());
        }
        return o;
    }
    
    public static final void Q(final TypefacesTextView typefacesTextView, final List list, final boolean b) {
        zzd.f((Object)typefacesTextView, "<this>");
        zzd.f((Object)list, "topics");
        if (!(list.isEmpty() ^ true) && !b) {
            ((View)typefacesTextView).setVisibility(8);
            ((TextView)typefacesTextView).setText((CharSequence)"");
        }
        else {
            final ArrayList list2 = new ArrayList();
            if (b) {
                final String string = ((View)typefacesTextView).getContext().getString(2131957269);
                zzd.e((Object)string, "context.getString(R.stri\u2026mployee_only_description)");
                list2.add(string);
            }
            final ArrayList<String> list3 = new ArrayList<String>(kr4.h1((Iterable)list, 10));
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                list3.add(((AudioSpaceTopicItem)iterator.next()).getName());
            }
            list2.addAll(list3);
            ((TextView)typefacesTextView).setText((CharSequence)or4.M1((Iterable)list2, (CharSequence)" · ", (CharSequence)null, (CharSequence)null, (rtb)null, 62));
            ic0.b((View)typefacesTextView, 300, (Interpolator)null, 0.0f, 1.0f);
        }
    }
    
    public static final boolean R(final ryu ryu, final keu keu, final giw giw) {
        zzd.f((Object)ryu, "<this>");
        zzd.f((Object)keu, "factory");
        zzd.f((Object)giw, "settings");
        return zzd.a((Object)D(ryu, keu, giw), (Object)kip$a.a) ^ true;
    }
    
    public static final boolean S(final ryu ryu, final keu keu, final giw giw) {
        zzd.f((Object)ryu, "<this>");
        zzd.f((Object)keu, "factory");
        zzd.f((Object)giw, "settings");
        return zzd.a((Object)D(ryu, keu, giw), (Object)kip$b.a);
    }
    
    public static final boolean T(final ryu ryu, final keu keu, final giw giw) {
        zzd.f((Object)ryu, "<this>");
        zzd.f((Object)keu, "factory");
        zzd.f((Object)giw, "settings");
        return zzd.a((Object)D(ryu, keu, giw), (Object)kip$c.a);
    }
    
    public static jkh U(final jkh jkh, final v2p v2p) {
        zzd.f((Object)jkh, "<this>");
        zzd.f((Object)v2p, "state");
        final ssd$a a = ssd.a;
        return l76.a(jkh, (rtb)ssd.a, (jub)new p2p(false, v2p, true, null));
    }
    
    public static int V(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static final long d(final float n, final float n2) {
        final long n3 = Float.floatToIntBits(n);
        final long n4 = Float.floatToIntBits(n2);
        final jy6.a companion = jy6.Companion;
        return (n4 & 0xFFFFFFFFL) | n3 << 32;
    }
    
    public static final long i(final float n, final float n2) {
        final long n3 = Float.floatToIntBits(n);
        final long n4 = Float.floatToIntBits(n2);
        final g99$a companion = g99.Companion;
        return (n4 & 0xFFFFFFFFL) | n3 << 32;
    }
    
    public static final long j(final float n, final float n2) {
        final long n3 = Float.floatToIntBits(n);
        final long n4 = Float.floatToIntBits(n2);
        final h99.a companion = h99.Companion;
        return (n4 & 0xFFFFFFFFL) | n3 << 32;
    }
    
    public static final boolean k(final euu euu) {
        final rh0 r = euu.r;
        boolean b2;
        final boolean b = b2 = false;
        if (r != null) {
            final ea9 o = euu.o;
            long f;
            if (o != null) {
                f = o.f;
            }
            else {
                f = 0L;
            }
            b2 = b;
            if (f > 0L) {
                b2 = b;
                if (dta.b().b("spaces_2022_h2_entity_no_impression_enabled", false)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public static final m8c o(final Context context, final y1t y1t, final znv znv) {
        final UserIdentifier k = ivl.k(y1t);
        final UserIdentifier j = ivl.j(y1t);
        final zvs a = y1t.a.a;
        final int a2 = a.a;
        final int g = y1t.g;
        final String b = a.b;
        final tpv i = y1t.k;
        final aav l = ivl.l(y1t);
        final String s = "list";
        String s2 = "viewer";
        final boolean b2 = false;
        boolean b3 = false;
        final String s3 = "user";
        String s4 = null;
        String s5 = null;
        Label_0389: {
            Label_0386: {
                if (a2 != 12) {
                    Label_0367: {
                        if (a2 != 52) {
                            if (a2 != 56) {
                                if (a2 == 67) {
                                    s4 = j.getStringId();
                                    s5 = "user_incoming_friendships_timeline_query";
                                    break Label_0367;
                                }
                                if (a2 != 48) {
                                    if (a2 == 49) {
                                        final String s6 = "list_subscribers_timeline_query";
                                        s4 = b;
                                        s2 = s;
                                        s5 = s6;
                                        b3 = b2;
                                        break Label_0367;
                                    }
                                    switch (a2) {
                                        default: {
                                            throw new UnsupportedOperationException(yk.y("GraphQlURTUserListRequest should not be called for timeline type ", a2));
                                        }
                                        case 44: {
                                            s4 = j.getStringId();
                                            s5 = "user_friends_following_timeline_query";
                                            s2 = s3;
                                            break Label_0386;
                                        }
                                        case 43: {
                                            s4 = j.getStringId();
                                            s5 = "viewer_muting_timeline_query";
                                            break Label_0367;
                                        }
                                        case 42: {
                                            s4 = j.getStringId();
                                            s5 = "viewer_imported_blocking_timeline_query";
                                            break;
                                        }
                                        case 41: {
                                            s4 = j.getStringId();
                                            s5 = "viewer_blocking_timeline_query";
                                            break;
                                        }
                                        case 40: {
                                            s4 = j.getStringId();
                                            s5 = "viewer_vit_followers_timeline_query";
                                            break Label_0367;
                                        }
                                        case 39: {
                                            s4 = j.getStringId();
                                            s5 = "user_following_timeline_query";
                                            s2 = s3;
                                            break Label_0386;
                                        }
                                        case 38: {
                                            s4 = j.getStringId();
                                            s5 = "user_followers_timeline_query";
                                            s2 = s3;
                                            break Label_0386;
                                        }
                                    }
                                }
                                else {
                                    s2 = "list";
                                    s5 = "list_members_timeline_query";
                                    s4 = b;
                                }
                            }
                            else {
                                s4 = j.getStringId();
                                s5 = "viewer_smart_blocking_timeline_query";
                            }
                            b3 = true;
                        }
                        else {
                            s4 = j.getStringId();
                            s5 = "dm_muted_users_timeline_query";
                        }
                    }
                    break Label_0389;
                }
                s4 = j.getStringId();
                s5 = "user_super_followers_timeline_query";
                s2 = "viewer_v2";
            }
            b3 = false;
        }
        final boolean e = pjr.e((CharSequence)s4);
        final StringBuilder y = mb0.y("GraphQlURTUserListRequest requires a restId. graphQlOperationName=", s5, ", graphQlParsingPathKey=", s2, ", timelineOwner.id=");
        y.append(j.getStringId());
        y.append(", timelineTag=");
        y.append(b);
        ij1.c(e ^ true, y.toString());
        return new m8c(context, s5, s2, k, j, a2, g, znv, b, i, l, s4, b3);
    }
    
    public static final boolean p(final PermissionContentViewResult permissionContentViewResult) {
        zzd.f((Object)permissionContentViewResult, "<this>");
        return permissionContentViewResult.getDeniedPermissions().isEmpty();
    }
    
    public static final tee r(final Decoder decoder) {
        zzd.f((Object)decoder, "<this>");
        tee tee;
        if (decoder instanceof tee) {
            tee = (tee)decoder;
        }
        else {
            tee = null;
        }
        if (tee != null) {
            return tee;
        }
        final StringBuilder g = w48.g("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        g.append(g9m.a((Class)decoder.getClass()));
        throw new IllegalStateException(g.toString());
    }
    
    public static final gfe s(final Encoder encoder) {
        zzd.f((Object)encoder, "<this>");
        gfe gfe;
        if (encoder instanceof gfe) {
            gfe = (gfe)encoder;
        }
        else {
            gfe = null;
        }
        if (gfe != null) {
            return gfe;
        }
        final StringBuilder g = w48.g("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        g.append(g9m.a((Class)encoder.getClass()));
        throw new IllegalStateException(g.toString());
    }
    
    public static final pnv t(final Context context, final y1t y1t, final znv znv, final pr0 pr0) {
        zzd.f((Object)context, "context");
        zzd.f((Object)y1t, "requestConfig");
        zzd.f((Object)znv, "urtCursorProvider");
        zzd.f((Object)pr0, "userNavigationTracker");
        final sjg t = sjg.t();
        final uew a = pr0.a;
        final tew b = a.b(1);
        if (b != null) {
            t.w((Object)"referrer", (Object)b.a);
            final tew b2 = a.b(0);
            qzo d;
            if (b2 != null) {
                d = b2.d;
            }
            else {
                d = null;
            }
            if (d != null) {
                final qzo d2 = b2.d;
                zzd.c((Object)d2);
                t.w((Object)"controller_data", (Object)d2.d);
            }
        }
        final boolean k = y1t.a.a.a == 61;
        final UserIdentifier i = ivl.k(y1t);
        final UserIdentifier j = ivl.j(y1t);
        final zvs a2 = y1t.a.a;
        final int a3 = a2.a;
        final String b3 = a2.b;
        long long1;
        if (b3 != null) {
            long1 = Long.parseLong(b3);
        }
        else {
            long1 = 0L;
        }
        final pnv$a pnv$a = new pnv$a(context, i, j, a3, long1, y1t.g, znv, ivl.l(y1t), new tpv((Map)((h4j)t).j()));
        pnv$a.k = k;
        pnv$a.j = y1t.q;
        return (pnv)((h4j)pnv$a).e();
    }
    
    public static int u(final Rect rect) {
        if (rect.height() == 0) {
            return 0;
        }
        return -rect.top;
    }
    
    public static int v(final Layout layout, final Rect rect) {
        if (rect.height() == 0) {
            return 0;
        }
        return Math.max(0, layout.getLineDescent(layout.getLineCount() - 1) - rect.bottom);
    }
    
    public static int w(final Layout layout, final Rect rect) {
        if (rect.height() == 0) {
            return 0;
        }
        return rect.top - layout.getLineAscent(0);
    }
    
    public static int x(String upperCase) {
        if (upperCase == null) {
            return 2131231779;
        }
        upperCase = upperCase.toUpperCase(Locale.ENGLISH);
        switch (upperCase) {
            default: {
                return 2131231779;
            }
            case "SPEAKER": {
                return 2131232454;
            }
            case "MESSAGE": {
                return 2131231772;
            }
            case "FOLLOW": {
                return 2131231773;
            }
            case "REPLY": {
                return 2131231777;
            }
            case "RETWEET": {
                return 2131231778;
            }
            case "MENTION": {
                return 2131231776;
            }
            case "FAVORITE": {
                return 2131231775;
            }
        }
    }
    
    public static String y(final q7t q7t) {
        final String a = q7t.a();
        if (a.startsWith("https://twitter.com/i/spaces/") && !a.substring(29).isEmpty()) {
            return Uri.parse(q7t.a()).getLastPathSegment();
        }
        return null;
    }
    
    public void M(final int n) {
        throw null;
    }
    
    public void N(final int n, final boolean b) {
        throw null;
    }
    
    public Object a() {
        final azy c = fzy.c;
        return fsz.D0.b().e();
    }
    
    public Object c(final cl1 cl1) {
        final boolean b = cl1 instanceof a4f;
        Object o = null;
        final LeaveConversationDialogFragmentArgs leaveConversationDialogFragmentArgs = null;
        Object o2;
        if (b) {
            o2 = cl1;
        }
        else {
            o2 = null;
        }
        if (o2 != null) {
            final Bundle i0 = ((Fragment)o2).I0;
            Object d = leaveConversationDialogFragmentArgs;
            if (i0 != null) {
                d = ln6.d(i0, (Class)LeaveConversationDialogFragmentArgs.class);
            }
            o = d;
        }
        return o;
    }
    
    public Object g(final Object o) {
        final dnz dnz = (dnz)o;
        final List r = wvz.r(dnz.D0);
        String g0;
        if (fk7.I0(dnz.G0)) {
            g0 = "";
        }
        else {
            g0 = dnz.G0;
        }
        final Rect n = wvz.n(r);
        String i0;
        if (fk7.I0(dnz.I0)) {
            i0 = "und";
        }
        else {
            i0 = dnz.I0;
        }
        return new pds.b(g0, n, r, i0, q0b.s((List)Arrays.asList(dnz.C0), (uyz)mlw.H0));
    }
    
    public zrl$a l(final Object o) {
        final Set set = (Set)o;
        zzd.f((Object)set, "args");
        final zrl$a zrl$a = new zrl$a();
        ((jp1$a)zrl$a).s(tsl.g("user_id", (Iterable)set));
        return zrl$a;
    }
    
    public boolean q(final boolean b, final boolean b2, final boolean b3) {
        boolean b5;
        final boolean b4 = b5 = true;
        if (b3) {
            b5 = b4;
            if (!b) {
                b5 = (b2 && b4);
            }
        }
        return b5;
    }
    
    public yi8 z(final String s) throws IOException {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(s).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new yi8(httpURLConnection);
    }
}
