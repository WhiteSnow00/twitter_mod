// 
// Decompiled by Procyon v0.6.0
// 

public final class pof implements xbj<Object>
{
    public Object C0;
    public final /* synthetic */ lbs D0;
    public final /* synthetic */ Object E0;
    public final /* synthetic */ xub F0;
    public final /* synthetic */ q2h G0;
    
    public pof(final lbs d0, final Object e0, final xub f0, final q2h g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.C0 = null;
    }
    
    public final void a(final Object o) {
        ((krx)this.D0).a((Runnable)new Runnable() {
            @Override
            public final void run() {
                synchronized (pof.this.E0) {
                    final Object apply = pof.this.F0.apply(o);
                    final pof d0 = pof.this;
                    final Object c0 = d0.C0;
                    if (c0 == null && apply != null) {
                        d0.C0 = apply;
                        ((sth<Object>)d0.G0).i(apply);
                    }
                    else if (c0 != null && !c0.equals(apply)) {
                        final pof d2 = pof.this;
                        d2.C0 = apply;
                        ((sth<Object>)d2.G0).i(apply);
                    }
                }
            }
        });
    }
}
