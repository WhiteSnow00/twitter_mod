import android.view.MenuItem;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vx2 implements vbi
{
    public final int F0;
    public final fci G0;
    public final Activity H0;
    
    public vx2(final fci fci, final Activity activity, final int f0) {
        this.F0 = f0;
        if (f0 != 1) {
            e0e.f((Object)fci, "navigator");
            e0e.f((Object)activity, "activity");
            this.G0 = fci;
            this.H0 = activity;
            return;
        }
        e0e.f((Object)fci, "navigator");
        e0e.f((Object)activity, "activity");
        this.G0 = fci;
        this.H0 = activity;
    }
    
    public final void a3() {
        switch (this.F0) {
            default: {
                this.G0.k();
                return;
            }
            case 0: {
                this.G0.k();
            }
        }
    }
    
    public final boolean n(final MenuItem menuItem) {
        switch (this.F0) {
            default: {
                e0e.f((Object)menuItem, "item");
                this.H0.onOptionsItemSelected(menuItem);
                return true;
            }
            case 0: {
                e0e.f((Object)menuItem, "item");
                this.H0.onOptionsItemSelected(menuItem);
                return true;
            }
        }
    }
}
