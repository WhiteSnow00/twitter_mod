// 
// Decompiled by Procyon v0.6.0
// 

public final class k2f implements j2f
{
    public final kuh<k1f> a;
    public final gzd<k1f> b;
    
    public k2f() {
        final kuh kuh = new kuh();
        this.a = kuh;
        this.b = kuh;
    }
    
    public final void a(final int n, final stb<? super Integer, ?> stb, final stb<? super Integer, ?> stb2, final mub<? super nze, ? super Integer, ? super d86, ? super Integer, vzv> mub) {
        e0e.f((Object)stb2, "contentType");
        e0e.f((Object)mub, "itemContent");
        this.a.b(n, new k1f(stb, stb2, mub));
    }
    
    public final void b(final Object o, final Object o2, final kub<? super nze, ? super d86, ? super Integer, vzv> kub) {
        e0e.f((Object)kub, "content");
        final kuh<k1f> a = this.a;
        Object o3;
        if (o != null) {
            o3 = new k2f$a(o);
        }
        else {
            o3 = null;
        }
        a.b(1, new k1f((stb<? super Integer, ?>)o3, (stb<? super Integer, ?>)new k2f$b(o2), (mub<? super nze, ? super Integer, ? super d86, ? super Integer, vzv>)w9y.j(-735119482, true, new k2f$c((kub)kub))));
    }
}
