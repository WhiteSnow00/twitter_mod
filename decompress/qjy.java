import android.content.DialogInterface$OnCancelListener;
import androidx.appcompat.app.e;
import android.app.Dialog;
import android.os.IInterface;
import android.os.IBinder;
import android.content.res.Resources;
import com.twitter.users.TabbedVitFollowersContentViewArgs;
import com.twitter.users.timeline.FollowersTimelineContentViewArgs;
import com.twitter.app.common.args.ContentViewArgs;
import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import android.text.Layout;
import android.graphics.Rect;
import java.util.WeakHashMap;
import android.view.View$OnAttachStateChangeListener;
import java.util.List;
import java.util.Objects;
import android.view.View;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import android.util.Pair;
import java.io.RandomAccessFile;
import android.os.Looper;
import android.util.Log;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qjy implements c0z, cfy
{
    public static volatile ClassLoader F0;
    public static volatile Thread G0;
    public static final v4s H0;
    public static final v4s I0;
    public static final qjy J0;
    public static final qjy K0;
    public static final qjy L0;
    
    static {
        H0 = new v4s("REMOVED_TASK");
        I0 = new v4s("CLOSED_EMPTY");
        J0 = new qjy();
        K0 = new qjy();
        L0 = new qjy();
    }
    
    public static dlh A(final dlh dlh, final float n, asp a, long a2, long a3, final int n2) {
        if ((n2 & 0x2) != 0x0) {
            a = (asp)x6m.a;
        }
        final boolean b = (n2 & 0x4) != 0x0 && Float.compare(n, 0) > 0;
        if ((n2 & 0x8) != 0x0) {
            a2 = r8c.a;
        }
        if ((n2 & 0x10) != 0x0) {
            a3 = r8c.a;
        }
        e0e.f((Object)dlh, "$this$shadow");
        e0e.f((Object)a, "shape");
        if (Float.compare(n, 0) <= 0) {
            final dlh a4 = dlh;
            if (!b) {
                return a4;
            }
        }
        final ysd$a a5 = ysd.a;
        final ysd$a a6 = ysd.a;
        return ysd.a(dlh, kqe.T((dlh)dlh.Companion, (stb)new wrp(n, a, b, a2, a3)));
    }
    
    public static final void B(final p p4, final pxn pxn, final oko oko, final String s) {
        e0e.f((Object)p4, "fragmentManager");
        e0e.f((Object)pxn, "roomRecordingDeleteDispatcher");
        e0e.f((Object)oko, "roomsScribeReporter");
        e0e.f((Object)s, "roomId");
        final wjl$b wjl$b = new wjl$b(7);
        ((wjl$a)wjl$b).H(2131957296);
        ((wjl$a)wjl$b).A(2131957294);
        ((wjl$a)wjl$b).F(2131952374);
        ((wjl$a)wjl$b).C(2131957295);
        final vjl vjl = (vjl)((cl1$a)wjl$b).w();
        ((bl1)vjl).W1 = (dx8)new z0n(pxn, s, oko);
        final int a = o5j.a;
        ((bl1)vjl).l2(p4);
    }
    
    public static final void C(final Context context, final boolean b, final znl znl) {
        e0e.f((Object)context, "context");
        e0e.f((Object)znl, "confirmSubject");
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
        final jng jng = new jng(context, 0);
        jng.s(n);
        jng.m(n3);
        ((Dialog)jng.n(2131952374, (DialogInterface$OnClickListener)rzs.I0).p(n2, (DialogInterface$OnClickListener)new oem((Object)znl, 5)).create()).show();
    }
    
    public static final void D(final Context context, final znl znl, final boolean b) {
        e0e.f((Object)context, "context");
        e0e.f((Object)znl, "confirmationSubject");
        final jng jng = new jng(context, 0);
        int n;
        if (b) {
            n = 2131952785;
        }
        else {
            n = 2131952782;
        }
        jng.s(n);
        int n2;
        if (b) {
            n2 = 2131952784;
        }
        else {
            n2 = 2131952780;
        }
        jng.m(n2);
        ((Dialog)jng.n(2131955430, (DialogInterface$OnClickListener)kqk.H0).p(2131952783, (DialogInterface$OnClickListener)new jv2((Object)znl, 1)).create()).show();
    }
    
    public static final void E(final Context context, final String s, final znl znl) {
        e0e.f((Object)s, "username");
        e0e.f((Object)znl, "confirmSubject");
        final jng jng = new jng(context, 0);
        jng.s(2131958423);
        ((e.a)jng).a.g = context.getString(2131958422, new Object[] { s });
        final jng n = jng.p(2131958417, (DialogInterface$OnClickListener)new bh6((Object)znl, 5)).n(2131952374, (DialogInterface$OnClickListener)a1n.F0);
        ((e.a)n).a.o = (DialogInterface$OnCancelListener)aqd.F0;
        ((e.a)n).k();
    }
    
    public static final smp F(final smp smp, final a7s a7s) {
        e0e.f((Object)smp, "<this>");
        e0e.f((Object)a7s, "obj");
        return smp.v(qsz.v(a7s));
    }
    
    public static Context G(final Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }
    
    public static ClassLoader H() {
        synchronized (qjy.class) {
            if (qjy.F0 == null) {
                qjy.F0 = I();
            }
            return qjy.F0;
        }
    }
    
    public static ClassLoader I() {
        synchronized (qjy.class) {
            final Thread g0 = qjy.G0;
            final ClassLoader classLoader = null;
            if (g0 == null) {
                qjy.G0 = J();
                if (qjy.G0 == null) {
                    return null;
                }
            }
            final Thread g2 = qjy.G0;
            monitorenter(g2);
            try {
                try {
                    final ClassLoader contextClassLoader = qjy.G0.getContextClassLoader();
                }
                finally {
                    monitorexit(g2);
                    ClassLoader contextClassLoader = null;
                Label_0103:
                    while (true) {
                        final String concat;
                        Log.w("DynamiteLoaderV2CL", concat);
                        contextClassLoader = classLoader;
                        break Label_0103;
                        final String s;
                        concat = "Failed to get thread context classloader ".concat(s);
                        continue;
                    }
                    monitorexit(g2);
                    return contextClassLoader;
                    String concat = new String("Failed to get thread context classloader ");
                }
            }
            catch (final SecurityException ex) {}
        }
    }
    
    public static Thread J() {
        synchronized (qjy.class) {
            final ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup == null) {
                return null;
            }
            monitorenter(Void.class);
            try {
                Label_0293: {
                    try {
                        final int activeGroupCount = threadGroup.activeGroupCount();
                        final ThreadGroup[] array = new ThreadGroup[activeGroupCount];
                        threadGroup.enumerate(array);
                        final int n = 0;
                        for (final ThreadGroup threadGroup2 : array) {
                            if ("dynamiteLoader".equals(threadGroup2.getName())) {
                                ThreadGroup threadGroup3 = threadGroup2;
                                if (threadGroup2 == null) {
                                    threadGroup3 = new ThreadGroup(threadGroup, "dynamiteLoader");
                                }
                                final int activeCount = threadGroup3.activeCount();
                                final Thread[] array2 = new Thread[activeCount];
                                threadGroup3.enumerate(array2);
                                int j = n;
                                while (true) {
                                    while (j < activeCount) {
                                        Thread thread = array2[j];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            final Thread thread2 = thread;
                                            if (thread != null) {
                                                break Label_0293;
                                            }
                                            try {
                                                final nay nay = new nay(threadGroup3);
                                                try {
                                                    nay.setContextClassLoader(null);
                                                    nay.start();
                                                    thread = nay;
                                                }
                                                catch (final SecurityException ex) {
                                                    thread = nay;
                                                }
                                            }
                                            catch (final SecurityException ex) {}
                                        }
                                        else {
                                            ++j;
                                        }
                                    }
                                    Thread thread = null;
                                    continue;
                                }
                            }
                        }
                        ThreadGroup threadGroup2 = null;
                    }
                    finally {
                        monitorexit(Void.class);
                        final SecurityException ex;
                        final String value = String.valueOf(ex.getMessage());
                        iftrue(Label_0268:)(value.length() == 0);
                        String concat = null;
                        Label_0280: {
                            Block_20: {
                                break Block_20;
                                Label_0268: {
                                    concat = new String("Failed to enumerate thread/threadgroup ");
                                }
                                break Label_0280;
                            }
                            concat = "Failed to enumerate thread/threadgroup ".concat(value);
                        }
                        Log.w("DynamiteLoaderV2CL", concat);
                        final Thread thread;
                        final Thread thread2 = thread;
                        monitorexit(Void.class);
                        return thread2;
                    }
                }
            }
            catch (final SecurityException ex2) {}
        }
    }
    
    public static Pair K(final RandomAccessFile randomAccessFile, int i) throws IOException {
        final long length = randomAccessFile.length();
        if (length < 22L) {
            return null;
        }
        final ByteBuffer allocate = ByteBuffer.allocate((int)Math.min(i, -22L + length) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        final long n = length - allocate.capacity();
        randomAccessFile.seek(n);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        L(allocate);
        i = allocate.capacity();
        Label_0168: {
            if (i >= 22) {
                final int n2 = i - 22;
                int min;
                int n3;
                for (min = Math.min(n2, 65535), i = 0; i < min; ++i) {
                    n3 = n2 - i;
                    if (allocate.getInt(n3) == 101010256 && (char)allocate.getShort(n3 + 20) == i) {
                        i = n3;
                        break Label_0168;
                    }
                }
            }
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        allocate.position(i);
        final ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create((Object)slice, (Object)(n + i));
    }
    
    public static void L(final ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }
    
    public static final void b(nw8 k0, d86 h, final int n, final int n2) {
        h = h.h(-592364524);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x2);
        }
        else {
            n4 = n;
        }
        if (n3 == 1 && (n4 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            h.C();
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
            }
            else if (n3 != 0) {
                k0 = shw.K0(h);
            }
            h.s();
            final sa6$b a = sa6.a;
            final v56 a2 = v56.a;
            de0.a((hub)v56.b, (hub)v56.c, (hub)w9y.i(h, -1831434376, new kch(k0)), (dlh)null, 0L, (asp)null, (hub)null, (kub)v56.d, h, 12583350, 120);
        }
        final gyo i = h.k();
        if (i != null) {
            i.a((hub)new lch(k0, n, n2));
        }
    }
    
    public static final qsd c(final View view, final stb stb) {
        e0e.f((Object)view, "<this>");
        e0e.f((Object)stb, "build");
        final usd usd = new usd();
        stb.invoke((Object)usd);
        final qsd$a a = usd.a;
        Objects.requireNonNull(a);
        final a7q a2 = a.a;
        final a7q b = a.b;
        final int c = a.c;
        final qsd qsd = new qsd(a2, b, c, (List)a.d);
        final Object tag = view.getTag(2131429620);
        dcx dcx;
        if (tag instanceof dcx) {
            dcx = (dcx)tag;
        }
        else {
            dcx = null;
        }
        if (dcx == null) {
            dcx = new dcx(view);
            view.setTag(2131429620, (Object)dcx);
        }
        final psd psd = new psd(qsd, dcx);
        final WeakHashMap a3 = b7x.a;
        b7x$i.u(view, (ihj)psd);
        if (c != 0) {
            b7x.E(view, (eqx$b)new ssd(qsd, view));
        }
        view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new rsd());
        if (b7x$g.b(view)) {
            b7x$h.c(view);
        }
        return qsd;
    }
    
    public static int e(final Rect rect) {
        if (rect.height() == 0) {
            return 0;
        }
        return -rect.top;
    }
    
    public static int f(final Layout layout, final Rect rect) {
        if (rect.height() == 0) {
            return 0;
        }
        return Math.max(0, layout.getLineDescent(layout.getLineCount() - 1) - rect.bottom);
    }
    
    public static int g(final Layout layout, final Rect rect) {
        if (rect.height() == 0) {
            return 0;
        }
        return rect.top - layout.getLineAscent(0);
    }
    
    public static String h(final evb evb, int n) {
        final int n2 = 0;
        final boolean b = (n & 0x1) != 0x0;
        if ((n & 0x2) != 0x0) {
            n = 1;
        }
        else {
            n = 0;
        }
        e0e.f((Object)evb, "<this>");
        final StringBuilder sb = new StringBuilder();
        if (n != 0) {
            String e;
            if (evb instanceof hk6) {
                e = "<init>";
            }
            else {
                e = ((kc8)evb).getName().e();
                e0e.e((Object)e, "name.asString()");
            }
            sb.append(e);
        }
        sb.append("(");
        final f4m m = ((ba3)evb).M();
        if (m != null) {
            final yse type = ((zow)m).getType();
            e0e.e((Object)type, "it.type");
            sb.append(w(type));
        }
        final Iterator iterator = ((ba3)evb).h().iterator();
        while (iterator.hasNext()) {
            final yse type2 = ((zow)iterator.next()).getType();
            e0e.e((Object)type2, "parameter.type");
            sb.append(w(type2));
        }
        sb.append(")");
        if (b) {
            Label_0282: {
                if (!(evb instanceof hk6)) {
                    final yse returnType = ((ba3)evb).getReturnType();
                    e0e.c((Object)returnType);
                    n = n2;
                    if (!mse.P(returnType)) {
                        break Label_0282;
                    }
                    final yse returnType2 = ((ba3)evb).getReturnType();
                    e0e.c((Object)returnType2);
                    n = n2;
                    if (olv.g(returnType2)) {
                        break Label_0282;
                    }
                    n = n2;
                    if (evb instanceof rkl) {
                        break Label_0282;
                    }
                }
                n = 1;
            }
            if (n != 0) {
                sb.append("V");
            }
            else {
                final yse returnType3 = ((ba3)evb).getReturnType();
                e0e.c((Object)returnType3);
                sb.append(w(returnType3));
            }
        }
        final String string = sb.toString();
        e0e.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public static final String i(ba3 a) {
        e0e.f((Object)a, "<this>");
        if (dr8.r((kc8)a)) {
            return null;
        }
        final kc8 b = ((mc8)a).b();
        wb4 wb4;
        if (b instanceof wb4) {
            wb4 = (wb4)b;
        }
        else {
            wb4 = null;
        }
        if (wb4 == null) {
            return null;
        }
        if (((kc8)wb4).getName().G0) {
            return null;
        }
        a = a.a();
        Object o;
        if (a instanceof p9q) {
            o = a;
        }
        else {
            o = null;
        }
        if (o == null) {
            return null;
        }
        return p0b.K(wb4, h((evb)o, 3));
    }
    
    public static final List j(final Collection collection, final Collection collection2, final ba3 ba3) {
        e0e.f((Object)collection2, "oldValueParameters");
        e0e.f((Object)ba3, "newOwner");
        collection.size();
        collection2.size();
        final List q2 = rr4.q2((Iterable)collection, (Iterable)collection2);
        final ArrayList list = new ArrayList<jpw>(nr4.d1((Iterable)q2, 10));
        for (final awj awj : (ArrayList)q2) {
            final yse yse = (yse)awj.F0;
            final ipw ipw = (ipw)awj.G0;
            final int index = ipw.getIndex();
            final ud0 annotations = ((uc0)ipw).getAnnotations();
            final a7i name = ((kc8)ipw).getName();
            e0e.e((Object)name, "oldParameter.name");
            final boolean z0 = ipw.z0();
            final boolean r0 = ipw.r0();
            final boolean q3 = ipw.q0();
            yse g;
            if (ipw.u0() != null) {
                g = er8.j((kc8)ba3).l().g(yse);
            }
            else {
                g = null;
            }
            final smq m = ((pc8)ipw).m();
            e0e.e((Object)m, "oldParameter.source");
            list.add(new jpw(ba3, (ipw)null, index, annotations, name, yse, z0, r0, q3, g, m));
        }
        return list;
    }
    
    public static ContentViewArgs k(final UserIdentifier userIdentifier, final qgv qgv, final Uri uri) {
        final UserIdentifier f = qgv.f();
        final boolean equals = f.equals((Object)userIdentifier);
        final boolean p3 = qgv.P0;
        final boolean b = false;
        int n = 0;
        Label_0075: {
            if (!p3 || !ita.b().b("vit_verified_followers_view_enabled", false)) {
                n = (b ? 1 : 0);
                if (p3) {
                    break Label_0075;
                }
                n = (b ? 1 : 0);
                if (!ita.b().b("vit_verified_followers_for_non_verified_users_enabled", false)) {
                    break Label_0075;
                }
            }
            n = (b ? 1 : 0);
            if (equals) {
                n = 1;
            }
        }
        if (n == 0) {
            return (ContentViewArgs)new FollowersTimelineContentViewArgs(qgv.M0, f);
        }
        final int n2 = qgv.N1;
        String string;
        if (uri != null) {
            string = uri.toString();
        }
        else {
            string = null;
        }
        return (ContentViewArgs)new TabbedVitFollowersContentViewArgs(n2, string);
    }
    
    public static final long l(long n) {
        final long n2 = 0L;
        if (n <= 0L) {
            n = n2;
        }
        else if (n >= 9223372036854L) {
            n = Long.MAX_VALUE;
        }
        else {
            n *= 1000000L;
        }
        return n;
    }
    
    public static final d0f m(final wb4 wb4) {
        e0e.f((Object)wb4, "<this>");
        final int a = er8.a;
        final Iterator iterator = ((yse)wb4.p()).M0().a().iterator();
        d0f d0f;
        wb4 wb5;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            d0f = null;
            if (!hasNext) {
                wb5 = null;
                break;
            }
            final yse yse = (yse)iterator.next();
            if (mse.z(yse)) {
                continue;
            }
            final oc4 d = yse.M0().d();
            if (dr8.q((kc8)d, cc4.F0) || dr8.o((kc8)d)) {
                e0e.d((Object)d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                wb5 = (wb4)d;
                break;
            }
        }
        if (wb5 == null) {
            return null;
        }
        final a4h k0 = wb5.k0();
        if (k0 instanceof d0f) {
            d0f = (d0f)k0;
        }
        d0f m;
        if ((m = d0f) == null) {
            m = m(wb5);
        }
        return m;
    }
    
    public static final int n(int n, int n2, int n3) {
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
    
    public static String o(final Resources resources, final int n, final String s, final String s2) {
        if (n == 3) {
            return resources.getString(2131958135, new Object[] { s });
        }
        if (n == 12) {
            return resources.getString(2131959230, new Object[] { s });
        }
        if (n != 13) {
            return p(resources, n, s, s2);
        }
        return resources.getString(2131959226, new Object[] { s });
    }
    
    public static String p(final Resources resources, final int n, final String s, final String s2) {
        if (n == 1) {
            return resources.getString(2131958121, new Object[] { s });
        }
        if (n != 3) {
            if (n == 29) {
                return resources.getString(2131958142);
            }
            if (n == 38) {
                return resources.getString(2131958140, new Object[] { s });
            }
            if (n == 41) {
                return resources.getString(2131955760);
            }
            if (n != 44) {
                if (n != 51) {
                    if (n == 59) {
                        return resources.getString(2131955759);
                    }
                    if (n != 12) {
                        if (n == 13) {
                            return resources.getString(2131959225, new Object[] { s });
                        }
                        if (n == 25) {
                            return resources.getString(2131958133);
                        }
                        if (n == 26) {
                            return resources.getString(2131958138);
                        }
                        if (n != 35 && n != 36) {
                            return null;
                        }
                    }
                }
                return s;
            }
            return resources.getString(2131958143);
        }
        else {
            if (s2 != null) {
                return resources.getString(2131958136, new Object[] { s, s2 });
            }
            return resources.getString(2131958134, new Object[] { s });
        }
    }
    
    public static int q(final int n) {
        if (n != 1 && n != 3 && n != 29) {
            if (n != 38) {
                if (n != 59) {
                    if (n != 12) {
                        Label_0218: {
                            if (n != 13) {
                                if (n == 35) {
                                    return 2131232320;
                                }
                                if (n == 36) {
                                    return 2131232131;
                                }
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                switch (n) {
                                                    default: {
                                                        return 0;
                                                    }
                                                    case 57: {
                                                        return 2131232003;
                                                    }
                                                    case 56: {
                                                        return 2131232454;
                                                    }
                                                    case 55: {
                                                        return 2131231987;
                                                    }
                                                    case 54: {
                                                        return 2131231954;
                                                    }
                                                    case 53: {
                                                        return 2131232206;
                                                    }
                                                    case 52: {
                                                        return 2131232384;
                                                    }
                                                    case 50:
                                                    case 51: {
                                                        return 2131232520;
                                                    }
                                                    case 49: {
                                                        return 2131232320;
                                                    }
                                                }
                                                break;
                                            }
                                            case 43: {
                                                return 2131232075;
                                            }
                                            case 42: {
                                                return 2131232520;
                                            }
                                            case 44: {
                                                break Label_0218;
                                            }
                                            case 41: {
                                                return 2131232347;
                                            }
                                        }
                                        break;
                                    }
                                    case 24: {
                                        return 2131232199;
                                    }
                                    case 22: {
                                        return 2131232194;
                                    }
                                    case 23:
                                    case 25:
                                    case 26: {
                                        return 2131232320;
                                    }
                                }
                            }
                        }
                        return 2131232392;
                    }
                    return 2131232507;
                }
                return 2131232347;
            }
            return 2131232082;
        }
        return 2131232320;
    }
    
    public static int r(final zrm zrm, final int n) {
        if (n != 12) {
            if (n == 13) {
                return zrm.g(2131099997);
            }
            if (n == 24) {
                return zrm.d(2130970865);
            }
            if (n == 36) {
                return zrm.g(2131099992);
            }
            if (n != 52) {
                return zrm.d(2130970865);
            }
            return zrm.g(2131100548);
        }
        else {
            if (ita.c().b("topics_new_social_context_icon_color_enabled", false)) {
                return zrm.g(2131100865);
            }
            return zrm.d(2130970865);
        }
    }
    
    public static boolean s(final agv agv) {
        return agv != null && flr.g((CharSequence)agv.P0);
    }
    
    public static boolean t() {
        final rmv c = ita.c();
        boolean b = false;
        if (c.b("android_async_inflation_enabled", false)) {
            b = b;
            if (ita.c().b("android_async_video_player_view_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public static boolean u() {
        final rmv b = ita.b();
        boolean b2 = false;
        if (b.b("android_audio_avatar_discovery_api_enabled", false) || ita.b().b("android_fleets_avatar_ring_discovery_api_enabled", false)) {
            b2 = true;
        }
        return b2;
    }
    
    public static boolean v() {
        return ita.b().b("android_audio_avatar_ring_htl_enabled", false);
    }
    
    public static final kne w(final yse yse) {
        return (kne)fr0.R(yse, qkv.k, (kub)mvb.b);
    }
    
    public static final long x(long n, final long n2) {
        n %= n2;
        if (n < 0L) {
            n += n2;
        }
        return n;
    }
    
    public static final a7s y(final rmp rmp, final ara ara) {
        e0e.f((Object)rmp, "<this>");
        final byte[] w = rmp.w();
        a7s m;
        if (w != null) {
            m = qsz.m(w, ara);
        }
        else {
            m = null;
        }
        return m;
    }
    
    public static final Object z(final Object o, Class class1) {
        if (o != null && !class1.isAssignableFrom(o.getClass())) {
            class1 = o.getClass();
            final StringBuilder sb = new StringBuilder();
            sb.append("ThisType method returned unexpected type ");
            sb.append(class1);
            throw new IllegalArgumentException(sb.toString());
        }
        return o;
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return (int)stz.G0.b().u();
    }
    
    public Object d(final IBinder binder) {
        final int a = duz.a;
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (queryLocalInterface instanceof uvz) {
                o = queryLocalInterface;
            }
            else {
                o = new osz(binder);
            }
        }
        return o;
    }
}
