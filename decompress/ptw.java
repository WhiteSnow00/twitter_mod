import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ptw
{
    public final List<a> a;
    
    public ptw(final List<a> a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ptw && czd.a((Object)this.a, (Object)((ptw)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return wc0.z("VerticalStackLayout(components=", (List)this.a, ")");
    }
    
    public static final class a
    {
        public final String a;
        public final o06 b;
        
        public a(final String a, final o06 b) {
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
            return czd.a((Object)this.a, (Object)a.a) && czd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final o06 b = this.b;
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
