import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qo4
{
    public static final b Companion;
    public final List<oo4> a;
    
    static {
        Companion = new b();
    }
    
    public qo4(final List<oo4> a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof qo4 && zzd.a((Object)this.a, (Object)((qo4)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return du1.x("Collaborators(result=", (List)this.a, ")");
    }
    
    public static final class b
    {
    }
}
