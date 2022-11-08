import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cn5
{
    public static final b Companion;
    public static final cn5.cn5$a b;
    public final List<an5> a;
    
    static {
        Companion = new b();
        b = new cn5.cn5$a();
    }
    
    public cn5(final List<an5> a) {
        zzd.f((Object)a, "items");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof cn5 && zzd.a((Object)this.a, (Object)((cn5)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return du1.x("CommunityHashtagSlice(items=", (List)this.a, ")");
    }
    
    public static final class b
    {
    }
}
