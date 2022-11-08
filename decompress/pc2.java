// 
// Decompiled by Procyon v0.6.0
// 

public interface pc2
{
    public static final class a implements pc2
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b implements pc2
    {
        public final int a;
        
        public b(final int a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.a == ((b)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a;
        }
        
        @Override
        public final String toString() {
            return ffa.k("SetFrame(frame=", this.a, ")");
        }
    }
}
