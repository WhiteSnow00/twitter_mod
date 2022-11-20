import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jg7 implements xq<ig7>
{
    public static final jg7 a;
    
    static {
        a = new jg7();
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final ig7 ig7 = (ig7)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)ig7, "value");
        ale.z1("buffer");
        ar.b.a(ale, fa7, (Object)0);
        ale.z1("central_event_id");
        Objects.requireNonNull(c3j.Companion);
        fa7.a(c3j.a).a(ale, fa7, (Object)null);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }
}
