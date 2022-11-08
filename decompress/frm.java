import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frm
{
    public static final frm c;
    public final Map<String, uus> a;
    public final Map<String, List<ews>> b;
    
    static {
        final ged$b c2 = ged.C0;
        final int a = w4j.a;
        c = new frm((Map<String, uus>)c2, (Map<String, List<ews>>)c2);
    }
    
    public frm(final Map<String, uus> map, final Map<String, List<ews>> map2) {
        this.a = ged.c((Map)map);
        this.b = ged.c((Map)map2);
    }
    
    public final cwa a(final cvs cvs) {
        final cwa.a a = new cwa.a();
        a.a = c6e.k((Iterable)new m5e((Iterable)cvs.a, (kub)new owo((Object)this, 3)));
        a.b = cvs.b;
        a.c = cvs.c;
        return (cwa)a.e();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && frm.class == o.getClass() && w4j.a((Object)this.a, (Object)((frm)o).a));
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.a);
    }
}
