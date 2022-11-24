import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hu1
{
    public static final b Companion;
    public final List<yu1> a;
    
    static {
        Companion = new b();
    }
    
    public hu1(final List<yu1> a) {
        e0e.f((Object)a, "metadataContexts");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof hu1 && e0e.a((Object)this.a, (Object)((hu1)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return rh.x("BceHierarchyContext(metadataContexts=", (List)this.a, ")");
    }
    
    public static final class a extends k5j<hu1>
    {
        public static final a b;
        
        static {
            b = new a();
        }
        
        public final Object d(final rmp rmp, final int n) {
            e0e.f((Object)rmp, "input");
            final List list = (List)((k5j)new ar4$a((nmp)yu1$a.b)).a(rmp);
            hu1 hu1;
            if (list != null) {
                hu1 = new hu1(list);
            }
            else {
                hu1 = new hu1((List<yu1>)h3a.F0);
            }
            return hu1;
        }
        
        public final void f(final smp smp, final Object o) {
            final hu1 hu1 = (hu1)o;
            e0e.f((Object)smp, "output");
            e0e.f((Object)hu1, "bceHierarchyContext");
            ((k5j)new ar4$a((nmp)yu1$a.b)).c(smp, (Object)hu1.a);
            final int a = o5j.a;
        }
    }
    
    public static final class b
    {
    }
}
