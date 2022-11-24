// 
// Decompiled by Procyon v0.6.0
// 

public interface klc
{
    public static final class a implements klc
    {
        public final mlc$b a;
        
        public a(final mlc$b a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && e0e.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final mlc$b a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("AudioSpaceClicked(item=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b implements klc
    {
        public final String a;
        
        public b(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && e0e.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return c0e.h("LoadMoreClicked(cursor=", this.a, ")");
        }
    }
    
    public static final class c implements klc
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
}
