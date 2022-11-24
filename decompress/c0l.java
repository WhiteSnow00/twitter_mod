import java.util.Comparator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c0l extends at0
{
    public lmq[] f;
    public lmq[] g;
    public int h;
    public c0l.c0l$b i;
    
    public c0l(final gc7 gc7) {
        super(gc7);
        this.f = new lmq[128];
        this.g = new lmq[128];
        this.h = 0;
        this.i = new c0l.c0l$b(this);
    }
    
    public final lmq a(final boolean[] array) {
        int i = 0;
        int n = -1;
    Label_0187_Outer:
        while (i < this.h) {
            final lmq[] f = this.f;
            final lmq a = f[i];
            Label_0196: {
                if (!array[a.G0]) {
                    final c0l.c0l$b j = this.i;
                    j.a = a;
                    int k = 8;
                    final int n2 = 1;
                    final int n3 = 1;
                    Label_0192: {
                        if (n == -1) {
                            while (true) {
                                while (k >= 0) {
                                    final float n4 = j.a.M0[k];
                                    if (n4 > 0.0f) {
                                        break;
                                    }
                                    if (n4 < 0.0f) {
                                        final int n5 = n3;
                                        if (n5 != 0) {
                                            break Label_0192;
                                        }
                                        break Label_0196;
                                    }
                                    else {
                                        --k;
                                    }
                                }
                                final int n5 = 0;
                                continue Label_0187_Outer;
                            }
                        }
                        final lmq lmq = f[n];
                        while (true) {
                            while (k >= 0) {
                                final float n6 = lmq.M0[k];
                                final float n7 = j.a.M0[k];
                                if (n7 == n6) {
                                    --k;
                                }
                                else {
                                    if (n7 >= n6) {
                                        break;
                                    }
                                    final int n8 = n2;
                                    if (n8 != 0) {
                                        break Label_0192;
                                    }
                                    break Label_0196;
                                }
                            }
                            final int n8 = 0;
                            continue;
                        }
                    }
                    n = i;
                }
            }
            ++i;
        }
        if (n == -1) {
            return null;
        }
        return this.f[n];
    }
    
    public final boolean g() {
        return this.h == 0;
    }
    
    public final void k(final ydf ydf, final at0 at0, final boolean b) {
        final lmq a = at0.a;
        if (a == null) {
            return;
        }
        final at0$a d = at0.d;
        for (int f = d.f(), i = 0; i < f; ++i) {
            final lmq b2 = d.b(i);
            final float h = d.h(i);
            final c0l.c0l$b j = this.i;
            j.a = b2;
            final boolean f2 = b2.F0;
            final int n = 1;
            boolean b3 = true;
            int n2;
            if (f2) {
                for (int k = 0; k < 9; ++k) {
                    final float[] m0 = j.a.M0;
                    m0[k] += a.M0[k] * h;
                    if (Math.abs(m0[k]) < 1.0E-4f) {
                        j.a.M0[k] = 0.0f;
                    }
                    else {
                        b3 = false;
                    }
                }
                if (b3) {
                    j.b.m(j.a);
                }
                n2 = 0;
            }
            else {
                int n3 = 0;
                while (true) {
                    n2 = n;
                    if (n3 >= 9) {
                        break;
                    }
                    final float n4 = a.M0[n3];
                    if (n4 != 0.0f) {
                        float n5;
                        if (Math.abs(n5 = n4 * h) < 1.0E-4f) {
                            n5 = 0.0f;
                        }
                        j.a.M0[n3] = n5;
                    }
                    else {
                        j.a.M0[n3] = 0.0f;
                    }
                    ++n3;
                }
            }
            if (n2 != 0) {
                this.l(b2);
            }
            super.b += at0.b * h;
        }
        this.m(a);
    }
    
    public final void l(final lmq lmq) {
        final int h = this.h;
        final lmq[] f = this.f;
        if (h + 1 > f.length) {
            final lmq[] f2 = Arrays.copyOf(f, f.length * 2);
            this.f = f2;
            this.g = Arrays.copyOf(f2, f2.length * 2);
        }
        final lmq[] f3 = this.f;
        int h2 = this.h;
        f3[h2] = lmq;
        ++h2;
        this.h = h2;
        if (h2 > 1 && f3[h2 - 1].G0 > lmq.G0) {
            final int n = 0;
            int n2 = 0;
            int h3;
            while (true) {
                h3 = this.h;
                if (n2 >= h3) {
                    break;
                }
                this.g[n2] = this.f[n2];
                ++n2;
            }
            Arrays.sort(this.g, 0, h3, (Comparator<? super lmq>)new c0l$a());
            for (int i = n; i < this.h; ++i) {
                this.f[i] = this.g[i];
            }
        }
        lmq.F0 = true;
        lmq.b(this);
    }
    
    public final void m(final lmq lmq) {
        for (int i = 0; i < this.h; ++i) {
            if (this.f[i] == lmq) {
                int h;
                while (true) {
                    h = this.h;
                    if (i >= h - 1) {
                        break;
                    }
                    final lmq[] f = this.f;
                    final int n = i + 1;
                    f[i] = f[n];
                    i = n;
                }
                this.h = h - 1;
                lmq.F0 = false;
                return;
            }
        }
    }
    
    public final String toString() {
        final StringBuilder n = a88.n("", " goal -> (");
        n.append(super.b);
        n.append(") : ");
        String s = n.toString();
        for (int i = 0; i < this.h; ++i) {
            this.i.a = this.f[i];
            final StringBuilder f = ehk.f(s);
            f.append(this.i);
            f.append(" ");
            s = f.toString();
        }
        return s;
    }
}
