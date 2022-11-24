// 
// Decompiled by Procyon v0.6.0
// 

public final class cfa extends vxs
{
    public final lea k;
    
    public cfa(final cfa.cfa$a cfa$a) {
        super((vxs$a)cfa$a);
        final lea k = cfa$a.k;
        vmw.g((Object)k);
        this.k = k;
    }
    
    public final wtg n() {
        final rea p = this.k.p;
        if (p != null) {
            final wtg b = p.b;
            if (b != null) {
                return b;
            }
        }
        return null;
    }
}
