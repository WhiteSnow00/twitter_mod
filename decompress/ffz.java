import java.util.Set;
import java.lang.ref.ReferenceQueue;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Locale;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import com.twitter.util.user.UserIdentifier;
import android.view.Window;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.twitter.tipjar.TipJarFields;
import android.text.format.Time;
import android.graphics.Color;
import java.util.LinkedHashSet;
import tv.periscope.android.api.customheart.Asset;
import tv.periscope.android.api.customheart.Theme;
import tv.periscope.android.api.GetHeartThemeAssetsResponse;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KClass;
import com.twitter.weaver.base.WeaverViewStubDelegateBinder;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Objects;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public class ffz implements mh4, f02, gry, e16, str
{
    public static cfz D0;
    public static final r94 E0;
    public static final r94 F0;
    public static final long[] G0;
    public static final Object[] H0;
    public static final ffz I0;
    public static final ffz J0;
    public static final b4s K0;
    public static final b4s L0;
    public static final b4s M0;
    public static final klk N0;
    public static final llk O0;
    public static final xl3 P0;
    public static final nlk Q0;
    public static final mlk R0;
    public static final xl3 S0;
    public static final slk T0;
    public static final qlk U0;
    public static final rlk V0;
    public static final jlk W0;
    public static final ilk X0;
    public static final jlk Y0;
    public static final xlk Z0;
    public static final wlk a1;
    public static final tlk b1;
    public static final glk c1;
    public static final hlk d1;
    public static final olk e1;
    public static final plk f1;
    public static final xl3 g1;
    public static final int[] h1;
    public static final int[] i1;
    public static final ffz j1;
    public static final ffz k1;
    
    static {
        F0 = (E0 = new r94());
        G0 = new long[0];
        H0 = new Object[0];
        I0 = new ffz();
        J0 = new ffz();
        K0 = new b4s("NULL");
        L0 = new b4s("UNINITIALIZED");
        M0 = new b4s("DONE");
        N0 = new klk(4);
        O0 = new llk();
        P0 = new xl3(3, 2);
        Q0 = new nlk();
        R0 = new mlk();
        S0 = new xl3(2, 1);
        T0 = new slk();
        U0 = new qlk();
        V0 = new rlk();
        W0 = new jlk(2, 1);
        X0 = new ilk();
        Y0 = new jlk(2, 0);
        Z0 = new xlk();
        a1 = new wlk();
        b1 = new tlk();
        c1 = new glk();
        d1 = new hlk();
        e1 = new olk();
        f1 = new plk();
        g1 = new xl3(2, 0);
        h1 = new int[] { 16843071, 16843072, 2130968828, 2130968831, 2130968832, 2130968834, 2130968835, 2130968836, 2130969022, 2130969023, 2130969025, 2130969026, 2130969028 };
        i1 = new int[] { 16842901, 2130970402, 2130970403, 2130970419, 2130970421, 2130970430 };
        j1 = new ffz();
        k1 = new ffz();
    }
    
    public ffz() {
    }
    
    public ffz(final ims ims) {
        czd.f((Object)ims, "themeVariant");
    }
    
    public static final int A(final int n) {
        if (new itd(2, 36).l(n)) {
            return n;
        }
        final StringBuilder l = da8.l("radix ", n, " was not in valid range ");
        l.append(new itd(2, 36));
        throw new IllegalArgumentException(l.toString());
    }
    
    public static final Object A0(final Object o, final qsb qsb) {
        final Throwable a = nsm.a(o);
        Object o2;
        if (a == null) {
            o2 = o;
            if (qsb != null) {
                o2 = new f06(o, qsb);
            }
        }
        else {
            o2 = new c06(a);
        }
        return o2;
    }
    
    public static final void B(final int n, final int n2, final int n3) {
        if (n < 0 || n2 > n3) {
            final StringBuilder f = shc.f("fromIndex: ", n, ", toIndex: ", n2, ", size: ");
            f.append(n3);
            throw new IndexOutOfBoundsException(f.toString());
        }
        if (n <= n2) {
            return;
        }
        throw new IllegalArgumentException(zjf.h("fromIndex: ", n, " > toIndex: ", n2));
    }
    
    public static final fll B0(final jll jll, final alv alv) {
        czd.f((Object)alv, "typeTable");
        fll fll;
        if (jll.q()) {
            fll = jll.I0;
            czd.e((Object)fll, "type");
        }
        else {
            if ((jll.F0 & 0x8) != 0x8) {
                throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
            }
            fll = alv.a(jll.J0);
        }
        return fll;
    }
    
    public static float C(final float n, final float n2, final float n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final void C0(final ceb ceb) {
        keb.b(ceb);
        final suh f0 = ceb.F0;
        final int f2 = f0.F0;
        if (f2 > 0) {
            int n = 0;
            final Object[] d0 = f0.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                C0((ceb)d0[n]);
            } while (++n < f2);
        }
    }
    
    public static int D(final int n, final int n2, final int n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final u9q D0(final u9q u9q, final u9q u9q2) {
        czd.f((Object)u9q, "<this>");
        czd.f((Object)u9q2, "abbreviatedType");
        if (chw.a0((bse)u9q)) {
            return u9q;
        }
        return (u9q)new c7(u9q, u9q2);
    }
    
    public static final void E(final irj irj, final umb umb, final Collection collection) {
        czd.f((Object)irj, "<this>");
        czd.f((Object)umb, "fqName");
        if (irj instanceof krj) {
            ((krj)irj).a(umb, collection);
        }
        else {
            collection.addAll(irj.c(umb));
        }
    }
    
    public static byte E0(final Boolean b) {
        if (b == null) {
            return -1;
        }
        if (b) {
            return 1;
        }
        return 0;
    }
    
    public static final e74 F(long b, long b2, final x66 x66, int i) {
        x66.x(469524104);
        long b3 = 0L;
        long j;
        if ((i & 0x1) != 0x0) {
            final n96$b a = n96.a;
            j = ((ir4)x66.m((wd6)jr4.a)).j();
        }
        else {
            j = 0L;
        }
        if ((i & 0x2) != 0x0) {
            final n96$b a2 = n96.a;
            b = nq4.b(((ir4)x66.m((wd6)jr4.a)).g(), 0.6f);
        }
        long l;
        if ((i & 0x4) != 0x0) {
            final n96$b a3 = n96.a;
            l = ((ir4)x66.m((wd6)jr4.a)).l();
        }
        else {
            l = 0L;
        }
        if ((i & 0x8) != 0x0) {
            final n96$b a4 = n96.a;
            b2 = nq4.b(((ir4)x66.m((wd6)jr4.a)).g(), rp9.U(x66, 6));
        }
        if ((i & 0x10) != 0x0) {
            b3 = nq4.b(j, rp9.U(x66, 6));
        }
        final n96$b a5 = n96.a;
        final nq4 nq4 = new nq4(j);
        i = 0;
        final nq4 nq5 = new nq4(b);
        final nq4 nq6 = new nq4(l);
        final nq4 nq7 = new nq4(b2);
        final nq4 nq8 = new nq4(b3);
        x66.x(-568225417);
        boolean b4 = false;
        while (i < 5) {
            b4 |= x66.P((new Object[] { nq4, nq5, nq6, nq7, nq8 })[i]);
            ++i;
        }
        final Object y = x66.y();
        if8 if8 = null;
        Label_0399: {
            if (!b4) {
                Objects.requireNonNull(x66.Companion);
                if ((if8 = (if8)y) != x66$a.b) {
                    break Label_0399;
                }
            }
            if8 = new if8(l, nq4.b(l, 0.0f), j, nq4.b(j, 0.0f), b2, nq4.b(b2, 0.0f), b3, j, b, b2, b3);
            x66.p((Object)if8);
        }
        x66.O();
        final if8 if9 = if8;
        final n96$b a6 = n96.a;
        x66.O();
        return (e74)if9;
    }
    
    public static Boolean F0(final byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
    
    public static final af4 G(final vba vba, final long a) {
        czd.f((Object)vba, "eventNamespace");
        final af4 af4 = new af4(vba);
        final gfv gfv = new gfv();
        gfv.a = a;
        gfv.c = 11;
        ((u0p)af4).i((j0p)gfv);
        return af4;
    }
    
    public static Object G0(final Object o, final int n) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(jxa.p(20, "at index ", n));
    }
    
    public static final njv H(final boolean b, final boolean b2, final jb4 jb4, final fse fse, final gse gse) {
        czd.f((Object)jb4, "typeSystemContext");
        czd.f((Object)fse, "kotlinTypePreparator");
        czd.f((Object)gse, "kotlinTypeRefiner");
        return new njv(b, b2, (ykv)jb4, (db)fse, (nbu)gse);
    }
    
    public static String H0(final String s, final Object... array) {
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
                    nb0.z(sb2, "<", string, " threw ", name2);
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
    
    public static njv I(final boolean b, boolean b2, jb4 k0, fse e0, gse d0, final int n) {
        if ((n & 0x2) != 0x0) {
            b2 = true;
        }
        if ((n & 0x4) != 0x0) {
            k0 = (jb4)nza.K0;
        }
        if ((n & 0x8) != 0x0) {
            e0 = (fse)fse$a.E0;
        }
        if ((n & 0x10) != 0x0) {
            d0 = (gse)gse$a.D0;
        }
        return H(b, b2, k0, e0, d0);
    }
    
    public static boolean I0(final Object o, final Object o2) {
        boolean b = false;
        if (o != o2) {
            if (o == null) {
                return b;
            }
            if (!o.equals(o2)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    public static final x5x J(final Class clazz, final qsb qsb) {
        czd.f((Object)qsb, "inflationPredicate");
        return new x5x((z6x)new WeaverViewStubDelegateBinder(qsb), (y6x$a)jm.N0);
    }
    
    public static boolean J0(final String s) {
        final int a = d100.a;
        return s == null || s.isEmpty();
    }
    
    public static final x5x K(final KClass kClass, final qsb qsb) {
        czd.f((Object)kClass, "klass");
        czd.f((Object)qsb, "inflationPredicate");
        return new x5x((z6x)new WeaverViewStubDelegateBinder(qsb), (y6x$a)jm.N0);
    }
    
    public static int M(final j3a j3a, int n) {
        final boolean k = j3a.k(j3a);
        final int n2 = 1;
        if (!k) {
            return 1;
        }
        fli.m(Boolean.valueOf(j3a.k(j3a)));
        j3a.q();
        j3a.q();
        final int j0 = j3a.J0;
        j3a.q();
        final int max = Math.max(j0, j3a.I0);
        final float n3 = (float)n;
        n = n2;
        while (max / n > n3) {
            j3a.q();
            if (j3a.F0 == io7.E0) {
                n *= 2;
            }
            else {
                ++n;
            }
        }
        return n;
    }
    
    public static final boolean O(final char c, final char c2, final boolean b) {
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
    
    public static final ceb P(ceb h0) {
        final int ordinal = ((Enum)h0.G0).ordinal();
        ceb p = h0;
        if (ordinal != 0) {
            Label_0057: {
                if (ordinal != 1) {
                    p = h0;
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                break Label_0057;
                            }
                            if (ordinal != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        p = null;
                        return p;
                    }
                    return p;
                }
            }
            h0 = h0.H0;
            if (h0 != null) {
                p = P(h0);
                if (p != null) {
                    return p;
                }
            }
            throw new IllegalStateException("no child".toString());
        }
        return p;
    }
    
    public static final pkb Q(final pkb$a pkb$a) {
        czd.f((Object)pkb$a, "<this>");
        return pkb.G0;
    }
    
    public static final int R(final pkb pkb, int n) {
        czd.f((Object)pkb, "fontWeight");
        final int b = pkb.b(Q(pkb.Companion));
        final int n2 = 0;
        final boolean b2 = b >= 0;
        Objects.requireNonNull(lkb.Companion);
        final boolean b3 = n == 1;
        if (b3 && b2) {
            n = 3;
        }
        else if (b2) {
            n = 1;
        }
        else {
            n = n2;
            if (b3) {
                n = 2;
            }
        }
        return n;
    }
    
    public static int S(final j19 j19) {
        if (j19 == j19.d) {
            return 2;
        }
        return 3;
    }
    
    public static Map T() {
        final HashMap hashMap = new HashMap(286);
        final ArrayList list = new ArrayList(25);
        list.add("US");
        list.add("AG");
        list.add("AI");
        list.add("AS");
        list.add("BB");
        list.add("BM");
        list.add("BS");
        list.add("CA");
        list.add("DM");
        list.add("DO");
        list.add("GD");
        list.add("GU");
        list.add("JM");
        list.add("KN");
        list.add("KY");
        list.add("LC");
        list.add("MP");
        list.add("MS");
        list.add("PR");
        list.add("SX");
        list.add("TC");
        list.add("TT");
        list.add("VC");
        list.add("VG");
        final ArrayList i = toe.i(list, "VI", 1, hashMap, list, 2);
        i.add("RU");
        i.add("KZ");
        hashMap.put(7, i);
        final ArrayList list2 = new ArrayList(1);
        list2.add("EG");
        hashMap.put(36, zjf.i(34, hashMap, zjf.i(33, hashMap, zjf.i(32, hashMap, zjf.i(31, hashMap, zjf.i(30, hashMap, zjf.i(27, hashMap, zjf.i(20, hashMap, list2, 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"));
        final ArrayList list3 = new ArrayList(2);
        list3.add("IT");
        list3.add("VA");
        hashMap.put(43, zjf.i(41, hashMap, zjf.i(40, hashMap, zjf.i(39, hashMap, list3, 1, "RO"), 1, "CH"), 1, "AT"));
        final ArrayList list4 = new ArrayList(4);
        list4.add("GB");
        list4.add("GG");
        list4.add("IM");
        list4.add("JE");
        hashMap.put(44, list4);
        final ArrayList list5 = new ArrayList(1);
        list5.add("DK");
        hashMap.put(46, zjf.i(45, hashMap, list5, 1, "SE"));
        final ArrayList list6 = new ArrayList(2);
        list6.add("NO");
        list6.add("SJ");
        hashMap.put(60, zjf.i(58, hashMap, zjf.i(57, hashMap, zjf.i(56, hashMap, zjf.i(55, hashMap, zjf.i(54, hashMap, zjf.i(53, hashMap, zjf.i(52, hashMap, zjf.i(51, hashMap, zjf.i(49, hashMap, zjf.i(48, hashMap, zjf.i(47, hashMap, list6, 1, "PL"), 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"));
        final ArrayList list7 = new ArrayList(3);
        list7.add("AU");
        list7.add("CC");
        final ArrayList j = toe.i(list7, "CX", 61, hashMap, list7, 1);
        final ArrayList k = toe.i(j, "ID", 62, hashMap, j, 1);
        final ArrayList l = toe.i(k, "PH", 63, hashMap, k, 1);
        final ArrayList m = toe.i(l, "NZ", 64, hashMap, l, 1);
        final ArrayList i2 = toe.i(m, "SG", 65, hashMap, m, 1);
        final ArrayList i3 = toe.i(i2, "TH", 66, hashMap, i2, 1);
        final ArrayList i4 = toe.i(i3, "JP", 81, hashMap, i3, 1);
        final ArrayList i5 = toe.i(i4, "KR", 82, hashMap, i4, 1);
        final ArrayList i6 = toe.i(i5, "VN", 84, hashMap, i5, 1);
        final ArrayList i7 = toe.i(i6, "CN", 86, hashMap, i6, 1);
        final ArrayList i8 = toe.i(i7, "TR", 90, hashMap, i7, 1);
        final ArrayList i9 = toe.i(i8, "IN", 91, hashMap, i8, 1);
        final ArrayList i10 = toe.i(i9, "PK", 92, hashMap, i9, 1);
        final ArrayList i11 = toe.i(i10, "AF", 93, hashMap, i10, 1);
        final ArrayList i12 = toe.i(i11, "LK", 94, hashMap, i11, 1);
        final ArrayList i13 = toe.i(i12, "MM", 95, hashMap, i12, 1);
        final ArrayList i14 = toe.i(i13, "IR", 98, hashMap, i13, 1);
        final ArrayList i15 = toe.i(i14, "SS", 211, hashMap, i14, 2);
        i15.add("MA");
        i15.add("EH");
        hashMap.put(212, i15);
        final ArrayList list8 = new ArrayList(1);
        list8.add("DZ");
        hashMap.put(261, zjf.i(260, hashMap, zjf.i(258, hashMap, zjf.i(257, hashMap, zjf.i(256, hashMap, zjf.i(255, hashMap, zjf.i(254, hashMap, zjf.i(253, hashMap, zjf.i(252, hashMap, zjf.i(251, hashMap, zjf.i(250, hashMap, zjf.i(249, hashMap, zjf.i(248, hashMap, zjf.i(247, hashMap, zjf.i(246, hashMap, zjf.i(245, hashMap, zjf.i(244, hashMap, zjf.i(243, hashMap, zjf.i(242, hashMap, zjf.i(241, hashMap, zjf.i(240, hashMap, zjf.i(239, hashMap, zjf.i(238, hashMap, zjf.i(237, hashMap, zjf.i(236, hashMap, zjf.i(235, hashMap, zjf.i(234, hashMap, zjf.i(233, hashMap, zjf.i(232, hashMap, zjf.i(231, hashMap, zjf.i(230, hashMap, zjf.i(229, hashMap, zjf.i(228, hashMap, zjf.i(227, hashMap, zjf.i(226, hashMap, zjf.i(225, hashMap, zjf.i(224, hashMap, zjf.i(223, hashMap, zjf.i(222, hashMap, zjf.i(221, hashMap, zjf.i(220, hashMap, zjf.i(218, hashMap, zjf.i(216, hashMap, zjf.i(213, hashMap, list8, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"));
        final ArrayList list9 = new ArrayList(2);
        list9.add("RE");
        list9.add("YT");
        hashMap.put(269, zjf.i(268, hashMap, zjf.i(267, hashMap, zjf.i(266, hashMap, zjf.i(265, hashMap, zjf.i(264, hashMap, zjf.i(263, hashMap, zjf.i(262, hashMap, list9, 1, "ZW"), 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"));
        final ArrayList list10 = new ArrayList(2);
        list10.add("SH");
        list10.add("TA");
        hashMap.put(357, zjf.i(356, hashMap, zjf.i(355, hashMap, zjf.i(354, hashMap, zjf.i(353, hashMap, zjf.i(352, hashMap, zjf.i(351, hashMap, zjf.i(350, hashMap, zjf.i(299, hashMap, zjf.i(298, hashMap, zjf.i(297, hashMap, zjf.i(291, hashMap, zjf.i(290, hashMap, list10, 1, "ER"), 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"));
        final ArrayList list11 = new ArrayList(2);
        list11.add("FI");
        list11.add("AX");
        hashMap.put(509, zjf.i(508, hashMap, zjf.i(507, hashMap, zjf.i(506, hashMap, zjf.i(505, hashMap, zjf.i(504, hashMap, zjf.i(503, hashMap, zjf.i(502, hashMap, zjf.i(501, hashMap, zjf.i(500, hashMap, zjf.i(423, hashMap, zjf.i(421, hashMap, zjf.i(420, hashMap, zjf.i(389, hashMap, zjf.i(387, hashMap, zjf.i(386, hashMap, zjf.i(385, hashMap, zjf.i(383, hashMap, zjf.i(382, hashMap, zjf.i(381, hashMap, zjf.i(380, hashMap, zjf.i(378, hashMap, zjf.i(377, hashMap, zjf.i(376, hashMap, zjf.i(375, hashMap, zjf.i(374, hashMap, zjf.i(373, hashMap, zjf.i(372, hashMap, zjf.i(371, hashMap, zjf.i(370, hashMap, zjf.i(359, hashMap, zjf.i(358, hashMap, list11, 1, "BG"), 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"));
        final ArrayList list12 = new ArrayList(3);
        list12.add("GP");
        list12.add("BL");
        final ArrayList i16 = toe.i(list12, "MF", 590, hashMap, list12, 1);
        final ArrayList i17 = toe.i(i16, "BO", 591, hashMap, i16, 1);
        final ArrayList i18 = toe.i(i17, "GY", 592, hashMap, i17, 1);
        final ArrayList i19 = toe.i(i18, "EC", 593, hashMap, i18, 1);
        final ArrayList i20 = toe.i(i19, "GF", 594, hashMap, i19, 1);
        final ArrayList i21 = toe.i(i20, "PY", 595, hashMap, i20, 1);
        final ArrayList i22 = toe.i(i21, "MQ", 596, hashMap, i21, 1);
        final ArrayList i23 = toe.i(i22, "SR", 597, hashMap, i22, 1);
        final ArrayList i24 = toe.i(i23, "UY", 598, hashMap, i23, 2);
        i24.add("CW");
        i24.add("BQ");
        hashMap.put(599, i24);
        final ArrayList list13 = new ArrayList(1);
        list13.add("TL");
        hashMap.put(998, zjf.i(996, hashMap, zjf.i(995, hashMap, zjf.i(994, hashMap, zjf.i(993, hashMap, zjf.i(992, hashMap, zjf.i(979, hashMap, zjf.i(977, hashMap, zjf.i(976, hashMap, zjf.i(975, hashMap, zjf.i(974, hashMap, zjf.i(973, hashMap, zjf.i(972, hashMap, zjf.i(971, hashMap, zjf.i(970, hashMap, zjf.i(968, hashMap, zjf.i(967, hashMap, zjf.i(966, hashMap, zjf.i(965, hashMap, zjf.i(964, hashMap, zjf.i(963, hashMap, zjf.i(962, hashMap, zjf.i(961, hashMap, zjf.i(960, hashMap, zjf.i(888, hashMap, zjf.i(886, hashMap, zjf.i(883, hashMap, zjf.i(882, hashMap, zjf.i(881, hashMap, zjf.i(880, hashMap, zjf.i(878, hashMap, zjf.i(870, hashMap, zjf.i(856, hashMap, zjf.i(855, hashMap, zjf.i(853, hashMap, zjf.i(852, hashMap, zjf.i(850, hashMap, zjf.i(808, hashMap, zjf.i(800, hashMap, zjf.i(692, hashMap, zjf.i(691, hashMap, zjf.i(690, hashMap, zjf.i(689, hashMap, zjf.i(688, hashMap, zjf.i(687, hashMap, zjf.i(686, hashMap, zjf.i(685, hashMap, zjf.i(683, hashMap, zjf.i(682, hashMap, zjf.i(681, hashMap, zjf.i(680, hashMap, zjf.i(679, hashMap, zjf.i(678, hashMap, zjf.i(677, hashMap, zjf.i(676, hashMap, zjf.i(675, hashMap, zjf.i(674, hashMap, zjf.i(673, hashMap, zjf.i(672, hashMap, zjf.i(670, hashMap, list13, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }
    
    public static final KClass U(final bne bne) {
        KClass kClass;
        if (bne instanceof KClass) {
            kClass = (KClass)bne;
        }
        else {
            if (bne instanceof poe) {
                final List upperBounds = ((poe)bne).getUpperBounds();
                final Iterator iterator = upperBounds.iterator();
                while (true) {
                    ta4 ta4;
                    Object next;
                    do {
                        final boolean hasNext = iterator.hasNext();
                        final koe koe = null;
                        final ta4 ta5 = null;
                        if (hasNext) {
                            next = iterator.next();
                            final koe koe2 = (koe)next;
                            czd.d((Object)koe2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                            final lb4 d = ((ooe)koe2).D0.M0().d();
                            ta4 = ta5;
                            if (!(d instanceof ta4)) {
                                continue;
                            }
                            ta4 = (ta4)d;
                        }
                        else {
                            koe koe3;
                            if ((koe3 = koe) == null) {
                                koe3 = (koe)mq4.i0(upperBounds);
                            }
                            if (koe3 != null) {
                                kClass = V(koe3);
                                return kClass;
                            }
                            kClass = v9m.a((Class)Object.class);
                            return kClass;
                        }
                    } while (ta4 == null || ta4.i() == za4.E0 || ta4.i() == za4.H0);
                    final koe koe = (koe)next;
                    continue;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot calculate JVM erasure for type: ");
            sb.append(bne);
            throw new xre(sb.toString());
        }
        return kClass;
    }
    
    public static final KClass V(final koe koe) {
        czd.f((Object)koe, "<this>");
        final bne i = koe.i();
        if (i != null) {
            final KClass u = U(i);
            if (u != null) {
                return u;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot calculate JVM erasure for type: ");
        sb.append(koe);
        throw new xre(sb.toString());
    }
    
    public static final void W(final Context context, final u97 u97, final GetHeartThemeAssetsResponse getHeartThemeAssetsResponse) {
        czd.f((Object)context, "context");
        czd.f((Object)u97, "customHeartCache");
        czd.f((Object)getHeartThemeAssetsResponse, "response");
        final syo$a b = syo.b(context.getApplicationContext());
        final List themes = getHeartThemeAssetsResponse.themes;
        czd.e((Object)themes, "response.themes");
        final int ordinal = ((Enum)b).ordinal();
        String s;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                s = "xxhdpi";
            }
            else {
                s = "xhdpi";
            }
        }
        else {
            s = "hdpi";
        }
        for (final Theme theme : themes) {
            final String theme2 = theme.theme;
            final Iterator iterator2 = theme.assets.iterator();
            String s2 = null;
            String s3 = null;
            String assetUrl;
            String assetUrl2;
            while (true) {
                assetUrl = s2;
                assetUrl2 = s3;
                if (!iterator2.hasNext()) {
                    break;
                }
                final Asset asset = (Asset)iterator2.next();
                if (!czd.a((Object)asset.density, (Object)s)) {
                    continue;
                }
                final String assetName = asset.assetName;
                if (czd.a((Object)assetName, (Object)"border")) {
                    assetUrl = asset.assetUrl;
                    assetUrl2 = s3;
                }
                else {
                    assetUrl = s2;
                    assetUrl2 = s3;
                    if (czd.a((Object)assetName, (Object)"fill")) {
                        assetUrl2 = asset.assetUrl;
                        assetUrl = s2;
                    }
                }
                s2 = assetUrl;
                s3 = assetUrl2;
                if (assetUrl == null) {
                    continue;
                }
                s2 = assetUrl;
                if ((s3 = assetUrl2) != null) {
                    break;
                }
            }
            if (assetUrl == null && assetUrl2 == null) {
                continue;
            }
            czd.e((Object)theme2, "themeName");
            t97 t97;
            if ((t97 = u97.a.get(theme2)) == null) {
                t97 = new t97();
                u97.a.put(theme2, t97);
            }
            String a;
            if ((a = assetUrl) == null) {
                a = t97.a;
            }
            t97.a = a;
            String b2;
            if ((b2 = assetUrl2) == null) {
                b2 = t97.b;
            }
            t97.b = b2;
            if (u97.b.contains(theme2)) {
                continue;
            }
            u97.b.add(theme2);
        }
    }
    
    public static final boolean X(final xkl xkl) {
        czd.f((Object)xkl, "<this>");
        return xkl.q() || xkl.r();
    }
    
    public static final boolean Y(final cll cll) {
        czd.f((Object)cll, "<this>");
        return cll.q() || cll.r();
    }
    
    public static int Z(int n) {
        final int n2 = n * 8;
        n = 4;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= 32) {
                break;
            }
            n3 = (1 << n) - 12;
            if (n2 <= n3) {
                break;
            }
            ++n;
        }
        return n3 / 8;
    }
    
    public static final boolean a0(final irj irj, final umb umb) {
        czd.f((Object)irj, "<this>");
        czd.f((Object)umb, "fqName");
        boolean b;
        if (irj instanceof krj) {
            b = ((krj)irj).b(umb);
        }
        else {
            b = ((ArrayList)i0(irj, umb)).isEmpty();
        }
        return b;
    }
    
    public static final boolean b0(final Throwable t) {
        Class<? extends Throwable> clazz = t.getClass();
        while (!czd.a((Object)clazz.getCanonicalName(), (Object)"com.intellij.openapi.progress.ProcessCanceledException")) {
            if ((clazz = (Class<? extends Throwable>)clazz.getSuperclass()) == null) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean c0() {
        return asa.b().b("home_timeline_tweet_auto_inline_reply_enabled", false);
    }
    
    public static final boolean d0(final char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
    
    public static final z1w e0(z1w q0, final boolean b) {
        czd.f((Object)q0, "<this>");
        final Object a = dl8.Companion.a(q0, b);
        if (a != null) {
            q0 = (z1w)a;
        }
        else {
            final Object f0 = f0((bse)q0);
            if (f0 != null) {
                q0 = (z1w)f0;
            }
            else {
                q0 = q0.Q0(false);
            }
        }
        return q0;
    }
    
    public static final u9q f0(bse e0) {
        final ojv m0 = ((bse)e0).M0();
        xxd xxd;
        if (m0 instanceof xxd) {
            xxd = (xxd)m0;
        }
        else {
            xxd = null;
        }
        if (xxd == null) {
            return null;
        }
        final LinkedHashSet b = xxd.b;
        final ArrayList list = new ArrayList<bse>(iq4.H((Iterable)b, 10));
        final Iterator iterator = b.iterator();
        boolean b2 = false;
        while (iterator.hasNext()) {
            Object e2;
            final Object o = e2 = iterator.next();
            if (clv.g((bse)o)) {
                e2 = e0(((bse)o).P0(), false);
                b2 = true;
            }
            list.add((bse)e2);
        }
        xxd xxd2;
        if (!b2) {
            xxd2 = null;
        }
        else {
            final bse a = xxd.a;
            if (a != null) {
                e0 = a;
                if (clv.g(a)) {
                    e0 = e0(a.P0(), false);
                }
            }
            else {
                e0 = null;
            }
            list.isEmpty();
            final LinkedHashSet set = new LinkedHashSet(list);
            set.hashCode();
            final xxd xxd3 = new xxd((Collection)set);
            xxd3.a = (bse)e0;
            xxd2 = xxd3;
        }
        if (xxd2 == null) {
            return null;
        }
        return xxd2.f();
    }
    
    public static final u9q g0(final u9q u9q, final boolean b) {
        czd.f((Object)u9q, "<this>");
        Object o = dl8.Companion.a((z1w)u9q, b);
        if (o == null) {
            if ((o = f0((bse)u9q)) == null) {
                o = u9q.T0(false);
            }
        }
        return (u9q)o;
    }
    
    public static final fll h0(fll fll, final alv alv) {
        czd.f((Object)fll, "<this>");
        czd.f((Object)alv, "typeTable");
        if (fll.t()) {
            fll = fll.P0;
        }
        else if ((fll.F0 & 0x200) == 0x200) {
            fll = alv.a(fll.Q0);
        }
        else {
            fll = null;
        }
        return fll;
    }
    
    public static void i(final int n) {
        final Object[] array = new Object[3];
        switch (n) {
            default: {
                array[0] = "a";
                break;
            }
            case 9: {
                array[0] = "typeProjection";
                break;
            }
            case 8: {
                array[0] = "type";
                break;
            }
            case 6:
            case 11: {
                array[0] = "supertype";
                break;
            }
            case 5:
            case 10: {
                array[0] = "subtype";
                break;
            }
            case 2:
            case 7: {
                array[0] = "typeCheckingProcedure";
                break;
            }
            case 1:
            case 4: {
                array[0] = "b";
                break;
            }
        }
        array[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (n) {
            default: {
                array[2] = "assertEqualTypes";
                break;
            }
            case 10:
            case 11: {
                array[2] = "noCorrespondingSupertype";
                break;
            }
            case 8:
            case 9: {
                array[2] = "capture";
                break;
            }
            case 5:
            case 6:
            case 7: {
                array[2] = "assertSubtype";
                break;
            }
            case 3:
            case 4: {
                array[2] = "assertEqualTypeConstructors";
                break;
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", array));
    }
    
    public static final List i0(final irj irj, final umb umb) {
        czd.f((Object)irj, "<this>");
        czd.f((Object)umb, "fqName");
        final ArrayList list = new ArrayList();
        E(irj, umb, list);
        return list;
    }
    
    public static final t72 j(final float n, final long n2) {
        return new t72(n, (fq2)new mlq(n2));
    }
    
    public static okh j0(final okh okh, final fx fx, float n, float n2, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            Objects.requireNonNull(m89.Companion);
            n = Float.NaN;
        }
        if ((n3 & 0x4) != 0x0) {
            Objects.requireNonNull(m89.Companion);
            n2 = Float.NaN;
        }
        czd.f((Object)fx, "alignmentLine");
        final wrd$a a = wrd.a;
        final wrd$a a2 = wrd.a;
        return (okh)new ix(fx, n, n2);
    }
    
    public static final long k(final float n, final float n2) {
        final long n3 = Float.floatToIntBits(n);
        final long n4 = Float.floatToIntBits(n2);
        final ouo$a companion = ouo.Companion;
        return (n4 & 0xFFFFFFFFL) | n3 << 32;
    }
    
    public static int k0(String s) {
        String h = s;
        if (s.charAt(0) != '#') {
            h = hmg.h("#", s);
        }
        if (h.length() != 4) {
            s = h;
            if (h.length() != 5) {
                return Color.parseColor(s);
            }
        }
        final StringBuilder j = fu8.j("#");
        j.append(h.charAt(1));
        j.append(h.charAt(1));
        j.append(h.charAt(2));
        j.append(h.charAt(2));
        j.append(h.charAt(3));
        j.append(h.charAt(3));
        s = j.toString();
        if (h.length() == 5) {
            final StringBuilder i = fu8.j(s);
            i.append(h.charAt(4));
            i.append(h.charAt(4));
            s = i.toString();
        }
        return Color.parseColor(s);
    }
    
    public static final umb l(final umb umb, final String s) {
        return umb.c(h6i.i(s));
    }
    
    public static final long l0(final String s) {
        czd.f((Object)s, "time");
        final Time time = new Time();
        time.parse3339(s);
        return time.toMillis(false);
    }
    
    public static final umb m(final vmb vmb, final String s) {
        final umb i = vmb.c(h6i.i(s)).i();
        czd.e((Object)i, "child(Name.identifier(name)).toSafe()");
        return i;
    }
    
    public static final fll m0(final xkl xkl, final alv alv) {
        czd.f((Object)xkl, "<this>");
        czd.f((Object)alv, "typeTable");
        fll fll;
        if (xkl.q()) {
            fll = xkl.M0;
        }
        else if (xkl.r()) {
            fll = alv.a(xkl.N0);
        }
        else {
            fll = null;
        }
        return fll;
    }
    
    public static final Object[] n(final Object[] array, final int n, final Object o, final Object o2) {
        final Object[] array2 = new Object[array.length + 2];
        bt0.A0(array, array2, 0, 0, n, 6);
        bt0.y0(array, array2, n + 2, n, array.length);
        array2[n] = o;
        array2[n + 1] = o2;
        return array2;
    }
    
    public static final Object n0(final Object o) {
        Object h = o;
        if (o instanceof c06) {
            h = b1n.h(((c06)o).a);
        }
        return h;
    }
    
    public static final Object[] o(final Object[] array, final int n) {
        final Object[] array2 = new Object[array.length - 2];
        bt0.A0(array, array2, 0, 0, n, 6);
        bt0.y0(array, array2, n, n + 2, array.length);
        return array2;
    }
    
    public static final void o0(final vba vba) {
        czd.f((Object)vba, "eventNamespace");
        cbw.b((elm)new af4(vba));
    }
    
    public static final Object[] p(final Object[] array, final int n) {
        final Object[] array2 = new Object[array.length - 1];
        bt0.A0(array, array2, 0, 0, n, 6);
        bt0.y0(array, array2, n, n + 1, array.length);
        return array2;
    }
    
    public static final void p0(final vba vba, final long n) {
        czd.f((Object)vba, "eventNamespace");
        cbw.b((elm)G(vba, n));
    }
    
    public static final void q(final List list, final Context context, final TipJarFields tipJarFields, final String s, final int n) {
        if (s.length() > 0) {
            list.add(new gct(tipJarFields, tipJarFields.getTitleResource(), n, tipJarFields.getUri(context, s)));
        }
    }
    
    public static final Object q0(final Object o, final nsb nsb) {
        czd.f((Object)nsb, "message");
        if (o != null) {
            return o;
        }
        throw new IllegalStateException(nsb.invoke().toString());
    }
    
    public static final fll r0(final xkl xkl, final alv alv) {
        czd.f((Object)xkl, "<this>");
        czd.f((Object)alv, "typeTable");
        fll fll;
        if (xkl.s()) {
            fll = xkl.J0;
            czd.e((Object)fll, "returnType");
        }
        else {
            if ((xkl.F0 & 0x10) != 0x10) {
                throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
            }
            fll = alv.a(xkl.K0);
        }
        return fll;
    }
    
    public static final void s(final Throwable t, final Throwable t2) {
        czd.f((Object)t, "<this>");
        czd.f((Object)t2, "exception");
        if (t != t2) {
            ohk.a.a(t, t2);
        }
    }
    
    public static final fll s0(final cll cll, final alv alv) {
        czd.f((Object)cll, "<this>");
        czd.f((Object)alv, "typeTable");
        fll fll;
        if (cll.s()) {
            fll = cll.J0;
            czd.e((Object)fll, "returnType");
        }
        else {
            if ((cll.F0 & 0x10) != 0x10) {
                throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
            }
            fll = alv.a(cll.K0);
        }
        return fll;
    }
    
    public static final void t(final Fragment fragment) {
        if (!(fragment instanceof nv8)) {
            return;
        }
        final Window window = ((nv8)fragment).b2().getWindow();
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
        final go3 go3 = new go3();
        ((nzt)go3).F0 = 300L;
        i0u.a((ViewGroup)o, (nzt)go3);
    }
    
    public static final Object t0(final Object o, final boolean b, final qsb qsb) {
        czd.f((Object)qsb, "block");
        Object invoke = o;
        if (b) {
            invoke = qsb.invoke(o);
        }
        return invoke;
    }
    
    public static final cy6 u(final xbm xbm, final vx6 vx6, final String s) {
        czd.f((Object)xbm, "<this>");
        czd.f((Object)vx6, "dispatcher");
        return sh4.y(sh4.b(xbm.v0((sx6)vx6)), (sx6)new ay6(s));
    }
    
    public static boolean u0(final bo6 bo6, final qpu qpu, final long n) {
        if (bo6.D0()) {
            if (dwu.g(bo6) && !bo6.k0()) {
                return false;
            }
            final mn4 y = blz.y(bo6);
            if (y != null) {
                final qum d1 = bo6.D0.D1;
                if (d1 != null && d1.b == y.b.D0) {
                    return false;
                }
            }
            if (n != bo6.L()) {
                return qpu.a(13) ^ true;
            }
            if (bo6.D0.F0 && !dwu.g(bo6)) {
                return qpu.a.contains(44) ^ true;
            }
        }
        return false;
    }
    
    public static final boolean v0(final List list) {
        boolean b;
        if (list.size() == 1) {
            b = asa.a((UserIdentifier)mq4.g0(list)).b("android_notifications_signals_enabled", false);
        }
        else {
            b = asa.d().b("android_notifications_signals_enable_multi_account", false);
        }
        return b;
    }
    
    public static int w(final long[] array, int n, final long n2) {
        --n;
        int i = 0;
        while (i <= n) {
            final int n3 = i + n >>> 1;
            final long n4 = lcmp(array[n3], n2);
            if (n4 < 0) {
                i = n3 + 1;
            }
            else {
                if (n4 <= 0) {
                    return n3;
                }
                n = n3 - 1;
            }
        }
        return ~i;
    }
    
    public static final String w0(final Throwable t) {
        czd.f((Object)t, "<this>");
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter);
        t.printStackTrace(printWriter);
        printWriter.flush();
        final String string = stringWriter.toString();
        czd.e((Object)string, "sw.toString()");
        return string;
    }
    
    public static final float x(long s, float n, final long n2, final long n3) {
        s = q3j.s(nq4.b(s, n), n3);
        n = q3j.S(q3j.s(n2, s)) + 0.05f;
        final float n4 = q3j.S(s) + 0.05f;
        return Math.max(n, n4) / Math.min(n, n4);
    }
    
    public static final long x0(final long n, final long n2) {
        final float d = ddq.d(n);
        final long a = ouo.a;
        final int n3 = 1;
        if (n2 == a) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        final float intBitsToFloat = Float.intBitsToFloat((int)(n2 >> 32));
        final float b = ddq.b(n);
        int n4;
        if (n2 != a) {
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        if (n4 != 0) {
            return oj7.d(intBitsToFloat * d, Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)) * b);
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
    
    public static final void y(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        throw new IndexOutOfBoundsException(zjf.h("index: ", n, ", size: ", n2));
    }
    
    public static final String y0(final char c, final Locale locale) {
        final String value = String.valueOf(c);
        czd.d((Object)value, "null cannot be cast to non-null type java.lang.String");
        String s = value.toUpperCase(locale);
        czd.e((Object)s, "this as java.lang.String).toUpperCase(locale)");
        if (s.length() > 1) {
            if (c != '\u0149') {
                final char char1 = s.charAt(0);
                final String substring = s.substring(1);
                czd.e((Object)substring, "this as java.lang.String).substring(startIndex)");
                final String lowerCase = substring.toLowerCase(Locale.ROOT);
                czd.e((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                final StringBuilder sb = new StringBuilder();
                sb.append(char1);
                sb.append(lowerCase);
                s = sb.toString();
            }
            return s;
        }
        final String value2 = String.valueOf(c);
        czd.d((Object)value2, "null cannot be cast to non-null type java.lang.String");
        final String upperCase = value2.toUpperCase(Locale.ROOT);
        czd.e((Object)upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (!czd.a((Object)s, (Object)upperCase)) {
            return s;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
    
    public static final void z(final int n, final int n2) {
        if (n >= 0 && n <= n2) {
            return;
        }
        throw new IndexOutOfBoundsException(zjf.h("index: ", n, ", size: ", n2));
    }
    
    public static final Long z0(final String s) {
        Long value = null;
        if (s != null) {
            final boolean b = s.length() > 0;
            value = value;
            if (b) {
                value = l0(s);
            }
        }
        return value;
    }
    
    public long L() {
        return System.currentTimeMillis();
    }
    
    public long N() {
        return SystemClock.elapsedRealtime();
    }
    
    public /* bridge */ Object a() {
        return new e9y();
    }
    
    public xh4 b() {
        return null;
    }
    
    public void c(final int n, final xh4 xh4) {
    }
    
    public void clear() {
    }
    
    public ubs d(final Object o) {
        final Bundle bundle = (Bundle)o;
        final int h = ylo.h;
        Object o2;
        if (bundle != null && ((BaseBundle)bundle).containsKey("google.messenger")) {
            o2 = ucs.e((Object)null);
        }
        else {
            o2 = ucs.e((BaseBundle)bundle);
        }
        return (ubs)o2;
    }
    
    public void e(final int n, final xh4 xh4) {
    }
    
    public xh4 f() {
        return null;
    }
    
    public boolean g(final int n) {
        return false;
    }
    
    public xh4 h(final int n) {
        return null;
    }
    
    public Object r(final y06 y06) {
        final qb4 qb4 = new qb4();
        qb4.b.add(new rsy((Object)qb4, (ReferenceQueue)qb4.a, (Set)qb4.b));
        final Thread thread = new Thread((Runnable)new uwz((Object)qb4.a, (Object)qb4.b, 3), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return qb4;
    }
    
    public boolean v(final ojv ojv, final ojv ojv2) {
        if (ojv == null) {
            i(3);
            throw null;
        }
        if (ojv2 != null) {
            return ojv.equals(ojv2);
        }
        i(4);
        throw null;
    }
}
