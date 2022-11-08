import java.util.concurrent.Executors;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.io.IOException;
import android.graphics.Color;
import com.twitter.weaver.base.WeaverException;
import com.twitter.util.user.UserIdentifier;
import android.content.res.Resources;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;
import android.view.View$OnAttachStateChangeListener;
import java.util.List;
import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drz implements aow, nyt
{
    public static final drz C0;
    public static final ap6[] D0;
    public static final elk E0;
    public static final flk F0;
    public static final pm3 G0;
    public static final hlk H0;
    public static final glk I0;
    public static final pm3 J0;
    public static final mlk K0;
    public static final klk L0;
    public static final llk M0;
    public static final dlk N0;
    public static final clk O0;
    public static final dlk P0;
    public static final rlk Q0;
    public static final qlk R0;
    public static final nlk S0;
    public static final alk T0;
    public static final blk U0;
    public static final ilk V0;
    public static final jlk W0;
    public static final pm3 X0;
    public static final int[] Y0;
    public static final int[] Z0;
    
    public static final ksd a(final View view, final rtb rtb) {
        zzd.f((Object)view, "<this>");
        zzd.f((Object)rtb, "build");
        final osd osd = new osd();
        rtb.invoke((Object)osd);
        final ksd$a a = osd.a;
        Objects.requireNonNull(a);
        final m5q a2 = a.a;
        final m5q b = a.b;
        final int c = a.c;
        final ksd ksd = new ksd(a2, b, c, (List)a.d);
        final Object tag = view.getTag(2131429619);
        pax pax;
        if (tag instanceof pax) {
            pax = (pax)tag;
        }
        else {
            pax = null;
        }
        if (pax == null) {
            pax = new pax(view);
            view.setTag(2131429619, (Object)pax);
        }
        final jsd jsd = new jsd(ksd, pax);
        final WeakHashMap a3 = p5x.a;
        p5x$i.u(view, (ogj)jsd);
        if (c != 0) {
            p5x.E(view, (uox$b)new msd(ksd, view));
        }
        view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new lsd());
        if (p5x$g.b(view)) {
            p5x$h.c(view);
        }
        return ksd;
    }
    
    public static final Class b(final View view, final int n, final rtb rtb) {
        final Object p3 = p(view, n, true);
        Class clazz;
        if (p3 instanceof Class) {
            clazz = (Class)p3;
        }
        else if (p3 instanceof String) {
            Object f0 = null;
            try {
                Class.forName((String)p3);
            }
            finally {
                final Throwable t;
                f0 = kq9.F0(t);
            }
            final Throwable a = wrm.a(f0);
            if (a != null) {
                throw new IllegalStateException((String)rtb.invoke(p3), a);
            }
            clazz = (Class)f0;
        }
        else {
            clazz = null;
        }
        return clazz;
    }
    
    public static final List c(final Collection collection, final Collection collection2, final q93 q93) {
        zzd.f((Object)collection2, "oldValueParameters");
        zzd.f((Object)q93, "newOwner");
        collection.size();
        collection2.size();
        final List u2 = or4.u2((Iterable)collection, (Iterable)collection2);
        final ArrayList list = new ArrayList<znw>(kr4.h1((Iterable)u2, 10));
        for (final gvj gvj : (ArrayList)u2) {
            final qse qse = (qse)gvj.C0;
            final ynw ynw = (ynw)gvj.D0;
            final int index = ynw.getIndex();
            final xd0 annotations = ((yc0)ynw).getAnnotations();
            final f6i name = ((wb8)ynw).getName();
            zzd.e((Object)name, "oldParameter.name");
            final boolean z0 = ynw.z0();
            final boolean r0 = ynw.r0();
            final boolean q94 = ynw.q0();
            qse g;
            if (ynw.u0() != null) {
                g = qq8.j((wb8)q93).l().g(qse);
            }
            else {
                g = null;
            }
            final blq m = ((bc8)ynw).m();
            zzd.e((Object)m, "oldParameter.source");
            list.add(new znw(q93, (ynw)null, index, annotations, name, qse, z0, r0, q94, g, m));
        }
        return list;
    }
    
    public static final String f(final f5x f5x) {
        zzd.f((Object)f5x, "<this>");
        return rp2.N(f5x.a.getCanonicalName(), f5x.b);
    }
    
    public static String g(final byte[] array) {
        final int length = array.length;
        final char[] array2 = new char[length];
        for (int i = 0; i != length; ++i) {
            array2[i] = (char)(array[i] & 0xFF);
        }
        return new String(array2);
    }
    
    public static final KClass h(final SerialDescriptor serialDescriptor) {
        zzd.f((Object)serialDescriptor, "<this>");
        KClass kClass;
        if (serialDescriptor instanceof fo6) {
            kClass = ((fo6)serialDescriptor).b;
        }
        else if (serialDescriptor instanceof bkp) {
            kClass = h(((bkp)serialDescriptor).a);
        }
        else {
            kClass = null;
        }
        return kClass;
    }
    
    public static final wze i(final pb4 pb4) {
        zzd.f((Object)pb4, "<this>");
        final int a = qq8.a;
        final Iterator iterator = ((qse)pb4.p()).M0().a().iterator();
        wze wze;
        pb4 pb5;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            wze = null;
            if (!hasNext) {
                pb5 = null;
                break;
            }
            final qse qse = (qse)iterator.next();
            if (ese.z(qse)) {
                continue;
            }
            final hc4 d = qse.M0().d();
            if (pq8.q((wb8)d, vb4.C0) || pq8.o((wb8)d)) {
                zzd.d((Object)d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                pb5 = (pb4)d;
                break;
            }
        }
        if (pb5 == null) {
            return null;
        }
        final i3h l0 = pb5.l0();
        if (l0 instanceof wze) {
            wze = (wze)l0;
        }
        wze i;
        if ((i = wze) == null) {
            i = i(pb5);
        }
        return i;
    }
    
    public static String k(final vo6 vo6, final Resources resources, final boolean b) {
        final hil d0 = vo6.D0;
        String s;
        if (d0 != null) {
            s = d0.f;
        }
        else {
            s = vo6.t();
        }
        final boolean f1 = ckr.f1(s, vo6.h(), true);
        final hil d2 = vo6.D0;
        boolean b2 = false;
        Label_0087: {
            if (d2 != null) {
                final pq k = d2.k;
                if (k != null && k.a) {
                    b2 = true;
                    break Label_0087;
                }
            }
            b2 = false;
        }
        Label_0134: {
            if (s != null) {
                if (!vo6.D0() || vo6.C0.E0) {
                    if (f1 || vo6.s0()) {
                        break Label_0134;
                    }
                    if (b2) {
                        break Label_0134;
                    }
                }
                return ivl.h(resources, s);
            }
        }
        final String string = resources.getString(2131955996);
        if (b && (pf8.d0(vo6) && "bottom".equalsIgnoreCase(vo6.D0.b()))) {
            return String.format(t4s.d(), "%s %s %s", string, "·", vo6.D0.c());
        }
        return string;
    }
    
    public static String l(final View view, int n) {
        final String s = null;
        final int n2 = 1;
        final Object p2 = p(view, n, true);
        String s2;
        if (p2 instanceof String) {
            s2 = (String)p2;
        }
        else {
            s2 = "";
        }
        if (s2.length() == 0) {
            n = n2;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            s2 = s;
        }
        return s2;
    }
    
    public static String m(final elu elu) {
        String c0;
        if (elu == null) {
            c0 = "";
        }
        else {
            c0 = elu.a.C0;
        }
        return c0;
    }
    
    public static boolean n() {
        return ncw.b(UserIdentifier.getCurrent()).A().k;
    }
    
    public static final i8x o(final View view) {
        zzd.f((Object)view, "<this>");
        Objects.requireNonNull(i8x.Companion);
        final Object p = p(view, 2131429634, false);
        i8x i8x;
        if (p instanceof i8x) {
            i8x = (i8x)p;
        }
        else {
            i8x = null;
        }
        return i8x;
    }
    
    public static final Object p(final View view, final int n, final boolean b) {
        zzd.f((Object)view, "<this>");
        for (int i = 0; i < 5; ++i) {
            Object tag;
            try {
                tag = view.getTag(n);
            }
            catch (final ArrayIndexOutOfBoundsException ex) {
                tag = null;
            }
            if (tag != null) {
                if (i > 0) {
                    final Resources resources = view.getResources();
                    zzd.e((Object)resources, "resources");
                    final StringBuilder k = t4a.k("View#getWeaverTag recovered after ", i, " retries for key `", s(resources, n, null), "` => `");
                    k.append(tag);
                    k.append("`");
                    bp7.B((Throwable)new WeaverException(k.toString()));
                }
                return tag;
            }
            if (b) {
                Thread.yield();
            }
        }
        return null;
    }
    
    public static boolean q(final vo6 vo6) {
        final boolean p = vo6.P();
        boolean b = false;
        if (!p && !vo6.U() && !vo6.c0()) {
            final Long i0 = vo6.I0;
            boolean b2 = false;
            Label_0104: {
                if (i0 != null && i0 > 0L) {
                    final List n0 = vo6.N0;
                    final List a = wug.a;
                    if (wug.d((Iterable)n0, new l1h[] { l1h.H0, l1h.I0, l1h.G0 }) != null) {
                        b2 = true;
                        break Label_0104;
                    }
                }
                b2 = false;
            }
            if (!b2) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public static final boolean r() {
        return dta.b().b("longform_top_articles_time_window_enabled", false);
    }
    
    public static final String s(final Resources resources, final int n, String s) {
        Object f0 = null;
        try {
            final String resourceEntryName = resources.getResourceEntryName(n);
            final StringBuilder sb = new StringBuilder();
            sb.append(resourceEntryName);
            sb.append(" (");
            sb.append(n);
            sb.append(")");
            sb.toString();
        }
        finally {
            final Throwable t;
            f0 = kq9.F0(t);
        }
        String value = s;
        if (s == null) {
            value = String.valueOf(n);
        }
        s = (String)f0;
        if (f0 instanceof wrm$b) {
            s = value;
        }
        return s;
    }
    
    public Object apply(final Object o) {
        return o;
    }
    
    public lev d(final String s, final hfv hfv) {
        final lev$a lev$a = new lev$a();
        lev$a.a = Long.parseLong(s);
        lev$a.T0 = tdy.d0(hfv.H1);
        lev$a.S0 = tdy.e0(hfv.H1);
        return (lev)((h4j)lev$a).e();
    }
    
    public lev e(final String s, final hfv hfv, final oii oii) {
        zzd.f((Object)s, "id");
        zzd.f((Object)hfv, "profileUser");
        zzd.f((Object)oii, "newsletterSource");
        final lev$a lev$a = new lev$a();
        lev$a.a = Long.parseLong(s);
        lev$a.T0 = tdy.d0(hfv.H1);
        lev$a.S0 = tdy.e0(hfv.H1);
        final nii$a nii$a = new nii$a();
        nii$a.o(oii.C0);
        lev$a.i1 = (nii)((h4j)nii$a).e();
        return (lev)((h4j)lev$a).e();
    }
    
    @Override
    public Object j(final die die, final float n) throws IOException {
        final int v2 = die.V2();
        boolean b = true;
        if (v2 != 1) {
            b = false;
        }
        if (b) {
            die.a();
        }
        final double n2 = die.n2();
        final double n3 = die.n2();
        final double n4 = die.n2();
        double n5;
        if (die.V2() == 7) {
            n5 = die.n2();
        }
        else {
            n5 = 1.0;
        }
        if (b) {
            die.c();
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
    
    public ExecutorService t(final int n, final ThreadFactory threadFactory) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(n, n, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
