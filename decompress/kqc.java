import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqc
{
    public final List<a> a;
    
    public kqc(final List<a> a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kqc && zzd.a((Object)this.a, (Object)((kqc)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return du1.x("HorizontalCompactLayout(components=", (List)this.a, ")");
    }
    
    public static final class a
    {
        public final String a;
        public final e16 b;
        
        public a(final String a, final e16 b) {
            this.a = a;
            this.b = b;
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
            return zzd.a((Object)this.a, (Object)a.a) && zzd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final e16 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Component(__typename=");
            sb.append(a);
            sb.append(", component=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
