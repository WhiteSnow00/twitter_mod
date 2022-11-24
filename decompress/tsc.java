// 
// Decompiled by Procyon v0.6.0
// 

public abstract class tsc
{
    public static tsc c() {
        return ((xv0)((n5j)cr0.a()).B((Class)xv0.class)).V6();
    }
    
    public final <REQ extends osc<?, ?>> bbq<REQ> a(final REQ req) {
        return (bbq<REQ>)bbq.g((ddq)new hpo((Object)this, (Object)req, 8));
    }
    
    public final <RESP, ERROR, REQ extends osc<RESP, ERROR>> bbq<RESP> b(final REQ req) {
        return (bbq<RESP>)this.a(req).w((rtb)fxf.N0);
    }
    
    public abstract bw0 d();
    
    public abstract void e(final osc$a<? extends osc<?, ?>> p0);
    
    public abstract <REQ extends osc<?, ?>> REQ f(final REQ p0);
    
    public abstract void g(final osc$a<? extends osc<?, ?>> p0);
}
