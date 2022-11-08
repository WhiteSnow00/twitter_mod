// 
// Decompiled by Procyon v0.6.0
// 

public final class m73 implements dp8
{
    public is2 C0;
    public jd9 D0;
    
    public m73() {
        this.C0 = (is2)e2a.C0;
    }
    
    public final /* synthetic */ float V(final long n) {
        return x30.f((dp8)this, n);
    }
    
    public final long c() {
        return this.C0.c();
    }
    
    public final jd9 d(final rtb<? super sl6, oyv> rtb) {
        zzd.f((Object)rtb, "block");
        return this.D0 = new jd9(rtb);
    }
    
    public final float getDensity() {
        return this.C0.getDensity().getDensity();
    }
    
    public final tve getLayoutDirection() {
        return this.C0.getLayoutDirection();
    }
    
    public final float m0(final int n) {
        return n / this.getDensity();
    }
    
    public final float n0(final float n) {
        return n / this.getDensity();
    }
    
    public final float p0() {
        return this.C0.getDensity().p0();
    }
    
    public final float t0(final float n) {
        return this.getDensity() * n;
    }
    
    public final int w0(final long n) {
        return q0b.p(this.V(n));
    }
}
