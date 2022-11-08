import com.google.zxing.ChecksumException;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.zxing.FormatException;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import com.google.zxing.NotFoundException;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qrl
{
    public static final esm[] b;
    public final mc8 a;
    
    static {
        b = new esm[0];
    }
    
    public qrl() {
        this.a = new mc8();
    }
    
    public final urm a(final cy1 cy1, final Map<gc8, ?> map) throws NotFoundException, ChecksumException, FormatException {
        Label_3618: {
            qt8 qt8;
            t0b t0b4;
            t0b t0b5;
            t0b t0b6;
            float n49;
            int n56;
            if (map != null && map.containsKey(gc8.C0)) {
                final f02 a = cy1.a();
                int n = 0;
                int[] f0;
                while (true) {
                    f0 = a.F0;
                    if (n >= f0.length || f0[n] != 0) {
                        break;
                    }
                    ++n;
                }
                int[] array;
                if (n == f0.length) {
                    array = null;
                }
                else {
                    final int e0 = a.E0;
                    final int n2 = n / e0;
                    int n3;
                    int n4;
                    for (n3 = f0[n], n4 = 0; n3 << 31 - n4 == 0; ++n4) {}
                    array = new int[] { n % e0 * 32 + n4, n2 };
                }
                int n5;
                for (n5 = a.F0.length - 1; n5 >= 0 && a.F0[n5] == 0; --n5) {}
                int[] array2;
                if (n5 < 0) {
                    array2 = null;
                }
                else {
                    final int e2 = a.E0;
                    final int n6 = n5 / e2;
                    int n7;
                    int n8;
                    for (n7 = a.F0[n5], n8 = 31; n7 >>> n8 == 0; --n8) {}
                    array2 = new int[] { n5 % e2 * 32 + n8, n6 };
                }
                if (array == null || array2 == null) {
                    throw NotFoundException.E0;
                }
                final int d0 = a.D0;
                final int c0 = a.C0;
                int n9 = array[0];
                int n10 = array[1];
                int n11 = 1;
                int n12 = 0;
                while (n9 < c0 && n10 < d0) {
                    int n13 = n11;
                    int n14 = n12;
                    if (n11 != (a.c(n9, n10) ? 1 : 0)) {
                        n14 = n12 + 1;
                        if (n14 == 5) {
                            break;
                        }
                        n13 = (n11 ^ 0x1);
                    }
                    ++n9;
                    ++n10;
                    n11 = n13;
                    n12 = n14;
                }
                if (n9 == c0 || n10 == d0) {
                    throw NotFoundException.E0;
                }
                final float n15 = (n9 - array[0]) / 7.0f;
                final int n16 = array[1];
                final int n17 = array2[1];
                final int n18 = array[0];
                final int n19 = array2[0];
                if (n18 >= n19 || n16 >= n17) {
                    throw NotFoundException.E0;
                }
                final int n20 = n17 - n16;
                int n21 = n19;
                if (n20 != n19 - n18) {
                    n21 = n18 + n20;
                }
                final int round = Math.round((n21 - n18 + 1) / n15);
                final int round2 = Math.round((n20 + 1) / n15);
                if (round <= 0 || round2 <= 0) {
                    throw NotFoundException.E0;
                }
                if (round2 == round) {
                    final int n22 = (int)(n15 / 2.0f);
                    final int n23 = n16 + n22;
                    final int n24 = n18 + n22;
                    final int n25 = (int)((round - 1) * n15) + n24 - n21;
                    int n26 = n24;
                    if (n25 > 0) {
                        if (n25 > n22) {
                            throw NotFoundException.E0;
                        }
                        n26 = n24 - n25;
                    }
                    final int n27 = (int)((round2 - 1) * n15) + n23 - n17;
                    int n28 = n23;
                    if (n27 > 0) {
                        if (n27 > n22) {
                            throw NotFoundException.E0;
                        }
                        n28 = n23 - n27;
                    }
                    final f02 f2 = new f02(round, round2);
                    for (int i = 0; i < round2; ++i) {
                        final int n29 = (int)(i * n15);
                        for (int j = 0; j < round; ++j) {
                            if (a.c((int)(j * n15) + n26, n29 + n28)) {
                                f2.d(j, i);
                            }
                        }
                    }
                    final qc8 a2 = this.a.a(f2, map);
                    final esm[] b = qrl.b;
                    break Label_3618;
                }
                throw NotFoundException.E0;
            }
            else {
                final f02 a3 = cy1.a();
                qt8 = new qt8(a3);
                fsm b2;
                if (map == null) {
                    b2 = null;
                }
                else {
                    b2 = map.get(gc8.F0);
                }
                qt8.b = b2;
                final u0b u0b = new u0b(a3, b2);
                final boolean b3 = map != null && map.containsKey(gc8.D0);
                final boolean b4 = map != null && map.containsKey(gc8.C0);
                final int d2 = a3.D0;
                final int c2 = a3.C0;
                int n30 = d2 * 3 / 228;
                if (n30 < 3 || b3) {
                    n30 = 3;
                }
                final int[] array3 = new int[5];
                int n39;
                int n40;
                for (int n31 = n30 - 1, e3 = 0; n31 < d2 && e3 == 0; n31 += n39, n30 = n39, e3 = n40) {
                    array3[0] = 0;
                    array3[2] = (array3[1] = 0);
                    array3[4] = (array3[3] = 0);
                    int k = 0;
                    int n32 = 0;
                    while (k < c2) {
                        int n34 = 0;
                        Label_1357: {
                            if (u0b.a.c(k, n31)) {
                                int n33 = n32;
                                if ((n32 & 0x1) == 0x1) {
                                    n33 = n32 + 1;
                                }
                                ++array3[n33];
                                n34 = k;
                                n32 = n33;
                            }
                            else if ((n32 & 0x1) == 0x0) {
                                if (n32 == 4) {
                                    if (u0b.b(array3)) {
                                        if (u0b.d(array3, n31, k, b4)) {
                                            int e4;
                                            int n35;
                                            int n36;
                                            if (u0b.c) {
                                                e4 = (u0b.e() ? 1 : 0);
                                                n35 = k;
                                                n36 = n31;
                                            }
                                            else {
                                                int n37 = 0;
                                                Label_1143: {
                                                    if (u0b.b.size() > 1) {
                                                        final Iterator iterator = u0b.b.iterator();
                                                        Object o = null;
                                                        while (iterator.hasNext()) {
                                                            final t0b t0b = (t0b)iterator.next();
                                                            if (t0b.d >= 2) {
                                                                if (o != null) {
                                                                    u0b.c = true;
                                                                    n37 = (int)(Math.abs(((esm)o).a - ((esm)t0b).a) - Math.abs(((esm)o).b - ((esm)t0b).b)) / 2;
                                                                    break Label_1143;
                                                                }
                                                                o = t0b;
                                                            }
                                                        }
                                                    }
                                                    n37 = 0;
                                                }
                                                n35 = k;
                                                n36 = n31;
                                                e4 = e3;
                                                if (n37 > array3[2]) {
                                                    n36 = n31 + (n37 - array3[2] - 2);
                                                    n35 = c2 - 1;
                                                    e4 = e3;
                                                }
                                            }
                                            array3[0] = 0;
                                            array3[2] = (array3[1] = 0);
                                            array3[4] = (array3[3] = 0);
                                            final int n38 = 0;
                                            n30 = 2;
                                            n34 = n35;
                                            n32 = n38;
                                            n31 = n36;
                                            e3 = e4;
                                            break Label_1357;
                                        }
                                        array3[0] = array3[2];
                                        array3[1] = array3[3];
                                        array3[2] = array3[4];
                                        array3[3] = 1;
                                        array3[4] = 0;
                                    }
                                    else {
                                        array3[0] = array3[2];
                                        array3[1] = array3[3];
                                        array3[2] = array3[4];
                                        array3[3] = 1;
                                        array3[4] = 0;
                                    }
                                    n32 = 3;
                                    n34 = k;
                                }
                                else {
                                    ++n32;
                                    ++array3[n32];
                                    n34 = k;
                                }
                            }
                            else {
                                ++array3[n32];
                                n34 = k;
                            }
                        }
                        k = n34 + 1;
                    }
                    n39 = n30;
                    n40 = e3;
                    if (u0b.b(array3)) {
                        n39 = n30;
                        n40 = e3;
                        if (u0b.d(array3, n31, c2, b4)) {
                            n39 = array3[0];
                            if (u0b.c) {
                                e3 = (u0b.e() ? 1 : 0);
                            }
                            n40 = e3;
                        }
                    }
                }
                final int size = u0b.b.size();
                if (size < 3) {
                    throw NotFoundException.E0;
                }
                if (size > 3) {
                    final Iterator iterator2 = u0b.b.iterator();
                    float n41 = 0.0f;
                    float n42 = 0.0f;
                    while (iterator2.hasNext()) {
                        final float c3 = ((t0b)iterator2.next()).c;
                        n41 += c3;
                        n42 += c3 * c3;
                    }
                    final float n43 = (float)size;
                    final float n44 = n41 / n43;
                    final float n45 = (float)Math.sqrt(n42 / n43 - n44 * n44);
                    Collections.sort((List<Object>)u0b.b, (Comparator<? super Object>)new u0b$b(n44));
                    final float max = Math.max(0.2f * n44, n45);
                    int n47;
                    for (int n46 = 0; n46 < u0b.b.size() && u0b.b.size() > 3; n46 = n47 + 1) {
                        n47 = n46;
                        if (Math.abs(((t0b)u0b.b.get(n46)).c - n44) > max) {
                            u0b.b.remove(n46);
                            n47 = n46 - 1;
                        }
                    }
                }
                if (u0b.b.size() > 3) {
                    final Iterator iterator3 = u0b.b.iterator();
                    float n48 = 0.0f;
                    while (iterator3.hasNext()) {
                        n48 += ((t0b)iterator3.next()).c;
                    }
                    Collections.sort((List<Object>)u0b.b, (Comparator<? super Object>)new u0b$a(n48 / u0b.b.size()));
                    final ArrayList b5 = u0b.b;
                    b5.subList(3, b5.size()).clear();
                }
                final t0b[] array4 = { u0b.b.get(0), u0b.b.get(1), u0b.b.get(2) };
                final float a4 = esm.a((esm)array4[0], (esm)array4[1]);
                final float a5 = esm.a((esm)array4[1], (esm)array4[2]);
                final float a6 = esm.a((esm)array4[0], (esm)array4[2]);
                t0b t0b2;
                t0b t0b3;
                Object o2;
                if (a5 >= a4 && a5 >= a6) {
                    t0b2 = array4[0];
                    t0b3 = array4[1];
                    o2 = array4[2];
                }
                else if (a6 >= a5 && a6 >= a4) {
                    t0b2 = array4[1];
                    t0b3 = array4[0];
                    o2 = array4[2];
                }
                else {
                    t0b2 = array4[2];
                    t0b3 = array4[0];
                    o2 = array4[1];
                }
                final float a7 = ((esm)t0b2).a;
                final float b6 = ((esm)t0b2).b;
                Object o3;
                if ((((esm)t0b3).b - b6) * (((esm)o2).a - a7) - (((esm)t0b3).a - a7) * (((esm)o2).b - b6) < 0.0f) {
                    o3 = o2;
                    o2 = t0b3;
                }
                else {
                    o3 = t0b3;
                }
                array4[0] = (t0b)o3;
                array4[1] = t0b2;
                array4[2] = (t0b)o2;
                final img img = new img(array4);
                t0b4 = (t0b)img.D0;
                t0b5 = (t0b)img.E0;
                t0b6 = (t0b)img.C0;
                n49 = (qt8.a((esm)t0b4, (esm)t0b6) + qt8.a((esm)t0b4, (esm)t0b5)) / 2.0f;
                if (n49 < 1.0f) {
                    throw NotFoundException.E0;
                }
                final float n50 = esm.a((esm)t0b4, (esm)t0b5) / n49;
                final float n51 = -0.5f;
                float n52;
                if (n50 < 0.0f) {
                    n52 = -0.5f;
                }
                else {
                    n52 = 0.5f;
                }
                final int n53 = (int)(n50 + n52);
                final float n54 = esm.a((esm)t0b4, (esm)t0b6) / n49;
                float n55;
                if (n54 < 0.0f) {
                    n55 = n51;
                }
                else {
                    n55 = 0.5f;
                }
                n56 = (n53 + (int)(n54 + n55)) / 2 + 7;
                final int n57 = n56 & 0x3;
                if (n57 != 0) {
                    if (n57 != 2) {
                        if (n57 == 3) {
                            throw NotFoundException.E0;
                        }
                    }
                    else {
                        --n56;
                    }
                }
                else {
                    ++n56;
                }
                final int[] e5 = srw.e;
                if (n56 % 4 != 1) {
                    throw FormatException.a();
                }
            }
            try {
                final srw d3 = srw.d((n56 - 17) / 4);
                final int c4 = d3.c();
                Object b10 = null;
                Label_2403: {
                    if (d3.b.length > 0) {
                        final float a8 = ((esm)t0b5).a;
                        final float a9 = ((esm)t0b4).a;
                        final float a10 = ((esm)t0b6).a;
                        final float b7 = ((esm)t0b5).b;
                        final float b8 = ((esm)t0b4).b;
                        final float b9 = ((esm)t0b6).b;
                        final float n58 = 1.0f - 3.0f / (c4 - 7);
                        final int n59 = (int)xk0.d(a8 - a9 + a10, a9, n58, a9);
                        final int n60 = (int)xk0.d(b7 - b8 + b9, b8, n58, b8);
                        int l = 4;
                        while (l <= 16) {
                            final float n61 = (float)l;
                            try {
                                b10 = qt8.b(n49, n59, n60, n61);
                                break Label_2403;
                            }
                            catch (final NotFoundException ex) {
                                l <<= 1;
                                continue;
                            }
                            break;
                        }
                    }
                    b10 = null;
                }
                final float n62 = n56 - 3.5f;
                float a11;
                float b11;
                float n63;
                if (b10 != null) {
                    a11 = ((esm)b10).a;
                    b11 = ((esm)b10).b;
                    n63 = n62 - 3.0f;
                }
                else {
                    a11 = ((esm)t0b5).a - ((esm)t0b4).a + ((esm)t0b6).a;
                    b11 = ((esm)t0b5).b - ((esm)t0b4).b + ((esm)t0b6).b;
                    n63 = n62;
                }
                final float a12 = ((esm)t0b4).a;
                final float b12 = ((esm)t0b4).b;
                final float a13 = ((esm)t0b5).a;
                final float b13 = ((esm)t0b5).b;
                final float a14 = ((esm)t0b6).a;
                final float b14 = ((esm)t0b6).b;
                final ta3 c5 = ta3.c(3.5f, 3.5f, n62, 3.5f, n63, n63, 3.5f, n62);
                final float e6 = c5.e;
                final float m = c5.i;
                final float f3 = c5.f;
                final float h = c5.h;
                final float n64 = e6 * m - f3 * h;
                final float g = c5.g;
                final float d4 = c5.d;
                final float n65 = f3 * g - d4 * m;
                final float n66 = d4 * h - e6 * g;
                final float c6 = c5.c;
                final float b15 = c5.b;
                final float n67 = c6 * h - b15 * m;
                final float a15 = c5.a;
                final float n68 = m * a15 - c6 * g;
                final float n69 = g * b15 - h * a15;
                final float n70 = b15 * f3 - c6 * e6;
                final float n71 = c6 * d4 - f3 * a15;
                final float n72 = a15 * e6 - b15 * d4;
                final ta3 c7 = ta3.c(a12, b12, a13, b13, a11, b11, a14, b14);
                final float a16 = c7.a;
                final float d5 = c7.d;
                final float g2 = c7.g;
                final float n73 = g2 * n72 + (d5 * n69 + a16 * n66);
                final float b16 = c7.b;
                final float e7 = c7.e;
                final float h2 = c7.h;
                final float n74 = h2 * n72 + (e7 * n69 + b16 * n66);
                final float c8 = c7.c;
                final float f4 = c7.f;
                final float i2 = c7.i;
                final float n75 = n71 * i2 + (n68 * f4 + n65 * c8);
                final float n76 = i2 * n72 + (f4 * n69 + c8 * n66);
                final f02 a17 = qt8.a;
                if (n56 > 0 && n56 > 0) {
                    final f02 f5 = new f02(n56, n56);
                    final int n77 = n56 * 2;
                    final float[] array5 = new float[n77];
                    for (int n78 = 0; n78 < n56; ++n78) {
                        final float n79 = (float)n78;
                        for (int n80 = 0; n80 < n77; n80 += 2) {
                            array5[n80] = n80 / 2 + 0.5f;
                            array5[n80 + 1] = n79 + 0.5f;
                        }
                        for (int n81 = 0; n81 < n77; n81 += 2) {
                            final float n82 = array5[n81];
                            final int n83 = n81 + 1;
                            final float n84 = array5[n83];
                            final float n85 = n75 * n84 + (n70 * i2 + (n67 * f4 + n64 * c8)) * n82 + n76;
                            array5[n81] = ((g2 * n71 + (d5 * n68 + a16 * n65)) * n84 + (g2 * n70 + (d5 * n67 + a16 * n64)) * n82 + n73) / n85;
                            array5[n83] = (n84 * (h2 * n71 + (e7 * n68 + b16 * n65)) + n82 * (h2 * n70 + (e7 * n67 + b16 * n64)) + n74) / n85;
                        }
                        final int c9 = a17.C0;
                        final int d6 = a17.D0;
                        for (int n86 = 0, n87 = 1; n86 < n77 && n87 != 0; n86 += 2) {
                            final int n88 = (int)array5[n86];
                            final int n89 = n86 + 1;
                            final int n90 = (int)array5[n89];
                            if (n88 < -1 || n88 > c9 || n90 < -1 || n90 > d6) {
                                throw NotFoundException.E0;
                            }
                            float n91 = 0.0f;
                            Label_3278: {
                                if (n88 == -1) {
                                    array5[n86] = 0.0f;
                                }
                                else {
                                    n91 = 0.0f;
                                    if (n88 != c9) {
                                        n87 = 0;
                                        break Label_3278;
                                    }
                                    array5[n86] = (float)(c9 - 1);
                                }
                                n91 = 0.0f;
                                n87 = 1;
                            }
                            if (n90 == -1) {
                                array5[n89] = n91;
                            }
                            else {
                                if (n90 != d6) {
                                    continue;
                                }
                                array5[n89] = (float)(d6 - 1);
                            }
                            n87 = 1;
                        }
                        for (int n92 = n77 - 2, n93 = 1; n92 >= 0 && n93 != 0; n92 -= 2) {
                            final int n94 = (int)array5[n92];
                            final int n95 = n92 + 1;
                            final int n96 = (int)array5[n95];
                            if (n94 < -1 || n94 > c9 || n96 < -1 || n96 > d6) {
                                throw NotFoundException.E0;
                            }
                            float n97 = 0.0f;
                            Label_3438: {
                                if (n94 == -1) {
                                    array5[n92] = 0.0f;
                                }
                                else {
                                    n97 = 0.0f;
                                    if (n94 != c9) {
                                        n93 = 0;
                                        break Label_3438;
                                    }
                                    array5[n92] = (float)(c9 - 1);
                                }
                                n97 = 0.0f;
                                n93 = 1;
                            }
                            if (n96 == -1) {
                                array5[n95] = n97;
                            }
                            else {
                                if (n96 != d6) {
                                    continue;
                                }
                                array5[n95] = (float)(d6 - 1);
                            }
                            n93 = 1;
                        }
                        int n98 = 0;
                        while (n98 < n77) {
                            try {
                                if (a17.c((int)array5[n98], (int)array5[n98 + 1])) {
                                    f5.d(n98 / 2, n78);
                                }
                                n98 += 2;
                                continue;
                            }
                            catch (final ArrayIndexOutOfBoundsException ex2) {
                                throw NotFoundException.E0;
                            }
                            break;
                        }
                    }
                    esm[] array6;
                    if (b10 == null) {
                        array6 = new esm[] { (esm)t0b6, (esm)t0b4, (esm)t0b5 };
                    }
                    else {
                        array6 = new esm[] { (esm)t0b6, (esm)t0b4, (esm)t0b5, (esm)b10 };
                    }
                    final qc8 a18 = this.a.a(f5, map);
                    final esm[] b = array6;
                    final qc8 a2 = a18;
                    final Object e8 = a2.e;
                    if (e8 instanceof jrl && ((jrl)e8).a) {
                        if (b.length >= 3) {
                            final esm esm = b[0];
                            b[0] = b[2];
                            b[2] = esm;
                        }
                    }
                    final urm urm = new urm(a2.b);
                    final List c10 = a2.c;
                    if (c10 != null) {
                        urm.a(dsm.C0, (Object)c10);
                    }
                    final String d7 = a2.d;
                    if (d7 != null) {
                        urm.a(dsm.D0, (Object)d7);
                    }
                    if (a2.f >= 0 && a2.g >= 0) {
                        urm.a(dsm.E0, (Object)a2.g);
                        urm.a(dsm.F0, (Object)a2.f);
                    }
                    return urm;
                }
                throw NotFoundException.E0;
            }
            catch (final IllegalArgumentException ex3) {
                throw FormatException.a();
            }
        }
        throw FormatException.a();
    }
}
