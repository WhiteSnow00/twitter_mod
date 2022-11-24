// 
// Decompiled by Procyon v0.6.0
// 

public final class dyi extends lo1<String>
{
    public final eyi G0;
    
    public dyi(final eyi g0) {
        this.G0 = g0;
    }
    
    public final void onNext(final Object o) {
        final String s = (String)o;
        final eyi g0 = this.G0;
        g0.c.f(new w3w(g0.b, s));
    }
}
