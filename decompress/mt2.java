import android.view.MenuItem;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mt2 implements ebi
{
    public final int D0;
    public final obi E0;
    public final Activity F0;
    
    public mt2(final obi obi, final Activity activity, final int d0) {
        this.D0 = d0;
        if (d0 != 1) {
            czd.f((Object)obi, "navigator");
            czd.f((Object)activity, "activity");
            this.E0 = obi;
            this.F0 = activity;
            return;
        }
        czd.f((Object)obi, "navigator");
        czd.f((Object)activity, "activity");
        this.E0 = obi;
        this.F0 = activity;
    }
    
    public final void a3() {
        switch (this.D0) {
            default: {
                this.E0.j();
                return;
            }
            case 0: {
                this.E0.j();
            }
        }
    }
    
    public final boolean n(final MenuItem menuItem) {
        switch (this.D0) {
            default: {
                czd.f((Object)menuItem, "item");
                this.F0.onOptionsItemSelected(menuItem);
                return true;
            }
            case 0: {
                czd.f((Object)menuItem, "item");
                this.F0.onOptionsItemSelected(menuItem);
                return true;
            }
        }
    }
}
