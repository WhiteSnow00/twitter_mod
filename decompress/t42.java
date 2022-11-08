// 
// Decompiled by Procyon v0.6.0
// 

public final class t42 extends gue implements jub<ilo, m76, Integer, oyv>
{
    public final /* synthetic */ pba<z42> C0;
    
    public t42(final pba<z42> c0) {
        this.C0 = c0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final ilo ilo = (ilo)o;
        final m76 m76 = (m76)o2;
        final int intValue = ((Number)o3).intValue();
        zzd.f((Object)ilo, "$this$$receiver");
        int n = intValue;
        if ((intValue & 0xE) == 0x0) {
            int n2;
            if (m76.P((Object)ilo)) {
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
            final hj0 a2 = hj0.a;
            final s42 s42 = new s42(this.C0);
            final s36 a3 = s36.a;
            a2.c(ilo, (ded)ukg.I0((Object[])new w4h$a[] { new w4h$a((otb)s42, (jub)s36.b) }), false, m76, (n & 0xE) | 0x1040, 2);
        }
        return oyv.a;
    }
}
