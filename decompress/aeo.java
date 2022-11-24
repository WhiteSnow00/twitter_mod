// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aeo
{
    public static final class a extends aeo
    {
        public final String a;
        
        public a(final String a) {
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
            return c0e.h("IsInRoom(roomId=", jpn.a(this.a), ")");
        }
    }
    
    public static final class b extends aeo
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
}
