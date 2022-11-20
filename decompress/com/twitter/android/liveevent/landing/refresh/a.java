// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.refresh;

public final class a
{
    public final pvf a;
    public final a b;
    public final yxf c;
    public final wc6 d;
    public a e;
    public String f;
    
    public a(final hxf hxf, final lqj lqj, final pvf a, final nvf nvf, final yxf c, final a b, final xbm xbm) {
        final wc6 d = new wc6();
        this.d = d;
        this.e = (a)com.twitter.android.liveevent.landing.refresh.a.a.t0;
        this.a = a;
        this.c = c;
        this.b = b;
        d.a(h5j.combineLatest((taj)hxf.d(), (taj)lqj.a(), (zv1)kwf.E0).subscribe((lj6)new vgd(this, 4)));
        d.a(((h5j)((wgm)nvf).D0).subscribe((lj6)new ydm((Object)this, 6), (lj6)new kds((Object)this, 8)));
        xbm.i((oj)new dt1((Object)this, 4));
    }
    
    public interface a
    {
        public static final a$a$a t0 = new a$a$a();
        
        void S();
        
        void X0(final boolean p0);
    }
}
