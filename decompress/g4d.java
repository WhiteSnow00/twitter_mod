import java.util.List;
import java.nio.ByteBuffer;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.io.UnsupportedEncodingException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g4d extends db
{
    public static final b9l F0;
    public final g4d.g4d$a E0;
    
    static {
        F0 = b9l.L0;
    }
    
    public g4d() {
        this.E0 = null;
    }
    
    public g4d(final g4d.g4d$a e0) {
        this.E0 = e0;
    }
    
    public static c1c A0(final rwj rwj, int n) throws UnsupportedEncodingException {
        final int t = rwj.t();
        final String j0 = J0(t);
        final byte[] array = new byte[--n];
        rwj.d(array, 0, n);
        final int m0 = M0(array, 0);
        final String s = new String(array, 0, m0, "ISO-8859-1");
        final int n2 = m0 + 1;
        final int l0 = L0(array, n2, t);
        final String d0 = D0(array, n2, l0, j0);
        final int n3 = I0(t) + l0;
        final int l2 = L0(array, n3, t);
        return new c1c(s, d0, D0(array, n3, l2, j0), t0(array, I0(t) + l2, n));
    }
    
    public static ich B0(final rwj rwj, int i) {
        final int y = rwj.y();
        final int v = rwj.v();
        final int v2 = rwj.v();
        final int t = rwj.t();
        final int t2 = rwj.t();
        final nhx nhx = new nhx();
        nhx.j(rwj.a, rwj.c);
        nhx.k(rwj.b * 8);
        final int n = (i - 10) * 8 / (t + t2);
        final int[] array = new int[n];
        final int[] array2 = new int[n];
        int g;
        int g2;
        for (i = 0; i < n; ++i) {
            g = nhx.g(t);
            g2 = nhx.g(t2);
            array[i] = g;
            array2[i] = g2;
        }
        return new ich(y, v, v2, array, array2);
    }
    
    public static rzk C0(final rwj rwj, final int n) throws UnsupportedEncodingException {
        final byte[] array = new byte[n];
        rwj.d(array, 0, n);
        final int m0 = M0(array, 0);
        return new rzk(new String(array, 0, m0, "ISO-8859-1"), t0(array, m0 + 1, n));
    }
    
    public static String D0(final byte[] array, final int n, final int n2, final String s) throws UnsupportedEncodingException {
        if (n2 > n && n2 <= array.length) {
            return new String(array, n, n2 - n, s);
        }
        return "";
    }
    
    public static gis E0(final rwj rwj, int n, final String s) throws UnsupportedEncodingException {
        if (n < 1) {
            return null;
        }
        final int t = rwj.t();
        final String j0 = J0(t);
        final byte[] array = new byte[--n];
        rwj.d(array, 0, n);
        return new gis(s, null, new String(array, 0, L0(array, 0, t), j0));
    }
    
    public static gis F0(final rwj rwj, int l0) throws UnsupportedEncodingException {
        if (l0 < 1) {
            return null;
        }
        final int t = rwj.t();
        final String j0 = J0(t);
        final byte[] array = new byte[--l0];
        rwj.d(array, 0, l0);
        l0 = L0(array, 0, t);
        final String s = new String(array, 0, l0, j0);
        l0 += I0(t);
        return new gis("TXXX", s, D0(array, l0, L0(array, l0, t), j0));
    }
    
    public static i6w G0(final rwj rwj, final int n, final String s) throws UnsupportedEncodingException {
        final byte[] array = new byte[n];
        rwj.d(array, 0, n);
        return new i6w(s, (String)null, new String(array, 0, M0(array, 0), "ISO-8859-1"));
    }
    
    public static i6w H0(final rwj rwj, int l0) throws UnsupportedEncodingException {
        if (l0 < 1) {
            return null;
        }
        final int t = rwj.t();
        final String j0 = J0(t);
        final byte[] array = new byte[--l0];
        rwj.d(array, 0, l0);
        l0 = L0(array, 0, t);
        final String s = new String(array, 0, l0, j0);
        l0 += I0(t);
        return new i6w("WXXX", s, D0(array, l0, M0(array, l0), "ISO-8859-1"));
    }
    
    public static int I0(int n) {
        if (n != 0 && n != 3) {
            n = 2;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    public static String J0(final int n) {
        if (n == 1) {
            return "UTF-16";
        }
        if (n == 2) {
            return "UTF-16BE";
        }
        if (n != 3) {
            return "ISO-8859-1";
        }
        return "UTF-8";
    }
    
    public static String K0(final int n, final int n2, final int n3, final int n4, final int n5) {
        String s;
        if (n == 2) {
            s = String.format(Locale.US, "%c%c%c", n2, n3, n4);
        }
        else {
            s = String.format(Locale.US, "%c%c%c%c", n2, n3, n4, n5);
        }
        return s;
    }
    
    public static int L0(final byte[] array, final int n, final int n2) {
        final int m0 = M0(array, n);
        if (n2 != 0) {
            int i = m0;
            if (n2 != 3) {
                while (i < array.length - 1) {
                    if ((i - n) % 2 == 0 && array[i + 1] == 0) {
                        return i;
                    }
                    i = M0(array, i + 1);
                }
                return array.length;
            }
        }
        return m0;
    }
    
    public static int M0(final byte[] array, int i) {
        while (i < array.length) {
            if (array[i] == 0) {
                return i;
            }
            ++i;
        }
        return array.length;
    }
    
    public static int N0(final rwj rwj, int n) {
        final byte[] a = rwj.a;
        int b;
        final int n2 = b = rwj.b;
        while (true) {
            final int n3 = b + 1;
            if (n3 >= n2 + n) {
                break;
            }
            int n4 = n;
            if ((a[b] & 0xFF) == 0xFF) {
                n4 = n;
                if (a[n3] == 0) {
                    System.arraycopy(a, b + 2, a, n3, n - (b - n2) - 2);
                    n4 = n - 1;
                }
            }
            b = n3;
            n = n4;
        }
        return n;
    }
    
    public static boolean O0(final rwj rwj, final int n, final int n2, final boolean b) {
        final int b2 = rwj.b;
        try {
            while (true) {
                final int c = rwj.c;
                final int b3 = rwj.b;
                final boolean b4 = true;
                if (c - b3 < n2) {
                    return true;
                }
                int n3;
                long u;
                int y;
                if (n >= 3) {
                    n3 = rwj.e();
                    u = rwj.u();
                    y = rwj.y();
                }
                else {
                    n3 = rwj.v();
                    u = rwj.v();
                    y = 0;
                }
                if (n3 == 0 && u == 0L && y == 0) {
                    return true;
                }
                long n4 = u;
                if (n == 4) {
                    n4 = u;
                    if (!b) {
                        if ((0x808080L & u) != 0x0L) {
                            return false;
                        }
                        n4 = ((u >> 24 & 0xFFL) << 21 | ((u & 0xFFL) | (u >> 8 & 0xFFL) << 7 | (u >> 16 & 0xFFL) << 14));
                    }
                }
                int n6 = 0;
                int n7 = 0;
                Label_0280: {
                    if (n == 4) {
                        final int n5 = n6 = (((y & 0x40) != 0x0) ? 1 : 0);
                        if ((y & 0x1) != 0x0) {
                            n6 = n5;
                            n7 = (b4 ? 1 : 0);
                            break Label_0280;
                        }
                    }
                    else if (n == 3) {
                        int n8;
                        if ((y & 0x20) != 0x0) {
                            n8 = 1;
                        }
                        else {
                            n8 = 0;
                        }
                        n6 = n8;
                        if ((y & 0x80) != 0x0) {
                            n6 = n8;
                            n7 = (b4 ? 1 : 0);
                            break Label_0280;
                        }
                    }
                    else {
                        n6 = 0;
                    }
                    n7 = 0;
                }
                int n9 = n6;
                if (n7 != 0) {
                    n9 = n6 + 4;
                }
                if (n4 < n9) {
                    return false;
                }
                if (rwj.c - rwj.b < n4) {
                    return false;
                }
                rwj.E((int)n4);
            }
        }
        finally {
            rwj.D(b2);
        }
    }
    
    public static byte[] t0(final byte[] array, final int n, final int n2) {
        if (n2 <= n) {
            return cnw.f;
        }
        return Arrays.copyOfRange(array, n, n2);
    }
    
    public static li0 v0(final rwj rwj, int m0, int n) throws UnsupportedEncodingException {
        final int t = rwj.t();
        final String j0 = J0(t);
        final int n2 = m0 - 1;
        final byte[] array = new byte[n2];
        rwj.d(array, 0, n2);
        String s;
        if (n == 2) {
            final String value = String.valueOf(mru.s(new String(array, 0, 3, "ISO-8859-1")));
            String concat;
            if (value.length() != 0) {
                concat = "image/".concat(value);
            }
            else {
                concat = new String("image/");
            }
            s = concat;
            if ("image/jpg".equals(concat)) {
                s = "image/jpeg";
            }
            m0 = 2;
        }
        else {
            m0 = M0(array, 0);
            s = mru.s(new String(array, 0, m0, "ISO-8859-1"));
            if (s.indexOf(47) == -1) {
                if (s.length() != 0) {
                    s = "image/".concat(s);
                }
                else {
                    s = new String("image/");
                }
            }
        }
        n = array[m0 + 1];
        m0 += 2;
        final int l0 = L0(array, m0, t);
        return new li0(s, new String(array, m0, l0 - m0, j0), n & 0xFF, t0(array, I0(t) + l0, n2));
    }
    
    public static ss3 w0(final rwj rwj, final int n, final int n2, final boolean b, final int n3, final g4d.g4d$a g4d$a) throws UnsupportedEncodingException {
        final int b2 = rwj.b;
        final int m0 = M0(rwj.a, b2);
        final String s = new String(rwj.a, b2, m0 - b2, "ISO-8859-1");
        rwj.D(m0 + 1);
        final int e = rwj.e();
        final int e2 = rwj.e();
        long u = rwj.u();
        if (u == 4294967295L) {
            u = -1L;
        }
        long u2 = rwj.u();
        if (u2 == 4294967295L) {
            u2 = -1L;
        }
        final ArrayList<h4d> list = new ArrayList<h4d>();
        while (rwj.b < b2 + n) {
            final h4d z0 = z0(n2, rwj, b, n3, g4d$a);
            if (z0 != null) {
                list.add(z0);
            }
        }
        return new ss3(s, e, e2, u, u2, (h4d[])list.toArray(new h4d[0]));
    }
    
    public static ts3 x0(final rwj rwj, final int n, final int n2, final boolean b, final int n3, final g4d.g4d$a g4d$a) throws UnsupportedEncodingException {
        final int b2 = rwj.b;
        final int m0 = M0(rwj.a, b2);
        final String s = new String(rwj.a, b2, m0 - b2, "ISO-8859-1");
        rwj.D(m0 + 1);
        final int t = rwj.t();
        final boolean b3 = (t & 0x2) != 0x0;
        final boolean b4 = (t & 0x1) != 0x0;
        final int t2 = rwj.t();
        final String[] array = new String[t2];
        for (int i = 0; i < t2; ++i) {
            final int b5 = rwj.b;
            final int m2 = M0(rwj.a, b5);
            array[i] = new String(rwj.a, b5, m2 - b5, "ISO-8859-1");
            rwj.D(m2 + 1);
        }
        final ArrayList<h4d> list = new ArrayList<h4d>();
        while (rwj.b < b2 + n) {
            final h4d z0 = z0(n2, rwj, b, n3, g4d$a);
            if (z0 != null) {
                list.add(z0);
            }
        }
        return new ts3(s, b3, b4, array, (h4d[])list.toArray(new h4d[0]));
    }
    
    public static vr4 y0(final rwj rwj, int l0) throws UnsupportedEncodingException {
        if (l0 < 4) {
            return null;
        }
        final int t = rwj.t();
        final String j0 = J0(t);
        final byte[] array = new byte[3];
        rwj.d(array, 0, 3);
        final String s = new String(array, 0, 3);
        l0 -= 4;
        final byte[] array2 = new byte[l0];
        rwj.d(array2, 0, l0);
        l0 = L0(array2, 0, t);
        final String s2 = new String(array2, 0, l0, j0);
        l0 += I0(t);
        return new vr4(s, s2, D0(array2, l0, L0(array2, l0, t), j0));
    }
    
    public static h4d z0(int length, final rwj rwj, final boolean b, final int n, final g4d.g4d$a g4d$a) {
        final int t = rwj.t();
        final int t2 = rwj.t();
        final int t3 = rwj.t();
        int t4;
        if (length >= 3) {
            t4 = rwj.t();
        }
        else {
            t4 = 0;
        }
        int n3;
        if (length == 4) {
            final int n2 = n3 = rwj.w();
            if (!b) {
                n3 = ((n2 >> 24 & 0xFF) << 21 | ((n2 & 0xFF) | (n2 >> 8 & 0xFF) << 7 | (n2 >> 16 & 0xFF) << 14));
            }
        }
        else if (length == 3) {
            n3 = rwj.w();
        }
        else {
            n3 = rwj.v();
        }
        final int n4 = n3;
        int y;
        if (length >= 3) {
            y = rwj.y();
        }
        else {
            y = 0;
        }
        if (t == 0 && t2 == 0 && t3 == 0 && t4 == 0 && n4 == 0 && y == 0) {
            rwj.D(rwj.c);
            return null;
        }
        final int n5 = rwj.b + n4;
        if (n5 > rwj.c) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            rwj.D(rwj.c);
            return null;
        }
        if (g4d$a != null && !g4d$a.b(length, t, t2, t3, t4)) {
            rwj.D(n5);
            return null;
        }
        int n6 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        Label_0492: {
            if (length == 3) {
                final boolean b2 = (y & 0x80) != 0x0;
                final boolean b3 = (y & 0x40) != 0x0;
                n6 = (((y & 0x20) != 0x0) ? 1 : 0);
                final int n7 = 0;
                final boolean b4 = b2;
                n8 = (b2 ? 1 : 0);
                n9 = (b4 ? 1 : 0);
                n10 = (b3 ? 1 : 0);
                n11 = n7;
            }
            else {
                int n12;
                int n13;
                int n14;
                if (length == 4) {
                    final boolean b5 = (y & 0x40) != 0x0;
                    final boolean b6 = (y & 0x8) != 0x0;
                    if ((y & 0x4) != 0x0) {
                        n10 = 1;
                    }
                    else {
                        n10 = 0;
                    }
                    final boolean b7 = (y & 0x2) != 0x0;
                    n8 = (b6 ? 1 : 0);
                    n12 = n10;
                    n13 = (b5 ? 1 : 0);
                    n14 = (b7 ? 1 : 0);
                    if ((y & 0x1) != 0x0) {
                        final boolean b8 = b7;
                        final int n15 = 1;
                        n8 = (b6 ? 1 : 0);
                        n9 = n15;
                        n6 = (b5 ? 1 : 0);
                        n11 = (b8 ? 1 : 0);
                        break Label_0492;
                    }
                }
                else {
                    n8 = 0;
                    n12 = 0;
                    n13 = 0;
                    n14 = 0;
                }
                n11 = n14;
                n6 = n13;
                n10 = n12;
                n9 = 0;
            }
        }
        Label_1213: {
            if (n8 != 0 || n10 != 0) {
                break Label_1213;
            }
            int n16 = n4;
            if (n6 != 0) {
                n16 = n4 - 1;
                rwj.E(1);
            }
            int n17 = n16;
            if (n9 != 0) {
                n17 = n16 - 4;
                rwj.E(4);
            }
            int n18 = n17;
            if (n11 != 0) {
                n18 = N0(rwj, n17);
            }
            while (true) {
                Object o = null;
                Label_1085: {
                    Label_0606: {
                        if (t != 84 || t2 != 88 || t3 != 88) {
                            break Label_0606;
                        }
                        if (length != 2) {
                            if (t4 != 88) {
                                break Label_0606;
                            }
                        }
                        try {
                            try {
                                F0(rwj, n18);
                                break Label_1085;
                                iftrue(Label_0646:)(t != 84);
                                E0(rwj, n18, K0(length, t, t2, t3, t4));
                            }
                            finally {}
                        }
                        catch (final UnsupportedEncodingException ex) {
                            break Label_1186;
                        }
                    }
                    Label_0646: {
                        if (t == 87 && t2 == 88 && t3 == 88 && (length == 2 || t4 == 88)) {
                            o = H0(rwj, n18);
                        }
                        else if (t == 87) {
                            o = G0(rwj, n18, K0(length, t, t2, t3, t4));
                        }
                        else if (t == 80 && t2 == 82 && t3 == 73 && t4 == 86) {
                            o = C0(rwj, n18);
                        }
                        else if (t == 71 && t2 == 69 && t3 == 79 && (t4 == 66 || length == 2)) {
                            o = A0(rwj, n18);
                        }
                        else {
                            Label_0872: {
                                if (length == 2) {
                                    if (t != 80 || t2 != 73 || t3 != 67) {
                                        break Label_0872;
                                    }
                                }
                                else if (t != 65 || t2 != 80 || t3 != 73 || t4 != 67) {
                                    break Label_0872;
                                }
                                o = v0(rwj, n18, length);
                                break Label_1085;
                            }
                            if (t == 67 && t2 == 79 && t3 == 77 && (t4 == 77 || length == 2)) {
                                o = y0(rwj, n18);
                            }
                            else if (t == 67 && t2 == 72 && t3 == 65 && t4 == 80) {
                                o = w0(rwj, n18, length, b, n, (g4d.g4d$a)o);
                            }
                            else if (t == 67 && t2 == 84 && t3 == 79 && t4 == 67) {
                                o = x0(rwj, n18, length, b, n, (g4d.g4d$a)o);
                            }
                            else if (t == 77 && t2 == 76 && t3 == 76 && t4 == 84) {
                                o = B0(rwj, n18);
                            }
                            else {
                                final String k0 = K0(length, t, t2, t3, t4);
                                final byte[] array = new byte[n18];
                                rwj.d(array, 0, n18);
                                o = new zx1(k0, array);
                            }
                        }
                    }
                }
                Label_1177: {
                    if (o != null) {
                        break Label_1177;
                    }
                    final String k2 = K0(length, t, t2, t3, t4);
                    length = String.valueOf(k2).length();
                    final StringBuilder sb = new StringBuilder(length + 50);
                    sb.append("Failed to decode frame: id=");
                    sb.append(k2);
                    sb.append(", frameSize=");
                    sb.append(n18);
                    final String string = sb.toString();
                    try {
                        Log.w("Id3Decoder", string);
                        rwj.D(n5);
                        return (h4d)o;
                        Log.w("Id3Decoder", "Unsupported character encoding");
                        rwj.D(n5);
                        return null;
                        rwj.D(n5);
                        Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                        rwj.D(n5);
                        return null;
                    }
                    catch (final UnsupportedEncodingException ex2) {
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public final z8h m0(final j9h j9h, final ByteBuffer byteBuffer) {
        return this.u0(byteBuffer.array(), byteBuffer.limit());
    }
    
    public final z8h u0(final byte[] array, int n) {
        final ArrayList list = new ArrayList();
        final rwj rwj = new rwj(array, n);
        final int c = rwj.c;
        n = rwj.b;
        final int n2 = 10;
        final boolean b = false;
        g4d.g4d$b g4d$b = null;
        Label_0383: {
            Label_0381: {
                if (c - n < 10) {
                    Log.w("Id3Decoder", "Data too short to be an ID3 tag");
                }
                else {
                    n = rwj.v();
                    if (n == 4801587) {
                        final int t = rwj.t();
                        rwj.E(1);
                        final int t2 = rwj.t();
                        final int s = rwj.s();
                        if (t == 2) {
                            final boolean b2 = (t2 & 0x40) != 0x0;
                            n = s;
                            if (b2) {
                                Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                                break Label_0381;
                            }
                        }
                        else if (t == 3) {
                            final boolean b3 = (t2 & 0x40) != 0x0;
                            n = s;
                            if (b3) {
                                n = rwj.e();
                                rwj.E(n);
                                n = s - (n + 4);
                            }
                        }
                        else {
                            if (t != 4) {
                                mw.A(57, "Skipped ID3 tag with unsupported majorVersion=", t, "Id3Decoder");
                                break Label_0381;
                            }
                            if ((t2 & 0x40) != 0x0) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            int n3 = s;
                            if (n != 0) {
                                n = rwj.s();
                                rwj.E(n - 4);
                                n3 = s - n;
                            }
                            final boolean b4 = (t2 & 0x10) != 0x0;
                            n = n3;
                            if (b4) {
                                n = n3 - 10;
                            }
                        }
                        g4d$b = new g4d.g4d$b(t, t < 4 && (t2 & 0x80) != 0x0, n);
                        break Label_0383;
                    }
                    final String value = String.valueOf(String.format("%06X", n));
                    String concat;
                    if (value.length() != 0) {
                        concat = "Unexpected first three bytes of ID3 tag header: 0x".concat(value);
                    }
                    else {
                        concat = new String("Unexpected first three bytes of ID3 tag header: 0x");
                    }
                    Log.w("Id3Decoder", concat);
                }
            }
            g4d$b = null;
        }
        if (g4d$b == null) {
            return null;
        }
        final int b5 = rwj.b;
        n = n2;
        if (g4d$b.a == 2) {
            n = 6;
        }
        int n4 = g4d$b.c;
        if (g4d$b.b) {
            n4 = N0(rwj, n4);
        }
        rwj.C(b5 + n4);
        boolean b6 = b;
        if (!O0(rwj, g4d$b.a, n, false)) {
            if (g4d$b.a != 4 || !O0(rwj, 4, n, true)) {
                mw.A(56, "Failed to validate ID3 tag with majorVersion=", g4d$b.a, "Id3Decoder");
                return null;
            }
            b6 = true;
        }
        while (rwj.c - rwj.b >= n) {
            final h4d z0 = z0(g4d$b.a, rwj, b6, n, this.E0);
            if (z0 != null) {
                list.add(z0);
            }
        }
        return new z8h((List)list);
    }
}
