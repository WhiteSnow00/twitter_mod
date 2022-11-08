// 
// Decompiled by Procyon v0.6.0
// 

public final class jce
{
    public final Object a;
    public final Object b;
    
    public jce(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jce)) {
            return false;
        }
        final jce jce = (jce)o;
        return zzd.a(this.a, jce.a) && zzd.a(this.b, jce.b);
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        final boolean b = a instanceof Enum;
        int n = 0;
        int n2;
        if (b) {
            n2 = ((Enum)a).ordinal();
        }
        else if (a != null) {
            n2 = a.hashCode();
        }
        else {
            n2 = 0;
        }
        final Object b2 = this.b;
        if (b2 instanceof Enum) {
            n = ((Enum)b2).ordinal();
        }
        else if (b2 != null) {
            n = b2.hashCode();
        }
        return n2 * 31 + n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("JoinedKey(left=");
        g.append(this.a);
        g.append(", right=");
        return dia.s(g, this.b, ')');
    }
}
