// 
// Decompiled by Procyon v0.6.0
// 

public final class jmf implements fca
{
    public final xmr F0;
    
    public jmf(final xmr f0) {
        this.F0 = f0;
    }
    
    public final void e(final Object o) {
        final xmr f0 = this.F0;
        final nkf nkf = (nkf)o;
        e0e.f((Object)f0, "$subject");
        e0e.f((Object)nkf, "t");
        ((ocj)f0).onNext((Object)nkf);
    }
}
