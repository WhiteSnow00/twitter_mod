// 
// Decompiled by Procyon v0.6.0
// 

public final class l1l<T> implements k1l<T>, fvh<T>
{
    public final yy6 F0;
    public final fvh<T> G0;
    
    public l1l(final fvh<T> g0, final yy6 f0) {
        e0e.f((Object)g0, "state");
        e0e.f((Object)f0, "coroutineContext");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final yy6 A() {
        return this.F0;
    }
    
    public final stb<T, vzv> d() {
        return (stb<T, vzv>)this.G0.d();
    }
    
    public final T getValue() {
        return (T)this.G0.getValue();
    }
    
    public final T h() {
        return (T)this.G0.h();
    }
    
    public final void setValue(final T value) {
        this.G0.setValue((Object)value);
    }
}
