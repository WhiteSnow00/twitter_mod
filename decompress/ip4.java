import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ip4 extends gue implements lub<gze, Integer, m76, Integer, oyv>
{
    public final /* synthetic */ List C0;
    public final /* synthetic */ rtb D0;
    public final /* synthetic */ rtb E0;
    public final /* synthetic */ int F0;
    
    public ip4(final List c0, final rtb d0, final rtb e0, final int f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(4);
    }
    
    public final Object I(final Object o, final Object o2, final Object o3, final Object o4) {
        final gze gze = (gze)o;
        final int intValue = ((Number)o2).intValue();
        final m76 m76 = (m76)o3;
        final int intValue2 = ((Number)o4).intValue();
        zzd.f((Object)gze, "$this$items");
        int n2;
        if ((intValue2 & 0xE) == 0x0) {
            int n;
            if (m76.P((Object)gze)) {
                n = 4;
            }
            else {
                n = 2;
            }
            n2 = (n | intValue2);
        }
        else {
            n2 = intValue2;
        }
        int n3 = n2;
        if ((intValue2 & 0x70) == 0x0) {
            int n4;
            if (m76.d(intValue)) {
                n4 = 32;
            }
            else {
                n4 = 16;
            }
            n3 = (n2 | n4);
        }
        if ((n3 & 0x2DB) == 0x92 && m76.i()) {
            m76.H();
        }
        else {
            final ea6$b a = ea6.a;
            final hfv hfv = this.C0.get(intValue);
            final rtb d0 = this.D0;
            final rtb e0 = this.E0;
            final int f0 = this.F0;
            ep4.c(hfv, d0, e0, (jkh)null, m76, (f0 & 0x70) | 0x8 | (f0 & 0x380), 8);
        }
        return oyv.a;
    }
}
