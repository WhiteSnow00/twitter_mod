import android.view.View;
import android.view.Menu;

// 
// Decompiled by Procyon v0.6.0
// 

public final class km8 implements c8p
{
    public final g8p C0;
    public Menu D0;
    public fai E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    
    public km8(final g8p c0) {
        this.H0 = 0;
        this.C0 = c0;
    }
    
    @Override
    public final boolean a() {
        return this.C0.a();
    }
    
    @Override
    public final boolean b() {
        this.G0 = false;
        return this.C0.b();
    }
    
    @Override
    public final void c(final CharSequence charSequence) {
        this.C0.q(charSequence, false);
    }
    
    @Override
    public final boolean d() {
        return this.C0.d();
    }
    
    @Override
    public final void e(final View view) {
        this.C0.e(view);
    }
    
    @Override
    public final boolean f() {
        this.G0 = true;
        this.m();
        return this.C0.f();
    }
    
    @Override
    public final void g(final i9p g1) {
        this.C0.g1 = g1;
    }
    
    @Override
    public final void h(final View view) {
        this.C0.h(view);
    }
    
    @Override
    public final void i(final n8p h1) {
        this.C0.h1 = h1;
    }
    
    @Override
    public final void j(final d8p d8p) {
        this.C0.j(d8p);
        if (d8p.b) {
            this.m();
        }
    }
    
    @Override
    public final void k(final fai e0, final Menu d0, int h0) {
        this.E0 = e0;
        final int n = 0;
        this.F0 = false;
        this.D0 = d0;
        this.H0 = h0;
        Label_0057: {
            if (!this.G0) {
                final d8p j1 = this.C0.j1;
                h0 = n;
                if (j1 == null) {
                    break Label_0057;
                }
                h0 = n;
                if (!j1.b) {
                    break Label_0057;
                }
            }
            h0 = 1;
        }
        if (h0 != 0) {
            this.m();
        }
    }
    
    @Override
    public final d8p l() {
        return this.C0.j1;
    }
    
    public final void m() {
        if (!this.F0) {
            final fai e0 = this.E0;
            if (e0 != null) {
                final Menu d0 = this.D0;
                if (d0 != null) {
                    final int h0 = this.H0;
                    if (h0 != 0) {
                        this.C0.k(e0, d0, h0);
                        this.F0 = true;
                    }
                }
            }
        }
    }
}
