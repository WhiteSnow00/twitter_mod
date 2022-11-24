import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public interface p1k
{
    public static final a Companion = a.a;
    
    boolean P();
    
    boolean Q();
    
    dwt R();
    
    p16 S();
    
    b T();
    
    boolean U(final kjr p0);
    
    long V();
    
    boolean W();
    
    List<c> X();
    
    int Y();
    
    long Z();
    
    boolean a0();
    
    boolean b0(final String p0);
    
    boolean cancel();
    
    String getName();
    
    boolean stop();
    
    public static final class a
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b
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
            return c0e.h("ExecutionContext(threadName=", this.a, ")");
        }
    }
    
    public static final class c
    {
        public final long a;
        public final String b;
        
        public c(final long a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return this.a == c.a && e0e.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            return this.b.hashCode() + (int)(a ^ a >>> 32) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder b = snp.b("PctAnnotation(time=", this.a, ", description=", this.b);
            b.append(")");
            return b.toString();
        }
    }
}
