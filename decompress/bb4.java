import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bb4<K, V>
{
    public final Map<Class<? extends K>, V> a;
    
    public bb4(final Map<Class<? extends K>, ? extends V> a) {
        this.a = (Map<Class<? extends K>, V>)a;
    }
    
    public final V a(final Class<? extends K> clazz) {
        return (V)kkp.n0(kkp.s0(kkp.i0(kkp.o0(gkp.e0((Object)clazz, (qsb)eam.D0), (qsb)dam.D0)), (qsb)new qsb<Class<?>, V>(this) {
            public final bb4<K, V> D0;
            
            public final Object invoke(final Object o) {
                final Class clazz = (Class)o;
                czd.f((Object)clazz, "it");
                return this.D0.a.get(clazz);
            }
        }));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof bb4 && czd.a((Object)this.a, (Object)((bb4)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final Map<Class<? extends K>, V> a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("ClassMap(values=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
