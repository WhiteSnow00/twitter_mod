// 
// Decompiled by Procyon v0.6.0
// 

public final class szv implements dqx
{
    public final dqx a;
    public final dqx b;
    
    public szv(final dqx a, final dqx b) {
        e0e.f((Object)b, "second");
        this.a = a;
        this.b = b;
    }
    
    public final int a(final rp8 rp8) {
        e0e.f((Object)rp8, "density");
        return Math.max(this.a.a(rp8), this.b.a(rp8));
    }
    
    public final int b(final rp8 rp8, final cwe cwe) {
        e0e.f((Object)rp8, "density");
        e0e.f((Object)cwe, "layoutDirection");
        return Math.max(this.a.b(rp8, cwe), this.b.b(rp8, cwe));
    }
    
    public final int c(final rp8 rp8) {
        e0e.f((Object)rp8, "density");
        return Math.max(this.a.c(rp8), this.b.c(rp8));
    }
    
    public final int d(final rp8 rp8, final cwe cwe) {
        e0e.f((Object)rp8, "density");
        e0e.f((Object)cwe, "layoutDirection");
        return Math.max(this.a.d(rp8, cwe), this.b.d(rp8, cwe));
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof szv)) {
            return false;
        }
        final szv szv = (szv)o;
        if (!e0e.a((Object)szv.a, (Object)this.a) || !e0e.a((Object)szv.b, (Object)this.b)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder a = po.A('(');
        a.append(this.a);
        a.append(" \u222a ");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
