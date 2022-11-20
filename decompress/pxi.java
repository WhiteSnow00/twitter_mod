// 
// Decompiled by Procyon v0.6.0
// 

public final class pxi extends fo1<String>
{
    public final qxi E0;
    
    public pxi(final qxi e0) {
        this.E0 = e0;
    }
    
    public final void onNext(final Object o) {
        final String s = (String)o;
        final qxi e0 = this.E0;
        e0.c.f((orc)new h3w(e0.b, s));
    }
}
