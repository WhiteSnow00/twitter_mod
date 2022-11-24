// 
// Decompiled by Procyon v0.6.0
// 

public final class e90 extends pue implements kub<ya0, d86, Integer, vzv>
{
    public final h90<Object> F0;
    public final Object G0;
    public final mub<ya0, Object, d86, Integer, vzv> H0;
    public final int I0;
    public final jjq<Object> J0;
    
    public e90(final h90<Object> f0, final Object g0, final mub<? super ya0, Object, ? super d86, ? super Integer, vzv> h0, final int i0, final jjq<Object> j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = (mub<ya0, Object, d86, Integer, vzv>)h0;
        this.I0 = i0;
        this.J0 = j0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final ya0 ya0 = (ya0)o;
        final d86 d86 = (d86)o2;
        final int intValue = ((Number)o3).intValue();
        e0e.f((Object)ya0, "$this$AnimatedVisibility");
        int n = intValue;
        if ((intValue & 0xE) == 0x0) {
            int n2;
            if (d86.P((Object)ya0)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n = (intValue | n2);
        }
        if ((n & 0x5B) == 0x12 && d86.i()) {
            d86.H();
        }
        else {
            final sa6$b a = sa6.a;
            shw.b((Object)ya0, (stb)new d90(this.J0, this.G0, this.F0), d86);
            this.F0.d.put(this.G0, ((za0)ya0).a);
            this.H0.I((Object)ya0, this.G0, (Object)d86, (Object)((n & 0xE) | (this.I0 >> 9 & 0x380)));
        }
        return vzv.a;
    }
}
