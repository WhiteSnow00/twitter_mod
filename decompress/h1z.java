// 
// Decompiled by Procyon v0.6.0
// 

public abstract class h1z extends lwy
{
    public boolean D0;
    
    public h1z(y7z c0) {
        super(c0);
        c0 = super.C0;
        ++c0.g1;
    }
    
    public final void h() {
        if (this.D0) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
    
    public final void i() {
        if (!this.D0) {
            if (!this.j()) {
                super.C0.f();
                this.D0 = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public abstract boolean j();
}
