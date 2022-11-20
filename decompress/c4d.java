import android.graphics.drawable.Drawable;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c4d implements b4d
{
    public final krm a;
    
    public c4d(final krm a) {
        czd.f((Object)a, "resourceProvider");
        this.a = a;
    }
    
    @Override
    public final void a(final MenuItem menuItem, final int n) {
        czd.f((Object)menuItem, "toolBarItem");
        final Drawable j = this.a.j(n);
        if (j != null) {
            j.setTint(d4j.i(this.a.a, 2130968593));
            menuItem.setIcon(j).setVisible(true);
        }
    }
}
