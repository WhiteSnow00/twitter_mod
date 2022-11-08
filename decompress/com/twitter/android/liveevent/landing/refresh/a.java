// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.refresh;

public final class a
{
    public final ewf a;
    public final a b;
    public final myf c;
    public final rd6 d;
    public a e;
    public String f;
    
    public a(final vxf vxf, final gqj gqj, final ewf a, final cwf cwf, final myf c, final a b, final ibm ibm) {
        final rd6 d = new rd6();
        this.d = d;
        this.e = com.twitter.android.liveevent.landing.refresh.a.a.s0;
        this.a = a;
        this.c = c;
        this.b = b;
        d.a(b5j.combineLatest((naj)vxf.d(), (naj)gqj.a(), (ew1)psf.d1).subscribe((fk6)new shd((Object)this, 4)));
        d.a(((b5j)((ggm)cwf).C0).subscribe((fk6)new gdm((Object)this, 6), (fk6)new pcs((Object)this, 8)));
        ibm.i((rj)new ht1((Object)this, 4));
    }
    
    public interface a
    {
        public static final a$a$a s0 = new a() {
            @Override
            public final void S() {
            }
            
            @Override
            public final void X0(final boolean b) {
            }
        };
        
        void S();
        
        void X0(final boolean p0);
    }
}
