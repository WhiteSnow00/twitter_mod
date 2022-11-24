import android.view.SubMenu;
import android.view.MenuItem;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class tn1
{
    public Object a;
    public Object b;
    public Object c;
    
    public tn1() {
        this.b = new float[2];
        this.c = new int[1];
    }
    
    public tn1(final Context a) {
        this.a = a;
    }
    
    public abstract void c();
    
    public final MenuItem d(MenuItem o) {
        if (o instanceof g0s) {
            final g0s g0s = (g0s)o;
            if (this.b == null) {
                this.b = new z8q();
            }
            if ((o = ((z8q)this.b).getOrDefault((Object)g0s, (Object)null)) == null) {
                o = new s5h((Context)this.a, g0s);
                ((z8q)this.b).put((Object)g0s, o);
            }
            return (MenuItem)o;
        }
        return (MenuItem)o;
    }
    
    public final SubMenu e(SubMenu o) {
        if (o instanceof n0s) {
            final n0s n0s = (n0s)o;
            if (this.c == null) {
                this.c = new z8q();
            }
            if ((o = ((z8q)this.c).getOrDefault((Object)n0s, (Object)null)) == null) {
                o = new qmr((Context)this.a, n0s);
                ((z8q)this.c).put((Object)n0s, o);
            }
            return (SubMenu)o;
        }
        return (SubMenu)o;
    }
    
    public abstract void f();
    
    public abstract void g(final d80 p0);
    
    public abstract void h();
    
    public abstract void i();
    
    public abstract void j();
}
