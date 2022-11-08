import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z41 implements w41
{
    public final zml<Boolean> b;
    public final wax<z41.z41$a> c;
    public int d;
    
    public z41(final ViewGroup viewGroup) {
        this.b = (zml<Boolean>)new zml();
        this.d = 1;
        final wax c = new wax((View)viewGroup, 2131427687, 2131427687, (bra)y41.b);
        this.c = (wax<z41.z41$a>)c;
        ((n9q)c.d).G((fk6)new i0p((Object)this, 2), (fk6)jvb.e);
        if (!bp7.E()) {
            c.h();
        }
    }
    
    @Override
    public final void c() {
        if (this.c.i()) {
            final z41.z41$a z41$a = (z41.z41$a)this.c.f;
            pf8.r(z41$a);
            z41$a.a.setVisibility(8);
            z41$a.a.setAlpha(1.0f);
            z41$a.b.setImageResource(17170445);
            ((View)z41$a.b).setContentDescription((CharSequence)null);
        }
    }
    
    @Override
    public final void d(final boolean b) {
        if (b) {
            ((n9q)this.c.d).G((fk6)new j0p((Object)this, 2), (fk6)jvb.e);
        }
        else {
            ((n9q)this.c.d).G((fk6)new kd1((Object)this, 1), (fk6)jvb.e);
        }
    }
    
    @Override
    public final void e() {
        final z41.z41$a z41$a = (z41.z41$a)this.c.h();
        int n;
        if (mlw.m()) {
            n = 100;
        }
        else {
            n = 300;
        }
        ic0.d(z41$a.a, n);
    }
    
    @Override
    public final void f() {
        final z41.z41$a z41$a = (z41.z41$a)this.c.f;
        if (z41$a != null) {
            int n;
            if (mlw.m()) {
                n = 100;
            }
            else {
                n = 300;
            }
            ic0.g(z41$a.a, n);
        }
    }
    
    @Override
    public final void g() {
        ((n9q)this.c.d).G((fk6)x41.D0, (fk6)jvb.e);
    }
    
    @Override
    public final b5j<Boolean> h() {
        return (b5j<Boolean>)this.b;
    }
}
