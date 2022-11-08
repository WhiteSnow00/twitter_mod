import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxk extends gue implements gub<m76, Integer, oyv>
{
    public final /* synthetic */ String C0;
    public final /* synthetic */ String D0;
    public final /* synthetic */ Object[] E0;
    
    public cxk(final String c0, final String d0, final Object[] e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final m76 m76 = (m76)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && m76.i()) {
            m76.H();
        }
        else {
            final ea6$b a = ea6.a;
            final String c0 = this.C0;
            final String d0 = this.D0;
            final Object[] e0 = this.E0;
            rp2.l0(c0, d0, m76, Arrays.copyOf(e0, e0.length));
        }
        return oyv.a;
    }
}
