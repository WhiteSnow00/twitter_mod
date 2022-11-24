import androidx.fragment.app.Fragment;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.twitter.util.user.UserIdentifier;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.content.Intent;
import java.util.Calendar;
import android.content.SharedPreferences$Editor;
import android.preference.PreferenceManager;
import android.content.SharedPreferences;
import java.util.HashSet;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import java.io.Closeable;
import android.database.Cursor;
import android.os.IBinder;
import java.util.Locale;
import android.text.SpannableStringBuilder;
import java.util.Objects;
import android.content.ContentValues;
import android.os.Bundle;
import com.twitter.ui.components.button.legacy.ToggleTwitterButton;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import java.util.WeakHashMap;
import java.lang.reflect.Method;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.graphics.drawable.ColorDrawable;
import java.util.Arrays;
import android.view.ContextThemeWrapper;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.EOFException;
import java.util.LinkedHashSet;
import java.util.Collection;
import android.os.Build$VERSION;
import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import java.util.Iterator;
import org.checkerframework.dataflow.qual.Pure;
import com.google.android.exoplayer2.ParserException;
import android.os.Parcelable;
import android.view.ViewParent;
import android.view.View;
import android.os.Parcel;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class xd implements rok$a, rbx, a5j, px8, c0z, xij
{
    public static fr4 F0;
    public static final xd G0;
    public static final xd H0;
    public static final v4s I0;
    public static final v4s J0;
    public static final int[] K0;
    public static final int[] L0;
    public static final int[] M0;
    public static final int[] N0;
    public static final int[] O0;
    public static final int[] P0;
    public static final int[] Q0;
    public static final xd R0;
    public static final xd S0;
    public static final xd T0;
    public static final xd U0;
    
    static {
        G0 = new xd();
        H0 = new xd();
        I0 = new v4s("CONDITION_FALSE");
        J0 = new v4s("LIST_EMPTY");
        K0 = new int[] { 2130971120 };
        L0 = new int[] { 2130969033 };
        M0 = new int[] { 16843173, 16843551, 16844359, 2130968669, 2130969903 };
        N0 = new int[] { 2130969548, 2130969549, 2130969550, 2130969551, 2130969552, 2130969553, 2130969554 };
        O0 = new int[] { 16844082, 16844083, 16844095, 16844143, 16844144, 2130969541, 2130969555, 2130969556, 2130969557, 2130971022 };
        P0 = new int[] { 16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051 };
        Q0 = new int[] { 16843173, 16844052 };
        R0 = new xd();
        S0 = new xd();
        T0 = new xd();
        U0 = new xd();
    }
    
    public static List A(final byte[] array) {
        final long n = ((array[11] & 0xFF) << 8 | (array[10] & 0xFF)) * 1000000000L / 48000L;
        final ArrayList list = new ArrayList(3);
        list.add(array);
        list.add(B(n));
        list.add(B(80000000L));
        return list;
    }
    
    public static boolean A0(final boolean b, final qdw qdw) {
        final boolean g = qdw.g();
        final boolean b2 = true;
        final boolean b3 = g && yds.b();
        final qgv user = qdw.getUser();
        return b && (user != null && (user.g() || flr.e((CharSequence)user.G0)) && flr.e((CharSequence)user.g1) && flr.e((CharSequence)user.I0.F0) && flr.e((CharSequence)user.S0)) && !b3 && b2;
    }
    
    public static int A1(@NullableDecl final Object o, @NullableDecl final Object o2, final int n, final Object o3, final int[] array, final Object[] array2, @NullableDecl final Object[] array3) {
        final int y0 = bs4.y0(o);
        final int n2 = y0 & n;
        int c1 = C1(o3, n2);
        if (c1 != 0) {
            final int n3 = ~n;
            int n4 = -1;
            while (true) {
                --c1;
                final int n5 = array[c1];
                if ((n5 & n3) == (y0 & n3) && p0b.S(o, array2[c1]) && (array3 == null || p0b.S(o2, array3[c1]))) {
                    final int n6 = n5 & n;
                    if (n4 == -1) {
                        F1(o3, n2, n6);
                    }
                    else {
                        array[n4] = ((n6 & n) | (array[n4] & n3));
                    }
                    return c1;
                }
                final int n7 = n5 & n;
                if (n7 == 0) {
                    break;
                }
                n4 = c1;
                c1 = n7;
            }
        }
        return -1;
    }
    
    public static byte[] B(final long n) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(n).array();
    }
    
    public static boolean B0() {
        return ita.b().b("composer_android_hide_keyboard_less_enabled", false);
    }
    
    public static void B1(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(n - 4);
        parcel.writeInt(dataPosition - n);
        parcel.setDataPosition(dataPosition);
    }
    
    public static final float C(final View view) {
        e0e.f((Object)view, "<this>");
        ViewParent viewParent = view.getParent();
        float n = 0.0f;
        float n2;
        while (true) {
            n2 = n;
            if (!(viewParent instanceof View)) {
                break;
            }
            final View view2 = (View)viewParent;
            n += view2.getElevation();
            if (view2.getId() == 2131428647) {
                n2 = n;
                break;
            }
            viewParent = viewParent.getParent();
        }
        return n2;
    }
    
    public static final boolean C0(final lrn lrn) {
        e0e.f((Object)lrn, "<this>");
        return lrn.u == mrn.G0;
    }
    
    public static int C1(final Object o, final int n) {
        if (o instanceof byte[]) {
            return ((byte[])o)[n] & 0xFF;
        }
        if (o instanceof short[]) {
            return (char)((short[])o)[n];
        }
        return ((int[])o)[n];
    }
    
    public static void D(final Boolean b) {
        if (b != null && !b) {
            throw new IllegalArgumentException();
        }
    }
    
    public static final boolean D0(final pkl pkl) {
        e0e.f((Object)pkl, "<this>");
        return pkl.f() == null;
    }
    
    public static Object D1(final int n) {
        if (n < 2 || n > 1073741824 || Integer.highestOneBit(n) != n) {
            throw new IllegalArgumentException(go9.p(52, "must be power of 2 between 2^1 and 2^30: ", n));
        }
        if (n <= 256) {
            return new byte[n];
        }
        if (n <= 65536) {
            return new short[n];
        }
        return new int[n];
    }
    
    public static void E(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(o));
    }
    
    public static final boolean E0(final lrn lrn) {
        e0e.f((Object)lrn, "<this>");
        return fbx.K(lrn.K);
    }
    
    public static void E1(final Parcel parcel, final Parcelable parcelable, int dataPosition) {
        final int dataPosition2 = parcel.dataPosition();
        parcel.writeInt(1);
        final int dataPosition3 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        parcel.setDataPosition(dataPosition2);
        parcel.writeInt(dataPosition - dataPosition3);
        parcel.setDataPosition(dataPosition);
    }
    
    public static void F(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(o));
    }
    
    public static final boolean F0(final lrn lrn) {
        e0e.f((Object)lrn, "<this>");
        return E0(lrn) ^ true;
    }
    
    public static void F1(final Object o, final int n, final int n2) {
        if (o instanceof byte[]) {
            ((byte[])o)[n] = (byte)n2;
            return;
        }
        if (o instanceof short[]) {
            ((short[])o)[n] = (short)n2;
            return;
        }
        ((int[])o)[n] = n2;
    }
    
    public static int G(final int n) {
        if (n >= 0) {
            return n;
        }
        throw new IllegalArgumentException();
    }
    
    public static final boolean G0(final lrn lrn) {
        e0e.f((Object)lrn, "<this>");
        return F0(lrn) && lrn.H != null;
    }
    
    public static int H(final int n, final String s) {
        if (n >= 0) {
            return n;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static final boolean H0(final long n, final long n2) {
        final int j = vj6.j(n);
        final int h = vj6.h(n);
        final int n3 = (int)(n2 >> 32);
        boolean b = true;
        if (j <= n3 && n3 <= h) {
            final int i = vj6.i(n);
            final int g = vj6.g(n);
            final int b2 = nud.b(n2);
            if (i <= b2 && b2 <= g) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @Pure
    public static void I(final boolean b, final String s) throws ParserException {
        if (b) {
            return;
        }
        throw ParserException.a(s, (Throwable)null);
    }
    
    public static boolean I0() {
        return ita.b().b("self_thread_composer_reply_threads", false);
    }
    
    public static Object J(final Object o, final Object o2) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(String.valueOf(o2));
    }
    
    public static boolean J0(final char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }
    
    public static Object K(final Object o, final Object o2) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(String.valueOf(o2));
    }
    
    public static final wgq K0(final Iterable iterable) {
        final wgq wgq = new wgq();
        for (final Object next : iterable) {
            final a4h a4h = (a4h)next;
            if (a4h != null && a4h != a4h$b.a) {
                wgq.add(next);
            }
        }
        return wgq;
    }
    
    public static final void L(final long n, final dpj dpj) {
        final dpj f0 = dpj.F0;
        final int n2 = 0;
        boolean b = false;
        if (dpj == f0) {
            if (vj6.g(n) != Integer.MAX_VALUE) {
                b = true;
            }
            if (!b) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        }
        else {
            int n3 = n2;
            if (vj6.h(n) != Integer.MAX_VALUE) {
                n3 = 1;
            }
            if (n3 == 0) {
                throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        }
    }
    
    public static final void L0(final List list, final mk2 mk2) {
        e0e.f((Object)list, "sessions");
        e0e.f((Object)mk2, "logger");
        if (list.isEmpty()) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Current Sessions from Guest Service :");
        int n;
        if (list.isEmpty()) {
            n = 0;
        }
        else {
            final Iterator iterator = list.iterator();
            n = 0;
            while (iterator.hasNext()) {
                final Integer h = ((mac)iterator.next()).h();
                boolean b = false;
                Label_0109: {
                    if (h != null) {
                        if (h == 1) {
                            b = true;
                            break Label_0109;
                        }
                    }
                    b = false;
                }
                if (b) {
                    if (++n >= 0) {
                        continue;
                    }
                    shw.T0();
                    throw null;
                }
            }
        }
        for (final mac mac : list) {
            final Integer h2 = mac.h();
            e0e.d((Object)h2, "null cannot be cast to non-null type kotlin.Int");
            final int intValue = h2;
            if (intValue != 1) {
                final String j = tqb.J(tqb.u(intValue));
                final StringBuilder k = l58.k("\n - ", mac.g(), "(", mac.f(), ") : ");
                k.append(j);
                sb.append(k.toString());
            }
        }
        if (n > 0) {
            final int g = lb0.G(2);
            String s;
            if (g != 0) {
                if (g != 1) {
                    if (g != 2) {
                        if (g != 3) {
                            if (g != 4) {
                                if (g != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s = "Removed";
                            }
                            else {
                                s = "Added";
                            }
                        }
                        else {
                            s = "Countdown";
                        }
                    }
                    else {
                        s = "Connecting";
                    }
                }
                else {
                    s = "Pending";
                }
            }
            else {
                s = "Unknown";
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("\n + ");
            sb2.append(n);
            sb2.append(" ");
            sb2.append(s);
            sb.append(sb2.toString());
        }
        mk2.i(sb.toString(), false);
    }
    
    public static void M(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static phh M0(final String s) {
        final phh l0 = phh.L0;
        if (s == null) {
            return l0;
        }
        for (final phh phh : phh.values()) {
            if (phh.I0.equals(s)) {
                return phh;
            }
        }
        r9a.d((Throwable)new IllegalArgumentException(mqb.l("Unknown mode ", s)));
        return l0;
    }
    
    public static void N(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(o));
    }
    
    public static final mml N0(final ptb ptb) {
        e0e.f((Object)ptb, "defaultFactory");
        return new mml(ptb);
    }
    
    public static void O(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static final long O0(final long n, final float n2) {
        long b = n;
        if (!Float.isNaN(n2)) {
            if (n2 >= 1.0f) {
                b = n;
            }
            else {
                b = sr4.b(n, sr4.d(n) * n2);
            }
        }
        return b;
    }
    
    public static int P(int n) {
        n = (n & ~(n >> 31)) - 255;
        return (n & n >> 31) + 255;
    }
    
    public static final long P0(final long n, int n2, int n3) {
        final int n4 = vj6.j(n) + n2;
        final int n5 = 0;
        int n6 = n4;
        if (n4 < 0) {
            n6 = 0;
        }
        final int h = vj6.h(n);
        if (h == Integer.MAX_VALUE) {
            n2 = h;
        }
        else if ((n2 += h) < 0) {
            n2 = 0;
        }
        int n7;
        if ((n7 = vj6.i(n) + n3) < 0) {
            n7 = 0;
        }
        final int g = vj6.g(n);
        if (g == Integer.MAX_VALUE) {
            n3 = g;
        }
        else if ((n3 += g) < 0) {
            n3 = n5;
        }
        return h(n6, n2, n7, n3);
    }
    
    public static final long Q(final int n, final d86 d86) {
        final sa6$b a = sa6.a;
        final Context context = (Context)d86.m((df6)z20.b);
        long n2;
        if (Build$VERSION.SDK_INT >= 23) {
            n2 = ds4.a.a(context, n);
        }
        else {
            n2 = yru.d(context.getResources().getColor(n));
        }
        return n2;
    }
    
    public static final Collection R(final Collection collection, final Collection collection2) {
        e0e.f((Object)collection2, "collection");
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
    
    public static boolean R0(final roa roa, final byte[] array, final int n, final boolean b) throws IOException {
        try {
            return roa.c(array, 0, n, b);
        }
        catch (final EOFException ex) {
            if (b) {
                return false;
            }
            throw ex;
        }
    }
    
    public static final long S(final long n, final long n2) {
        return shw.f(jb2.F((int)(n2 >> 32), vj6.j(n), vj6.h(n)), jb2.F(nud.b(n2), vj6.i(n), vj6.g(n)));
    }
    
    public static final void S0(final Object[] array, final int n) {
        e0e.f((Object)array, "<this>");
        array[n] = null;
    }
    
    public static final long T(final long n, final long n2) {
        return h(jb2.F(vj6.j(n2), vj6.j(n), vj6.h(n)), jb2.F(vj6.h(n2), vj6.j(n), vj6.h(n)), jb2.F(vj6.i(n2), vj6.i(n), vj6.g(n)), jb2.F(vj6.g(n2), vj6.i(n), vj6.g(n)));
    }
    
    public static final void T0(final Object[] array, int i, final int n) {
        e0e.f((Object)array, "<this>");
        while (i < n) {
            array[i] = null;
            ++i;
        }
    }
    
    public static final int U(final long n, final int n2) {
        return jb2.F(n2, vj6.i(n), vj6.g(n));
    }
    
    public static void U0(final View view, final float n) {
        final Drawable background = view.getBackground();
        if (background instanceof jog) {
            ((jog)background).p(n);
        }
    }
    
    public static final int V(final long n, final int n2) {
        return jb2.F(n2, vj6.j(n), vj6.h(n));
    }
    
    public static final void V0(final jog jog, final Context context, final boolean b) {
        e0e.f((Object)jog, "<this>");
        e0e.f((Object)context, "context");
        final fz9 b2 = jog.F0.b;
        if (b == (b2 != null && b2.a)) {
            return;
        }
        if (b) {
            jog.n(context);
        }
        else {
            jog.n((Context)new ContextThemeWrapper(context, 2132018813));
        }
    }
    
    public static final Object[] W(Object[] copy, final int n) {
        e0e.f((Object)copy, "<this>");
        copy = Arrays.copyOf(copy, n);
        e0e.e((Object)copy, "copyOf(this, newSize)");
        return copy;
    }
    
    public static void W0(final lj6 lj6, final View view, final float[] array) {
        final Class<? extends View> class1 = view.getClass();
        final StringBuilder f = ehk.f("set");
        f.append(lj6.b);
        final String string = f.toString();
        try {
            final int g = lb0.G(lj6.c);
            boolean b = true;
            switch (g) {
                case 6: {
                    class1.getMethod(string, Float.TYPE).invoke(view, array[0]);
                    break;
                }
                case 5: {
                    final Method method = class1.getMethod(string, Boolean.TYPE);
                    if (array[0] <= 0.5f) {
                        b = false;
                    }
                    method.invoke(view, b);
                    break;
                }
                case 4: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("unable to interpolate strings ");
                    sb.append(lj6.b);
                    throw new RuntimeException(sb.toString());
                }
                case 3: {
                    final Method method2 = class1.getMethod(string, Drawable.class);
                    final int p3 = P((int)((float)Math.pow(array[0], 0.45454545454545453) * 255.0f));
                    final int p4 = P((int)((float)Math.pow(array[1], 0.45454545454545453) * 255.0f));
                    final int p5 = P((int)((float)Math.pow(array[2], 0.45454545454545453) * 255.0f));
                    final int p6 = P((int)(array[3] * 255.0f));
                    final ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(p3 << 16 | p6 << 24 | p4 << 8 | p5);
                    method2.invoke(view, colorDrawable);
                    break;
                }
                case 2: {
                    class1.getMethod(string, Integer.TYPE).invoke(view, P((int)((float)Math.pow(array[0], 0.45454545454545453) * 255.0f)) << 16 | P((int)(array[3] * 255.0f)) << 24 | P((int)((float)Math.pow(array[1], 0.45454545454545453) * 255.0f)) << 8 | P((int)((float)Math.pow(array[2], 0.45454545454545453) * 255.0f)));
                    break;
                }
                case 1: {
                    class1.getMethod(string, Float.TYPE).invoke(view, array[0]);
                    break;
                }
                case 0: {
                    class1.getMethod(string, Integer.TYPE).invoke(view, (int)array[0]);
                    break;
                }
            }
        }
        catch (final InvocationTargetException ex) {
            ex.printStackTrace();
        }
        catch (final IllegalAccessException ex2) {
            final StringBuilder b2 = po.B("cannot access method ", string, " on View \"");
            b2.append(ob8.d(view));
            b2.append("\"");
            Log.e("CustomSupport", b2.toString());
            ex2.printStackTrace();
        }
        catch (final NoSuchMethodException ex3) {
            final StringBuilder b3 = po.B("no method ", string, " on View \"");
            b3.append(ob8.d(view));
            b3.append("\"");
            Log.e("CustomSupport", b3.toString());
            ex3.printStackTrace();
        }
    }
    
    public static final yp2 X(final hp6 hp6) {
        yp2 y;
        if (hp6 != null) {
            y = Y(hp6, hp6.G0);
        }
        else {
            y = null;
        }
        return y;
    }
    
    public static void X0(final View view) {
        final Drawable background = view.getBackground();
        if (background instanceof jog) {
            Y0(view, (jog)background);
        }
    }
    
    public static final yp2 Y(final hp6 e, final gjl a) {
        yp2 yp2 = null;
        final yp2.a a2 = null;
        if (e != null) {
            final zp2$a zp2$a = new zp2$a();
            zp2$a.a = a;
            final ck3 z0 = e.F0.Z0;
            yp2.a e2 = a2;
            if (z0 != null) {
                e2 = e0(z0, a);
            }
            zp2$a.b = e2;
            zp2$a.c = (n1p)new wru(e);
            zp2$a.d = e.D();
            zp2$a.e = e;
            yp2 = (yp2)((z4j)zp2$a).e();
        }
        return yp2;
    }
    
    public static void Y0(final View view, final jog jog) {
        final fz9 b = jog.F0.b;
        if (b != null && b.a) {
            ViewParent viewParent = view.getParent();
            float n = 0.0f;
            while (viewParent instanceof View) {
                final View view2 = (View)viewParent;
                final WeakHashMap a = b7x.a;
                n += b7x$i.i(view2);
                viewParent = viewParent.getParent();
            }
            jog.s(n);
        }
    }
    
    public static final List Z(final Resources resources) {
        e0e.f((Object)resources, "resources");
        final String string = resources.getString(2131957056);
        e0e.e((Object)string, "resources.getString(R.st\u2026oadcast_reason_self_harm)");
        final wl wl = new wl(0, 1, string, (String)null, 2131099845, (String)null, (String)null, 2024);
        final String string2 = resources.getString(2131957058);
        e0e.e((Object)string2, "resources.getString(R.st\u2026roadcast_reason_violence)");
        final wl wl2 = new wl(0, 2, string2, (String)null, 2131099845, (String)null, (String)null, 2024);
        final String string3 = resources.getString(2131957051);
        e0e.e((Object)string3, "resources.getString(\n   \u2026ehavior\n                )");
        final wl wl3 = new wl(0, 3, string3, (String)null, 2131099845, (String)null, (String)null, 2024);
        final String string4 = resources.getString(2131957057);
        e0e.e((Object)string4, "resources.getString(R.st\u2026st_reason_sexual_content)");
        final wl wl4 = new wl(0, 4, string4, (String)null, 2131099845, (String)null, (String)null, 2024);
        final String string5 = resources.getString(2131957052);
        e0e.e((Object)string5, "resources.getString(R.st\u2026cast_reason_child_safety)");
        final wl wl5 = new wl(0, 5, string5, (String)null, 2131099845, (String)null, (String)null, 2024);
        final String string6 = resources.getString(2131957055);
        e0e.e((Object)string6, "resources.getString(\n   \u2026rmation\n                )");
        return shw.y0((Object[])new wl[] { wl, wl2, wl3, wl4, wl5, new wl(0, 6, string6, (String)null, 2131099845, (String)null, (String)null, 2024) });
    }
    
    public static boolean Z0() {
        return ita.c().b("android_growth_performance_holdback_perf_delay_video_chrome_view_inflation_enabled", false);
    }
    
    public static final jog a0(final View view) {
        e0e.f((Object)view, "<this>");
        final jog e = jog.e(view.getContext(), 0.0f);
        final Context context = view.getContext();
        e0e.e((Object)context, "context");
        e.q(ColorStateList.valueOf(b1b.B(context, 2130969036)));
        if (ita.c().b("android_ui_bottomsheet_elevation_overlay_enabled", false)) {
            e.p(view.getElevation());
            e.s(C(view));
        }
        return e;
    }
    
    public static boolean a1() {
        return ita.c().b("android_growth_performance_holdback_perf_optimize_tweet_composite_header", false);
    }
    
    public static omi b0(final int n) {
        if (n == 0) {
            return new zlo();
        }
        if (n != 1) {
            return new zlo();
        }
        return new le7();
    }
    
    public static boolean b1() {
        return ita.c().b("android_growth_performance_holdback_perf_user_image_view_enabled", false);
    }
    
    public static vq9 c0() {
        return new vq9((j98)null);
    }
    
    public static final qkb$b d0(final Context context) {
        return (qkb$b)new skb((aik)new x30(context), (nik)a40.a(context));
    }
    
    public static final ghi d1(final ck3 ck3) {
        final gj3 h0 = gj3.H0;
        e0e.f((Object)ck3, "<this>");
        final String a = ck3.a;
        final int hashCode = a.hashCode();
        if (hashCode != -1388271465) {
            if (hashCode == 599169924) {
                if (a.equals("3337203208:newsletter_issue")) {
                    String g = ck3.g("issue_title");
                    if (g == null) {
                        g = "";
                    }
                    String g2 = ck3.g("newsletter_title");
                    if (g2 == null) {
                        g2 = "";
                    }
                    final String g3 = ck3.g("issue_description");
                    final String g4 = ck3.g("sample_url");
                    String string;
                    if (g4 != null) {
                        string = wlr.Z1((CharSequence)g4).toString();
                    }
                    else {
                        string = null;
                    }
                    final b8d c = ck3.c("issue_image");
                    String g5 = ck3.g("revue_account_id");
                    if (g5 == null) {
                        g5 = "";
                    }
                    final String g6 = ck3.g("issue_url");
                    String string2 = null;
                    Label_0200: {
                        if (g6 != null) {
                            string2 = wlr.Z1((CharSequence)g6).toString();
                            if (string2 != null) {
                                break Label_0200;
                            }
                        }
                        string2 = "";
                    }
                    final String g7 = ck3.g("newsletter_profile_url");
                    if (g7 != null) {
                        final String string3 = wlr.Z1((CharSequence)g7).toString();
                        if (string3 != null) {
                            return (ghi)new cii(g, g2, g3, string, c, g5, string2, string3, ck3.g("issue_number"), (String)null, (String)null, (String)null, ck3.g("twitter_user_id"), h0, jji.H0, false, false);
                        }
                    }
                    final String string3 = "";
                    final Object o = new cii(g, g2, g3, string, c, g5, string2, string3, ck3.g("issue_number"), (String)null, (String)null, (String)null, ck3.g("twitter_user_id"), h0, jji.H0, false, false);
                    return (ghi)o;
                }
            }
        }
        else if (a.equals("3337203208:newsletter_publication")) {
            String g8;
            if ((g8 = ck3.g("newsletter_title")) == null) {
                g8 = "";
            }
            final String g9 = ck3.g("newsletter_description");
            String string4;
            if (g9 != null) {
                string4 = wlr.Z1((CharSequence)g9).toString();
            }
            else {
                string4 = null;
            }
            final String g10 = ck3.g("sample_url");
            String string5;
            if (g10 != null) {
                string5 = wlr.Z1((CharSequence)g10).toString();
            }
            else {
                string5 = null;
            }
            final b8d c2 = ck3.c("newsletter_image");
            final String g11 = ck3.g("revue_account_id");
            String string6;
            if (g11 == null || (string6 = wlr.Z1((CharSequence)g11).toString()) == null) {
                string6 = "";
            }
            final String g12 = ck3.g("latest_issue_url");
            String string7;
            if (g12 != null) {
                string7 = wlr.Z1((CharSequence)g12).toString();
            }
            else {
                string7 = null;
            }
            final String g13 = ck3.g("newsletter_profile_url");
            String string8;
            if (g13 == null || (string8 = wlr.Z1((CharSequence)g13).toString()) == null) {
                string8 = "";
            }
            final String g14 = ck3.g("subscriber_count");
            String string9;
            if (g14 != null) {
                string9 = wlr.Z1((CharSequence)g14).toString();
            }
            else {
                string9 = null;
            }
            final Object o = new hji(g8, string4, string5, c2, string6, string7, string8, string9, (String)null, (String)null, (String)null, ck3.g("twitter_user_id"), h0, jji.G0);
            return (ghi)o;
        }
        final String g15 = ck3.g("newsletter_title");
        String string10;
        if (g15 == null || (string10 = wlr.Z1((CharSequence)g15).toString()) == null) {
            string10 = "";
        }
        final String g16 = ck3.g("newsletter_description");
        String string11;
        if (g16 != null) {
            string11 = wlr.Z1((CharSequence)g16).toString();
        }
        else {
            string11 = null;
        }
        final b8d c3 = ck3.c("newsletter_image");
        final String g17 = ck3.g("revue_account_id");
        String string12;
        if (g17 == null || (string12 = wlr.Z1((CharSequence)g17).toString()) == null) {
            string12 = "";
        }
        final String g18 = ck3.g("newsletter_profile_url");
        String string13;
        if (g18 == null || (string13 = wlr.Z1((CharSequence)g18).toString()) == null) {
            string13 = "";
        }
        final String g19 = ck3.g("sample_url");
        String string14;
        if (g19 != null) {
            string14 = wlr.Z1((CharSequence)g19).toString();
        }
        else {
            string14 = null;
        }
        final Object o = new do1(string10, string11, c3, string12, string13, string14, (String)null, (String)null, (String)null, ck3.g("twitter_user_id"), h0, jji.J0, (Void)null);
        return (ghi)o;
    }
    
    public static final yp2.a e0(final ck3 ck3, final gjl gjl) {
        final String s = null;
        if (ck3 != null) {
            final s78 f = ck3.f;
            if (f != null) {
                final String b = ck3.b;
                e0e.e((Object)b, "cardInstanceData.url");
                final String e = r1n.E("website_url", f);
                final String e2 = r1n.E("website_dest_url", f);
                String a = s;
                if (gjl != null) {
                    a = gjl.a;
                }
                return new yp2.a(b, e, e2, a);
            }
        }
        return null;
    }
    
    public static void e1(final Parcel parcel, final int n, final boolean b) {
        parcel.writeInt(n | 0x40000);
        parcel.writeInt((int)(b ? 1 : 0));
    }
    
    public static mgt f0(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final int n) {
        return new mgt((ToggleTwitterButton)layoutInflater.inflate(n, viewGroup, false));
    }
    
    public static void f1(final Parcel parcel, final int n, final Boolean b) {
        if (b == null) {
            return;
        }
        parcel.writeInt(n | 0x40000);
        parcel.writeInt((int)(((boolean)b) ? 1 : 0));
    }
    
    public static String g0(final List list) {
        e0e.f((Object)list, "<this>");
        final StringBuilder sb = new StringBuilder();
        sb.append((CharSequence)"");
        final int size = list.size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final Object value = list.get(i);
            boolean b = true;
            if (++n > 1) {
                sb.append((CharSequence)",");
            }
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
            ++i;
        }
        sb.append((CharSequence)"");
        final String string = sb.toString();
        e0e.e((Object)string, "fastJoinTo(StringBuilder\u2026form)\n        .toString()");
        return string;
    }
    
    public static void g1(final Parcel parcel, int x1, final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        x1 = x1(parcel, x1);
        parcel.writeBundle(bundle);
        B1(parcel, x1);
    }
    
    public static final long h(final int n, final int n2, final int n3, final int n4) {
        final int n5 = 1;
        if (n2 < n) {
            final StringBuilder sb = new StringBuilder();
            sb.append("maxWidth(");
            sb.append(n2);
            sb.append(") must be >= than minWidth(");
            sb.append(n);
            sb.append(')');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (n4 < n3) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("maxHeight(");
            sb2.append(n4);
            sb2.append(") must be >= than minHeight(");
            sb2.append(n3);
            sb2.append(')');
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        int n6;
        if (n >= 0 && n3 >= 0) {
            n6 = n5;
        }
        else {
            n6 = 0;
        }
        if (n6 != 0) {
            return vj6.Companion.b(n, n2, n3, n4);
        }
        throw new IllegalArgumentException(bng.g("minWidth(", n, ") and minHeight(", n3, ") must be >= 0").toString());
    }
    
    public static void h0(final hpv hpv, final ContentValues contentValues) {
        contentValues.put("data_type", Integer.valueOf(14));
        contentValues.put("data_id", Long.valueOf(hpv.q.d));
        contentValues.putNull("data_type_group");
        contentValues.putNull("data_type_tag");
        contentValues.put("data", kbv.j4((Object)hpv.q, (nmp)zqv.e));
    }
    
    public static void h1(final Parcel parcel, final int n, final byte b) {
        parcel.writeInt(n | 0x40000);
        parcel.writeInt((int)b);
    }
    
    public static rfu i0(final rfu rfu, final boolean b) {
        Objects.requireNonNull(rfu);
        final px9 px9 = new px9(rfu);
        j0(px9, null, b);
        return new rfu(px9);
    }
    
    public static void i1(final Parcel parcel, int x1, final byte[] array) {
        if (array == null) {
            return;
        }
        x1 = x1(parcel, x1);
        parcel.writeByteArray(array);
        B1(parcel, x1);
    }
    
    public static String j0(bvh bvh, final List list, final boolean b) {
        if (b) {
            final ojf h = ojf.H();
            final SpannableStringBuilder i0 = bvh.I0;
            for (int length = ((CharSequence)i0).length(), j = 0; j < length - 1; ++j) {
                if (Character.isHighSurrogate(((CharSequence)i0).charAt(j)) && Character.isLowSurrogate(((CharSequence)i0).charAt(j + 1))) {
                    h.p((Object)j);
                }
            }
            final List list2 = (List)((z4j)h).e();
            final Iterator iterator = bvh.iterator();
            while (iterator.hasNext()) {
                final yuh f0 = iterator.next().F0;
                int a;
                Iterator iterator2;
                int n;
                for (a = f0.a, iterator2 = list2.iterator(), n = 0; iterator2.hasNext() && (int)iterator2.next() - n < a; ++n) {}
                f0.a(0, n);
                final Iterator iterator3 = list2.iterator();
                int n2 = 0;
                while (iterator3.hasNext()) {
                    final int intValue = (int)iterator3.next();
                    if (intValue >= f0.b + n2) {
                        break;
                    }
                    if (intValue < f0.a) {
                        continue;
                    }
                    ++n2;
                }
                f0.b = Math.max(f0.b + n2, 0);
            }
        }
        Object o = o7a.b;
        Object o2 = bvh.I0.toString();
        Objects.requireNonNull(o);
        int length2 = ((String)o2).length();
        StringBuilder sb = new StringBuilder(length2);
        Object o3 = luh.a(5);
        int n3 = 0;
    Label_0605_Outer:
        while (true) {
            Label_0611: {
                if (n3 >= length2) {
                    break Label_0611;
                }
                final char char1 = ((String)o2).charAt(n3);
                Label_0598: {
                    if (char1 != '&') {
                        break Label_0598;
                    }
                    final int n4 = n3 + 1;
                    int index = ((String)o2).indexOf(59, n4);
                Label_0514_Outer:
                    while (true) {
                        if (index == -1) {
                            sb.append(char1);
                            break Label_0605;
                        }
                        Object o4 = ((String)o2).substring(n4, index);
                        final int length3 = ((String)o4).length();
                        char char2;
                        int n5;
                        int a2;
                        boolean b2;
                        int intValue2;
                        int n6 = 0;
                        zuh zuh;
                        yuh f2 = null;
                        boolean b3 = false;
                        int n7;
                        int n8;
                        int n9;
                        int n10;
                        int n11;
                        int a3;
                        int n12 = 0;
                        int size;
                        Integer n13;
                        int n14 = 0;
                        int n15;
                        Label_1296_Outer:Block_53_Outer:
                        while (true) {
                            if (length3 <= 0) {
                                break Label_0514;
                            }
                            Label_0481: {
                                if (((String)o4).charAt(0) != '#' || length3 <= 1) {
                                    break Label_0481;
                                }
                                char2 = ((String)o4).charAt(1);
                                Label_0456: {
                                    if (char2 == 'x' || char2 == 'X') {
                                        break Label_0456;
                                    }
                                    try {
                                        n5 = Integer.parseInt(((String)o4).substring(1));
                                        while (true) {
                                            Label_1296:Block_55_Outer:Block_28_Outer:
                                            while (true) {
                                                while (true) {
                                                Block_27:
                                                    while (true) {
                                                        Block_56_Outer:Block_45_Outer:
                                                        while (true) {
                                                        Label_0815:
                                                            while (true) {
                                                            Label_0676:
                                                                while (true) {
                                                                    Label_1036:Label_1213_Outer:
                                                                    while (true) {
                                                                        while (true) {
                                                                        Label_1213:
                                                                            while (true) {
                                                                            Label_1316:
                                                                                while (true) {
                                                                                    Block_49: {
                                                                                        Block_47: {
                                                                                        Label_0708:
                                                                                            while (true) {
                                                                                            Label_1267_Outer:
                                                                                                while (true) {
                                                                                                Label_1267:
                                                                                                    while (true) {
                                                                                                        while (true) {
                                                                                                            while (true) {
                                                                                                                while (true) {
                                                                                                                    Label_1050:Label_1370_Outer:
                                                                                                                    while (true) {
                                                                                                                        Block_41: {
                                                                                                                            while (true) {
                                                                                                                                Block_40: {
                                                                                                                                    Label_0948: {
                                                                                                                                        Block_24: {
                                                                                                                                        Label_1370:
                                                                                                                                            while (true) {
                                                                                                                                                Block_51_Outer:Block_30_Outer:
                                                                                                                                                while (true) {
                                                                                                                                                    if (n5 == -1) {
                                                                                                                                                        sb.append('&');
                                                                                                                                                        if (((String)o4).indexOf(38) != -1) {
                                                                                                                                                            break Label_0605;
                                                                                                                                                        }
                                                                                                                                                        sb.append((String)o4);
                                                                                                                                                        sb.append(';');
                                                                                                                                                    }
                                                                                                                                                    else {
                                                                                                                                                        sb.append((char)n5);
                                                                                                                                                        ((List<int[]>)o3).add(new int[] { n3, index });
                                                                                                                                                    }
                                                                                                                                                    n3 = index;
                                                                                                                                                    ++n3;
                                                                                                                                                    continue Label_0605_Outer;
                                                                                                                                                    Label_1286: {
                                                                                                                                                        o3 = ged.G0;
                                                                                                                                                    }
                                                                                                                                                    a2 = o5j.a;
                                                                                                                                                    break Label_1296;
                                                                                                                                                    o2 = ojf.H();
                                                                                                                                                    o = bvh.I0;
                                                                                                                                                    ((SpannableStringBuilder)o).insert(0, (CharSequence)String.valueOf('\u200f'));
                                                                                                                                                    ((ojf)o2).p((Object)0);
                                                                                                                                                    iftrue(Label_1033:)(!b2);
                                                                                                                                                    Block_33: {
                                                                                                                                                        break Block_33;
                                                                                                                                                        ++intValue2;
                                                                                                                                                        break Label_1296;
                                                                                                                                                        ((SpannableStringBuilder)o).append('\u200e');
                                                                                                                                                        break Label_1267;
                                                                                                                                                    }
                                                                                                                                                    o3 = ((px9)o3).J0;
                                                                                                                                                    break Label_1036;
                                                                                                                                                    ++n6;
                                                                                                                                                    break Label_1050;
                                                                                                                                                    while (true) {
                                                                                                                                                        while (true) {
                                                                                                                                                            while (true) {
                                                                                                                                                                while (true) {
                                                                                                                                                                    zuh = (zuh)(Object)((Iterator<int[]>)o3).next();
                                                                                                                                                                    o4 = zuh.G0;
                                                                                                                                                                    n3 = o5j.a;
                                                                                                                                                                    o4 = o4;
                                                                                                                                                                    f2 = zuh.F0;
                                                                                                                                                                    b3 = (o4 instanceof z4h);
                                                                                                                                                                    iftrue(Label_1050:)(!b3 && !(o4 instanceof w6w) && !(o4 instanceof sgc) && !(o4 instanceof on3));
                                                                                                                                                                    Label_1134: {
                                                                                                                                                                        break Label_1134;
                                                                                                                                                                        ++n7;
                                                                                                                                                                        break Label_1370;
                                                                                                                                                                        n5 = -1;
                                                                                                                                                                        continue Label_1296_Outer;
                                                                                                                                                                    }
                                                                                                                                                                    n3 = f2.a;
                                                                                                                                                                    iftrue(Label_1050:)(n3 < 0 || n3 >= ((SpannableStringBuilder)o).length());
                                                                                                                                                                    break Block_40;
                                                                                                                                                                    n3 = f2.b;
                                                                                                                                                                    break Label_1213;
                                                                                                                                                                    iftrue(Label_1579:)(!b || ((List)o3).isEmpty());
                                                                                                                                                                    break Block_47;
                                                                                                                                                                    Label_1579:
                                                                                                                                                                    return sb.toString();
                                                                                                                                                                    n5 = Integer.valueOf(((String)o4).substring(2), 16);
                                                                                                                                                                    continue Label_1296_Outer;
                                                                                                                                                                    bvh = (bvh)((Iterator<zuh>)o).next().F0;
                                                                                                                                                                    n3 = ((yuh)bvh).a;
                                                                                                                                                                    iftrue(Label_1358:)(n3 != ((yuh)bvh).b);
                                                                                                                                                                    break Block_49;
                                                                                                                                                                    o4 = ehk.f("Invalid entity indices: ");
                                                                                                                                                                    ((StringBuilder)o4).append(((yuh)o).a);
                                                                                                                                                                    ((StringBuilder)o4).append(", ");
                                                                                                                                                                    ((StringBuilder)o4).append(((yuh)o).b);
                                                                                                                                                                    r9a.d((Throwable)new IllegalStateException(((StringBuilder)o4).toString()));
                                                                                                                                                                    ((yuh)o).b = ((yuh)o).a;
                                                                                                                                                                    break Label_1036;
                                                                                                                                                                    ++n3;
                                                                                                                                                                    break Label_1296;
                                                                                                                                                                    iftrue(Label_1273:)(!((Iterator)o3).hasNext());
                                                                                                                                                                    continue Block_51_Outer;
                                                                                                                                                                }
                                                                                                                                                                iftrue(Label_1417:)(!((Iterator)o).hasNext());
                                                                                                                                                                continue Block_30_Outer;
                                                                                                                                                            }
                                                                                                                                                            iftrue(Label_0948:)(!((Iterator)o2).hasNext());
                                                                                                                                                            break Label_1267_Outer;
                                                                                                                                                            sb = new StringBuilder(sb.toString());
                                                                                                                                                            bvh.I0 = new SpannableStringBuilder((CharSequence)sb);
                                                                                                                                                            iftrue(Label_0948:)(!b);
                                                                                                                                                            break Block_24;
                                                                                                                                                            Label_0778:
                                                                                                                                                            n8 = index;
                                                                                                                                                            n9 = n3;
                                                                                                                                                            n10 = length2;
                                                                                                                                                            iftrue(Label_0815:)(n11 >= ((yuh)o).b);
                                                                                                                                                            break Label_0676;
                                                                                                                                                            iftrue(Label_1407:)(!((Iterator)o2).hasNext() || (int)((Iterator)o2).next() - n7 > n3);
                                                                                                                                                            continue Label_1370_Outer;
                                                                                                                                                        }
                                                                                                                                                        Label_0833:
                                                                                                                                                        a3 = ((yuh)o).a - n3;
                                                                                                                                                        ((yuh)o).a = a3;
                                                                                                                                                        length2 = ((yuh)o).b - (length2 + n3);
                                                                                                                                                        iftrue(Label_0941:)(a3 <= (((yuh)o).b = length2));
                                                                                                                                                        continue Block_55_Outer;
                                                                                                                                                    }
                                                                                                                                                    iftrue(Label_0833:)(n12 >= size);
                                                                                                                                                    break Block_27;
                                                                                                                                                    o3 = bvh.iterator();
                                                                                                                                                    n6 = 1;
                                                                                                                                                    continue Label_1050;
                                                                                                                                                    n13 = ((o7a$b)((o7a)o).a).a.get(o4);
                                                                                                                                                    iftrue(Label_0514:)(n13 == null);
                                                                                                                                                    n5 = n13;
                                                                                                                                                    continue Label_1296_Outer;
                                                                                                                                                }
                                                                                                                                                Label_1358: {
                                                                                                                                                    o2 = ((List<int[]>)o3).iterator();
                                                                                                                                                }
                                                                                                                                                n7 = 0;
                                                                                                                                                continue Label_1370;
                                                                                                                                            }
                                                                                                                                            break Label_0948;
                                                                                                                                            n9 = n3 + n14;
                                                                                                                                            n8 = index + 1;
                                                                                                                                            n10 = length2;
                                                                                                                                            break Label_0815;
                                                                                                                                        }
                                                                                                                                        iftrue(Label_0655:)(!((List)o3).isEmpty());
                                                                                                                                    }
                                                                                                                                    b2 = (bvh instanceof px9);
                                                                                                                                    iftrue(Label_1286:)(!b2);
                                                                                                                                    break Label_0815;
                                                                                                                                    n3 = list.get(0);
                                                                                                                                    intValue2 = list.get(1);
                                                                                                                                    bvh = (bvh)((List<int[]>)o3).iterator();
                                                                                                                                    break Label_1296;
                                                                                                                                }
                                                                                                                                iftrue(Label_1172:)(f2.b <= ((SpannableStringBuilder)o).length());
                                                                                                                                break Block_41;
                                                                                                                                iftrue(Label_0514:)(length3 <= 2);
                                                                                                                                continue Block_55_Outer;
                                                                                                                            }
                                                                                                                            Label_1407: {
                                                                                                                                ((yuh)bvh).a(-1, n7);
                                                                                                                            }
                                                                                                                            continue Label_1316;
                                                                                                                        }
                                                                                                                        continue Label_1050;
                                                                                                                    }
                                                                                                                    Label_1172: {
                                                                                                                        iftrue(Label_1206:)(b3 || o4 instanceof sgc || o4 instanceof on3);
                                                                                                                    }
                                                                                                                    continue Label_1213_Outer;
                                                                                                                }
                                                                                                                ++n12;
                                                                                                                index = n8;
                                                                                                                n3 = n9;
                                                                                                                length2 = n10;
                                                                                                                continue Label_0708;
                                                                                                                iftrue(Label_1273:)(o3 == null);
                                                                                                                continue Block_28_Outer;
                                                                                                            }
                                                                                                            Label_1522: {
                                                                                                                iftrue(Label_1459:)((int)o3 > list.get(1));
                                                                                                            }
                                                                                                            continue Block_45_Outer;
                                                                                                        }
                                                                                                        Label_1253: {
                                                                                                            ((SpannableStringBuilder)o).insert(n3, (CharSequence)String.valueOf('\u200e'));
                                                                                                        }
                                                                                                        continue Label_1267;
                                                                                                    }
                                                                                                    n3 += n6;
                                                                                                    ((ojf)o2).p((Object)n3);
                                                                                                    iftrue(Label_1253:)(n3 != ((SpannableStringBuilder)o).length());
                                                                                                    continue Label_1267_Outer;
                                                                                                }
                                                                                                o = ((zuh)((Iterator)o2).next()).F0;
                                                                                                length2 = 0;
                                                                                                index = n12;
                                                                                                continue Label_0708;
                                                                                            }
                                                                                            Label_0655: {
                                                                                                size = ((List)o3).size();
                                                                                            }
                                                                                            o2 = bvh.iterator();
                                                                                            n12 = 0;
                                                                                            n3 = 0;
                                                                                            continue Label_0676;
                                                                                        }
                                                                                        o = bvh.iterator();
                                                                                    }
                                                                                    continue Label_1316;
                                                                                }
                                                                                Label_1206: {
                                                                                    n3 = f2.a;
                                                                                }
                                                                                continue Label_1213;
                                                                            }
                                                                            sb.append(char1);
                                                                            continue Label_0514_Outer;
                                                                            Label_1417: {
                                                                                iftrue(Label_1579:)(list == null);
                                                                            }
                                                                            continue Block_53_Outer;
                                                                        }
                                                                        Label_1033: {
                                                                            o3 = null;
                                                                        }
                                                                        continue Label_1036;
                                                                    }
                                                                    n12 = index;
                                                                    continue Label_0676;
                                                                }
                                                                n10 = length2 + n14;
                                                                n9 = n3;
                                                                n8 = index;
                                                                continue Label_0815;
                                                            }
                                                            o2 = bvh.I0;
                                                            o3 = bvh;
                                                            iftrue(Label_1286:)(!ix.z((CharSequence)o2, ((px9)o3).J0));
                                                            continue Block_56_Outer;
                                                        }
                                                        o3 = ((Iterator<Integer>)bvh).next();
                                                        iftrue(Label_1522:)((int)o3 > list.get(0) || list.get(0) == 0);
                                                        continue Block_28_Outer;
                                                    }
                                                    o4 = ((List<int[]>)o3).get(n12);
                                                    n15 = o4[0];
                                                    n11 = o4[1];
                                                    n14 = n11 - n15;
                                                    iftrue(Label_0778:)(n11 >= ((yuh)o).a);
                                                    continue Block_53_Outer;
                                                }
                                                Label_1273: {
                                                    o3 = ((z4j)o2).e();
                                                }
                                                continue Label_1296;
                                            }
                                            iftrue(Label_1549:)(!((Iterator)bvh).hasNext());
                                            continue;
                                        }
                                        Label_1549: {
                                            list.clear();
                                        }
                                        list.add(n3);
                                        list.add(intValue2);
                                        return sb.toString();
                                    }
                                    catch (final Exception ex) {
                                        continue;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public static void j1(final Parcel parcel, final int n, final Double n2) {
        if (n2 == null) {
            return;
        }
        parcel.writeInt(n | 0x80000);
        parcel.writeDouble((double)n2);
    }
    
    public static String k0(final String s, final Object... array) {
        final StringBuilder sb = new StringBuilder(array.length * 16 + s.length());
        int i = 0;
        int n = 0;
        while (i < array.length) {
            final int index = s.indexOf("%s", n);
            if (index == -1) {
                break;
            }
            sb.append(s.substring(n, index));
            sb.append(array[i]);
            n = index + 2;
            ++i;
        }
        sb.append(s.substring(n));
        if (i < array.length) {
            sb.append(" [");
            final int n2 = i + 1;
            sb.append(array[i]);
            for (int j = n2; j < array.length; ++j) {
                sb.append(", ");
                sb.append(array[j]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
    
    public static void k1(final Parcel parcel, final int n, final float n2) {
        parcel.writeInt(n | 0x40000);
        parcel.writeFloat(n2);
    }
    
    public static gjl l0(final s3 s3, final h1 h1) {
        final zm9 y = xi4.y(s3);
        sn9 i0;
        if (y instanceof qbv) {
            i0 = ((qbv)y).I0;
        }
        else {
            if (y != null) {
                w9.w(String.format(Locale.ENGLISH, "Expected instance of TwitterDynamicAd, got %s", ((qbv)y).getClass().toString()));
            }
            i0 = null;
        }
        if (i0 != null) {
            return wn9.b(i0);
        }
        return m0(h1).e();
    }
    
    public static void l1(final Parcel parcel, final int n, final Float n2) {
        if (n2 == null) {
            return;
        }
        parcel.writeInt(n | 0x40000);
        parcel.writeFloat((float)n2);
    }
    
    public static long m(int n, int n2, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            n = Integer.MAX_VALUE;
        }
        if ((n3 & 0x8) != 0x0) {
            n2 = Integer.MAX_VALUE;
        }
        return h(0, n, 0, n2);
    }
    
    public static u1v m0(final h1 h1) {
        if (h1 instanceof zcc) {
            return ((zcc)h1).d();
        }
        return (u1v)u1v.a;
    }
    
    public static void m1(final Parcel parcel, int x1, final IBinder binder) {
        if (binder == null) {
            return;
        }
        x1 = x1(parcel, x1);
        parcel.writeStrongBinder(binder);
        B1(parcel, x1);
    }
    
    public static final String n(final Cursor cursor, final String s) {
        Integer value = cursor.getColumnIndex(s);
        final boolean b = value.intValue() >= 0;
        String string = null;
        if (!b) {
            value = null;
        }
        if (value != null) {
            string = cursor.getString(value.intValue());
        }
        return string;
    }
    
    public static final List n0(h0s r1, final String s) {
        e0e.f((Object)r1, "<this>");
        e0e.f((Object)s, "tableName");
        final ArrayList list = new ArrayList();
        final StringBuilder sb = new StringBuilder();
        sb.append("pragma table_info(");
        sb.append(s);
        sb.append(")");
        r1 = (h0s)r1.R1(sb.toString(), (Object[])null);
        try {
            while (((Cursor)r1).moveToNext()) {
                final String string = ((Cursor)r1).getString(1);
                final String string2 = ((Cursor)r1).getString(2);
                e0e.e((Object)string, "columnName");
                e0e.e((Object)string2, "columnType");
                list.add(new ss4(s, string, string2));
            }
            ma7.n((Closeable)r1, (Throwable)null);
            return list;
        }
        finally {
            try {}
            finally {
                ma7.n((Closeable)r1, (Throwable)s);
            }
        }
    }
    
    public static void n1(final Parcel parcel, final int n, final int n2) {
        parcel.writeInt(n | 0x40000);
        parcel.writeInt(n2);
    }
    
    public static final Object[] o(final Object[] array, final int n, final Object o, final Object o2) {
        final Object[] array2 = new Object[array.length + 2];
        et0.J0(array, array2, 0, 0, n, 6);
        et0.H0(array, array2, n + 2, n, array.length);
        array2[n] = o;
        array2[n + 1] = o2;
        return array2;
    }
    
    public static CharSequence o0(final zrm zrm, String s, String s2, final String s3, int length) {
        final HashSet a = o1u.a;
        if (!flr.e((CharSequence)s) && !flr.e((CharSequence)s2)) {
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
        final f91 g0 = f91.G0;
        if (s3.equals("Ms")) {
            s2 = "Microsoft";
        }
        else {
            s2 = "Google";
        }
        final Resources b = zrm.b;
        s = b.getString(length, new Object[] { s, s2 });
        final int index = s.indexOf(s2);
        length = s2.length();
        Drawable drawable;
        if (s3.equals("Ms")) {
            drawable = zrm.j(2131232249);
        }
        else {
            drawable = zrm.j(2131232123);
        }
        ie9.b(drawable, b.getDimensionPixelSize(2131167654), 0);
        final ImageSpan imageSpan = new ImageSpan(drawable, 0);
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        spannableString.setSpan((Object)imageSpan, index, length + index, 33);
        return (CharSequence)spannableString;
    }
    
    public static void o1(final Parcel parcel, int x1, final int[] array) {
        if (array == null) {
            return;
        }
        x1 = x1(parcel, x1);
        parcel.writeIntArray(array);
        B1(parcel, x1);
    }
    
    public static nmp p0() {
        synchronized (xd.class) {
            if (xd.F0 == null) {
                xd.F0 = new fr4((nmp)rx6.f, (nmp)fpp.a);
            }
            return (nmp)xd.F0;
        }
    }
    
    public static void p1(final Parcel parcel, final int n, final Integer n2) {
        if (n2 == null) {
            return;
        }
        parcel.writeInt(n | 0x40000);
        parcel.writeInt((int)n2);
    }
    
    public static final e1m q() {
        return (e1m)new cv8();
    }
    
    public static lm2 q0(final Context context, final SharedPreferences sharedPreferences, final baw baw, final im2 im2) {
        final String packageName = context.getPackageName();
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Object o;
        if ((packageName.equals("tv.periscope.android.dev") || packageName.equals("tv.periscope.android.beta")) && defaultSharedPreferences.getBoolean("pref_profile_is_employee", false) && defaultSharedPreferences.getBoolean("pref_force_broadcast_tips", false)) {
            o = new tpz();
        }
        else {
            final yjw v = baw.v();
            if (sharedPreferences.contains("broadcast_tips.initial_has_low_broadcast_count")) {
                o = new zjw(Boolean.valueOf(sharedPreferences.getBoolean("broadcast_tips.initial_has_low_broadcast_count", false)));
            }
            else if (v != null && v.b() != null) {
                final Boolean b = v.b();
                final SharedPreferences$Editor edit = sharedPreferences.edit();
                edit.putBoolean("broadcast_tips.initial_has_low_broadcast_count", (boolean)b);
                edit.apply();
                o = new zjw(b);
            }
            else {
                o = new zjw((Boolean)null);
            }
        }
        return (lm2)new mm2(sharedPreferences, (km2)o, im2);
    }
    
    public static void q1(final Parcel parcel, final int n, final long n2) {
        parcel.writeInt(n | 0x80000);
        parcel.writeLong(n2);
    }
    
    public static final Object[] r(final Object[] array, final int n) {
        final Object[] array2 = new Object[array.length - 2];
        et0.J0(array, array2, 0, 0, n, 6);
        et0.H0(array, array2, n, n + 2, array.length);
        return array2;
    }
    
    public static h6 r0(final h1 h1) {
        if (h1 instanceof tec) {
            return ((tec)h1).c();
        }
        return (h6)h6.c;
    }
    
    public static void r1(final Parcel parcel, int x1, final Parcelable parcelable, final int n) {
        if (parcelable == null) {
            return;
        }
        x1 = x1(parcel, x1);
        parcelable.writeToParcel(parcel, n);
        B1(parcel, x1);
    }
    
    public static final Object[] s(final Object[] array, final int n) {
        final Object[] array2 = new Object[array.length - 1];
        et0.J0(array, array2, 0, 0, n, 6);
        et0.H0(array, array2, n, n + 1, array.length);
        return array2;
    }
    
    public static final List s0(h0s x) {
        e0e.f((Object)x, "<this>");
        final ArrayList list = new ArrayList();
        final l0s l0s = new l0s("sqlite_master");
        l0s.c = new String[] { "name" };
        l0s.d = "type = ?";
        l0s.e = new String[] { "table" };
        x = (h0s)x.X(l0s.d());
        try {
            while (((Cursor)x).moveToNext()) {
                final String string = ((Cursor)x).getString(0);
                final yxo$a companion = yxo.Companion;
                e0e.e((Object)string, "tableName");
                if (companion.a(string)) {
                    continue;
                }
                list.add(string);
            }
            ma7.n((Closeable)x, (Throwable)null);
            return list;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                ma7.n((Closeable)x, t);
            }
        }
    }
    
    public static void s1(final Parcel parcel, int x1, final String s) {
        if (s == null) {
            return;
        }
        x1 = x1(parcel, x1);
        parcel.writeString(s);
        B1(parcel, x1);
    }
    
    public static void t(final StringBuilder sb, final int n) {
        for (int i = 0; i < n; ++i) {
            sb.append("?");
            if (i < n - 1) {
                sb.append(",");
            }
        }
    }
    
    public static final awj t0(final long timeInMillis) {
        final Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(timeInMillis);
        final Calendar instance2 = Calendar.getInstance();
        final g5s a = nq1.a;
        instance2.setTimeInMillis(System.currentTimeMillis());
        return new awj((Object)instance, (Object)instance2);
    }
    
    public static void t1(final Parcel parcel, int x1, final String[] array) {
        if (array == null) {
            return;
        }
        x1 = x1(parcel, x1);
        parcel.writeStringArray(array);
        B1(parcel, x1);
    }
    
    public static hp6 u0(final h1 h1) {
        if (h1 instanceof yec) {
            return ((yec)h1).i();
        }
        return null;
    }
    
    public static void u1(final Parcel parcel, int x1, final List list) {
        if (list == null) {
            return;
        }
        x1 = x1(parcel, x1);
        parcel.writeStringList(list);
        B1(parcel, x1);
    }
    
    public static final Intent v(final Intent intent, final xbi xbi) {
        e0e.f((Object)intent, "<this>");
        e0e.f((Object)xbi, "navigationOptions");
        if (xbi.b) {
            intent.addFlags(536870912);
        }
        final int g = lb0.G(xbi.a);
        if (g != 1) {
            if (g == 2) {
                intent.addFlags(268468224);
            }
        }
        else {
            intent.addFlags(67108864);
        }
        return intent;
    }
    
    public static final View v0(final View view) {
        final FrameLayout frameLayout = new FrameLayout(view.getContext());
        ((View)frameLayout).setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
        ((ViewGroup)frameLayout).addView(view, new ViewGroup$LayoutParams(-1, -2));
        view.setTag(2131429534, (Object)Boolean.TRUE);
        return (View)frameLayout;
    }
    
    public static void v1(final Parcel parcel, int i, final Parcelable[] array, final int n) {
        if (array == null) {
            return;
        }
        final int x1 = x1(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        Parcelable parcelable;
        for (i = 0; i < length; ++i) {
            parcelable = array[i];
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                E1(parcel, parcelable, n);
            }
        }
        B1(parcel, x1);
    }
    
    public static final zm4 w0(final hp6 hp6, final UserIdentifier userIdentifier) {
        e0e.f((Object)hp6, "tweet");
        e0e.f((Object)userIdentifier, "userIdentifier");
        final ro4 j = qds.j(hp6);
        final ro4 q = qds.q(hp6);
        if (j == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (q != null) {
            zm4 zm4;
            if (e0e.a((Object)userIdentifier, (Object)j.b.f())) {
                zm4 = new zm4(q, zm4$a.G0);
            }
            else if (e0e.a((Object)userIdentifier, (Object)q.b.f())) {
                zm4 = new zm4(j, zm4$a.F0);
            }
            else {
                zm4 = null;
            }
            return zm4;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public static void w1(final Parcel parcel, int i, final List list) {
        if (list == null) {
            return;
        }
        final int x1 = x1(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        Parcelable parcelable;
        for (i = 0; i < size; ++i) {
            parcelable = list.get(i);
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                E1(parcel, parcelable, 0);
            }
        }
        B1(parcel, x1);
    }
    
    public static final boolean x0(final lrn lrn) {
        e0e.f((Object)lrn, "<this>");
        return C0(lrn) || (lrn.F == faw.F0 && lrn.u == mrn.F0);
    }
    
    public static int x1(final Parcel parcel, final int n) {
        parcel.writeInt(n | 0xFFFF0000);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
    
    public static boolean y0() {
        return ita.c().b("android_enable_audio_transcription_for_vod", false);
    }
    
    public static String y1(final String s, final Object... array) {
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
    
    public static final Object[] z(final int n) {
        if (n >= 0) {
            return new Object[n];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
    
    public static boolean z0(final boolean b) {
        return A0(b, pdw.d());
    }
    
    public static boolean z1(final Object o, final Object o2) {
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
    
    public boolean Q0(kc8 b, kc8 b2, final hub hub, final boolean b3) {
        b = b.b();
        b2 = b2.b();
        boolean b4;
        if (!(b instanceof da3) && !(b2 instanceof da3)) {
            b4 = this.w(b, b2, b3, true);
        }
        else {
            b4 = (boolean)hub.invoke((Object)b, (Object)b2);
        }
        return b4;
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return stz.G0.b().z();
    }
    
    public void b() {
    }
    
    public void c(final Exception ex) {
        doz.e.m(String.format("Could not sync active asset packs. %s", ex), new Object[0]);
    }
    
    public smq c1(ba3 ba3) {
        while (ba3 instanceof da3) {
            final da3 da3 = (da3)ba3;
            if (da3.i() != da3$a.G0) {
                break;
            }
            final Collection d = da3.d();
            e0e.e((Object)d, "overriddenDescriptors");
            ba3 = (ba3)rr4.Y1((Iterable)d);
            if (ba3 != null) {
                continue;
            }
            return null;
        }
        return ((pc8)ba3).m();
    }
    
    public void d(final a3 a3, final r5 r5) {
    }
    
    public void e(final a3 a3) {
    }
    
    public Object f(final bl1 bl1) {
        final boolean b = bl1 instanceof snd;
        final Object o = null;
        Object o2;
        if (b) {
            o2 = bl1;
        }
        else {
            o2 = null;
        }
        View view;
        if (o2 == null || (view = jb2.j0((oec)o2)) == null) {
            view = ((Fragment)bl1).m1;
        }
        Label_0092: {
            if (view == null) {
                break Label_0092;
            }
            Object m = null;
            try {
                view.getTag(2131428668);
            }
            finally {
                final Throwable t;
                m = jb2.M(t);
            }
            Object o3 = m;
            if (m instanceof ctm$b) {
                o3 = null;
            }
            final Object o4;
            if ((o4 = o3) == null) {
                break Label_0092;
            }
            return o4;
        }
        ViewGroup viewGroup;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup)view;
        }
        else {
            viewGroup = null;
        }
        Object o5 = o;
        if (viewGroup != null) {
            final Iterator iterator = ((ykp)j8x.c(viewGroup)).iterator();
            Object o4;
            do {
                final vkp vkp = (vkp)iterator;
                o5 = o;
                if (!vkp.hasNext()) {
                    return o5;
                }
                final View view2 = (View)vkp.next();
                Object i = null;
                try {
                    view2.getTag(2131428668);
                }
                finally {
                    final Throwable t2;
                    i = jb2.M(t2);
                }
                o4 = i;
                if (!(i instanceof ctm$b)) {
                    continue;
                }
                o4 = null;
            } while (o4 == null);
            return o4;
        }
        return o5;
    }
    
    public void g() {
    }
    
    public void i(final View view) {
    }
    
    public void j(final a3 a3) {
    }
    
    public void k() {
    }
    
    public Object l() {
        return new TreeMap();
    }
    
    public void u(final View view) {
    }
    
    public boolean w(final kc8 kc8, final kc8 kc9, final boolean b, final boolean b2) {
        final boolean b3 = kc8 instanceof wb4;
        final boolean b4 = true;
        boolean b5;
        if (b3 && kc9 instanceof wb4) {
            b5 = e0e.a((Object)((oc4)kc8).j(), (Object)((oc4)kc9).j());
        }
        else if (kc8 instanceof rkv && kc9 instanceof rkv) {
            b5 = this.x((rkv)kc8, (rkv)kc9, b, (hub)nq8.F0);
        }
        else if (kc8 instanceof ba3 && kc9 instanceof ba3) {
            final ba3 ba3 = (ba3)kc8;
            final ba3 ba4 = (ba3)kc9;
            e0e.f((Object)ba3, "a");
            e0e.f((Object)ba4, "b");
            if (e0e.a((Object)ba3, (Object)ba4)) {
                b5 = b4;
            }
            else {
                Label_0334: {
                    if (e0e.a((Object)((kc8)ba3).getName(), (Object)((kc8)ba4).getName())) {
                        if (!b2 || !(ba3 instanceof m3h) || !(ba4 instanceof m3h) || ((m3h)ba3).i0() == ((m3h)ba4).i0()) {
                            if (e0e.a((Object)((mc8)ba3).b(), (Object)((mc8)ba4).b())) {
                                if (!b) {
                                    break Label_0334;
                                }
                                if (!e0e.a((Object)this.c1(ba3), (Object)this.c1(ba4))) {
                                    break Label_0334;
                                }
                            }
                            if (!dr8.r((kc8)ba3)) {
                                if (!dr8.r((kc8)ba4)) {
                                    if (this.Q0((kc8)ba3, (kc8)ba4, (hub)lq8.F0, b)) {
                                        final crj crj = new crj((zse$a)new mq8(b, ba3, ba4));
                                        if (crj.m(ba3, ba4, (wb4)null, true).c() == 1 && crj.m(ba4, ba3, (wb4)null, true).c() == 1) {
                                            b5 = b4;
                                            return b5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                b5 = false;
            }
        }
        else if (kc8 instanceof vrj && kc9 instanceof vrj) {
            b5 = e0e.a((Object)((vrj)kc8).e(), (Object)((vrj)kc9).e());
        }
        else {
            b5 = e0e.a((Object)kc8, (Object)kc9);
        }
        return b5;
    }
    
    public boolean x(final rkv rkv, final rkv rkv2, final boolean b, final hub hub) {
        e0e.f((Object)rkv, "a");
        e0e.f((Object)rkv2, "b");
        e0e.f((Object)hub, "equivalentCallables");
        final boolean a = e0e.a((Object)rkv, (Object)rkv2);
        final boolean b2 = true;
        return a || (!e0e.a((Object)((mc8)rkv).b(), (Object)((mc8)rkv2).b()) && this.Q0((kc8)rkv, (kc8)rkv2, hub, b) && rkv.getIndex() == rkv2.getIndex() && b2);
    }
    
    public boolean y(final boolean b, final boolean b2, final boolean b3) {
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
}
