// 
// Decompiled by Procyon v0.6.0
// 

public final class wyk implements vft<v84>
{
    public final mv1<v84> a;
    public final h5j<v84> b;
    
    public wyk() {
        final mv1 mv1 = new mv1();
        this.a = (mv1<v84>)mv1;
        this.b = mv1;
    }
    
    public final boolean b(final Object o) {
        final v84 v84 = (v84)o;
        czd.f((Object)v84, "item");
        return czd.a((Object)v84, this.a.f());
    }
    
    public final void c(final Object o, final boolean b) {
        final v84 v84 = (v84)o;
        czd.f((Object)v84, "item");
        if (b) {
            this.a.onNext((Object)v84);
        }
    }
}
