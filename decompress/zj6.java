import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zj6 implements qbi
{
    public final boolean C0;
    public final boolean D0;
    
    public zj6(final boolean c0, final boolean d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final long b(long n, final long n2, int n3) {
        Objects.requireNonNull(wbi.Companion);
        if (n3 == 2) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            final boolean c0 = this.C0;
            final boolean d0 = this.D0;
            float e = 0.0f;
            float d2;
            if (c0) {
                d2 = qfj.d(n2);
            }
            else {
                d2 = 0.0f;
            }
            if (d0) {
                e = qfj.e(n2);
            }
            n = ukg.m(d2, e);
        }
        else {
            Objects.requireNonNull(qfj.Companion);
            n = qfj.b;
        }
        return n;
    }
    
    public final Object c(final long n, final long n2, final ap6<? super spw> ap6) {
        final boolean c0 = this.C0;
        final boolean d0 = this.D0;
        float c2 = 0.0f;
        float b;
        if (c0) {
            b = spw.b(n2);
        }
        else {
            b = 0.0f;
        }
        if (d0) {
            c2 = spw.c(n2);
        }
        return new spw(xd.g(b, c2));
    }
    
    public final long f(final long n, final int n2) {
        Objects.requireNonNull(qfj.Companion);
        return qfj.b;
    }
}
