// 
// Decompiled by Procyon v0.6.0
// 

public final class bb1 extends hea
{
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    
    public bb1(final long b, final int c, final int d, final long e, final int f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final int a() {
        return this.d;
    }
    
    public final long b() {
        return this.e;
    }
    
    public final int c() {
        return this.c;
    }
    
    public final int d() {
        return this.f;
    }
    
    public final long e() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof hea) {
            final hea hea = (hea)o;
            if (this.b != hea.e() || this.c != hea.c() || this.d != hea.a() || this.e != hea.b() || this.f != hea.d()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final int c = this.c;
        final int d = this.d;
        final long e = this.e;
        return this.f ^ ((((n ^ 0xF4243) * 1000003 ^ c) * 1000003 ^ d) * 1000003 ^ (int)(e >>> 32 ^ e)) * 1000003;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("EventStoreConfig{maxStorageSizeInBytes=");
        f.append(this.b);
        f.append(", loadBatchSize=");
        f.append(this.c);
        f.append(", criticalSectionEnterTimeoutMs=");
        f.append(this.d);
        f.append(", eventCleanUpAge=");
        f.append(this.e);
        f.append(", maxBlobByteSizePerRow=");
        return ad.y(f, this.f, "}");
    }
}
