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

public final class ovj implements led<pvj, nvj>, Map
{
    public final nvj F0;
    public final nvj G0;
    public final nvj H0;
    public final nvj I0;
    public final eak<pvj, nvj> J0;
    public final h5s K0;
    
    public ovj() {
        this(null, null, null, null, 15, null);
    }
    
    public ovj(final nvj f0, final nvj g0, final nvj h0, final nvj i0) {
        e0e.f((Object)f0, "refreshState");
        e0e.f((Object)g0, "pageDownState");
        e0e.f((Object)h0, "pageUpState");
        e0e.f((Object)i0, "initialRequestState");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        final awj awj = new awj((Object)pvj.F0, (Object)g0);
        final awj awj2 = new awj((Object)pvj.G0, (Object)h0);
        final awj awj3 = new awj((Object)pvj.H0, (Object)f0);
        Objects.requireNonNull(fak.Companion);
        final fak i2 = fak.I0;
        Objects.requireNonNull(i2);
        final gak gak = new gak(i2);
        mlg.Y((java.util.Map)gak, new awj[] { awj, awj2, awj3 });
        this.J0 = (eak<pvj, nvj>)gak.b();
        this.K0 = (h5s)jty.N((ptb)new ovj$a(this));
    }
    
    public ovj(final nvj nvj, final nvj nvj2, final nvj nvj3, final nvj nvj4, final int n, final wg8 wg8) {
        final nvj$a companion = nvj.Companion;
        Objects.requireNonNull(companion);
        final nvj$c c = nvj.c;
        Objects.requireNonNull(companion);
        Objects.requireNonNull(companion);
        Objects.requireNonNull(companion);
        this((nvj)c, (nvj)c, (nvj)c, (nvj)c);
    }
    
    public static ovj a(final ovj ovj, nvj f0, nvj g0, nvj i0, final int n) {
        if ((n & 0x1) != 0x0) {
            f0 = ovj.F0;
        }
        if ((n & 0x2) != 0x0) {
            g0 = ovj.G0;
        }
        nvj h0;
        if ((n & 0x4) != 0x0) {
            h0 = ovj.H0;
        }
        else {
            h0 = null;
        }
        if ((n & 0x8) != 0x0) {
            i0 = ovj.I0;
        }
        Objects.requireNonNull(ovj);
        e0e.f((Object)f0, "refreshState");
        e0e.f((Object)g0, "pageDownState");
        e0e.f((Object)h0, "pageUpState");
        e0e.f((Object)i0, "initialRequestState");
        return new ovj(f0, g0, h0, i0);
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
        if (!(o instanceof pvj)) {
            return false;
        }
        final pvj pvj = (pvj)o;
        e0e.f((Object)pvj, "key");
        return ((java.util.Map)this.J0).containsKey(pvj);
    }
    
    public final boolean containsValue(final Object o) {
        if (!(o instanceof nvj)) {
            return false;
        }
        final nvj nvj = (nvj)o;
        e0e.f((Object)nvj, "value");
        return ((java.util.Map)this.J0).containsValue(nvj);
    }
    
    public final Set entrySet() {
        return this.J0.entrySet();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ovj)) {
            return false;
        }
        final ovj ovj = (ovj)o;
        return e0e.a((Object)this.F0, (Object)ovj.F0) && e0e.a((Object)this.G0, (Object)ovj.G0) && e0e.a((Object)this.H0, (Object)ovj.H0) && e0e.a((Object)this.I0, (Object)ovj.I0);
    }
    
    public final void forEach(final BiConsumer biConsumer) {
        Map$_CC.$default$forEach((java.util.Map)this, biConsumer);
    }
    
    public final void forEach(final java.util.function.BiConsumer biConsumer) {
        Map$_CC.$default$forEach((java.util.Map)this, BiConsumer$VivifiedWrapper.convert(biConsumer));
    }
    
    public final Object get(final Object o) {
        if (!(o instanceof pvj)) {
            return null;
        }
        final pvj pvj = (pvj)o;
        e0e.f((Object)pvj, "key");
        return this.J0.get((Object)pvj);
    }
    
    public final Object getOrDefault(final Object o, final Object o2) {
        return Map$_CC.$default$getOrDefault((java.util.Map)this, o, o2);
    }
    
    @Override
    public final int hashCode() {
        return this.I0.hashCode() + (this.H0.hashCode() + (this.G0.hashCode() + this.F0.hashCode() * 31) * 31) * 31;
    }
    
    public final boolean isEmpty() {
        return ((java.util.Map)this.J0).isEmpty();
    }
    
    public final Set keySet() {
        return this.J0.keySet();
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
    
    public final void putAll(final java.util.Map<? extends pvj, ? extends nvj> map) {
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
    
    public final void replaceAll(final BiFunction<? super pvj, ? super nvj, ? extends nvj> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void replaceAll(final java.util.function.BiFunction biFunction) {
        this.replaceAll((BiFunction<? super pvj, ? super nvj, ? extends nvj>)BiFunction$VivifiedWrapper.convert(biFunction));
        throw null;
    }
    
    public final int size() {
        return ((java.util.Map)this.J0).size();
    }
    
    @Override
    public final String toString() {
        final nvj f0 = this.F0;
        final nvj g0 = this.G0;
        final nvj h0 = this.H0;
        final nvj i0 = this.I0;
        final StringBuilder sb = new StringBuilder();
        sb.append("PaginationStates(refreshState=");
        sb.append(f0);
        sb.append(", pageDownState=");
        sb.append(g0);
        sb.append(", pageUpState=");
        sb.append(h0);
        sb.append(", initialRequestState=");
        sb.append(i0);
        sb.append(")");
        return sb.toString();
    }
    
    public final Collection values() {
        return this.J0.values();
    }
}
