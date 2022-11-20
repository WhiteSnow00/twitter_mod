import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fa7 implements vea
{
    public static final fa7 G0;
    public final yq D0;
    public final boolean E0;
    public final Map<String, xq<?>> F0;
    
    static {
        G0 = new fa7(new LinkedHashMap(), new yq((uea.a)null, (Set)null, (rf8)null), false, null);
        new LinkedHashMap();
    }
    
    public fa7(final Map f0, final yq d0, final boolean e0, final rf8 rf8) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final <T> xq<T> a(final ga7 ga7) {
        czd.f((Object)ga7, "customScalar");
        Object o;
        if (this.F0.get(((ry5)ga7).a) != null) {
            o = this.F0.get(((ry5)ga7).a);
        }
        else if (czd.a((Object)ga7.b, (Object)"com.apollographql.apollo3.api.Upload")) {
            o = ar.h;
        }
        else if (s9i.s("kotlin.String", "java.lang.String").contains(ga7.b)) {
            o = ar.a;
        }
        else if (s9i.s("kotlin.Boolean", "java.lang.Boolean").contains(ga7.b)) {
            o = ar.f;
        }
        else if (s9i.s("kotlin.Int", "java.lang.Int").contains(ga7.b)) {
            o = ar.b;
        }
        else if (s9i.s("kotlin.Double", "java.lang.Double").contains(ga7.b)) {
            o = ar.c;
        }
        else if (s9i.s("kotlin.Long", "java.lang.Long").contains(ga7.b)) {
            o = ar.e;
        }
        else if (s9i.s("kotlin.Float", "java.lang.Float").contains(ga7.b)) {
            o = ar.d;
        }
        else if (s9i.s("kotlin.Any", "java.lang.Object").contains(ga7.b)) {
            o = ar.g;
        }
        else {
            if (!this.E0) {
                final StringBuilder j = fu8.j("Can't map GraphQL type: `");
                j.append(((ry5)ga7).a);
                j.append("` to: `");
                j.append(ga7.b);
                j.append("`. Did you forget to add a CustomScalarAdapter?");
                throw new IllegalStateException(j.toString().toString());
            }
            o = new pyj();
        }
        czd.d(o, "null cannot be cast to non-null type com.apollographql.apollo3.api.Adapter<T of com.apollographql.apollo3.api.CustomScalarAdapters.responseAdapterFor>");
        return (xq<T>)o;
    }
}
