// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rsm<RES>
{
    public static final class a extends rsm
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b<RES> extends rsm<RES>
    {
        public final RES a;
        
        public b(final RES a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && czd.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            final RES a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            return hee.f("Result(result=", (Object)this.a, ")");
        }
    }
}
