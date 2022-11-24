// 
// Decompiled by Procyon v0.6.0
// 

public final class av1 extends pue implements stb<hbm, vzv>
{
    public final bv1 F0;
    
    public av1(final bv1 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hbm hbm = (hbm)o;
        final wu1 b = hbm.b;
        if (slr.k1((CharSequence)b.a) ^ true) {
            final yda id = ((uda)this.F0.F0.c(hbm.a)).getId();
            this.F0.G0.b(id, (zda)new vte(b.a, (String)null, 2, (wg8)null));
            this.F0.G0.b(id, (zda)new jnp(b.b));
        }
        return vzv.a;
    }
}
