import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lk6 implements jci
{
    public final boolean F0;
    public final boolean G0;
    
    public lk6(final boolean f0, final boolean g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final Object a(final long n, final mp6 mp6) {
        return j98.d();
    }
    
    @Override
    public final long b(long n, final long n2, int n3) {
        Objects.requireNonNull(pci.Companion);
        if (n3 == 2) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            final boolean f0 = this.F0;
            final boolean g0 = this.G0;
            float e = 0.0f;
            float d;
            if (f0) {
                d = kgj.d(n2);
            }
            else {
                d = 0.0f;
            }
            if (g0) {
                e = kgj.e(n2);
            }
            n = kqe.e(d, e);
        }
        else {
            Objects.requireNonNull(kgj.Companion);
            n = kgj.b;
        }
        return n;
    }
    
    @Override
    public final Object c(final long n, final long n2, final mp6<? super crw> mp6) {
        final boolean f0 = this.F0;
        final boolean g0 = this.G0;
        float c = 0.0f;
        float b;
        if (f0) {
            b = crw.b(n2);
        }
        else {
            b = 0.0f;
        }
        if (g0) {
            c = crw.c(n2);
        }
        return new crw(zzz.i(b, c));
    }
    
    @Override
    public final long f(final long n, final int n2) {
        Objects.requireNonNull(kgj.Companion);
        return kgj.b;
    }
}
