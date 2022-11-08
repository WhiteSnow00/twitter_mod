import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tdp
{
    public final a a;
    public final a b;
    public final boolean c;
    
    public tdp(final a a, final a b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static tdp a(final tdp tdp, a a, a b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = tdp.a;
        }
        if ((n & 0x2) != 0x0) {
            b = tdp.b;
        }
        final boolean b2 = (n & 0x4) != 0x0 && tdp.c;
        Objects.requireNonNull(tdp);
        zzd.f((Object)a, "start");
        zzd.f((Object)b, "end");
        return new tdp(a, b, b2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tdp)) {
            return false;
        }
        final tdp tdp = (tdp)o;
        return zzd.a((Object)this.a, (Object)tdp.a) && zzd.a((Object)this.b, (Object)tdp.b) && this.c == tdp.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (hashCode2 + hashCode * 31) * 31 + c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("Selection(start=");
        g.append(this.a);
        g.append(", end=");
        g.append(this.b);
        g.append(", handlesCrossed=");
        return wa.z(g, this.c, ')');
    }
    
    public static final class a
    {
        public final aqm a;
        public final int b;
        public final long c;
        
        public a(final aqm a, final int b, final long c) {
            zzd.f((Object)a, "direction");
            this.a = a;
            this.b = b;
            this.c = c;
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
            return this.a == a.a && this.b == a.b && this.c == a.c;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final int b = this.b;
            final long c = this.c;
            return (hashCode * 31 + b) * 31 + (int)(c ^ c >>> 32);
        }
        
        @Override
        public final String toString() {
            final StringBuilder g = w48.g("AnchorInfo(direction=");
            g.append(this.a);
            g.append(", offset=");
            g.append(this.b);
            g.append(", selectableId=");
            g.append(this.c);
            g.append(')');
            return g.toString();
        }
    }
}
