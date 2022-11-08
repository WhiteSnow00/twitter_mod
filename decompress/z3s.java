// 
// Decompiled by Procyon v0.6.0
// 

public final class z3s implements c4s<Object, Object>
{
    public final /* synthetic */ c4s<Object, snj<Object>> C0;
    public final /* synthetic */ c4s<Object, Object> D0;
    public final /* synthetic */ bx0<?, Object, ?> E0;
    
    public z3s(final c4s<Object, snj<Object>> c0, final c4s<Object, Object> d0, final bx0<?, Object, ?> e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final Object W2(Object o) {
        final snj snj = (snj)this.C0.W2(o);
        if (snj.f()) {
            o = snj.c();
        }
        else {
            o = this.D0.t2((bx0)this.E0).W2(o);
        }
        return o;
    }
    
    public final c4s Z2(final w3s w3s) {
        zzd.f((Object)w3s, "sink");
        return this.a(w3s);
    }
    
    public final /* synthetic */ c4s a(final w3s w3s) {
        return crf.w((c4s)this, w3s, true);
    }
}
