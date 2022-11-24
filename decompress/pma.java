import android.view.Menu;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pma implements abi
{
    public final Resources F0;
    public final qdw G0;
    
    public pma(final Resources f0, final qdw g0) {
        e0e.f((Object)f0, "resources");
        e0e.f((Object)g0, "currentUser");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final boolean N2(final zai zai, final Menu menu) {
        e0e.f((Object)zai, "navComponent");
        e0e.f((Object)menu, "menu");
        zai.setTitle((CharSequence)this.F0.getString(2131954015));
        if (!this.G0.a()) {
            zai.a((CharSequence)flr.l(this.G0.c()));
        }
        return true;
    }
    
    public final int d2(final zai zai) {
        e0e.f((Object)zai, "navComponent");
        return 2;
    }
}
