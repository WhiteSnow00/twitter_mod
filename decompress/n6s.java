// 
// Decompiled by Procyon v0.6.0
// 

public final class n6s
{
    public final String a;
    public final int b;
    public final int c;
    
    public n6s(final String a, final int b, final int c) {
        e0e.f((Object)a, "workSpecId");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n6s)) {
            return false;
        }
        final n6s n6s = (n6s)o;
        return e0e.a((Object)this.a, (Object)n6s.a) && this.b == n6s.b && this.c == n6s.c;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 31 + this.b) * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("SystemIdInfo(workSpecId=");
        f.append(this.a);
        f.append(", generation=");
        f.append(this.b);
        f.append(", systemId=");
        return gwl.x(f, this.c, ')');
    }
}
