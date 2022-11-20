import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ltr extends ac8 implements htr
{
    public htr F0;
    public long G0;
    
    public final int b(final long n) {
        final htr f0 = this.F0;
        Objects.requireNonNull(f0);
        return f0.b(n - this.G0);
    }
    
    public final List<q77> e(final long n) {
        final htr f0 = this.F0;
        Objects.requireNonNull(f0);
        return f0.e(n - this.G0);
    }
    
    public final long f(final int n) {
        final htr f0 = this.F0;
        Objects.requireNonNull(f0);
        return f0.f(n) + this.G0;
    }
    
    public final int g() {
        final htr f0 = this.F0;
        Objects.requireNonNull(f0);
        return f0.g();
    }
    
    public final void r() {
        ((mq2)this).D0 = 0;
        this.F0 = null;
    }
    
    public final void s(long n, final htr f0, final long n2) {
        super.E0 = n;
        this.F0 = f0;
        if (n2 != Long.MAX_VALUE) {
            n = n2;
        }
        this.G0 = n;
    }
}
