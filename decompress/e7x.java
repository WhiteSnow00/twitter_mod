import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class e7x implements sn6, ffc
{
    public final z7x C0;
    public final m29 D0;
    public jn6 E0;
    public boolean F0;
    public boolean G0;
    
    public e7x(final z7x c0) {
        this.D0 = new m29();
        this.C0 = c0;
    }
    
    public final void C1(final View view) {
        this.z1((jn6)sll.b((sn6)this, view));
    }
    
    public final void D1(final int n, final e7x e7x) {
        final View viewById = this.c().getView().findViewById(n);
        if (viewById != null) {
            e7x.C1(viewById);
            return;
        }
        throw new IllegalStateException("Couldn't find a view for this host");
    }
    
    public void G2() {
    }
    
    public final jn6 c() {
        final jn6 e0 = this.E0;
        if (e0 != null) {
            return e0;
        }
        throw new IllegalStateException("Content view has not been set.");
    }
    
    public final z7x i() {
        return this.C0;
    }
    
    public void o2() {
    }
    
    public void w1() {
    }
    
    public void x1() {
    }
    
    public void y1() {
    }
    
    public final void z1(final jn6 e0) {
        this.E0 = e0;
        if (!this.D0.b()) {
            this.D0.c((j29)new rd6(new j29[] { this.C0.d().subscribe((fk6)new kd1((Object)this, 14)), this.C0.g().subscribe((fk6)new jpa((Object)this, 15)), this.C0.l().subscribe((fk6)new shd((Object)this, 17)), this.C0.o().subscribe((fk6)new gdm((Object)this, 14)), this.C0.b().subscribe((fk6)new pcs((Object)this, 18)) }));
        }
    }
}
