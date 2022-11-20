import java.util.Comparator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lzk extends xs0
{
    public olq[] f;
    public olq[] g;
    public int h;
    public lzk.lzk$b i;
    
    public lzk(final bb7 bb7) {
        super(bb7);
        this.f = new olq[128];
        this.g = new olq[128];
        this.h = 0;
        this.i = new lzk.lzk$b(this);
    }
    
    public final olq a(final boolean[] array) {
        int i = 0;
        int n = -1;
    Label_0187_Outer:
        while (i < this.h) {
            final olq[] f = this.f;
            final olq a = f[i];
            Label_0196: {
                if (!array[a.E0]) {
                    final lzk.lzk$b j = this.i;
                    j.a = a;
                    int k = 8;
                    final int n2 = 1;
                    final int n3 = 1;
                    Label_0192: {
                        if (n == -1) {
                            while (true) {
                                while (k >= 0) {
                                    final float n4 = j.a.K0[k];
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
                        final olq olq = f[n];
                        while (true) {
                            while (k >= 0) {
                                final float n6 = olq.K0[k];
                                final float n7 = j.a.K0[k];
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
    
    public final void k(final bdf bdf, final xs0 xs0, final boolean b) {
        final olq a = xs0.a;
        if (a == null) {
            return;
        }
        final xs0$a d = xs0.d;
        for (int f = d.f(), i = 0; i < f; ++i) {
            final olq b2 = d.b(i);
            final float h = d.h(i);
            final lzk.lzk$b j = this.i;
            j.a = b2;
            final boolean d2 = b2.D0;
            final int n = 1;
            boolean b3 = true;
            int n2;
            if (d2) {
                for (int k = 0; k < 9; ++k) {
                    final float[] k2 = j.a.K0;
                    k2[k] += a.K0[k] * h;
                    if (Math.abs(k2[k]) < 1.0E-4f) {
                        j.a.K0[k] = 0.0f;
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
                    final float n4 = a.K0[n3];
                    if (n4 != 0.0f) {
                        float n5;
                        if (Math.abs(n5 = n4 * h) < 1.0E-4f) {
                            n5 = 0.0f;
                        }
                        j.a.K0[n3] = n5;
                    }
                    else {
                        j.a.K0[n3] = 0.0f;
                    }
                    ++n3;
                }
            }
            if (n2 != 0) {
                this.l(b2);
            }
            super.b += xs0.b * h;
        }
        this.m(a);
    }
    
    public final void l(final olq olq) {
        final int h = this.h;
        final olq[] f = this.f;
        if (h + 1 > f.length) {
            final olq[] f2 = Arrays.copyOf(f, f.length * 2);
            this.f = f2;
            this.g = Arrays.copyOf(f2, f2.length * 2);
        }
        final olq[] f3 = this.f;
        int h2 = this.h;
        f3[h2] = olq;
        ++h2;
        this.h = h2;
        if (h2 > 1 && f3[h2 - 1].E0 > olq.E0) {
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
            Arrays.sort(this.g, 0, h3, (Comparator<? super olq>)new lzk$a());
            for (int i = n; i < this.h; ++i) {
                this.f[i] = this.g[i];
            }
        }
        olq.D0 = true;
        olq.b((xs0)this);
    }
    
    public final void m(final olq olq) {
        for (int i = 0; i < this.h; ++i) {
            if (this.f[i] == olq) {
                int h;
                while (true) {
                    h = this.h;
                    if (i >= h - 1) {
                        break;
                    }
                    final olq[] f = this.f;
                    final int n = i + 1;
                    f[i] = f[n];
                    i = n;
                }
                this.h = h - 1;
                olq.D0 = false;
                return;
            }
        }
    }
    
    public final String toString() {
        final StringBuilder b = kgi.b("", " goal -> (");
        b.append(super.b);
        b.append(") : ");
        String s = b.toString();
        for (int i = 0; i < this.h; ++i) {
            this.i.a = this.f[i];
            final StringBuilder j = fu8.j(s);
            j.append(this.i);
            j.append(" ");
            s = j.toString();
        }
        return s;
    }
}
