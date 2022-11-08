import java.util.Objects;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pdf
{
    public static boolean p = false;
    public static int q = 1000;
    public boolean a;
    public int b;
    public dzk c;
    public int d;
    public int e;
    public et0[] f;
    public boolean g;
    public boolean[] h;
    public int i;
    public int j;
    public int k;
    public final wb7 l;
    public ukq[] m;
    public int n;
    public et0 o;
    
    public pdf() {
        this.a = false;
        this.b = 0;
        this.d = 32;
        this.e = 32;
        this.f = null;
        this.g = false;
        this.h = new boolean[32];
        this.i = 1;
        this.j = 0;
        this.k = 32;
        this.m = new ukq[pdf.q];
        this.n = 0;
        this.f = new et0[32];
        this.t();
        final wb7 l = new wb7();
        this.l = l;
        this.c = new dzk(l);
        this.o = new et0(l);
    }
    
    public final ukq a(int n, final String s) {
        ukq ukq = (ukq)((now)this.l.c).a();
        if (ukq == null) {
            ukq = new ukq(n);
            ukq.K0 = n;
        }
        else {
            ukq.f();
            ukq.K0 = n;
        }
        n = this.n;
        final int q = pdf.q;
        if (n >= q) {
            n = (pdf.q = q * 2);
            this.m = Arrays.copyOf(this.m, n);
        }
        final ukq[] m = this.m;
        n = this.n++;
        return m[n] = ukq;
    }
    
    public final void b(final ukq ukq, final ukq ukq2, final int n, final float n2, final ukq ukq3, final ukq ukq4, final int n3, final int n4) {
        final et0 m = this.m();
        if (ukq2 == ukq3) {
            m.d.k(ukq, 1.0f);
            m.d.k(ukq4, 1.0f);
            m.d.k(ukq2, -2.0f);
        }
        else if (n2 == 0.5f) {
            m.d.k(ukq, 1.0f);
            m.d.k(ukq2, -1.0f);
            m.d.k(ukq3, -1.0f);
            m.d.k(ukq4, 1.0f);
            if (n > 0 || n3 > 0) {
                m.b = (float)(-n + n3);
            }
        }
        else if (n2 <= 0.0f) {
            m.d.k(ukq, -1.0f);
            m.d.k(ukq2, 1.0f);
            m.b = (float)n;
        }
        else if (n2 >= 1.0f) {
            m.d.k(ukq4, -1.0f);
            m.d.k(ukq3, 1.0f);
            m.b = (float)(-n3);
        }
        else {
            final et0.et0$a d = m.d;
            final float n5 = 1.0f - n2;
            d.k(ukq, n5 * 1.0f);
            m.d.k(ukq2, n5 * -1.0f);
            m.d.k(ukq3, -1.0f * n2);
            m.d.k(ukq4, 1.0f * n2);
            if (n > 0 || n3 > 0) {
                m.b = n3 * n2 + -n * n5;
            }
        }
        if (n4 != 8) {
            m.b(this, n4);
        }
        this.c(m);
    }
    
    public final void c(final et0 et0) {
        final int j = this.j;
        final boolean b = true;
        if (j + 1 >= this.k || this.i + 1 >= this.e) {
            this.p();
        }
        boolean b8 = false;
        if (!et0.e) {
            if (this.f.length != 0) {
                int i = 0;
                while (i == 0) {
                    for (int f = et0.d.f(), k = 0; k < f; ++k) {
                        final ukq b2 = et0.d.b(k);
                        if (b2.E0 != -1 || b2.H0) {
                            et0.c.add(b2);
                        }
                    }
                    final int size = et0.c.size();
                    if (size > 0) {
                        for (int l = 0; l < size; ++l) {
                            final ukq ukq = et0.c.get(l);
                            if (ukq.H0) {
                                et0.j(this, ukq, true);
                            }
                            else {
                                et0.k(this, this.f[ukq.E0], true);
                            }
                        }
                        et0.c.clear();
                    }
                    else {
                        i = 1;
                    }
                }
                if (et0.a != null && et0.d.f() == 0) {
                    et0.e = true;
                    this.a = true;
                }
            }
            if (et0.g()) {
                return;
            }
            final float b3 = et0.b;
            if (b3 < 0.0f) {
                et0.b = b3 * -1.0f;
                et0.d.c();
            }
            final int f2 = et0.d.f();
            ukq ukq3;
            ukq ukq2 = ukq3 = null;
            int n = 0;
            float n2 = 0.0f;
            int n3 = 0;
            float n4 = 0.0f;
            int n5 = 0;
            while (n < f2) {
                final float h = et0.d.h(n);
                final ukq b4 = et0.d.b(n);
                ukq ukq4 = null;
                ukq ukq5 = null;
                float n6 = 0.0f;
                int n7 = 0;
                float n8 = 0.0f;
                int n9 = 0;
                Label_0747: {
                    if (b4.K0 == 1) {
                        Label_0406: {
                            Label_0404: {
                                if (ukq2 == null) {
                                    if (b4.N0 > 1) {
                                        break Label_0404;
                                    }
                                }
                                else if (n2 > h) {
                                    if (b4.N0 > 1) {
                                        break Label_0404;
                                    }
                                }
                                else {
                                    ukq4 = ukq2;
                                    ukq5 = ukq3;
                                    n6 = n2;
                                    n7 = n3;
                                    n8 = n4;
                                    n9 = n5;
                                    if (n3 != 0) {
                                        break Label_0747;
                                    }
                                    final boolean b5 = b4.N0 <= 1;
                                    ukq4 = ukq2;
                                    ukq5 = ukq3;
                                    n6 = n2;
                                    n7 = n3;
                                    n8 = n4;
                                    n9 = n5;
                                    if (b5) {
                                        n7 = 1;
                                        ukq4 = b4;
                                        ukq5 = ukq3;
                                        n6 = h;
                                        n8 = n4;
                                        n9 = n5;
                                    }
                                    break Label_0747;
                                }
                                n7 = 1;
                                break Label_0406;
                            }
                            n7 = 0;
                        }
                        ukq4 = b4;
                        ukq5 = ukq3;
                        n6 = h;
                        n8 = n4;
                        n9 = n5;
                    }
                    else {
                        ukq4 = ukq2;
                        ukq5 = ukq3;
                        n6 = n2;
                        n7 = n3;
                        n8 = n4;
                        n9 = n5;
                        if (ukq2 == null) {
                            ukq4 = ukq2;
                            ukq5 = ukq3;
                            n6 = n2;
                            n7 = n3;
                            n8 = n4;
                            n9 = n5;
                            if (h < 0.0f) {
                                Label_0629: {
                                    Label_0626: {
                                        if (ukq3 == null) {
                                            if (b4.N0 > 1) {
                                                break Label_0626;
                                            }
                                        }
                                        else if (n4 > h) {
                                            if (b4.N0 > 1) {
                                                break Label_0626;
                                            }
                                        }
                                        else {
                                            ukq4 = ukq2;
                                            ukq5 = ukq3;
                                            n6 = n2;
                                            n7 = n3;
                                            n8 = n4;
                                            if ((n9 = n5) != 0) {
                                                break Label_0747;
                                            }
                                            final boolean b6 = b4.N0 <= 1;
                                            ukq4 = ukq2;
                                            ukq5 = ukq3;
                                            n6 = n2;
                                            n7 = n3;
                                            n8 = n4;
                                            n9 = n5;
                                            if (b6) {
                                                n9 = 1;
                                                n8 = h;
                                                n7 = n3;
                                                n6 = n2;
                                                ukq5 = b4;
                                                ukq4 = ukq2;
                                            }
                                            break Label_0747;
                                        }
                                        n9 = 1;
                                        break Label_0629;
                                    }
                                    n9 = 0;
                                }
                                ukq4 = ukq2;
                                ukq5 = b4;
                                n6 = n2;
                                n7 = n3;
                                n8 = h;
                            }
                        }
                    }
                }
                ++n;
                ukq2 = ukq4;
                ukq3 = ukq5;
                n2 = n6;
                n3 = n7;
                n4 = n8;
                n5 = n9;
            }
            if (ukq2 != null) {
                ukq3 = ukq2;
            }
            boolean b7;
            if (ukq3 == null) {
                b7 = true;
            }
            else {
                et0.i(ukq3);
                b7 = false;
            }
            if (et0.d.f() == 0) {
                et0.e = true;
            }
            Label_1103: {
                if (b7) {
                    if (this.i + 1 >= this.e) {
                        this.p();
                    }
                    final ukq a = this.a(3, null);
                    final int n10 = this.b + 1;
                    this.b = n10;
                    ++this.i;
                    a.D0 = n10;
                    ((ukq[])this.l.d)[n10] = a;
                    et0.a = a;
                    final int m = this.j;
                    this.i(et0);
                    if (this.j == m + 1) {
                        final et0 o = this.o;
                        Objects.requireNonNull(o);
                        o.a = null;
                        o.d.clear();
                        for (int n11 = 0; n11 < et0.d.f(); ++n11) {
                            o.d.g(et0.d.b(n11), et0.d.h(n11), true);
                        }
                        this.s((a)this.o);
                        if (a.E0 == -1) {
                            if (et0.a == a) {
                                final ukq h2 = et0.h(null, a);
                                if (h2 != null) {
                                    et0.i(h2);
                                }
                            }
                            if (!et0.e) {
                                et0.a.i(this, et0);
                            }
                            ((now)this.l.b).f((Object)et0);
                            --this.j;
                        }
                        b8 = true;
                        break Label_1103;
                    }
                }
                b8 = false;
            }
            final ukq a2 = et0.a;
            int n12 = 0;
            Label_1144: {
                if (a2 != null) {
                    n12 = (b ? 1 : 0);
                    if (a2.K0 == 1) {
                        break Label_1144;
                    }
                    if (et0.b >= 0.0f) {
                        n12 = (b ? 1 : 0);
                        break Label_1144;
                    }
                }
                n12 = 0;
            }
            if (n12 == 0) {
                return;
            }
        }
        else {
            b8 = false;
        }
        if (!b8) {
            this.i(et0);
        }
    }
    
    public final et0 d(final ukq ukq, final ukq ukq2, final int n, final int n2) {
        if (n2 == 8 && ukq2.H0 && ukq.E0 == -1) {
            ukq.g(this, ukq2.G0 + n);
            return null;
        }
        final et0 m = this.m();
        int n3 = 0;
        final int n4 = 0;
        if (n != 0) {
            n3 = n4;
            int n5;
            if ((n5 = n) < 0) {
                n5 = n * -1;
                n3 = 1;
            }
            m.b = (float)n5;
        }
        if (n3 == 0) {
            m.d.k(ukq, -1.0f);
            m.d.k(ukq2, 1.0f);
        }
        else {
            m.d.k(ukq, 1.0f);
            m.d.k(ukq2, -1.0f);
        }
        if (n2 != 8) {
            m.b(this, n2);
        }
        this.c(m);
        return m;
    }
    
    public final void e(ukq a, int i) {
        final int e0 = a.E0;
        if (e0 == -1) {
            a.g(this, (float)i);
            for (i = 0; i < this.b + 1; ++i) {
                a = ((ukq[])this.l.d)[i];
            }
            return;
        }
        if (e0 != -1) {
            final et0 et0 = this.f[e0];
            if (et0.e) {
                et0.b = (float)i;
            }
            else if (et0.d.f() == 0) {
                et0.e = true;
                et0.b = (float)i;
            }
            else {
                final et0 m = this.m();
                if (i < 0) {
                    m.b = (float)(i * -1);
                    m.d.k(a, 1.0f);
                }
                else {
                    m.b = (float)i;
                    m.d.k(a, -1.0f);
                }
                this.c(m);
            }
        }
        else {
            final et0 j = this.m();
            j.a = a;
            final float n = (float)i;
            a.G0 = n;
            j.b = n;
            j.e = true;
            this.c(j);
        }
    }
    
    public final void f(ukq k, final ukq ukq, int n, final int n2) {
        final et0 m = this.m();
        final ukq n3 = this.n();
        n3.F0 = 0;
        m.d(k, ukq, n3, n);
        if (n2 != 8) {
            n = (int)(m.d.e(n3) * -1.0f);
            k = this.k(n2, null);
            m.d.k(k, (float)n);
        }
        this.c(m);
    }
    
    public final void g(ukq k, final ukq ukq, int n, final int n2) {
        final et0 m = this.m();
        final ukq n3 = this.n();
        n3.F0 = 0;
        m.e(k, ukq, n3, n);
        if (n2 != 8) {
            n = (int)(m.d.e(n3) * -1.0f);
            k = this.k(n2, null);
            m.d.k(k, (float)n);
        }
        this.c(m);
    }
    
    public final void h(final ukq ukq, final ukq ukq2, final ukq ukq3, final ukq ukq4, final float n) {
        final et0 m = this.m();
        m.c(ukq, ukq2, ukq3, ukq4, n);
        this.c(m);
    }
    
    public final void i(et0 et0) {
        if (et0.e) {
            et0.a.g(this, et0.b);
        }
        else {
            final et0[] f = this.f;
            final int j = this.j;
            f[j] = et0;
            final ukq a = et0.a;
            a.E0 = j;
            this.j = j + 1;
            a.i(this, et0);
        }
        if (this.a) {
            int n;
            for (int i = 0; i < this.j; i = n + 1) {
                if (this.f[i] == null) {
                    System.out.println("WTF");
                }
                final et0[] f2 = this.f;
                n = i;
                if (f2[i] != null) {
                    n = i;
                    if (f2[i].e) {
                        et0 = f2[i];
                        et0.a.g(this, et0.b);
                        ((now)this.l.b).f((Object)et0);
                        this.f[i] = null;
                        int n3;
                        int n2 = n3 = i + 1;
                        int k;
                        while (true) {
                            k = this.j;
                            if (n2 >= k) {
                                break;
                            }
                            final et0[] f3 = this.f;
                            final int e0 = n2 - 1;
                            f3[e0] = f3[n2];
                            if (f3[e0].a.E0 == n2) {
                                f3[e0].a.E0 = e0;
                            }
                            n3 = n2;
                            ++n2;
                        }
                        if (n3 < k) {
                            this.f[n3] = null;
                        }
                        this.j = k - 1;
                        n = i - 1;
                    }
                }
            }
            this.a = false;
        }
    }
    
    public final void j() {
        for (int i = 0; i < this.j; ++i) {
            final et0 et0 = this.f[i];
            et0.a.G0 = et0.b;
        }
    }
    
    public final ukq k(final int f0, final String s) {
        if (this.i + 1 >= this.e) {
            this.p();
        }
        final ukq a = this.a(4, s);
        final int n = this.b + 1;
        this.b = n;
        ++this.i;
        a.D0 = n;
        a.F0 = f0;
        ((ukq[])this.l.d)[n] = a;
        final dzk c = this.c;
        c.i.a = a;
        Arrays.fill(a.J0, 0.0f);
        a.J0[a.F0] = 1.0f;
        c.l(a);
        return a;
    }
    
    public final ukq l(final Object o) {
        ukq ukq = null;
        if (o == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            this.p();
        }
        if (o instanceof yi6) {
            final yi6 yi6 = (yi6)o;
            ukq ukq2;
            if ((ukq2 = yi6.i) == null) {
                yi6.l();
                ukq2 = yi6.i;
            }
            final int d0 = ukq2.D0;
            if (d0 != -1 && d0 <= this.b) {
                ukq = ukq2;
                if (((ukq[])this.l.d)[d0] != null) {
                    return ukq;
                }
            }
            if (d0 != -1) {
                ukq2.f();
            }
            final int n = this.b + 1;
            this.b = n;
            ++this.i;
            ukq2.D0 = n;
            ukq2.K0 = 1;
            ((ukq[])this.l.d)[n] = ukq2;
            ukq = ukq2;
        }
        return ukq;
    }
    
    public final et0 m() {
        et0 et0 = (et0)((now)this.l.b).a();
        if (et0 == null) {
            et0 = new et0(this.l);
        }
        else {
            et0.a = null;
            et0.d.clear();
            et0.b = 0.0f;
            et0.e = false;
        }
        return et0;
    }
    
    public final ukq n() {
        if (this.i + 1 >= this.e) {
            this.p();
        }
        final ukq a = this.a(3, null);
        final int n = this.b + 1;
        this.b = n;
        ++this.i;
        a.D0 = n;
        return ((ukq[])this.l.d)[n] = a;
    }
    
    public final int o(final Object o) {
        final ukq i = ((yi6)o).i;
        if (i != null) {
            return (int)(i.G0 + 0.5f);
        }
        return 0;
    }
    
    public final void p() {
        final int d = this.d * 2;
        this.d = d;
        this.f = Arrays.copyOf(this.f, d);
        final wb7 l = this.l;
        l.d = Arrays.copyOf((ukq[])l.d, this.d);
        final int d2 = this.d;
        this.h = new boolean[d2];
        this.e = d2;
        this.k = d2;
    }
    
    public final void q() throws Exception {
        final dzk c = this.c;
        final int h = c.h;
        final int n = 0;
        if (h == 0) {
            this.j();
            return;
        }
        if (this.g) {
            int i = 0;
            while (true) {
                while (i < this.j) {
                    if (!this.f[i].e) {
                        final int n2 = n;
                        if (n2 == 0) {
                            this.r((a)this.c);
                            return;
                        }
                        this.j();
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                final int n2 = 1;
                continue;
            }
        }
        this.r((a)c);
    }
    
    public final void r(final a a) throws Exception {
        while (true) {
            for (int i = 0; i < this.j; ++i) {
                final et0[] f = this.f;
                if (f[i].a.K0 != 1) {
                    if (f[i].b < 0.0f) {
                        final boolean b = true;
                        if (b) {
                            int j = 0;
                            int n = 0;
                            while (j == 0) {
                                final int n2 = n + 1;
                                float n3 = Float.MAX_VALUE;
                                int k = 0;
                                int e0 = -1;
                                int d0 = -1;
                                int n4 = 0;
                                while (k < this.j) {
                                    final et0 et0 = this.f[k];
                                    float n5;
                                    int n6;
                                    int n7;
                                    int n8;
                                    if (et0.a.K0 == 1) {
                                        n5 = n3;
                                        n6 = e0;
                                        n7 = d0;
                                        n8 = n4;
                                    }
                                    else if (et0.e) {
                                        n5 = n3;
                                        n6 = e0;
                                        n7 = d0;
                                        n8 = n4;
                                    }
                                    else {
                                        n5 = n3;
                                        n6 = e0;
                                        n7 = d0;
                                        n8 = n4;
                                        if (et0.b < 0.0f) {
                                            final int f2 = et0.d.f();
                                            int n9 = 0;
                                            while (true) {
                                                n5 = n3;
                                                n6 = e0;
                                                n7 = d0;
                                                n8 = n4;
                                                if (n9 >= f2) {
                                                    break;
                                                }
                                                final ukq b2 = et0.d.b(n9);
                                                final float e2 = et0.d.e(b2);
                                                float n10;
                                                int n11;
                                                int n12;
                                                int n13;
                                                if (e2 <= 0.0f) {
                                                    n10 = n3;
                                                    n11 = e0;
                                                    n12 = d0;
                                                    n13 = n4;
                                                }
                                                else {
                                                    final int n14 = 0;
                                                    int n15 = e0;
                                                    int n16 = n14;
                                                    while (true) {
                                                        n10 = n3;
                                                        n11 = n15;
                                                        n12 = d0;
                                                        n13 = n4;
                                                        if (n16 >= 9) {
                                                            break;
                                                        }
                                                        final float n17 = b2.I0[n16] / e2;
                                                        int n18;
                                                        if ((n17 < n3 && n16 == n4) || n16 > (n18 = n4)) {
                                                            d0 = b2.D0;
                                                            n18 = n16;
                                                            n3 = n17;
                                                            n15 = k;
                                                        }
                                                        ++n16;
                                                        n4 = n18;
                                                    }
                                                }
                                                ++n9;
                                                n3 = n10;
                                                e0 = n11;
                                                d0 = n12;
                                                n4 = n13;
                                            }
                                        }
                                    }
                                    ++k;
                                    n3 = n5;
                                    e0 = n6;
                                    d0 = n7;
                                    n4 = n8;
                                }
                                if (e0 != -1) {
                                    final et0 et2 = this.f[e0];
                                    et2.a.E0 = -1;
                                    et2.i(((ukq[])this.l.d)[d0]);
                                    final ukq a2 = et2.a;
                                    a2.E0 = e0;
                                    a2.i(this, et2);
                                }
                                else {
                                    j = 1;
                                }
                                if (n2 > this.i / 2) {
                                    j = 1;
                                }
                                n = n2;
                            }
                        }
                        this.s(a);
                        this.j();
                        return;
                    }
                }
            }
            final boolean b = false;
            continue;
        }
    }
    
    public final int s(final a a) {
        for (int i = 0; i < this.i; ++i) {
            this.h[i] = false;
        }
        int j = 0;
        int n = 0;
        while (j == 0) {
            final int n2 = n + 1;
            if (n2 >= this.i * 2) {
                return n2;
            }
            final ukq a2 = ((et0)a).a;
            if (a2 != null) {
                this.h[a2.D0] = true;
            }
            final ukq a3 = a.a(this.h);
            if (a3 != null) {
                final boolean[] h = this.h;
                final int d0 = a3.D0;
                if (h[d0]) {
                    return n2;
                }
                h[d0] = true;
            }
            if (a3 != null) {
                float n3 = Float.MAX_VALUE;
                int k = 0;
                int e0 = -1;
                while (k < this.j) {
                    final et0 et0 = this.f[k];
                    float n4;
                    int n5;
                    if (et0.a.K0 == 1) {
                        n4 = n3;
                        n5 = e0;
                    }
                    else if (et0.e) {
                        n4 = n3;
                        n5 = e0;
                    }
                    else {
                        n4 = n3;
                        n5 = e0;
                        if (et0.d.a(a3)) {
                            final float e2 = et0.d.e(a3);
                            n4 = n3;
                            n5 = e0;
                            if (e2 < 0.0f) {
                                final float n6 = -et0.b / e2;
                                n4 = n3;
                                n5 = e0;
                                if (n6 < n3) {
                                    n5 = k;
                                    n4 = n6;
                                }
                            }
                        }
                    }
                    ++k;
                    n3 = n4;
                    e0 = n5;
                }
                n = n2;
                if (e0 <= -1) {
                    continue;
                }
                final et0 et2 = this.f[e0];
                et2.a.E0 = -1;
                et2.i(a3);
                final ukq a4 = et2.a;
                a4.E0 = e0;
                a4.i(this, et2);
                n = n2;
            }
            else {
                j = 1;
                n = n2;
            }
        }
        return n;
    }
    
    public final void t() {
        for (int i = 0; i < this.j; ++i) {
            final et0 et0 = this.f[i];
            if (et0 != null) {
                ((now)this.l.b).f((Object)et0);
            }
            this.f[i] = null;
        }
    }
    
    public final void u() {
        int n = 0;
        wb7 l;
        while (true) {
            l = this.l;
            final ukq[] array = (ukq[])l.d;
            if (n >= array.length) {
                break;
            }
            final ukq ukq = array[n];
            if (ukq != null) {
                ukq.f();
            }
            ++n;
        }
        final now now = (now)l.c;
        final ukq[] m = this.m;
        final int n2 = this.n;
        Objects.requireNonNull(now);
        int length;
        if ((length = n2) > m.length) {
            length = m.length;
        }
        for (final ukq ukq2 : m) {
            final int a = now.a;
            final Object[] array2 = (Object[])now.b;
            if (a < array2.length) {
                array2[a] = ukq2;
                now.a = a + 1;
            }
        }
        this.n = 0;
        Arrays.fill((Object[])this.l.d, null);
        this.b = 0;
        final dzk c = this.c;
        c.h = 0;
        ((et0)c).b = 0.0f;
        this.i = 1;
        for (int j = 0; j < this.j; ++j) {
            final et0[] f = this.f;
            if (f[j] != null) {
                Objects.requireNonNull(f[j]);
            }
        }
        this.t();
        this.j = 0;
        this.o = new et0(this.l);
    }
    
    public interface a
    {
        ukq a(final boolean[] p0);
    }
}
