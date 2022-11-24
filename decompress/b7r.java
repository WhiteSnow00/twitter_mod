import com.google.android.exoplayer2.v;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b7r implements hsg
{
    public final qi4 F0;
    public boolean G0;
    public long H0;
    public long I0;
    public v J0;
    
    public b7r(final qi4 f0) {
        this.F0 = f0;
        this.J0 = v.I0;
    }
    
    public final v a() {
        return this.J0;
    }
    
    public final void b(final long h0) {
        this.H0 = h0;
        if (this.G0) {
            this.I0 = this.F0.c();
        }
    }
    
    public final void c() {
        if (!this.G0) {
            this.I0 = this.F0.c();
            this.G0 = true;
        }
    }
    
    public final void i(final v j0) {
        if (this.G0) {
            this.b(this.r());
        }
        this.J0 = j0;
    }
    
    public final long r() {
        long h0 = this.H0;
        if (this.G0) {
            final long n = this.F0.c() - this.I0;
            final v j0 = this.J0;
            long h2;
            if (j0.F0 == 1.0f) {
                h2 = rnw.H(n);
            }
            else {
                h2 = n * j0.H0;
            }
            h0 += h2;
        }
        return h0;
    }
}
