import android.view.View;
import java.util.concurrent.Executors;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import android.content.res.Resources;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import com.twitter.communities.subsystem.api.args.CommunitiesDetailContentViewArgs;
import android.graphics.Color;
import android.content.res.ColorStateList;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.material.button.MaterialButton;
import com.twitter.ui.components.button.legacy.TwitterButton;
import android.widget.Button;
import java.util.Objects;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.List;
import java.util.ArrayList;
import android.media.MediaFormat;
import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public class rrz implements dum, hyt, fzy
{
    public static final rrz D0;
    public static final int[] E0;
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
    public static final rrz T0;
    
    static {
        D0 = new rrz();
        E0 = new int[] { 2130970393, 2130970404, 2130970421, 2130970422, 2130970429 };
        F0 = new int[] { 2130970404, 2130970411, 2130970416, 2130970417, 2130970421, 2130970422, 2130970425 };
        G0 = new int[] { 2130968715, 2130968716, 2130968717, 2130968718 };
        H0 = new int[] { 2130968714, 2130970118 };
        I0 = new int[] { 2130970400, 2130970405, 2130970423 };
        J0 = new int[] { 2130970399, 2130970418 };
        K0 = new int[] { 2130969912 };
        L0 = new int[] { 2130970397, 2130970398, 2130970431, 2130970432 };
        M0 = new int[] { 2130970425, 2130970427, 2130970428 };
        N0 = new int[] { 2130970409 };
        O0 = new int[] { 2130970420 };
        P0 = new int[] { 2130970392, 2130970395, 2130970396, 2130970406, 2130970408, 2130970424 };
        Q0 = new int[] { 2130970433, 2130970434 };
        R0 = new int[] { 2130969232, 2130970861, 2130971124, 2130971125, 2130971126 };
        S0 = new int[] { 2130968771, 2130968883, 2130968999 };
        T0 = new rrz();
    }
    
    public rrz() {
    }
    
    public rrz(final cq0 cq0, final Set set) {
        final int g = ((qbu)cq0.d.getValue()).g("app_v", -1);
        final int e = cq0.e;
        if (cq0.a()) {
            cq0.c = true;
            final qbu$c i = ((qbu)cq0.d.getValue()).i();
            ((qbu$d)i).g("app_v", cq0.e);
            i.e();
        }
        for (final hq0 hq0 : set) {
            if (hq0.w0(g, e)) {
                ((Runnable)hq0).run();
            }
        }
    }
    
    public rrz(final msy msy) {
    }
    
    public static final boolean A() {
        final Class clazz = null;
        Class<?> forName;
        try {
            forName = Class.forName("org.junit.runners.ParentRunner");
        }
        catch (final ClassNotFoundException ex) {
            forName = null;
        }
        final boolean b = true;
        final boolean b2 = forName != null;
        boolean b3 = b;
        if (!b2) {
            Class<?> forName2;
            try {
                forName2 = Class.forName("org.junit.jupiter.api.AssertionUtils");
            }
            catch (final ClassNotFoundException ex2) {
                forName2 = clazz;
            }
            b3 = (forName2 != null && b);
        }
        return b3;
    }
    
    public static final boolean B(float n, float c, final long n2, float n3, float b) {
        n -= n3;
        n3 = c - b;
        b = nx6.b(n2);
        c = nx6.c(n2);
        n = n * n / (b * b);
        return n3 * n3 / (c * c) + n <= 1.0f;
    }
    
    public static void C(final MediaFormat mediaFormat, final MediaFormat mediaFormat2, final String s) {
        if (mediaFormat2.containsKey(s) && ("bitrate".equals(s) ^ true)) {
            mediaFormat.setInteger(s, mediaFormat2.getInteger(s));
        }
    }
    
    public static void D(final MediaFormat mediaFormat, final MediaFormat mediaFormat2, final String s) {
        if (mediaFormat2.containsKey(s) && ("bitrate".equals(s) ^ true)) {
            mediaFormat.setString(s, mediaFormat2.getString(s));
        }
    }
    
    public static final Object E(Object o, final Object o2) {
        if (o == null) {
            o = o2;
        }
        else if (o instanceof ArrayList) {
            ((ArrayList)o).add(o2);
        }
        else {
            final ArrayList list = new ArrayList(4);
            list.add(o);
            list.add(o2);
            o = list;
        }
        return o;
    }
    
    public static final String F(final h6i h6i) {
        czd.f((Object)h6i, "<this>");
        final String e = h6i.e();
        czd.e((Object)e, "asString()");
        final boolean contains = jre.a.contains(e);
        final int n = 0;
        int n2 = 0;
        Label_0103: {
            Label_0101: {
                if (!contains) {
                    int i = 0;
                    while (true) {
                        while (i < e.length()) {
                            final char char1 = e.charAt(i);
                            if (!Character.isLetterOrDigit(char1) && char1 != '_') {
                                final boolean b = true;
                                n2 = n;
                                if (b) {
                                    break Label_0101;
                                }
                                break Label_0103;
                            }
                            else {
                                ++i;
                            }
                        }
                        final boolean b = false;
                        continue;
                    }
                }
            }
            n2 = 1;
        }
        String s;
        if (n2 != 0) {
            final StringBuilder sb = new StringBuilder();
            final String e2 = h6i.e();
            czd.e((Object)e2, "asString()");
            final StringBuilder sb2 = new StringBuilder();
            sb2.append('`');
            sb2.append(e2);
            sb.append(sb2.toString());
            sb.append('`');
            s = sb.toString();
        }
        else {
            s = h6i.e();
            czd.e((Object)s, "asString()");
        }
        return s;
    }
    
    public static final String G(final List list) {
        final StringBuilder sb = new StringBuilder();
        for (final h6i h6i : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(F(h6i));
        }
        final String string = sb.toString();
        czd.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public static void H(final Class clazz) {
        final String name = clazz.getName();
        eno.c((Throwable)new ProtocolViolationException(zh8.o("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }
    
    public static final gtd I(final gtd gtd) {
        final gtd$a companion = gtd.Companion;
        final int e0 = gtd.E0;
        final int d0 = gtd.D0;
        final int n = -gtd.F0;
        Objects.requireNonNull(companion);
        return new gtd(e0, d0, n);
    }
    
    public static final void J(final cbw cbw, final String s, final String s2) {
        czd.f((Object)cbw, "reporter");
        final af4 af4 = new af4();
        ((u0p)af4).T = vba.Companion.e("settings", s, "", s2, "click").toString();
        final int a = c5j.a;
        cbw.c((elm)af4);
    }
    
    public static final void K(final cbw cbw, final String s) {
        czd.f((Object)cbw, "reporter");
        final af4 af4 = new af4();
        ((u0p)af4).T = vba.Companion.e("settings", s, "", "", "impression").toString();
        final int a = c5j.a;
        cbw.c((elm)af4);
    }
    
    public static final void L(final Button button, final int fillColor, final int fillPressedColor) {
        czd.f((Object)button, "<this>");
        if (button instanceof TwitterButton) {
            final TwitterButton twitterButton = (TwitterButton)button;
            twitterButton.setFillColor(fillColor);
            twitterButton.setFillPressedColor(fillPressedColor);
        }
        else {
            if (!(button instanceof MaterialButton)) {
                Q(button);
                throw null;
            }
            ((MaterialButton)button).setBackgroundTintList(P(fillColor));
        }
    }
    
    public static final void M(final Button button) {
        czd.f((Object)button, "<this>");
        if (button instanceof TwitterButton) {
            ((TwitterButton)button).setBounded(true);
        }
        else {
            if (!(button instanceof MaterialButton)) {
                Q(button);
                throw null;
            }
            final MaterialButton materialButton = (MaterialButton)button;
            materialButton.setStrokeWidth(((View)materialButton).getResources().getDimensionPixelSize(2131167430));
        }
    }
    
    public static boolean N(final AtomicReference atomicReference, final t19 t19, final Class clazz) {
        Objects.requireNonNull(t19, "next is null");
        if (!atomicReference.compareAndSet(null, t19)) {
            t19.dispose();
            if (atomicReference.get() != b29.D0) {
                H(clazz);
            }
            return false;
        }
        return true;
    }
    
    public static final gtd O(final gtd gtd, int n) {
        czd.f((Object)gtd, "<this>");
        final boolean b = n > 0;
        final Integer value = n;
        czd.f((Object)value, "step");
        if (b) {
            final gtd$a companion = gtd.Companion;
            final int d0 = gtd.D0;
            final int e0 = gtd.E0;
            if (gtd.F0 <= 0) {
                n = -n;
            }
            Objects.requireNonNull(companion);
            return new gtd(d0, e0, n);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Step must be positive, was: ");
        sb.append(value);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final ColorStateList P(final int n) {
        return new ColorStateList(new int[][] { { 16842910 }, { -16842910 } }, new int[] { n, Color.argb(zyz.n(Color.alpha(n) * 0.6f), Color.red(n), Color.green(n), Color.blue(n)) });
    }
    
    public static final Void Q(final Button button) {
        final String canonicalName = button.getClass().getCanonicalName();
        final StringBuilder sb = new StringBuilder();
        sb.append("This method is only meant to be used for migrating TwitterButton to MaterialButton. ");
        sb.append(canonicalName);
        sb.append(" is not supported.");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public static final itd R(final int n, final int n2) {
        if (n2 <= Integer.MIN_VALUE) {
            Objects.requireNonNull(itd.Companion);
            return itd.G0;
        }
        return new itd(n, n2 - 1);
    }
    
    public static Object[] T(final Object[] array, final int n) {
        for (int i = 0; i < n; ++i) {
            if (array[i] == null) {
                throw new NullPointerException(jxa.p(20, "at index ", i));
            }
        }
        return array;
    }
    
    public static ijb f(final int n, final pkb pkb) {
        Objects.requireNonNull(lkb.Companion);
        Objects.requireNonNull(xjb.Companion);
        czd.f((Object)pkb, "weight");
        return (ijb)new crm(n, pkb, 0, new okb(new nkb[0]), 0);
    }
    
    public static final String g(final CommunitiesDetailContentViewArgs communitiesDetailContentViewArgs) {
        String communityId;
        if ((communityId = communitiesDetailContentViewArgs.getCommunityId()) == null) {
            final tg5 community = communitiesDetailContentViewArgs.getCommunity();
            String g;
            if (community != null) {
                g = community.g;
            }
            else {
                g = null;
            }
            czd.c((Object)g);
            communityId = g;
        }
        return communityId;
    }
    
    public static int h(final int n, final int n2, final int n3) {
        return Math.min(Math.max(0, n3 - n), n2);
    }
    
    public static okh i(final okh okh) {
        final o4r m0 = rp9.M0(0.0f, null, 7);
        czd.f((Object)okh, "<this>");
        final wrd$a a = wrd.a;
        return w66.a(okh, (qsb)wrd.a, (itb)new ob0(null, (uza<ltd>)m0));
    }
    
    public static void j(final int n, final int n2, final int n3, final int n4, final int n5) {
        final boolean b = true;
        fli.m(Boolean.valueOf(n4 >= 0));
        fli.m(Boolean.valueOf(n >= 0));
        fli.m(Boolean.valueOf(n3 >= 0));
        fli.m(Boolean.valueOf(n + n4 <= n5));
        fli.m(Boolean.valueOf(n3 + n4 <= n2 && b));
    }
    
    public static Object k(final Object o, final int n) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(jxa.p(20, "at index ", n));
    }
    
    public static final okh l(final okh okh, final frp frp) {
        czd.f((Object)okh, "<this>");
        czd.f((Object)frp, "shape");
        return wj1.o(okh, 0.0f, 0.0f, 0.0f, 0.0f, frp, true, 59391);
    }
    
    public static final okh m(final okh okh) {
        czd.f((Object)okh, "<this>");
        return wj1.o(okh, 0.0f, 0.0f, 0.0f, 0.0f, (frp)null, true, 61439);
    }
    
    public static final double n(final double n, final double n2, final double n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final float o(final float n, final float n2, final float n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final int p(final int n, final int n2, final int n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final int q(final int n, final jj4 jj4) {
        if (jj4 instanceof ij4) {
            return ((Number)s(n, (ij4)jj4)).intValue();
        }
        final itd itd = (itd)jj4;
        if (!itd.isEmpty()) {
            int n2;
            if (n < itd.o().intValue()) {
                n2 = itd.o().intValue();
            }
            else if ((n2 = n) > itd.m().intValue()) {
                n2 = itd.m().intValue();
            }
            return n2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(jj4);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final long r(final long n, final long n2, final long n3) {
        if (n2 > n3) {
            final StringBuilder x = pd.x("Cannot coerce value to an empty range: maximum ", n3, " is less than minimum ");
            x.append(n2);
            x.append('.');
            throw new IllegalArgumentException(x.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final Comparable s(final Comparable comparable, final ij4 ij4) {
        czd.f((Object)comparable, "<this>");
        czd.f((Object)ij4, "range");
        if (!ij4.isEmpty()) {
            Comparable comparable2;
            if (ij4.e(comparable, ((jj4)ij4).g()) && !ij4.e(((jj4)ij4).g(), comparable)) {
                comparable2 = ((jj4)ij4).g();
            }
            else {
                comparable2 = comparable;
                if (ij4.e(((jj4)ij4).i(), comparable)) {
                    comparable2 = comparable;
                    if (!ij4.e(comparable, ((jj4)ij4).i())) {
                        comparable2 = ((jj4)ij4).i();
                    }
                }
            }
            return comparable2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(ij4);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final gtd t(final int n, final int n2) {
        Objects.requireNonNull(gtd.Companion);
        return new gtd(n, n2, -1);
    }
    
    public static final Activity u(Context baseContext) {
        czd.f((Object)baseContext, "<this>");
        while (!(baseContext instanceof Activity)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
            czd.e((Object)baseContext, "baseContext");
        }
        return (Activity)baseContext;
    }
    
    public static final bib v(final exj exj) {
        czd.f((Object)exj, "<this>");
        final cgv i0 = exj.I0;
        int i2;
        if (i0 != null) {
            i2 = i0.I1;
        }
        else {
            i2 = 128;
        }
        Object o;
        if (chw.p0(i2)) {
            o = bib.G0;
        }
        else if (chw.d0(i2)) {
            o = bib.F0;
        }
        else if (chw.b0(i2)) {
            o = bib.H0;
        }
        else if (czd.a((Object)chw.m0(i2), (Object)Boolean.TRUE)) {
            o = bib.I0;
        }
        else if (chw.Y(i2)) {
            o = bib.J0;
        }
        else {
            o = bib.D0;
        }
        return (bib)o;
    }
    
    public static String w(final Resources resources, final String s) {
        return resources.getString(2131956782, new Object[] { s });
    }
    
    public static int x(final MediaFormat mediaFormat, final int n) {
    Label_0036_Outer:
        while (true) {
            if (mediaFormat.containsKey("frame-rate")) {
                try {
                    final int n2 = Math.round(mediaFormat.getFloat("frame-rate"));
                    break Label_0038;
                }
                catch (final Exception ex) {
                    final MediaFormat mediaFormat2 = mediaFormat;
                    final String s = "frame-rate";
                    final int n2 = mediaFormat2.getInteger(s);
                    break Label_0038;
                }
                break Label_0038;
            }
            while (true) {
                break Label_0036;
                try {
                    final MediaFormat mediaFormat2 = mediaFormat;
                    final String s = "frame-rate";
                    int n2 = mediaFormat2.getInteger(s);
                    if (n2 == 0) {
                        return n;
                    }
                    return n2;
                    n2 = 0;
                    continue Label_0036_Outer;
                }
                catch (final Exception ex2) {
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    public static final pkb y(final pkb$a pkb$a) {
        czd.f((Object)pkb$a, "<this>");
        return pkb.O0;
    }
    
    public static final boolean z(final lzj lzj, final float n, final float n2) {
        final c6m c6m = new c6m(n - 0.005f, n2 - 0.005f, n + 0.005f, n2 + 0.005f);
        final g50 g50 = (g50)rp9.v();
        g50.l(c6m);
        final lzj v = rp9.v();
        Objects.requireNonNull(wzj.Companion);
        final g50 g51 = (g50)v;
        g51.m(lzj, (lzj)g50, 1);
        final boolean empty = ((lzj)g51).isEmpty();
        ((lzj)g51).c();
        ((lzj)g50).c();
        return empty ^ true;
    }
    
    public ExecutorService S(final int n, final ThreadFactory threadFactory) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(n, n, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
    
    public Object a() {
        final qzy c = uzy.c;
        return ((kuz)juz.E0.D0.a()).a();
    }
    
    public int b() {
        return 2131624051;
    }
    
    public boolean c() {
        return false;
    }
    
    public pj d(final String s, final ti2 ti2) {
        return (pj)new ytm(s, ti2);
    }
    
    public int e() {
        return 1;
    }
}
