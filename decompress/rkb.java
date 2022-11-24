// 
// Decompiled by Procyon v0.6.0
// 

public final class rkb extends pue implements stb<fnv, Object>
{
    public final skb F0;
    
    public rkb(final skb f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final fnv fnv = (fnv)o;
        e0e.f((Object)fnv, "it");
        final skb f0 = this.F0;
        final qlb b = fnv.b;
        final int c = fnv.c;
        final int d = fnv.d;
        final Object e = fnv.e;
        e0e.f((Object)b, "fontWeight");
        return f0.b(new fnv((qkb)null, b, c, d, e)).getValue();
    }
}
