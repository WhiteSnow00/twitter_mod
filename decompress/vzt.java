// 
// Decompiled by Procyon v0.6.0
// 

public final class vzt
{
    public final xc0 a;
    public final ngj b;
    
    public vzt(final xc0 a, final ngj b) {
        e0e.f((Object)a, "text");
        e0e.f((Object)b, "offsetMapping");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vzt)) {
            return false;
        }
        final xc0 a = this.a;
        final vzt vzt = (vzt)o;
        return e0e.a((Object)a, (Object)vzt.a) && e0e.a((Object)this.b, (Object)vzt.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("TransformedText(text=");
        f.append(this.a);
        f.append(", offsetMapping=");
        f.append(this.b);
        f.append(')');
        return f.toString();
    }
}
