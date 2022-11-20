import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rck implements rd3
{
    public final sd3 D0;
    public final vd3 E0;
    public final mv1<a> F0;
    public final nnl<tmi> G0;
    
    public rck(final sd3 d0, final vd3 e0) {
        czd.f((Object)d0, "viewHolder");
        czd.f((Object)e0, "zoomHelper");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = (mv1<a>)mv1.e((Object)a.a.a);
        this.G0 = (nnl<tmi>)new nnl();
    }
    
    public final a b() {
        return (a)this.F0.f();
    }
    
    @Override
    public final void c() {
        this.i(a.a.a);
    }
    
    @Override
    public final void g(final MotionEvent motionEvent) {
        czd.f((Object)motionEvent, "e");
        final int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                }
                else {
                    if (czd.a((Object)a.b.a, (Object)this.b())) {
                        final vd3 e0 = this.E0;
                        final float y = motionEvent.getY();
                        final float n = e0.b.o() / 2.0f;
                        e0.a.onNext((Object)(xm1.a(-y, 0.0f, n) / n));
                    }
                    return;
                }
            }
            final a.a a = rck.a.a.a;
            if (czd.a((Object)a, (Object)this.b())) {
                this.D0.c();
            }
            else if (czd.a((Object)rck.a.c.a, (Object)this.b()) || czd.a((Object)rck.a.b.a, (Object)this.b())) {
                this.i(a);
            }
        }
        else if (czd.a((Object)a.a.a, (Object)this.b())) {
            this.i(a.c.a);
        }
    }
    
    public final void i(final a a) {
        this.F0.onNext((Object)a);
        if (czd.a((Object)a, (Object)rck.a.a.a)) {
            this.D0.q();
            this.D0.c();
            this.D0.p();
            this.D0.requestDisallowInterceptTouchEvent(false);
        }
        else if (czd.a((Object)a, (Object)rck.a.c.a)) {
            this.D0.n();
            this.D0.l();
            this.D0.m();
        }
        else if (czd.a((Object)a, (Object)rck.a.b.a)) {
            this.D0.i();
            this.D0.g();
            this.D0.requestDisallowInterceptTouchEvent(true);
        }
    }
    
    @Override
    public final void l() {
        this.i(a.c.a);
    }
    
    @Override
    public final h5j<Boolean> n() {
        final h5j distinctUntilChanged = ((h5j)this.F0).map((psb)new di((qsb)rck$b.D0, 20)).skipWhile((ytk)new vt1((qsb)rck$c.D0, 7)).distinctUntilChanged();
        czd.e((Object)distinctUntilChanged, "buttonStateSubject.map {\u2026  .distinctUntilChanged()");
        return (h5j<Boolean>)distinctUntilChanged;
    }
    
    @Override
    public final void onLongPress(final MotionEvent motionEvent) {
        if (czd.a((Object)a.c.a, (Object)this.b())) {
            this.i(a.b.a);
        }
    }
    
    @Override
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        czd.f((Object)motionEvent, "e1");
        czd.f((Object)motionEvent2, "e2");
        if (czd.a((Object)a.c.a, (Object)this.b())) {
            this.i(a.b.a);
        }
        return true;
    }
    
    @Override
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        this.G0.onNext((Object)tmi.a);
        this.c();
        return true;
    }
    
    @Override
    public final h5j<Boolean> q() {
        final h5j distinctUntilChanged = ((h5j)this.F0).map((psb)new ut1((qsb)rck$d.D0, 25)).skipWhile((ytk)new wtn((qsb)rck$e.D0, 4)).distinctUntilChanged();
        czd.e((Object)distinctUntilChanged, "buttonStateSubject.map {\u2026  .distinctUntilChanged()");
        return (h5j<Boolean>)distinctUntilChanged;
    }
    
    @Override
    public final h5j<tmi> u() {
        return (h5j<tmi>)this.G0;
    }
    
    public abstract static class a
    {
        public static final class a extends rck.a
        {
            public static final a a;
            
            static {
                a = new a();
            }
        }
        
        public static final class b extends rck.a
        {
            public static final b a;
            
            static {
                a = new b();
            }
        }
        
        public static final class c extends rck.a
        {
            public static final c a;
            
            static {
                a = new c();
            }
        }
    }
}
