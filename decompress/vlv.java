// 
// Decompiled by Procyon v0.6.0
// 

public final class vlv implements ypa<l9p, ulv>
{
    public final int a;
    public final is3 b;
    public final usl c;
    public final gwo d;
    public final gwo e;
    
    public vlv(final int a, final is3 b, final usl c, final gwo d, final gwo e) {
        czd.f((Object)b, "searchFeatures");
        czd.f((Object)c, "queryEventDispatcher");
        czd.f((Object)d, "computationScheduler");
        czd.f((Object)e, "mainScheduler");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final /* bridge */ Object a(final Object o) {
        return this.f((l9p)o);
    }
    
    public final ulv f(final l9p l9p) {
        czd.f((Object)l9p, "viewHolder");
        Object o;
        if (this.a == 5) {
            o = new bmv(l9p, this.b, this.c, this.d, this.e);
        }
        else {
            o = new nlv(l9p);
        }
        return (ulv)o;
    }
}
