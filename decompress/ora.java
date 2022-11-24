// 
// Decompiled by Procyon v0.6.0
// 

public final class ora<T>
{
    public final T a;
    public final kub<hub<? super d86, ? super Integer, vzv>, d86, Integer, vzv> b;
    
    public ora(final T a, final kub<? super hub<? super d86, ? super Integer, vzv>, ? super d86, ? super Integer, vzv> b) {
        this.a = a;
        this.b = (kub<hub<? super d86, ? super Integer, vzv>, d86, Integer, vzv>)b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ora)) {
            return false;
        }
        final ora ora = (ora)o;
        return e0e.a((Object)this.a, (Object)ora.a) && e0e.a((Object)this.b, (Object)ora.b);
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
        final StringBuilder f = ehk.f("FadeInFadeOutAnimationItem(key=");
        f.append(this.a);
        f.append(", transition=");
        f.append(this.b);
        f.append(')');
        return f.toString();
    }
}
