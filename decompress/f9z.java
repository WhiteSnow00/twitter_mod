import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f9z implements Callable
{
    public final String D0;
    public final String E0;
    public final String F0;
    public final lbz G0;
    
    public f9z(final lbz g0, final String d0, final String e0, final String f0) {
        this.G0 = g0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final Object call() throws Exception {
        this.G0.a.f();
        final zdy f0 = this.G0.a.F0;
        poz.I((zmz)f0);
        return f0.N(this.D0, this.E0, this.F0);
    }
}
