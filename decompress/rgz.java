// 
// Decompiled by Procyon v0.6.0
// 

public final class rgz implements Runnable
{
    public final boolean F0;
    public final ahz G0;
    
    public rgz(final ahz g0, final boolean f0) {
        this.G0 = g0;
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        final boolean h = ((ocz)this.G0).F0.h();
        final boolean g = ((ocz)this.G0).F0.g();
        ((ocz)this.G0).F0.f1 = this.F0;
        if (g == this.F0) {
            ((ocz)this.G0).F0.b().S0.b("Default data collection state already set to", (Object)this.F0);
        }
        if (((ocz)this.G0).F0.h() == h || ((ocz)this.G0).F0.h() != ((ocz)this.G0).F0.g()) {
            ((ocz)this.G0).F0.b().P0.c("Default data collection is different than actual status", (Object)this.F0, (Object)h);
        }
        this.G0.G();
    }
}
