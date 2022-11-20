import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnp extends ac<Object>
{
    public final Iterator<Object> F0;
    public final nnp$a G0;
    
    public mnp(final nnp$a g0) {
        this.G0 = g0;
        this.F0 = g0.D0.iterator();
    }
    
    public final Object a() {
        while (this.F0.hasNext()) {
            final Object next = this.F0.next();
            if (this.G0.E0.contains(next)) {
                return next;
            }
        }
        super.D0 = 3;
        return null;
    }
}
