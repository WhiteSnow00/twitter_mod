import java.util.Collection;
import j$.util.function.BiConsumer$VivifiedWrapper;
import j$.util.Map$_CC;
import j$.util.function.BiConsumer;
import java.util.Set;
import j$.util.function.Function$VivifiedWrapper;
import j$.util.function.Function;
import j$.util.function.BiFunction$VivifiedWrapper;
import j$.util.function.BiFunction;
import java.util.Objects;
import j$.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uuj implements hed<vuj, tuj>, Map
{
    public final tuj C0;
    public final tuj D0;
    public final tuj E0;
    public final tuj F0;
    public final /* synthetic */ l9k<vuj, tuj> G0;
    public final u3s H0;
    
    public uuj() {
        this(null, null, null, null, 15, null);
    }
    
    public uuj(final tuj c0, final tuj d0, final tuj e0, final tuj f0) {
        zzd.f((Object)c0, "refreshState");
        zzd.f((Object)d0, "pageDownState");
        zzd.f((Object)e0, "pageUpState");
        zzd.f((Object)f0, "initialRequestState");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        final gvj gvj = new gvj((Object)vuj.C0, (Object)d0);
        final gvj gvj2 = new gvj((Object)vuj.D0, (Object)e0);
        final gvj gvj3 = new gvj((Object)vuj.E0, (Object)c0);
        Objects.requireNonNull(m9k.Companion);
        final m9k f2 = m9k.F0;
        Objects.requireNonNull(f2);
        final n9k n9k = new n9k(f2);
        vkg.q1((java.util.Map)n9k, new gvj[] { gvj, gvj2, gvj3 });
        this.G0 = (l9k<vuj, tuj>)n9k.b();
        this.H0 = (u3s)rp2.z0((otb)new uuj$a(this));
    }
    
    public static uuj a(final uuj uuj, tuj c0, tuj d0, tuj f0, final int n) {
        if ((n & 0x1) != 0x0) {
            c0 = uuj.C0;
        }
        if ((n & 0x2) != 0x0) {
            d0 = uuj.D0;
        }
        tuj e0;
        if ((n & 0x4) != 0x0) {
            e0 = uuj.E0;
        }
        else {
            e0 = null;
        }
        if ((n & 0x8) != 0x0) {
            f0 = uuj.F0;
        }
        Objects.requireNonNull(uuj);
        zzd.f((Object)c0, "refreshState");
        zzd.f((Object)d0, "pageDownState");
        zzd.f((Object)e0, "pageUpState");
        zzd.f((Object)f0, "initialRequestState");
        return new uuj(c0, d0, e0, f0);
    }
    
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean containsKey(final Object o) {
        if (!(o instanceof vuj)) {
            return false;
        }
        final vuj vuj = (vuj)o;
        zzd.f((Object)vuj, "key");
        return ((java.util.Map)this.G0).containsKey(vuj);
    }
    
    public final boolean containsValue(final Object o) {
        if (!(o instanceof tuj)) {
            return false;
        }
        final tuj tuj = (tuj)o;
        zzd.f((Object)tuj, "value");
        return ((java.util.Map)this.G0).containsValue(tuj);
    }
    
    public final Set entrySet() {
        return this.G0.entrySet();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof uuj)) {
            return false;
        }
        final uuj uuj = (uuj)o;
        return zzd.a((Object)this.C0, (Object)uuj.C0) && zzd.a((Object)this.D0, (Object)uuj.D0) && zzd.a((Object)this.E0, (Object)uuj.E0) && zzd.a((Object)this.F0, (Object)uuj.F0);
    }
    
    public final Object get(final Object o) {
        if (!(o instanceof vuj)) {
            return null;
        }
        final vuj vuj = (vuj)o;
        zzd.f((Object)vuj, "key");
        return this.G0.get((Object)vuj);
    }
    
    @Override
    public final int hashCode() {
        return this.F0.hashCode() + (this.E0.hashCode() + (this.D0.hashCode() + this.C0.hashCode() * 31) * 31) * 31;
    }
    
    public final boolean isEmpty() {
        return ((java.util.Map)this.G0).isEmpty();
    }
    
    public final Set keySet() {
        return this.G0.keySet();
    }
    
    public final void putAll(final java.util.Map<? extends vuj, ? extends tuj> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final Object remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean remove(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void replaceAll(final BiFunction<? super vuj, ? super tuj, ? extends tuj> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final int size() {
        return ((java.util.Map)this.G0).size();
    }
    
    @Override
    public final String toString() {
        final tuj c0 = this.C0;
        final tuj d0 = this.D0;
        final tuj e0 = this.E0;
        final tuj f0 = this.F0;
        final StringBuilder sb = new StringBuilder();
        sb.append("PaginationStates(refreshState=");
        sb.append(c0);
        sb.append(", pageDownState=");
        sb.append(d0);
        sb.append(", pageUpState=");
        sb.append(e0);
        sb.append(", initialRequestState=");
        sb.append(f0);
        sb.append(")");
        return sb.toString();
    }
    
    public final Collection values() {
        return this.G0.values();
    }
}
