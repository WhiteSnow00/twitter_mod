// 
// Decompiled by Procyon v0.6.0
// 

public final class hx9
{
    public final String a;
    public final long b;
    
    public hx9(final String a, final long b) {
        czd.f((Object)a, "flag");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hx9)) {
            return false;
        }
        final hx9 hx9 = (hx9)o;
        return czd.a((Object)this.a, (Object)hx9.a) && this.b == hx9.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return hashCode * 31 + (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final StringBuilder l = fu8.l("EducationFlag(flag=", this.a, ", timestamp=", this.b);
        l.append(")");
        return l.toString();
    }
}
