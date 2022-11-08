import java.util.Iterator;
import java.util.ArrayList;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import com.google.zxing.WriterException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f4a
{
    public static final int[] a;
    
    static {
        a = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1 };
    }
    
    public static srw a(final int n, final s8a s8a) throws WriterException {
        for (int i = 1; i <= 40; ++i) {
            final srw d = srw.d(i);
            final int d2 = d.d;
            final srw$b srw$b = d.c[((Enum)s8a).ordinal()];
            final int a = srw$b.a;
            final srw$a[] b = srw$b.b;
            final int length = b.length;
            int j = 0;
            int n2 = 0;
            while (j < length) {
                n2 += b[j].a;
                ++j;
            }
            if (d2 - a * n2 >= (n + 7) / 8) {
                return d;
            }
        }
        throw new WriterException("Data too big");
    }
    
    public static grl b(String a, final s8a b, final Map<w3a, ?> map) throws WriterException {
        Object o = xgh.I0;
        Object o2;
        if (map == null) {
            o2 = null;
        }
        else {
            o2 = (String)map.get(w3a.D0);
        }
        Object o3 = o2;
        if (o2 == null) {
            o3 = "ISO-8859-1";
        }
        Label_0150: {
            if (!"Shift_JIS".equals(o3)) {
                break Label_0150;
            }
            byte[] bytes;
            int length;
            int n;
            boolean b2 = false;
            Object o4 = null;
            d02 d02;
            xt3 xt3;
            d02 d3;
            int ordinal;
            int n2;
            int n3;
            int n4 = 0;
            int length4;
            int l;
            int c;
            int n5;
            int c2;
            int length5;
            int n6;
            int n7;
            int n8;
            d02 d4;
            int n9;
            int b3;
            int n10;
            int d5;
            int a2;
            int length6;
            int n11;
            int n12;
            int n13;
            int n14;
            int n16;
            int n18;
            int d6;
            int length7;
            int n19;
            int n20;
            int n21;
            int n22;
            int max;
            int max2;
            int n23;
            srw c3;
            int[] array;
            int n24;
            int n25;
            int n26;
            int n27;
            int n28;
            int n29;
            int n30;
            int n31;
            byte[] array2;
            int n32;
            int n34;
            int n36;
            int n37;
            int[] array3;
            byte[] array4;
            Iterator<y12> iterator;
            byte[] a3;
            Iterator<y12> iterator2;
            byte[] b4;
            int c4;
            l63 e;
            int n42;
            int d7;
            int n43;
            int c5;
            int c6;
            int b5;
            int c7;
            int n44;
            int n45;
            byte b6;
            byte[] array5;
            int n47;
            int n48;
            int n49;
            int b7;
            int c8;
            int n50;
            int n51;
            byte[] array6;
            int n53;
            int n54 = 0;
            boolean b8;
            int n56;
            boolean b9;
            int n57;
            boolean b10;
            int n59;
            boolean b11;
            int b12;
            int c9;
            int n60;
            int n61;
            byte[] array7;
            int n63;
            int n64;
            int n65;
            int n66;
            boolean b13;
            boolean b14;
            int n67;
            char char1;
            Label_0135:Label_0159_Outer:
            while (true) {
                try {
                    bytes = ((String)a).getBytes("Shift_JIS");
                    length = bytes.length;
                    Label_0138: {
                        if (length % 2 == 0) {
                            for (int i = 0; i < length; i += 2) {
                                n = (bytes[i] & 0xFF);
                                if (n < 129 || n > 159) {
                                    if (n < 224) {
                                        break Label_0135;
                                    }
                                    if (n > 235) {
                                        break Label_0135;
                                    }
                                }
                            }
                            b2 = true;
                            break Label_0138;
                        }
                        b2 = false;
                    }
                Label_0159:
                    while (true) {
                        Block_13_Outer:Block_14_Outer:Block_15_Outer:Block_11_Outer:
                        while (true) {
                            if (b2) {
                                o4 = xgh.K0;
                                break Label_0240;
                            }
                            Label_0238: {
                                o4 = o;
                            }
                            d02 = new d02();
                            if (o4 == o && !"ISO-8859-1".equals(o3)) {
                                xt3 = xt3.F0.get(o3);
                                if (xt3 != null) {
                                    d02.d(7, 4);
                                    d02.d(xt3.C0[0], 8);
                                }
                            }
                            d02.d(((xgh)o4).D0, 4);
                            d3 = new d02();
                            ordinal = ((Enum)o4).ordinal();
                            Label_0843: {
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        if (ordinal != 4) {
                                            if (ordinal == 6) {
                                                try {
                                                    o3 = ((String)a).getBytes("Shift_JIS");
                                                    for (int length2 = ((srw)o3).length, j = 0; j < length2; j += 2) {
                                                        n2 = ((o3[j] & 0xFF) << 8 | (o3[j + 1] & 0xFF));
                                                        Label_0455: {
                                                            if (n2 >= 33088 && n2 <= 40956) {
                                                                n3 = 33088;
                                                            }
                                                            else {
                                                                if (n2 < 57408 || n2 > 60351) {
                                                                    n4 = -1;
                                                                    break Label_0455;
                                                                }
                                                                n3 = 49472;
                                                            }
                                                            n4 = n2 - n3;
                                                        }
                                                        if (n4 == -1) {
                                                            throw new WriterException("Invalid byte sequence");
                                                        }
                                                        d3.d((n4 >> 8) * 192 + (n4 & 0xFF), 13);
                                                    }
                                                    break Label_0843;
                                                }
                                                catch (final UnsupportedEncodingException a) {
                                                    throw new WriterException((Throwable)a);
                                                }
                                            }
                                            a = (UnsupportedEncodingException)new StringBuilder();
                                            ((StringBuilder)a).append("Invalid mode: ");
                                            ((StringBuilder)a).append(o4);
                                            throw new WriterException(((StringBuilder)a).toString());
                                        }
                                        try {
                                            o3 = ((String)a).getBytes((String)o3);
                                            for (int length3 = ((srw)o3).length, k = 0; k < length3; ++k) {
                                                d3.d(o3[k], 8);
                                            }
                                            break Label_0843;
                                        }
                                        catch (final UnsupportedEncodingException a) {
                                            throw new WriterException((Throwable)a);
                                        }
                                    }
                                    length4 = ((String)a).length();
                                    l = 0;
                                    while (l < length4) {
                                        c = c(((String)a).charAt(l));
                                        if (c == -1) {
                                            throw new WriterException();
                                        }
                                        n5 = l + 1;
                                        if (n5 < length4) {
                                            c2 = c(((String)a).charAt(n5));
                                            if (c2 == -1) {
                                                throw new WriterException();
                                            }
                                            d3.d(c * 45 + c2, 11);
                                            l += 2;
                                        }
                                        else {
                                            d3.d(c, 6);
                                            l = n5;
                                        }
                                    }
                                }
                                else {
                                    length5 = ((String)a).length();
                                    n6 = 0;
                                    while (n6 < length5) {
                                        n7 = ((String)a).charAt(n6) - '0';
                                        n8 = n6 + 2;
                                        if (n8 < length5) {
                                            d3.d((((String)a).charAt(n6 + 1) - '0') * 10 + n7 * 100 + (((String)a).charAt(n8) - '0'), 10);
                                            n6 += 3;
                                        }
                                        else if (++n6 < length5) {
                                            d3.d(n7 * 10 + (((String)a).charAt(n6) - '0'), 7);
                                            n6 = n8;
                                        }
                                        else {
                                            d3.d(n7, 4);
                                        }
                                    }
                                }
                            }
                            o3 = a(((xgh)o4).b(srw.d(1)) + d02.D0 + d3.D0, b);
                            o3 = a(((xgh)o4).b((srw)o3) + d02.D0 + d3.D0, b);
                            d4 = new d02();
                            d4.c(d02);
                            if (o4 == o) {
                                n9 = d3.g();
                            }
                            else {
                                n9 = ((String)a).length();
                            }
                            b3 = ((xgh)o4).b((srw)o3);
                            n10 = 1 << b3;
                            if (n9 >= n10) {
                                a = (UnsupportedEncodingException)new StringBuilder();
                                ((StringBuilder)a).append(n9);
                                ((StringBuilder)a).append(" is bigger than ");
                                ((StringBuilder)a).append(n10 - 1);
                                throw new WriterException(((StringBuilder)a).toString());
                            }
                            d4.d(n9, b3);
                            d4.c(d3);
                            a = (UnsupportedEncodingException)((srw)o3).c[((Enum)b).ordinal()];
                            d5 = ((srw)o3).d;
                            a2 = ((srw$b)a).a;
                            o = ((srw$b)a).b;
                            length6 = ((xgh)o).length;
                            n11 = 0;
                            n12 = 0;
                            while (n11 < length6) {
                                n12 += o[n11].a;
                                ++n11;
                            }
                            n13 = d5 - a2 * n12;
                            n14 = n13 * 8;
                            if (d4.D0 > n14) {
                                a = (UnsupportedEncodingException)w48.g("data bits cannot fit in the QR Code");
                                ((StringBuilder)a).append(d4.D0);
                                ((StringBuilder)a).append(" > ");
                                ((StringBuilder)a).append(n14);
                                throw new WriterException(((StringBuilder)a).toString());
                            }
                            for (int n15 = 0; n15 < 4 && d4.D0 < n14; ++n15) {
                                d4.a(false);
                            }
                            n16 = (d4.D0 & 0x7);
                            if (n16 > 0) {
                                while (n16 < 8) {
                                    d4.a(false);
                                    ++n16;
                                }
                            }
                            for (int g = d4.g(), n17 = 0; n17 < n13 - g; ++n17) {
                                if ((n17 & 0x1) == 0x0) {
                                    n18 = 236;
                                }
                                else {
                                    n18 = 17;
                                }
                                d4.d(n18, 8);
                            }
                            if (d4.D0 != n14) {
                                throw new WriterException("Bits size does not equal capacity");
                            }
                            d6 = ((srw)o3).d;
                            a = (UnsupportedEncodingException)(Object)((srw$b)a).b;
                            length7 = a.length;
                            n19 = 0;
                            n20 = 0;
                            while (n19 < length7) {
                                n20 += a[n19].a;
                                ++n19;
                            }
                            if (d4.g() != n13) {
                                throw new WriterException("Number of bits and data bytes does not match");
                            }
                            o = new ArrayList<y12>(n20);
                            n21 = 0;
                            n22 = 0;
                            max = 0;
                            max2 = 0;
                            a = (UnsupportedEncodingException)o4;
                            n23 = d6;
                            c3 = (srw)o3;
                            while (n22 < n20) {
                                o3 = new int[] { 0 };
                                array = new int[] { 0 };
                                if (n22 >= n20) {
                                    throw new WriterException("Block ID too large");
                                }
                                n24 = n23 % n20;
                                n25 = n20 - n24;
                                n26 = n23 / n20;
                                n27 = n13 / n20;
                                n28 = n27 + 1;
                                n29 = n26 - n27;
                                n30 = n26 + 1 - n28;
                                if (n29 != n30) {
                                    throw new WriterException("EC bytes mismatch");
                                }
                                if (n20 != n25 + n24) {
                                    throw new WriterException("RS blocks mismatch");
                                }
                                if (n23 != (n28 + n30) * n24 + (n27 + n29) * n25) {
                                    throw new WriterException("Total bytes mismatch");
                                }
                                if (n22 < n25) {
                                    o3[0] = n27;
                                    array[0] = n29;
                                }
                                else {
                                    o3[0] = n28;
                                    array[0] = n30;
                                }
                                n31 = o3[0];
                                array2 = new byte[n31];
                                n32 = n21 * 8;
                                for (int n33 = 0; n33 < n31; ++n33) {
                                    n34 = 0;
                                    for (int n35 = 0; n35 < 8; ++n35, n34 = n36) {
                                        n36 = n34;
                                        if (d4.f(n32)) {
                                            n36 = (n34 | 1 << 7 - n35);
                                        }
                                        ++n32;
                                    }
                                    array2[n33 + 0] = (byte)n34;
                                }
                                n37 = array[0];
                                array3 = new int[n31 + n37];
                                for (int n38 = 0; n38 < n31; ++n38) {
                                    array3[n38] = (array2[n38] & 0xFF);
                                }
                                new mmi(r0c.l).c(array3, n37);
                                array4 = new byte[n37];
                                for (int n39 = 0; n39 < n37; ++n39) {
                                    array4[n39] = (byte)array3[n31 + n39];
                                }
                                ((ArrayList<y12>)o).add(new y12(array2, array4));
                                max = Math.max(max, n31);
                                max2 = Math.max(max2, n37);
                                n21 += o3[0];
                                ++n22;
                            }
                            if (n13 != n21) {
                                throw new WriterException("Data bytes does not match offset");
                            }
                            o3 = new d02();
                            for (int n40 = 0; n40 < max; ++n40) {
                                iterator = ((ArrayList<y12>)o).iterator();
                                while (iterator.hasNext()) {
                                    a3 = iterator.next().a;
                                    if (n40 < a3.length) {
                                        ((d02)o3).d((int)a3[n40], 8);
                                    }
                                }
                            }
                            for (int n41 = 0; n41 < max2; ++n41) {
                                iterator2 = ((ArrayList<y12>)o).iterator();
                                while (iterator2.hasNext()) {
                                    b4 = iterator2.next().b;
                                    if (n41 < b4.length) {
                                        ((d02)o3).d((int)b4[n41], 8);
                                    }
                                }
                            }
                            if (n23 == ((d02)o3).g()) {
                                o = new grl();
                                ((grl)o).b = b;
                                ((grl)o).a = (xgh)a;
                                ((grl)o).c = c3;
                                c4 = c3.c();
                                e = new l63(c4, c4);
                                n42 = Integer.MAX_VALUE;
                                d7 = -1;
                                n43 = 0;
                                a = (UnsupportedEncodingException)o3;
                                while (n43 < 8) {
                                    asy.l((d02)a, b, c3, n43, e);
                                    c5 = r9x.c(e, true);
                                    c6 = r9x.c(e, false);
                                    o3 = e.a;
                                    b5 = e.b;
                                    c7 = e.c;
                                    n44 = 0;
                                    n45 = 0;
                                    while (n44 < c7 - 1) {
                                        for (int n46 = 0; n46 < b5 - 1; n46 = n47, n45 = n48) {
                                            b6 = o3[n44][n46];
                                            array5 = o3[n44];
                                            n47 = n46 + 1;
                                            n48 = n45;
                                            if (b6 == array5[n47]) {
                                                n49 = n44 + 1;
                                                n48 = n45;
                                                if (b6 == o3[n49][n46]) {
                                                    n48 = n45;
                                                    if (b6 == o3[n49][n47]) {
                                                        n48 = n45 + 1;
                                                    }
                                                }
                                            }
                                        }
                                        ++n44;
                                    }
                                    o3 = e.a;
                                    b7 = e.b;
                                    c8 = e.c;
                                    n50 = 0;
                                    n51 = 0;
                                    while (n50 < c8) {
                                    Label_2685:
                                        for (int n52 = 0; n52 < b7; ++n52) {
                                            array6 = o3[n50];
                                            n53 = n52 + 6;
                                            Label_2417: {
                                                if (n53 < b7) {
                                                    n54 = n51;
                                                    if (array6[n52] == 1) {
                                                        n54 = n51;
                                                        if (array6[n52 + 1] == 0) {
                                                            n54 = n51;
                                                            if (array6[n52 + 2] == 1) {
                                                                n54 = n51;
                                                                if (array6[n52 + 3] == 1) {
                                                                    n54 = n51;
                                                                    if (array6[n52 + 4] == 1) {
                                                                        n54 = n51;
                                                                        if (array6[n52 + 5] == 0) {
                                                                            n54 = n51;
                                                                            if (array6[n53] == 1) {
                                                                                while (true) {
                                                                                    for (int n55 = n52 - 4; n55 < n52; ++n55) {
                                                                                        if (n55 >= 0 && n55 < array6.length && array6[n55] == 1) {
                                                                                            b8 = false;
                                                                                            Label_2404: {
                                                                                                if (!b8) {
                                                                                                    n56 = n52 + 7;
                                                                                                    while (true) {
                                                                                                        while (n56 < n52 + 11) {
                                                                                                            if (n56 >= 0 && n56 < array6.length && array6[n56] == 1) {
                                                                                                                b9 = false;
                                                                                                                n54 = n51;
                                                                                                                if (b9) {
                                                                                                                    break Label_2404;
                                                                                                                }
                                                                                                                break Label_2417;
                                                                                                            }
                                                                                                            else {
                                                                                                                ++n56;
                                                                                                            }
                                                                                                        }
                                                                                                        b9 = true;
                                                                                                        continue Block_13_Outer;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            n54 = n51 + 1;
                                                                                            break Label_2417;
                                                                                        }
                                                                                    }
                                                                                    b8 = true;
                                                                                    continue Block_13_Outer;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                else {
                                                    n54 = n51;
                                                }
                                            }
                                            n57 = n50 + 6;
                                            n51 = n54;
                                            if (n57 < c8) {
                                                n51 = n54;
                                                if (o3[n50][n52]) {
                                                    n51 = n54;
                                                    if (!o3[n50 + 1][n52]) {
                                                        n51 = n54;
                                                        if (o3[n50 + 2][n52]) {
                                                            n51 = n54;
                                                            if (o3[n50 + 3][n52]) {
                                                                n51 = n54;
                                                                if (o3[n50 + 4][n52]) {
                                                                    n51 = n54;
                                                                    if (!o3[n50 + 5][n52]) {
                                                                        n51 = n54;
                                                                        if (o3[n57][n52]) {
                                                                            while (true) {
                                                                                for (int n58 = n50 - 4; n58 < n50; ++n58) {
                                                                                    if (n58 >= 0 && n58 < ((d02)o3).length && o3[n58][n52]) {
                                                                                        b10 = false;
                                                                                        Label_2679: {
                                                                                            if (!b10) {
                                                                                                n59 = n50 + 7;
                                                                                                while (true) {
                                                                                                    while (n59 < n50 + 11) {
                                                                                                        if (n59 >= 0 && n59 < ((d02)o3).length && o3[n59][n52]) {
                                                                                                            b11 = false;
                                                                                                            n51 = n54;
                                                                                                            if (b11) {
                                                                                                                break Label_2679;
                                                                                                            }
                                                                                                            continue Label_2685;
                                                                                                        }
                                                                                                        else {
                                                                                                            ++n59;
                                                                                                        }
                                                                                                    }
                                                                                                    b11 = true;
                                                                                                    continue Block_13_Outer;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        n51 = n54 + 1;
                                                                                        continue Label_2685;
                                                                                    }
                                                                                }
                                                                                b10 = true;
                                                                                continue Block_13_Outer;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        ++n50;
                                    }
                                    o3 = e.a;
                                    b12 = e.b;
                                    c9 = e.c;
                                    n60 = 0;
                                    n61 = 0;
                                    while (n60 < c9) {
                                        array7 = o3[n60];
                                        for (int n62 = 0; n62 < b12; ++n62, n61 = n63) {
                                            n63 = n61;
                                            if (array7[n62] == 1) {
                                                n63 = n61 + 1;
                                            }
                                        }
                                        ++n60;
                                    }
                                    n64 = e.c * e.b;
                                    n65 = Math.abs(n61 * 2 - n64) * 10 / n64 * 10 + (n51 * 40 + (n45 * 3 + (c6 + c5)));
                                    if (n65 < (n66 = n42)) {
                                        n66 = n65;
                                        d7 = n43;
                                    }
                                    ++n43;
                                    n42 = n66;
                                }
                                asy.l((d02)a, b, c3, ((grl)o).d = d7, e);
                                ((grl)o).e = e;
                                return (grl)o;
                            }
                            a = (UnsupportedEncodingException)lwe.j("Interleaving error: ", n23, " and ");
                            ((StringBuilder)a).append(((d02)o3).g());
                            ((StringBuilder)a).append(" differ.");
                            throw new WriterException(((StringBuilder)a).toString());
                            Label_0208: {
                                while (true) {
                                    while (true) {
                                        while (true) {
                                            while (true) {
                                                b13 = true;
                                                break Label_0208;
                                                b14 = true;
                                                break Label_0208;
                                                o4 = xgh.G0;
                                                continue Block_13_Outer;
                                                char1 = ((String)a).charAt(n67);
                                                iftrue(Label_0196:)(char1 < '0' || char1 > '9');
                                                continue Block_14_Outer;
                                            }
                                            Label_0196:
                                            iftrue(Label_0238:)(c(char1) == -1);
                                            continue Block_15_Outer;
                                        }
                                        Label_0214:
                                        iftrue(Label_0226:)(!b14);
                                        continue Block_11_Outer;
                                    }
                                    iftrue(Label_0214:)(n67 >= ((String)a).length());
                                    continue Label_0159_Outer;
                                }
                            }
                            ++n67;
                            continue Label_0159;
                            Label_0226:
                            iftrue(Label_0238:)(!b13);
                            o4 = xgh.F0;
                            continue Block_13_Outer;
                        }
                        n67 = 0;
                        b14 = false;
                        b13 = false;
                        continue Label_0159;
                    }
                }
                catch (final UnsupportedEncodingException ex) {
                    continue Label_0135;
                }
                break;
            }
        }
    }
    
    public static int c(final int n) {
        final int[] a = f4a.a;
        if (n < 96) {
            return a[n];
        }
        return -1;
    }
}
