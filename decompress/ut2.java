import android.view.MenuItem;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ut2 implements cbi
{
    public final /* synthetic */ int C0;
    public final mbi D0;
    public final Activity E0;
    
    public ut2(final mbi mbi, final Activity activity, final int c0) {
        this.C0 = c0;
        if (c0 != 1) {
            zzd.f((Object)mbi, "navigator");
            zzd.f((Object)activity, "activity");
            this.D0 = mbi;
            this.E0 = activity;
            return;
        }
        zzd.f((Object)mbi, "navigator");
        zzd.f((Object)activity, "activity");
        this.D0 = mbi;
        this.E0 = activity;
    }
    
    public final void a3() {
        switch (this.C0) {
            default: {
                this.D0.j();
                return;
            }
            case 0: {
                this.D0.j();
            }
        }
    }
    
    public final boolean q(final MenuItem menuItem) {
        switch (this.C0) {
            default: {
                zzd.f((Object)menuItem, "item");
                this.E0.onOptionsItemSelected(menuItem);
                return true;
            }
            case 0: {
                zzd.f((Object)menuItem, "item");
                this.E0.onOptionsItemSelected(menuItem);
                return true;
            }
        }
    }
}
