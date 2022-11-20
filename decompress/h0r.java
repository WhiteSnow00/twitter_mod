// 
// Decompiled by Procyon v0.6.0
// 

public final class h0r
{
    public final Object a;
    public final int b;
    public final int c;
    
    public h0r(final Object a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h0r)) {
            return false;
        }
        final h0r h0r = (h0r)o;
        return czd.a(this.a, h0r.a) && this.b == h0r.b && this.c == h0r.c;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 31 + this.b) * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("SpanRange(span=");
        j.append(this.a);
        j.append(", start=");
        j.append(this.b);
        j.append(", end=");
        return x70.C(j, this.c, ')');
    }
}
