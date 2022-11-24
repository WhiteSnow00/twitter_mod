import java.util.ConcurrentModificationException;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z9r implements Entry<Object, Object>, noe$a
{
    public final Object F0;
    public Object G0;
    public final aar<Object, Object> H0;
    
    public z9r(final aar<Object, Object> h0) {
        this.H0 = h0;
        final Entry i0 = ((bar)h0).I0;
        e0e.c((Object)i0);
        this.F0 = i0.getKey();
        final Entry i2 = ((bar)h0).I0;
        e0e.c((Object)i2);
        this.G0 = i2.getValue();
    }
    
    @Override
    public final Object getKey() {
        return this.F0;
    }
    
    @Override
    public final Object getValue() {
        return this.G0;
    }
    
    @Override
    public final Object setValue(final Object g0) {
        final aar<Object, Object> h0 = this.H0;
        if (((bar)h0).F0.a() == ((bar)h0).H0) {
            final Object g2 = this.G0;
            ((bar)h0).F0.put(this.F0, g0);
            this.G0 = g0;
            return g2;
        }
        throw new ConcurrentModificationException();
    }
}
