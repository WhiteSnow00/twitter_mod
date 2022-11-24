// 
// Decompiled by Procyon v0.6.0
// 

public final class v4l
{
    public static final b Companion;
    public static final nmp<v4l> d;
    public final String a;
    public final Integer b;
    public final boolean c;
    
    static {
        Companion = new b();
        v4l.d = v4l.v4l$c.c;
    }
    
    public v4l(final String a, final Integer b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof v4l)) {
            return false;
        }
        final v4l v4l = (v4l)o;
        return e0e.a((Object)this.a, (Object)v4l.a) && e0e.a((Object)this.b, (Object)v4l.b) && this.c == v4l.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Integer b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (hashCode * 31 + hashCode2) * 31 + c;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final Integer b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("ProfessionalCategory(name=");
        sb.append(a);
        sb.append(", id=");
        sb.append(b);
        sb.append(", display=");
        return xj0.B(sb, c, ")");
    }
    
    public static final class b
    {
    }
}
