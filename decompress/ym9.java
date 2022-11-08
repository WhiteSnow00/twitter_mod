import java.util.Objects;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ym9 extends jzg
{
    public final xm9 I0;
    public boolean J0;
    
    public ym9(final d3 d3) {
        final xm9 i = bqe.i();
        super(d3);
        this.I0 = i;
    }
    
    public final Handler i(final pcc pcc) {
        Objects.requireNonNull((b2)pcc);
        return d2.M0;
    }
    
    public final void r() {
        ((zi1)this).l((Class)wah.class, (cw1)new o41((Object)this, 1), 0);
        ((zi1)this).l((Class)csg.class, (cw1)new q41((Object)this, 1), 0);
        ((zi1)this).l((Class)adq.class, (cw1)new m41((Object)this, 1), 0);
    }
    
    public final void s(final j6 j6) {
        if (rez.u(super.H0)) {
            final i1 b = j6.b;
            if (b instanceof k1) {
                this.I0.b((k1)b);
            }
        }
    }
}
