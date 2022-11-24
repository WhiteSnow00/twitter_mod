// 
// Decompiled by Procyon v0.6.0
// 

public abstract class w7 implements sdw
{
    public static final class a extends w7
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends w7
    {
        public final el6 a;
        
        public b(final el6 a) {
            e0e.f((Object)a, "option");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.a == ((b)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final el6 a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ContactOptionSelected(option=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends w7
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d extends w7
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e extends w7
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
}
