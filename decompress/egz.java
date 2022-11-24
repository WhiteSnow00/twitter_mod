import java.io.IOException;
import android.graphics.PointF;
import java.util.logging.Level;
import java.util.logging.Logger;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.GoogleMapOptions;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.content.Context;
import tv.periscope.model.b;
import android.content.res.Resources;
import java.util.Objects;
import java.util.List;
import com.twitter.media.av.model.LiveContentRestrictedError;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.communities.subsystem.api.args.CommunitiesDetailContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egz implements lp6, kpw, rxs, btl, c0z, wzt
{
    public static bgz F0;
    public static final egz G0;
    public static final int[] H0;
    public static final int[] I0;
    public static final int[] J0;
    public static final int[] K0;
    public static final int[] L0;
    public static final egz M0;
    public static final egz N0;
    public static final egz O0;
    
    static {
        G0 = new egz();
        H0 = new int[] { 16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779 };
        I0 = new int[] { 16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867 };
        J0 = new int[] { 16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062 };
        K0 = new int[] { 16842755, 16843781 };
        L0 = new int[] { 2130969770, 2130969904, 2130969915 };
        M0 = new egz();
        N0 = new egz();
        O0 = new egz();
    }
    
    public static boolean A(final String s) {
        final int a = d200.a;
        return s == null || s.isEmpty();
    }
    
    public static final String b(final CommunitiesDetailContentViewArgs communitiesDetailContentViewArgs) {
        String communityId;
        if ((communityId = communitiesDetailContentViewArgs.getCommunityId()) == null) {
            final yh5 community = communitiesDetailContentViewArgs.getCommunity();
            String g;
            if (community != null) {
                g = community.g;
            }
            else {
                g = null;
            }
            e0e.c((Object)g);
            communityId = g;
        }
        return communityId;
    }
    
    public static boolean d() {
        return ita.b().b("composer_canvas_editor_enabled", false);
    }
    
    public static final int e(final upw upw) {
        final int ordinal = ((Enum)upw).ordinal();
        int n = 2;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            else {
                n = 1;
            }
        }
        else {
            n = 3;
        }
        return n;
    }
    
    public static int f(final l4a l4a, int n) {
        final boolean l = l4a.l(l4a);
        final int n2 = 1;
        if (!l) {
            return 1;
        }
        xd.D(l4a.l(l4a));
        l4a.r();
        l4a.r();
        final int l2 = l4a.L0;
        l4a.r();
        final int max = Math.max(l2, l4a.K0);
        final float n3 = (float)n;
        n = n2;
        while (max / n > n3) {
            l4a.r();
            if (l4a.H0 == shw.J0) {
                n *= 2;
            }
            else {
                ++n;
            }
        }
        return n;
    }
    
    public static noj j(final h9a h9a) {
        final Throwable c = h9a.c;
        if (c instanceof LiveContentRestrictedError) {
            final List f0 = ((LiveContentRestrictedError)c).F0;
            if (!f0.isEmpty()) {
                final m2g m2g = f0.get(0);
                if (m2g instanceof ww6) {
                    return new noj((Object)m2g);
                }
            }
        }
        final noj b = noj.b;
        final int a = o5j.a;
        return b;
    }
    
    public static int k(final String s) {
        Objects.requireNonNull(s);
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 2034070657: {
                if (!s.equals("by_invitation")) {
                    break;
                }
                n = 2;
                break;
            }
            case 765912085: {
                if (!s.equals("followers")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1480249367: {
                if (!s.equals("community")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return 0;
            }
            case 2: {
                return 2131952844;
            }
            case 1: {
                return 2131952867;
            }
            case 0: {
                return 2131952846;
            }
        }
    }
    
    public static int l(final String s) {
        Objects.requireNonNull(s);
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 2034070657: {
                if (!s.equals("by_invitation")) {
                    break;
                }
                n = 3;
                break;
            }
            case 765912085: {
                if (!s.equals("followers")) {
                    break;
                }
                n = 2;
                break;
            }
            case 96673: {
                if (!s.equals("all")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1480249367: {
                if (!s.equals("community")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return 0;
            }
            case 3: {
                return 2131231851;
            }
            case 2: {
                return 2131232308;
            }
            case 1: {
                return 2131232119;
            }
            case 0: {
                return 2131232321;
            }
        }
    }
    
    public static final Object m(final wqg wqg) {
        e0e.f((Object)wqg, "<this>");
        final Object m = ((jzd)wqg).m();
        final boolean b = m instanceof hwe;
        Object a = null;
        hwe hwe;
        if (b) {
            hwe = (hwe)m;
        }
        else {
            hwe = null;
        }
        if (hwe != null) {
            a = hwe.a();
        }
        return a;
    }
    
    public static String n(final Resources resources, final String s) {
        Objects.requireNonNull(s);
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 2034070657: {
                if (!s.equals("by_invitation")) {
                    break;
                }
                n = 2;
                break;
            }
            case 765912085: {
                if (!s.equals("followers")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1480249367: {
                if (!s.equals("community")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return "";
            }
            case 0:
            case 1:
            case 2: {
                return resources.getString(2131952871);
            }
        }
    }
    
    public static String o(final wtg wtg) {
        return String.valueOf(wtg.P0);
    }
    
    public static boolean p(final b b, final pr9 pr9) {
        final Long o = b.O();
        final Long a = pr9.a();
        if (a == null) {
            return false;
        }
        boolean b2;
        if (o == null) {
            b2 = a.equals(0L);
        }
        else {
            b2 = o.equals(a);
        }
        return b2 ^ true;
    }
    
    public static boolean q(final b b, final pr9 pr9) {
        final Long p2 = b.P();
        final Long b2 = pr9.b();
        if (b2 == null) {
            return false;
        }
        boolean b3;
        if (p2 == null) {
            b3 = b2.equals(pr9.f());
        }
        else {
            b3 = p2.equals(b2);
        }
        return b3 ^ true;
    }
    
    public static boolean r(final Context context) {
        final AccessibilityManager accessibilityManager = (AccessibilityManager)context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }
    
    public static final boolean s() {
        return ita.b().b("af_ui_empty_states_m3_enabled", false);
    }
    
    public static final dlh t(final dlh dlh, final Object o) {
        e0e.f((Object)dlh, "<this>");
        final ysd$a a = ysd.a;
        final ysd$a a2 = ysd.a;
        return dlh.E((dlh)new gwe(o));
    }
    
    public static clg u(final Context context, final ViewGroup viewGroup) {
        if (i2f.f().e()) {
            final GoogleMapOptions googleMapOptions = new GoogleMapOptions();
            final Boolean false = Boolean.FALSE;
            googleMapOptions.Q0 = false;
            googleMapOptions.J0 = false;
            googleMapOptions.M0 = false;
            googleMapOptions.O0 = false;
            googleMapOptions.L0 = false;
            googleMapOptions.N0 = false;
            return (clg)new wjk(viewGroup, new MapView(context, googleMapOptions), new ImageView(context));
        }
        return (clg)new msa(viewGroup);
    }
    
    public static boolean v(final vxs vxs) {
        final wvs c = vxs.c();
        final boolean a = z8t.a(vxs.h());
        boolean b = false;
        if (!a || ((vxs.c().d != 1 || lp7.R(c.h)) && c.d != 15)) {
            boolean b3 = false;
            Label_0170: {
                if (!z8t.a(vxs.h())) {
                    final wvs c2 = vxs.c();
                    final wvs i = vxs.i;
                    boolean b2 = false;
                    Label_0125: {
                        if (i != null) {
                            final int h = i.h;
                            if ((h & 0x10) != 0x0 && (h & 0x6) != 0x0) {
                                b2 = true;
                                break Label_0125;
                            }
                        }
                        b2 = false;
                    }
                    if (b2 && (c2.h & 0x2000) == 0x0) {
                        b3 = true;
                        break Label_0170;
                    }
                }
                b3 = false;
            }
            if (!b3) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public static final Object w(final View view, final Object o) {
        if (o == null) {
            view.setVisibility(8);
        }
        else {
            view.setVisibility(0);
        }
        return o;
    }
    
    public static String x(String s) {
        final String[] split = s.split(":");
        final int length = split.length;
        String h = "";
        for (int i = 0; i < length; ++i) {
            s = split[i];
            if (s.contains("s")) {
                s = s.replace("s", " seconds");
            }
            else if (s.contains("m")) {
                s = s.replace("m", " minutes");
            }
            else {
                s = s.replace("h", " hours");
            }
            h = c0e.h(h, s, " ");
        }
        return h;
    }
    
    public static dra y(final b3x b3x) {
        Object o;
        if (b3x != null) {
            o = b3x;
            if (qjy.t()) {
                o = new zw0((dra)b3x);
            }
        }
        else if (qjy.t()) {
            o = new zw0((dra)new b3x());
        }
        else {
            o = new b3x();
        }
        return (dra)o;
    }
    
    public static String z(final String s, final Object... array) {
        final int n = 0;
        int n2 = 0;
        int length;
        while (true) {
            length = array.length;
            if (n2 >= length) {
                break;
            }
            final Object o = array[n2];
            String s2;
            if (o == null) {
                s2 = "null";
            }
            else {
                try {
                    s2 = o.toString();
                }
                catch (final Exception ex) {
                    final String name = o.getClass().getName();
                    final String hexString = Integer.toHexString(System.identityHashCode(o));
                    final StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    final String string = sb.toString();
                    final Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    final Level warning = Level.WARNING;
                    final String value = String.valueOf(string);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Exception during lenientFormat for ".concat(value);
                    }
                    else {
                        concat = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(warning, "com.google.common.base.Strings", "lenientToString", concat, ex);
                    final String name2 = ex.getClass().getName();
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 9 + name2.length());
                    jba.s(sb2, "<", string, " threw ", name2);
                    sb2.append(">");
                    s2 = sb2.toString();
                }
            }
            array[n2] = s2;
            ++n2;
        }
        final StringBuilder sb3 = new StringBuilder(length * 16 + s.length());
        int n3 = 0;
        int n4 = n;
        int length2;
        while (true) {
            length2 = array.length;
            if (n4 >= length2) {
                break;
            }
            final int index = s.indexOf("%s", n3);
            if (index == -1) {
                break;
            }
            sb3.append(s, n3, index);
            sb3.append(array[n4]);
            n3 = index + 2;
            ++n4;
        }
        sb3.append(s, n3, s.length());
        if (n4 < length2) {
            sb3.append(" [");
            final int n5 = n4 + 1;
            sb3.append(array[n4]);
            for (int i = n5; i < array.length; ++i) {
                sb3.append(", ");
                sb3.append(array[i]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return (int)((wtz)vtz.G0.F0.a()).a();
    }
    
    public Object apply(final Object o) {
        return o;
    }
    
    public xtd c(final mxs mxs, final Object o, final Object o2) {
        final nbi nbi = (nbi)mxs;
        final nxs nxs = (nxs)o;
        final p0t p0t = (p0t)o2;
        e0e.f((Object)nbi, "instruction");
        e0e.f((Object)nxs, "requestContext");
        return (xtd)new nbi.a(nbi.a);
    }
    
    public zsl$a g(final Object o) {
        e0e.f((Object)o, "it");
        return new zsl$a();
    }
    
    public Object h(final jie jie, final float n) throws IOException {
        final int v2 = jie.V2();
        PointF pointF;
        if (v2 == 1) {
            pointF = mle.b(jie, n);
        }
        else if (v2 == 3) {
            pointF = mle.b(jie, n);
        }
        else {
            if (v2 != 7) {
                final StringBuilder f = ehk.f("Cannot convert json to point. Next token is ");
                f.append(dn.D(v2));
                throw new IllegalArgumentException(f.toString());
            }
            final PointF pointF2 = new PointF((float)jie.n2() * n, (float)jie.n2() * n);
            while (jie.hasNext()) {
                jie.h0();
            }
            pointF = pointF2;
        }
        return pointF;
    }
    
    @Override
    public /* bridge */ Object i(final mcs mcs) throws Exception {
        return null;
    }
}
