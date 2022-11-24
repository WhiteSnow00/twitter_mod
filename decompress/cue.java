import android.content.Context;
import android.view.Menu;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cue implements abi
{
    public final Activity F0;
    public final qdw G0;
    
    public cue(final Activity f0, final qdw g0) {
        e0e.f((Object)f0, "activity");
        e0e.f((Object)g0, "userInfo");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final boolean N2(final zai zai, final Menu menu) {
        e0e.f((Object)zai, "navComponent");
        e0e.f((Object)menu, "menu");
        zai.setTitle((CharSequence)((Context)this.F0).getString(2131954532));
        zai.a((CharSequence)flr.l(this.G0.c()));
        return true;
    }
    
    public final int d2(final zai zai) {
        e0e.f((Object)zai, "navComponent");
        return 2;
    }
}
