import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import java.util.HashSet;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import java.util.Locale;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Collection;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import android.text.TextUtils;
import android.os.Looper;
import android.os.Handler;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import java.util.concurrent.CancellationException;
import java.util.Objects;
import android.content.Context;
import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eli implements e73, fzy
{
    public static eli D0;
    public static final int[] E0;
    public static final long[] F0;
    public static final Object[] G0;
    public static final eli H0;
    
    static {
        E0 = new int[0];
        F0 = new long[0];
        G0 = new Object[0];
        H0 = new eli();
    }
    
    public static final UserIdentifier A(final o2t o2t) {
        czd.f((Object)o2t, "<this>");
        return UserIdentifier.Companion.a(o2t.a.a.c);
    }
    
    public static final UserIdentifier B(final o2t o2t) {
        czd.f((Object)o2t, "<this>");
        final UserIdentifier f = o2t.f;
        czd.e((Object)f, "owner");
        return f;
    }
    
    public static final vav C(final o2t o2t) {
        czd.f((Object)o2t, "<this>");
        final vav c2 = vav.c2(o2t.f);
        czd.e((Object)c2, "get(owner)");
        return c2;
    }
    
    public static final Object D(final xoi xoi, final coe coe) {
        czd.f((Object)xoi, "<this>");
        czd.f((Object)coe, "p");
        return ((nsb)xoi).invoke();
    }
    
    public static int E(int n) {
        final int n2 = n * 4;
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
        return n3 / 4;
    }
    
    public static int F(int n) {
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
    
    public static final boolean G() {
        return asa.b().b("view_counts_everywhere_api_enabled", false);
    }
    
    public static final boolean H() {
        return asa.b().b("view_counts_author_visibility_enabled", false);
    }
    
    public static final boolean I(final ta4 ta4) {
        czd.f((Object)ta4, "<this>");
        return ta4.r() == ygh.D0 && ta4.i() != za4.F0;
    }
    
    public static final boolean J(final dkl dkl) {
        czd.f((Object)dkl, "<this>");
        return dkl.f() == null;
    }
    
    public static final boolean K() {
        return asa.b().b("view_counts_public_visibility_enabled", false);
    }
    
    public static final agq L(final Iterable iterable) {
        final agq agq = new agq();
        for (final Object next : iterable) {
            final j3h j3h = (j3h)next;
            if (j3h != null && j3h != j3h$b.a) {
                agq.add(next);
            }
        }
        return agq;
    }
    
    public static final vqj M(final x66 x66) {
        x66.x(1809802212);
        final n96$b a = n96.a;
        final z40$a a2 = z40.a;
        x66.x(-81138291);
        final Context context = (Context)x66.m((wd6)z20.b);
        final tqj tqj = (tqj)x66.m((wd6)uqj.a);
        x66.x(511388516);
        final boolean p = x66.P((Object)context);
        final boolean p2 = x66.P((Object)tqj);
        final Object y = x66.y();
        Object a3 = null;
        Label_0141: {
            if (!(p | p2)) {
                Objects.requireNonNull(x66.Companion);
                if ((a3 = y) != x66$a.b) {
                    break Label_0141;
                }
            }
            if (tqj != null) {
                a3 = new r30(context, tqj);
            }
            else {
                a3 = z40.a;
            }
            x66.p(a3);
        }
        x66.O();
        final vqj vqj = (vqj)a3;
        x66.O();
        x66.O();
        return vqj;
    }
    
    public static final m8r N(final nsb nsb, final nsb nsb2, final nsb nsb3, final x66 x66) {
        czd.f((Object)nsb, "firstVisibleItemIndex");
        czd.f((Object)nsb2, "slidingWindowSize");
        czd.f((Object)nsb3, "extraItemCount");
        x66.x(429733345);
        final n96$b a = n96.a;
        x66.x(1618982084);
        final boolean p4 = x66.P((Object)nsb);
        final boolean p5 = x66.P((Object)nsb2);
        final boolean p6 = x66.P((Object)nsb3);
        Object o = x66.y();
        int i = 0;
        Label_0224: {
            if (!(p4 | p5 | p6)) {
                Objects.requireNonNull(x66.Companion);
                final puh q;
                if ((q = (puh)o) != x66$a.b) {
                    break Label_0224;
                }
            }
            o = thq.Companion.a();
            try {
                Object j = ((thq)o).i();
                try {
                    final int intValue = ((Number)nsb.invoke()).intValue();
                    final int intValue2 = ((Number)nsb2.invoke()).intValue();
                    final int intValue3 = ((Number)nsb3.invoke()).intValue();
                    final int n = intValue / intValue2 * intValue2;
                    final puh q = blz.Q(rrz.R(Math.max(n - intValue3, 0), n + intValue2 + intValue3));
                    ((thq)o).p((thq)j);
                    ((thq)o).c();
                    x66.p((Object)q);
                    x66.O();
                    j = q;
                    x66.x(-568225417);
                    boolean b = false;
                    while (i < 4) {
                        b |= x66.P((new Object[] { nsb, nsb2, nsb3, j })[i]);
                        ++i;
                    }
                    o = x66.y();
                    Object o2 = null;
                    Label_0351: {
                        if (!b) {
                            Objects.requireNonNull(x66.Companion);
                            if ((o2 = o) != x66$a.b) {
                                break Label_0351;
                            }
                        }
                        o2 = new c2f(nsb, nsb2, nsb3, (puh)j, (go6)null);
                        x66.p(o2);
                    }
                    x66.O();
                    npe.e(j, (ftb)o2, x66);
                    final n96$b a2 = n96.a;
                    x66.O();
                    return (m8r)j;
                }
                finally {
                    ((thq)o).p((thq)j);
                }
            }
            finally {
                ((thq)o).c();
            }
        }
    }
    
    public static final void O(final Object[] array, final int n) {
        czd.f((Object)array, "<this>");
        array[n] = null;
    }
    
    public static final void P(final Object[] array, int i, final int n) {
        czd.f((Object)array, "<this>");
        while (i < n) {
            array[i] = null;
            ++i;
        }
    }
    
    public static final boolean Q(final fve fve, final ooj ooj, final boolean b) {
        czd.f((Object)fve, "layoutDirection");
        boolean b2 = true;
        final boolean b3 = b ^ true;
        if (fve != fve.E0) {
            b2 = false;
        }
        boolean b4 = b3;
        if (b2) {
            b4 = b3;
            if (ooj != ooj.D0) {
                b4 = (b3 ^ true);
            }
        }
        return b4;
    }
    
    public static int R(final int n) {
        return 1 << 32 - Integer.numberOfLeadingZeros(n - 1);
    }
    
    public static final CancellationException b(final String s, final Throwable t) {
        final CancellationException ex = new CancellationException(s);
        ex.initCause(t);
        return ex;
    }
    
    public static final void c(final e7b d0, final Object o, final go6 go6) {
        e8b e8b2 = null;
        Label_0052: {
            if (go6 instanceof e8b) {
                final e8b e8b = (e8b)go6;
                final int f0 = e8b.F0;
                if ((f0 & Integer.MIN_VALUE) != 0x0) {
                    e8b.F0 = f0 + Integer.MIN_VALUE;
                    e8b2 = e8b;
                    break Label_0052;
                }
            }
            e8b2 = new e8b(go6);
        }
        final Object e0 = e8b2.E0;
        final dy6 d2 = dy6.D0;
        final int f2 = e8b2.F0;
        e7b d3;
        if (f2 != 0) {
            if (f2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d3 = e8b2.D0;
            b1n.u(e0);
        }
        else {
            b1n.u(e0);
            e8b2.D0 = d0;
            e8b2.F0 = 1;
            d3 = d0;
            if (d0.a(o, (go6)e8b2) == d2) {
                return;
            }
        }
        throw new AbortFlowException(d3);
    }
    
    public static final c6m d(final lo8 lo8, int s, final czt czt, final yis yis, final boolean b, final int n) {
        c6m c6m;
        if (yis != null) {
            c6m = yis.c(czt.b.b(s));
        }
        else {
            Objects.requireNonNull(c6m.Companion);
            c6m = c6m.e;
        }
        s = lo8.S(yfs.b);
        float a;
        if (b) {
            a = n - c6m.a - s;
        }
        else {
            a = c6m.a;
        }
        float n2;
        if (b) {
            n2 = n - c6m.a;
        }
        else {
            n2 = s + c6m.a;
        }
        return new c6m(a, c6m.b, n2, c6m.d);
    }
    
    public static final Object[] e(final int n) {
        if (n >= 0) {
            return new Object[n];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
    
    public static int f(final int[] array, int n, final int n2) {
        --n;
        int i = 0;
        while (i <= n) {
            final int n3 = i + n >>> 1;
            final int n4 = array[n3];
            if (n4 < n2) {
                i = n3 + 1;
            }
            else {
                if (n4 <= n2) {
                    return n3;
                }
                n = n3 - 1;
            }
        }
        return ~i;
    }
    
    public static int g(final long[] array, int n, final long n2) {
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
    
    public static void h(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void i(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(o));
    }
    
    public static void j(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.format(s, array));
    }
    
    public static void k(final Handler handler) {
        final Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name;
            if (myLooper != null) {
                name = myLooper.getThread().getName();
            }
            else {
                name = "null current looper";
            }
            final String name2 = handler.getLooper().getThread().getName();
            final StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            nb0.z(sb, "Must be called on ", name2, " thread, but got ", name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static void l(final Handler handler, final String s) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static void m(final String s) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    @EnsuresNonNull({ "#1" })
    public static String n(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }
    
    @EnsuresNonNull({ "#1" })
    public static String o(final String s, final Object o) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        throw new IllegalArgumentException(String.valueOf(o));
    }
    
    public static void p(final String s) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    @EnsuresNonNull({ "#1" })
    public static Object q(final Object o) {
        Objects.requireNonNull(o, "null reference");
        return o;
    }
    
    @EnsuresNonNull({ "#1" })
    public static Object r(final Object o, final Object o2) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(String.valueOf(o2));
    }
    
    public static void s(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void t(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(o));
    }
    
    public static final Collection u(final Collection collection, final Collection collection2) {
        czd.f((Object)collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet)collection).addAll(collection2);
            return collection;
        }
        final LinkedHashSet set = new LinkedHashSet(collection);
        set.addAll(collection2);
        return set;
    }
    
    public static final Object[] v(Object[] copy, final int n) {
        czd.f((Object)copy, "<this>");
        copy = Arrays.copyOf(copy, n);
        czd.e((Object)copy, "copyOf(this, newSize)");
        return copy;
    }
    
    public static CharSequence w(final krm krm, String s, String s2, final String s3, int length) {
        final HashSet a = v0u.a;
        if (!ikr.e((CharSequence)s) && !ikr.e((CharSequence)s2)) {
            final String[] split = s.split("-");
            Locale locale;
            if (split.length > 1) {
                locale = new Locale(split[0], split[1]);
            }
            else {
                locale = new Locale(s);
            }
            s = locale.getDisplayLanguage(new Locale(s2));
        }
        else {
            s = "";
        }
        final a91 e0 = a91.E0;
        if (s3.equals("Ms")) {
            s2 = "Microsoft";
        }
        else {
            s2 = "Google";
        }
        final Resources b = krm.b;
        s = b.getString(length, new Object[] { s, s2 });
        final int index = s.indexOf(s2);
        length = s2.length();
        Drawable drawable;
        if (s3.equals("Ms")) {
            drawable = krm.j(2131232249);
        }
        else {
            drawable = krm.j(2131232123);
        }
        fd9.b(drawable, b.getDimensionPixelSize(2131167654), 0);
        final ImageSpan imageSpan = new ImageSpan(drawable, 0);
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        spannableString.setSpan((Object)imageSpan, index, length + index, 33);
        return (CharSequence)spannableString;
    }
    
    public static final obi x(final x66 x66) {
        final n96$b a = n96.a;
        obi h;
        if (x66.m((wd6)xrd.a)) {
            h = (obi)sdv.a.getValue();
        }
        else {
            h = ((pbi)d5p.a(x66).z0((Class)pbi.class)).h();
        }
        return h;
    }
    
    public static String y(final Resources resources, final String s) {
        return resources.getString(2131955987, new Object[] { s });
    }
    
    public static String z(final Resources resources) {
        return resources.getString(2131955996);
    }
    
    public Object a() {
        final qzy c = uzy.c;
        return (int)tsz.E0.b().g();
    }
}
