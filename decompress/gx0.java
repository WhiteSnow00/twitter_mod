import java.util.Objects;
import java.util.ArrayList;
import com.google.android.exoplayer2.n;
import java.util.List;
import android.util.Log;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.Arrays;
import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.ParserException;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gx0
{
    public static final byte[] a;
    
    static {
        a = cnw.C("OpusHead");
    }
    
    public static void a(final rwj rwj) {
        final int b = rwj.b;
        rwj.E(4);
        int n = b;
        if (rwj.e() != 1751411826) {
            n = b + 4;
        }
        rwj.D(n);
    }
    
    public static Pair<String, byte[]> b(final rwj rwj, int n) {
        rwj.D(n + 8 + 4);
        rwj.E(1);
        c(rwj);
        rwj.E(2);
        n = rwj.t();
        if ((n & 0x80) != 0x0) {
            rwj.E(2);
        }
        if ((n & 0x40) != 0x0) {
            rwj.E(rwj.y());
        }
        if ((n & 0x20) != 0x0) {
            rwj.E(2);
        }
        rwj.E(1);
        c(rwj);
        final String e = bbh.e(rwj.t());
        if (!"audio/mpeg".equals(e) && !"audio/vnd.dts".equals(e) && !"audio/vnd.dts.hd".equals(e)) {
            rwj.E(12);
            rwj.E(1);
            n = c(rwj);
            final byte[] array = new byte[n];
            rwj.d(array, 0, n);
            return (Pair<String, byte[]>)Pair.create((Object)e, (Object)array);
        }
        return (Pair<String, byte[]>)Pair.create((Object)e, (Object)null);
    }
    
    public static int c(final rwj rwj) {
        int n;
        int n2;
        for (n = rwj.t(), n2 = (n & 0x7F); (n & 0x80) == 0x80; n = rwj.t(), n2 = (n2 << 7 | (n & 0x7F))) {}
        return n2;
    }
    
    public static Pair<Integer, zvt> d(final rwj rwj, final int n, final int n2) throws ParserException {
        int e;
        for (int b = rwj.b; b - n < n2; b += e) {
            rwj.D(b);
            e = rwj.e();
            final boolean b2 = true;
            chw.y(e > 0, "childAtomSize must be positive");
            if (rwj.e() == 1936289382) {
                int n3 = b + 8;
                int n4 = -1;
                int n5 = 0;
                String s = null;
                Integer n6 = null;
                while (n3 - b < e) {
                    rwj.D(n3);
                    final int e2 = rwj.e();
                    final int e3 = rwj.e();
                    Integer value;
                    String q;
                    if (e3 == 1718775137) {
                        value = rwj.e();
                        q = s;
                    }
                    else if (e3 == 1935894637) {
                        rwj.E(4);
                        q = rwj.q(4);
                        value = n6;
                    }
                    else {
                        q = s;
                        value = n6;
                        if (e3 == 1935894633) {
                            n4 = n3;
                            n5 = e2;
                            value = n6;
                            q = s;
                        }
                    }
                    n3 += e2;
                    s = q;
                    n6 = value;
                }
                Pair create = null;
                Label_0524: {
                    if ("cenc".equals(s) || "cbc1".equals(s) || "cens".equals(s) || "cbcs".equals(s)) {
                        chw.y(n6 != null, "frma atom is mandatory");
                        chw.y(n4 != -1, "schi atom is mandatory");
                        while (true) {
                            int e4;
                            for (int n7 = n4 + 8; n7 - n4 < n5; n7 += e4) {
                                rwj.D(n7);
                                e4 = rwj.e();
                                if (rwj.e() == 1952804451) {
                                    final int e5 = rwj.e();
                                    rwj.E(1);
                                    int n8;
                                    int n9;
                                    if ((e5 >> 24 & 0xFF) == 0x0) {
                                        rwj.E(1);
                                        n8 = 0;
                                        n9 = 0;
                                    }
                                    else {
                                        final int t = rwj.t();
                                        n8 = (t & 0xF);
                                        n9 = (t & 0xF0) >> 4;
                                    }
                                    final boolean b3 = rwj.t() == 1;
                                    final int t2 = rwj.t();
                                    final byte[] array = new byte[16];
                                    rwj.d(array, 0, 16);
                                    byte[] array2;
                                    if (b3 && t2 == 0) {
                                        final int t3 = rwj.t();
                                        array2 = new byte[t3];
                                        rwj.d(array2, 0, t3);
                                    }
                                    else {
                                        array2 = null;
                                    }
                                    final Object o = new zvt(b3, s, t2, array, n9, n8, array2);
                                    chw.y(o != null && b2, "tenc atom is mandatory");
                                    final int a = cnw.a;
                                    create = Pair.create((Object)n6, o);
                                    break Label_0524;
                                }
                            }
                            final Object o = null;
                            continue;
                        }
                    }
                    create = null;
                }
                if (create != null) {
                    return (Pair<Integer, zvt>)create;
                }
            }
        }
        return null;
    }
    
    public static c e(final rwj rwj, final int n, final int s, final String s2, final com.google.android.exoplayer2.drm.b b, final boolean b2) throws ParserException {
        rwj.D(12);
        final int e = rwj.e();
        c c = new c(e);
        c c2;
        for (int i = 0; i < e; ++i, c = c2) {
            final int b3 = rwj.b;
            final int e2;
            final int n2 = e2 = rwj.e();
            final boolean b4 = e2 > 0;
            final String s3 = "childAtomSize must be positive";
            chw.y(b4, "childAtomSize must be positive");
            int n3 = rwj.e();
            int n6;
            int n7 = 0;
            if (n3 != 1635148593 && n3 != 1635148595 && n3 != 1701733238 && n3 != 1831958048 && n3 != 1836070006 && n3 != 1752589105 && n3 != 1751479857 && n3 != 1932670515 && n3 != 1211250227 && n3 != 1987063864 && n3 != 1987063865 && n3 != 1635135537 && n3 != 1685479798 && n3 != 1685479729 && n3 != 1685481573 && n3 != 1685481521) {
                if (n3 != 1836069985 && n3 != 1701733217 && n3 != 1633889587 && n3 != 1700998451 && n3 != 1633889588 && n3 != 1835823201 && n3 != 1685353315 && n3 != 1685353317 && n3 != 1685353320 && n3 != 1685353324 && n3 != 1685353336 && n3 != 1935764850 && n3 != 1935767394 && n3 != 1819304813 && n3 != 1936684916 && n3 != 1953984371 && n3 != 778924082 && n3 != 778924083 && n3 != 1835557169 && n3 != 1835560241 && n3 != 1634492771 && n3 != 1634492791 && n3 != 1970037111 && n3 != 1332770163 && n3 != 1716281667) {
                    if (n3 != 1414810956 && n3 != 1954034535 && n3 != 2004251764 && n3 != 1937010800 && n3 != 1664495672) {
                        if (n3 == 1835365492) {
                            rwj.D(b3 + 8 + 8);
                            if (n3 == 1835365492) {
                                rwj.n();
                                final String n4 = rwj.n();
                                if (n4 != null) {
                                    final n$a n$a = new n$a();
                                    n$a.b(n);
                                    n$a.k = n4;
                                    c.b = n$a.a();
                                }
                            }
                        }
                        else if (n3 == 1667329389) {
                            final n$a n$a2 = new n$a();
                            n$a2.b(n);
                            n$a2.k = "application/x-camera-motion";
                            c.b = n$a2.a();
                        }
                    }
                    else {
                        rwj.D(b3 + 8 + 8);
                        long o = Long.MAX_VALUE;
                        String k = "application/ttml+xml";
                        List<byte[]> t = null;
                        Label_0659: {
                            if (n3 != 1414810956) {
                                if (n3 == 1954034535) {
                                    final int n5 = e2 - 8 - 8;
                                    final byte[] array = new byte[n5];
                                    rwj.d(array, 0, n5);
                                    t = edd.t(array);
                                    k = "application/x-quicktime-tx3g";
                                    break Label_0659;
                                }
                                if (n3 == 2004251764) {
                                    k = "application/x-mp4-vtt";
                                }
                                else if (n3 == 1937010800) {
                                    o = 0L;
                                }
                                else {
                                    if (n3 != 1664495672) {
                                        throw new IllegalStateException();
                                    }
                                    c.d = 1;
                                    k = "application/x-mp4-cea-608";
                                }
                            }
                            t = null;
                        }
                        final n$a n$a3 = new n$a();
                        n$a3.b(n);
                        n$a3.k = k;
                        n$a3.c = s2;
                        n$a3.o = o;
                        n$a3.m = t;
                        c.b = n$a3.a();
                    }
                    c2 = c;
                    n6 = b3;
                    n7 = e2;
                }
                else {
                    rwj.D(b3 + 8 + 8);
                    int y;
                    if (b2) {
                        y = rwj.y();
                        rwj.E(6);
                    }
                    else {
                        rwj.E(8);
                        y = 0;
                    }
                    int n8 = 0;
                    Label_2982: {
                        int n9;
                        int n10;
                        int e3;
                        if (y != 0 && y != 1) {
                            if (y != 2) {
                                n7 = e2;
                                n8 = b3;
                                break Label_2982;
                            }
                            rwj.E(16);
                            n9 = (int)Math.round(Double.longBitsToDouble(rwj.m()));
                            n10 = rwj.w();
                            rwj.E(20);
                            e3 = 0;
                        }
                        else {
                            n10 = rwj.y();
                            rwj.E(6);
                            final byte[] a = rwj.a;
                            final int b5 = rwj.b;
                            final int b6 = b5 + 1;
                            rwj.b = b6;
                            final byte b7 = a[b5];
                            final int b8 = b6 + 1;
                            rwj.b = b8;
                            n9 = ((a[b6] & 0xFF) | (b7 & 0xFF) << 8);
                            rwj.D((rwj.b = b8 + 2) - 4);
                            e3 = rwj.e();
                            if (y == 1) {
                                rwj.E(16);
                            }
                        }
                        final int b9 = rwj.b;
                        com.google.android.exoplayer2.drm.b n11;
                        if (n3 == 1701733217) {
                            final Pair<Integer, zvt> d = d(rwj, b3, e2);
                            com.google.android.exoplayer2.drm.b a2;
                            if (d != null) {
                                n3 = (int)d.first;
                                if (b == null) {
                                    a2 = null;
                                }
                                else {
                                    a2 = b.a(((zvt)d.second).b);
                                }
                                c.a[i] = (zvt)d.second;
                            }
                            else {
                                a2 = b;
                            }
                            rwj.D(b9);
                            n11 = a2;
                        }
                        else {
                            n11 = b;
                        }
                        final String j = "audio/ac3";
                        String s4 = "audio/raw";
                        int z = 0;
                        Label_1412: {
                            if (n3 == 1633889587) {
                                s4 = "audio/ac3";
                            }
                            else if (n3 == 1700998451) {
                                s4 = "audio/eac3";
                            }
                            else if (n3 == 1633889588) {
                                s4 = "audio/ac4";
                            }
                            else if (n3 == 1685353315) {
                                s4 = "audio/vnd.dts";
                            }
                            else if (n3 != 1685353320 && n3 != 1685353324) {
                                if (n3 == 1685353317) {
                                    s4 = "audio/vnd.dts.hd;profile=lbr";
                                }
                                else if (n3 == 1685353336) {
                                    s4 = "audio/vnd.dts.uhd;profile=p2";
                                }
                                else if (n3 == 1935764850) {
                                    s4 = "audio/3gpp";
                                }
                                else if (n3 == 1935767394) {
                                    s4 = "audio/amr-wb";
                                }
                                else {
                                    if (n3 == 1819304813 || n3 == 1936684916) {
                                        z = 2;
                                        break Label_1412;
                                    }
                                    if (n3 == 1953984371) {
                                        z = 268435456;
                                        break Label_1412;
                                    }
                                    if (n3 != 778924082 && n3 != 778924083) {
                                        if (n3 == 1835557169) {
                                            s4 = "audio/mha1";
                                        }
                                        else if (n3 == 1835560241) {
                                            s4 = "audio/mhm1";
                                        }
                                        else if (n3 == 1634492771) {
                                            s4 = "audio/alac";
                                        }
                                        else if (n3 == 1634492791) {
                                            s4 = "audio/g711-alaw";
                                        }
                                        else if (n3 == 1970037111) {
                                            s4 = "audio/g711-mlaw";
                                        }
                                        else if (n3 == 1332770163) {
                                            s4 = "audio/opus";
                                        }
                                        else if (n3 == 1716281667) {
                                            s4 = "audio/flac";
                                        }
                                        else {
                                            if (n3 != 1835823201) {
                                                z = -1;
                                                s4 = null;
                                                break Label_1412;
                                            }
                                            s4 = "audio/true-hd";
                                        }
                                    }
                                    else {
                                        s4 = "audio/mpeg";
                                    }
                                }
                            }
                            else {
                                s4 = "audio/vnd.dts.hd";
                            }
                            z = -1;
                        }
                        final int n12 = n10;
                        edd m = null;
                        String s5 = s4;
                        String c3 = null;
                        int n13 = e3;
                        String s6 = s3;
                        int n14 = n9;
                        int n15 = b9;
                        final int n16 = e2;
                        final int n17 = b3;
                        int intValue = n12;
                        while (n15 - n17 < n16) {
                            rwj.D(n15);
                            final int e4 = rwj.e();
                            chw.y(e4 > 0, s6);
                            final int e5 = rwj.e();
                            List<byte[]> list = null;
                            String s9 = null;
                            int b11 = 0;
                            int n28 = 0;
                            String s10 = null;
                            int n29 = 0;
                            String s11 = null;
                            int n30 = 0;
                            Label_2826: {
                                Label_2256: {
                                    if (e5 == 1835557187) {
                                        final int n18 = e4 - 13;
                                        final byte[] array2 = new byte[n18];
                                        rwj.D(n15 + 13);
                                        rwj.d(array2, 0, n18);
                                        list = edd.t(array2);
                                    }
                                    else {
                                        final String s7 = s6;
                                        if (e5 != 1702061171 && (!b2 || e5 != 2002876005)) {
                                            Label_2186: {
                                                if (e5 == 1684103987) {
                                                    rwj.D(n15 + 8);
                                                    final String string = Integer.toString(n);
                                                    final int y2 = cf.b[(rwj.t() & 0xC0) >> 6];
                                                    final int t2 = rwj.t();
                                                    int x = cf.d[(t2 & 0x38) >> 3];
                                                    if ((t2 & 0x4) != 0x0) {
                                                        ++x;
                                                    }
                                                    final n$a n$a4 = new n$a();
                                                    n$a4.a = string;
                                                    n$a4.k = j;
                                                    n$a4.x = x;
                                                    n$a4.y = y2;
                                                    n$a4.n = n11;
                                                    n$a4.c = s2;
                                                    c.b = n$a4.a();
                                                }
                                                else if (e5 == 1684366131) {
                                                    rwj.D(n15 + 8);
                                                    final String string2 = Integer.toString(n);
                                                    rwj.E(2);
                                                    final int y3 = cf.b[(rwj.t() & 0xC0) >> 6];
                                                    final int t3 = rwj.t();
                                                    int n20;
                                                    final int n19 = n20 = cf.d[(t3 & 0xE) >> 1];
                                                    if ((t3 & 0x1) != 0x0) {
                                                        n20 = n19 + 1;
                                                    }
                                                    int x2 = n20;
                                                    if ((rwj.t() & 0x1E) >> 1 > 0) {
                                                        x2 = n20;
                                                        if ((rwj.t() & 0x2) != 0x0) {
                                                            x2 = n20 + 2;
                                                        }
                                                    }
                                                    String l;
                                                    if (rwj.c - rwj.b > 0 && (rwj.t() & 0x1) != 0x0) {
                                                        l = "audio/eac3-joc";
                                                    }
                                                    else {
                                                        l = "audio/eac3";
                                                    }
                                                    final n$a n$a5 = new n$a();
                                                    n$a5.a = string2;
                                                    n$a5.k = l;
                                                    n$a5.x = x2;
                                                    n$a5.y = y3;
                                                    n$a5.n = n11;
                                                    n$a5.c = s2;
                                                    c.b = n$a5.a();
                                                }
                                                else if (e5 == 1684103988) {
                                                    rwj.D(n15 + 8);
                                                    final String string3 = Integer.toString(n);
                                                    rwj.E(1);
                                                    int y4;
                                                    if ((rwj.t() & 0x20) >> 5 == 1) {
                                                        y4 = 48000;
                                                    }
                                                    else {
                                                        y4 = 44100;
                                                    }
                                                    final n$a n$a6 = new n$a();
                                                    n$a6.a = string3;
                                                    n$a6.k = "audio/ac4";
                                                    n$a6.x = 2;
                                                    n$a6.y = y4;
                                                    n$a6.n = n11;
                                                    n$a6.c = s2;
                                                    c.b = n$a6.a();
                                                }
                                                else if (e5 == 1684892784) {
                                                    if (n13 > 0) {
                                                        n14 = n13;
                                                        intValue = 2;
                                                        list = m;
                                                        break Label_2256;
                                                    }
                                                    final StringBuilder sb = new StringBuilder(60);
                                                    sb.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                                    sb.append(n13);
                                                    throw ParserException.a(sb.toString(), (Throwable)null);
                                                }
                                                else {
                                                    if (e5 != 1684305011) {
                                                        if (e5 == 1682927731) {
                                                            final int n21 = e4 - 8;
                                                            final byte[] a3 = gx0.a;
                                                            final byte[] copy = Arrays.copyOf(a3, a3.length + n21);
                                                            rwj.D(n15 + 8);
                                                            rwj.d(copy, a3.length, n21);
                                                            list = uoz.l(copy);
                                                        }
                                                        else if (e5 == 1684425825) {
                                                            final int n22 = e4 - 12;
                                                            final byte[] array3 = new byte[n22 + 4];
                                                            array3[0] = 102;
                                                            array3[1] = 76;
                                                            array3[2] = 97;
                                                            array3[3] = 67;
                                                            rwj.D(n15 + 12);
                                                            rwj.d(array3, 4, n22);
                                                            list = edd.t(array3);
                                                        }
                                                        else {
                                                            if (e5 != 1634492771) {
                                                                break Label_2186;
                                                            }
                                                            final int n23 = e4 - 12;
                                                            final byte[] array4 = new byte[n23];
                                                            rwj.D(n15 + 12);
                                                            rwj.d(array4, 0, n23);
                                                            final rwj rwj2 = new rwj(array4);
                                                            rwj2.D(9);
                                                            final int t4 = rwj2.t();
                                                            rwj2.D(20);
                                                            final Pair create = Pair.create((Object)rwj2.w(), (Object)t4);
                                                            n14 = (int)create.first;
                                                            intValue = (int)create.second;
                                                            list = edd.t(array4);
                                                        }
                                                        break Label_2256;
                                                    }
                                                    final n$a n$a7 = new n$a();
                                                    n$a7.b(n);
                                                    n$a7.k = s5;
                                                    n$a7.x = intValue;
                                                    n$a7.y = n14;
                                                    n$a7.n = n11;
                                                    n$a7.c = s2;
                                                    c.b = n$a7.a();
                                                }
                                            }
                                            list = m;
                                        }
                                        else {
                                            final int n24;
                                            String s8 = null;
                                            int n26 = 0;
                                            int n27 = 0;
                                            Label_2649: {
                                                if (e5 != 1702061171) {
                                                    final int b10 = rwj.b;
                                                    chw.y(b10 >= n15, (String)null);
                                                    while (true) {
                                                        int e6;
                                                        for (int n24 = e4, n25 = b10; n25 - n15 < n24; n25 += e6) {
                                                            rwj.D(n25);
                                                            e6 = rwj.e();
                                                            chw.y(e6 > 0, s7);
                                                            if (rwj.e() == 1702061171) {
                                                                s8 = s7;
                                                                n26 = n13;
                                                                n27 = n25;
                                                                break Label_2649;
                                                            }
                                                        }
                                                        int n25 = -1;
                                                        continue;
                                                    }
                                                }
                                                n27 = n15;
                                                s8 = s7;
                                                n24 = e4;
                                                n26 = n13;
                                            }
                                            s9 = s5;
                                            b11 = intValue;
                                            n28 = n24;
                                            s10 = s8;
                                            n29 = n14;
                                            s11 = c3;
                                            list = m;
                                            n30 = n26;
                                            if (n27 == -1) {
                                                break Label_2826;
                                            }
                                            final Pair<String, byte[]> b12 = b(rwj, n27);
                                            final String s12 = (String)b12.first;
                                            final byte[] array5 = (byte[])b12.second;
                                            s9 = s12;
                                            b11 = intValue;
                                            n28 = n24;
                                            s10 = s8;
                                            n29 = n14;
                                            s11 = c3;
                                            list = m;
                                            n30 = n26;
                                            if (array5 != null) {
                                                b11 = intValue;
                                                if ("audio/mp4a-latm".equals(s12)) {
                                                    final z6$a c4 = z6.c(array5);
                                                    n14 = c4.a;
                                                    b11 = c4.b;
                                                    c3 = c4.c;
                                                }
                                                list = edd.t(array5);
                                                n30 = n26;
                                                s11 = c3;
                                                n29 = n14;
                                                s10 = s8;
                                                n28 = n24;
                                                s9 = s12;
                                            }
                                            break Label_2826;
                                        }
                                    }
                                }
                                n30 = n13;
                                s9 = s5;
                                b11 = intValue;
                                n28 = e4;
                                s10 = s6;
                                n29 = n14;
                                s11 = c3;
                            }
                            s6 = s10;
                            n15 += n28;
                            s5 = s9;
                            intValue = b11;
                            n14 = n29;
                            n13 = n30;
                            c3 = s11;
                            m = (edd)list;
                        }
                        n7 = n16;
                        n8 = n17;
                        if (c.b == null) {
                            n7 = n16;
                            n8 = n17;
                            if (s5 != null) {
                                final n$a n$a8 = new n$a();
                                n$a8.b(n);
                                n$a8.k = s5;
                                n$a8.h = c3;
                                n$a8.x = intValue;
                                n$a8.y = n14;
                                n$a8.z = z;
                                n$a8.m = m;
                                n$a8.n = n11;
                                n$a8.c = s2;
                                c.b = n$a8.a();
                                n8 = n17;
                                n7 = n16;
                            }
                        }
                    }
                    c2 = c;
                    n6 = n8;
                }
            }
            else {
                final String s13 = "childAtomSize must be positive";
                rwj.D(b3 + 8 + 8);
                rwj.E(16);
                final int y5 = rwj.y();
                final int y6 = rwj.y();
                rwj.E(50);
                int b13 = rwj.b;
                com.google.android.exoplayer2.drm.b n31;
                int n32;
                if (n3 == 1701733238) {
                    final Pair<Integer, zvt> d2 = d(rwj, b3, e2);
                    com.google.android.exoplayer2.drm.b a4;
                    if (d2 != null) {
                        n3 = (int)d2.first;
                        if (b == null) {
                            a4 = null;
                        }
                        else {
                            a4 = b.a(((zvt)d2.second).b);
                        }
                        c.a[i] = (zvt)d2.second;
                    }
                    else {
                        a4 = b;
                    }
                    rwj.D(b13);
                    n31 = a4;
                    n32 = n3;
                }
                else {
                    n31 = b;
                    n32 = n3;
                }
                final int n33 = b3;
                String s14;
                if (n32 == 1831958048) {
                    s14 = "video/mpeg";
                }
                else if (n32 == 1211250227) {
                    s14 = "video/3gpp";
                }
                else {
                    s14 = null;
                }
                final String s15 = s14;
                byte[] copyOfRange = null;
                float t5 = 1.0f;
                String h = null;
                int v = -1;
                ByteBuffer order = null;
                int n34 = -1;
                int n35 = -1;
                int n36 = 0;
                List<byte[]> t6 = null;
                int n37 = -1;
                final int n38 = n32;
                final c c5 = c;
                String k2 = s15;
                while (b13 - n33 < n2) {
                    rwj.D(b13);
                    final int b14 = rwj.b;
                    int n39 = v;
                    final int e7 = rwj.e();
                    if (e7 == 0 && rwj.b - n33 == n2) {
                        break;
                    }
                    chw.y(e7 > 0, s13);
                    final int e8 = rwj.e();
                    Label_4580: {
                        List<byte[]> list4 = null;
                        ByteBuffer byteBuffer2 = null;
                        String s19 = null;
                        Label_3914: {
                            String s18 = null;
                            List<byte[]> list5 = null;
                            String s20 = null;
                            Label_3694: {
                                List list2 = null;
                                String s16 = null;
                                String s17 = null;
                                Label_3397: {
                                    if (e8 == 1635148611) {
                                        chw.y(k2 == null, (String)null);
                                        rwj.D(b14 + 8);
                                        final be1 b15 = be1.b(rwj);
                                        list2 = b15.a;
                                        c5.c = b15.b;
                                        if (n36 == 0) {
                                            t5 = b15.e;
                                        }
                                        s16 = b15.f;
                                        s17 = "video/avc";
                                    }
                                    else {
                                        if (e8 != 1752589123) {
                                            int n41 = 0;
                                            Label_4576: {
                                                int n40 = 0;
                                                int a5 = 0;
                                                int b16 = 0;
                                                Label_4564: {
                                                    if (e8 != 1685480259 && e8 != 1685485123) {
                                                        if (e8 == 1987076931) {
                                                            chw.y(k2 == null, (String)null);
                                                            if (n38 == 1987063864) {
                                                                s17 = "video/x-vnd.on2.vp8";
                                                            }
                                                            else {
                                                                s17 = "video/x-vnd.on2.vp9";
                                                            }
                                                            final List<byte[]> list3 = t6;
                                                            s16 = h;
                                                            list2 = list3;
                                                            break Label_3397;
                                                        }
                                                        if (e8 == 1635135811) {
                                                            chw.y(k2 == null, (String)null);
                                                            s18 = "video/av01";
                                                        }
                                                        else if (e8 == 1668050025) {
                                                            if (order == null) {
                                                                order = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                            }
                                                            order.position(21);
                                                            order.putShort(rwj.p());
                                                            order.putShort(rwj.p());
                                                            s18 = k2;
                                                        }
                                                        else {
                                                            if (e8 == 1835295606) {
                                                                ByteBuffer order2;
                                                                if ((order2 = order) == null) {
                                                                    order2 = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                }
                                                                final short p6 = rwj.p();
                                                                final short p7 = rwj.p();
                                                                final short p8 = rwj.p();
                                                                final short p9 = rwj.p();
                                                                final short p10 = rwj.p();
                                                                final short p11 = rwj.p();
                                                                final short p12 = rwj.p();
                                                                final short p13 = rwj.p();
                                                                final long u = rwj.u();
                                                                final long u2 = rwj.u();
                                                                order2.position(1);
                                                                order2.putShort(p10);
                                                                order2.putShort(p11);
                                                                order2.putShort(p6);
                                                                order2.putShort(p7);
                                                                order2.putShort(p8);
                                                                order2.putShort(p9);
                                                                order2.putShort(p12);
                                                                order2.putShort(p13);
                                                                order2.putShort((short)(u / 10000L));
                                                                order2.putShort((short)(u2 / 10000L));
                                                                final ByteBuffer byteBuffer = order2;
                                                                list4 = t6;
                                                                byteBuffer2 = byteBuffer;
                                                                s19 = k2;
                                                                break Label_3914;
                                                            }
                                                            if (e8 == 1681012275) {
                                                                chw.y(k2 == null, (String)null);
                                                                k2 = "video/3gpp";
                                                                n40 = n34;
                                                                a5 = n35;
                                                                n41 = n39;
                                                                b16 = n37;
                                                                break Label_4564;
                                                            }
                                                            if (e8 == 1702061171) {
                                                                chw.y(k2 == null, (String)null);
                                                                final Pair<String, byte[]> b17 = b(rwj, b14);
                                                                k2 = (String)b17.first;
                                                                final byte[] array6 = (byte[])b17.second;
                                                                if (array6 != null) {
                                                                    t6 = edd.t(array6);
                                                                }
                                                                n41 = n39;
                                                                break Label_4576;
                                                            }
                                                            if (e8 == 1885434736) {
                                                                rwj.D(b14 + 8);
                                                                t5 = rwj.w() / (float)rwj.w();
                                                                n36 = 1;
                                                                break Label_4580;
                                                            }
                                                            if (e8 == 1937126244) {
                                                                while (true) {
                                                                    int e9;
                                                                    for (int n42 = b14 + 8; n42 - b14 < e7; n42 += e9) {
                                                                        rwj.D(n42);
                                                                        e9 = rwj.e();
                                                                        if (rwj.e() == 1886547818) {
                                                                            copyOfRange = Arrays.copyOfRange(rwj.a, n42, e9 + n42);
                                                                            break Label_4580;
                                                                        }
                                                                    }
                                                                    copyOfRange = null;
                                                                    continue;
                                                                }
                                                            }
                                                            if (e8 == 1936995172) {
                                                                final int t7 = rwj.t();
                                                                rwj.E(3);
                                                                if (t7 == 0) {
                                                                    final int t8 = rwj.t();
                                                                    if (t8 == 0) {
                                                                        n41 = 0;
                                                                        n40 = n34;
                                                                        a5 = n35;
                                                                        b16 = n37;
                                                                        break Label_4564;
                                                                    }
                                                                    if (t8 == 1) {
                                                                        n41 = 1;
                                                                        n40 = n34;
                                                                        a5 = n35;
                                                                        b16 = n37;
                                                                        break Label_4564;
                                                                    }
                                                                    if (t8 == 2) {
                                                                        n41 = 2;
                                                                        n40 = n34;
                                                                        a5 = n35;
                                                                        b16 = n37;
                                                                        break Label_4564;
                                                                    }
                                                                    if (t8 == 3) {
                                                                        n41 = 3;
                                                                        n40 = n34;
                                                                        a5 = n35;
                                                                        b16 = n37;
                                                                        break Label_4564;
                                                                    }
                                                                }
                                                            }
                                                            else if (e8 == 1668246642) {
                                                                final int e10 = rwj.e();
                                                                if (e10 == 1852009592 || e10 == 1852009571) {
                                                                    final int y7 = rwj.y();
                                                                    final int y8 = rwj.y();
                                                                    rwj.E(2);
                                                                    final boolean b18 = e7 == 19 && (rwj.t() & 0x80) != 0x0;
                                                                    a5 = rq4.a(y7);
                                                                    int n43;
                                                                    if (b18) {
                                                                        n43 = 1;
                                                                    }
                                                                    else {
                                                                        n43 = 2;
                                                                    }
                                                                    b16 = rq4.b(y8);
                                                                    n40 = n43;
                                                                    n41 = n39;
                                                                    break Label_4564;
                                                                }
                                                                final String value = String.valueOf(fx0.a(e10));
                                                                String concat;
                                                                if (value.length() != 0) {
                                                                    concat = "Unsupported color type: ".concat(value);
                                                                }
                                                                else {
                                                                    concat = new String("Unsupported color type: ");
                                                                }
                                                                Log.w("AtomParsers", concat);
                                                            }
                                                            n40 = n34;
                                                            a5 = n35;
                                                            n41 = n39;
                                                            b16 = n37;
                                                            break Label_4564;
                                                        }
                                                        list5 = t6;
                                                        byteBuffer2 = order;
                                                        s20 = h;
                                                        break Label_3694;
                                                    }
                                                    else {
                                                        final k69 b19 = k69.b(rwj);
                                                        n40 = n34;
                                                        a5 = n35;
                                                        n41 = n39;
                                                        b16 = n37;
                                                        if (b19 != null) {
                                                            h = (String)b19.c;
                                                            k2 = "video/dolby-vision";
                                                            b16 = n37;
                                                            n41 = n39;
                                                            a5 = n35;
                                                            n40 = n34;
                                                        }
                                                    }
                                                }
                                                n37 = b16;
                                                n35 = a5;
                                                n34 = n40;
                                            }
                                            n39 = n41;
                                            break Label_4580;
                                        }
                                        chw.y(k2 == null, (String)null);
                                        rwj.D(b14 + 8);
                                        final hjc a6 = hjc.a(rwj);
                                        list2 = a6.a;
                                        c5.c = a6.b;
                                        if (n36 == 0) {
                                            t5 = a6.c;
                                        }
                                        s16 = a6.d;
                                        s17 = "video/hevc";
                                    }
                                }
                                s18 = s17;
                                s20 = s16;
                                list5 = list2;
                                byteBuffer2 = order;
                            }
                            s19 = s18;
                            h = s20;
                            list4 = list5;
                        }
                        k2 = s19;
                        order = byteBuffer2;
                        t6 = list4;
                    }
                    b13 += e7;
                    v = n39;
                }
                if (k2 == null) {
                    c2 = c5;
                    n7 = n2;
                    n6 = n33;
                }
                else {
                    final n$a n$a9 = new n$a();
                    n$a9.b(n);
                    n$a9.k = k2;
                    n$a9.h = h;
                    n$a9.p = y5;
                    n$a9.q = y6;
                    n$a9.t = t5;
                    n$a9.s = s;
                    n$a9.u = copyOfRange;
                    n$a9.v = v;
                    n$a9.m = t6;
                    n$a9.n = n31;
                    if (n35 != -1 || n34 != -1 || n37 != -1 || order != null) {
                        byte[] array7;
                        if (order != null) {
                            array7 = order.array();
                        }
                        else {
                            array7 = null;
                        }
                        n$a9.w = new rq4(n35, n34, n37, array7);
                    }
                    final n a7 = n$a9.a();
                    c2 = c5;
                    c2.b = a7;
                    n6 = n33;
                    n7 = n2;
                }
            }
            rwj.D(n6 + n7);
        }
        return c;
    }
    
    public static List<fwt> f(final fx0$a fx0$a, final ixb ixb, final long n, final com.google.android.exoplayer2.drm.b b, final boolean b2, final boolean b3, final btb<yvt, yvt> btb) throws ParserException {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < fx0$a.d.size(); ++i) {
            final fx0$a fx0$a2 = fx0$a.d.get(i);
            if (((fx0)fx0$a2).a == 1953653099) {
                final fx0$b c = fx0$a.c(1836476516);
                Objects.requireNonNull(c);
                final fx0$a b4 = fx0$a2.b(1835297121);
                Objects.requireNonNull(b4);
                final fx0$b c2 = b4.c(1751411826);
                Objects.requireNonNull(c2);
                final rwj b5 = c2.b;
                b5.D(16);
                final int e = b5.e();
                int n2;
                if (e == 1936684398) {
                    n2 = 1;
                }
                else if (e == 1986618469) {
                    n2 = 2;
                }
                else if (e != 1952807028 && e != 1935832172 && e != 1937072756 && e != 1668047728) {
                    if (e == 1835365473) {
                        n2 = 5;
                    }
                    else {
                        n2 = -1;
                    }
                }
                else {
                    n2 = 3;
                }
                Object o = null;
                Label_1230: {
                    Label_1172: {
                        if (n2 != -1) {
                            final fx0$b c3 = fx0$a2.c(1953196132);
                            Objects.requireNonNull(c3);
                            final rwj b6 = c3.b;
                            int n3 = 8;
                            b6.D(8);
                            final int n4 = b6.e() >> 24 & 0xFF;
                            if (n4 != 0) {
                                n3 = 16;
                            }
                            b6.E(n3);
                            final int e2 = b6.e();
                            b6.E(4);
                            final int b7 = b6.b;
                            int n5;
                            if (n4 == 0) {
                                n5 = 4;
                            }
                            else {
                                n5 = 8;
                            }
                            int j = 0;
                            while (true) {
                                while (j < n5) {
                                    if (b6.a[b7 + j] != -1) {
                                        final boolean b8 = false;
                                        long n6 = 0L;
                                        Label_0408: {
                                            if (b8) {
                                                b6.E(n5);
                                            }
                                            else {
                                                if (n4 == 0) {
                                                    n6 = b6.u();
                                                }
                                                else {
                                                    n6 = b6.x();
                                                }
                                                if (n6 != 0L) {
                                                    break Label_0408;
                                                }
                                            }
                                            n6 = -9223372036854775807L;
                                        }
                                        b6.E(16);
                                        final int e3 = b6.e();
                                        final int e4 = b6.e();
                                        b6.E(4);
                                        final int e5 = b6.e();
                                        final int e6 = b6.e();
                                        int n7;
                                        if (e3 == 0 && e4 == 65536 && e5 == -65536 && e6 == 0) {
                                            n7 = 90;
                                        }
                                        else if (e3 == 0 && e4 == -65536 && e5 == 65536 && e6 == 0) {
                                            n7 = 270;
                                        }
                                        else if (e3 == -65536 && e4 == 0 && e5 == 0 && e6 == -65536) {
                                            n7 = 180;
                                        }
                                        else {
                                            n7 = 0;
                                        }
                                        if (n != -9223372036854775807L) {
                                            n6 = n;
                                        }
                                        final rwj b9 = c.b;
                                        b9.D(8);
                                        int n8;
                                        if ((b9.e() >> 24 & 0xFF) == 0x0) {
                                            n8 = 8;
                                        }
                                        else {
                                            n8 = 16;
                                        }
                                        b9.E(n8);
                                        final long u = b9.u();
                                        final long n9 = -9223372036854775807L;
                                        long n10;
                                        if (n6 == -9223372036854775807L) {
                                            n10 = n9;
                                        }
                                        else {
                                            n10 = cnw.N(n6, 1000000L, u);
                                        }
                                        final fx0$a b10 = b4.b(1835626086);
                                        Objects.requireNonNull(b10);
                                        final fx0$a b11 = b10.b(1937007212);
                                        Objects.requireNonNull(b11);
                                        final fx0$b c4 = b4.c(1835296868);
                                        Objects.requireNonNull(c4);
                                        final rwj b12 = c4.b;
                                        b12.D(8);
                                        final int n11 = b12.e() >> 24 & 0xFF;
                                        int n12;
                                        if (n11 == 0) {
                                            n12 = 8;
                                        }
                                        else {
                                            n12 = 16;
                                        }
                                        b12.E(n12);
                                        final long u2 = b12.u();
                                        int n13;
                                        if (n11 == 0) {
                                            n13 = 4;
                                        }
                                        else {
                                            n13 = 8;
                                        }
                                        b12.E(n13);
                                        final int y = b12.y();
                                        final char c5 = (char)((y >> 10 & 0x1F) + 96);
                                        final char c6 = (char)((y >> 5 & 0x1F) + 96);
                                        final char c7 = (char)((y & 0x1F) + 96);
                                        final StringBuilder sb = new StringBuilder(3);
                                        sb.append(c5);
                                        sb.append(c6);
                                        sb.append(c7);
                                        final Pair create = Pair.create((Object)u2, (Object)sb.toString());
                                        final fx0$b c8 = b11.c(1937011556);
                                        Objects.requireNonNull(c8);
                                        final c e7 = e(c8.b, e2, n7, (String)create.second, b, b3);
                                        long[] array3 = null;
                                        long[] array4 = null;
                                        Label_1164: {
                                            long n16 = 0L;
                                            Label_1154: {
                                                if (!b2) {
                                                    final fx0$a b13 = fx0$a2.b(1701082227);
                                                    if (b13 != null) {
                                                        final fx0$b c9 = b13.c(1701606260);
                                                        Pair create2;
                                                        if (c9 == null) {
                                                            create2 = null;
                                                        }
                                                        else {
                                                            final rwj b14 = c9.b;
                                                            b14.D(8);
                                                            final int n14 = b14.e() >> 24 & 0xFF;
                                                            final int w = b14.w();
                                                            final long[] array = new long[w];
                                                            final long[] array2 = new long[w];
                                                            for (int k = 0; k < w; ++k) {
                                                                long n15;
                                                                if (n14 == 1) {
                                                                    n15 = b14.x();
                                                                }
                                                                else {
                                                                    n15 = b14.u();
                                                                }
                                                                array[k] = n15;
                                                                long m;
                                                                if (n14 == 1) {
                                                                    m = b14.m();
                                                                }
                                                                else {
                                                                    m = b14.e();
                                                                }
                                                                array2[k] = m;
                                                                if (b14.p() != 1) {
                                                                    throw new IllegalArgumentException("Unsupported media rate.");
                                                                }
                                                                b14.E(2);
                                                            }
                                                            create2 = Pair.create((Object)array, (Object)array2);
                                                        }
                                                        n16 = n10;
                                                        if (create2 != null) {
                                                            array3 = (long[])create2.first;
                                                            array4 = (long[])create2.second;
                                                            break Label_1164;
                                                        }
                                                        break Label_1154;
                                                    }
                                                }
                                                n16 = n10;
                                            }
                                            array3 = null;
                                            array4 = null;
                                            n10 = n16;
                                        }
                                        if (e7.b == null) {
                                            break Label_1172;
                                        }
                                        o = new yvt(e2, n2, (long)create.first, u, n10, e7.b, e7.d, e7.a, e7.c, array3, array4);
                                        break Label_1230;
                                    }
                                    else {
                                        ++j;
                                    }
                                }
                                final boolean b8 = true;
                                continue;
                            }
                        }
                    }
                    o = null;
                }
                final yvt yvt = (yvt)btb.apply(o);
                if (yvt != null) {
                    final fx0$a b15 = fx0$a2.b(1835297121);
                    Objects.requireNonNull(b15);
                    final fx0$a b16 = b15.b(1835626086);
                    Objects.requireNonNull(b16);
                    final fx0$a b17 = b16.b(1937007212);
                    Objects.requireNonNull(b17);
                    final fx0$b c10 = b17.c(1937011578);
                    Object o2;
                    if (c10 != null) {
                        o2 = new gx0.gx0$d(c10, yvt.f);
                    }
                    else {
                        final fx0$b c11 = b17.c(1937013298);
                        if (c11 == null) {
                            throw ParserException.a("Track has no sample table size information", (Throwable)null);
                        }
                        o2 = new gx0.gx0$e(c11);
                    }
                    final int c12 = ((b)o2).c();
                    fwt fwt = null;
                    Label_1403: {
                        if (c12 == 0) {
                            fwt = new fwt(yvt, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        }
                        else {
                            fx0$b fx0$b = b17.c(1937007471);
                            boolean b18;
                            if (fx0$b == null) {
                                fx0$b = b17.c(1668232756);
                                Objects.requireNonNull(fx0$b);
                                b18 = true;
                            }
                            else {
                                b18 = false;
                            }
                            final rwj b19 = fx0$b.b;
                            final fx0$b c13 = b17.c(1937011555);
                            Objects.requireNonNull(c13);
                            final rwj b20 = c13.b;
                            final fx0$b c14 = b17.c(1937011827);
                            Objects.requireNonNull(c14);
                            final rwj b21 = c14.b;
                            final fx0$b c15 = b17.c(1937011571);
                            rwj b22;
                            if (c15 != null) {
                                b22 = c15.b;
                            }
                            else {
                                b22 = null;
                            }
                            final fx0$b c16 = b17.c(1668576371);
                            rwj b23;
                            if (c16 != null) {
                                b23 = c16.b;
                            }
                            else {
                                b23 = null;
                            }
                            final a a = new a(b20, b19, b18);
                            b21.D(12);
                            int n17 = b21.w() - 1;
                            final int w2 = b21.w();
                            int w3 = b21.w();
                            int l;
                            if (b23 != null) {
                                b23.D(12);
                                l = b23.w();
                            }
                            else {
                                l = 0;
                            }
                            int w4 = 0;
                            int n18 = 0;
                            rwj rwj = null;
                            Label_1681: {
                                if (b22 != null) {
                                    b22.D(12);
                                    w4 = b22.w();
                                    if (w4 > 0) {
                                        n18 = b22.w() - 1;
                                        rwj = b22;
                                        break Label_1681;
                                    }
                                    b22 = null;
                                }
                                else {
                                    w4 = 0;
                                }
                                n18 = -1;
                                rwj = b22;
                            }
                            final int b24 = ((b)o2).b();
                            final String o3 = yvt.f.O0;
                            int n26 = 0;
                            long[] copy4 = null;
                            int max = 0;
                            long n31 = 0L;
                            long[] array8 = null;
                            yvt yvt2 = null;
                            int[] array9 = null;
                            int[] array10 = null;
                            Label_2860: {
                                if (b24 == -1 || (!"audio/raw".equals(o3) && !"audio/g711-mlaw".equals(o3) && !"audio/g711-alaw".equals(o3)) || n17 != 0 || l != 0 || w4 != 0) {
                                    long[] copy = new long[c12];
                                    final int[] array5 = new int[c12];
                                    final long[] array6 = new long[c12];
                                    int[] copy2 = new int[c12];
                                    final int n19 = n18;
                                    int n20 = w4;
                                    int n21 = 0;
                                    final int n22 = 0;
                                    long n23 = 0L;
                                    long d = 0L;
                                    int e8 = 0;
                                    int w5 = 0;
                                    int n24 = 0;
                                    int n25 = w2;
                                    int c17 = n22;
                                    n26 = c12;
                                    int n27 = n19;
                                    while (true) {
                                        while (n24 < n26) {
                                            int n28 = 1;
                                            while (c17 == 0) {
                                                final boolean a2 = a.a();
                                                if ((n28 = (a2 ? 1 : 0)) == 0) {
                                                    break;
                                                }
                                                d = a.d;
                                                c17 = a.c;
                                                n28 = (a2 ? 1 : 0);
                                            }
                                            final int n29 = n25;
                                            if (n28 == 0) {
                                                Log.w("AtomParsers", "Unexpected end of chunk data");
                                                copy = Arrays.copyOf(copy, n24);
                                                final int[] copy3 = Arrays.copyOf(array5, n24);
                                                copy4 = Arrays.copyOf(array6, n24);
                                                copy2 = Arrays.copyOf(copy2, n24);
                                                n26 = n24;
                                                final long n30 = e8;
                                                boolean b25 = false;
                                                Label_2628: {
                                                    if (b23 != null) {
                                                        while (l > 0) {
                                                            if (b23.w() != 0) {
                                                                b25 = false;
                                                                break Label_2628;
                                                            }
                                                            b23.e();
                                                            --l;
                                                        }
                                                    }
                                                    b25 = true;
                                                }
                                                if (n20 != 0 || n29 != 0 || c17 != 0 || n17 != 0 || w5 != 0 || !b25) {
                                                    final int a3 = yvt.a;
                                                    String s;
                                                    if (!b25) {
                                                        s = ", ctts invalid";
                                                    }
                                                    else {
                                                        s = "";
                                                    }
                                                    final StringBuilder sb2 = new StringBuilder(s.length() + 262);
                                                    sb2.append("Inconsistent stbl box for track ");
                                                    sb2.append(a3);
                                                    sb2.append(": remainingSynchronizationSamples ");
                                                    sb2.append(n20);
                                                    sb2.append(", remainingSamplesAtTimestampDelta ");
                                                    sb2.append(n29);
                                                    sb2.append(", remainingSamplesInChunk ");
                                                    sb2.append(c17);
                                                    sb2.append(", remainingTimestampDeltaChanges ");
                                                    sb2.append(n17);
                                                    sb2.append(", remainingSamplesAtTimestampOffset ");
                                                    sb2.append(w5);
                                                    sb2.append(s);
                                                    Log.w("AtomParsers", sb2.toString());
                                                }
                                                final int[] array7 = copy3;
                                                max = n21;
                                                n31 = n23 + n30;
                                                array8 = copy;
                                                yvt2 = yvt;
                                                array9 = copy2;
                                                array10 = array7;
                                                break Label_2860;
                                            }
                                            int n32 = l;
                                            int n33 = e8;
                                            int n34 = w5;
                                            if (b23 != null) {
                                                while (w5 == 0 && l > 0) {
                                                    w5 = b23.w();
                                                    e8 = b23.e();
                                                    --l;
                                                }
                                                n34 = w5 - 1;
                                                n33 = e8;
                                                n32 = l;
                                            }
                                            copy[n24] = d;
                                            array5[n24] = ((b)o2).a();
                                            int n35;
                                            if (array5[n24] > (n35 = n21)) {
                                                n35 = array5[n24];
                                            }
                                            array6[n24] = n23 + n33;
                                            int n36;
                                            if (rwj == null) {
                                                n36 = 1;
                                            }
                                            else {
                                                n36 = 0;
                                            }
                                            copy2[n24] = n36;
                                            int n37 = n27;
                                            int n38 = n20;
                                            if (n24 == n27) {
                                                copy2[n24] = 1;
                                                final int n39 = n20 - 1;
                                                n37 = n27;
                                                if ((n38 = n39) > 0) {
                                                    Objects.requireNonNull(rwj);
                                                    n37 = rwj.w() - 1;
                                                    n38 = n39;
                                                }
                                            }
                                            n23 += w3;
                                            int w6 = n29 - 1;
                                            int e9;
                                            if (w6 == 0 && n17 > 0) {
                                                w6 = b21.w();
                                                e9 = b21.e();
                                                --n17;
                                            }
                                            else {
                                                e9 = w3;
                                            }
                                            d += array5[n24];
                                            --c17;
                                            ++n24;
                                            final int n40 = n33;
                                            n27 = n37;
                                            n20 = n38;
                                            n21 = n35;
                                            n25 = w6;
                                            w3 = e9;
                                            l = n32;
                                            e8 = n40;
                                            w5 = n34;
                                        }
                                        final int n29 = n25;
                                        copy4 = array6;
                                        final int[] copy3 = array5;
                                        continue;
                                    }
                                }
                                final int a4 = a.a;
                                final long[] array11 = new long[a4];
                                int[] array12 = new int[a4];
                                while (a.a()) {
                                    final int b26 = a.b;
                                    array11[b26] = a.d;
                                    array12[b26] = a.c;
                                }
                                final long n41 = w3;
                                final int n42 = 8192 / b24;
                                int n43 = 0;
                                int n44 = 0;
                                while (n43 < a4) {
                                    final int n45 = array12[n43];
                                    final int a5 = cnw.a;
                                    n44 += (n45 + n42 - 1) / n42;
                                    ++n43;
                                }
                                long[] array13 = new long[n44];
                                final int[] array14 = new int[n44];
                                final long[] array15 = new long[n44];
                                final int[] array16 = new int[n44];
                                int n46 = 0;
                                int n47 = 0;
                                int n48 = 0;
                                max = 0;
                                while (n46 < a4) {
                                    int n49 = array12[n46];
                                    long n50 = array11[n46];
                                    final long[] array17 = array13;
                                    final int[] array18 = array12;
                                    while (n49 > 0) {
                                        final int min = Math.min(n42, n49);
                                        array17[n48] = n50;
                                        array14[n48] = b24 * min;
                                        max = Math.max(max, array14[n48]);
                                        array15[n48] = n47 * n41;
                                        array16[n48] = 1;
                                        n50 += array14[n48];
                                        n47 += min;
                                        n49 -= min;
                                        ++n48;
                                    }
                                    ++n46;
                                    array12 = array18;
                                    array13 = array17;
                                }
                                n31 = n41 * n47;
                                final int[] array19 = array16;
                                array10 = array14;
                                array8 = array13;
                                array9 = array19;
                                n26 = c12;
                                yvt2 = yvt;
                                copy4 = array15;
                            }
                            final long n51 = cnw.N(n31, 1000000L, yvt2.c);
                            final long[] h = yvt2.h;
                            if (h == null) {
                                cnw.O(copy4, yvt2.c);
                                fwt = new fwt(yvt2, array8, array10, max, copy4, array9, n51);
                            }
                            else {
                                if (h.length == 1 && yvt2.b == 1 && copy4.length >= 2) {
                                    final long[] i2 = yvt2.i;
                                    Objects.requireNonNull(i2);
                                    final long n52 = i2[0];
                                    final long n53 = cnw.N(yvt2.h[0], yvt2.c, yvt2.d) + n52;
                                    final int n54 = copy4.length - 1;
                                    final int i3 = cnw.i(4, 0, n54);
                                    final int i4 = cnw.i(copy4.length - 4, 0, n54);
                                    if (copy4[0] <= n52 && n52 < copy4[i3] && copy4[i4] < n53 && n53 <= n31) {
                                        final long n55 = cnw.N(n52 - copy4[0], yvt2.f.c1, yvt2.c);
                                        final long n56 = cnw.N(n31 - n53, yvt2.f.c1, yvt2.c);
                                        if ((n55 != 0L || n56 != 0L) && n55 <= 2147483647L && n56 <= 2147483647L) {
                                            ixb.a = (int)n55;
                                            ixb.b = (int)n56;
                                            cnw.O(copy4, yvt2.c);
                                            fwt = new fwt(yvt2, array8, array10, max, copy4, array9, cnw.N(yvt2.h[0], 1000000L, yvt2.d));
                                            break Label_1403;
                                        }
                                    }
                                }
                                final long[] h2 = yvt2.h;
                                if (h2.length == 1 && h2[0] == 0L) {
                                    final long[] i5 = yvt2.i;
                                    Objects.requireNonNull(i5);
                                    final long n57 = i5[0];
                                    for (int n58 = 0; n58 < copy4.length; ++n58) {
                                        copy4[n58] = cnw.N(copy4[n58] - n57, 1000000L, yvt2.c);
                                    }
                                    fwt = new fwt(yvt2, array8, array10, max, copy4, array9, cnw.N(n31 - n57, 1000000L, yvt2.c));
                                }
                                else {
                                    final boolean b27 = yvt2.b == 1;
                                    final int[] array20 = new int[h2.length];
                                    final int[] array21 = new int[h2.length];
                                    final long[] i6 = yvt2.i;
                                    Objects.requireNonNull(i6);
                                    int n59 = 0;
                                    int n60 = 0;
                                    int n61 = 0;
                                    int n62 = 0;
                                    while (true) {
                                        final long[] h3 = yvt2.h;
                                        if (n59 >= h3.length) {
                                            break;
                                        }
                                        final long n63 = i6[n59];
                                        if (n63 != -1L) {
                                            final long n64 = cnw.N(h3[n59], yvt2.c, yvt2.d);
                                            array20[n59] = cnw.f(copy4, n63, true);
                                            array21[n59] = cnw.b(copy4, n63 + n64, b27);
                                            while (array20[n59] < array21[n59] && (array9[array20[n59]] & 0x1) == 0x0) {
                                                ++array20[n59];
                                            }
                                            final int n65 = array21[n59];
                                            final int n66 = array20[n59];
                                            final boolean b28 = n61 != array20[n59];
                                            final int n67 = array21[n59];
                                            final boolean b29 = ((b28 ? 1 : 0) | n62) != 0x0;
                                            final int n68 = n67;
                                            n60 += n65 - n66;
                                            n61 = n68;
                                            n62 = (b29 ? 1 : 0);
                                        }
                                        ++n59;
                                    }
                                    final boolean b30 = true;
                                    final boolean b31 = (n62 | ((n60 != n26 && b30) ? 1 : 0)) != 0x0;
                                    long[] array22;
                                    if (b31) {
                                        array22 = new long[n60];
                                    }
                                    else {
                                        array22 = array8;
                                    }
                                    int[] array23;
                                    if (b31) {
                                        array23 = new int[n60];
                                    }
                                    else {
                                        array23 = array10;
                                    }
                                    if (b31) {
                                        max = 0;
                                    }
                                    int[] array24;
                                    if (b31) {
                                        array24 = new int[n60];
                                    }
                                    else {
                                        array24 = array9;
                                    }
                                    final long[] array25 = new long[n60];
                                    final int n69 = 0;
                                    int n70 = 0;
                                    long n71 = 0L;
                                    final int[] array26 = array24;
                                    int n72 = max;
                                    int n73 = n69;
                                    final int[] array27 = array20;
                                    final int[] array28 = array21;
                                    while (n73 < yvt2.h.length) {
                                        final long n74 = yvt2.i[n73];
                                        int n75 = array27[n73];
                                        final int n76 = array28[n73];
                                        if (b31) {
                                            final int n77 = n76 - n75;
                                            System.arraycopy(array8, n75, array22, n70, n77);
                                            System.arraycopy(array10, n75, array23, n70, n77);
                                            System.arraycopy(array9, n75, array26, n70, n77);
                                        }
                                        final int n78 = n72;
                                        int n79 = n70;
                                        int n80 = n73;
                                        int n81 = n78;
                                        while (n75 < n76) {
                                            array25[n79] = cnw.N(n71, 1000000L, yvt2.d) + cnw.N(Math.max(0L, copy4[n75] - n74), 1000000L, yvt2.c);
                                            int n82 = n81;
                                            if (b31 && array23[n79] > (n82 = n81)) {
                                                n82 = array10[n75];
                                            }
                                            ++n79;
                                            ++n75;
                                            n81 = n82;
                                        }
                                        n71 += yvt2.h[n80];
                                        ++n80;
                                        final int n83 = n81;
                                        n73 = n80;
                                        n70 = n79;
                                        n72 = n83;
                                    }
                                    fwt = new fwt(yvt2, array22, array23, n72, array25, array26, cnw.N(n71, 1000000L, yvt2.d));
                                }
                            }
                        }
                    }
                    list.add(fwt);
                }
            }
        }
        return list;
    }
    
    public static final class a
    {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final rwj f;
        public final rwj g;
        public int h;
        public int i;
        
        public a(final rwj g, final rwj f, final boolean e) throws ParserException {
            this.g = g;
            this.f = f;
            this.e = e;
            f.D(12);
            this.a = f.w();
            g.D(12);
            this.i = g.w();
            final int e2 = g.e();
            boolean b = true;
            if (e2 != 1) {
                b = false;
            }
            chw.y(b, "first_chunk must be 1");
            this.b = -1;
        }
        
        public final boolean a() {
            final int b = this.b + 1;
            this.b = b;
            if (b == this.a) {
                return false;
            }
            long d;
            if (this.e) {
                d = this.f.x();
            }
            else {
                d = this.f.u();
            }
            this.d = d;
            if (this.b == this.h) {
                this.c = this.g.w();
                this.g.E(4);
                int h;
                if (--this.i > 0) {
                    h = this.g.w() - 1;
                }
                else {
                    h = -1;
                }
                this.h = h;
            }
            return true;
        }
    }
    
    public interface b
    {
        int a();
        
        int b();
        
        int c();
    }
    
    public static final class c
    {
        public final zvt[] a;
        public n b;
        public int c;
        public int d;
        
        public c(final int n) {
            this.a = new zvt[n];
            this.d = 0;
        }
    }
}
