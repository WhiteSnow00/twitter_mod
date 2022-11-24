import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a51 implements x41
{
    public final znl<Boolean> b;
    public final kcx<a51.a51$a> c;
    public int d;
    
    public a51(final ViewGroup viewGroup) {
        this.b = (znl<Boolean>)new znl();
        this.d = 1;
        final kcx c = new kcx((View)viewGroup, 2131427687, 2131427687, (gra)z41.b);
        this.c = (kcx<a51.a51$a>)c;
        ((bbq)c.d).G((rk6)new u1p((Object)this, 2), (rk6)lvb.e);
        if (!xd.Z0()) {
            c.h();
        }
    }
    
    public final void b() {
        if (this.c.i()) {
            final a51.a51$a a51$a = (a51.a51$a)this.c.f;
            vmw.g((Object)a51$a);
            a51$a.a.setVisibility(8);
            a51$a.a.setAlpha(1.0f);
            a51$a.b.setImageResource(17170445);
            ((View)a51$a.b).setContentDescription((CharSequence)null);
        }
    }
    
    public final void c(final boolean b) {
        if (b) {
            ((bbq)this.c.d).G((rk6)new v1p((Object)this, 2), (rk6)lvb.e);
        }
        else {
            ((bbq)this.c.d).G((rk6)new kd1((Object)this, 1), (rk6)lvb.e);
        }
    }
    
    public final void d() {
        final a51.a51$a a51$a = (a51.a51$a)this.c.h();
        int n;
        if (lp7.U()) {
            n = 100;
        }
        else {
            n = 300;
        }
        fc0.d(a51$a.a, n);
    }
    
    public final void e() {
        final a51.a51$a a51$a = (a51.a51$a)this.c.f;
        if (a51$a != null) {
            int n;
            if (lp7.U()) {
                n = 100;
            }
            else {
                n = 300;
            }
            fc0.g(a51$a.a, n);
        }
    }
    
    public final void f() {
        ((bbq)this.c.d).G((rk6)y41.G0, (rk6)lvb.e);
    }
    
    public final t5j<Boolean> g() {
        return (t5j<Boolean>)this.b;
    }
}
