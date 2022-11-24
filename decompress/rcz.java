// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rcz extends ocz
{
    public boolean G0;
    
    public rcz(m9z f0) {
        super(f0, 0);
        f0 = super.F0;
        ++f0.j1;
    }
    
    public void h() {
    }
    
    public abstract boolean i();
    
    public final void j() {
        if (this.m()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
    
    public final void k() {
        if (!this.G0) {
            if (!this.i()) {
                super.F0.f();
                this.G0 = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public final void l() {
        if (!this.G0) {
            this.h();
            super.F0.f();
            this.G0 = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public final boolean m() {
        return this.G0;
    }
}
