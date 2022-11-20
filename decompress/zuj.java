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

public final class zuj implements ldd<avj, yuj>, Map
{
    public final yuj D0;
    public final yuj E0;
    public final yuj F0;
    public final yuj G0;
    public final s9k<avj, yuj> H0;
    public final n4s I0;
    
    public zuj() {
        this(null, null, null, null, 15, null);
    }
    
    public zuj(final yuj d0, final yuj e0, final yuj f0, final yuj g0) {
        czd.f((Object)d0, "refreshState");
        czd.f((Object)e0, "pageDownState");
        czd.f((Object)f0, "pageUpState");
        czd.f((Object)g0, "initialRequestState");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        final lvj lvj = new lvj((Object)avj.D0, (Object)e0);
        final lvj lvj2 = new lvj((Object)avj.E0, (Object)f0);
        final lvj lvj3 = new lvj((Object)avj.F0, (Object)d0);
        Objects.requireNonNull(t9k.Companion);
        final t9k g2 = t9k.G0;
        Objects.requireNonNull(g2);
        final u9k u9k = new u9k(g2);
        tkg.t0((java.util.Map)u9k, new lvj[] { lvj, lvj2, lvj3 });
        this.H0 = (s9k<avj, yuj>)u9k.b();
        this.I0 = (n4s)pps.n((nsb)new zuj$a(this));
    }
    
    public zuj(final yuj yuj, final yuj yuj2, final yuj yuj3, final yuj yuj4, final int n, final rf8 rf8) {
        final yuj$a companion = yuj.Companion;
        Objects.requireNonNull(companion);
        final yuj.c c = yuj.c;
        Objects.requireNonNull(companion);
        Objects.requireNonNull(companion);
        Objects.requireNonNull(companion);
        this(c, c, c, c);
    }
    
    public static zuj a(final zuj zuj, yuj d0, yuj e0, yuj g0, final int n) {
        if ((n & 0x1) != 0x0) {
            d0 = zuj.D0;
        }
        if ((n & 0x2) != 0x0) {
            e0 = zuj.E0;
        }
        yuj f0;
        if ((n & 0x4) != 0x0) {
            f0 = zuj.F0;
        }
        else {
            f0 = null;
        }
        if ((n & 0x8) != 0x0) {
            g0 = zuj.G0;
        }
        Objects.requireNonNull(zuj);
        czd.f((Object)d0, "refreshState");
        czd.f((Object)e0, "pageDownState");
        czd.f((Object)f0, "pageUpState");
        czd.f((Object)g0, "initialRequestState");
        return new zuj(d0, e0, f0, g0);
    }
    
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final /* bridge */ Object compute(final Object o, final BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final Object compute(final Object o, final java.util.function.BiFunction biFunction) {
        this.compute(o, BiFunction$VivifiedWrapper.convert(biFunction));
        throw null;
    }
    
    public final /* bridge */ Object computeIfAbsent(final Object o, final Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final Object computeIfAbsent(final Object o, final java.util.function.Function function) {
        this.computeIfAbsent(o, Function$VivifiedWrapper.convert(function));
        throw null;
    }
    
    public final /* bridge */ Object computeIfPresent(final Object o, final BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final Object computeIfPresent(final Object o, final java.util.function.BiFunction biFunction) {
        this.computeIfPresent(o, BiFunction$VivifiedWrapper.convert(biFunction));
        throw null;
    }
    
    public final boolean containsKey(final Object o) {
        if (!(o instanceof avj)) {
            return false;
        }
        final avj avj = (avj)o;
        czd.f((Object)avj, "key");
        return ((java.util.Map)this.H0).containsKey(avj);
    }
    
    public final boolean containsValue(final Object o) {
        if (!(o instanceof yuj)) {
            return false;
        }
        final yuj yuj = (yuj)o;
        czd.f((Object)yuj, "value");
        return ((java.util.Map)this.H0).containsValue(yuj);
    }
    
    public final Set entrySet() {
        return this.H0.entrySet();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zuj)) {
            return false;
        }
        final zuj zuj = (zuj)o;
        return czd.a((Object)this.D0, (Object)zuj.D0) && czd.a((Object)this.E0, (Object)zuj.E0) && czd.a((Object)this.F0, (Object)zuj.F0) && czd.a((Object)this.G0, (Object)zuj.G0);
    }
    
    public final void forEach(final BiConsumer biConsumer) {
        Map$_CC.$default$forEach((java.util.Map)this, biConsumer);
    }
    
    public final void forEach(final java.util.function.BiConsumer biConsumer) {
        Map$_CC.$default$forEach((java.util.Map)this, BiConsumer$VivifiedWrapper.convert(biConsumer));
    }
    
    public final Object get(final Object o) {
        if (!(o instanceof avj)) {
            return null;
        }
        final avj avj = (avj)o;
        czd.f((Object)avj, "key");
        return this.H0.get((Object)avj);
    }
    
    public final Object getOrDefault(final Object o, final Object o2) {
        return Map$_CC.$default$getOrDefault((java.util.Map)this, o, o2);
    }
    
    @Override
    public final int hashCode() {
        return this.G0.hashCode() + (this.F0.hashCode() + (this.E0.hashCode() + this.D0.hashCode() * 31) * 31) * 31;
    }
    
    public final boolean isEmpty() {
        return ((java.util.Map)this.H0).isEmpty();
    }
    
    public final Set keySet() {
        return this.H0.keySet();
    }
    
    public final /* bridge */ Object merge(final Object o, final Object o2, final BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final Object merge(final Object o, final Object o2, final java.util.function.BiFunction biFunction) {
        this.merge(o, o2, BiFunction$VivifiedWrapper.convert(biFunction));
        throw null;
    }
    
    public final /* bridge */ Object put(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void putAll(final java.util.Map<? extends avj, ? extends yuj> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final /* bridge */ Object putIfAbsent(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final Object remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean remove(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final /* bridge */ Object replace(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final /* bridge */ boolean replace(final Object o, final Object o2, final Object o3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void replaceAll(final BiFunction<? super avj, ? super yuj, ? extends yuj> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void replaceAll(final java.util.function.BiFunction biFunction) {
        this.replaceAll((BiFunction<? super avj, ? super yuj, ? extends yuj>)BiFunction$VivifiedWrapper.convert(biFunction));
        throw null;
    }
    
    public final int size() {
        return ((java.util.Map)this.H0).size();
    }
    
    @Override
    public final String toString() {
        final yuj d0 = this.D0;
        final yuj e0 = this.E0;
        final yuj f0 = this.F0;
        final yuj g0 = this.G0;
        final StringBuilder sb = new StringBuilder();
        sb.append("PaginationStates(refreshState=");
        sb.append(d0);
        sb.append(", pageDownState=");
        sb.append(e0);
        sb.append(", pageUpState=");
        sb.append(f0);
        sb.append(", initialRequestState=");
        sb.append(g0);
        sb.append(")");
        return sb.toString();
    }
    
    public final Collection values() {
        return this.H0.values();
    }
}
