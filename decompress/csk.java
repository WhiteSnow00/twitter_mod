import android.view.MenuItem;
import androidx.appcompat.view.menu.e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csk implements a
{
    public final esk F0;
    
    public csk(final esk f0) {
        this.F0 = f0;
    }
    
    @Override
    public final boolean a(final e e, final MenuItem menuItem) {
        final esk$b e2 = this.F0.e;
        return e2 != null && e2.onMenuItemClick(menuItem);
    }
    
    @Override
    public final void b(final e e) {
    }
}
