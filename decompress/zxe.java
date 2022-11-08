import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zxe extends gue implements rtb<Integer, Integer>
{
    public final /* synthetic */ aye C0;
    public final /* synthetic */ List<xye> D0;
    
    public zxe(final aye c0, final List<xye> d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final int intValue = ((Number)o).intValue();
        int n;
        if (this.C0.b) {
            n = this.D0.get(intValue).e;
        }
        else {
            n = this.D0.get(intValue).f;
        }
        return n;
    }
}
