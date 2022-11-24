import com.twitter.app.dm.inbox.DMInboxController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class np7 extends pue implements stb<y48, vzv>
{
    public final DMInboxController F0;
    
    public np7(final DMInboxController f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        if (!((osc)o).T().b) {
            ehk.c().c(2131955065, 1);
        }
        final DMInboxController f0 = this.F0;
        if (f0.k) {
            f0.k = false;
            final udv h = f0.h;
            if (h == null) {
                e0e.m("listViewHost");
                throw null;
            }
            h.e2();
        }
        return vzv.a;
    }
}
