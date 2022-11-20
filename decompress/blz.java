import com.twitter.media.transcode.TranscoderException;
import com.twitter.media.transcode.TranscoderInitializationException;
import androidx.emoji2.text.c$h;
import java.util.NoSuchElementException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import java.util.concurrent.CancellationException;
import android.os.Trace;
import android.view.MotionEvent;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import kotlinx.serialization.MissingFieldException;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import android.graphics.Matrix;
import android.graphics.Color;
import com.twitter.weaver.base.WeaverException;
import java.util.Objects;
import android.text.TextUtils;
import tv.periscope.model.b;
import android.content.res.Resources;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.io.File;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import androidx.emoji2.text.c$g;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blz implements s2p, c$g, yws, fzy
{
    public static alz D0;
    public static final blz E0;
    public static final b4s F0;
    public static final b4s G0;
    public static final b4s H0;
    public static final b4s I0;
    public static final b4s J0;
    public static final j1a K0;
    public static final j1a L0;
    public static final blz M0;
    public static final int[] N0;
    public static final int[] O0;
    public static final int[] P0;
    public static final blz Q0;
    
    static {
        E0 = new blz();
        F0 = new b4s("COMPLETING_ALREADY");
        G0 = new b4s("COMPLETING_WAITING_CHILDREN");
        H0 = new b4s("COMPLETING_RETRY");
        I0 = new b4s("TOO_LATE_TO_CANCEL");
        J0 = new b4s("SEALED");
        K0 = new j1a(false);
        L0 = new j1a(true);
        M0 = new blz();
        N0 = new int[] { 2130968734, 2130969208, 2130970011, 2130970560, 2130970861, 2130970886, 2130970888, 2130971063 };
        O0 = new int[] { 16842754, 16842960, 16843156, 16843233, 16844126, 2130968620, 2130968664, 2130968864, 2130968992, 2130969252, 2130969262, 2130969600, 2130970123, 2130970269, 2130970636, 2130970734, 2130970735, 2130970737 };
        P0 = new int[] { 2130970803 };
        Q0 = new blz();
    }
    
    public static File A(final Context context, final UserIdentifier userIdentifier) {
        final int a = n40.a;
        final File cacheDir = context.getCacheDir();
        File file;
        if (cacheDir != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(userIdentifier);
            sb.append("_header.jpg");
            file = new File(cacheDir, sb.toString());
        }
        else {
            file = null;
        }
        return file;
    }
    
    public static final mn4 B(final bo6 bo6) {
        czd.f((Object)bo6, "<this>");
        final boolean g = G(bo6);
        final mn4 mn4 = null;
        final mn4 mn5 = null;
        mn4 mn6 = mn4;
        if (g) {
            final vf3 d0 = bo6.D0;
            czd.e((Object)d0, "canonicalTweet");
            mn6 = mn4;
            if (v(d0) != null) {
                final on4 x1 = d0.x1;
                mn6 = mn4;
                if (x1 != null) {
                    final List a = x1.a;
                    mn6 = mn4;
                    if (a != null) {
                        final Iterator iterator = a.iterator();
                        mn4 mn7;
                        Object next;
                        do {
                            next = mn5;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            next = iterator.next();
                            mn7 = (mn4)next;
                        } while (mn7.b.D0 != d0.h1.getId() || mn7.a != nn4.D0);
                        mn6 = (mn4)next;
                    }
                }
            }
        }
        return mn6;
    }
    
    public static String C(final View view, int n) {
        final String s = null;
        final int n2 = 1;
        final Object f = F(view, n, true);
        String s2;
        if (f instanceof String) {
            s2 = (String)f;
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
    
    public static String D(final Resources resources, final b b) {
        String trim;
        if (b.c0() != null) {
            trim = b.c0().trim();
        }
        else {
            trim = "";
        }
        if (!TextUtils.isEmpty((CharSequence)trim)) {
            return trim;
        }
        if (b.F()) {
            return resources.getString(2131956135, new Object[] { b.i0() });
        }
        return resources.getString(2131956136, new Object[] { b.i0() });
    }
    
    public static final b9x E(final View view) {
        czd.f((Object)view, "<this>");
        Objects.requireNonNull(b9x.Companion);
        final Object f = F(view, 2131429634, false);
        b9x b9x;
        if (f instanceof b9x) {
            b9x = (b9x)f;
        }
        else {
            b9x = null;
        }
        return b9x;
    }
    
    public static final Object F(final View view, final int n, final boolean b) {
        czd.f((Object)view, "<this>");
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
                    czd.e((Object)resources, "resources");
                    final StringBuilder k = fu8.k("View#getWeaverTag recovered after ", i, " retries for key `", T(resources, n, null), "` => `");
                    k.append(tag);
                    k.append("`");
                    v68.N((Throwable)new WeaverException(k.toString()));
                }
                return tag;
            }
            if (b) {
                Thread.yield();
            }
        }
        return null;
    }
    
    public static final boolean G(final bo6 bo6) {
        czd.f((Object)bo6, "<this>");
        return w(bo6) != null;
    }
    
    public static final boolean H(final bo6 bo6) {
        czd.f((Object)bo6, "<this>");
        return y(bo6) != null;
    }
    
    public static final boolean I(final vqn vqn) {
        czd.f((Object)vqn, "<this>");
        return K(vqn) || (vqn.F == p9w.D0 && vqn.u == wqn.D0);
    }
    
    public static boolean J() {
        return asa.b().b("composer_android_hide_keyboard_less_enabled", false);
    }
    
    public static final boolean K(final vqn vqn) {
        czd.f((Object)vqn, "<this>");
        return vqn.u == wqn.E0;
    }
    
    public static final boolean L(final vqn vqn) {
        czd.f((Object)vqn, "<this>");
        return pps.l(vqn.K);
    }
    
    public static final boolean M(final vqn vqn) {
        czd.f((Object)vqn, "<this>");
        return L(vqn) ^ true;
    }
    
    public static final boolean N(final vqn vqn) {
        czd.f((Object)vqn, "<this>");
        return M(vqn) && vqn.H != null;
    }
    
    public static boolean O() {
        return asa.b().b("self_thread_composer_reply_threads", false);
    }
    
    public static final puh P(final Object o, final hiq hiq) {
        czd.f((Object)hiq, "policy");
        final n4s a = kp.a;
        return (puh)new hwj(o, (hiq<Object>)hiq);
    }
    
    public static puh Q(final Object o) {
        return P(o, (hiq)mlr.a);
    }
    
    public static final void R(final qsb qsb, final qsb qsb2, final nsb nsb) {
        final i99 a = jiq.a;
        czd.f((Object)qsb, "start");
        czd.f((Object)qsb2, "done");
        final i99 b = jiq.b;
        suh suh;
        if ((suh = (suh)b.g()) == null) {
            suh = new suh((Object[])new lvj[16]);
            b.l((Object)suh);
        }
        final lvj lvj = new lvj((Object)qsb, (Object)qsb2);
        try {
            suh.b((Object)lvj);
            nsb.invoke();
        }
        finally {
            suh.p(suh.F0 - 1);
        }
    }
    
    public static int S(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return 0;
        }
        String string = s;
        try {
            if (s.charAt(0) != '#') {
                final StringBuilder sb = new StringBuilder();
                sb.append('#');
                sb.append(s);
                string = sb.toString();
            }
            return Color.parseColor(string);
        }
        catch (final IllegalArgumentException ex) {
            return 0;
        }
    }
    
    public static final String T(final Resources resources, final int n, String s) {
        Object h = null;
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
            h = b1n.h(t);
        }
        String value = s;
        if (s == null) {
            value = String.valueOf(n);
        }
        s = (String)h;
        if (h instanceof nsm$b) {
            s = value;
        }
        return s;
    }
    
    public static final m8r U(final Object value, final x66 x66) {
        x66.x(-1058319986);
        final n96$b a = n96.a;
        x66.x(-492369756);
        final Object y = x66.y();
        Objects.requireNonNull(x66.Companion);
        Object q = y;
        if (y == x66$a.b) {
            q = Q(value);
            x66.p(q);
        }
        x66.O();
        final puh puh = (puh)q;
        puh.setValue(value);
        x66.O();
        return (m8r)puh;
    }
    
    public static boolean V(final Context context, final UserIdentifier userIdentifier) {
        final File a = A(context, userIdentifier);
        return a != null && a.exists() && a.delete();
    }
    
    public static eaq W(final ftb ftb) {
        final u1a d0 = u1a.D0;
        Objects.requireNonNull(d0);
        return (eaq)new paq((gcq)new dxb((Object)z3c.D0, (Object)d0, (Object)ftb));
    }
    
    public static final void X(final float[] array, final Matrix matrix) {
        czd.f((Object)array, "$this$setFrom");
        czd.f((Object)matrix, "matrix");
        matrix.getValues(array);
        final float n = array[0];
        final float n2 = array[1];
        final float n3 = array[2];
        final float n4 = array[3];
        final float n5 = array[4];
        final float n6 = array[5];
        final float n7 = array[6];
        final float n8 = array[7];
        final float n9 = array[8];
        array[0] = n;
        array[1] = n4;
        array[2] = 0.0f;
        array[3] = n7;
        array[4] = n2;
        array[5] = n5;
        array[6] = 0.0f;
        array[7] = n8;
        array[9] = (array[8] = 0.0f);
        array[10] = 1.0f;
        array[11] = 0.0f;
        array[12] = n3;
        array[13] = n6;
        array[14] = 0.0f;
        array[15] = n9;
    }
    
    public static final d7b Y(final nsb nsb) {
        return (d7b)new jpo((ftb)new miq((nsb<Object>)nsb, null));
    }
    
    public static final n8r Z(d7b d7b, final cy6 cy6, final fyp fyp, final Object o) {
        final vq2 d0 = vq2.D0;
        Objects.requireNonNull(yo3.t);
        int b = yo3$a.b;
        final int n = 1;
        if (1 >= b) {
            b = 1;
        }
        --b;
        z4d z4d = null;
        Label_0152: {
            if (d7b instanceof ip3) {
                final ip3 ip3 = (ip3)d7b;
                final d7b i = ip3.i();
                if (i != null) {
                    final int e0 = ip3.E0;
                    if (e0 != -3 && e0 != -2 && e0 != 0) {
                        b = e0;
                    }
                    else if (ip3.F0 != d0 || e0 == 0) {
                        b = 0;
                    }
                    z4d = new z4d(i, b, ip3.F0, ip3.D0);
                    break Label_0152;
                }
            }
            z4d = new z4d(d7b, b, d0, (sx6)u1a.D0);
        }
        final quh a = d4j.a(o);
        final sx6 sx6 = (sx6)z4d.d;
        d7b = (d7b)z4d.b;
        Objects.requireNonNull(fyp.Companion);
        int n2;
        if (czd.a((Object)fyp, (Object)fyp$a.b)) {
            n2 = n;
        }
        else {
            n2 = 4;
        }
        return (n8r)new k2m((n8r)a, as2.L(cy6, sx6, n2, (ftb)new p8b(fyp, d7b, (nuh)a, o, (go6)null)));
    }
    
    public static final void a0(int i, int n, final SerialDescriptor serialDescriptor) {
        czd.f((Object)serialDescriptor, "descriptor");
        final ArrayList list = new ArrayList();
        n &= ~i;
        for (i = 0; i < 32; ++i) {
            if ((n & 0x1) != 0x0) {
                list.add(serialDescriptor.e(i));
            }
            n >>>= 1;
        }
        throw new MissingFieldException((List)list, serialDescriptor.h());
    }
    
    public static final List b0(final Stream stream) {
        final Object collect = stream.collect(Collectors.toList());
        czd.e(collect, "collect(Collectors.toList<T>())");
        return (List)collect;
    }
    
    public static final void c0(final apk apk, final long n, final qsb qsb, final boolean b) {
        final MotionEvent a = apk.a();
        if (a != null) {
            final int action = a.getAction();
            if (b) {
                a.setAction(3);
            }
            a.offsetLocation(-wfj.d(n), -wfj.e(n));
            qsb.invoke((Object)a);
            a.offsetLocation(wfj.d(n), wfj.e(n));
            a.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
    
    public static final d7b d0(final d7b d7b, final itb itb) {
        final int a = i8b.a;
        return (d7b)new np3(itb, d7b);
    }
    
    public static void e(final String s) {
        if (cnw.a >= 18) {
            Trace.beginSection(s);
        }
    }
    
    public static final Object e0(final Object o) {
        qjd qjd;
        if (o instanceof qjd) {
            qjd = (qjd)o;
        }
        else {
            qjd = null;
        }
        Object a = o;
        if (qjd != null) {
            a = qjd.a;
            if (a == null) {
                a = o;
            }
        }
        return a;
    }
    
    public static final Object f(final d7b d7b, e7b d0, go6 o) {
        Label_0052: {
            if (o instanceof z7b) {
                final z7b z7b = (z7b)o;
                final int f0 = z7b.F0;
                if ((f0 & Integer.MIN_VALUE) != 0x0) {
                    z7b.F0 = f0 + Integer.MIN_VALUE;
                    o = z7b;
                    break Label_0052;
                }
            }
            o = new z7b((go6)o);
        }
        Object e0 = ((z7b)o).E0;
        final dy6 d2 = dy6.D0;
        final int f2 = ((z7b)o).F0;
        final int n = 1;
        final Throwable t;
        Label_0177: {
            if (f2 != 0) {
                if (f2 == 1) {
                    d0 = (e7b)((z7b)o).D0;
                    try {
                        b1n.u(e0);
                        return t;
                    }
                    finally {
                        break Label_0177;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(e0);
            e0 = new r7m();
            try {
                final a8b a8b = new a8b(d0, (r7m)e0);
                ((z7b)o).D0 = (r7m)e0;
                ((z7b)o).F0 = 1;
                if (d7b.b((e7b)a8b, (go6)o) == d2) {
                    return t;
                }
                return t;
            }
            finally {
                d0 = (e7b)e0;
            }
        }
        final Throwable t2 = (Throwable)((r7m)d0).D0;
        if (t2 == null || !czd.a((Object)t2, (Object)t)) {
            final k9e k9e = (k9e)((go6)o).getContext().c((sx6$b)k9e$b.D0);
            int n2 = 0;
            Label_0269: {
                if (k9e != null) {
                    if (k9e.isCancelled()) {
                        final CancellationException k = k9e.k();
                        if (k != null && czd.a((Object)k, (Object)t)) {
                            n2 = n;
                            break Label_0269;
                        }
                    }
                }
                n2 = 0;
            }
            if (n2 == 0) {
                if (t2 == null) {
                    return t;
                }
                if (t instanceof CancellationException) {
                    ffz.s(t2, t);
                    throw t2;
                }
                ffz.s(t, t2);
                throw t;
            }
        }
        throw t;
    }
    
    public static int f0(final int n) {
        return (int)(Integer.rotateLeft((int)(n * -862048943L), 15) * 461845907L);
    }
    
    public static final Class g(final View view, final int n, final qsb qsb) {
        final Object f = F(view, n, true);
        Class clazz;
        if (f instanceof Class) {
            clazz = (Class)f;
        }
        else if (f instanceof String) {
            Object h = null;
            try {
                Class.forName((String)f);
            }
            finally {
                final Throwable t;
                h = b1n.h(t);
            }
            final Throwable a = nsm.a(h);
            if (a != null) {
                throw new IllegalStateException((String)qsb.invoke(f), a);
            }
            clazz = (Class)h;
        }
        else {
            clazz = null;
        }
        return clazz;
    }
    
    public static int g0(final int n) {
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
    
    public static final Object h(final d7b d7b, final go6 go6) {
        Object o = d7b.b((e7b)soi.D0, go6);
        if (o != dy6.D0) {
            o = fzv.a;
        }
        return o;
    }
    
    public static final m8r i(final d7b d7b, final Object o, sx6 d0, final x66 x66, final int n) {
        czd.f((Object)d7b, "<this>");
        x66.x(-606625098);
        if ((n & 0x2) != 0x0) {
            d0 = (sx6)u1a.D0;
        }
        final n96$b a = n96.a;
        final liq liq = new liq(d0, (d7b<Object>)d7b, null);
        x66.x(-1703169085);
        x66.x(-492369756);
        final Object y = x66.y();
        Objects.requireNonNull(x66.Companion);
        puh q;
        if ((q = (puh)y) == x66$a.b) {
            q = Q(o);
            x66.p((Object)q);
        }
        x66.O();
        final puh puh = q;
        npe.h((Object)d7b, (Object)d0, (ftb)new kiq((ftb<? super w0l<Object>, ? super go6<? super fzv>, ?>)liq, (puh<Object>)puh, null), x66);
        x66.O();
        x66.O();
        return (m8r)puh;
    }
    
    public static final d7b k(d7b d7b, final long n) {
        final long n2 = lcmp(n, 0L);
        if (n2 >= 0) {
            if (n2 != 0) {
                d7b = (d7b)new h7b((itb)new t7b((qsb)new s7b(n), d7b, (go6)null));
            }
            return d7b;
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }
    
    public static final m8r l(final nsb nsb) {
        final i99 a = jiq.a;
        czd.f((Object)nsb, "calculation");
        return (m8r)new zo8(nsb);
    }
    
    public static final d7b m(d7b a) {
        final u7b$b a2 = u7b.a;
        if (!(a instanceof n8r)) {
            final u7b$b a3 = u7b.a;
            a = u7b.a(a, (ftb)u7b.b);
        }
        return a;
    }
    
    public static final Object n(final e7b e7b, final d7b d7b, final go6 go6) {
        if (!(e7b instanceof dos)) {
            Object o = d7b.b(e7b, go6);
            if (o != dy6.D0) {
                o = fzv.a;
            }
            return o;
        }
        throw ((dos)e7b).D0;
    }
    
    public static void o() {
        if (cnw.a >= 18) {
            Trace.endSection();
        }
    }
    
    public static String p(final List list, CharSequence charSequence, qsb qsb, int n) {
        if ((n & 0x1) != 0x0) {
            charSequence = ", ";
        }
        String s = "";
        String s2;
        if ((n & 0x2) != 0x0) {
            s2 = "";
        }
        else {
            s2 = null;
        }
        if ((n & 0x4) == 0x0) {
            s = null;
        }
        int n2 = 0;
        int n3;
        if ((n & 0x8) != 0x0) {
            n3 = -1;
        }
        else {
            n3 = 0;
        }
        String s3;
        if ((n & 0x10) != 0x0) {
            s3 = "...";
        }
        else {
            s3 = null;
        }
        if ((n & 0x20) != 0x0) {
            qsb = null;
        }
        czd.f((Object)list, "<this>");
        czd.f((Object)charSequence, "separator");
        czd.f((Object)s2, "prefix");
        czd.f((Object)s, "postfix");
        czd.f((Object)s3, "truncated");
        final StringBuilder sb = new StringBuilder();
        sb.append((CharSequence)s2);
        final int size = list.size();
        n = 0;
        int n4;
        while (true) {
            n4 = n;
            if (n2 >= size) {
                break;
            }
            final Object value = list.get(n2);
            ++n;
            boolean b = true;
            if (n > 1) {
                sb.append(charSequence);
            }
            if (n3 >= 0 && (n4 = n) > n3) {
                break;
            }
            if (qsb != null) {
                sb.append((CharSequence)qsb.invoke(value));
            }
            else {
                if (value != null) {
                    b = (value instanceof CharSequence);
                }
                if (b) {
                    sb.append((CharSequence)value);
                }
                else if (value instanceof Character) {
                    sb.append((char)value);
                }
                else {
                    sb.append((CharSequence)String.valueOf(value));
                }
            }
            ++n2;
        }
        if (n3 >= 0 && n4 > n3) {
            sb.append((CharSequence)s3);
        }
        sb.append((CharSequence)s);
        final String string = sb.toString();
        czd.e((Object)string, "fastJoinTo(StringBuilder\u2026form)\n        .toString()");
        return string;
    }
    
    public static final Object q(d7b d0, go6 d2) {
        Object o = null;
        Label_0046: {
            if (d2 instanceof l8b) {
                o = d2;
                final int g0 = ((l8b)o).G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    ((l8b)o).G0 = g0 + Integer.MIN_VALUE;
                    break Label_0046;
                }
            }
            o = new l8b(d2);
        }
        final Object f0 = ((l8b)o).F0;
        final dy6 d3 = dy6.D0;
        final int g2 = ((l8b)o).G0;
        Label_0194: {
            j8b j8b = null;
            AbortFlowException ex = null;
            Label_0186: {
                if (g2 != 0) {
                    if (g2 == 1) {
                        final j8b e0 = ((l8b)o).E0;
                        d0 = (d7b)((l8b)o).D0;
                        try {
                            b1n.u(f0);
                            break Label_0194;
                        }
                        catch (final AbortFlowException ex) {
                            j8b = e0;
                            break Label_0186;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b1n.u(f0);
                d2 = (go6)new r7m();
                ((r7m)d2).D0 = ffz.K0;
                final j8b e2 = new j8b((r7m)d2);
                try {
                    ((l8b)o).D0 = (r7m)d2;
                    ((l8b)o).E0 = e2;
                    ((l8b)o).G0 = 1;
                    if (d0.b((e7b)e2, (go6)o) == d3) {
                        return d3;
                    }
                    d0 = (d7b)d2;
                    break Label_0194;
                }
                catch (final AbortFlowException ex2) {
                    d0 = (d7b)d2;
                    ex = ex2;
                    j8b = e2;
                }
            }
            if (ex.D0 != j8b) {
                throw ex;
            }
        }
        final Object d4 = ((r7m)d0).D0;
        if (d4 == ffz.K0) {
            throw new NoSuchElementException("Expected at least one element");
        }
        return d4;
    }
    
    public static final Object r(d7b e0, ftb d0, go6 f0) {
        Object o = null;
        Label_0050: {
            if (f0 instanceof m8b) {
                o = f0;
                final int h0 = ((m8b)o).H0;
                if ((h0 & Integer.MIN_VALUE) != 0x0) {
                    ((m8b)o).H0 = h0 + Integer.MIN_VALUE;
                    break Label_0050;
                }
            }
            o = new m8b(f0);
        }
        final Object g0 = ((m8b)o).G0;
        final dy6 d2 = dy6.D0;
        final int h2 = ((m8b)o).H0;
        Label_0222: {
            Label_0213: {
                if (h2 != 0) {
                    if (h2 == 1) {
                        f0 = (go6)((m8b)o).F0;
                        e0 = (d7b)((m8b)o).E0;
                        d0 = ((m8b)o).D0;
                        try {
                            b1n.u(g0);
                            break Label_0222;
                        }
                        catch (final AbortFlowException ex) {
                            break Label_0213;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b1n.u(g0);
                f0 = (go6)new r7m();
                ((r7m)f0).D0 = ffz.K0;
                final k8b f2 = new k8b(d0, (r7m)f0);
                try {
                    ((m8b)o).D0 = d0;
                    ((m8b)o).E0 = (r7m)f0;
                    ((m8b)o).F0 = f2;
                    ((m8b)o).H0 = 1;
                    final Object b = e0.b((e7b)f2, (go6)o);
                    e0 = (d7b)f0;
                    if (b == d2) {
                        return d2;
                    }
                    break Label_0222;
                }
                catch (final AbortFlowException ex) {
                    final Object o2 = f2;
                    e0 = (d7b)f0;
                    f0 = (go6)o2;
                }
            }
            final AbortFlowException ex;
            if (ex.D0 != f0) {
                throw ex;
            }
        }
        final Object d3 = ((r7m)e0).D0;
        if (d3 == ffz.K0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected at least one element matching the predicate ");
            sb.append(d0);
            throw new NoSuchElementException(sb.toString());
        }
        return d3;
    }
    
    public static final Object s(d7b d0, final ftb ftb, final go6 go6) {
        Object o = null;
        Label_0052: {
            if (go6 instanceof o8b) {
                final o8b o8b = (o8b)go6;
                final int g0 = o8b.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    o8b.G0 = g0 + Integer.MIN_VALUE;
                    o = o8b;
                    break Label_0052;
                }
            }
            o = new o8b(go6);
        }
        final Object f0 = ((o8b)o).F0;
        final dy6 d2 = dy6.D0;
        final int g2 = ((o8b)o).G0;
        n8b n8b = null;
        Label_0188: {
            if (g2 != 0) {
                if (g2 == 1) {
                    final n8b e0 = ((o8b)o).E0;
                    d0 = (d7b)((o8b)o).D0;
                    try {
                        b1n.u(f0);
                        return ((r7m)d0).D0;
                    }
                    catch (final AbortFlowException ex) {
                        n8b = e0;
                        break Label_0188;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(f0);
            final Object d3 = new r7m();
            final n8b e2 = new n8b(ftb, (r7m)d3);
            try {
                ((o8b)o).D0 = (r7m)d3;
                ((o8b)o).E0 = e2;
                ((o8b)o).G0 = 1;
                final axp axp = (axp)d0;
                Objects.requireNonNull(axp);
                axp.m(axp, (e7b)e2, (go6)o);
                return d2;
            }
            catch (final AbortFlowException ex) {
                d0 = (d7b)d3;
                n8b = e2;
            }
        }
        final AbortFlowException ex;
        if (ex.D0 != n8b) {
            throw ex;
        }
        return ((r7m)d0).D0;
    }
    
    public static final d7b t(d7b a, final sx6 sx6) {
        final k9e$b d0 = k9e$b.D0;
        final vx6 vx6 = (vx6)sx6;
        if (vx6.c((sx6$b)d0) == null) {
            if (!czd.a((Object)vx6, (Object)u1a.D0)) {
                if (a instanceof oub) {
                    a = oub$a.a((oub)a, (sx6)vx6, 0, (vq2)null, 6, (Object)null);
                }
                else {
                    a = new mp3((d7b)a, (sx6)vx6, 0, (vq2)null, 12);
                }
            }
            return (d7b)a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Flow context cannot contain job in it. Had ");
        sb.append(vx6);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final String u(final z5x z5x) {
        czd.f((Object)z5x, "<this>");
        return sh4.l(z5x.a.getCanonicalName(), z5x.b);
    }
    
    public static final mn4 v(final vf3 vf3) {
        final on4 x1 = vf3.x1;
        final mn4 mn4 = null;
        final mn4 mn5 = null;
        mn4 mn6 = mn4;
        if (x1 != null) {
            final List a = x1.a;
            mn6 = mn4;
            if (a != null) {
                final Iterator iterator = a.iterator();
                mn4 mn7;
                Object next;
                do {
                    next = mn5;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    next = iterator.next();
                    mn7 = (mn4)next;
                } while (mn7.b.D0 == vf3.h1.getId() || mn7.a != nn4.E0);
                mn6 = (mn4)next;
            }
        }
        return mn6;
    }
    
    public static final mn4 w(final bo6 bo6) {
        czd.f((Object)bo6, "<this>");
        final vf3 d0 = bo6.D0;
        czd.e((Object)d0, "canonicalTweet");
        return v(d0);
    }
    
    public static final mn4 x(final vf3 vf3) {
        final on4 x1 = vf3.x1;
        final mn4 mn4 = null;
        final mn4 mn5 = null;
        mn4 mn6 = mn4;
        if (x1 != null) {
            final List a = x1.a;
            mn6 = mn4;
            if (a != null) {
                final Iterator iterator = a.iterator();
                mn4 mn7;
                Object next;
                do {
                    next = mn5;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    next = iterator.next();
                    mn7 = (mn4)next;
                } while (mn7.b.D0 == vf3.h1.getId() || mn7.a != nn4.D0);
                mn6 = (mn4)next;
            }
        }
        return mn6;
    }
    
    public static final mn4 y(final bo6 bo6) {
        czd.f((Object)bo6, "<this>");
        final vf3 d0 = bo6.D0;
        czd.e((Object)d0, "canonicalTweet");
        return x(d0);
    }
    
    public static final UserIdentifier z(final l99 l99) {
        czd.f((Object)l99, "<this>");
        final on4 d = l99.D;
        UserIdentifier f;
        final UserIdentifier userIdentifier = f = null;
        if (d != null) {
            final List a = d.a;
            f = userIdentifier;
            if (a != null) {
                while (true) {
                    for (final Object next : a) {
                        if (((mn4)next).a == nn4.E0) {
                            final mn4 mn4 = (mn4)next;
                            f = userIdentifier;
                            if (mn4 == null) {
                                return f;
                            }
                            final cgv b = mn4.b;
                            f = userIdentifier;
                            if (b != null) {
                                f = b.f();
                                return f;
                            }
                            return f;
                        }
                    }
                    Object next = null;
                    continue;
                }
            }
        }
        return f;
    }
    
    public Object a() {
        final qzy c = uzy.c;
        return ctz.E0.b().d();
    }
    
    public long b(final lo8 lo8, final apk apk) {
        czd.f((Object)lo8, "$this$calculateMouseWheelScroll");
        final List a = apk.a;
        Objects.requireNonNull(wfj.Companion);
        wfj wfj = new wfj(wfj.b);
        for (int size = a.size(), i = 0; i < size; ++i) {
            wfj = new wfj(wfj.h(wfj.a, ((hpk)a.get(i)).i));
        }
        return wfj.i(wfj.a, -lo8.t0((float)64));
    }
    
    public void c(final c$h c$h) {
        c$h.a((Throwable)new IllegalStateException());
    }
    
    public vsd d(final tws tws, final Object o, final Object o2) {
        final des des = (des)tws;
        final uws uws = (uws)o;
        final wzs wzs = (wzs)o2;
        czd.f((Object)des, "instruction");
        czd.f((Object)uws, "requestContext");
        return (vsd)new des$a(des.a);
    }
    
    public nwt j(pwt pwt, final ayt ayt, int n, final uzw uzw, final r78 r78, final ffz ffz, final xxt xxt) throws TranscoderException {
        final int ordinal = ((Enum)pwt).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return (nwt)new hyb(ayt, r78.h(pwt.F0), ffz, xxt);
                }
                final StringBuilder j = fu8.j("Cannot create track transcoder for track type ");
                j.append(((Enum)pwt).name());
                throw new TranscoderInitializationException(true, j.toString(), (Throwable)null);
            }
            else {
                pwt = pwt.E0;
                final yxt h = r78.h(pwt);
                if (n != 0) {
                    Object o;
                    if (--n != 1 && n != 2) {
                        o = new w41(ayt, h, ffz, xxt);
                    }
                    else {
                        o = new syj(pwt, h, ffz, xxt);
                    }
                    return (nwt)o;
                }
                throw null;
            }
        }
        else {
            pwt = pwt.D0;
            final yxt h2 = r78.h(pwt);
            if (n != 0) {
                Object o2;
                if (--n != 1 && n != 2) {
                    o2 = new n4x(ayt, uzw, h2, r78.a(), ffz, xxt);
                }
                else {
                    o2 = new syj(pwt, h2, ffz, xxt);
                }
                return (nwt)o2;
            }
            throw null;
        }
    }
}
