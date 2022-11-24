import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l6e extends bc<Object>
{
    public final Iterator H0;
    public final muk I0;
    
    public l6e(final Iterator h0, final muk i0) {
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final Object a() {
        while (this.H0.hasNext()) {
            final Object next = this.H0.next();
            if (this.I0.apply(next)) {
                return next;
            }
        }
        super.F0 = 3;
        return null;
    }
}
