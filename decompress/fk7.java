import androidx.fragment.app.Fragment;
import java.lang.ref.ReferenceQueue;
import java.io.IOException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.locks.LockSupport;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import android.graphics.Bitmap$Config;
import android.util.DisplayMetrics;
import android.graphics.Bitmap;
import android.os.Build$VERSION;
import java.util.Objects;
import android.text.style.StyleSpan;
import android.text.SpannableString;
import android.os.Bundle;
import java.util.Locale;
import android.content.Context;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.NoSuchElementException;
import android.graphics.Color;
import java.text.Bidi;
import com.twitter.util.user.UserIdentifier;
import java.util.List;
import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public class fk7 implements aow, b00, mtm, zw8, wqy, u16
{
    public static ar4 C0;
    public static final fk7 D0;
    public static final fk7 E0;
    public static final fk7 F0;
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
    public static final fk7 S0;
    public static final aw8 T0;
    public static final aw8 U0;
    public static final aw8 V0;
    
    public static int A(final String s, final d78 d78) {
        Integer n;
        if ((n = B(s, d78)) == null) {
            n = 0;
        }
        return n;
    }
    
    public static final boolean A0(final List list) {
        boolean b;
        if (list.size() == 1) {
            b = dta.a((UserIdentifier)or4.G1(list)).b("android_notifications_signals_enabled", false);
        }
        else {
            b = dta.d().b("android_notifications_signals_enable_multi_account", false);
        }
        return b;
    }
    
    public static Integer B(final String s, final d78 d78) {
        Integer value = null;
        try {
            final String s2 = d78.d(s, String.class);
            if (s2 != null) {
                value = Integer.valueOf(s2, 10);
            }
            return value;
        }
        catch (final NumberFormatException ex) {
            e9a.d((Throwable)ex);
        }
        catch (final ClassCastException ex2) {
            try {
                return d78.d(s, Integer.class);
            }
            catch (final ClassCastException ex3) {
                e9a.d((Throwable)ex3);
            }
        }
        return null;
    }
    
    public static void B0(final List list, final ntk ntk, final int n, final int n2) {
        int size = list.size();
        int n4;
        while (true) {
            final int n3 = size - 1;
            if (n3 <= (n4 = n2)) {
                break;
            }
            size = n3;
            if (!ntk.apply(list.get(n3))) {
                continue;
            }
            list.remove(n3);
            size = n3;
        }
        while (--n4 >= n) {
            list.remove(n4);
        }
    }
    
    public static final Character C(final CharSequence charSequence, final CharSequence charSequence2, int n) {
        zzd.f((Object)charSequence, "text");
        zzd.f((Object)charSequence2, "hashtag");
        final int length = charSequence2.length();
        final int n2 = 0;
        if (length > 0 && n > 0 && !jgw.Q(charSequence.charAt(n - 1))) {
            final String string = charSequence.toString();
            if (t40.b()) {
                n = -1;
            }
            else {
                n = -2;
            }
            final boolean baseIsLeftToRight = new Bidi(string, n).baseIsLeftToRight();
            final boolean y = jgw.y(charSequence2);
            Label_0125: {
                if (!baseIsLeftToRight || !y) {
                    n = n2;
                    if (baseIsLeftToRight) {
                        break Label_0125;
                    }
                    n = n2;
                    if (y) {
                        break Label_0125;
                    }
                }
                n = 1;
            }
            if (n != 0) {
                char c;
                if (baseIsLeftToRight) {
                    n = (c = '\u200f');
                }
                else {
                    n = (c = '\u200e');
                }
                return c;
            }
        }
        return null;
    }
    
    public static final long C0(final long n, final long n2) {
        final float d = mcq.d(n);
        final long a = xto.a;
        final int n3 = 1;
        if (n2 == a) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        final float intBitsToFloat = Float.intBitsToFloat((int)(n2 >> 32));
        final float b = mcq.b(n);
        int n4;
        if (n2 != a) {
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        if (n4 != 0) {
            return x3j.f(intBitsToFloat * d, Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)) * b);
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
    
    public static String D0(final int n) {
        return imw.m("rgba(%d,%d,%d,%.3f)", new Object[] { Color.red(n), Color.green(n), Color.blue(n), Color.alpha(n) / 255.0 });
    }
    
    public static Object E(final Iterable iterable, Object next) {
        final Iterator iterator = iterable.iterator();
        if (iterator.hasNext()) {
            next = iterator.next();
        }
        return next;
    }
    
    public static final Object E0(oy6 oy6, final gub gub, ap6 c) {
        final oy6 context = c.getContext();
        if (!qy6.b(oy6)) {
            oy6 = context.w0(oy6);
        }
        else {
            oy6 = qy6.a(context, oy6, false);
        }
        ukg.I(oy6);
        if (oy6 == context) {
            final swo swo = new swo(oy6, c);
            oy6 = (oy6)asy.z0(swo, (Object)swo, gub);
        }
        else {
            final dp6$a c2 = dp6$a.C0;
            if (zzd.a((Object)oy6.c((oy6$b)c2), (Object)context.c((oy6$b)c2))) {
                final ksv ksv = new ksv(oy6, c);
                c = (ap6)yls.c(oy6, (Object)null);
                try {
                    final Object z0 = asy.z0((swo)ksv, (Object)ksv, gub);
                    yls.a(oy6, (Object)c);
                    oy6 = (oy6)z0;
                    return oy6;
                }
                finally {
                    yls.a(oy6, (Object)c);
                }
            }
            final l19 l19 = new l19(oy6, c);
            ajy.T(gub, (Object)l19, (ap6)l19, (rtb)null);
            oy6 = (oy6)l19.I0();
        }
        return oy6;
    }
    
    public static final String F(String s) {
        zzd.f((Object)s, "str");
        final boolean h0 = h0(s);
        String substring = null;
        if (!h0) {
            s = null;
        }
        if (s != null) {
            substring = s.substring(1);
            zzd.e((Object)substring, "this as java.lang.String).substring(startIndex)");
        }
        return substring;
    }
    
    public static final Object F0(ap6 z) {
        final zy6 c0 = zy6.C0;
        final oy6 context = ((ap6)z).getContext();
        ukg.I(context);
        z = asy.Z((ap6)z);
        if (z instanceof k19) {
            z = z;
        }
        else {
            z = null;
        }
        Object a = null;
        Label_0289: {
            if (z == null) {
                a = oyv.a;
            }
            else {
                final boolean i0 = ((k19)z).F0.I0();
                final int n = 1;
                if (i0) {
                    ((k19)z).H0 = oyv.a;
                    ((m19)z).E0 = 1;
                    ((k19)z).F0.m(context, (Runnable)z);
                }
                else {
                    final pux pux = new pux();
                    final oy6 w0 = context.w0((oy6)pux);
                    final oyv a2 = oyv.a;
                    ((k19)z).H0 = a2;
                    ((m19)z).E0 = 1;
                    ((k19)z).F0.m(w0, (Runnable)z);
                    if (pux.D0) {
                        final dms a3 = dms.a;
                        final gca a4 = dms.a();
                        final dt0 g0 = a4.G0;
                        Label_0260: {
                            if (g0 == null || g0.b == g0.c) {
                                break Label_0260;
                            }
                            Label_0263: {
                                if (a4.V0()) {
                                    ((k19)z).H0 = a2;
                                    ((m19)z).E0 = 1;
                                    a4.R0((m19)z);
                                    final int n2 = n;
                                    break Label_0263;
                                }
                                a4.S0(true);
                                Label_0254: {
                                    final Throwable t2;
                                    try {
                                        ((m19)z).run();
                                        while (a4.X0()) {}
                                        break Label_0254;
                                    }
                                    finally {
                                        final Object o = z;
                                        final Throwable t = t2;
                                        final Throwable t3 = null;
                                        ((m19)o).e(t, t3);
                                    }
                                    try {
                                        final Object o = z;
                                        final Throwable t = t2;
                                        final Throwable t3 = null;
                                        ((m19)o).e(t, t3);
                                        a4.K0(true);
                                        final int n2 = 0;
                                        if (n2 == 0) {
                                            final oyv a5 = oyv.a;
                                            break Label_0289;
                                        }
                                    }
                                    finally {
                                        a4.K0(true);
                                    }
                                }
                            }
                        }
                    }
                }
                a = c0;
            }
        }
        if (a == c0) {
            return a;
        }
        return oyv.a;
    }
    
    public static alp G() {
        synchronized (fk7.class) {
            if (fk7.C0 == null) {
                fk7.C0 = new ar4((alp)hx6.f);
            }
            return (alp)fk7.C0;
        }
    }
    
    public static Object G0(final Object o, final int n) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(q1a.f(20, "at index ", n));
    }
    
    public static Object H(final Iterable iterable) {
        if (!(iterable instanceof List)) {
            final Iterator iterator = iterable.iterator();
            Object next;
            do {
                next = iterator.next();
            } while (iterator.hasNext());
            return next;
        }
        final List list = (List)iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        throw new NoSuchElementException();
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
                    mag.m(sb2, "<", string, " threw ", name2);
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
    
    public static final String I(final Context context, final String s) {
        zzd.f((Object)context, "context");
        zzd.f((Object)s, "countryCode");
        if (ckr.f1("xx", s, true)) {
            final String string = context.getString(2131957694);
            zzd.e((Object)string, "context.getString(R.stri\u2026_worldwide_select_option)");
            return string;
        }
        if (ckr.f1("xy", s, true)) {
            final String string2 = context.getString(2131957693);
            zzd.e((Object)string2, "context.getString(R.stri\u2026_copyright_select_option)");
            return string2;
        }
        final String displayCountry = new Locale("", s).getDisplayCountry(t4s.d());
        zzd.e((Object)displayCountry, "Locale(\"\", countryCode).\u2026SystemConfig.getLocale())");
        return displayCountry;
    }
    
    public static boolean I0(final String s) {
        final int a = s000.a;
        return s == null || s.isEmpty();
    }
    
    public static final Object J(final hvt hvt) {
        zzd.f((Object)hvt, "<this>");
        Object o;
        if ((o = hvt.c) == null) {
            o = hvt.b;
        }
        return o;
    }
    
    public static final List K(final z28 z28) {
        zzd.f((Object)z28, "<this>");
        Object o;
        if (z28 instanceof l48) {
            o = tdy.u0((Object)((l48)z28).a);
        }
        else if (z28 instanceof to7) {
            o = ((to7)z28).a.a();
            zzd.e(o, "inboxItem.users");
        }
        else {
            o = v2a.C0;
        }
        return (List)o;
    }
    
    public static final List L(final Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        final byte[] byteArray = bundle.getByteArray("suggestions");
        final o38 a = o38.a;
        return (List)tkp.a(byteArray, (alp)new xq4$a((alp)o38.b));
    }
    
    public static boolean M(final int n) {
        return (n & 0x200000) != 0x0;
    }
    
    public static SpannableString N(String lowerCase, String s) {
        final SpannableString spannableString = new SpannableString((CharSequence)lowerCase);
        s = s.trim();
        final Locale english = Locale.ENGLISH;
        s = s.toLowerCase(english);
        if (s.isEmpty()) {
            return spannableString;
        }
        int i = 0;
        lowerCase = lowerCase.toLowerCase(english);
        while (i < lowerCase.length()) {
            if (lowerCase.substring(i).startsWith(s)) {
                spannableString.setSpan((Object)new StyleSpan(1), i, s.length() + i, 33);
                i += s.length();
            }
            else {
                ++i;
            }
        }
        return spannableString;
    }
    
    public static final boolean O(final gpk gpk) {
        zzd.f((Object)gpk, "<this>");
        return ((pm8)gpk).l().I0;
    }
    
    public static boolean P(final int n) {
        return (n & 0x8) != 0x0;
    }
    
    public static final a82 b(final float n, final long n2) {
        return new a82(n, (oq2)new skq(n2));
    }
    
    public static final long d(final int n, final int n2, final int n3, final int n4) {
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
            return jj6.Companion.b(n, n2, n3, n4);
        }
        throw new IllegalArgumentException(k1b.f("minWidth(", n, ") and minHeight(", n3, ") must be >= 0").toString());
    }
    
    public static boolean d0(final int n) {
        return (n & 0x4) != 0x0;
    }
    
    public static boolean e0(final int n) {
        return (n & 0x80000) != 0x0;
    }
    
    public static boolean f0(final int n) {
        return (n & 0x6) != 0x0;
    }
    
    public static final boolean g0(final z28 z28) {
        zzd.f((Object)z28, "<this>");
        return z28 instanceof to7;
    }
    
    public static h6d h(final int n, final int n2, int n3, final int n4) {
        boolean hasAlpha = false;
        if ((n4 & 0x4) != 0x0) {
            Objects.requireNonNull(i6d.Companion);
            n3 = 0;
        }
        if ((n4 & 0x8) != 0x0) {
            hasAlpha = true;
        }
        Object d;
        if ((n4 & 0x10) != 0x0) {
            final bs4 a = bs4.a;
            d = bs4.d;
        }
        else {
            d = null;
        }
        zzd.f(d, "colorSpace");
        final Bitmap$Config c = mtd.c(n3);
        Bitmap bitmap;
        if (Build$VERSION.SDK_INT >= 26) {
            bitmap = le0.c(n, n2, n3, hasAlpha, (as4)d);
        }
        else {
            bitmap = Bitmap.createBitmap((DisplayMetrics)null, n, n2, c);
            zzd.e((Object)bitmap, "createBitmap(\n          \u2026   bitmapConfig\n        )");
            bitmap.setHasAlpha(hasAlpha);
        }
        return (h6d)new i40(bitmap);
    }
    
    public static final boolean h0(final String s) {
        zzd.f((Object)s, "text");
        final Character y1 = hkr.Y1((CharSequence)s);
        if (y1 != null) {
            if (y1 == '#') {
                return true;
            }
        }
        return false;
    }
    
    public static final long i(final float n, final float n2) {
        final long n3 = Float.floatToIntBits(n);
        final long n4 = Float.floatToIntBits(n2);
        final xto.a companion = xto.Companion;
        return (n4 & 0xFFFFFFFFL) | n3 << 32;
    }
    
    public static boolean i0(final int n) {
        return (n & 0x100000) != 0x0;
    }
    
    public static final void k(wv8 m0, m76 h, final int n, final int n2) {
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
                m0 = dml.m0(h);
            }
            h.s();
            final ea6$b a = ea6.a;
            final f56 a2 = f56.a;
            ge0.a((gub)f56.b, (gub)f56.c, (gub)m8y.j(h, -1831434376, new sbh(m0)), (jkh)null, 0L, (oqp)null, (gub)null, (jub)f56.d, h, 12583350, 120);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new tbh(m0, n, n2));
        }
    }
    
    public static final boolean k0(final long n, final long n2) {
        final int j = jj6.j(n);
        final int h = jj6.h(n);
        final int n3 = (int)(n2 >> 32);
        boolean b = true;
        if (j <= n3 && n3 <= h) {
            final int i = jj6.i(n);
            final int g = jj6.g(n);
            final int b2 = iud.b(n2);
            if (i <= b2 && b2 <= g) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static kl8 l(final yy6 yy6, final gub gub) {
        final ll8 ll8 = new ll8(qy6.c(yy6, (oy6)k2a.C0), true);
        ((jb)ll8).H0(1, (Object)ll8, gub);
        return (kl8)ll8;
    }
    
    public static boolean l0(final int n) {
        return (n & 0x8000) != 0x0;
    }
    
    public static List m(final byte[] array) {
        final long n = ((array[11] & 0xFF) << 8 | (array[10] & 0xFF)) * 1000000000L / 48000L;
        final ArrayList list = new ArrayList(3);
        list.add(array);
        list.add(n(n));
        list.add(n(80000000L));
        return list;
    }
    
    public static byte[] n(final long n) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(n).array();
    }
    
    public static final void o(final long n, final ioj ioj) {
        final ioj c0 = ioj.C0;
        final int n2 = 0;
        boolean b = false;
        if (ioj == c0) {
            if (jj6.g(n) != Integer.MAX_VALUE) {
                b = true;
            }
            if (!b) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        }
        else {
            int n3 = n2;
            if (jj6.h(n) != Integer.MAX_VALUE) {
                n3 = 1;
            }
            if (n3 == 0) {
                throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        }
    }
    
    public static float p(final float n, final float n2, final float n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static int q(final int n, final int n2, final int n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final long r(final long n, final long n2) {
        return lr0.b(pf8.v((int)(n2 >> 32), jj6.j(n), jj6.h(n)), pf8.v(iud.b(n2), jj6.i(n), jj6.g(n)));
    }
    
    public static boolean r0(int n) {
        final boolean f0 = f0(n);
        boolean b = true;
        if (f0 && t0(n)) {
            if ((n & 0x20) != 0x0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static final long s(final long n, final long n2) {
        return d(pf8.v(jj6.j(n2), jj6.j(n), jj6.h(n)), pf8.v(jj6.h(n2), jj6.j(n), jj6.h(n)), pf8.v(jj6.i(n2), jj6.i(n), jj6.g(n)), pf8.v(jj6.g(n2), jj6.i(n), jj6.g(n)));
    }
    
    public static boolean s0(final int n) {
        return (n & 0x1000000) != 0x0;
    }
    
    public static final int t(final long n, final int n2) {
        return pf8.v(n2, jj6.i(n), jj6.g(n));
    }
    
    public static boolean t0(final int n) {
        return (n & 0x10) != 0x0;
    }
    
    public static final int u(final long n, final int n2) {
        return pf8.v(n2, jj6.j(n), jj6.h(n));
    }
    
    public static final fae u0(final yy6 yy6, final oy6 oy6, final int n, final gub gub) {
        final oy6 c = qy6.c(yy6, oy6);
        if (n != 0) {
            Object o;
            if (n == 2) {
                o = new e3f(c, gub);
            }
            else {
                o = new h5r(c, true);
            }
            ((jb)o).H0(n, o, gub);
            return (fae)o;
        }
        throw null;
    }
    
    public static String w(final String s) {
        final StringBuilder n = xpa.n(dia.o(s, dia.o(s, 5)), ".", s, ",.", s);
        n.append(" *");
        return n.toString();
    }
    
    public static pb4 w0(final fk7 fk7, final xnb xnb, final ese ese) {
        Objects.requireNonNull(fk7);
        zzd.f((Object)ese, "builtIns");
        final ub4 g = k9e.a.g(xnb);
        pb4 j;
        if (g != null) {
            j = ese.j(g.b());
        }
        else {
            j = null;
        }
        return j;
    }
    
    public static int x(final int n) {
        final boolean d0 = d0(n);
        final int n2 = 0;
        int n3;
        if (d0) {
            n3 = 16;
        }
        else {
            n3 = 0;
        }
        final boolean b = (n & 0x2000) != 0x0;
        int n4 = n3;
        if (b) {
            n4 = (n3 | 0x8);
        }
        final boolean b2 = (n & 0x4000) != 0x0;
        int n5 = n4;
        if (b2) {
            n5 = (n4 | 0x4);
        }
        final boolean b3 = (0x2000000 & n) != 0x0;
        int n6 = n5;
        if (b3) {
            n6 = (n5 | 0x80);
        }
        int n7 = n2;
        if ((n & 0x2) != 0x0) {
            n7 = 1;
        }
        int n8 = n6;
        if (n7 != 0) {
            n8 = (n6 | 0x2);
        }
        int n9 = n8;
        if (i0(n)) {
            n9 = (n8 | 0x20);
        }
        int n10 = n9;
        if (M(n)) {
            n10 = (n9 | 0x40);
        }
        return n10;
    }
    
    public static final long x0(final long n, int n2, int n3) {
        final int n4 = jj6.j(n) + n2;
        final int n5 = 0;
        int n6 = n4;
        if (n4 < 0) {
            n6 = 0;
        }
        final int h = jj6.h(n);
        if (h == Integer.MAX_VALUE) {
            n2 = h;
        }
        else if ((n2 += h) < 0) {
            n2 = 0;
        }
        int n7;
        if ((n7 = jj6.i(n) + n3) < 0) {
            n7 = 0;
        }
        final int g = jj6.g(n);
        if (g == Integer.MAX_VALUE) {
            n3 = g;
        }
        else if ((n3 += g) < 0) {
            n3 = n5;
        }
        return d(n6, n2, n7, n3);
    }
    
    public static int y(final int n) {
        if (t0(n)) {
            return 16;
        }
        if (P(n)) {
            return 8;
        }
        if (s0(n)) {
            return 16777216;
        }
        return 0;
    }
    
    public static final Object y0(oy6 oy6, final gub gub) throws InterruptedException {
        final Thread currentThread = Thread.currentThread();
        final dp6$a c0 = dp6$a.C0;
        final dp6 dp6 = (dp6)oy6.c((oy6$b)c0);
        gca gca;
        if (dp6 == null) {
            final dms a = dms.a;
            final gca a2 = dms.a();
            oy6 = oy6.w0((oy6)a2);
            final oy6 a3 = qy6.a((oy6)k2a.C0, oy6, true);
            final zj8 a4 = r19.a;
            gca = a2;
            if ((oy6 = a3) != a4) {
                gca = a2;
                oy6 = a3;
                if (a3.c((oy6$b)c0) == null) {
                    oy6 = a3.w0((oy6)a4);
                    gca = a2;
                }
            }
        }
        else {
            if (dp6 instanceof gca) {
                final gca gca2 = (gca)dp6;
            }
            final dms a5 = dms.a;
            final gca gca3 = dms.b.get();
            final oy6 a6 = qy6.a((oy6)k2a.C0, oy6, true);
            final zj8 a7 = r19.a;
            gca = gca3;
            if ((oy6 = a6) != a7) {
                gca = gca3;
                oy6 = a6;
                if (a6.c((oy6$b)c0) == null) {
                    oy6 = a6.w0((oy6)a7);
                    gca = gca3;
                }
            }
        }
        oy6 = (oy6)new u22(oy6, currentThread, gca);
        ((jb)oy6).H0(1, (Object)oy6, gub);
        try {
            final gca f0 = ((u22)oy6).F0;
            if (f0 != null) {
                final int h0 = gca.H0;
                f0.S0(false);
            }
            try {
                while (!Thread.interrupted()) {
                    final gca f2 = ((u22)oy6).F0;
                    long w0;
                    if (f2 != null) {
                        w0 = f2.W0();
                    }
                    else {
                        w0 = Long.MAX_VALUE;
                    }
                    if (!((nae)oy6).W()) {
                        LockSupport.parkNanos(oy6, w0);
                    }
                    else {
                        final gca f3 = ((u22)oy6).F0;
                        if (f3 != null) {
                            final int h2 = gca.H0;
                            f3.K0(false);
                        }
                        final Object s0 = rp2.S0(((nae)oy6).a0());
                        if (s0 instanceof s06) {
                            oy6 = (oy6)s0;
                        }
                        else {
                            oy6 = null;
                        }
                        if (oy6 == null) {
                            return s0;
                        }
                        throw ((s06)oy6).a;
                    }
                }
                final InterruptedException ex = new InterruptedException();
                ((nae)oy6).F((Object)ex);
                throw ex;
            }
            finally {
                final gca f4 = ((u22)oy6).F0;
                if (f4 != null) {
                    final int h3 = gca.H0;
                    f4.K0(false);
                }
            }
        }
        finally {}
    }
    
    public static String z(final List list) {
        zzd.f((Object)list, "<this>");
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
        zzd.e((Object)string, "fastJoinTo(StringBuilder\u2026form)\n        .toString()");
        return string;
    }
    
    public float D(final y2d y2d, final bdf bdf) {
        float yChartMax = ((fu3)bdf).getYChartMax();
        float yChartMin = ((fu3)bdf).getYChartMin();
        final adf lineData = bdf.getLineData();
        final float d = ((s2d)y2d).d();
        final float n = 0.0f;
        if (d > 0.0f && ((s2d)y2d).h() < 0.0f) {
            yChartMax = n;
        }
        else {
            if (((du3)lineData).a > 0.0f) {
                yChartMax = 0.0f;
            }
            if (((du3)lineData).b < 0.0f) {
                yChartMin = 0.0f;
            }
            if (((s2d)y2d).h() >= 0.0f) {
                yChartMax = yChartMin;
            }
        }
        return yChartMax;
    }
    
    public boolean Q() {
        final boolean r = this.R();
        boolean b = false;
        if (r) {
            b = b;
            if (dta.b().b("c9s_admin_tools_reported_tweets_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean R() {
        return l7k.d(UserIdentifier.Companion, "c9s_enabled", false);
    }
    
    public boolean S() {
        final boolean r = this.R();
        boolean b = false;
        if (r) {
            b = b;
            if (dta.b().b("c9s_invites_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean T() {
        final boolean w = this.W();
        boolean b = false;
        if (w) {
            b = b;
            if (dta.b().b("twitter_chat_c9s_entry_point_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean U() {
        final boolean r = this.R();
        boolean b = false;
        if (r) {
            b = b;
            if (dta.b().b("c9s_edit_moderators_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean V() {
        final boolean r = this.R();
        boolean b = false;
        if (r) {
            b = b;
            if (dta.b().b("c9s_membership_settings_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean W() {
        final boolean r = this.R();
        boolean b = false;
        if (r) {
            b = b;
            if (dta.b().b("c9s_notification_settings_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean X() {
        final boolean w = this.W();
        boolean b = false;
        if (w) {
            b = b;
            if (dta.b().b("c9s_notification_settings_pinned_tweet_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean Y() {
        final boolean r = this.R();
        boolean b = false;
        if (r) {
            b = b;
            if (dta.b().b("c9s_remove_member_list_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean Z() {
        final boolean r = this.R();
        boolean b = false;
        if (r) {
            b = b;
            if (dta.b().b("c9s_request_to_join_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean a0() {
        final boolean r = this.R();
        boolean b2;
        final boolean b = b2 = false;
        if (r) {
            b2 = b;
            if (this.Z()) {
                b2 = b;
                if (dta.b().b("c9s_request_to_join_moderation_enabled", false)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public boolean b0() {
        final boolean w = this.W();
        boolean b = false;
        if (w) {
            b = b;
            if (dta.b().b("spaces_2022_h2_spaces_communities", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public Object c(final cl1 cl1) {
        final boolean b = cl1 instanceof pnd;
        final Object o = null;
        Object o2;
        if (b) {
            o2 = cl1;
        }
        else {
            o2 = null;
        }
        View view;
        if (o2 == null || (view = kq9.S0((mec)o2)) == null) {
            view = ((Fragment)cl1).j1;
        }
        Label_0104: {
            if (view == null) {
                break Label_0104;
            }
            Object f0 = null;
            try {
                view.getTag(2131428668);
            }
            finally {
                final Throwable t;
                f0 = kq9.F0(t);
            }
            Object o3 = f0;
            if (f0 instanceof wrm$b) {
                o3 = null;
            }
            final Object o4;
            if ((o4 = o3) == null) {
                break Label_0104;
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
            final Iterator iterator = ((ljp)y6x.c(viewGroup)).iterator();
            Object o4;
            do {
                final ijp ijp = (ijp)iterator;
                o5 = o;
                if (!ijp.hasNext()) {
                    return o5;
                }
                final View view2 = (View)ijp.next();
                Object f2 = null;
                try {
                    view2.getTag(2131428668);
                }
                finally {
                    final Throwable t2;
                    f2 = kq9.F0(t2);
                }
                o4 = f2;
                if (!(f2 instanceof wrm$b)) {
                    continue;
                }
                o4 = null;
            } while (o4 == null);
            return o4;
        }
        return o5;
    }
    
    public boolean c0() {
        final boolean r = this.R();
        boolean b = false;
        if (r) {
            b = b;
            if (dta.b().b("c9s_spotlight_creation_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public sj e(final String s, final aj2 aj2) {
        return (sj)new gtm(s, aj2);
    }
    
    public void f(final Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", (Throwable)null);
        }
    }
    
    @Override
    public Object j(final die die, final float n) throws IOException {
        return fle.d(die) * n;
    }
    
    public boolean j0(final pb4 pb4) {
        zzd.f((Object)pb4, "mutable");
        final k9e a = k9e.a;
        return k9e.k.containsKey(pq8.g((wb8)pb4));
    }
    
    public boolean m0() {
        final boolean r = this.R();
        boolean b = false;
        if (r) {
            b = b;
            if (dta.b().b("c9s_superc9s_indication_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public Object n0(final o16 o16) {
        final mc4 mc4 = new mc4();
        mc4.b.add(new fsy(mc4, mc4.a, mc4.b));
        final Thread thread = new Thread((Runnable)new iwz((Object)mc4.a, (Object)mc4.b, 3), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return mc4;
    }
    
    public boolean o0() {
        return this.p0() || this.q0();
    }
    
    public boolean p0() {
        final boolean r = this.R();
        boolean b = false;
        if (r) {
            b = b;
            if (dta.b().b("c9s_unread_indicator_mod_actions_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean q0() {
        final boolean r = this.R();
        boolean b = false;
        if (r) {
            b = b;
            if (dta.b().b("c9s_unread_indicator_tweets_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public pb4 v(final pb4 pb4) {
        final ynb g = pq8.g((wb8)pb4);
        final k9e a = k9e.a;
        final xnb xnb = k9e.l.get(g);
        if (xnb != null) {
            return qq8.e((wb8)pb4).j(xnb);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Given class ");
        sb.append(pb4);
        sb.append(" is not a ");
        sb.append("read-only");
        sb.append(" collection");
        throw new IllegalArgumentException(sb.toString());
    }
}
