import android.os.SystemClock;
import java.util.List;
import java.util.Objects;
import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqk implements zpk
{
    public stb<? super MotionEvent, Boolean> F0;
    public xnm G0;
    public boolean H0;
    public final cqk$a I0;
    
    public cqk() {
        this.I0 = new ypk(this) {
            public int G0 = 1;
            public final cqk H0;
            
            public final void I(final mpk mpk) {
                final List a = mpk.a;
                final int size = a.size();
                final int n = 0;
                while (true) {
                    for (int i = 0; i < size; ++i) {
                        if (((tpk)a.get(i)).d()) {
                            final boolean b = true;
                            if (b) {
                                if (this.G0 == 2) {
                                    final bwe f0 = super.F0;
                                    if (f0 == null) {
                                        throw new IllegalStateException("layoutCoordinates not set".toString());
                                    }
                                    Objects.requireNonNull(kgj.Companion);
                                    v7q.y(mpk, f0.l0(kgj.b), (stb)new stb<MotionEvent, vzv>(this.H0) {
                                        public final cqk F0;
                                        
                                        public final Object invoke(final Object o) {
                                            final MotionEvent motionEvent = (MotionEvent)o;
                                            e0e.f((Object)motionEvent, "motionEvent");
                                            this.F0.a().invoke((Object)motionEvent);
                                            return vzv.a;
                                        }
                                    }, true);
                                }
                                this.G0 = 3;
                            }
                            else {
                                final bwe f2 = super.F0;
                                if (f2 == null) {
                                    throw new IllegalStateException("layoutCoordinates not set".toString());
                                }
                                Objects.requireNonNull(kgj.Companion);
                                v7q.y(mpk, f2.l0(kgj.b), (stb)new stb<MotionEvent, vzv>(this, this.H0) {
                                    public final cqk$a F0;
                                    public final cqk G0;
                                    
                                    public final Object invoke(final Object o) {
                                        final MotionEvent motionEvent = (MotionEvent)o;
                                        e0e.f((Object)motionEvent, "motionEvent");
                                        if (motionEvent.getActionMasked() == 0) {
                                            final ypk f0 = this.F0;
                                            int g0;
                                            if (this.G0.a().invoke((Object)motionEvent)) {
                                                g0 = 2;
                                            }
                                            else {
                                                g0 = 3;
                                            }
                                            f0.G0 = g0;
                                        }
                                        else {
                                            this.G0.a().invoke((Object)motionEvent);
                                        }
                                        return vzv.a;
                                    }
                                }, false);
                                if (this.G0 == 2) {
                                    for (int size2 = a.size(), j = n; j < size2; ++j) {
                                        ((tpk)a.get(j)).a();
                                    }
                                    final syd b2 = mpk.b;
                                    if (b2 != null) {
                                        b2.a = (this.H0.H0 ^ true);
                                    }
                                }
                            }
                            return;
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
            
            public final void f() {
                if (this.G0 == 2) {
                    final long uptimeMillis = SystemClock.uptimeMillis();
                    final stb<MotionEvent, vzv> stb = (stb<MotionEvent, vzv>)new stb<MotionEvent, vzv>(this.H0) {
                        public final cqk F0;
                        
                        public final Object invoke(final Object o) {
                            final MotionEvent motionEvent = (MotionEvent)o;
                            e0e.f((Object)motionEvent, "motionEvent");
                            this.F0.a().invoke((Object)motionEvent);
                            return vzv.a;
                        }
                    };
                    final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    obtain.setSource(0);
                    stb.invoke(obtain);
                    obtain.recycle();
                    this.G0 = 1;
                    this.H0.H0 = false;
                }
            }
            
            public final void g(final mpk mpk, final npk npk, final long n) {
                final npk h0 = npk.H0;
                final List a = mpk.a;
                boolean b2 = false;
                Label_0119: {
                    Label_0116: {
                        if (!this.H0.H0) {
                            final int size = a.size();
                            int i = 0;
                            while (true) {
                                while (i < size) {
                                    final tpk tpk = a.get(i);
                                    if (p4j.n(tpk) || p4j.p(tpk)) {
                                        final boolean b = true;
                                        if (b) {
                                            break Label_0116;
                                        }
                                        b2 = false;
                                        break Label_0119;
                                    }
                                    else {
                                        ++i;
                                    }
                                }
                                final boolean b = false;
                                continue;
                            }
                        }
                    }
                    b2 = true;
                }
                if (this.G0 != 3) {
                    if (npk == npk.F0 && b2) {
                        this.I(mpk);
                    }
                    if (npk == h0 && !b2) {
                        this.I(mpk);
                    }
                }
                if (npk == h0) {
                    final int size2 = a.size();
                    int j = 0;
                    while (true) {
                        while (j < size2) {
                            if (!p4j.p((tpk)a.get(j))) {
                                final boolean b3 = false;
                                if (b3) {
                                    this.G0 = 1;
                                    this.H0.H0 = false;
                                }
                                return;
                            }
                            else {
                                ++j;
                            }
                        }
                        final boolean b3 = true;
                        continue;
                    }
                }
            }
        };
    }
    
    public final dlh E(final dlh dlh) {
        return z9a.i((dlh)this, dlh);
    }
    
    public final boolean H(final stb stb) {
        return k5b.a((b)this, stb);
    }
    
    public final Object X(final Object o, final hub hub) {
        e0e.f((Object)hub, "operation");
        return hub.invoke(o, (Object)this);
    }
    
    public final stb<MotionEvent, Boolean> a() {
        final stb<? super MotionEvent, Boolean> f0 = this.F0;
        if (f0 != null) {
            return (stb<MotionEvent, Boolean>)f0;
        }
        e0e.m("onTouchEvent");
        throw null;
    }
    
    @Override
    public final ypk l0() {
        return this.I0;
    }
}
