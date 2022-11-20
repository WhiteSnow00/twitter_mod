import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ypw extends ste implements ktb<Float, Float, x66, Integer, fzv>
{
    public final q8d D0;
    
    public ypw(final q8d d0) {
        this.D0 = d0;
        super(4);
    }
    
    public final Object I(final Object o, final Object o2, final Object o3, final Object o4) {
        ((Number)o).floatValue();
        ((Number)o2).floatValue();
        final x66 x66 = (x66)o3;
        if ((((Number)o4).intValue() & 0xB) == 0x2 && x66.i()) {
            x66.H();
        }
        else {
            final n96$b a = n96.a;
            xpw.a(this.D0.f, (Map)null, x66, 0, 2);
        }
        return fzv.a;
    }
}
