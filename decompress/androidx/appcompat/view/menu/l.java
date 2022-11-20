// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.content.Context;
import android.view.SubMenu;

public final class l extends e implements SubMenu
{
    public g A;
    public e z;
    
    public l(final Context context, final e z, final g a) {
        super(context);
        this.z = z;
        this.A = a;
    }
    
    public final boolean e(final g g) {
        return this.z.e(g);
    }
    
    public final boolean f(final e e, final MenuItem menuItem) {
        return super.f(e, menuItem) || this.z.f(e, menuItem);
    }
    
    public final boolean g(final g g) {
        return this.z.g(g);
    }
    
    public final MenuItem getItem() {
        return (MenuItem)this.A;
    }
    
    public final String k() {
        final g a = this.A;
        int a2;
        if (a != null) {
            a2 = a.a;
        }
        else {
            a2 = 0;
        }
        if (a2 == 0) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("android:menu:actionviewstates");
        sb.append(":");
        sb.append(a2);
        return sb.toString();
    }
    
    public final e l() {
        return this.z.l();
    }
    
    public final boolean n() {
        return this.z.n();
    }
    
    public final boolean o() {
        return this.z.o();
    }
    
    public final boolean p() {
        return this.z.p();
    }
    
    public final void setGroupDividerEnabled(final boolean groupDividerEnabled) {
        this.z.setGroupDividerEnabled(groupDividerEnabled);
    }
    
    public final SubMenu setHeaderIcon(final int n) {
        this.z(0, (CharSequence)null, n, (Drawable)null, (View)null);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderIcon(final Drawable drawable) {
        this.z(0, (CharSequence)null, 0, drawable, (View)null);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final int n) {
        this.z(n, (CharSequence)null, 0, (Drawable)null, (View)null);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final CharSequence charSequence) {
        this.z(0, charSequence, 0, (Drawable)null, (View)null);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderView(final View view) {
        this.z(0, (CharSequence)null, 0, (Drawable)null, view);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final int icon) {
        this.A.setIcon(icon);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final Drawable icon) {
        this.A.setIcon(icon);
        return (SubMenu)this;
    }
    
    public final void setQwertyMode(final boolean qwertyMode) {
        this.z.setQwertyMode(qwertyMode);
    }
    
    public final void y(final e$a e$a) {
        this.z.y(e$a);
    }
}
