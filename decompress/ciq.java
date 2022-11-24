// 
// Decompiled by Procyon v0.6.0
// 

public final class ciq extends pue implements kub<qmo, d86, Integer, vzv>
{
    public final String F0;
    
    public ciq(final String f0) {
        this.F0 = f0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final qmo qmo = (qmo)o;
        final d86 d86 = (d86)o2;
        final int intValue = ((Number)o3).intValue();
        e0e.f((Object)qmo, "$this$TextButton");
        if ((intValue & 0x51) == 0x10 && d86.i()) {
            d86.H();
        }
        else {
            final sa6$b a = sa6.a;
            jjs.c(this.F0, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, d86, 0, 0, 65534);
        }
        return vzv.a;
    }
}
