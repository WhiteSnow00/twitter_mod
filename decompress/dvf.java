import android.view.animation.Interpolator;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvf implements xx0$a
{
    public final View a;
    
    public dvf(final View a) {
        this.a = a;
    }
    
    public final void a() {
        this.c(1.0f, 0.0f);
    }
    
    public final void b() {
        this.c(0.0f, 1.0f);
    }
    
    public final void c(final float n, final float n2) {
        final bax c = p5x.c(this.a);
        c.n();
        c.a(n2);
        final bvf bvf = new bvf(this, n);
        final View view = (View)c.a.get();
        if (view != null) {
            bax$b.c(view.animate(), (Runnable)bvf);
        }
        c.m((Runnable)new cvf(this, n2));
        c.f((Interpolator)new nsa());
        c.e(150L);
    }
}
