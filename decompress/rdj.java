// 
// Decompiled by Procyon v0.6.0
// 

public final class rdj
{
    public static final rdj.rdj$a b;
    public final b a;
    
    static {
        b = new rdj.rdj$a();
    }
    
    public rdj(final b a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof rdj && this.a == ((rdj)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final b a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("OcfFooter(style=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
    
    public enum b
    {
        public static final a Companion;
        
        G0("fixed");
        
        public static final b[] H0;
        public final String F0;
        
        static {
            Companion = new a();
        }
        
        public b(final String f0) {
            this.F0 = f0;
        }
        
        public static final class a
        {
        }
    }
}
