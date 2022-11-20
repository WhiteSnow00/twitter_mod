// 
// Decompiled by Procyon v0.6.0
// 

public final class gec implements fqw
{
    public int a;
    
    public gec() {
        this.a = 1;
    }
    
    public gec(final int a) {
        this.a = a;
    }
    
    public boolean a() {
        return false;
    }
    
    public int b() {
        return this.a;
    }
    
    public int c() {
        return 0;
    }
    
    public kc0 d(final kc0 kc0, final kc0 kc2, final kc0 kc3) {
        return oqf.a((bqw)this, kc0, kc2, kc3);
    }
    
    public kc0 e(final long n, final kc0 kc0, final kc0 kc2, final kc0 kc3) {
        czd.f((Object)kc0, "initialValue");
        czd.f((Object)kc2, "targetValue");
        czd.f((Object)kc3, "initialVelocity");
        return kc3;
    }
    
    public kc0 f(final long n, final kc0 kc0, final kc0 kc2, final kc0 kc3) {
        czd.f((Object)kc0, "initialValue");
        czd.f((Object)kc2, "targetValue");
        czd.f((Object)kc3, "initialVelocity");
        if (n < this.a * 1000000L) {
            return kc0;
        }
        return kc2;
    }
    
    public long g(final kc0 kc0, final kc0 kc2, final kc0 kc3) {
        return hee.a((fqw)this, kc0, kc2, kc3);
    }
    
    public gec h(final Object o) {
        final int a = this.a;
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        this.a = 31 * a + hashCode;
        return this;
    }
    
    public gec i(final boolean b) {
        this.a = 31 * this.a + (b ? 1 : 0);
        return this;
    }
}
