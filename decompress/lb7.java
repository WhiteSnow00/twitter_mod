import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lb7 implements dga
{
    public static final lb7 I0;
    public final ar F0;
    public final boolean G0;
    public final Map<String, zq<?>> H0;
    
    static {
        I0 = new lb7(new LinkedHashMap(), new ar((cga.a)null, (Set)null, (wg8)null), false, null);
        new LinkedHashMap();
    }
    
    public lb7(final Map h0, final ar f0, final boolean g0, final wg8 wg8) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final <T> zq<T> a(final mb7 mb7) {
        e0e.f((Object)mb7, "customScalar");
        zq zq;
        if (this.H0.get(((xz5)mb7).a) != null) {
            zq = this.H0.get(((xz5)mb7).a);
        }
        else if (e0e.a((Object)mb7.b, (Object)"com.apollographql.apollo3.api.Upload")) {
            zq = cr.h;
        }
        else if (shw.y0((Object[])new String[] { "kotlin.String", "java.lang.String" }).contains(mb7.b)) {
            zq = cr.a;
        }
        else if (shw.y0((Object[])new String[] { "kotlin.Boolean", "java.lang.Boolean" }).contains(mb7.b)) {
            zq = cr.f;
        }
        else if (shw.y0((Object[])new String[] { "kotlin.Int", "java.lang.Int" }).contains(mb7.b)) {
            zq = cr.b;
        }
        else if (shw.y0((Object[])new String[] { "kotlin.Double", "java.lang.Double" }).contains(mb7.b)) {
            zq = cr.c;
        }
        else if (shw.y0((Object[])new String[] { "kotlin.Long", "java.lang.Long" }).contains(mb7.b)) {
            zq = cr.e;
        }
        else if (shw.y0((Object[])new String[] { "kotlin.Float", "java.lang.Float" }).contains(mb7.b)) {
            zq = cr.d;
        }
        else if (shw.y0((Object[])new String[] { "kotlin.Any", "java.lang.Object" }).contains(mb7.b)) {
            zq = cr.g;
        }
        else {
            if (!this.G0) {
                final StringBuilder f = ehk.f("Can't map GraphQL type: `");
                f.append(((xz5)mb7).a);
                f.append("` to: `");
                f.append(mb7.b);
                f.append("`. Did you forget to add a CustomScalarAdapter?");
                throw new IllegalStateException(f.toString().toString());
            }
            zq = new ezj();
        }
        e0e.d((Object)zq, "null cannot be cast to non-null type com.apollographql.apollo3.api.Adapter<T of com.apollographql.apollo3.api.CustomScalarAdapters.responseAdapterFor>");
        return zq;
    }
}
