// 
// Decompiled by Procyon v0.6.0
// 

public final class tfa implements dqx
{
    public final dqx a;
    public final dqx b;
    
    public tfa(final dqx a, final dqx b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final rp8 rp8) {
        e0e.f((Object)rp8, "density");
        int n;
        if ((n = this.a.a(rp8) - this.b.a(rp8)) < 0) {
            n = 0;
        }
        return n;
    }
    
    public final int b(final rp8 rp8, final cwe cwe) {
        e0e.f((Object)rp8, "density");
        e0e.f((Object)cwe, "layoutDirection");
        int n;
        if ((n = this.a.b(rp8, cwe) - this.b.b(rp8, cwe)) < 0) {
            n = 0;
        }
        return n;
    }
    
    public final int c(final rp8 rp8) {
        e0e.f((Object)rp8, "density");
        int n;
        if ((n = this.a.c(rp8) - this.b.c(rp8)) < 0) {
            n = 0;
        }
        return n;
    }
    
    public final int d(final rp8 rp8, final cwe cwe) {
        e0e.f((Object)rp8, "density");
        e0e.f((Object)cwe, "layoutDirection");
        int n;
        if ((n = this.a.d(rp8, cwe) - this.b.d(rp8, cwe)) < 0) {
            n = 0;
        }
        return n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof tfa)) {
            return false;
        }
        final tfa tfa = (tfa)o;
        if (!e0e.a((Object)tfa.a, (Object)this.a) || !e0e.a((Object)tfa.b, (Object)this.b)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder a = po.A('(');
        a.append(this.a);
        a.append(" - ");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
