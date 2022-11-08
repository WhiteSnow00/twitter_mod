// 
// Decompiled by Procyon v0.6.0
// 

public final class oea extends nws
{
    public final uda k;
    
    public oea(final oea.oea$a oea$a) {
        super((nws$a)oea$a);
        final uda k = oea$a.k;
        pf8.r(k);
        this.k = k;
    }
    
    public final dtg n() {
        final aea p = this.k.p;
        if (p != null) {
            final dtg b = p.b;
            if (b != null) {
                return b;
            }
        }
        return null;
    }
}
