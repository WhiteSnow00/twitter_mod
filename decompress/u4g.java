import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u4g implements wpo
{
    public final t4g F0;
    public final String G0;
    public final s4g H0;
    
    public u4g(final t4g f0, final String g0, final s4g h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final Object call() {
        final t4g f0 = this.F0;
        final String g0 = this.G0;
        final s4g h0 = this.H0;
        final myp myp = new myp((Object)g0, 2);
        Objects.requireNonNull(f0);
        final p5s f2 = nv8.f((p5s)f0, (stb)myp);
        Objects.requireNonNull(h0);
        final Object b = ((z2j)((m5s)nv8.g((p5s)f2, (p5s)h0, jba.a((j5s)h0))).W2((Object)g0)).b;
        vmw.g(b);
        return b;
    }
}
