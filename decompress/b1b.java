import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.Fragment;
import java.io.IOException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import android.content.res.Resources;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import java.util.ArrayList;
import java.util.Arrays;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.TypedValue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b1b implements lp6, btl, z2c, k26, c0z
{
    public static final byte[] F0;
    public static final String[] G0;
    public static final b1b H0;
    public static final int[] I0;
    public static final int[] J0;
    public static final int[] K0;
    public static final int[] L0;
    public static final b1b M0;
    public static final int[] N0;
    public static final int[] O0;
    public static final int[] P0;
    public static final int[] Q0;
    public static final int[] R0;
    public static final int[] S0;
    public static final int[] T0;
    public static final int[] U0;
    public static volatile pb8 V0;
    public static final int[] W0;
    public static final int[] X0;
    public static final int[] Y0;
    public static final int[] Z0;
    public static final b1b a1;
    public static final b1b b1;
    
    static {
        F0 = new byte[] { 0, 0, 0, 1 };
        G0 = new String[] { "", "A", "B", "C" };
        H0 = new b1b();
        I0 = new int[] { 1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        J0 = new int[] { 3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2 };
        K0 = new int[] { 0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3 };
        L0 = new int[] { 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149 };
        M0 = new b1b();
        N0 = new int[] { 1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, 209, 241, 305, 369, 497, 753, 1265, 2289, 4337, 8433, 16625 };
        O0 = new int[] { 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24 };
        P0 = new int[] { 0, 1, 2, 3, 4, 5, 6, 8, 10, 14, 18, 26, 34, 50, 66, 98, 130, 194, 322, 578, 1090, 2114, 6210, 22594 };
        Q0 = new int[] { 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24 };
        R0 = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 18, 22, 30, 38, 54, 70, 102, 134, 198, 326, 582, 1094, 2118 };
        S0 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24 };
        T0 = new int[] { 0, 0, 8, 8, 0, 16, 8, 16, 16 };
        U0 = new int[] { 0, 8, 0, 8, 16, 0, 16, 8, 16 };
        b1b.V0 = new pb8();
        W0 = new int[] { 2130968651, 2130968721, 2130969476, 2130969478, 2130969479, 2130970275, 2130970307, 2130970308, 2130970356, 2130970373, 2130970375, 2130970376, 2130970486, 2130970487, 2130970495, 2130970496, 2130970497, 2130970498, 2130970499, 2130970501, 2130970502, 2130970503, 2130970504, 2130970505, 2130970506, 2130970508, 2130970509, 2130970510, 2130971106 };
        X0 = new int[] { 2130968650, 2130968651, 2130968652, 2130968721, 2130969476, 2130969478, 2130969479, 2130970275, 2130970307, 2130970308, 2130970356, 2130970373, 2130970375, 2130970376, 2130970486, 2130970487, 2130970495, 2130970496, 2130970497, 2130970498, 2130970499, 2130970501, 2130970502, 2130970503, 2130970504, 2130970505, 2130970506, 2130970508, 2130970509, 2130970510, 2130971106 };
        Y0 = new int[] { 2130968679, 2130968747, 2130968749, 2130968752, 2130968753 };
        Z0 = new int[] { 2130970568, 2130970569, 2130970570, 2130970571 };
        a1 = new b1b();
        b1 = new b1b();
    }
    
    public static int A(final int[] array, int n, final i02 i02) {
        final long f = i02.f;
        final int g = i02.g;
        final int n2 = (int)(f >>> g);
        final int n3 = n + (n2 & 0xFF);
        n = array[n3] >> 16;
        final int n4 = array[n3] & 0xFFFF;
        if (n <= 8) {
            i02.g = g + n;
            return n4;
        }
        n = n3 + n4 + (((1 << n) - 1 & n2) >>> 8);
        i02.g = (array[n] >> 16) + 8 + g;
        return array[n] & 0xFFFF;
    }
    
    public static final int B(final Context context, int data) {
        e0e.f((Object)context, "context");
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(data, typedValue, true)) {
            data = typedValue.data;
        }
        else {
            final String resourceEntryName = context.getResources().getResourceEntryName(data);
            final StringBuilder sb = new StringBuilder();
            sb.append("Attribute resource doesn't got resolved for ");
            sb.append(resourceEntryName);
            Log.w("AttributeResolver", sb.toString());
            po.b().t();
            data = 0;
        }
        return data;
    }
    
    public static final int C(final Context context, int n, final int n2) {
        e0e.f((Object)context, "context");
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true)) {
            n = typedValue.data;
        }
        else {
            n = qo6.b(context, n2);
        }
        return n;
    }
    
    public static final ColorStateList D(final Context context, final int n, final TypedArray typedArray) {
        e0e.f((Object)context, "context");
        e0e.f((Object)typedArray, "typedArray");
        final int resourceId = typedArray.getResourceId(n, 0);
        ColorStateList list;
        if (resourceId != 0) {
            list = d4j.D(context, resourceId);
        }
        else {
            list = typedArray.getColorStateList(n);
        }
        return list;
    }
    
    public static final float E(final Context context, final int n, final int n2) {
        e0e.f((Object)context, "context");
        final TypedValue typedValue = new TypedValue();
        float n3;
        if (context.getTheme().resolveAttribute(n, typedValue, true) && typedValue.type == 5) {
            n3 = TypedValue.complexToDimension(typedValue.data, context.getResources().getDisplayMetrics());
        }
        else {
            n3 = context.getResources().getDimension(n2);
        }
        return n3;
    }
    
    public static final int F(final Context context, int n, final int n2) {
        e0e.f((Object)context, "context");
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true) && typedValue.type == 5) {
            n = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        else {
            n = context.getResources().getDimensionPixelSize(n2);
        }
        return n;
    }
    
    public static final Drawable G(final Context context, int a, final int n) {
        e0e.f((Object)context, "context");
        a = ie9.a(context, a, n);
        final Object a2 = qo6.a;
        return qo6$c.b(context, a);
    }
    
    public static final String H(long n, final boolean b) {
        final long n2 = 3600;
        final long n3 = 60;
        final long n4 = n % n2 / n3;
        n %= n3;
        String s;
        if (b) {
            s = String.format("-%01d:%02d", Arrays.copyOf(new Object[] { n4, n }, 2));
            e0e.e((Object)s, "format(format, *args)");
        }
        else {
            s = String.format(" %01d:%02d", Arrays.copyOf(new Object[] { n4, n }, 2));
            e0e.e((Object)s, "format(format, *args)");
        }
        return s;
    }
    
    public static final wbv I(final t7c t7c) {
        e0e.f((Object)t7c, "<this>");
        final Map d = t7c.d;
        m8c m8c;
        if (d != null) {
            m8c = new m8c(d);
        }
        else {
            m8c = null;
        }
        int a;
        if (m8c != null) {
            a = m8c.a;
        }
        else {
            a = 0;
        }
        final String a2 = t7c.a;
        int intValue = 0;
        Label_0085: {
            if (m8c != null) {
                final Integer d2 = m8c.d;
                if (d2 != null) {
                    intValue = d2;
                    break Label_0085;
                }
            }
            intValue = -1;
        }
        iav f;
        if (m8c != null) {
            f = m8c.f;
        }
        else {
            f = null;
        }
        String a3 = null;
        Label_0133: {
            if (m8c != null) {
                final jgv g = m8c.g;
                if (g != null) {
                    a3 = g.a;
                    break Label_0133;
                }
            }
            a3 = null;
        }
        s7c s7c;
        if (m8c != null) {
            final List b = t7c.b;
            final List c = t7c.c;
            final int a4 = m8c.a;
            final int b2 = m8c.b;
            int d3;
            if (b2 == 0 || (d3 = j00.D(mw.B(b2))) == 0) {
                d3 = 21;
            }
            final String c2 = m8c.c;
            final String e = m8c.e;
            final jgv g2 = m8c.g;
            String i1;
            if (c != null) {
                final ArrayList list = new ArrayList<String>(nr4.d1((Iterable)c, 10));
                for (final t7c$b t7c$b : c) {
                    Serializable s;
                    if (t7c$b instanceof t7c$b$b) {
                        s = ((t7c$b$b)t7c$b).a;
                    }
                    else {
                        if (!(t7c$b instanceof t7c$b$a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s = ((t7c$b$a)t7c$b).a;
                    }
                    list.add((String)s);
                }
                i1 = rr4.I1((Iterable)list, (CharSequence)null, (CharSequence)null, (CharSequence)null, (stb)null, 63);
            }
            else {
                i1 = null;
            }
            String i2;
            if (b != null) {
                i2 = rr4.I1((Iterable)b, (CharSequence)null, (CharSequence)null, (CharSequence)null, (stb)j7c.F0, 31);
            }
            else {
                i2 = null;
            }
            s7c = new s7c(a4, d3, c2, e, g2, i1, i2);
        }
        else {
            s7c = null;
        }
        return new wbv(a, a2, 0L, "", (String)null, intValue, f, (l0j)null, a3, s7c);
    }
    
    public static final String J(final Resources resources, final n5c n5c) {
        e0e.f((Object)resources, "res");
        if (n5c != n5c$f.b && n5c != n5c$e.b) {
            String s;
            if (n5c == n5c$d.b) {
                s = resources.getString(2131954208);
                e0e.e((Object)s, "{\n                res.ge\u2026tton_title)\n            }");
            }
            else if (n5c == n5c$j.b) {
                s = resources.getString(2131952801);
                e0e.e((Object)s, "{\n                res.ge\u2026connecting)\n            }");
            }
            else if (n5c == n5c$b.b) {
                s = resources.getString(2131956124);
                e0e.e((Object)s, "{\n                res.ge\u2026_undefined)\n            }");
            }
            else if (n5c == n5c$i.b) {
                s = resources.getString(2131956644);
                e0e.e((Object)s, "{\n                res.ge\u2026_broadcast)\n            }");
            }
            else if (n5c == n5c$h.b) {
                s = resources.getString(2131956642);
                e0e.e((Object)s, "{\n                res.ge\u2026cast_error)\n            }");
            }
            else if (n5c == n5c$a.b) {
                s = resources.getString(2131956123);
                e0e.e((Object)s, "{\n                res.ge\u2026te_too_low)\n            }");
            }
            else if (n5c == n5c$c.b) {
                s = resources.getString(2131956199);
                e0e.e((Object)s, "{\n                res.ge\u2026init_error)\n            }");
            }
            else if (n5c instanceof n5c$g) {
                s = resources.getString(2131956194, new Object[] { ((n5c$g)n5c).b });
                e0e.e((Object)s, "{\n                res.ge\u2026          )\n            }");
            }
            else {
                s = "";
            }
            return s;
        }
        final String string = resources.getString(2131954208);
        e0e.e((Object)string, "res.getString(R.string.go_live_button_title)");
        return string;
    }
    
    public static final void c(final f8b f0, final Object o, final mp6 mp6) {
        f9b f9b2 = null;
        Label_0052: {
            if (mp6 instanceof f9b) {
                final f9b f9b = (f9b)mp6;
                final int h0 = f9b.H0;
                if ((h0 & Integer.MIN_VALUE) != 0x0) {
                    f9b.H0 = h0 + Integer.MIN_VALUE;
                    f9b2 = f9b;
                    break Label_0052;
                }
            }
            f9b2 = new f9b(mp6);
        }
        final Object g0 = f9b2.G0;
        final jz6 f2 = jz6.F0;
        final int h2 = f9b2.H0;
        f8b f3;
        if (h2 != 0) {
            if (h2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f3 = f9b2.F0;
            jb2.M0(g0);
        }
        else {
            jb2.M0(g0);
            f9b2.F0 = f0;
            f9b2.H0 = 1;
            f3 = f0;
            if (f0.a(o, (mp6)f9b2) == f2) {
                return;
            }
        }
        throw new AbortFlowException(f3);
    }
    
    public static String d(final int n, final int n2, final int n3) {
        return String.format("avc1.%02X%02X%02X", n, n2, n3);
    }
    
    public static String e(int length, final boolean b, int i, final int n, final int[] array, final int n2) {
        final String s = b1b.G0[length];
        char c;
        if (b) {
            c = 'H';
        }
        else {
            c = 'L';
        }
        final StringBuilder sb = new StringBuilder(rnw.m("hvc1.%s%d.%X.%c%d", new Object[] { s, i, n, c, n2 }));
        for (length = array.length; length > 0 && array[length - 1] == 0; --length) {}
        for (i = 0; i < length; ++i) {
            sb.append(String.format(".%02X", array[i]));
        }
        return sb.toString();
    }
    
    public static final boolean f(final cnq cnq) {
        e0e.f((Object)cnq, "<this>");
        return cnq != cnq.H0;
    }
    
    public static void h(final j9r j9r, int n) {
        final i02 c = j9r.c;
        final int[] p2 = j9r.p;
        final int n2 = n * 2;
        i02.b(c);
        final int[] e = j9r.e;
        final int n3 = n * 1080;
        int a = A(e, n3, c);
        j9r.n[n] = y(j9r.f, n3, c);
        if (a == 1) {
            a = p2[n2 + 1] + 1;
        }
        else if (a == 0) {
            a = p2[n2];
        }
        else {
            a -= 2;
        }
        final int[] o = j9r.o;
        int n4 = a;
        if (a >= o[n]) {
            n4 = a - o[n];
        }
        n = n2 + 1;
        p2[n2] = p2[n];
        p2[n] = n4;
    }
    
    public static int j(final int n, final byte[] array, final i02 i02) {
        i02.f(i02);
        final int n2 = l(i02) + 1;
        if (n2 == 1) {
            int n3;
            for (int j = 0; j < n; j += n3) {
                n3 = Math.min(j + 1024, n) - j;
                System.arraycopy(p0b.I0, 0, array, 0 + j, n3);
            }
            return n2;
        }
        int n4;
        if (i02.e(i02, 1) == 1) {
            n4 = i02.e(i02, 4) + 1;
        }
        else {
            n4 = 0;
        }
        final int[] array2 = new int[1080];
        z(n2 + n4, array2, 0, i02);
        int k = 0;
    Label_0118:
        while (k < n) {
            i02.f(i02);
            i02.b(i02);
            final int a = A(array2, 0, i02);
            if (a == 0) {
                array[k] = 0;
            }
            else {
                if (a <= n4) {
                    int n5 = i02.e(i02, a) + (1 << a);
                    int n6 = k;
                    while (true) {
                        k = n6;
                        if (n5 == 0) {
                            continue Label_0118;
                        }
                        if (n6 >= n) {
                            break;
                        }
                        array[n6] = 0;
                        ++n6;
                        --n5;
                    }
                    throw new np2("Corrupted context map");
                }
                array[k] = (byte)(a - n4);
            }
            ++k;
        }
        if (i02.e(i02, 1) == 1) {
            final int[] array3 = new int[256];
            for (int l = 0; l < 256; ++l) {
                array3[l] = l;
            }
            for (int n7 = 0; n7 < n; ++n7) {
                int n8 = array[n7] & 0xFF;
                array[n7] = (byte)array3[n8];
                if (n8 != 0) {
                    final int n9 = array3[n8];
                    while (n8 > 0) {
                        final int n10 = n8 - 1;
                        array3[n8] = array3[n10];
                        n8 = n10;
                    }
                    array3[0] = n9;
                }
            }
        }
        return n2;
    }
    
    public static void k(final j9r j9r) {
        h(j9r, 0);
        final int n = j9r.p[1];
        final int a = n << 6;
        j9r.A = a;
        j9r.v = ((int[])j9r.k.c)[j9r.z[a] & 0xFF];
        final byte b = j9r.y[n];
        final int[] g0 = dnl.G0;
        j9r.C = g0[b];
        j9r.D = g0[b + 1];
    }
    
    public static int l(final i02 i02) {
        if (i02.e(i02, 1) == 0) {
            return 0;
        }
        final int e = i02.e(i02, 3);
        if (e == 0) {
            return 1;
        }
        return i02.e(i02, e) + (1 << e);
    }
    
    public static void n(final j9r j9r) {
        final int a = j9r.a;
        if (a == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        if (a == 11) {
            throw new IllegalStateException("Can't decompress after close");
        }
        final i02 c = j9r.c;
        int n = j9r.P - 1;
        byte[] array = j9r.d;
        while (true) {
            final int a2 = j9r.a;
            if (a2 == 10) {
                if (a2 == 10) {
                    if (j9r.g < 0) {
                        throw new np2("Invalid metablock length");
                    }
                    i02.d(c);
                    i02.a(j9r.c, true);
                }
                return;
            }
            if (a2 != 12) {
                final int n2 = 4;
                Label_2773: {
                    Label_1957: {
                        Label_1748: {
                            switch (a2) {
                                default: {
                                    final StringBuilder f = ehk.f("Unexpected state ");
                                    f.append(j9r.a);
                                    throw new np2(f.toString());
                                }
                                case 9: {
                                    final int l = j9r.L;
                                    if (l < 4 || l > 24) {
                                        throw new np2("Invalid backward reference");
                                    }
                                    final int n3 = ux8.a[l];
                                    final int n4 = j9r.K - j9r.s - 1;
                                    final int n5 = ux8.b[l];
                                    final int n6 = n4 >>> n5;
                                    final jzt[] d = jzt.d;
                                    if (n6 >= d.length) {
                                        throw new np2("Invalid backward reference");
                                    }
                                    final int m = j9r.M;
                                    final byte[] a3 = ux8$a.a;
                                    final jzt jzt = d[n6];
                                    final byte[] a4 = jzt.a;
                                    final int length = a4.length;
                                    int i = 0;
                                    int n7 = m;
                                    while (i < length) {
                                        array[n7] = a4[i];
                                        ++n7;
                                        ++i;
                                    }
                                    final int b = jzt.b;
                                    int n8;
                                    if (b >= 12) {
                                        n8 = b - 12 + 1;
                                    }
                                    else {
                                        n8 = 0;
                                    }
                                    int n9 = n8;
                                    if (n8 > l) {
                                        n9 = l;
                                    }
                                    final int n10 = ((1 << n5) - 1 & n4) * l + n3 + n9;
                                    int n11;
                                    if (b <= 9) {
                                        n11 = b - 1 + 1;
                                    }
                                    else {
                                        n11 = 0;
                                    }
                                    int k;
                                    int j = k = l - n9 - n11;
                                    for (int n12 = n10; k > 0; --k, ++n7, ++n12) {
                                        array[n7] = a3[n12];
                                    }
                                    if (b == 11 || b == 10) {
                                        int n14;
                                        final int n13 = n14 = n7 - j;
                                        if (b == 10) {
                                            j = 1;
                                            n14 = n13;
                                        }
                                        while (j > 0) {
                                            final int n15 = array[n14] & 0xFF;
                                            if (n15 < 192) {
                                                if (n15 >= 97 && n15 <= 122) {
                                                    array[n14] ^= 0x20;
                                                }
                                                ++n14;
                                                --j;
                                            }
                                            else if (n15 < 224) {
                                                final int n16 = n14 + 1;
                                                array[n16] ^= 0x20;
                                                n14 += 2;
                                                j -= 2;
                                            }
                                            else {
                                                final int n17 = n14 + 2;
                                                array[n17] ^= 0x5;
                                                n14 += 3;
                                                j -= 3;
                                            }
                                        }
                                    }
                                    final byte[] c2 = jzt.c;
                                    for (int length2 = c2.length, n18 = 0; n18 < length2; ++n18) {
                                        array[n7] = c2[n18];
                                        ++n7;
                                    }
                                    final int n19 = n7 - m;
                                    final int m2 = j9r.M + n19;
                                    j9r.M = m2;
                                    j9r.r += n19;
                                    j9r.g -= n19;
                                    final int p = j9r.P;
                                    if (m2 >= p) {
                                        j9r.b = 8;
                                        j9r.X = p;
                                        j9r.W = 0;
                                        j9r.a = 12;
                                        continue;
                                    }
                                    j9r.a = 3;
                                    continue;
                                }
                                case 8: {
                                    final int p2 = j9r.P;
                                    System.arraycopy(array, p2, array, 0, j9r.M - p2);
                                    j9r.a = 3;
                                    continue;
                                }
                                case 7: {
                                    break Label_2773;
                                }
                                case 6: {
                                    break Label_1957;
                                }
                                case 5: {
                                    final i02 c3 = j9r.c;
                                    final byte[] d2 = j9r.d;
                                    final int g = j9r.g;
                                    if (g <= 0) {
                                        if (c3.g == 64) {
                                            i02.f(c3);
                                            i02.a(c3, false);
                                            i02.b(c3);
                                            i02.b(c3);
                                        }
                                        j9r.a = 1;
                                        continue;
                                    }
                                    final int min = Math.min(j9r.P - j9r.r, g);
                                    int r = j9r.r;
                                    if ((c3.g & 0x7) != 0x0) {
                                        throw new np2("Unaligned copyBytes");
                                    }
                                    int n20 = min;
                                    while (true) {
                                        final int g2 = c3.g;
                                        if (g2 == 64 || n20 == 0) {
                                            break;
                                        }
                                        d2[r] = (byte)(c3.f >>> g2);
                                        c3.g = g2 + 8;
                                        --n20;
                                        ++r;
                                    }
                                    if (n20 != 0) {
                                        final int min2 = Math.min(i02.c(c3), n20 >> 2);
                                        int n21 = r;
                                        int n22 = n20;
                                        if (min2 > 0) {
                                            final int h = c3.h;
                                            final byte[] a5 = c3.a;
                                            final int n23 = min2 << 2;
                                            System.arraycopy(a5, h << 2, d2, r, n23);
                                            n21 = r + n23;
                                            n22 = n20 - n23;
                                            c3.h += min2;
                                        }
                                        if (n22 != 0) {
                                            int n24 = n21;
                                            int n25 = n22;
                                            if (i02.c(c3) > 0) {
                                                i02.b(c3);
                                                while (n22 != 0) {
                                                    final long f2 = c3.f;
                                                    final int g3 = c3.g;
                                                    d2[n21] = (byte)(f2 >>> g3);
                                                    c3.g = g3 + 8;
                                                    --n22;
                                                    ++n21;
                                                }
                                                i02.a(c3, false);
                                            }
                                            else {
                                                while (n25 > 0) {
                                                    try {
                                                        final int read = c3.d.read(d2, n24, n25);
                                                        if (read != -1) {
                                                            n24 += read;
                                                            n25 -= read;
                                                            continue;
                                                        }
                                                        throw new np2("Unexpected end of input");
                                                    }
                                                    catch (final IOException ex) {
                                                        throw new np2((Throwable)ex);
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    j9r.g -= min;
                                    final int r2 = j9r.r + min;
                                    j9r.r = r2;
                                    final int p3 = j9r.P;
                                    if (r2 == p3) {
                                        j9r.b = 5;
                                        j9r.X = p3;
                                        j9r.W = 0;
                                        j9r.a = 12;
                                        continue;
                                    }
                                    if (c3.g == 64) {
                                        i02.f(c3);
                                        i02.a(c3, false);
                                        i02.b(c3);
                                        i02.b(c3);
                                    }
                                    j9r.a = 1;
                                    continue;
                                }
                                case 4: {
                                    while (j9r.g > 0) {
                                        i02.f(c);
                                        i02.e(c, 8);
                                        --j9r.g;
                                    }
                                    j9r.a = 1;
                                    continue;
                                }
                                case 3: {
                                    break Label_1748;
                                }
                                case 2: {
                                    final i02 c4 = j9r.c;
                                    for (int n26 = 0; n26 < 3; ++n26) {
                                        j9r.o[n26] = l(c4) + 1;
                                        j9r.n[n26] = 268435456;
                                        final int[] o = j9r.o;
                                        if (o[n26] > 1) {
                                            final int n27 = o[n26];
                                            final int[] e = j9r.e;
                                            final int n28 = n26 * 1080;
                                            z(n27 + 2, e, n28, c4);
                                            z(26, j9r.f, n28, c4);
                                            j9r.n[n26] = y(j9r.f, n28, c4);
                                        }
                                    }
                                    i02.f(c4);
                                    j9r.J = i02.e(c4, 2);
                                    final int e2 = i02.e(c4, 4);
                                    final int j2 = j9r.J;
                                    final int h2 = (e2 << j2) + 16;
                                    j9r.H = h2;
                                    j9r.I = (1 << j2) - 1;
                                    j9r.y = new byte[j9r.o[0]];
                                    int n29 = 0;
                                    int[] o2;
                                    while (true) {
                                        o2 = j9r.o;
                                        if (n29 >= o2[0]) {
                                            break;
                                        }
                                        while (n29 < Math.min(n29 + 96, o2[0])) {
                                            j9r.y[n29] = (byte)(i02.e(c4, 2) << 1);
                                            ++n29;
                                        }
                                        i02.f(c4);
                                    }
                                    final byte[] z = new byte[o2[0] << 6];
                                    j9r.z = z;
                                    final int j3 = j(o2[0] << 6, z, c4);
                                    j9r.u = true;
                                    int n30 = 0;
                                    int[] o3;
                                    while (true) {
                                        o3 = j9r.o;
                                        if (n30 >= o3[0] << 6) {
                                            break;
                                        }
                                        if (j9r.z[n30] != n30 >> 6) {
                                            j9r.u = false;
                                            break;
                                        }
                                        ++n30;
                                    }
                                    final byte[] g4 = new byte[o3[2] << 2];
                                    j9r.G = g4;
                                    final int j4 = j(o3[2] << 2, g4, c4);
                                    v5d.d(j9r.k, 256, j3);
                                    v5d.d(j9r.l, 704, j9r.o[1]);
                                    v5d.d(j9r.m, h2 + (48 << j2), j4);
                                    v5d.a(j9r.k, c4);
                                    v5d.a(j9r.l, c4);
                                    v5d.a(j9r.m, c4);
                                    j9r.A = 0;
                                    j9r.B = 0;
                                    final int[] g5 = dnl.G0;
                                    final byte[] y = j9r.y;
                                    j9r.C = g5[y[0]];
                                    j9r.D = g5[y[0] + 1];
                                    j9r.v = ((int[])j9r.k.c)[0];
                                    j9r.E = ((int[])j9r.l.c)[0];
                                    final int[] p4 = j9r.p;
                                    p4[4] = 1;
                                    p4[0] = (p4[2] = 1);
                                    p4[5] = 0;
                                    p4[1] = (p4[3] = 0);
                                    j9r.a = 3;
                                    break Label_1748;
                                }
                                case 1: {
                                    if (j9r.g >= 0) {
                                        final i02 c5 = j9r.c;
                                        if (j9r.h) {
                                            j9r.b = 10;
                                            j9r.X = j9r.r;
                                            j9r.W = 0;
                                            j9r.a = 12;
                                        }
                                        else {
                                            final v5d k2 = j9r.k;
                                            k2.b = null;
                                            k2.c = null;
                                            final v5d l2 = j9r.l;
                                            l2.b = null;
                                            l2.c = null;
                                            final v5d m3 = j9r.m;
                                            m3.b = null;
                                            m3.c = null;
                                            i02.f(c5);
                                            final boolean h3 = i02.e(c5, 1) == 1;
                                            j9r.h = h3;
                                            j9r.g = 0;
                                            j9r.i = false;
                                            j9r.j = false;
                                            Label_3420: {
                                                if (!h3 || i02.e(c5, 1) == 0) {
                                                    final int n31 = i02.e(c5, 2) + 4;
                                                    if (n31 == 7) {
                                                        j9r.j = true;
                                                        if (i02.e(c5, 1) != 0) {
                                                            throw new np2("Corrupted reserved bit");
                                                        }
                                                        final int e3 = i02.e(c5, 2);
                                                        if (e3 == 0) {
                                                            break Label_3420;
                                                        }
                                                        for (int n32 = 0; n32 < e3; ++n32) {
                                                            final int e4 = i02.e(c5, 8);
                                                            if (e4 == 0 && n32 + 1 == e3 && e3 > 1) {
                                                                throw new np2("Exuberant nibble");
                                                            }
                                                            j9r.g |= e4 << n32 * 8;
                                                        }
                                                    }
                                                    else {
                                                        for (int n33 = 0; n33 < n31; ++n33) {
                                                            final int e5 = i02.e(c5, 4);
                                                            if (e5 == 0 && n33 + 1 == n31 && n31 > 4) {
                                                                throw new np2("Exuberant nibble");
                                                            }
                                                            j9r.g |= e5 << n33 * 4;
                                                        }
                                                    }
                                                    ++j9r.g;
                                                    if (!j9r.h) {
                                                        j9r.i = (i02.e(c5, 1) == 1);
                                                    }
                                                }
                                            }
                                            if (j9r.g != 0 || j9r.j) {
                                                if (!j9r.i && !j9r.j) {
                                                    j9r.a = 2;
                                                }
                                                else {
                                                    i02.d(c5);
                                                    int a6;
                                                    if (j9r.j) {
                                                        a6 = n2;
                                                    }
                                                    else {
                                                        a6 = 5;
                                                    }
                                                    j9r.a = a6;
                                                }
                                                if (!j9r.j) {
                                                    final long q = j9r.Q + j9r.g;
                                                    j9r.Q = q;
                                                    final int p5 = j9r.P;
                                                    int o4 = j9r.O;
                                                    if (p5 < o4) {
                                                        int p6 = o4;
                                                        if (o4 > q) {
                                                            final int n34 = (int)q;
                                                            final int length3 = j9r.R.length;
                                                            while (true) {
                                                                final int n35 = o4 >> 1;
                                                                if (n35 <= n34 + length3) {
                                                                    break;
                                                                }
                                                                o4 = n35;
                                                            }
                                                            p6 = o4;
                                                            if (!j9r.h && (p6 = o4) < 16384) {
                                                                p6 = o4;
                                                                if (j9r.O >= 16384) {
                                                                    p6 = 16384;
                                                                }
                                                            }
                                                        }
                                                        final int p7 = j9r.P;
                                                        if (p6 > p7) {
                                                            final byte[] d3 = new byte[p6 + 37];
                                                            final byte[] d4 = j9r.d;
                                                            if (d4 != null) {
                                                                System.arraycopy(d4, 0, d3, 0, p7);
                                                            }
                                                            else {
                                                                final byte[] r3 = j9r.R;
                                                                if (r3.length != 0) {
                                                                    final int length4 = r3.length;
                                                                    int n36 = j9r.N;
                                                                    int n37;
                                                                    if (length4 > n36) {
                                                                        n37 = length4 - n36;
                                                                    }
                                                                    else {
                                                                        n36 = length4;
                                                                        n37 = 0;
                                                                    }
                                                                    System.arraycopy(r3, n37, d3, 0, n36);
                                                                    j9r.r = n36;
                                                                    j9r.S = n36;
                                                                }
                                                            }
                                                            j9r.d = d3;
                                                            j9r.P = p6;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        final int p8 = j9r.P;
                                        array = j9r.d;
                                        n = p8 - 1;
                                        continue;
                                    }
                                    throw new np2("Invalid metablock length");
                                }
                            }
                            continue;
                        }
                        final byte[] array2 = array;
                        if (j9r.g <= 0) {
                            j9r.a = 1;
                            array = array2;
                            continue;
                        }
                        i02.f(c);
                        if (j9r.n[1] == 0) {
                            h(j9r, 1);
                            j9r.E = ((int[])j9r.l.c)[j9r.p[3]];
                        }
                        final int[] n38 = j9r.n;
                        --n38[1];
                        i02.b(c);
                        final int a7 = A((int[])j9r.l.b, j9r.E, c);
                        final int n39 = a7 >>> 6;
                        j9r.F = 0;
                        int n40;
                        if ((n40 = n39) >= 2) {
                            n40 = n39 - 2;
                            j9r.F = -1;
                        }
                        final int n41 = b1b.T0[n40] + (a7 >>> 3 & 0x7);
                        final int n42 = b1b.U0[n40] + (a7 & 0x7);
                        j9r.x = i02.e(c, b1b.Q0[n41]) + b1b.P0[n41];
                        j9r.L = i02.e(c, b1b.S0[n42]) + b1b.R0[n42];
                        j9r.w = 0;
                        j9r.a = 6;
                    }
                    final byte[] array3 = array;
                    if (j9r.u) {
                        while (j9r.w < j9r.x) {
                            i02.f(c);
                            if (j9r.n[0] == 0) {
                                k(j9r);
                            }
                            final int[] n43 = j9r.n;
                            --n43[0];
                            i02.b(c);
                            array3[j9r.r] = (byte)A((int[])j9r.k.b, j9r.v, c);
                            ++j9r.w;
                            if (j9r.r++ == n) {
                                j9r.b = 6;
                                j9r.X = j9r.P;
                                j9r.W = 0;
                                j9r.a = 12;
                                break;
                            }
                        }
                    }
                    else {
                        final int r4 = j9r.r;
                        int n44 = array3[r4 - 1 & n] & 0xFF;
                        int n45 = array3[r4 - 2 & n] & 0xFF;
                        while (j9r.w < j9r.x) {
                            i02.f(c);
                            if (j9r.n[0] == 0) {
                                k(j9r);
                            }
                            final byte[] z2 = j9r.z;
                            final int a8 = j9r.A;
                            final int[] f3 = dnl.F0;
                            final byte b2 = z2[a8 + (f3[j9r.D + n45] | f3[j9r.C + n44])];
                            final int[] n46 = j9r.n;
                            --n46[0];
                            i02.b(c);
                            final v5d k3 = j9r.k;
                            final int a9 = A((int[])k3.b, ((int[])k3.c)[b2 & 0xFF], c);
                            final int r5 = j9r.r;
                            array3[r5] = (byte)a9;
                            ++j9r.w;
                            j9r.r = r5 + 1;
                            if (r5 == n) {
                                j9r.b = 6;
                                j9r.X = j9r.P;
                                j9r.W = 0;
                                j9r.a = 12;
                                break;
                            }
                            n45 = n44;
                            n44 = a9;
                        }
                    }
                    if (j9r.a != 6) {
                        array = array3;
                        continue;
                    }
                    if ((j9r.g -= j9r.x) <= 0) {
                        j9r.a = 3;
                        array = array3;
                        continue;
                    }
                    if (j9r.F < 0) {
                        i02.f(c);
                        if (j9r.n[2] == 0) {
                            h(j9r, 2);
                            j9r.B = j9r.p[5] << 2;
                        }
                        final int[] n47 = j9r.n;
                        --n47[2];
                        i02.b(c);
                        final v5d m4 = j9r.m;
                        final int[] array4 = (int[])m4.b;
                        final int[] array5 = (int[])m4.c;
                        final byte[] g6 = j9r.G;
                        final int b3 = j9r.B;
                        int l3 = j9r.L;
                        if (l3 > 4) {
                            l3 = 3;
                        }
                        else {
                            l3 -= 2;
                        }
                        final int a10 = A(array4, array5[g6[b3 + l3] & 0xFF], c);
                        j9r.F = a10;
                        final int h4 = j9r.H;
                        if (a10 >= h4) {
                            final int n48 = a10 - h4;
                            final int i2 = j9r.I;
                            final int f4 = n48 >>> j9r.J;
                            j9r.F = f4;
                            final int n49 = (f4 >>> 1) + 1;
                            j9r.F = h4 + (i2 & n48) + (i02.e(c, n49) + (((f4 & 0x1) + 2 << n49) - 4) << j9r.J);
                        }
                    }
                    final int f5 = j9r.F;
                    final int[] q2 = j9r.q;
                    final int t = j9r.t;
                    int k4;
                    if (f5 < 16) {
                        k4 = q2[b1b.J0[f5] + t & 0x3] + b1b.K0[f5];
                    }
                    else {
                        k4 = f5 - 16 + 1;
                    }
                    j9r.K = k4;
                    if (k4 < 0) {
                        throw new np2("Negative distance");
                    }
                    final int s = j9r.s;
                    final int n50 = j9r.N;
                    Label_2704: {
                        if (s != n50) {
                            final int r6 = j9r.r;
                            if (r6 < n50) {
                                j9r.s = r6;
                                break Label_2704;
                            }
                        }
                        j9r.s = n50;
                    }
                    j9r.M = j9r.r;
                    if (k4 > j9r.s) {
                        j9r.a = 9;
                        array = array3;
                        continue;
                    }
                    if (f5 > 0) {
                        q2[t & 0x3] = k4;
                        j9r.t = t + 1;
                    }
                    if (j9r.L > j9r.g) {
                        throw new np2("Invalid backward reference");
                    }
                    j9r.w = 0;
                    j9r.a = 7;
                }
                final byte[] array6 = array;
                int r7 = j9r.r;
                int n51 = r7 - j9r.K & n;
                final int n52 = j9r.L - j9r.w;
                Label_2977: {
                    if (n51 + n52 < n && r7 + n52 < n) {
                        for (int n53 = 0; n53 < n52; ++n53, ++r7, ++n51) {
                            array6[r7] = array6[n51];
                        }
                        j9r.w += n52;
                        j9r.g -= n52;
                        j9r.r += n52;
                    }
                    else {
                        int r8;
                        do {
                            final int w = j9r.w;
                            if (w >= j9r.L) {
                                break Label_2977;
                            }
                            r8 = j9r.r;
                            array6[r8] = array6[r8 - j9r.K & n];
                            --j9r.g;
                            j9r.w = w + 1;
                            j9r.r = r8 + 1;
                        } while (r8 != n);
                        j9r.b = 7;
                        j9r.X = j9r.P;
                        j9r.W = 0;
                        j9r.a = 12;
                    }
                }
                array = array6;
                if (j9r.a != 7) {
                    continue;
                }
                j9r.a = 3;
                array = array6;
            }
            else {
                final int s2 = j9r.S;
                if (s2 != 0) {
                    j9r.W += s2;
                    j9r.S = 0;
                }
                final int min3 = Math.min(j9r.U - j9r.V, j9r.X - j9r.W);
                if (min3 != 0) {
                    System.arraycopy(j9r.d, j9r.W, j9r.Y, j9r.T + j9r.V, min3);
                    j9r.V += min3;
                    j9r.W += min3;
                }
                if (j9r.V >= j9r.U) {
                    return;
                }
                final int r9 = j9r.r;
                final int n54 = j9r.N;
                if (r9 >= n54) {
                    j9r.s = n54;
                }
                j9r.r = (r9 & n);
                j9r.a = j9r.b;
            }
        }
    }
    
    public static int o(int n) {
        if (n != 3) {
            if (n != 6) {
                if (n != 8) {
                    n = 0;
                }
                else {
                    n = 270;
                }
            }
            else {
                n = 90;
            }
        }
        else {
            n = 180;
        }
        return n;
    }
    
    public static final String p(final String s, final String s2) {
        e0e.f((Object)s, "userId");
        e0e.f((Object)s2, "channelName");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("-");
        sb.append(s2);
        return sb.toString();
    }
    
    public static final ex8 q(Fragment fragment) {
        e0e.f((Object)fragment, "<this>");
        final Fragment a1 = fragment.a1;
        if (!(a1 instanceof tln) && !(a1 instanceof wjo)) {
            if (a1 != null) {
                fragment = a1.a1;
            }
            else {
                fragment = null;
            }
            if (!(fragment instanceof tln)) {
                if (a1 != null) {
                    fragment = a1.a1;
                }
                else {
                    fragment = null;
                }
                if (!(fragment instanceof wjo)) {
                    return null;
                }
            }
            return (ex8)a1.a1;
        }
        return (ex8)a1;
    }
    
    public static String r(final boolean b) {
        if (b) {
            return "on";
        }
        return "off";
    }
    
    public static final String s(final UserIdentifier userIdentifier) {
        e0e.f((Object)userIdentifier, "userIdentifier");
        return userIdentifier.getStringId();
    }
    
    public static final String t(final qdw qdw) {
        e0e.f((Object)qdw, "userInfo");
        String string;
        if (qdw.o() == okw.I0) {
            string = "Twitter";
        }
        else {
            final String m0 = qdw.getUser().M0;
            e0e.c((Object)m0);
            final StringBuilder sb = new StringBuilder();
            sb.append("@");
            sb.append(m0);
            string = sb.toString();
        }
        return string;
    }
    
    public static final String u(final dom dom) {
        e0e.f((Object)dom, "<this>");
        final int ordinal = dom.ordinal();
        String s;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            s = "low_quality";
        }
        else {
            s = "requests";
        }
        return s;
    }
    
    public static final String v(final dom dom) {
        e0e.f((Object)dom, "<this>");
        return mqb.l(u(dom), "_timeline");
    }
    
    public static boolean w(final String s) {
        return s.equals("on");
    }
    
    public static void x(final int n, final Map map) {
        Objects.requireNonNull(b1b.V0);
        tf8.h(n);
        Objects.toString(map);
    }
    
    public static int y(final int[] array, int n, final i02 i02) {
        i02.b(i02);
        final int a = A(array, n, i02);
        n = b1b.O0[a];
        return i02.e(i02, n) + b1b.N0[a];
    }
    
    public static void z(final int n, final int[] array, final int n2, final i02 i02) {
        i02.f(i02);
        final int[] array2 = new int[n];
        int e = i02.e(i02, 2);
        final boolean b = true;
        final boolean b2 = true;
        final int n3 = 0;
        int n6 = 0;
        Label_0893: {
            if (e == 1) {
                int j = n - 1;
                final int[] array3 = new int[4];
                final int n4 = i02.e(i02, 2) + 1;
                int n5;
                for (n5 = 0; j != 0; j >>= 1, ++n5) {}
                for (int k = 0; k < n4; ++k) {
                    array2[array3[k] = i02.e(i02, n5) % n] = 2;
                }
                array2[array3[0]] = 1;
                n6 = (b ? 1 : 0);
                if (n4 != 1) {
                    if (n4 != 2) {
                        if (n4 != 3) {
                            if (array3[0] != array3[1] && array3[0] != array3[2] && array3[0] != array3[3] && array3[1] != array3[2] && array3[1] != array3[3] && array3[2] != array3[3]) {
                                n6 = 1;
                            }
                            else {
                                n6 = 0;
                            }
                            if (i02.e(i02, 1) == 1) {
                                array2[array3[2]] = 3;
                                array2[array3[3]] = 3;
                            }
                            else {
                                array2[array3[0]] = 2;
                            }
                        }
                        else if (array3[0] != array3[1] && array3[0] != array3[2] && array3[1] != array3[2]) {
                            n6 = (b ? 1 : 0);
                        }
                        else {
                            n6 = 0;
                        }
                    }
                    else {
                        n6 = n3;
                        if (array3[0] != array3[1]) {
                            n6 = 1;
                        }
                        array2[array3[1]] = 1;
                    }
                }
            }
            else {
                final int[] array4 = new int[18];
                int n7 = 32;
                int n8 = 0;
                while (e < 18 && n7 > 0) {
                    final int n9 = b1b.I0[e];
                    i02.b(i02);
                    final long f = i02.f;
                    final int g = i02.g;
                    final int n10 = (int)(f >>> g) & 0xF;
                    final int[] l0 = b1b.L0;
                    i02.g = g + (l0[n10] >> 16);
                    final int n11 = l0[n10] & 0xFFFF;
                    array4[n9] = n11;
                    int n12 = n7;
                    int n13 = n8;
                    if (n11 != 0) {
                        n12 = n7 - (32 >> n11);
                        n13 = n8 + 1;
                    }
                    ++e;
                    n7 = n12;
                    n8 = n13;
                }
                int n14 = b2 ? 1 : 0;
                if (n8 != 1) {
                    if (n7 == 0) {
                        n14 = (b2 ? 1 : 0);
                    }
                    else {
                        n14 = 0;
                    }
                }
                final int[] array5 = new int[32];
                fr0.d(array5, 0, 5, array4, 18);
                int n15 = 8;
                int n16 = 0;
                int n17 = 32768;
                int n18 = 0;
            Label_0524:
                while (true) {
                    int n19 = 0;
                    int n20 = n16;
                    while (n20 < n && n17 > 0) {
                        i02.f(i02);
                        i02.b(i02);
                        final int n21 = n17;
                        final long f2 = i02.f;
                        final int g2 = i02.g;
                        final int n22 = (int)(f2 >>> g2) & 0x1F;
                        i02.g = g2 + (array5[n22] >> 16);
                        final int n23 = array5[n22] & 0xFFFF;
                        if (n23 < 16) {
                            array2[n20] = n23;
                            int n24 = n15;
                            int n25 = n21;
                            if (n23 != 0) {
                                n25 = n21 - (32768 >> n23);
                                n24 = n23;
                            }
                            n16 = n20 + 1;
                            n17 = n25;
                            n15 = n24;
                            continue Label_0524;
                        }
                        final int n26 = n23 - 14;
                        int n27;
                        if (n23 == 16) {
                            n27 = n15;
                        }
                        else {
                            n27 = 0;
                        }
                        int n28 = n18;
                        if (n18 != n27) {
                            n19 = 0;
                            n28 = n27;
                        }
                        int n29;
                        if (n19 > 0) {
                            n29 = n19 - 2 << n26;
                        }
                        else {
                            n29 = n19;
                        }
                        final int n30 = n29 + (i02.e(i02, n26) + 3);
                        final int n31 = n30 - n19;
                        if (n20 + n31 > n) {
                            throw new np2("symbol + repeatDelta > numSymbols");
                        }
                        for (int n32 = 0; n32 < n31; ++n32, ++n20) {
                            array2[n20] = n28;
                        }
                        if (n28 != 0) {
                            n17 = n21 - (n31 << 15 - n28);
                        }
                        else {
                            n17 = n21;
                        }
                        n19 = n30;
                        n18 = n28;
                    }
                    if (n17 != 0) {
                        throw new np2("Unused space");
                    }
                    final int n33 = n - n20;
                    int n34 = 0;
                    while (true) {
                        n6 = n14;
                        if (n34 >= n33) {
                            break Label_0893;
                        }
                        final int n35 = Math.min(n34 + 1024, n33) - n34;
                        System.arraycopy(p0b.J0, 0, array2, n20 + n34, n35);
                        n34 += n35;
                    }
                }
            }
        }
        if (n6 != 0) {
            fr0.d(array, n2, 8, array2, n);
            return;
        }
        throw new np2("Can't readHuffmanCode");
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return stz.G0.b().H();
    }
    
    public String b(final boolean b) {
        return null;
    }
    
    public zsl$a g(final Object o) {
        final UserIdentifier userIdentifier = (UserIdentifier)o;
        e0e.f((Object)userIdentifier, "userIdentifier");
        final zsl$a zsl$a = new zsl$a();
        ((lp1$a)zsl$a).s(ttl.b("account_id", (Object)userIdentifier.getId()));
        return zsl$a;
    }
    
    @Override
    public Object i(final mcs mcs) throws Exception {
        if (!mcs.s()) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", (Throwable)mcs.n());
        }
        return null;
    }
    
    public Object m(final e26 e26) {
        return new xch();
    }
}
