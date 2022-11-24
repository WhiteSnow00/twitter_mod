// 
// Decompiled by Procyon v0.6.0
// 

public final class shg implements hub
{
    public final int F0;
    public final Object G0;
    
    public shg(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        switch (this.F0) {
            default: {
                final qdw qdw = (qdw)this.G0;
                final xzu xzu = (xzu)o;
                final Integer n = (Integer)o2;
                final m0w x1 = xzu.a.F0.x1;
                return x1 != null && x1.a(qdw.k().getId());
            }
            case 0: {
                ((vhg)this.G0).a5((ecg)o, (qgv)o2);
                return vzv.a;
            }
        }
    }
}
