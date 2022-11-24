import java.util.concurrent.ExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ncy implements ecy
{
    public final Object F0;
    public final int G0;
    public final c100<Void> H0;
    public int I0;
    public int J0;
    public int K0;
    public Exception L0;
    public boolean M0;
    
    public ncy(final int g0, final c100<Void> h0) {
        this.F0 = new Object();
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void a() {
        synchronized (this.F0) {
            ++this.K0;
            this.M0 = true;
            this.d();
        }
    }
    
    @Override
    public final void b(final Object o) {
        synchronized (this.F0) {
            ++this.I0;
            this.d();
        }
    }
    
    public final void c(final Exception l0) {
        synchronized (this.F0) {
            ++this.J0;
            this.L0 = l0;
            this.d();
        }
    }
    
    public final void d() {
        if (this.I0 + this.J0 + this.K0 == this.G0) {
            if (this.L0 != null) {
                final c100<Void> h0 = this.H0;
                final int j0 = this.J0;
                final int g0 = this.G0;
                final StringBuilder sb = new StringBuilder(54);
                sb.append(j0);
                sb.append(" out of ");
                sb.append(g0);
                sb.append(" underlying tasks failed");
                h0.w(new ExecutionException(sb.toString(), this.L0));
                return;
            }
            if (this.M0) {
                this.H0.y();
                return;
            }
            this.H0.x(null);
        }
    }
}
