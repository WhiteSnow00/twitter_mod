// 
// Decompiled by Procyon v0.6.0
// 

public final class k1f implements k0f
{
    public final stb<Integer, Object> a;
    public final stb<Integer, Object> b;
    public final mub<nze, Integer, d86, Integer, vzv> c;
    
    public k1f(final stb<? super Integer, ?> a, final stb<? super Integer, ?> b, final mub<? super nze, ? super Integer, ? super d86, ? super Integer, vzv> c) {
        e0e.f((Object)b, "type");
        e0e.f((Object)c, "item");
        this.a = (stb<Integer, Object>)a;
        this.b = (stb<Integer, Object>)b;
        this.c = (mub<nze, Integer, d86, Integer, vzv>)c;
    }
    
    public final stb<Integer, Object> getKey() {
        return this.a;
    }
    
    public final stb<Integer, Object> getType() {
        return this.b;
    }
}
