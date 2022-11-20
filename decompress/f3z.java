import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f3z implements Runnable
{
    public final y2z D0;
    public final int E0;
    public final Throwable F0;
    public final byte[] G0;
    public final String H0;
    public final Map I0;
    
    public f3z(final String h0, final y2z d0, final int e0, final Throwable f0, final byte[] g0, final Map i0) {
        Objects.requireNonNull(d0, "null reference");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final void run() {
        this.D0.c(this.H0, this.E0, this.F0, this.G0, this.I0);
    }
}
