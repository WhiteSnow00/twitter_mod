import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lm5
{
    public static final b Companion;
    public static final lm5.lm5$a b;
    public final List<jm5> a;
    
    static {
        Companion = new b();
        b = new lm5.lm5$a();
    }
    
    public lm5(final List<jm5> a) {
        czd.f((Object)a, "items");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof lm5 && czd.a((Object)this.a, (Object)((lm5)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return wc0.z("CommunityHashtagSlice(items=", (List)this.a, ")");
    }
    
    public static final class b
    {
    }
}
