// 
// Decompiled by Procyon v0.6.0
// 

public final class gna
{
    public final long a;
    public long b;
    public volatile double c;
    
    public gna(final long a) {
        this.a = a;
    }
    
    public final double a(final long n, double c) {
        synchronized (this) {
            final long b = this.b;
            if (b == 0L) {
                this.b = n;
                this.c = c;
            }
            else {
                final double exp = Math.exp(-(n - b) / (double)this.a);
                this.b = n;
                this.c = this.c * exp + (1 - exp) * c;
            }
            c = this.c;
            return c;
        }
    }
}
