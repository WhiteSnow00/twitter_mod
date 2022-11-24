// 
// Decompiled by Procyon v0.6.0
// 

public final class pza implements ccx
{
    public final hed<c0b> a;
    public final c0b b;
    
    public pza(final hed<? extends c0b> a, final c0b b) {
        e0e.f((Object)a, "filters");
        this.a = (hed<c0b>)a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pza)) {
            return false;
        }
        final pza pza = (pza)o;
        return e0e.a((Object)this.a, (Object)pza.a) && e0e.a((Object)this.b, (Object)pza.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final hed<c0b> a = this.a;
        final c0b b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("FilterBarViewState(filters=");
        sb.append(a);
        sb.append(", selectedFilter=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
