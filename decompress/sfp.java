// 
// Decompiled by Procyon v0.6.0
// 

public final class sfp
{
    public final bcc a;
    public final long b;
    
    public sfp(final bcc a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof sfp)) {
            return false;
        }
        final sfp sfp = (sfp)o;
        return this.a == sfp.a && kgj.b(this.b, sfp.b);
    }
    
    @Override
    public final int hashCode() {
        return kgj.f(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("SelectionHandleInfo(handle=");
        f.append(this.a);
        f.append(", position=");
        f.append((Object)kgj.j(this.b));
        f.append(')');
        return f.toString();
    }
}
