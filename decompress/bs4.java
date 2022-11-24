import java.util.concurrent.Future;
import java.io.IOException;
import android.graphics.Typeface;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Locale;
import android.content.res.Resources;
import android.view.Window;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.twitter.tipjar.TipJarFields;
import kotlin.NoWhenBranchMatchedException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.webrtc.StatsReport;
import android.graphics.Color;
import com.twitter.business.model.phone.BusinessPhoneInfoData;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import android.graphics.Bitmap$Config;
import java.util.concurrent.TimeUnit;
import android.graphics.Bitmap;
import android.content.Context;
import java.util.Iterator;
import org.webrtc.StatsReport$Value;
import java.util.List;
import java.util.Map;
import android.net.Uri;
import com.google.zxing.WriterException;
import androidx.appcompat.app.a;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class bs4 implements kpw, qb2, pf7$c, djk, c0z
{
    public static final bs4 F0;
    public static final int[][] G0;
    public static final int[][] H0;
    public static final int[][] I0;
    public static final int[][] J0;
    public static final bs4 K0;
    public static boolean L0;
    public static final bs4 M0;
    public static final String[] N0;
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
    public static final rw8 h1;
    public static final rw8 i1;
    public static final rw8 j1;
    public static final bs4 k1;
    
    static {
        F0 = new bs4();
        G0 = new int[][] { { 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1 } };
        H0 = new int[][] { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
        I0 = new int[][] { { -1, -1, -1, -1, -1, -1, -1 }, { 6, 18, -1, -1, -1, -1, -1 }, { 6, 22, -1, -1, -1, -1, -1 }, { 6, 26, -1, -1, -1, -1, -1 }, { 6, 30, -1, -1, -1, -1, -1 }, { 6, 34, -1, -1, -1, -1, -1 }, { 6, 22, 38, -1, -1, -1, -1 }, { 6, 24, 42, -1, -1, -1, -1 }, { 6, 26, 46, -1, -1, -1, -1 }, { 6, 28, 50, -1, -1, -1, -1 }, { 6, 30, 54, -1, -1, -1, -1 }, { 6, 32, 58, -1, -1, -1, -1 }, { 6, 34, 62, -1, -1, -1, -1 }, { 6, 26, 46, 66, -1, -1, -1 }, { 6, 26, 48, 70, -1, -1, -1 }, { 6, 26, 50, 74, -1, -1, -1 }, { 6, 30, 54, 78, -1, -1, -1 }, { 6, 30, 56, 82, -1, -1, -1 }, { 6, 30, 58, 86, -1, -1, -1 }, { 6, 34, 62, 90, -1, -1, -1 }, { 6, 28, 50, 72, 94, -1, -1 }, { 6, 26, 50, 74, 98, -1, -1 }, { 6, 30, 54, 78, 102, -1, -1 }, { 6, 28, 54, 80, 106, -1, -1 }, { 6, 32, 58, 84, 110, -1, -1 }, { 6, 30, 58, 86, 114, -1, -1 }, { 6, 34, 62, 90, 118, -1, -1 }, { 6, 26, 50, 74, 98, 122, -1 }, { 6, 30, 54, 78, 102, 126, -1 }, { 6, 26, 52, 78, 104, 130, -1 }, { 6, 30, 56, 82, 108, 134, -1 }, { 6, 34, 60, 86, 112, 138, -1 }, { 6, 30, 58, 86, 114, 142, -1 }, { 6, 34, 62, 90, 118, 146, -1 }, { 6, 30, 54, 78, 102, 126, 150 }, { 6, 24, 50, 76, 102, 128, 154 }, { 6, 28, 54, 80, 106, 132, 158 }, { 6, 32, 58, 84, 110, 136, 162 }, { 6, 26, 54, 82, 110, 138, 166 }, { 6, 30, 58, 86, 114, 142, 170 } };
        J0 = new int[][] { { 8, 0 }, { 8, 1 }, { 8, 2 }, { 8, 3 }, { 8, 4 }, { 8, 5 }, { 8, 7 }, { 8, 8 }, { 7, 8 }, { 5, 8 }, { 4, 8 }, { 3, 8 }, { 2, 8 }, { 1, 8 }, { 0, 8 } };
        K0 = new bs4();
        M0 = new bs4();
        N0 = new String[] { "image/*", "image/jpeg", "image/gif", "image/png" };
        O0 = new int[] { 2130968576, 2130968577, 2130968578 };
        P0 = new int[] { 2130968734 };
        Q0 = new int[] { 2130968734 };
        R0 = new int[] { 2130968678, 2130969118, 2130969878, 2130969927, 2130970315 };
        S0 = new int[] { 2130968672, 2130968829, 2130968830, 2130969123, 2130969173, 2130969219, 2130969588, 2130970136, 2130970137, 2130970174, 2130970210, 2130970274, 2130970315, 2130970378, 2130971121 };
        T0 = new int[] { 2130970507, 2130971082 };
        U0 = new int[] { 2130970923 };
        V0 = new int[] { 16843534, 2130970556 };
        W0 = new int[] { 16843247, 16843248, 16843249, 2130969203, 2130970760, 2130970761 };
        X0 = new int[] { 16843250, 16843251, 16843252, 16843253, 16843254, 16843255, 2130969194, 2130969195, 2130969197, 2130969201, 2130970238, 2130970336 };
        Y0 = new int[] { 16842930, 16843256, 2130969436, 2130969437 };
        Z0 = new int[] { 16842930, 16843256, 2130969436, 2130969437 };
        a1 = new int[] { 16842754, 16842765, 16842766, 16842994, 16843233, 16843238, 16843240, 16843241, 16843242, 16843243, 16843244, 16843245, 16843246, 16843491, 16844124, 16844129, 2130968665, 2130968667, 2130969179, 2130969184, 2130969425, 2130969566, 2130969648, 2130969768, 2130969867, 2130969899, 2130969927, 2130970269, 2130970305, 2130970555, 2130970604, 2130970654, 2130970759, 2130970933, 2130971145 };
        b1 = new int[] { 16842994, 16843049, 16843050, 2130968666 };
        c1 = new int[] { 16843239, 2130969833, 2130970270 };
        d1 = new int[] { 16843039, 16843040, 2130970122, 2130970130 };
        e1 = new int[] { 16842994, 16843062, 2130968657, 2130970153, 2130970552, 2130970631 };
        f1 = new int[] { 16843247, 16843248, 16843249, 16843627, 16843628, 2130969203, 2130970760, 2130970761, 2130970773, 2130970774 };
        g1 = new int[] { 16843247, 16843248, 16843249, 16843627, 16843628, 2130969203, 2130970760, 2130970761, 2130970773, 2130970774 };
        h1 = new rw8(2131955898, "PRODUCT_UNAVAILABLE", 2131955897);
        i1 = new rw8(2131952803, "CONNECTION_ERROR", 2131952802);
        j1 = new rw8(2131955890, "GENERIC_ERROR", 2131955889);
        k1 = new bs4();
    }
    
    public bs4() {
    }
    
    public bs4(final zai zai, final pkx pkx, final View view) {
        zai.d().M(view, new a.a(-1, -1));
        pkx.b(view);
    }
    
    public static void A(final int n, final int n2, final u63 u63) throws WriterException {
        for (int i = 0; i < 7; ++i) {
            final int n3 = n2 + i;
            if (!R(u63.a(n, n3))) {
                throw new WriterException();
            }
            u63.b(n, n3, 0);
        }
    }
    
    public static Object A0(final Object o, final int n) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(go9.p(20, "at index ", n));
    }
    
    public static final boolean B(final char c, final char c2, final boolean b) {
        final boolean b2 = true;
        if (c == c2) {
            return true;
        }
        if (!b) {
            return false;
        }
        final char upperCase = Character.toUpperCase(c);
        final char upperCase2 = Character.toUpperCase(c2);
        boolean b3 = b2;
        if (upperCase != upperCase2) {
            b3 = (Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2) && b2);
        }
        return b3;
    }
    
    public static void B0(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        String s;
        if (n >= 0 && n <= n3) {
            if (n2 >= 0 && n2 <= n3) {
                s = eg8.P0("end index (%s) must not be less than start index (%s)", n2, n);
            }
            else {
                s = C0(n2, n3, "end index");
            }
        }
        else {
            s = C0(n, n3, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static String C(final c9t c9t) {
        final String a = c9t.a();
        if (a.startsWith("https://twitter.com/i/spaces/") && !a.substring(29).isEmpty()) {
            return Uri.parse(c9t.a()).getLastPathSegment();
        }
        return null;
    }
    
    public static String C0(final int n, final int n2, final String s) {
        if (n < 0) {
            return eg8.P0("%s (%s) must not be negative", s, n);
        }
        if (n2 >= 0) {
            return eg8.P0("%s (%s) must not be greater than size (%s)", s, n, n2);
        }
        throw new IllegalArgumentException(go9.p(26, "negative size: ", n2));
    }
    
    public static int D(int i) {
        int n;
        for (n = 0; i != 0; i >>>= 1, ++n) {}
        return n;
    }
    
    public static final void E(final Map map, final Map map2, final Map map3, final dzc dzc, final String s, final long n, final boolean b) {
        final pah o1 = pah.O1;
        e0e.f((Object)s, "userId");
        final q6r f0 = q6r.F0;
        final q6r g0 = q6r.G0;
        final Map map4 = map2.get(f0);
        String s2;
        if (map4 == null || (s2 = (String)map4.get("transportId")) == null) {
            final Map map5 = map2.get(g0);
            if (map5 == null || (s2 = (String)map5.get("transportId")) == null) {
                s2 = "not_found";
            }
        }
        if (e0e.a((Object)s2, (Object)"not_found")) {
            return;
        }
        Object f2;
        if ((f2 = map3.get(new p5d(s2, "googComponent"))) == null) {
            f2 = h3a.F0;
        }
        if (((List)f2).isEmpty()) {
            return;
        }
        while (true) {
        Label_0517_Outer:
            for (final Object next : f2) {
                if (e0e.a((Object)((StatsReport$Value)next).name, (Object)"selectedCandidatePairId")) {
                    final StatsReport$Value statsReport$Value = (StatsReport$Value)next;
                    String value;
                    if (statsReport$Value != null) {
                        value = statsReport$Value.value;
                    }
                    else {
                        value = null;
                    }
                    String s3 = value;
                    if (value == null) {
                        s3 = "not_found";
                    }
                    if (e0e.a((Object)s3, (Object)"not_found")) {
                        return;
                    }
                    Object f3;
                    if ((f3 = map3.get(new p5d(s3, "googCandidatePair"))) == null) {
                        f3 = h3a.F0;
                    }
                    if (((List)f3).isEmpty()) {
                        return;
                    }
                    Label_0454: {
                        if (dzc instanceof wzc) {
                            while (true) {
                                for (final Object next2 : f3) {
                                    if (e0e.a((Object)((StatsReport$Value)next2).name, (Object)"googRtt")) {
                                        final StatsReport$Value statsReport$Value2 = (StatsReport$Value)next2;
                                        float float1 = 0.0f;
                                        Label_0419: {
                                            if (statsReport$Value2 != null) {
                                                final String value2 = statsReport$Value2.value;
                                                if (value2 != null) {
                                                    float1 = Float.parseFloat(value2);
                                                    break Label_0419;
                                                }
                                            }
                                            float1 = -1.0f;
                                        }
                                        if (float1 != -1.0f) {
                                            m0(map, float1, pah.i1);
                                        }
                                        break Label_0454;
                                    }
                                }
                                Object next2 = null;
                                continue Label_0517_Outer;
                            }
                        }
                    }
                    final String t = dzc.t(s, o1);
                    while (true) {
                        for (final Object next3 : f3) {
                            if (e0e.a((Object)((StatsReport$Value)next3).name, (Object)"localCandidateId")) {
                                final StatsReport$Value statsReport$Value3 = (StatsReport$Value)next3;
                                String value3;
                                if (statsReport$Value3 != null) {
                                    value3 = statsReport$Value3.value;
                                }
                                else {
                                    value3 = null;
                                }
                                String s4 = value3;
                                if (value3 == null) {
                                    s4 = "not_found";
                                }
                                if (e0e.a((Object)s4, (Object)"not_found")) {
                                    return;
                                }
                                ((yyc)dzc).m(s, o1, s4);
                                Label_1147: {
                                    if (t.length() > 0 && e0e.a((Object)t, (Object)s4)) {
                                        while (true) {
                                            for (final Object next4 : f3) {
                                                if (e0e.a((Object)((StatsReport$Value)next4).name, (Object)dzc.s().F0)) {
                                                    final StatsReport$Value statsReport$Value4 = (StatsReport$Value)next4;
                                                    float float2 = 0.0f;
                                                    Label_0708: {
                                                        if (statsReport$Value4 != null) {
                                                            final String value4 = statsReport$Value4.value;
                                                            if (value4 != null) {
                                                                float2 = Float.parseFloat(value4);
                                                                break Label_0708;
                                                            }
                                                        }
                                                        float2 = -1.0f;
                                                    }
                                                    final float y = dzc.y(s, dzc.s());
                                                    if (float2 == -1.0f) {
                                                        break Label_1147;
                                                    }
                                                    ((yyc)dzc).h(s, dzc.s(), float2);
                                                    if (y == -1.0f || n == -1L) {
                                                        m0(map, float2, dzc.r());
                                                        break Label_1147;
                                                    }
                                                    if (n <= 0L) {
                                                        m0(map, -1.0f, dzc.j());
                                                        m0(map, -1.0f, dzc.r());
                                                        break Label_1147;
                                                    }
                                                    final pah r = dzc.r();
                                                    final float n2 = float2 - y;
                                                    ((yyc)dzc).h(s, r, n2);
                                                    final float q = q(y, float2, n);
                                                    if (q != -1.0f) {
                                                        m0(map, n2, dzc.r());
                                                        m0(map, q, dzc.j());
                                                    }
                                                    if ((map2.isEmpty() ^ true) && b) {
                                                        final Iterator iterator5 = map2.values().iterator();
                                                        float n3 = 0.0f;
                                                        while (iterator5.hasNext()) {
                                                            final String s5 = ((Map<K, String>)iterator5.next()).get(dzc.H().F0);
                                                            float float3;
                                                            if (s5 != null) {
                                                                float3 = Float.parseFloat(s5);
                                                            }
                                                            else {
                                                                float3 = 0.0f;
                                                            }
                                                            n3 += float3;
                                                        }
                                                        final float y2 = dzc.y(s, dzc.H());
                                                        ((yyc)dzc).h(s, dzc.H(), n3);
                                                        ((yyc)dzc).h(s, dzc.k(), n3 - y2);
                                                        m0(map, q(y2, n3, n), dzc.j());
                                                    }
                                                    break Label_1147;
                                                }
                                            }
                                            Object next4 = null;
                                            continue;
                                        }
                                    }
                                    ((yyc)dzc).h(s, dzc.s(), 0.0f);
                                }
                                Object f4;
                                if ((f4 = map3.get(new p5d(s4, "localcandidate"))) == null) {
                                    f4 = h3a.F0;
                                }
                                for (final StatsReport$Value statsReport$Value5 : f4) {
                                    final String name = statsReport$Value5.name;
                                    if (e0e.a((Object)name, (Object)"transport")) {
                                        final String value5 = statsReport$Value5.value;
                                        e0e.e((Object)value5, "it.value");
                                        m0(map, value5, pah.v1);
                                    }
                                    else {
                                        if (!e0e.a((Object)name, (Object)"networkType")) {
                                            continue Label_0517_Outer;
                                        }
                                        final String value6 = statsReport$Value5.value;
                                        e0e.e((Object)value6, "it.value");
                                        m0(map, value6, pah.u1);
                                    }
                                }
                                return;
                            }
                        }
                        Object next3 = null;
                        continue;
                    }
                }
            }
            Object next = null;
            continue;
        }
    }
    
    public static final ud1 F(final qgv qgv, final Context context) {
        e0e.f((Object)qgv, "<this>");
        e0e.f((Object)context, "context");
        int n = qgv.K0;
        final Iterator iterator = qgv.t1.iterator();
        float n2 = 0.0f;
        while (iterator.hasNext()) {
            final ur4 ur4 = (ur4)iterator.next();
            final float a = ur4.a;
            if (a > n2) {
                n = ur4.b;
                n2 = a;
            }
        }
        fj1.e();
        final beq a2 = dqb.a;
        final z8d$a a3 = fdw.a(qgv.G0);
        a3.l = a2;
        final z8d z8d = new z8d(a3);
        Bitmap bitmap;
        try {
            bitmap = (Bitmap)((csm)((Future<d9d>)dxg.e().g.z(z8d)).get(10L, TimeUnit.SECONDS)).b;
        }
        catch (final Exception ex) {
            bitmap = Bitmap.createBitmap(a2.a, a2.b, Bitmap$Config.ARGB_8888);
        }
        e0e.c((Object)bitmap);
        final Bitmap g = j12.g(bitmap, context.getResources());
        e0e.e((Object)g, "cropCircularBitmap(bitmap!!, context.resources)");
        return new ud1(context, n, g);
    }
    
    public static in9 G() {
        final int a = ln9.a;
        Objects.requireNonNull(mn9.Companion);
        return ((mn9)((n5j)dr0.Companion.a()).B((Class)mn9.class)).Z();
    }
    
    public static final a8x H(final View view) {
        e0e.f((Object)view, "<this>");
        Objects.requireNonNull(vda.Companion);
        return ((vda)((n5j)dr0.Companion.a()).B((Class)vda.class)).j7().c(view);
    }
    
    public static final String I(Map map, final q6r q6r, final String s) {
        map = (Map)map.get(q6r);
        String s2;
        if (map == null || (s2 = (String)map.get(s)) == null) {
            s2 = "not_found";
        }
        return s2;
    }
    
    public static final String J(final Map map, String s) {
        String s2;
        s = (s2 = map.get(s));
        if (s == null) {
            s2 = "not_found";
        }
        return s2;
    }
    
    public static final zrm K(final View view) {
        e0e.f((Object)view, "<this>");
        return zrm.Companion.b(view);
    }
    
    public static final zrm L(final Fragment fragment) {
        e0e.f((Object)fragment, "<this>");
        Objects.requireNonNull(zrm.Companion);
        final Context n0 = fragment.N0();
        zrm zrm;
        if (n0 != null) {
            zrm = new zrm(n0);
        }
        else {
            zrm = null;
        }
        return zrm;
    }
    
    public static o6 M() {
        final int a = p6.a;
        Objects.requireNonNull(r6.Companion);
        return ((r6)((n5j)dr0.Companion.a()).B((Class)r6.class)).Z3();
    }
    
    public static final upu N(final yzl yzl) {
        e0e.f((Object)yzl, "type");
        final int ordinal = ((Enum)yzl).ordinal();
        upu upu;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            upu = null;
                        }
                        else {
                            upu = upu.L0;
                        }
                    }
                    else {
                        upu = upu.I0;
                    }
                }
                else {
                    upu = upu.K0;
                }
            }
            else {
                upu = upu.J0;
            }
        }
        else {
            upu = upu.H0;
        }
        return upu;
    }
    
    public static final boolean O(Map map, final String s) {
        map = (Map)map.get(q6r.F0);
        if (map != null) {
            final String s2 = (String)map.get(s);
            if (s2 != null) {
                return Boolean.parseBoolean(s2);
            }
        }
        return false;
    }
    
    public static final boolean P(final jll jll) {
        e0e.f((Object)jll, "<this>");
        return jll.q() || jll.r();
    }
    
    public static final boolean Q(final oll oll) {
        e0e.f((Object)oll, "<this>");
        return oll.q() || oll.r();
    }
    
    public static boolean R(final int n) {
        return n == -1;
    }
    
    public static boolean S(final String s) {
        return s != null && (s.startsWith("application/json") || s.startsWith("text/html") || s.startsWith("text/plain") || s.startsWith("text/xml") || s.startsWith("application/xml") || s.startsWith("application/javascript") || s.startsWith("text/json") || s.startsWith("text/javascript"));
    }
    
    public static final boolean T(final BusinessPhoneInfoData businessPhoneInfoData) {
        return businessPhoneInfoData != null && flr.g((CharSequence)businessPhoneInfoData.getRawPhoneNumber());
    }
    
    public static final boolean U(final char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
    
    public static final rll W(rll rll, final mlv mlv) {
        e0e.f((Object)rll, "<this>");
        e0e.f((Object)mlv, "typeTable");
        if (rll.t()) {
            rll = rll.R0;
        }
        else if ((rll.H0 & 0x200) == 0x200) {
            rll = mlv.a(rll.S0);
        }
        else {
            rll = null;
        }
        return rll;
    }
    
    public static int X(String s) {
        String l = s;
        if (s.charAt(0) != '#') {
            l = mqb.l("#", s);
        }
        if (l.length() != 4) {
            s = l;
            if (l.length() != 5) {
                return Color.parseColor(s);
            }
        }
        final StringBuilder f = ehk.f("#");
        f.append(l.charAt(1));
        f.append(l.charAt(1));
        f.append(l.charAt(2));
        f.append(l.charAt(2));
        f.append(l.charAt(3));
        f.append(l.charAt(3));
        s = f.toString();
        if (l.length() == 5) {
            final StringBuilder f2 = ehk.f(s);
            f2.append(l.charAt(4));
            f2.append(l.charAt(4));
            s = f2.toString();
        }
        return Color.parseColor(s);
    }
    
    public static final void Y(final List list, final Map map, final Map map2, final Map map3) {
        e0e.f((Object)list, "stats");
        for (final StatsReport statsReport : list) {
            final String type = statsReport.type;
            final boolean a = e0e.a((Object)type, (Object)"ssrc");
            int i = 0;
            final int n = 0;
            if (a) {
                final q6r h0 = q6r.H0;
                final q6r g0 = q6r.G0;
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                final StatsReport$Value[] values = statsReport.values;
                e0e.e((Object)values, "report.values");
                final int length = values.length;
                q6r q6r = g0;
                for (int j = n; j < length; ++j) {
                    final StatsReport$Value statsReport$Value = values[j];
                    e0e.e((Object)statsReport$Value, "reportValue");
                    q6r f0;
                    if (e0e.a((Object)statsReport$Value.name, (Object)"mediaType")) {
                        final String value = statsReport$Value.value;
                        f0 = q6r.F0;
                        if (!e0e.a((Object)value, (Object)"video")) {
                            f0 = g0;
                        }
                    }
                    else {
                        f0 = h0;
                    }
                    if (f0 != h0) {
                        q6r = f0;
                    }
                    final String name = statsReport$Value.name;
                    e0e.e((Object)name, "reportValue.name");
                    final String value2 = statsReport$Value.value;
                    e0e.e((Object)value2, "reportValue.value");
                    linkedHashMap.put(name, value2);
                }
                map2.put(q6r, linkedHashMap);
            }
            else if (e0e.a((Object)type, (Object)"VideoBwe")) {
                final StatsReport$Value[] values2 = statsReport.values;
                e0e.e((Object)values2, "report.values");
                while (i < values2.length) {
                    final StatsReport$Value statsReport$Value2 = values2[i];
                    final String name2 = statsReport$Value2.name;
                    e0e.e((Object)name2, "value.name");
                    final String value3 = statsReport$Value2.value;
                    e0e.e((Object)value3, "value.value");
                    map3.put(name2, value3);
                    ++i;
                }
            }
            final String id = statsReport.id;
            e0e.e((Object)id, "report.id");
            final String type2 = statsReport.type;
            e0e.e((Object)type2, "report.type");
            final p5d p5d = new p5d(id, type2);
            final StatsReport$Value[] values3 = statsReport.values;
            e0e.e((Object)values3, "report.values");
            map.put(p5d, et0.D0((Object[])values3));
        }
    }
    
    public static final rll Z(final jll jll, final mlv mlv) {
        e0e.f((Object)jll, "<this>");
        e0e.f((Object)mlv, "typeTable");
        rll rll;
        if (jll.q()) {
            rll = jll.O0;
        }
        else if (jll.r()) {
            rll = mlv.a(jll.P0);
        }
        else {
            rll = null;
        }
        return rll;
    }
    
    public static final void a0(final kdg kdg, final hdg hdg, final wb4 wb4, final a7i a7i) {
        e0e.f((Object)kdg, "<this>");
        e0e.f((Object)wb4, "scopeOwner");
        e0e.f((Object)a7i, "name");
        if (kdg == kdg$a.a) {
            return;
        }
        hdg.f();
    }
    
    public static final void b0(final kdg kdg, final hdg hdg, final vrj vrj, final a7i a7i) {
        e0e.f((Object)kdg, "<this>");
        e0e.f((Object)vrj, "scopeOwner");
        e0e.f((Object)a7i, "name");
        e0e.e((Object)vrj.e().b(), "scopeOwner.fqName.asString()");
        e0e.e((Object)a7i.e(), "name.asString()");
        if (kdg != kdg$a.a) {
            hdg.f();
        }
    }
    
    public static final Object c0(Object[] copy, ouo a, String string, final ptb ptb, final d86 d86, int i) {
        e0e.f((Object)copy, "inputs");
        e0e.f((Object)ptb, "init");
        d86.x(441892779);
        if ((i & 0x2) != 0x0) {
            a = (ouo)puo.a;
            e0e.d((Object)a, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        }
        final Object o = null;
        if ((i & 0x4) != 0x0) {
            string = null;
        }
        final sa6$b a2 = sa6.a;
        d86.x(1059366469);
        final int n = 0;
        if (string != null && string.length() != 0) {
            i = 0;
        }
        else {
            i = 1;
        }
        if (i != 0) {
            i = kqe.J(d86);
            t(36);
            string = Integer.toString(i, 36);
            e0e.e((Object)string, "toString(this, checkRadix(radix))");
        }
        d86.O();
        e0e.d((Object)a, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final mto mto = (mto)d86.m((df6)oto.a);
        copy = Arrays.copyOf(copy, copy.length);
        d86.x(-568225417);
        final int length = copy.length;
        final boolean b = false;
        i = n;
        boolean b2 = b;
        while (i < length) {
            b2 |= d86.P(copy[i]);
            ++i;
        }
        final Object y = d86.y();
        Object o2 = null;
        Label_0310: {
            if (!b2) {
                Objects.requireNonNull(d86.Companion);
                if ((o2 = y) != d86$a.b) {
                    break Label_0310;
                }
            }
            o2 = o;
            if (mto != null) {
                final Object f = mto.f(string);
                o2 = o;
                if (f != null) {
                    o2 = a.b(f);
                }
            }
            if (o2 == null) {
                o2 = ptb.invoke();
            }
            d86.p(o2);
        }
        d86.O();
        if (mto != null) {
            shw.d((Object)mto, (Object)string, (stb)new idm(mto, string, zzz.h0((Object)a, d86), zzz.h0(o2, d86)), d86);
        }
        final sa6$b a3 = sa6.a;
        d86.O();
        return o2;
    }
    
    public static final void d0(final wow wow, final iow iow) {
        e0e.f((Object)wow, "validationResponse");
        e0e.f((Object)iow, "editText");
        final int a = wow.a;
        if (a != 0) {
            final boolean b = true;
            if (a != 1) {
                if (a != 2) {
                    if (a != 3 && a != 4) {
                        if (a != 5) {
                            iow.f();
                        }
                        else {
                            final String b2 = wow.b;
                            boolean b3 = b;
                            if (!e0e.a((Object)"redirect_to_login_primary", (Object)ita.d().k("growth_acquisition_redirect_to_login"))) {
                                b3 = (e0e.a((Object)"redirect_to_login_secondary", (Object)ita.d().k("growth_acquisition_redirect_to_login")) && b);
                            }
                            iow.g(b2, b3);
                        }
                    }
                    else {
                        iow.g(wow.b, false);
                    }
                }
                else {
                    iow.d();
                }
            }
            else {
                iow.b();
            }
        }
        else {
            iow.f();
        }
    }
    
    public static final raq e0(final raq raq, final List list, final yjv yjv) {
        e0e.f((Object)raq, "<this>");
        e0e.f((Object)list, "newArguments");
        e0e.f((Object)yjv, "newAttributes");
        if (list.isEmpty() && yjv == ((yse)raq).L0()) {
            return raq;
        }
        if (list.isEmpty()) {
            return raq.U0(yjv);
        }
        return ate.f(yjv, ((yse)raq).M0(), list, ((yse)raq).N0(), (dte)null);
    }
    
    public static yse f0(yse yse, List k0, ud0 annotations, final int n) {
        if ((n & 0x1) != 0x0) {
            k0 = yse.K0();
        }
        if ((n & 0x2) != 0x0) {
            annotations = yse.getAnnotations();
        }
        List list;
        if ((n & 0x4) != 0x0) {
            list = k0;
        }
        else {
            list = null;
        }
        e0e.f((Object)yse, "<this>");
        e0e.f((Object)k0, "newArguments");
        e0e.f((Object)annotations, "newAnnotations");
        e0e.f((Object)list, "newArgumentsForUpperBound");
        if ((!k0.isEmpty() && k0 != yse.K0()) || annotations != yse.getAnnotations()) {
            final yjv l0 = yse.L0();
            Object b = annotations;
            if (annotations instanceof k0b) {
                b = annotations;
                if (annotations.isEmpty()) {
                    Objects.requireNonNull(ud0.Companion);
                    b = ud0$a.b;
                }
            }
            final yjv s = xi4.S(l0, (ud0)b);
            final o2w p4 = yse.P0();
            if (p4 instanceof t6b) {
                final t6b t6b = (t6b)p4;
                yse = (yse)ate.c(e0(t6b.G0, k0, s), e0(t6b.H0, list, s));
            }
            else {
                if (!(p4 instanceof raq)) {
                    throw new NoWhenBranchMatchedException();
                }
                yse = (yse)e0((raq)p4, k0, s);
            }
        }
        return yse;
    }
    
    public static raq g0(final raq raq, List k0, yjv l0, final int n) {
        if ((n & 0x1) != 0x0) {
            k0 = ((yse)raq).K0();
        }
        if ((n & 0x2) != 0x0) {
            l0 = ((yse)raq).L0();
        }
        return e0(raq, k0, l0);
    }
    
    public static final Object h0(final Object o, final ptb ptb) {
        e0e.f((Object)ptb, "message");
        if (o != null) {
            return o;
        }
        throw new IllegalStateException(ptb.invoke().toString());
    }
    
    public static final f82 i(final float n, final long n2) {
        return new f82(n, (wq2)new jmq(n2));
    }
    
    public static final rll i0(final jll jll, final mlv mlv) {
        e0e.f((Object)jll, "<this>");
        e0e.f((Object)mlv, "typeTable");
        rll rll;
        if (jll.s()) {
            rll = jll.L0;
            e0e.e((Object)rll, "returnType");
        }
        else {
            if ((jll.H0 & 0x10) != 0x10) {
                throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
            }
            rll = mlv.a(jll.M0);
        }
        return rll;
    }
    
    public static final hub j(final l9r l9r) {
        return (hub)l9r.getValue();
    }
    
    public static final rll j0(final oll oll, final mlv mlv) {
        e0e.f((Object)oll, "<this>");
        e0e.f((Object)mlv, "typeTable");
        rll rll;
        if (oll.s()) {
            rll = oll.L0;
            e0e.e((Object)rll, "returnType");
        }
        else {
            if ((oll.H0 & 0x10) != 0x10) {
                throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
            }
            rll = mlv.a(oll.M0);
        }
        return rll;
    }
    
    public static final void k(final List list, final Context context, final TipJarFields tipJarFields, final String s, final int n) {
        if (s.length() > 0) {
            list.add(new cdt(tipJarFields, tipJarFields.getTitleResource(), n, tipJarFields.getUri(context, s)));
        }
    }
    
    public static final Object k0(final Object o, final boolean b, final stb stb) {
        e0e.f((Object)stb, "block");
        Object invoke = o;
        if (b) {
            invoke = stb.invoke(o);
        }
        return invoke;
    }
    
    public static final void l(final Fragment fragment) {
        if (!(fragment instanceof tw8)) {
            return;
        }
        final Window window = ((tw8)fragment).b2().getWindow();
        Object o;
        if (window != null) {
            o = window.findViewById(2131428647);
        }
        else {
            o = null;
        }
        if (o == null) {
            return;
        }
        final fp3 fp3 = new fp3();
        ((g0u)fp3).H0 = 300L;
        b1u.a((ViewGroup)o, (g0u)fp3);
    }
    
    public static final void l0(final zfo zfo) {
        e0e.f((Object)zfo, "<this>");
        final q6s$a q6s$a = new q6s$a();
        q6s$a.s(2131957407);
        q6s$a.e = (rfd$c)rfd$c$b.b;
        q6s$a.r("");
        q6s$a.q(31);
        zfo.f((q6s)((z4j)q6s$a).e());
    }
    
    public static final iz6 m(final kcm kcm, final bz6 bz6, final String s) {
        e0e.f((Object)kcm, "<this>");
        e0e.f((Object)bz6, "dispatcher");
        return r1n.Y(r1n.e(kcm.u0((yy6)bz6)), (yy6)new gz6(s));
    }
    
    public static final void m0(final Map map, final Object o, final pah pah) {
        e0e.f((Object)map, "filteredResultsMap");
        e0e.f(o, "value");
        e0e.f((Object)pah, "MetricType");
        map.put(pah.F0, o);
    }
    
    public static final raq n(final yse yse) {
        e0e.f((Object)yse, "<this>");
        final o2w p = yse.P0();
        raq raq;
        if (p instanceof raq) {
            raq = (raq)p;
        }
        else {
            raq = null;
        }
        if (raq != null) {
            return raq;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("This is should be simple type: ");
        sb.append(yse);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public static final boolean n0() {
        return ita.b().b("standardized_nudges_misinfo", false);
    }
    
    public static void o(final e02 e02, final f9a f9a, final atw atw, final int n, final u63 u63) throws WriterException {
        for (int i = 0; i < u63.c; ++i) {
            for (int j = 0; j < u63.b; ++j) {
                u63.a[i][j] = -1;
            }
        }
        final int length = bs4.G0[0].length;
        z(0, 0, u63);
        z(u63.b - length, 0, u63);
        z(0, u63.b - length, u63);
        y(0, 7, u63);
        y(u63.b - 8, 7, u63);
        y(0, u63.b - 8, u63);
        A(7, 0, u63);
        A(u63.c - 7 - 1, 0, u63);
        A(7, u63.c - 7, u63);
        if (u63.a(8, u63.c - 8) == 0) {
            throw new WriterException();
        }
        u63.b(8, u63.c - 8, 1);
        int a = atw.a;
        if (a >= 2) {
            --a;
            final int[][] i2 = bs4.I0;
            final int[] array = i2[a];
            for (int length2 = i2[a].length, k = 0; k < length2; ++k) {
                for (int l = 0; l < length2; ++l) {
                    final int n2 = array[k];
                    final int n3 = array[l];
                    if (n3 != -1) {
                        if (n2 != -1) {
                            if (R(u63.a(n3, n2))) {
                                for (int n4 = 0; n4 < 5; ++n4) {
                                    for (int n5 = 0; n5 < 5; ++n5) {
                                        u63.b(n3 - 2 + n5, n2 - 2 + n4, bs4.H0[n4][n5]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int n7;
        for (int n6 = 8; n6 < u63.b - 8; n6 = n7) {
            n7 = n6 + 1;
            final int n8 = n7 % 2;
            if (R(u63.a(n6, 6))) {
                u63.b(n6, 6, n8);
            }
            if (R(u63.a(6, n6))) {
                u63.b(6, n6, n8);
            }
        }
        final e02 e3 = new e02();
        if (n < 0 || n >= 8) {
            throw new WriterException("Invalid mask pattern");
        }
        final int n9 = f9a.F0 << 3 | n;
        e3.d(n9, 5);
        e3.d(p(n9, 1335), 10);
        final e02 e4 = new e02();
        e4.d(21522, 15);
        if (e3.F0.length != e4.F0.length) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int n10 = 0;
        while (true) {
            final int[] f0 = e3.F0;
            if (n10 >= f0.length) {
                break;
            }
            f0[n10] ^= e4.F0[n10];
            ++n10;
        }
        if (e3.G0 != 15) {
            final StringBuilder f2 = ehk.f("should not happen but we got: ");
            f2.append(e3.G0);
            throw new WriterException(f2.toString());
        }
        int n11 = 0;
        while (true) {
            final int g0 = e3.G0;
            if (n11 >= g0) {
                break;
            }
            final boolean f3 = e3.f(g0 - 1 - n11);
            final int[][] j2 = bs4.J0;
            u63.c(j2[n11][0], j2[n11][1], f3);
            if (n11 < 8) {
                u63.c(u63.b - n11 - 1, 8, f3);
            }
            else {
                u63.c(8, n11 - 8 + (u63.c - 7), f3);
            }
            ++n11;
        }
        final int a2 = atw.a;
        if (a2 >= 7) {
            final e02 e5 = new e02();
            e5.d(a2, 6);
            e5.d(p(atw.a, 7973), 12);
            if (e5.G0 != 18) {
                final StringBuilder f4 = ehk.f("should not happen but we got: ");
                f4.append(e5.G0);
                throw new WriterException(f4.toString());
            }
            int n12 = 17;
            for (int n13 = 0; n13 < 6; ++n13) {
                for (int n14 = 0; n14 < 3; ++n14) {
                    final boolean f5 = e5.f(n12);
                    --n12;
                    u63.c(n13, u63.c - 11 + n14, f5);
                    u63.c(u63.c - 11 + n14, n13, f5);
                }
            }
        }
        int n15 = u63.b - 1;
        int n16 = u63.c - 1;
        int n17 = 0;
        int n18 = -1;
        while (n15 > 0) {
            int n19 = n15;
            int n20 = n16;
            int n21 = n17;
            if (n15 == 6) {
                n19 = n15 - 1;
                n21 = n17;
                n20 = n16;
            }
            while (n20 >= 0 && n20 < u63.c) {
                int n22 = 0;
                int n23 = n21;
                while (n22 < 2) {
                    final int n24 = n19 - n22;
                    if (R(u63.a(n24, n20))) {
                        boolean f6;
                        if (n23 < e02.G0) {
                            f6 = e02.f(n23);
                            ++n23;
                        }
                        else {
                            f6 = false;
                        }
                        boolean b = f6;
                        if (n != -1) {
                            int n29 = 0;
                            Label_1205: {
                                int n30 = 0;
                                Label_1199: {
                                    int n25 = 0;
                                    int n26 = 0;
                                    switch (n) {
                                        default: {
                                            throw new IllegalArgumentException(rk0.B("Invalid mask pattern: ", n));
                                        }
                                        case 7: {
                                            n25 = n20 * n24 % 3;
                                            n26 = (n20 + n24 & 0x1);
                                            break;
                                        }
                                        case 6: {
                                            final int n27 = n20 * n24;
                                            n26 = (n27 & 0x1);
                                            n25 = n27 % 3;
                                            break;
                                        }
                                        case 5: {
                                            final int n28 = n20 * n24;
                                            n29 = n28 % 3 + (n28 & 0x1);
                                            break Label_1205;
                                        }
                                        case 4: {
                                            n30 = n20 / 2 + n24 / 3;
                                            break Label_1199;
                                        }
                                        case 3: {
                                            n29 = (n20 + n24) % 3;
                                            break Label_1205;
                                        }
                                        case 2: {
                                            n29 = n24 % 3;
                                            break Label_1205;
                                        }
                                        case 1: {
                                            n30 = n20;
                                            break Label_1199;
                                        }
                                        case 0: {
                                            n30 = n20 + n24;
                                            break Label_1199;
                                        }
                                    }
                                    n30 = n25 + n26;
                                }
                                n29 = (n30 & 0x1);
                            }
                            final boolean b2 = n29 == 0;
                            b = f6;
                            if (b2) {
                                b = (f6 ^ true);
                            }
                        }
                        u63.c(n24, n20, b);
                    }
                    ++n22;
                }
                n20 += n18;
                n21 = n23;
            }
            n18 = -n18;
            n16 = n20 + n18;
            n15 = n19 - 2;
            n17 = n21;
        }
        if (n17 == e02.G0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Not all bits consumed: ");
        sb.append(n17);
        sb.append('/');
        sb.append(e02.G0);
        throw new WriterException(sb.toString());
    }
    
    public static final int o0(final String s, final int n, final int n2, final int n3) {
        return (int)p0(s, n, n2, n3);
    }
    
    public static int p(int n, final int n2) {
        if (n2 != 0) {
            int d;
            for (d = D(n2), n <<= d - 1; D(n) >= d; n ^= n2 << D(n) - d) {}
            return n;
        }
        throw new IllegalArgumentException("0 polynomial");
    }
    
    public static final long p0(final String s, long longValue, final long n, final long n2) {
        final String q0 = q0(s);
        if (q0 != null) {
            final Long f1 = rlr.f1(q0);
            if (f1 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("System property '");
                sb.append(s);
                sb.append("' has unrecognized value '");
                sb.append(q0);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            longValue = f1;
            int n3 = 0;
            if (n <= longValue) {
                n3 = n3;
                if (longValue <= n2) {
                    n3 = 1;
                }
            }
            if (n3 == 0) {
                final StringBuilder o = a88.o("System property '", s, "' should be in range ", n);
                po.E(o, "..", n2, ", but is '");
                o.append(longValue);
                o.append('\'');
                throw new IllegalStateException(o.toString().toString());
            }
        }
        return longValue;
    }
    
    public static final float q(float n, final float n2, final long n3) {
        n = (float)Math.rint(n2 - n) * 8;
        if (n < 0.0f) {
            return 0.0f;
        }
        return n / TimeUnit.MILLISECONDS.toSeconds(n3);
    }
    
    public static final String q0(String property) {
        final int a = v6s.a;
        try {
            property = System.getProperty(property);
        }
        catch (final SecurityException ex) {
            property = null;
        }
        return property;
    }
    
    public static final float r(final Map.Entry entry) {
        return Float.parseFloat(entry.getValue().toString());
    }
    
    public static final boolean r0(String q0, boolean boolean1) {
        q0 = q0(q0);
        if (q0 != null) {
            boolean1 = Boolean.parseBoolean(q0);
        }
        return boolean1;
    }
    
    public static final int s(final Map.Entry entry) {
        return Integer.parseInt(entry.getValue().toString());
    }
    
    public static int s0(final String s, final int n, int n2, int n3, final int n4) {
        if ((n4 & 0x4) != 0x0) {
            n2 = 1;
        }
        if ((n4 & 0x8) != 0x0) {
            n3 = Integer.MAX_VALUE;
        }
        return o0(s, n, n2, n3);
    }
    
    public static final int t(final int n) {
        if (new kud(2, 36).k(n)) {
            return n;
        }
        final StringBuilder a = snp.a("radix ", n, " was not in valid range ");
        a.append(new kud(2, 36));
        throw new IllegalArgumentException(a.toString());
    }
    
    public static long t0(final String s, final long n) {
        return p0(s, n, 1L, Long.MAX_VALUE);
    }
    
    public static final void u(final zfo zfo, final Context context, final long n) {
        e0e.f((Object)zfo, "<this>");
        final Resources resources = context.getResources();
        e0e.e((Object)resources, "ctx.resources");
        final String string = context.getString(2131957402, new Object[] { iqs.e(resources, n) });
        e0e.e((Object)string, "ctx.getString(\n        R\u2026resources, startMs)\n    )");
        final q6s$a q6s$a = new q6s$a();
        q6s$a.t(string);
        q6s$a.e = (rfd$c)rfd$c$b.b;
        q6s$a.r("");
        q6s$a.q(32);
        zfo.f((q6s)((z4j)q6s$a).e());
    }
    
    public static final String u0(final char c, final Locale locale) {
        final String value = String.valueOf(c);
        e0e.d((Object)value, "null cannot be cast to non-null type java.lang.String");
        String s = value.toUpperCase(locale);
        e0e.e((Object)s, "this as java.lang.String).toUpperCase(locale)");
        if (s.length() > 1) {
            if (c != '\u0149') {
                final char char1 = s.charAt(0);
                final String substring = s.substring(1);
                e0e.e((Object)substring, "this as java.lang.String).substring(startIndex)");
                final String lowerCase = substring.toLowerCase(Locale.ROOT);
                e0e.e((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                final StringBuilder sb = new StringBuilder();
                sb.append(char1);
                sb.append(lowerCase);
                s = sb.toString();
            }
            return s;
        }
        final String value2 = String.valueOf(c);
        e0e.d((Object)value2, "null cannot be cast to non-null type java.lang.String");
        final String upperCase = value2.toUpperCase(Locale.ROOT);
        e0e.e((Object)upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (!e0e.a((Object)s, (Object)upperCase)) {
            return s;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
    
    public static final boolean v(final ex9 ex9) {
        e0e.f((Object)ex9, "image");
        final String s0 = ex9.S0;
        final boolean b = false;
        if (s0 == null || slr.k1((CharSequence)s0)) {
            final String r0 = ex9.R0;
            boolean b2 = b;
            if (r0 == null) {
                return b2;
            }
            b2 = b;
            if (!(slr.k1((CharSequence)r0) ^ true)) {
                return b2;
            }
        }
        else {
            final boolean b2 = b;
            if (e0e.a((Object)ex9.S0, (Object)ex9.R0)) {
                return b2;
            }
        }
        return true;
    }
    
    public static final rll v0(final vll vll, final mlv mlv) {
        e0e.f((Object)mlv, "typeTable");
        rll rll;
        if (vll.q()) {
            rll = vll.K0;
            e0e.e((Object)rll, "type");
        }
        else {
            if ((vll.H0 & 0x8) != 0x8) {
                throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
            }
            rll = mlv.a(vll.L0);
        }
        return rll;
    }
    
    public static final void w(final int n, final int n2) {
        if (n <= n2) {
            return;
        }
        throw new IndexOutOfBoundsException(bng.g("toIndex (", n, ") is greater than size (", n2, ")."));
    }
    
    public static byte w0(final Boolean b) {
        if (b == null) {
            return -1;
        }
        if (b) {
            return 1;
        }
        return 0;
    }
    
    public static int x0(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return n;
        }
        String s;
        if (n >= 0) {
            if (n2 < 0) {
                throw new IllegalArgumentException(go9.p(26, "negative size: ", n2));
            }
            s = eg8.P0("%s (%s) must be less than size (%s)", "index", n, n2);
        }
        else {
            s = eg8.P0("%s (%s) must not be negative", "index", n);
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void y(final int n, final int n2, final u63 u63) throws WriterException {
        for (int i = 0; i < 8; ++i) {
            final int n3 = n + i;
            if (!R(u63.a(n3, n2))) {
                throw new WriterException();
            }
            u63.b(n3, n2, 0);
        }
    }
    
    public static int y0(@NullableDecl final Object o) {
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        return (int)(Integer.rotateLeft((int)(hashCode * -862048943L), 15) * 461845907L);
    }
    
    public static void z(final int n, final int n2, final u63 u63) {
        for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < 7; ++j) {
                u63.b(n + j, n2 + i, bs4.G0[i][j]);
            }
        }
    }
    
    public static Boolean z0(final byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
    
    public dlh V(final dlh dlh) {
        e0e.f((Object)dlh, "<this>");
        Objects.requireNonNull(ex.Companion);
        final jw1 f = ex$a.f;
        final ysd$a a = ysd.a;
        final ysd$a a2 = ysd.a;
        return dlh.E((dlh)new nb2((ex)f, true));
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return stz.G0.b().B();
    }
    
    public Typeface b(final qlb qlb, final int n) {
        e0e.f((Object)qlb, "fontWeight");
        return this.x(null, qlb, n);
    }
    
    public dlh e(final dlh dlh, final ex ex) {
        e0e.f((Object)dlh, "<this>");
        e0e.f((Object)ex, "alignment");
        final ysd$a a = ysd.a;
        final ysd$a a2 = ysd.a;
        return dlh.E((dlh)new nb2(ex, false));
    }
    
    public Typeface f(final s0c s0c, final qlb qlb, final int n) {
        e0e.f((Object)s0c, "name");
        e0e.f((Object)qlb, "fontWeight");
        final String g0 = s0c.G0;
        e0e.f((Object)g0, "name");
        final int n2 = qlb.F0 / 100;
        final int n3 = 1;
        String s;
        if (n2 >= 0 && n2 < 2) {
            s = mqb.l(g0, "-thin");
        }
        else if (2 <= n2 && n2 < 4) {
            s = mqb.l(g0, "-light");
        }
        else if (n2 == 4) {
            s = g0;
        }
        else if (n2 == 5) {
            s = mqb.l(g0, "-medium");
        }
        else if (6 <= n2 && n2 < 8) {
            s = g0;
        }
        else {
            final boolean b = 8 <= n2 && n2 < 11;
            s = g0;
            if (b) {
                s = mqb.l(g0, "-black");
            }
        }
        final boolean b2 = s.length() == 0;
        final Typeface typeface = null;
        Typeface typeface2;
        if (b2) {
            typeface2 = typeface;
        }
        else {
            final Typeface x = this.x(s, qlb, n);
            int n4;
            if (!e0e.a((Object)x, (Object)Typeface.create(Typeface.DEFAULT, fbx.u(qlb, n))) && !e0e.a((Object)x, (Object)this.x(null, qlb, n))) {
                n4 = n3;
            }
            else {
                n4 = 0;
            }
            typeface2 = typeface;
            if (n4 != 0) {
                typeface2 = x;
            }
        }
        Typeface x2;
        if ((x2 = typeface2) == null) {
            x2 = this.x(s0c.G0, qlb, n);
        }
        return x2;
    }
    
    public Iterable g(final Object o) {
        return ((da3)o).a().d();
    }
    
    public Object h(final jie jie, final float n) throws IOException {
        final int v2 = jie.V2();
        boolean b = true;
        if (v2 != 1) {
            b = false;
        }
        if (b) {
            jie.a();
        }
        final double n2 = jie.n2();
        final double n3 = jie.n2();
        final double n4 = jie.n2();
        double n5;
        if (jie.V2() == 7) {
            n5 = jie.n2();
        }
        else {
            n5 = 1.0;
        }
        if (b) {
            jie.c();
        }
        double n6 = n2;
        double n7 = n3;
        double n8 = n4;
        double n9 = n5;
        if (n2 <= 1.0) {
            n6 = n2;
            n7 = n3;
            n8 = n4;
            n9 = n5;
            if (n3 <= 1.0) {
                n6 = n2;
                n7 = n3;
                n8 = n4;
                n9 = n5;
                if (n4 <= 1.0) {
                    final double n10 = n2 * 255.0;
                    final double n11 = n3 * 255.0;
                    final double n12 = n4 * 255.0;
                    n6 = n10;
                    n7 = n11;
                    n8 = n12;
                    n9 = n5;
                    if (n5 <= 1.0) {
                        n9 = n5 * 255.0;
                        n8 = n12;
                        n7 = n11;
                        n6 = n10;
                    }
                }
            }
        }
        return Color.argb((int)n9, (int)n6, (int)n7, (int)n8);
    }
    
    public Typeface x(final String s, final qlb qlb, int n) {
        Objects.requireNonNull(mlb.Companion);
        final int n2 = 1;
        if (n == 0) {
            Objects.requireNonNull(qlb.Companion);
            if (e0e.a((Object)qlb, (Object)qlb.M0) && (s == null || s.length() == 0)) {
                final Typeface default1 = Typeface.DEFAULT;
                e0e.e((Object)default1, "DEFAULT");
                return default1;
            }
        }
        final int u = fbx.u(qlb, n);
        n = n2;
        if (s != null) {
            if (s.length() == 0) {
                n = n2;
            }
            else {
                n = 0;
            }
        }
        Typeface typeface;
        if (n != 0) {
            typeface = Typeface.defaultFromStyle(u);
            e0e.e((Object)typeface, "{\n            Typeface.d\u2026le(targetStyle)\n        }");
        }
        else {
            typeface = Typeface.create(s, u);
            e0e.e((Object)typeface, "{\n            Typeface.c\u2026y, targetStyle)\n        }");
        }
        return typeface;
    }
}
