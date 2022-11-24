import android.util.Log;
import android.view.SubMenu;
import android.view.MenuItem;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cl
{
    public a a;
    
    public boolean a() {
        return false;
    }
    
    public boolean b() {
        return true;
    }
    
    public abstract View c();
    
    public View d(final MenuItem menuItem) {
        return this.c();
    }
    
    public boolean e() {
        return false;
    }
    
    public void f(final SubMenu subMenu) {
    }
    
    public boolean g() {
        return false;
    }
    
    public void h(final a a) {
        if (this.a != null) {
            final StringBuilder f = ehk.f("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            f.append(this.getClass().getSimpleName());
            f.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", f.toString());
        }
        this.a = a;
    }
    
    public interface a
    {
    }
}
