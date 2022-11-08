import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bk8 implements qll
{
    public final qll<Executor> C0;
    public final qll<vf1> D0;
    public final qll<yrx> E0;
    public final qll<pda> F0;
    public final qll<s3s> G0;
    
    public bk8(final qll<Executor> c0, final qll<vf1> d0, final qll<yrx> e0, final qll<pda> f0, final qll<s3s> g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object get() {
        return new ak8((Executor)this.C0.get(), (vf1)this.D0.get(), (yrx)this.E0.get(), (pda)this.F0.get(), (s3s)this.G0.get());
    }
}
