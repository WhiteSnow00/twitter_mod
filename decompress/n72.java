import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class n72<T>
{
    public static final class a<T> extends n72<T>
    {
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            Objects.requireNonNull(o);
            return e0e.a((Object)null, (Object)null);
        }
        
        @Override
        public final int hashCode() {
            throw null;
        }
        
        @Override
        public final String toString() {
            return "And(operands=null)";
        }
    }
    
    public static final class b<T> extends n72<T>
    {
        public final T a;
        
        public b(final T a) {
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
            return ad.z(ehk.f("Element(value="), this.a, ')');
        }
    }
    
    public static final class c extends n72
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d<T> extends n72<T>
    {
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            Objects.requireNonNull(o);
            return e0e.a((Object)null, (Object)null);
        }
        
        @Override
        public final int hashCode() {
            throw null;
        }
        
        @Override
        public final String toString() {
            return "Not(operand=null)";
        }
    }
    
    public static final class e<T> extends n72<T>
    {
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            Objects.requireNonNull(o);
            return e0e.a((Object)null, (Object)null);
        }
        
        @Override
        public final int hashCode() {
            throw null;
        }
        
        @Override
        public final String toString() {
            rr4.I1((Iterable)null, (CharSequence)" | ", (CharSequence)null, (CharSequence)null, (stb)null, 62);
            throw null;
        }
    }
    
    public static final class f extends n72
    {
        public static final f a;
        
        static {
            a = new f();
        }
    }
}
