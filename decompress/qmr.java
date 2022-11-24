import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.content.Context;
import android.view.SubMenu;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qmr extends c6h implements SubMenu
{
    public final n0s e;
    
    public qmr(final Context context, final n0s e) {
        super(context, (e0s)e);
        this.e = e;
    }
    
    public final void clearHeader() {
        ((SubMenu)this.e).clearHeader();
    }
    
    public final MenuItem getItem() {
        return this.d(((SubMenu)this.e).getItem());
    }
    
    public final SubMenu setHeaderIcon(final int headerIcon) {
        ((SubMenu)this.e).setHeaderIcon(headerIcon);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderIcon(final Drawable headerIcon) {
        ((SubMenu)this.e).setHeaderIcon(headerIcon);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final int headerTitle) {
        ((SubMenu)this.e).setHeaderTitle(headerTitle);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final CharSequence headerTitle) {
        ((SubMenu)this.e).setHeaderTitle(headerTitle);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderView(final View headerView) {
        ((SubMenu)this.e).setHeaderView(headerView);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final int icon) {
        ((SubMenu)this.e).setIcon(icon);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final Drawable icon) {
        ((SubMenu)this.e).setIcon(icon);
        return (SubMenu)this;
    }
}
