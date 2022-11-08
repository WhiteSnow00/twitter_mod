import android.view.MenuItem;
import android.view.MenuItem$OnActionExpandListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i8p implements MenuItem$OnActionExpandListener
{
    public final /* synthetic */ fai a;
    public final /* synthetic */ g8p b;
    
    public i8p(final g8p b, final fai a) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean onMenuItemActionCollapse(final MenuItem menuItem) {
        this.a.d().I();
        this.b.E0.b();
        final g8p b = this.b;
        final MenuItem f1 = b.f1;
        boolean b2;
        if (f1 != null && f1.isActionViewExpanded() && !b.p1) {
            b.e(menuItem.getActionView());
            b2 = true;
        }
        else {
            if (b.p1) {
                b.H0.onBackPressed();
            }
            b2 = false;
        }
        return b2;
    }
    
    public final boolean onMenuItemActionExpand(MenuItem f1) {
        this.a.d().K();
        this.b.E0.a();
        final g8p b = this.b;
        f1 = b.f1;
        boolean b2;
        if (f1 != null && f1.isActionViewExpanded()) {
            b2 = false;
        }
        else {
            b.h(b.f1.getActionView());
            b2 = true;
        }
        return b2;
    }
}
