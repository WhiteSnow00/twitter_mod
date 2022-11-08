import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xb4<K, V>
{
    public final Map<Class<? extends K>, V> a;
    
    public xb4(final Map<Class<? extends K>, ? extends V> a) {
        this.a = (Map<Class<? extends K>, V>)a;
    }
    
    public final V a(final Class<? extends K> clazz) {
        return (V)tjp.J0(tjp.O0(tjp.E0(tjp.K0(pjp.A0((Object)clazz, (rtb)p9m.C0), (rtb)o9m.C0)), (rtb)new xb4$a(this)));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof xb4 && zzd.a((Object)this.a, (Object)((xb4)o).a));
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
