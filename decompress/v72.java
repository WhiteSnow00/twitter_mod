// 
// Decompiled by Procyon v0.6.0
// 

public final class v72
{
    public m6d a;
    public ah3 b;
    public bh3 c;
    public c0k d;
    
    public v72() {
        this(null, null, null, null, 15, null);
    }
    
    public v72(final m6d m6d, final ah3 ah3, final bh3 bh3, final c0k c0k, final int n, final wg8 wg8) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof v72)) {
            return false;
        }
        final v72 v72 = (v72)o;
        return e0e.a((Object)this.a, (Object)v72.a) && e0e.a((Object)this.b, (Object)v72.b) && e0e.a((Object)this.c, (Object)v72.c) && e0e.a((Object)this.d, (Object)v72.d);
    }
    
    @Override
    public final int hashCode() {
        final m6d a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final ah3 b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final bh3 c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final c0k d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("BorderCache(imageBitmap=");
        f.append(this.a);
        f.append(", canvas=");
        f.append(this.b);
        f.append(", canvasDrawScope=");
        f.append(this.c);
        f.append(", borderPath=");
        f.append(this.d);
        f.append(')');
        return f.toString();
    }
}
