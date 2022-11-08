import android.view.MenuItem;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fw9 implements cbi
{
    public final Activity C0;
    
    public fw9(final Activity c0) {
        zzd.f((Object)c0, "activity");
        this.C0 = c0;
    }
    
    public final void a3() {
        this.C0.onBackPressed();
    }
}
