import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qug
{
    public final int a;
    public final int b;
    public final List<a> c;
    
    public qug(final int a, final int b, final List<a> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qug)) {
            return false;
        }
        final qug qug = (qug)o;
        return this.a == qug.a && this.b == qug.b && zzd.a((Object)this.c, (Object)qug.c);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final List<a> c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return (a * 31 + b) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return gp.A(sbl.j("MediaEntityOriginalInfo(width=", this.a, ", height=", this.b, ", focus_rects="), (List)this.c, ")");
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        
        public a(final int a, final int b, final int c, final int d) {
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
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.b == a.b && this.c == a.c && this.d == a.d;
        }
        
        @Override
        public final int hashCode() {
            return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
        }
        
        @Override
        public final String toString() {
            final int a = this.a;
            final int b = this.b;
            final int c = this.c;
            final int d = this.d;
            final StringBuilder j = sbl.j("Focus_rect(x=", a, ", y=", b, ", w=");
            j.append(c);
            j.append(", h=");
            j.append(d);
            j.append(")");
            return j.toString();
        }
    }
}
