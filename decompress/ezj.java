import com.apollographql.apollo3.exception.JsonDataException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezj<T> implements zq<T>
{
    @Override
    public final void a(final yle yle, final lb7 lb7, final T t) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        if (yle instanceof ukg) {
            ((ukg)yle).b(t);
            return;
        }
        throw new IllegalStateException("UnsafeAdapter only supports MapJsonWriter".toString());
    }
    
    @Override
    public final T b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        if (!(kie instanceof tkg)) {
            throw new IllegalStateException("UnsafeAdapter only supports MapJsonReader".toString());
        }
        final tkg tkg = (tkg)kie;
        final Object i0 = tkg.I0;
        if (i0 != null) {
            tkg.a();
            return (T)i0;
        }
        final StringBuilder f = ehk.f("Expected a non-null value at path ");
        f.append(tkg.c());
        throw new JsonDataException(f.toString());
    }
}
