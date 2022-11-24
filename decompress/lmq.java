import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lmq implements Comparable<lmq>
{
    public boolean F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public boolean K0;
    public float[] L0;
    public float[] M0;
    public int N0;
    public at0[] O0;
    public int P0;
    public int Q0;
    
    public lmq(final int n0) {
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = 0;
        this.K0 = false;
        this.L0 = new float[9];
        this.M0 = new float[9];
        this.O0 = new at0[16];
        this.P0 = 0;
        this.Q0 = 0;
        this.N0 = n0;
    }
    
    public final void b(final at0 at0) {
        int n = 0;
        while (true) {
            final int p = this.P0;
            if (n >= p) {
                final at0[] o0 = this.O0;
                if (p >= o0.length) {
                    this.O0 = Arrays.copyOf(o0, o0.length * 2);
                }
                final at0[] o2 = this.O0;
                final int p2 = this.P0;
                o2[p2] = at0;
                this.P0 = p2 + 1;
                return;
            }
            if (this.O0[n] == at0) {
                return;
            }
            ++n;
        }
    }
    
    @Override
    public final int compareTo(final Object o) {
        return this.G0 - ((lmq)o).G0;
    }
    
    public final void e(final at0 at0) {
        for (int p = this.P0, i = 0; i < p; ++i) {
            if (this.O0[i] == at0) {
                while (i < p - 1) {
                    final at0[] o0 = this.O0;
                    final int n = i + 1;
                    o0[i] = o0[n];
                    i = n;
                }
                --this.P0;
                return;
            }
        }
    }
    
    public final void f() {
        this.N0 = 5;
        this.I0 = 0;
        this.G0 = -1;
        this.H0 = -1;
        this.J0 = 0.0f;
        this.K0 = false;
        for (int p0 = this.P0, i = 0; i < p0; ++i) {
            this.O0[i] = null;
        }
        this.P0 = 0;
        this.Q0 = 0;
        this.F0 = false;
        Arrays.fill(this.M0, 0.0f);
    }
    
    public final void g(final ydf ydf, final float j0) {
        this.J0 = j0;
        this.K0 = true;
        final int p2 = this.P0;
        this.H0 = -1;
        for (int i = 0; i < p2; ++i) {
            this.O0[i].j(ydf, this, false);
        }
        this.P0 = 0;
    }
    
    public final void i(final ydf ydf, final at0 at0) {
        for (int p2 = this.P0, i = 0; i < p2; ++i) {
            this.O0[i].k(ydf, at0, false);
        }
        this.P0 = 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("");
        f.append(this.G0);
        return f.toString();
    }
}
