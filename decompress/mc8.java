import java.util.List;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.FormatException;
import com.google.zxing.ChecksumException;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mc8
{
    public final w6m a;
    
    public mc8() {
        this.a = new w6m(r0c.l);
    }
    
    public final qc8 a(f02 ex, Map<gc8, ?> b) throws FormatException, ChecksumException {
        final g02 g02 = new g02((f02)ex);
        ChecksumException ex2 = null;
        try {
            return this.b(g02, (Map<gc8, ?>)b);
        }
        catch (final ChecksumException ex2) {
            ex = null;
        }
        catch (final FormatException ex) {
            ex2 = null;
        }
        try {
            g02.e();
            g02.b = null;
            g02.c = null;
            g02.d = true;
            g02.d();
            g02.c();
            g02.b();
            b = this.b(g02, (Map<gc8, ?>)b);
            b.e = new jrl();
            return b;
        }
        catch (final ChecksumException b) {}
        catch (final FormatException ex3) {}
        if (ex != null) {
            throw ex;
        }
        if (ex2 != null) {
            throw ex2;
        }
        throw b;
    }
    
    public final qc8 b(final g02 g02, final Map<gc8, ?> map) throws FormatException, ChecksumException {
        final srw d = g02.d();
        final s8a a = g02.c().a;
        final nmb c = g02.c();
        final srw d2 = g02.d();
        final byte b = c.b;
        if (b < 0 || b > 7) {
            throw new IllegalArgumentException();
        }
        final u78 u78 = u78.a[b];
        final f02 a2 = g02.a;
        final int d3 = a2.D0;
        u78.b(a2, d3);
        final int c2 = d2.c();
        final f02 f02 = new f02(c2, c2);
        f02.e(0, 0, 9, 9);
        final int n = c2 - 8;
        f02.e(n, 0, 8, 9);
        f02.e(0, n, 9, 8);
        for (int length = d2.b.length, i = 0; i < length; ++i) {
            final int n2 = d2.b[i];
            for (int j = 0; j < length; ++j) {
                if (i != 0 || (j != 0 && j != length - 1)) {
                    if (i != length - 1 || j != 0) {
                        f02.e(d2.b[j] - 2, n2 - 2, 5, 5);
                    }
                }
            }
        }
        final int n3 = c2 - 17;
        f02.e(6, 9, 1, n3);
        f02.e(9, 6, n3, 1);
        if (d2.a > 6) {
            final int n4 = c2 - 11;
            f02.e(n4, 0, 3, 6);
            f02.e(0, n4, 6, 3);
        }
        final int d4 = d2.d;
        final byte[] array = new byte[d4];
        int k;
        final int n5 = k = d3 - 1;
        int n6 = 0;
        int n7 = 1;
        int n8 = 0;
        int n9 = 0;
        while (k > 0) {
            int n10;
            if ((n10 = k) == 6) {
                n10 = k - 1;
            }
            int n11 = 0;
            while (true) {
                int l = 0;
                if (n11 >= d3) {
                    break;
                }
                int n12;
                int n13;
                if (n7 != 0) {
                    n12 = n5 - n11;
                    n13 = n8;
                }
                else {
                    n12 = n11;
                    n13 = n8;
                }
                while (l < 2) {
                    final int n14 = n10 - l;
                    int n16;
                    int n17;
                    if (!f02.c(n14, n12)) {
                        ++n13;
                        int n15 = n9 << 1;
                        if (g02.a.c(n14, n12)) {
                            n15 |= 0x1;
                        }
                        if (n13 == 8) {
                            array[n6] = (byte)n15;
                            ++n6;
                            n16 = 0;
                            n17 = 0;
                        }
                        else {
                            n17 = n15;
                            n16 = n13;
                        }
                    }
                    else {
                        n17 = n9;
                        n16 = n13;
                    }
                    ++l;
                    n13 = n16;
                    n9 = n17;
                }
                ++n11;
                n8 = n13;
            }
            n7 ^= 0x1;
            k = n10 - 2;
        }
        if (n6 == d2.d) {
            if (d4 == d.d) {
                final srw$b srw$b = d.c[((Enum)a).ordinal()];
                final srw$a[] b2 = srw$b.b;
                final int length2 = b2.length;
                int n18 = 0;
                int n19 = 0;
                while (n18 < length2) {
                    n19 += b2[n18].a;
                    ++n18;
                }
                final e78[] array2 = new e78[n19];
                final int length3 = b2.length;
                int n20 = 0;
                int n21 = 0;
                while (n20 < length3) {
                    final srw$a srw$a = b2[n20];
                    for (int n22 = 0; n22 < srw$a.a; ++n22, ++n21) {
                        final int b3 = srw$a.b;
                        array2[n21] = new e78(b3, new byte[srw$b.a + b3]);
                    }
                    ++n20;
                }
                int length4;
                int n23;
                for (length4 = array2[0].b.length, n23 = n19 - 1; n23 >= 0 && array2[n23].b.length != length4; --n23) {}
                final int n24 = n23 + 1;
                final int n25 = length4 - srw$b.a;
                int n26 = 0;
                for (int n27 = 0; n27 < n25; ++n27) {
                    for (int n28 = 0; n28 < n21; ++n28, ++n26) {
                        array2[n28].b[n27] = array[n26];
                    }
                }
                int n29;
                int n30;
                for (n29 = n24, n30 = n26; n29 < n21; ++n29, ++n30) {
                    array2[n29].b[n25] = array[n30];
                }
                for (int length5 = array2[0].b.length, n31 = n25; n31 < length5; ++n31) {
                    for (int n32 = 0; n32 < n21; ++n32, ++n30) {
                        int n33;
                        if (n32 < n24) {
                            n33 = n31;
                        }
                        else {
                            n33 = n31 + 1;
                        }
                        array2[n32].b[n33] = array[n30];
                    }
                }
                int n34 = 0;
                int n35 = 0;
                while (n34 < n19) {
                    n35 += array2[n34].a;
                    ++n34;
                }
                final byte[] array3 = new byte[n35];
                int n36 = 0;
                int n37 = 0;
                while (n36 < n19) {
                    final e78 e78 = array2[n36];
                    final byte[] b4 = e78.b;
                    final int a3 = e78.a;
                    final int length6 = b4.length;
                    final int[] array4 = new int[length6];
                    for (int n38 = 0; n38 < length6; ++n38) {
                        array4[n38] = (b4[n38] & 0xFF);
                    }
                    final int length7 = b4.length;
                    try {
                        this.a.a(array4, length7 - a3);
                        for (int n39 = 0; n39 < a3; ++n39) {
                            b4[n39] = (byte)array4[n39];
                        }
                        for (int n40 = 0; n40 < a3; ++n40, ++n37) {
                            array3[n37] = b4[n40];
                        }
                        ++n36;
                        continue;
                    }
                    catch (final ReedSolomonException ex) {
                        throw ChecksumException.a();
                    }
                    break;
                }
                final xgh n41 = xgh.N0;
                final xgh m0 = xgh.M0;
                final xgh k2 = xgh.K0;
                final xgh j2 = xgh.J0;
                final xgh l2 = xgh.L0;
                final xgh i2 = xgh.I0;
                final xgh h0 = xgh.H0;
                final xgh g3 = xgh.G0;
                final xgh f3 = xgh.F0;
                final xgh e79 = xgh.E0;
                final c79 c3 = new c79(array3);
                final StringBuilder sb = new StringBuilder(50);
                final ArrayList list = new ArrayList(1);
                int n42 = -1;
                boolean b5 = false;
                int n43 = -1;
                xt3 xt3 = null;
                try {
                    while (true) {
                        xgh xgh = null;
                        Label_1394: {
                            if (c3.a() >= 4) {
                                final int c4 = c3.c(4);
                                if (c4 != 0) {
                                    if (c4 == 1) {
                                        xgh = f3;
                                        break Label_1394;
                                    }
                                    if (c4 == 2) {
                                        xgh = g3;
                                        break Label_1394;
                                    }
                                    if (c4 == 3) {
                                        xgh = h0;
                                        break Label_1394;
                                    }
                                    if (c4 == 4) {
                                        xgh = i2;
                                        break Label_1394;
                                    }
                                    if (c4 == 5) {
                                        xgh = l2;
                                        break Label_1394;
                                    }
                                    if (c4 == 7) {
                                        xgh = j2;
                                        break Label_1394;
                                    }
                                    if (c4 == 8) {
                                        xgh = k2;
                                        break Label_1394;
                                    }
                                    if (c4 == 9) {
                                        xgh = m0;
                                        break Label_1394;
                                    }
                                    if (c4 == 13) {
                                        xgh = n41;
                                        break Label_1394;
                                    }
                                    throw new IllegalArgumentException();
                                }
                            }
                            xgh = e79;
                        }
                        Label_1600: {
                            if (xgh != e79) {
                                if (xgh != l2 && xgh != m0) {
                                    int c5;
                                    int c6;
                                    if (xgh == h0) {
                                        if (c3.a() < 16) {
                                            throw FormatException.a();
                                        }
                                        c5 = c3.c(8);
                                        c6 = c3.c(8);
                                    }
                                    else if (xgh == j2) {
                                        final int c7 = c3.c(8);
                                        int n44;
                                        if ((c7 & 0x80) == 0x0) {
                                            n44 = (c7 & 0x7F);
                                        }
                                        else if ((c7 & 0xC0) == 0x80) {
                                            n44 = ((c7 & 0x3F) << 8 | c3.c(8));
                                        }
                                        else {
                                            if ((c7 & 0xE0) != 0xC0) {
                                                throw FormatException.a();
                                            }
                                            n44 = ((c7 & 0x1F) << 16 | c3.c(16));
                                        }
                                        final HashMap e80 = xt3.E0;
                                        if (n44 < 0 || n44 >= 900) {
                                            throw FormatException.a();
                                        }
                                        xt3 = (xt3)xt3.E0.get(n44);
                                        if (xt3 != null) {
                                            break Label_1600;
                                        }
                                        throw FormatException.a();
                                    }
                                    else if (xgh == n41) {
                                        final int c8 = c3.c(4);
                                        final int c9 = c3.c(xgh.b(d));
                                        c5 = n42;
                                        c6 = n43;
                                        if (c8 == 1) {
                                            jc8.c(c3, sb, c9);
                                            c5 = n42;
                                            c6 = n43;
                                        }
                                    }
                                    else {
                                        final int c10 = c3.c(xgh.b(d));
                                        if (xgh == f3) {
                                            jc8.e(c3, sb, c10);
                                            c5 = n42;
                                            c6 = n43;
                                        }
                                        else if (xgh == g3) {
                                            jc8.a(c3, sb, c10, b5);
                                            c5 = n42;
                                            c6 = n43;
                                        }
                                        else if (xgh == i2) {
                                            jc8.b(c3, sb, c10, xt3, (Collection)list, (Map)map);
                                            c5 = n42;
                                            c6 = n43;
                                        }
                                        else {
                                            if (xgh == k2) {
                                                jc8.d(c3, sb, c10);
                                                break Label_1600;
                                            }
                                            throw FormatException.a();
                                        }
                                    }
                                    n42 = c5;
                                    n43 = c6;
                                }
                                else {
                                    b5 = true;
                                }
                            }
                        }
                        if (xgh == e79) {
                            final String string = sb.toString();
                            List list2;
                            if (list.isEmpty()) {
                                list2 = null;
                            }
                            else {
                                list2 = list;
                            }
                            return new qc8(array3, string, list2, a.toString(), n42, n43);
                        }
                    }
                }
                catch (final IllegalArgumentException ex2) {
                    throw FormatException.a();
                }
            }
            throw new IllegalArgumentException();
        }
        throw FormatException.a();
    }
}
