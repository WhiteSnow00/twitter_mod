// 
// Decompiled by Procyon v0.6.0
// 

public final class wmj
{
    public final long a;
    public final String b;
    public final boolean c;
    
    public wmj() {
        this(0L, null, false, 7, null);
    }
    
    public wmj(final long a, final String b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public wmj(final long n, final String s, final boolean b, final int n2, final hg8 hg8) {
        this.a = 0L;
        this.b = null;
        this.c = true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wmj)) {
            return false;
        }
        final wmj wmj = (wmj)o;
        return this.a == wmj.a && zzd.a((Object)this.b, (Object)wmj.b) && this.c == wmj.c;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final String b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (n * 31 + hashCode) * 31 + c;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final boolean c = this.c;
        final StringBuilder h = w48.h("OpenbackExpiration(afterDisplay=", a, ", date=", b);
        h.append(", fallback=");
        h.append(c);
        h.append(")");
        return h.toString();
    }
}
