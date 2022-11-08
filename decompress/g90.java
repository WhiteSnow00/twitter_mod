// 
// Decompiled by Procyon v0.6.0
// 

public final class g90 extends gue implements jub<za0, m76, Integer, oyv>
{
    public final /* synthetic */ j90<Object> C0;
    public final /* synthetic */ Object D0;
    public final /* synthetic */ lub<za0, Object, m76, Integer, oyv> E0;
    public final /* synthetic */ int F0;
    public final /* synthetic */ uhq<Object> G0;
    
    public g90(final j90<Object> c0, final Object d0, final lub<? super za0, Object, ? super m76, ? super Integer, oyv> e0, final int f0, final uhq<Object> g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = (lub<za0, Object, m76, Integer, oyv>)e0;
        this.F0 = f0;
        this.G0 = g0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final za0 za0 = (za0)o;
        final m76 m76 = (m76)o2;
        final int intValue = ((Number)o3).intValue();
        zzd.f((Object)za0, "$this$AnimatedVisibility");
        int n = intValue;
        if ((intValue & 0xE) == 0x0) {
            int n2;
            if (m76.P((Object)za0)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n = (intValue | n2);
        }
        if ((n & 0x5B) == 0x12 && m76.i()) {
            m76.H();
        }
        else {
            final ea6$b a = ea6.a;
            jgw.c((Object)za0, (rtb)new f90((uhq)this.G0, this.D0, (j90)this.C0), m76);
            this.C0.d.put(this.D0, ((ab0)za0).a);
            this.E0.I((Object)za0, this.D0, (Object)m76, (Object)((n & 0xE) | (this.F0 >> 9 & 0x380)));
        }
        return oyv.a;
    }
}
