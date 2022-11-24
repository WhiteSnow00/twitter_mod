import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class p8x implements eo6, hfc
{
    public final k9x F0;
    public final e39 G0;
    public vn6 H0;
    public boolean I0;
    public boolean J0;
    
    public p8x(final k9x f0) {
        this.G0 = new e39();
        this.F0 = f0;
    }
    
    public final void C1(final View view) {
        this.z1((vn6)rml.b((eo6)this, view));
    }
    
    public final void D1(final int n, final p8x p8x) {
        final View viewById = this.c().getView().findViewById(n);
        if (viewById != null) {
            p8x.C1(viewById);
            return;
        }
        throw new IllegalStateException("Couldn't find a view for this host");
    }
    
    public void G2() {
    }
    
    public final vn6 c() {
        final vn6 h0 = this.H0;
        if (h0 != null) {
            return h0;
        }
        throw new IllegalStateException("Content view has not been set.");
    }
    
    public final k9x i() {
        return this.F0;
    }
    
    public void o2() {
    }
    
    public void w1() {
    }
    
    public void x1() {
    }
    
    public void y1() {
    }
    
    public final void z1(final vn6 h0) {
        this.H0 = h0;
        if (!this.G0.b()) {
            this.G0.c((b39)new de6(new b39[] { this.F0.d().subscribe((rk6)new ces((Object)this, 22)), this.F0.g().subscribe((rk6)new bes((Object)this, 20)), this.F0.l().subscribe((rk6)new dbg(this, 20)), this.F0.o().subscribe((rk6)new u1p((Object)this, 17)), this.F0.b().subscribe((rk6)new w1p((Object)this, 15)) }));
        }
    }
}
