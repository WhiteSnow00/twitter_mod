// 
// Decompiled by Procyon v0.6.0
// 

public final class gb1 extends ntd
{
    public final String a;
    public final long b;
    public final long c;
    
    public gb1(final String a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final String a() {
        return this.a;
    }
    
    public final long b() {
        return this.c;
    }
    
    public final long c() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof ntd) {
            final ntd ntd = (ntd)o;
            if (!this.a.equals(ntd.a()) || this.b != ntd.c() || this.c != ntd.b()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final long c = this.c;
        return ((hashCode ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ (int)(c ^ c >>> 32);
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("InstallationTokenResult{token=");
        f.append(this.a);
        f.append(", tokenExpirationTimestamp=");
        f.append(this.b);
        f.append(", tokenCreationTimestamp=");
        return ang.c(f, this.c, "}");
    }
}
