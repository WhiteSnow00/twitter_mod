import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gey extends bdy<Void>
{
    public final /* synthetic */ igy c;
    
    public gey(final igy c, final sdz<Void> sdz) {
        this.c = c;
        super(c, (sdz)sdz);
    }
    
    public final void J0(final Bundle bundle, final Bundle bundle2) {
        super.J0(bundle, bundle2);
        if (!this.c.f.compareAndSet(true, false)) {
            igy.g.o("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.c.g();
        }
    }
}
