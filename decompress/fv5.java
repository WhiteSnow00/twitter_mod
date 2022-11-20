import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fv5 implements psl<fv5.fv5$c>
{
    public static final fv5.fv5$b Companion;
    public final String a;
    
    static {
        Companion = new fv5.fv5$b();
    }
    
    public fv5(final String a) {
        czd.f((Object)a, "community_rest_id");
        this.a = a;
    }
    
    public final void a(final ale ale, final fa7 fa7) {
        czd.f((Object)fa7, "customScalarAdapters");
        ale.z1("community_rest_id");
        Objects.requireNonNull(c3j.Companion);
        fa7.a(c3j.a).a(ale, fa7, (Object)this.a);
    }
    
    public final String b() {
        return "s0mhqWmmfVIl0qBzjPgzhA";
    }
    
    public final xq<fv5.fv5$c> c() {
        return (xq<fv5.fv5$c>)ar.c((xq)hv5.a, false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fv5 && czd.a((Object)this.a, (Object)((fv5)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String name() {
        return "CommunitySpacesResult";
    }
    
    @Override
    public final String toString() {
        return da8.j("CommunitySpacesResultQuery(community_rest_id=", this.a, ")");
    }
}
