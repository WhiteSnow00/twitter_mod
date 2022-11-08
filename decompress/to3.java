import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class to3
{
    public static void a(final ij6 ij6, final pdf pdf, final ArrayList<hj6> list, final int n) {
        hj6$a e0 = hj6$a.E0;
        int n2;
        uo3[] array;
        int n3;
        if (n == 0) {
            n2 = ij6.D0;
            array = ij6.G0;
            n3 = 0;
        }
        else {
            n2 = ij6.E0;
            array = ij6.F0;
            n3 = 2;
        }
        int n9 = 0;
        int n38;
        for (int i = 0; i < n2; n2 = n9, i = n38) {
            final uo3 uo3 = array[i];
            final boolean q = uo3.q;
            final ukq ukq = null;
            if (!q) {
                final int n4 = uo3.l * 2;
                hj6 a;
                hj6 hj6 = a = uo3.a;
                int j = 0;
                while (j == 0) {
                    ++uo3.i;
                    final hj6[] p4 = hj6.p0;
                    final int l = uo3.l;
                    p4[l] = null;
                    hj6.o0[l] = null;
                    if (hj6.i0 != 8) {
                        if (hj6.p(l) != e0) {
                            final int k = uo3.l;
                        }
                        hj6.R[n4].e();
                        final yi6[] r = hj6.R;
                        final int n5 = n4 + 1;
                        r[n5].e();
                        hj6.R[n4].e();
                        hj6.R[n5].e();
                        if (uo3.b == null) {
                            uo3.b = hj6;
                        }
                        uo3.d = hj6;
                        final hj6$a[] u = hj6.U;
                        final int m = uo3.l;
                        if (u[m] == e0) {
                            final int[] t = hj6.t;
                            if (t[m] == 0 || t[m] == 3 || t[m] == 2) {
                                ++uo3.j;
                                final float[] n6 = hj6.n0;
                                final float n7 = n6[m];
                                if (n7 > 0.0f) {
                                    uo3.k += n6[m];
                                }
                                if (hj6.i0 != 8 && u[m] == e0 && (t[m] == 0 || t[m] == 3)) {
                                    if (n7 < 0.0f) {
                                        uo3.n = true;
                                    }
                                    else {
                                        uo3.o = true;
                                    }
                                    if (uo3.h == null) {
                                        uo3.h = new ArrayList();
                                    }
                                    uo3.h.add(hj6);
                                }
                                if (uo3.f == null) {
                                    uo3.f = hj6;
                                }
                                final hj6 g = uo3.g;
                                if (g != null) {
                                    g.o0[uo3.l] = hj6;
                                }
                                uo3.g = hj6;
                            }
                        }
                    }
                    if (a != hj6) {
                        a.p0[uo3.l] = hj6;
                    }
                    final yi6 f = hj6.R[n4 + 1].f;
                    hj6 d = null;
                    Label_0612: {
                        if (f != null) {
                            d = f.d;
                            final yi6[] r2 = d.R;
                            if (r2[n4].f != null && r2[n4].f.d == hj6) {
                                break Label_0612;
                            }
                        }
                        d = null;
                    }
                    if (d == null) {
                        d = hj6;
                        j = 1;
                    }
                    final hj6 hj7 = hj6;
                    hj6 = d;
                    a = hj7;
                }
                final hj6 b = uo3.b;
                if (b != null) {
                    b.R[n4].e();
                }
                final hj6 d2 = uo3.d;
                if (d2 != null) {
                    d2.R[n4 + 1].e();
                }
                uo3.c = hj6;
                if (uo3.l == 0 && uo3.m) {
                    uo3.e = hj6;
                }
                else {
                    uo3.e = uo3.a;
                }
                uo3.p = (uo3.o && uo3.n);
            }
            uo3.q = true;
            int n8 = 0;
            Label_3863: {
                if (list != null && !list.contains(uo3.a)) {
                    n8 = i;
                    n9 = n2;
                }
                else {
                    final hj6 a2 = uo3.a;
                    final hj6 c = uo3.c;
                    final hj6 b2 = uo3.b;
                    final hj6 d3 = uo3.d;
                    final hj6 e2 = uo3.e;
                    float k2 = uo3.k;
                    final boolean b3 = ij6.U[n] == hj6$a.D0;
                    boolean b7 = false;
                    int n13 = 0;
                    int n14 = 0;
                    Label_1012: {
                        int n10 = 0;
                        int n11 = 0;
                        Label_1001: {
                            if (n == 0) {
                                final int l2 = e2.l0;
                                if (l2 == 0) {
                                    n10 = 1;
                                }
                                else {
                                    n10 = 0;
                                }
                                if (l2 == 1) {
                                    n11 = 1;
                                }
                                else {
                                    n11 = 0;
                                }
                                if (l2 != 2) {
                                    break Label_1001;
                                }
                            }
                            else {
                                final int m2 = e2.m0;
                                boolean b4;
                                if (m2 == 0) {
                                    b4 = true;
                                }
                                else {
                                    b4 = false;
                                }
                                int n12;
                                if (m2 == 1) {
                                    n12 = 1;
                                }
                                else {
                                    n12 = 0;
                                }
                                if (m2 != 2) {
                                    final boolean b5 = b4;
                                    n11 = n12;
                                    n10 = (b5 ? 1 : 0);
                                    break Label_1001;
                                }
                                final boolean b6 = b4;
                                n11 = n12;
                                n10 = (b6 ? 1 : 0);
                            }
                            b7 = true;
                            n13 = n10;
                            n14 = n11;
                            break Label_1012;
                        }
                        b7 = false;
                        n14 = n11;
                        n13 = n10;
                    }
                    hj6 hj8 = a2;
                    int n15 = 0;
                    while (n15 == 0) {
                        final yi6 yi6 = hj8.R[n3];
                        int n16;
                        if (b7) {
                            n16 = 1;
                        }
                        else {
                            n16 = 4;
                        }
                        final int e3 = yi6.e();
                        final boolean b8 = hj8.U[n] == e0 && hj8.t[n] == 0;
                        final yi6 f2 = yi6.f;
                        int n17 = e3;
                        if (f2 != null) {
                            n17 = e3;
                            if (hj8 != a2) {
                                n17 = f2.e() + e3;
                            }
                        }
                        int n18;
                        if (b7 && hj8 != a2 && hj8 != b2) {
                            n18 = 8;
                        }
                        else {
                            n18 = n16;
                        }
                        final yi6 f3 = yi6.f;
                        if (f3 != null) {
                            if (hj8 == b2) {
                                pdf.f(yi6.i, f3.i, n17, 6);
                            }
                            else {
                                pdf.f(yi6.i, f3.i, n17, 8);
                            }
                            int n19 = n18;
                            if (b8) {
                                n19 = n18;
                                if (!b7) {
                                    n19 = 5;
                                }
                            }
                            if (hj8 == b2 && b7 && hj8.T[n]) {
                                n19 = 5;
                            }
                            pdf.d(yi6.i, yi6.f.i, n17, n19);
                        }
                        if (b3) {
                            if (hj8.i0 != 8 && hj8.U[n] == e0) {
                                final yi6[] r3 = hj8.R;
                                pdf.f(r3[n3 + 1].i, r3[n3].i, 0, 5);
                            }
                            pdf.f(hj8.R[n3].i, ij6.R[n3].i, 0, 8);
                        }
                        final yi6 f4 = hj8.R[n3 + 1].f;
                        hj6 d4 = null;
                        Label_1439: {
                            if (f4 != null) {
                                d4 = f4.d;
                                final yi6[] r4 = d4.R;
                                if (r4[n3].f != null && r4[n3].f.d == hj8) {
                                    break Label_1439;
                                }
                            }
                            d4 = null;
                        }
                        if (d4 != null) {
                            hj8 = d4;
                        }
                        else {
                            n15 = 1;
                        }
                    }
                    final int n20 = n2;
                    if (d3 != null) {
                        final yi6[] r5 = c.R;
                        final int n21 = n3 + 1;
                        if (r5[n21].f != null) {
                            final yi6 yi7 = d3.R[n21];
                            Label_1627: {
                                if (d3.U[n] == e0 && d3.t[n] == 0 && !b7) {
                                    final yi6 f5 = yi7.f;
                                    if (f5.d == ij6) {
                                        pdf.d(yi7.i, f5.i, -yi7.e(), 5);
                                        break Label_1627;
                                    }
                                }
                                if (b7) {
                                    final yi6 f6 = yi7.f;
                                    if (f6.d == ij6) {
                                        pdf.d(yi7.i, f6.i, -yi7.e(), 4);
                                    }
                                }
                            }
                            pdf.g(yi7.i, c.R[n21].f.i, -yi7.e(), 6);
                        }
                    }
                    if (b3) {
                        final yi6[] r6 = ij6.R;
                        final int n22 = n3 + 1;
                        final ukq i2 = r6[n22].i;
                        final yi6[] r7 = c.R;
                        pdf.f(i2, r7[n22].i, r7[n22].e(), 8);
                    }
                    final ArrayList h = uo3.h;
                    uo3 uo4 = uo3;
                    hj6$a hj6$a = e0;
                    if (h != null) {
                        final int size = h.size();
                        uo4 = uo3;
                        hj6$a = e0;
                        if (size > 1) {
                            if (uo3.n && !uo3.p) {
                                k2 = (float)uo3.j;
                            }
                            hj6 hj9 = null;
                            float n23 = 0.0f;
                            int n24 = 0;
                            final uo3 uo5 = uo3;
                            while (true) {
                                uo4 = uo5;
                                hj6$a = e0;
                                if (n24 >= size) {
                                    break;
                                }
                                final hj6 hj10 = h.get(n24);
                                float n25 = hj10.n0[n];
                                Label_2250: {
                                    Label_1937: {
                                        if (n25 < 0.0f) {
                                            if (uo5.p) {
                                                final yi6[] r8 = hj10.R;
                                                pdf.d(r8[n3 + 1].i, r8[n3].i, 0, 4);
                                                break Label_1937;
                                            }
                                            n25 = 1.0f;
                                        }
                                        final float n26 = fcmpl(n25, 0.0f);
                                        if (n26 != 0) {
                                            if (hj9 != null) {
                                                final yi6[] r9 = hj9.R;
                                                final ukq i3 = r9[n3].i;
                                                final int n27 = n3 + 1;
                                                final ukq i4 = r9[n27].i;
                                                final yi6[] r10 = hj10.R;
                                                final ukq i5 = r10[n3].i;
                                                final ukq i6 = r10[n27].i;
                                                final et0 m3 = pdf.m();
                                                m3.b = 0.0f;
                                                if (k2 != 0.0f && n23 != n25) {
                                                    if (n23 == 0.0f) {
                                                        m3.d.k(i3, 1.0f);
                                                        m3.d.k(i4, -1.0f);
                                                    }
                                                    else if (n26 == 0) {
                                                        m3.d.k(i5, 1.0f);
                                                        m3.d.k(i6, -1.0f);
                                                    }
                                                    else {
                                                        final float n28 = n23 / k2 / (n25 / k2);
                                                        m3.d.k(i3, 1.0f);
                                                        m3.d.k(i4, -1.0f);
                                                        m3.d.k(i6, n28);
                                                        m3.d.k(i5, -n28);
                                                    }
                                                }
                                                else {
                                                    m3.d.k(i3, 1.0f);
                                                    m3.d.k(i4, -1.0f);
                                                    m3.d.k(i6, 1.0f);
                                                    m3.d.k(i5, -1.0f);
                                                }
                                                pdf.c(m3);
                                            }
                                            hj9 = hj10;
                                            break Label_2250;
                                        }
                                        final yi6[] r11 = hj10.R;
                                        pdf.d(r11[n3 + 1].i, r11[n3].i, 0, 8);
                                    }
                                    n25 = n23;
                                }
                                ++n24;
                                n23 = n25;
                            }
                        }
                    }
                    final hj6$a hj6$a2 = hj6$a;
                    int n31;
                    if (b2 != null && (b2 == d3 || b7)) {
                        final yi6 yi8 = a2.R[n3];
                        final yi6[] r12 = c.R;
                        final int n29 = n3 + 1;
                        yi6 yi9 = r12[n29];
                        final yi6 f7 = yi8.f;
                        ukq i7;
                        if (f7 != null) {
                            i7 = f7.i;
                        }
                        else {
                            i7 = null;
                        }
                        final yi6 f8 = yi9.f;
                        ukq i8;
                        if (f8 != null) {
                            i8 = f8.i;
                        }
                        else {
                            i8 = null;
                        }
                        final yi6 yi10 = b2.R[n3];
                        if (d3 != null) {
                            yi9 = d3.R[n29];
                        }
                        if (i7 != null && i8 != null) {
                            float n30;
                            if (n == 0) {
                                n30 = e2.f0;
                            }
                            else {
                                n30 = e2.g0;
                            }
                            final int e4 = yi10.e();
                            final int e5 = yi9.e();
                            final ukq i9 = yi10.i;
                            final ukq i10 = yi9.i;
                            n31 = i;
                            pdf.b(i9, i7, e4, n30, i8, i10, e5, 7);
                        }
                        else {
                            n31 = i;
                        }
                    }
                    else {
                        final hj6 hj11 = d3;
                        final hj6 hj12 = b2;
                        if (n13 != 0 && hj12 != null) {
                            final int j2 = uo4.j;
                            final boolean b9 = j2 > 0 && uo4.i == j2;
                            hj6 hj14;
                            hj6 hj13 = hj14 = hj12;
                            while (true) {
                                n31 = i;
                                if (hj14 == null) {
                                    break;
                                }
                                hj6 hj15;
                                for (hj15 = hj14.p0[n]; hj15 != null && hj15.i0 == 8; hj15 = hj15.p0[n]) {}
                                if (hj15 != null || hj14 == hj11) {
                                    final yi6 yi11 = hj14.R[n3];
                                    final ukq i11 = yi11.i;
                                    final yi6 f9 = yi11.f;
                                    ukq ukq2;
                                    if (f9 != null) {
                                        ukq2 = f9.i;
                                    }
                                    else {
                                        ukq2 = null;
                                    }
                                    if (hj13 != hj14) {
                                        ukq2 = hj13.R[n3 + 1].i;
                                    }
                                    else if (hj14 == hj12) {
                                        final yi6[] r13 = a2.R;
                                        if (r13[n3].f != null) {
                                            ukq2 = r13[n3].f.i;
                                        }
                                        else {
                                            ukq2 = null;
                                        }
                                    }
                                    final int e6 = yi11.e();
                                    final yi6[] r14 = hj14.R;
                                    final int n32 = n3 + 1;
                                    final int e7 = r14[n32].e();
                                    yi6 f10;
                                    ukq ukq3;
                                    if (hj15 != null) {
                                        f10 = hj15.R[n3];
                                        ukq3 = f10.i;
                                    }
                                    else {
                                        f10 = c.R[n32].f;
                                        if (f10 != null) {
                                            ukq3 = f10.i;
                                        }
                                        else {
                                            ukq3 = null;
                                        }
                                    }
                                    final ukq i12 = hj14.R[n32].i;
                                    int e8 = e7;
                                    if (f10 != null) {
                                        e8 = e7 + f10.e();
                                    }
                                    int e9 = hj13.R[n32].e() + e6;
                                    if (i11 != null && ukq2 != null && ukq3 != null && i12 != null) {
                                        if (hj14 == hj12) {
                                            e9 = hj12.R[n3].e();
                                        }
                                        if (hj14 == hj11) {
                                            e8 = hj11.R[n32].e();
                                        }
                                        int n33;
                                        if (b9) {
                                            n33 = 8;
                                        }
                                        else {
                                            n33 = 5;
                                        }
                                        pdf.b(i11, ukq2, e9, 0.5f, ukq3, i12, e8, n33);
                                    }
                                }
                                if (hj14.i0 != 8) {
                                    hj13 = hj14;
                                }
                                hj14 = hj15;
                            }
                        }
                        else {
                            n31 = i;
                            if (n14 != 0) {
                                n31 = i;
                                if (hj12 != null) {
                                    final int j3 = uo4.j;
                                    final boolean b10 = j3 > 0 && uo4.i == j3;
                                    hj6 hj17;
                                    hj6 hj18;
                                    for (hj6 hj16 = hj17 = hj12; hj17 != null; hj17 = hj18) {
                                        for (hj18 = hj17.p0[n]; hj18 != null && hj18.i0 == 8; hj18 = hj18.p0[n]) {}
                                        if (hj17 != hj12 && hj17 != hj11 && hj18 != null) {
                                            if (hj18 == hj11) {
                                                hj18 = null;
                                            }
                                            final yi6 yi12 = hj17.R[n3];
                                            final ukq i13 = yi12.i;
                                            final yi6[] r15 = hj16.R;
                                            final int n34 = n3 + 1;
                                            final ukq i14 = r15[n34].i;
                                            final int e10 = yi12.e();
                                            int e11 = hj17.R[n34].e();
                                            yi6 yi13;
                                            ukq ukq4;
                                            ukq ukq5;
                                            if (hj18 != null) {
                                                yi13 = hj18.R[n3];
                                                ukq4 = yi13.i;
                                                final yi6 f11 = yi13.f;
                                                if (f11 != null) {
                                                    ukq5 = f11.i;
                                                }
                                                else {
                                                    ukq5 = null;
                                                }
                                            }
                                            else {
                                                yi13 = hj11.R[n3];
                                                if (yi13 != null) {
                                                    ukq4 = yi13.i;
                                                }
                                                else {
                                                    ukq4 = null;
                                                }
                                                ukq5 = hj17.R[n34].i;
                                            }
                                            if (yi13 != null) {
                                                e11 += yi13.e();
                                            }
                                            final int e12 = hj16.R[n34].e();
                                            int n35;
                                            if (b10) {
                                                n35 = 8;
                                            }
                                            else {
                                                n35 = 4;
                                            }
                                            if (i13 != null && i14 != null && ukq4 != null && ukq5 != null) {
                                                pdf.b(i13, i14, e12 + e10, 0.5f, ukq4, ukq5, e11, n35);
                                            }
                                        }
                                        if (hj17.i0 != 8) {
                                            hj16 = hj17;
                                        }
                                    }
                                    final yi6 yi14 = hj12.R[n3];
                                    final yi6 f12 = a2.R[n3].f;
                                    final yi6[] r16 = hj11.R;
                                    final int n36 = n3 + 1;
                                    final yi6 yi15 = r16[n36];
                                    final yi6 f13 = c.R[n36].f;
                                    if (f12 != null) {
                                        if (hj12 != hj11) {
                                            pdf.d(yi14.i, f12.i, yi14.e(), 5);
                                        }
                                        else if (f13 != null) {
                                            pdf.b(yi14.i, f12.i, yi14.e(), 0.5f, yi15.i, f13.i, yi15.e(), 5);
                                        }
                                    }
                                    n31 = i;
                                    if (f13 != null) {
                                        n31 = i;
                                        if (hj12 != hj11) {
                                            pdf.d(yi15.i, f13.i, -yi15.e(), 5);
                                            n31 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (n13 == 0) {
                        n8 = n31;
                        n9 = n20;
                        e0 = hj6$a2;
                        if (n14 == 0) {
                            break Label_3863;
                        }
                    }
                    n8 = n31;
                    n9 = n20;
                    e0 = hj6$a2;
                    if (b2 != null) {
                        n8 = n31;
                        n9 = n20;
                        e0 = hj6$a2;
                        if (b2 != d3) {
                            final yi6[] r17 = b2.R;
                            yi6 yi16 = r17[n3];
                            hj6 hj19;
                            if (d3 == null) {
                                hj19 = b2;
                            }
                            else {
                                hj19 = d3;
                            }
                            final yi6[] r18 = hj19.R;
                            final int n37 = n3 + 1;
                            yi6 yi17 = r18[n37];
                            final yi6 f14 = yi16.f;
                            ukq i15;
                            if (f14 != null) {
                                i15 = f14.i;
                            }
                            else {
                                i15 = null;
                            }
                            final yi6 f15 = yi17.f;
                            ukq i16;
                            if (f15 != null) {
                                i16 = f15.i;
                            }
                            else {
                                i16 = null;
                            }
                            ukq ukq6;
                            if (c != hj19) {
                                final yi6 f16 = c.R[n37].f;
                                ukq i17 = ukq;
                                if (f16 != null) {
                                    i17 = f16.i;
                                }
                                ukq6 = i17;
                            }
                            else {
                                ukq6 = i16;
                            }
                            if (b2 == hj19) {
                                yi16 = r17[n3];
                                yi17 = r17[n37];
                            }
                            n8 = n31;
                            n9 = n20;
                            e0 = hj6$a2;
                            if (i15 != null) {
                                n8 = n31;
                                n9 = n20;
                                e0 = hj6$a2;
                                if (ukq6 != null) {
                                    pdf.b(yi16.i, i15, yi16.e(), 0.5f, ukq6, yi17.i, hj19.R[n37].e(), 5);
                                    e0 = hj6$a2;
                                    n9 = n20;
                                    n8 = n31;
                                }
                            }
                        }
                    }
                }
            }
            n38 = n8 + 1;
        }
    }
}
