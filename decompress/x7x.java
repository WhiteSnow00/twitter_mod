import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class x7x implements ym6, fec
{
    public final r8x D0;
    public final w19 E0;
    public pm6 F0;
    public boolean G0;
    public boolean H0;
    
    public x7x(final r8x d0) {
        this.E0 = new w19();
        this.D0 = d0;
    }
    
    public final void C1(final View view) {
        this.z1((pm6)fml.b((ym6)this, view));
    }
    
    public final void D1(final int n, final x7x x7x) {
        final View viewById = this.c().getView().findViewById(n);
        if (viewById != null) {
            x7x.C1(viewById);
            return;
        }
        throw new IllegalStateException("Couldn't find a view for this host");
    }
    
    public void G2() {
    }
    
    @Override
    public final pm6 c() {
        final pm6 f0 = this.F0;
        if (f0 != null) {
            return f0;
        }
        throw new IllegalStateException("Content view has not been set.");
    }
    
    public final r8x i() {
        return this.D0;
    }
    
    public void o2() {
    }
    
    public void w1() {
    }
    
    public void x1() {
    }
    
    public void y1() {
    }
    
    public final void z1(final pm6 f0) {
        this.F0 = f0;
        if (!this.E0.b()) {
            this.E0.c((t19)new wc6(new t19[] { this.D0.d().subscribe((lj6)new y0p((Object)this, 17)), this.D0.g().subscribe((lj6)new hd1((Object)this, 14)), this.D0.k().subscribe((lj6)new hoa(this, 16)), this.D0.o().subscribe((lj6)new vgd(this, 15)), this.D0.b().subscribe((lj6)new ydm((Object)this, 15)) }));
        }
    }
}
