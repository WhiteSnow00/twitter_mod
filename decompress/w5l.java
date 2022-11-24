// 
// Decompiled by Procyon v0.6.0
// 

public abstract class w5l implements sdw
{
    public static final class a extends w5l
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends w5l
    {
        public final boolean a;
        
        public b(final boolean a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.a == ((b)o).a);
        }
        
        @Override
        public final int hashCode() {
            int a;
            if ((a = (this.a ? 1 : 0)) != 0) {
                a = 1;
            }
            return a;
        }
        
        @Override
        public final String toString() {
            return jba.o("CategorySwitchClicked(checked=", this.a, ")");
        }
    }
    
    public static final class c extends w5l
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d extends w5l
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e extends w5l
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
}
