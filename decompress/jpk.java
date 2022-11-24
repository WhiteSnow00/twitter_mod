// 
// Decompiled by Procyon v0.6.0
// 

public final class jpk
{
    public final long a;
    public final long b;
    
    public jpk(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jpk)) {
            return false;
        }
        final jpk jpk = (jpk)o;
        return kgj.b(this.a, jpk.a) && this.b == jpk.b;
    }
    
    @Override
    public final int hashCode() {
        final int f = kgj.f(this.a);
        final long b = this.b;
        return f * 31 + (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("PointAtTime(point=");
        f.append((Object)kgj.j(this.a));
        f.append(", time=");
        f.append(this.b);
        f.append(')');
        return f.toString();
    }
}
