// 
// Decompiled by Procyon v0.6.0
// 

public interface hmn
{
    public static final class a implements hmn
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b implements hmn
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c implements hmn
    {
        public final mkc$b a;
        
        public c(final mkc$b a) {
            czd.f((Object)a, "item");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && czd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final mkc$b a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ShowSpaceDetails(item=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
