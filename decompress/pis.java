// 
// Decompiled by Procyon v0.6.0
// 

public final class pis
{
    public zfs a;
    public final m5m b;
    public final it9 c;
    public gjs d;
    public final wwj e;
    public final wwj f;
    public bwe g;
    public final fvh<rjs> h;
    public xc0 i;
    public final wwj j;
    public boolean k;
    public final wwj l;
    public final wwj m;
    public final wwj n;
    public boolean o;
    public final mre p;
    public stb<? super sis, vzv> q;
    public final stb<sis, vzv> r;
    public final stb<z9d, vzv> s;
    public final b50 t;
    
    public pis(final zfs a, final m5m b) {
        this.a = a;
        this.b = b;
        this.c = new it9();
        final Boolean false = Boolean.FALSE;
        this.e = (wwj)zzz.W((Object)false);
        this.f = (wwj)zzz.W((Object)new s99(0));
        this.h = (wwj)zzz.W((Object)null);
        this.j = (wwj)zzz.W((Object)ecc.F0);
        this.l = (wwj)zzz.W((Object)false);
        this.m = (wwj)zzz.W((Object)false);
        this.n = (wwj)zzz.W((Object)false);
        this.o = true;
        this.p = new mre();
        this.q = (stb<? super sis, vzv>)pis$c.F0;
        this.r = new pis$b(this);
        this.s = new pis$a(this);
        this.t = new b50();
    }
    
    public final ecc a() {
        return ((cjq<ecc>)this.j).getValue();
    }
    
    public final boolean b() {
        return ((cjq<Boolean>)this.e).getValue();
    }
    
    public final rjs c() {
        return ((cjq<rjs>)this.h).getValue();
    }
    
    public final void d(final ecc value) {
        ((cjq<ecc>)this.j).setValue(value);
    }
}
