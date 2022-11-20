import android.content.DialogInterface$OnCancelListener;
import androidx.appcompat.app.e$a;
import android.app.Dialog;
import java.util.ArrayDeque;
import android.text.TextUtils;
import java.io.Closeable;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.ArrayList;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.HashSet;
import android.os.Trace;
import java.util.AbstractMap;
import android.content.DialogInterface$OnClickListener;
import androidx.fragment.app.p;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Objects;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.LinkedHashSet;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.reflect.InvocationTargetException;
import com.facebook.imagepipeline.nativecode.NativeCodeInitializer;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class rpb implements o4j, fzy
{
    public static mfk D0;
    public static volatile boolean E0;
    public static final rpb F0;
    
    static {
        F0 = new rpb();
    }
    
    public static final mfv A(u4t u4t) {
        final int a = c5j.a;
        if (!mfv.class.isInstance(u4t)) {
            u4t = null;
        }
        return (mfv)u4t;
    }
    
    public static final List B(final bse bse) {
        czd.f((Object)bse, "<this>");
        F(bse);
        final List k0 = bse.K0();
        return k0.subList((E(bse) ? 1 : 0) + j(bse), k0.size() - 1);
    }
    
    public static int C(final byte[] array) {
        if (array == null) {
            return 0;
        }
        int length = array.length;
        int n = length + 1;
        while (--length >= 0) {
            n = (n * 257 ^ array[length]);
        }
        return n;
    }
    
    public static void D(Context applicationContext, final o7d o7d, final pd9 pd9) {
        pqb.b();
        if (rpb.E0) {
            xli.F0((Class)rpb.class, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        }
        else {
            rpb.E0 = true;
        }
        ycs.F0 = true;
        synchronized (s9i.class) {
            final boolean b = s9i.D0 != null;
            monitorexit(s9i.class);
            Label_0181: {
                if (!b) {
                    pqb.b();
                    try {
                        try {
                            NativeCodeInitializer.class.getMethod("init", Context.class).invoke(null, applicationContext);
                        }
                        finally {}
                    }
                    catch (final NoSuchMethodException ex) {
                        s9i.q((t9i)new hli());
                    }
                    catch (final InvocationTargetException ex2) {
                        s9i.q((t9i)new hli());
                    }
                    catch (final IllegalAccessException ex3) {
                        s9i.q((t9i)new hli());
                    }
                    catch (final ClassNotFoundException ex4) {
                        s9i.q((t9i)new hli());
                    }
                    pqb.b();
                    break Label_0181;
                    pqb.b();
                }
            }
            applicationContext = applicationContext.getApplicationContext();
            Label_0240: {
                if (o7d == null) {
                    synchronized (r7d.class) {
                        pqb.b();
                        r7d.l((p7d)new o7d(new o7d.b(applicationContext)));
                        pqb.b();
                        break Label_0240;
                    }
                }
                r7d.l((p7d)o7d);
            }
            pqb.b();
            SimpleDraweeView.K0 = (dzr)(rpb.D0 = new mfk(applicationContext, pd9));
            pqb.b();
            pqb.b();
        }
    }
    
    public static final boolean E(final bse bse) {
        czd.f((Object)bse, "<this>");
        final boolean f = F(bse);
        boolean b = true;
        if (!f || bse.getAnnotations().O(g6r$a.q) == null) {
            b = false;
        }
        return b;
    }
    
    public static final boolean F(final bse bse) {
        czd.f((Object)bse, "<this>");
        final lb4 d = bse.M0().d();
        boolean b = true;
        if (d != null) {
            final aub r = r((hb8)d);
            if (r == aub.F0 || r == aub.G0) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static final boolean G(final bse bse) {
        czd.f((Object)bse, "<this>");
        return bse.P0() instanceof ho9;
    }
    
    public static final boolean H(final ta4 ta4) {
        final iy5 a = iy5.a;
        if (xp8.n((hb8)ta4)) {
            final LinkedHashSet b = iy5.b;
            final ya4 f = yp8.f((lb4)ta4);
            ya4 g;
            if (f != null) {
                g = f.g();
            }
            else {
                g = null;
            }
            if (mq4.Y((Iterable)b, (Object)g)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean I() {
        return asa.b().b("mixed_media_consumption_enabled", false);
    }
    
    public static boolean J() {
        return asa.b().b("mixed_media_creation_enabled", false);
    }
    
    public static boolean K() {
        return I() || J();
    }
    
    public static final boolean L(final b0r b0r) {
        return ((z0k)b0r).Q() || ((z0k)b0r).P();
    }
    
    public static final boolean M(final bse bse) {
        czd.f((Object)bse, "<this>");
        final lb4 d = bse.M0().d();
        aub r;
        if (d != null) {
            r = r((hb8)d);
        }
        else {
            r = null;
        }
        return r == aub.G0;
    }
    
    public static final Set N(final SerialDescriptor serialDescriptor) {
        czd.f((Object)serialDescriptor, "<this>");
        return uli.e(serialDescriptor);
    }
    
    public static final int O(int n) {
        if (n >= 0) {
            if (n < 3) {
                ++n;
            }
            else if (n < 1073741824) {
                n = (int)(n / 0.75f + 1.0f);
            }
            else {
                n = Integer.MAX_VALUE;
            }
        }
        return n;
    }
    
    public static final Map P(final lvj lvj) {
        czd.f((Object)lvj, "pair");
        final Map<Object, Object> singletonMap = Collections.singletonMap(lvj.D0, lvj.E0);
        czd.e((Object)singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }
    
    public static final l9k Q(final Object... array) {
        return ((vfq)npe.d0()).e((Collection)bt0.u0(array));
    }
    
    public static final s9k R() {
        Objects.requireNonNull(t9k.Companion);
        return (s9k)t9k.G0;
    }
    
    public static final rak S() {
        Objects.requireNonNull(gak.Companion);
        return (rak)gak.G0;
    }
    
    public static final void T(final wc6 wc6, final t19 t19) {
        czd.g((Object)wc6, "$this$plusAssign");
        czd.g((Object)t19, "disposable");
        wc6.a(t19);
    }
    
    public static long U(final AtomicLong atomicLong, final long n) {
        long value;
        long n2;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            final long n3 = n2 = value - n;
            if (n3 >= 0L) {
                continue;
            }
            eno.c((Throwable)new IllegalStateException(br.z("More produced than requested: ", n3)));
            n2 = 0L;
        } while (!atomicLong.compareAndSet(value, n2));
        return n2;
    }
    
    public static long V(final AtomicLong atomicLong, final long n) {
        long value;
        long n2;
        do {
            value = atomicLong.get();
            if (value == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            final long n3 = n2 = value - n;
            if (n3 >= 0L) {
                continue;
            }
            eno.c((Throwable)new IllegalStateException(br.z("More produced than requested: ", n3)));
            n2 = 0L;
        } while (!atomicLong.compareAndSet(value, n2));
        return n2;
    }
    
    public static uf4 W(final uf4 uf4, final jvg jvg) {
        final long length = jvg.a.length();
        final int ordinal = ((Enum)jvg.c).ordinal();
        n1h n1h;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    n1h = n1h.E0;
                }
                else {
                    n1h = n1h.H0;
                }
            }
            else {
                n1h = n1h.G0;
            }
        }
        else {
            n1h = n1h.F0;
        }
        Objects.requireNonNull(uf4);
        final q1h$a q1h$a = new q1h$a();
        q1h$a.a(q1h.N0, (Object)length);
        q1h$a.a(q1h.O0, (Object)n1h);
        q1h$a.a(q1h.P0, (Object)f0h.E0);
        q1h$a.a(q1h.Q0, (Object)uf4.k);
        if (q1h$a.a == null) {
            final StringBuilder j = fu8.j("Required field 'file_size' was not present! Struct: ");
            j.append(q1h$a.toString());
            throw new IllegalArgumentException(j.toString());
        }
        if (q1h$a.b == null) {
            final StringBuilder i = fu8.j("Required field 'type' was not present! Struct: ");
            i.append(q1h$a.toString());
            throw new IllegalArgumentException(i.toString());
        }
        if (q1h$a.c != null) {
            final Long a = q1h$a.a;
            final n1h b = q1h$a.b;
            final f0h c = q1h$a.c;
            final pcp d = q1h$a.d;
            final q1h k = new q1h();
            if (a != null) {
                k.D0 = a;
                k.H0.set(0, true);
            }
            if (b != null) {
                k.E0 = b;
            }
            if (c != null) {
                k.F0 = c;
            }
            if (d != null) {
                k.G0 = d;
            }
            uf4.j = k;
            return uf4;
        }
        final StringBuilder l = fu8.j("Required field 'source_type' was not present! Struct: ");
        l.append(q1h$a.toString());
        throw new IllegalArgumentException(l.toString());
    }
    
    public static final void X(final p p4, final xwn xwn, final vjo vjo, final String s) {
        czd.f((Object)p4, "fragmentManager");
        czd.f((Object)xwn, "roomRecordingDeleteDispatcher");
        czd.f((Object)vjo, "roomsScribeReporter");
        czd.f((Object)s, "roomId");
        final kjl$b kjl$b = new kjl$b(7);
        ((kjl$a)kjl$b).H(2131957296);
        ((kjl$a)kjl$b).A(2131957294);
        ((kjl$a)kjl$b).F(2131952374);
        ((kjl$a)kjl$b).C(2131957295);
        final jjl jjl = (jjl)((xk1$a)kjl$b).w();
        ((wk1)jjl).U1 = (xv8)new j0n(xwn, s, vjo);
        final int a = c5j.a;
        ((wk1)jjl).l2(p4);
    }
    
    public static final void Y(final Context context, final boolean b, final nnl nnl) {
        czd.f((Object)context, "context");
        czd.f((Object)nnl, "confirmSubject");
        int n;
        if (b) {
            n = 2131952797;
        }
        else {
            n = 2131952794;
        }
        int n2;
        if (b) {
            n2 = 2131952795;
        }
        else {
            n2 = 2131952792;
        }
        int n3;
        if (b) {
            n3 = 2131952796;
        }
        else {
            n3 = 2131952793;
        }
        final pmg pmg = new pmg(context, 0);
        pmg.s(n);
        pmg.m(n3);
        ((Dialog)pmg.n(2131952374, (DialogInterface$OnClickListener)sua.F0).p(n2, (DialogInterface$OnClickListener)new nr2((Object)nnl, 6)).create()).show();
    }
    
    public static final void Z(final Context context, final nnl nnl, final boolean b) {
        czd.f((Object)context, "context");
        czd.f((Object)nnl, "confirmationSubject");
        final pmg pmg = new pmg(context, 0);
        int n;
        if (b) {
            n = 2131952785;
        }
        else {
            n = 2131952782;
        }
        pmg.s(n);
        int n2;
        if (b) {
            n2 = 2131952784;
        }
        else {
            n2 = 2131952780;
        }
        pmg.m(n2);
        ((Dialog)pmg.n(2131955430, (DialogInterface$OnClickListener)ypk.F0).p(2131952783, (DialogInterface$OnClickListener)new ru2((Object)nnl, 1)).create()).show();
    }
    
    public static final void a0(final Context context, final String s, final nnl nnl) {
        czd.f((Object)s, "username");
        czd.f((Object)nnl, "confirmSubject");
        final pmg pmg = new pmg(context, 0);
        pmg.s(2131958423);
        ((e$a)pmg).a.g = context.getString(2131958422, new Object[] { s });
        final pmg n = pmg.p(2131958417, (DialogInterface$OnClickListener)new vf6((Object)nnl, 5)).n(2131952374, (DialogInterface$OnClickListener)k0n.D0);
        ((e$a)n).a.o = (DialogInterface$OnCancelListener)yod.E0;
        ((e$a)n).k();
    }
    
    public static long b(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, d(value, n)));
        return value;
    }
    
    public static final hdd b0(final Iterable iterable) {
        czd.f((Object)iterable, "<this>");
        hdd hdd;
        if (iterable instanceof hdd) {
            hdd = (hdd)iterable;
        }
        else {
            hdd = null;
        }
        Object e0 = hdd;
        if (hdd == null) {
            e0 = e0(iterable);
        }
        return (hdd)e0;
    }
    
    public static long c(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, d(value, n)));
        return value;
    }
    
    public static final ldd c0(final Map map) {
        czd.f((Object)map, "<this>");
        final boolean b = map instanceof ldd;
        final s9k s9k = null;
        ldd ldd;
        if (b) {
            ldd = (ldd)map;
        }
        else {
            ldd = null;
        }
        Object b2 = ldd;
        if (ldd == null) {
            s9k$a s9k$a;
            if (map instanceof s9k$a) {
                s9k$a = (s9k$a)map;
            }
            else {
                s9k$a = null;
            }
            s9k b3;
            if (s9k$a == null) {
                b3 = s9k;
            }
            else {
                b3 = s9k$a.b();
            }
            if (b3 == null) {
                final t9k t9k = (t9k)R();
                Objects.requireNonNull(t9k);
                final s9k$a f = t9k.f();
                ((AbstractMap)f).putAll(map);
                b2 = ((u9k)f).b();
            }
            else {
                b2 = b3;
            }
        }
        return (ldd)b2;
    }
    
    public static long d(long n, long n2) {
        n2 = (n += n2);
        if (n2 < 0L) {
            n = Long.MAX_VALUE;
        }
        return n;
    }
    
    public static final rdd d0(final Iterable iterable) {
        czd.f((Object)iterable, "<this>");
        final boolean b = iterable instanceof rdd;
        final rak rak = null;
        rdd rdd;
        if (b) {
            rdd = (rdd)iterable;
        }
        else {
            rdd = null;
        }
        Object o = rdd;
        if (rdd == null) {
            rak$a rak$a;
            if (iterable instanceof rak$a) {
                rak$a = (rak$a)iterable;
            }
            else {
                rak$a = null;
            }
            rak b2;
            if (rak$a == null) {
                b2 = rak;
            }
            else {
                b2 = rak$a.b();
            }
            if (b2 == null) {
                final rak s = S();
                czd.f((Object)s, "<this>");
                rak rak2;
                if (iterable instanceof Collection) {
                    rak2 = ((gak)s).e((Collection)iterable);
                }
                else {
                    final hak hak = new hak((gak)s);
                    kq4.N((Collection)hak, iterable);
                    rak2 = hak.b();
                }
                o = rak2;
            }
            else {
                o = b2;
            }
        }
        return (rdd)o;
    }
    
    public static final t19 e(final t19 t19, final wc6 wc6) {
        czd.g((Object)wc6, "compositeDisposable");
        wc6.a(t19);
        return t19;
    }
    
    public static final l9k e0(final Iterable iterable) {
        czd.f((Object)iterable, "<this>");
        final boolean b = iterable instanceof l9k;
        final l9k l9k = null;
        l9k l9k2;
        if (b) {
            l9k2 = (l9k)iterable;
        }
        else {
            l9k2 = null;
        }
        l9k l9k3 = l9k2;
        if (l9k2 == null) {
            l9k$a l9k$a;
            if (iterable instanceof l9k$a) {
                l9k$a = (l9k$a)iterable;
            }
            else {
                l9k$a = null;
            }
            l9k b2;
            if (l9k$a == null) {
                b2 = l9k;
            }
            else {
                b2 = l9k$a.b();
            }
            if (b2 == null) {
                final l9k d0 = npe.d0();
                czd.f((Object)d0, "<this>");
                l9k l9k4;
                if (iterable instanceof Collection) {
                    l9k4 = ((vfq)d0).e((Collection)iterable);
                }
                else {
                    final l9k$a k = ((vfq)d0).k();
                    kq4.N((Collection)k, iterable);
                    l9k4 = ((vak)k).b();
                }
                l9k3 = l9k4;
            }
            else {
                l9k3 = b2;
            }
        }
        return l9k3;
    }
    
    public static boolean f(final byte[] array, final byte[] array2) {
        if (array == array2) {
            return true;
        }
        if (array == null || array2 == null) {
            return false;
        }
        if (array.length != array2.length) {
            return false;
        }
        for (int i = 0; i != array.length; ++i) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static final Map f0(Map singletonMap) {
        czd.f((Object)singletonMap, "<this>");
        final Map.Entry<K, V> entry = singletonMap.entrySet().iterator().next();
        singletonMap = Collections.singletonMap((Object)entry.getKey(), entry.getValue());
        czd.e((Object)singletonMap, "with(entries.iterator().\u2026ingletonMap(key, value) }");
        return singletonMap;
    }
    
    public static final f9x g0(final Map map) {
        return (f9x)new t9x((o9x)new ojg(map, (qsb)q9x.D0));
    }
    
    public static byte[] h(final byte[] array) {
        final byte[] array2 = new byte[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        return array2;
    }
    
    public static final Object h0(Object o, String s, final nsb nsb) {
        czd.f(o, "tracedObject");
        if (jvt.a()) {
            final Class<?> class1 = o.getClass();
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(" ");
            sb.append(class1);
            if ((s = sb.toString()) == null) {
                s = o.getClass().toString();
                czd.e((Object)s, "tracedObject.javaClass.toString()");
            }
            final String o2 = alr.O0(s, 120);
            try {
                Trace.beginSection(o2);
                o = nsb.invoke();
                return o;
            }
            finally {
                Trace.endSection();
            }
        }
        o = nsb.invoke();
        return o;
    }
    
    public static final ese i(final ese ese, final HashSet set) {
        final nza k0 = nza.K0;
        final pjv i0 = k0.i0(ese);
        if (!set.add(i0)) {
            return null;
        }
        final hkv y = jb4$a.y(i0);
        ese l;
        if (y != null) {
            final ese v = jb4$a.v(y);
            final ese j = i(v, set);
            if (j == null) {
                final Object o = null;
                return (ese)o;
            }
            final boolean b = jb4$a.P(k0.i0(v)) || (v instanceof w9q && jb4$a.X((w9q)v));
            if (j instanceof w9q && jb4$a.X((w9q)j) && jb4$a.W(ese) && b) {
                final Object o = k0.y1(v);
                return (ese)o;
            }
            l = j;
            if (!jb4$a.W(j)) {
                if (jb4$a.S((jb4)k0, ese)) {
                    final Object o = k0.y1(j);
                    return (ese)o;
                }
                l = j;
            }
        }
        else {
            Object o = ese;
            if (!jb4$a.P(i0)) {
                return (ese)o;
            }
            final ese z = jb4$a.z(ese);
            if (z == null) {
                return null;
            }
            l = i(z, set);
            if (l == null) {
                return null;
            }
            if (jb4$a.W(ese)) {
                if (jb4$a.W(l)) {
                    o = ese;
                    return (ese)o;
                }
                if (l instanceof w9q && jb4$a.X((w9q)l)) {
                    o = ese;
                    return (ese)o;
                }
                o = k0.y1(l);
                return (ese)o;
            }
        }
        Object o = l;
        return (ese)o;
    }
    
    public static int i0(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return n;
        }
        String s;
        if (n >= 0) {
            if (n2 < 0) {
                throw new IllegalArgumentException(jxa.p(26, "negative size: ", n2));
            }
            s = q3j.j0("%s (%s) must be less than size (%s)", new Object[] { "index", n, n2 });
        }
        else {
            s = q3j.j0("%s (%s) must not be negative", new Object[] { "index", n });
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static final int j(final bse bse) {
        czd.f((Object)bse, "<this>");
        final gd0 o = bse.getAnnotations().O(g6r$a.r);
        if (o == null) {
            return 0;
        }
        final vh6 vh6 = (vh6)tkg.l0(o.f(), (Object)g6r.c);
        czd.d((Object)vh6, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number)((vh6)vh6).a).intValue();
    }
    
    public static void j0(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        String s;
        if (n >= 0 && n <= n3) {
            if (n2 >= 0 && n2 <= n3) {
                s = q3j.j0("end index (%s) must not be less than start index (%s)", new Object[] { n2, n });
            }
            else {
                s = k0(n2, n3, "end index");
            }
        }
        else {
            s = k0(n, n3, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static final long k(final long n, final sl9 sl9, final sl9 sl10) {
        czd.f((Object)sl9, "sourceUnit");
        czd.f((Object)sl10, "targetUnit");
        return sl10.D0.convert(n, sl9.D0);
    }
    
    public static String k0(final int n, final int n2, @NullableDecl final String s) {
        if (n < 0) {
            return q3j.j0("%s (%s) must not be negative", new Object[] { s, n });
        }
        if (n2 >= 0) {
            return q3j.j0("%s (%s) must not be greater than size (%s)", new Object[] { s, n, n2 });
        }
        throw new IllegalArgumentException(jxa.p(26, "negative size: ", n2));
    }
    
    public static final u9q l(final pre pre, td0 a, final bse bse, final List list, final List list2, final bse bse2, final boolean b) {
        final int size = list2.size();
        final int size2 = list.size();
        final int n = 0;
        int n2;
        if (bse != null) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final ArrayList list3 = new ArrayList(size2 + size + n2 + 1);
        final ArrayList<okv> list4 = new ArrayList<okv>(iq4.H((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list4.add(q3j.o((bse)iterator.next()));
        }
        list3.addAll((Collection)list4);
        okv o;
        if (bse != null) {
            o = q3j.o(bse);
        }
        else {
            o = null;
        }
        if (o != null) {
            list3.add((Object)o);
        }
        final Iterator iterator2 = list2.iterator();
        int n3 = 0;
        while (iterator2.hasNext()) {
            final Object next = iterator2.next();
            if (n3 < 0) {
                s9i.E();
                throw null;
            }
            list3.add((Object)q3j.o((bse)next));
            ++n3;
        }
        list3.add((Object)q3j.o(bse2));
        final int size3 = list2.size();
        final int size4 = list.size();
        int n4;
        if (bse == null) {
            n4 = n;
        }
        else {
            n4 = 1;
        }
        final int n5 = size4 + size3 + n4;
        ta4 ta4;
        if (b) {
            ta4 = pre.x(n5);
        }
        else {
            final h6i a2 = g6r.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Function");
            sb.append(n5);
            ta4 = pre.k(sb.toString());
        }
        czd.e((Object)ta4, "if (isSuspendFunction) b\u2026tFunction(parameterCount)");
        Object a3 = a;
        if (bse != null) {
            final umb q = g6r$a.q;
            if (a.f2(q)) {
                a3 = a;
            }
            else {
                a3 = td0.Companion.a(mq4.v0((Iterable)a, (Object)new bs2(pre, q, (Map)k2a.D0)));
            }
        }
        a = (td0)a3;
        if (list.isEmpty() ^ true) {
            final int size5 = list.size();
            final umb r = g6r$a.r;
            if (((td0)a3).f2(r)) {
                a = (td0)a3;
            }
            else {
                a = td0.Companion.a(mq4.v0((Iterable)a3, (Object)new bs2(pre, r, P(new lvj((Object)g6r.c, (Object)new ptd(size5))))));
            }
        }
        return dse.e(b1n.v(a), ta4, (List)list3);
    }
    
    public static final z3v m() {
        final f8v f0 = f8v.F0;
        final g8v f2 = g8v.F0;
        final e8v e8v = new e8v(f0, "I am a cat dad... believe it or not", s9i.r(new h8v(f2, Integer.valueOf(18), Integer.valueOf(35))), (List)null);
        final f8v e0 = f8v.E0;
        final g8v e2 = g8v.E0;
        final Integer value = 0;
        final e8v e8v2 = new e8v(e0, "Had to update it y'all!", s9i.r(new h8v(e2, value, Integer.valueOf(23))), (List)null);
        final e8v e8v3 = new e8v(e0, "I should probably update my LinkedIn about these new skills now.", (List)null, s9i.r(new d8v((b8v)new o8v("https://www.linkedin.com/in/perronjones"), Integer.valueOf(28), Integer.valueOf(36))));
        final Integer value2 = 13;
        final e8v e8v4 = new e8v(e0, "Scratch that. Probably won't do that.", s9i.s(new h8v(f2, value, value2), new h8v(g8v.G0, value, value2)), (List)null);
        final e8v e8v5 = new e8v(e0, "These are skills I perform in the morning.", (List)null, (List)null);
        final f8v h0 = f8v.H0;
        final e8v e8v6 = new e8v(h0, "Feeding them", (List)null, (List)null);
        final e8v e8v7 = new e8v(h0, "Medicating them", (List)null, (List)null);
        final e8v e8v8 = new e8v(h0, "Cleaning their Sh!t", (List)null, (List)null);
        final e8v e8v9 = new e8v(e0, "Things I'm highly jealous of", (List)null, (List)null);
        final f8v i0 = f8v.I0;
        final e8v e8v10 = new e8v(i0, "The dominance of someone cleaning your poop for minutes while you lay in front of them and sleep #CatsOfTwitter", s9i.r(new h8v(e2, Integer.valueOf(87), Integer.valueOf(96))), s9i.r(new d8v((b8v)new b4v("CatsOfTwitter"), Integer.valueOf(97), Integer.valueOf(111))));
        final e8v e8v11 = new e8v(i0, "That's about it", (List)null, (List)null);
        final e8v e8v12 = new e8v(e0, "I make so many trips to Petco, I should probably invest in some $WOOF.", (List)null, s9i.r(new d8v((b8v)new a8v("WOOF"), Integer.valueOf(64), Integer.valueOf(69))));
        final e8v e8v13 = new e8v(e0, "But for now... I'll just \ud83e\udd23 at @CatsVideosDaily", (List)null, s9i.r(new d8v((b8v)new p8v(Long.valueOf(3029926678L)), Integer.valueOf(31), Integer.valueOf(47))));
        final a5v f3 = a5v.F0;
        final z4v z4v = new z4v(f3, s9i.r(new j8v(Long.valueOf(149920883845L))));
        final z4v z4v2 = new z4v(f3, s9i.r(new j8v(Long.valueOf(1566746966586839042L))));
        final z4v z4v3 = new z4v(f3, s9i.r(new j8v(Long.valueOf(1567262158295076866L))));
        final f8v g0 = f8v.G0;
        final e8v e8v14 = new e8v(g0, "Fun Stuff to look at", (List)null, (List)null);
        final e8v e8v15 = new e8v(g0, "Mine", (List)null, (List)null);
        final a5v e3 = a5v.E0;
        final dtg.a a = new dtg.a();
        a.g = 1546973841607610371L;
        final fwg.a companion = fwg.Companion;
        a.B = companion.a("7_1546973841607610371");
        a.D = new frg("Available", null, null);
        a.A = false;
        a.q = null;
        a.l = dtg.c.H0;
        a.o = new i2h(1.78f, 14.768f, s9i.s(new j2h("https://video.twimg.com/ext_tw_video/1546973841607610371/pu/vid/1280x720/Y52B84zIS_M5ISkw.mp4?tag=12", "video/mp4", 2176000), new j2h("https://video.twimg.com/ext_tw_video/1546973841607610371/pu/pl/ozmoDYzGYwu40j0F.m3u8?tag=12&container=fmp4", "application/x-mpegURL", 0), new j2h("https://video.twimg.com/ext_tw_video/1546973841607610371/pu/vid/480x270/fPIXExk_FvmX76IA.mp4?tag=12", "video/mp4", 256000), new j2h("https://video.twimg.com/ext_tw_video/1546973841607610371/pu/vid/640x360/JfLrpyo9aEm0R2aA.mp4?tag=12", "video/mp4", 832000)));
        a.w = "Test Video";
        a.j = "https://pbs.twimg.com/ext_tw_video_thumb/1546973841607610371/pu/img/GFzHvrjzVhs171k3.jpg";
        final edq$a companion2 = edq.Companion;
        a.m = companion2.b(1920, 1080);
        final z4v z4v4 = new z4v(e3, s9i.r(new s4v((dtg)((n4j)a).e())));
        final e8v e8v16 = new e8v(g0, "Not Mine", (List)null, (List)null);
        final dtg.a a2 = new dtg.a();
        a2.g = 1506323550545887236L;
        a2.B = companion.a("3_1506323550545887236");
        a2.D = new frg("Available", null, null);
        final dtg.c f4 = dtg.c.F0;
        a2.l = f4;
        a2.w = "Test Image";
        a2.j = "https://pbs.twimg.com/media/FOeJSdMXwAQY1bc.jpg";
        a2.m = companion2.b(1000, 667);
        final z4v z4v5 = new z4v(e3, s9i.r(new s4v((dtg)((n4j)a2).e())));
        final dtg.a a3 = new dtg.a();
        a3.g = 1506323550545887237L;
        a3.B = companion.a("3_1506323550545887236");
        a3.D = new frg("Available", null, null);
        a3.l = f4;
        a3.j = "https://pbs.twimg.com/media/FOe1bc.jpg";
        a3.m = companion2.b(1000, 667);
        final z4v z4v6 = new z4v(e3, s9i.r(new s4v((dtg)((n4j)a3).e())));
        final dtg.a a4 = new dtg.a();
        a4.g = 1506323647723679745L;
        a4.B = companion.a("16_1506323647723679745");
        a4.D = new frg("Available", null, null);
        a4.A = false;
        a4.q = null;
        a4.l = dtg.c.G0;
        a4.o = new i2h(1.0f, 3.0f, s9i.r(new j2h("https://video.twimg.com/tweet_video/FOeJYHNXMAEussh.mp4", "video/mp4", 0)));
        a4.w = "Test GIF";
        a4.j = "https://pbs.twimg.com/tweet_video_thumb/FOeJYHNXMAEussh.jpg";
        a4.m = companion2.b(498, 498);
        return new z3v(s9i.s((x7v)e8v, (x7v)e8v2, (x7v)e8v3, (x7v)e8v4, (x7v)e8v5, (x7v)e8v6, (x7v)e8v7, (x7v)e8v8, (x7v)e8v9, (x7v)e8v10, (x7v)e8v11, (x7v)e8v12, (x7v)e8v13, (x7v)z4v, (x7v)e8v14, (x7v)e8v15, (x7v)z4v2, (x7v)z4v3, (x7v)z4v4, (x7v)e8v16, (x7v)z4v5, (x7v)z4v6, (x7v)new z4v(e3, s9i.r(new s4v((dtg)((n4j)a4).e())))), (String)null, Integer.valueOf(250));
    }
    
    public static final u6b n(final x66 x66) {
        x66.x(380403812);
        final float n = 6;
        final float n2 = 12;
        final float n3 = 8;
        final float n4 = 8;
        final n96$b a = n96.a;
        final m89 m89 = new m89(n);
        int i = 0;
        final m89 m90 = new m89(n2);
        final m89 m91 = new m89(n3);
        final m89 m92 = new m89(n4);
        x66.x(-568225417);
        boolean b = false;
        while (i < 4) {
            b |= x66.P((new Object[] { m89, m90, m91, m92 })[i]);
            ++i;
        }
        final Object y = x66.y();
        xg8 xg8 = null;
        Label_0191: {
            if (!b) {
                Objects.requireNonNull(x66.Companion);
                if ((xg8 = (xg8)y) != x66$a.b) {
                    break Label_0191;
                }
            }
            xg8 = new xg8(n, n2, n3, n4);
            x66.p((Object)xg8);
        }
        x66.O();
        final xg8 xg9 = xg8;
        final n96$b a2 = n96.a;
        x66.O();
        return (u6b)xg9;
    }
    
    public static final h6i o(final bse bse) {
        final gd0 o = bse.getAnnotations().O(g6r$a.s);
        if (o == null) {
            return null;
        }
        final Object c0 = mq4.C0((Iterable)o.f().values());
        Object o2;
        if (c0 instanceof kkr) {
            o2 = c0;
        }
        else {
            o2 = null;
        }
        if (o2 != null) {
            String s = (String)((vh6)o2).a;
            if (s != null) {
                if (!h6i.j(s)) {
                    s = null;
                }
                if (s != null) {
                    return h6i.i(s);
                }
            }
        }
        return null;
    }
    
    public static Double p(final String s, final p68 p2) {
        Double value = null;
        try {
            final String s2 = (String)p2.d(s, (Class)String.class);
            if (s2 != null) {
                value = Double.valueOf(s2);
            }
            return value;
        }
        catch (final NumberFormatException ex) {
            m8a.d((Throwable)ex);
        }
        catch (final ClassCastException ex2) {
            try {
                return (Double)p2.d(s, (Class)Double.class);
            }
            catch (final ClassCastException ex3) {
                m8a.d((Throwable)ex3);
            }
        }
        return null;
    }
    
    public static final List q(final bse bse) {
        czd.f((Object)bse, "<this>");
        F(bse);
        final int j = j(bse);
        Object d0;
        if (j == 0) {
            d0 = f2a.D0;
        }
        else {
            final List subList = bse.K0().subList(0, j);
            d0 = new ArrayList<bse>(iq4.H((Iterable)subList, 10));
            final Iterator iterator = subList.iterator();
            while (iterator.hasNext()) {
                final bse type = ((okv)iterator.next()).getType();
                czd.e((Object)type, "it.type");
                ((Collection<bse>)d0).add(type);
            }
        }
        return (List)d0;
    }
    
    public static final aub r(final hb8 hb8) {
        final boolean b = hb8 instanceof ta4;
        final aub aub = null;
        if (!b) {
            return null;
        }
        if (!pre.O(hb8)) {
            return null;
        }
        final vmb h = yp8.h(hb8);
        aub a = aub;
        if (h.f()) {
            if (h.e()) {
                a = aub;
            }
            else {
                final aub$a companion = aub.Companion;
                final String e = h.h().e();
                czd.e((Object)e, "shortName().asString()");
                final umb e2 = h.i().e();
                czd.e((Object)e2, "toSafe().parent()");
                Objects.requireNonNull(companion);
                final aub$a$a a2 = companion.a(e, e2);
                a = aub;
                if (a2 != null) {
                    a = a2.a;
                }
            }
        }
        return a;
    }
    
    public static final long s(final vf3 vf3) {
        czd.f((Object)vf3, "<this>");
        Objects.requireNonNull(jv9.Companion);
        return ((jv9)nfw.Companion.a().c((Class)jv9.class)).O1().d(vf3);
    }
    
    public static int t() {
        final ofv b = sfv.b;
        return b.b - b.f - 1;
    }
    
    public static CharSequence u(final Context context, final List list, final int n, final int n2) {
        final UserIdentifier current = UserIdentifier.getCurrent();
        final Resources resources = context.getResources();
        if (list.isEmpty()) {
            return "";
        }
        String s;
        if (list.size() == 1) {
            final u0h u0h = list.get(0);
            int n3;
            if (current.hasId(u0h.a)) {
                n3 = 2131954992;
            }
            else {
                n3 = 2131954990;
            }
            s = resources.getString(n3, new Object[] { u0h.b });
        }
        else {
            final u0h d = e1h.d(list, current);
            if (list.size() == 2) {
                int n4;
                int n5;
                int n6;
                if (d != null) {
                    n4 = ((current.hasId(list.get(0).a) ^ true) ? 1 : 0);
                    n5 = (n4 ^ 0x1);
                    n6 = 2131954994;
                }
                else {
                    n6 = 2131954989;
                    n4 = 0;
                    n5 = 1;
                }
                s = resources.getString(n6, new Object[] { list.get(n4).b, list.get(n5).b });
            }
            else {
                String s2;
                int n7;
                if (d != null) {
                    s2 = d.b;
                    n7 = 2131954993;
                }
                else {
                    s2 = list.get(0).b;
                    n7 = 2131954986;
                }
                s = resources.getString(n7, new Object[] { s2, list.size() - 1 });
            }
        }
        Object append = s;
        if (n != 0) {
            append = new SpannableStringBuilder((CharSequence)"  ").append((CharSequence)s);
            final Object a = kn6.a;
            final Drawable b = kn6.c.b(context, n);
            if (b != null) {
                fd9.b(b, resources.getDimensionPixelSize(2131165846), n2);
            }
            ((SpannableStringBuilder)append).setSpan((Object)new ImageSpan(b, 1), 0, 1, 18);
        }
        return (CharSequence)append;
    }
    
    public static final xq7 v(mih e, final long n) {
        czd.f((Object)e, "<this>");
        e = (mih)e.e((Class)kr6.class, "entry_id", (Iterable)s9i.b(n), (Class)qr6.class);
        try {
            final ArrayList list = new ArrayList();
            for (final Object next : e) {
                if (next instanceof xq7) {
                    list.add(next);
                }
            }
            return (xq7)mq4.i0((List)list);
        }
        finally {
            h1e.Companion.b((Closeable)e);
        }
    }
    
    public static final bse w(final bse bse) {
        czd.f((Object)bse, "<this>");
        F(bse);
        if (bse.getAnnotations().O(g6r$a.q) == null) {
            return null;
        }
        return bse.K0().get(j(bse)).getType();
    }
    
    public static final bse x(bse type) {
        czd.f((Object)type, "<this>");
        F(type);
        type = ((okv)mq4.o0(type.K0())).getType();
        czd.e((Object)type, "arguments.last().type");
        return type;
    }
    
    public static final klt y(u4t u4t) {
        final int a = c5j.a;
        if (!klt.class.isInstance(u4t)) {
            u4t = null;
        }
        return (klt)u4t;
    }
    
    public static String z(final Resources resources, final String s, final String s2) {
        String string;
        if (TextUtils.isEmpty((CharSequence)s)) {
            string = "";
        }
        else {
            final int t = t();
            string = s;
            if (sfv.a(s).a > t) {
                final String string2 = resources.getString(2131956329);
                final int a = sfv.a(string2).a;
                final StringBuilder sb = new StringBuilder();
                sb.append(s.substring(0, t - a));
                sb.append(string2);
                string = sb.toString();
            }
        }
        return da8.j(string, " ", s2);
    }
    
    public Object a() {
        final qzy c = uzy.c;
        return hvz.E0.b().a();
    }
    
    @Override
    public Object g() {
        return new ArrayDeque();
    }
}
