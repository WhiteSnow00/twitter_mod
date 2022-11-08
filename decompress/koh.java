// 
// Decompiled by Procyon v0.6.0
// 

public abstract class koh
{
    public static final b Companion;
    
    static {
        Companion = new b();
    }
    
    @Override
    public String toString() {
        String o;
        if ((o = g9m.a((Class)this.getClass()).o()) == null) {
            o = "null";
        }
        return o;
    }
    
    public static final class a extends koh
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b
    {
    }
    
    public static final class c extends koh
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d extends koh
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e extends koh
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
    
    public static final class f extends koh
    {
        public static final f a;
        
        static {
            a = new f();
        }
    }
    
    public static final class g extends koh
    {
        public final String a;
        
        public g(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof g && zzd.a((Object)this.a, (Object)((g)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("Unknown(moduleName=", this.a, ")");
        }
    }
}
