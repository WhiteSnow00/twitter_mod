// 
// Decompiled by Procyon v0.6.0
// 

public abstract class d5o
{
    public static final class a extends d5o
    {
        public final long a;
        
        public a(final long a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && this.a == ((a)o).a);
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            return (int)(a ^ a >>> 32);
        }
        
        @Override
        public final String toString() {
            return tok.g("ConfirmSchedule(scheduledStartTime=", this.a, ")");
        }
    }
    
    public static final class b extends d5o
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c extends d5o
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
}
