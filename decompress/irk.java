import android.view.MenuItem;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.e$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irk implements e$a
{
    public final /* synthetic */ krk C0;
    
    public irk(final krk c0) {
        this.C0 = c0;
    }
    
    public final boolean a(final e e, final MenuItem menuItem) {
        final krk$b e2 = this.C0.e;
        return e2 != null && e2.onMenuItemClick(menuItem);
    }
    
    public final void b(final e e) {
    }
}
