// 
// Decompiled by Procyon v0.6.0
// 

public final class nbi implements mbi
{
    public final mv1<mbi$a> a;
    public final mv1<mbi$b> b;
    public final gwo c;
    public boolean d;
    
    public nbi(final zgh zgh, final gwo c, final jto jto) {
        final mbi$b d0 = mbi$b.D0;
        this.c = c;
        if (zgh != zgh.J0 && zgh != zgh.L0) {
            if (zgh == zgh.K0) {
                this.a = (mv1<mbi$a>)mv1.e((Object)mbi$a.D0);
                this.b = (mv1<mbi$b>)mv1.e((Object)d0);
            }
            else {
                this.a = (mv1<mbi$a>)mv1.e((Object)mbi$a.J0);
                this.b = (mv1<mbi$b>)mv1.e((Object)mbi$b.I0);
            }
        }
        else {
            this.a = (mv1<mbi$a>)mv1.e((Object)mbi$a.E0);
            this.b = (mv1<mbi$b>)mv1.e((Object)d0);
        }
        jto.a((mso)new nbi$a(this));
    }
    
    public final void a() {
        this.b.onNext((Object)mbi$b.D0);
    }
    
    public final void b() {
        this.b.onNext((Object)mbi$b.F0);
    }
    
    public final void c() {
        this.a.onNext((Object)mbi$a.H0);
    }
    
    public final h5j<mbi$b> d() {
        return (h5j<mbi$b>)((h5j)this.b).distinctUntilChanged().skip(1L).observeOn(this.c);
    }
    
    public final mbi$b e() {
        return (mbi$b)this.b.f();
    }
    
    public final void f() {
        this.a.onNext((Object)mbi$a.F0);
        if (mbi$b.G0 == this.e()) {
            this.b.onNext((Object)mbi$b.H0);
        }
    }
    
    public final void g() {
        this.d = true;
        this.a.onNext((Object)mbi$a.G0);
    }
    
    public final void h() {
        this.a.onNext((Object)mbi$a.J0);
        this.b.onNext((Object)mbi$b.I0);
    }
    
    public final mbi$a i() {
        return (mbi$a)this.a.f();
    }
    
    public final void j() {
        this.d = true;
        this.a.onNext((Object)mbi$a.I0);
        this.b.onNext((Object)mbi$b.E0);
    }
    
    public final void k() {
        this.b.onNext((Object)mbi$b.H0);
    }
    
    public final void l(final boolean b) {
        final mv1<mbi$a> a = this.a;
        mbi$a mbi$a;
        if (b) {
            mbi$a = mbi$a.D0;
        }
        else {
            mbi$a = mbi$a.E0;
        }
        a.onNext((Object)mbi$a);
        this.b.onNext((Object)mbi$b.D0);
    }
    
    public final h5j<mbi$a> m() {
        return (h5j<mbi$a>)((h5j)this.a).distinctUntilChanged().skip(1L).observeOn(this.c);
    }
    
    public final void n() {
        if (mbi$a.F0 == this.i()) {
            this.b.onNext((Object)mbi$b.H0);
        }
        else {
            this.b.onNext((Object)mbi$b.G0);
        }
    }
    
    public final void onCameraClosed() {
        if (this.d) {
            this.d = false;
            this.a.onNext((Object)mbi$a.E0);
            this.b.onNext((Object)mbi$b.D0);
        }
    }
}
