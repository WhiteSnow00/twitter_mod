// 
// Decompiled by Procyon v0.6.0
// 

public final class jra<T>
{
    public final T a;
    public final jub<gub<? super m76, ? super Integer, oyv>, m76, Integer, oyv> b;
    
    public jra(final T a, final jub<? super gub<? super m76, ? super Integer, oyv>, ? super m76, ? super Integer, oyv> b) {
        this.a = a;
        this.b = (jub<gub<? super m76, ? super Integer, oyv>, m76, Integer, oyv>)b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jra)) {
            return false;
        }
        final jra jra = (jra)o;
        return zzd.a((Object)this.a, (Object)jra.a) && zzd.a((Object)this.b, (Object)jra.b);
    }
    
    @Override
    public final int hashCode() {
        final T a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.b.hashCode() + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("FadeInFadeOutAnimationItem(key=");
        g.append(this.a);
        g.append(", transition=");
        g.append(this.b);
        g.append(')');
        return g.toString();
    }
}
