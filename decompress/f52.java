// 
// Decompiled by Procyon v0.6.0
// 

public final class f52
{
    public final String a;
    public final String b;
    public boolean c;
    public final zh1 d;
    
    public f52(final String a, final String b, final boolean c, final zh1 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f52)) {
            return false;
        }
        final f52 f52 = (f52)o;
        return e0e.a((Object)this.a, (Object)f52.a) && e0e.a((Object)this.b, (Object)f52.b) && this.c == f52.c && e0e.a((Object)this.d, (Object)f52.d);
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.b, this.a.hashCode() * 31, 31);
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        final zh1 d2 = this.d;
        int hashCode;
        if (d2 == null) {
            hashCode = 0;
        }
        else {
            hashCode = d2.hashCode();
        }
        return (d + c) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final boolean c = this.c;
        final zh1 d = this.d;
        final StringBuilder k = l58.k("BookmarkFolder(id=", a, ", title=", b, ", isAdded=");
        k.append(c);
        k.append(", media=");
        k.append(d);
        k.append(")");
        return k.toString();
    }
}
