import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejf<T> implements zq<List<T>>
{
    public final zq<T> a;
    
    public ejf(final zq<T> a) {
        this.a = a;
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (List<? extends T>)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final List<T> c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        kie.J();
        final ArrayList list = new ArrayList();
        while (kie.hasNext()) {
            list.add(this.a.b(kie, lb7));
        }
        kie.I();
        return list;
    }
    
    public final void d(final yle yle, final lb7 lb7, final List<? extends T> list) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)list, "value");
        yle.J();
        final Iterator<Object> iterator = (Iterator<Object>)list.iterator();
        while (iterator.hasNext()) {
            this.a.a(yle, lb7, iterator.next());
        }
        yle.I();
    }
}
