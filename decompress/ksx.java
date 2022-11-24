import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksx implements pml
{
    public final pml<Executor> F0;
    public final pml<gea> G0;
    public final pml<htx> H0;
    public final pml<f5s> I0;
    
    public ksx(final pml<Executor> f0, final pml<gea> g0, final pml<htx> h0, final pml<f5s> i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final Object get() {
        return new jsx((Executor)this.F0.get(), (gea)this.G0.get(), (htx)this.H0.get(), (f5s)this.I0.get());
    }
}
