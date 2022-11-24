// 
// Decompiled by Procyon v0.6.0
// 

public final class hmv implements gra<dap, gmv>
{
    public final int a;
    public final it3 b;
    public final ftl c;
    public final bxo d;
    public final bxo e;
    
    public hmv(final int a, final it3 b, final ftl c, final bxo d, final bxo e) {
        e0e.f((Object)b, "searchFeatures");
        e0e.f((Object)c, "queryEventDispatcher");
        e0e.f((Object)d, "computationScheduler");
        e0e.f((Object)e, "mainScheduler");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final /* bridge */ Object a(final Object o) {
        return this.f((dap)o);
    }
    
    public final gmv f(final dap dap) {
        e0e.f((Object)dap, "viewHolder");
        Object o;
        if (this.a == 5) {
            o = new mmv(dap, this.b, this.c, this.d, this.e);
        }
        else {
            o = new zlv(dap);
        }
        return (gmv)o;
    }
}
