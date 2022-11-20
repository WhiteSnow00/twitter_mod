import android.view.MotionEvent;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qd3 extends GestureDetector$SimpleOnGestureListener implements pd3
{
    public static final int M0 = 0;
    public final rck D0;
    public final qbc E0;
    public final qck F0;
    public final sd3 G0;
    public final wml H0;
    public final mhh I0;
    public final wc6 J0;
    public final nww K0;
    public rd3 L0;
    
    public qd3(final Context context, final rck d0, final qck f0, final qbc e0, final sd3 g0, final nb3 nb3, final mhh i0) {
        this.D0 = d0;
        this.F0 = f0;
        this.E0 = e0;
        this.G0 = g0;
        this.L0 = new rp9();
        this.H0 = new wml(context, (GestureDetector$OnGestureListener)this);
        this.K0 = nb3.a;
        this.I0 = i0;
        this.J0 = new wc6();
    }
    
    public final void a() {
        this.G0.a();
    }
    
    public final void bind() {
        this.J0.d(new t19[] { this.I0.o4().subscribe((lj6)new jds((Object)this, 27)), this.G0.k().subscribe((lj6)new iag(this, 21)), this.G0.j().subscribe((lj6)new a1p((Object)this, 22)) });
    }
    
    public final void c() {
        this.L0.c();
    }
    
    public final void d() {
        this.G0.d();
    }
    
    public final void e() {
        this.G0.e();
    }
    
    public final void f() {
        this.G0.f();
    }
    
    public final void g(final MotionEvent motionEvent) {
        this.H0.b(motionEvent);
        this.L0.g(motionEvent);
    }
    
    public final void h() {
        this.G0.h();
    }
    
    public final void l() {
        this.L0.l();
    }
    
    public final h5j<Boolean> n() {
        return (h5j<Boolean>)h5j.merge((taj)this.D0.n(), (taj)this.E0.n());
    }
    
    public final void onLongPress(final MotionEvent motionEvent) {
        this.L0.onLongPress(motionEvent);
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        this.L0.onScroll(motionEvent, motionEvent2, n, n2);
        return super.onScroll(motionEvent, motionEvent2, n, n2);
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        this.L0.onSingleTapUp(motionEvent);
        return true;
    }
    
    public final h5j<Boolean> q() {
        return (h5j<Boolean>)h5j.merge((taj)this.D0.q(), (taj)this.F0.D0.q(), (taj)this.E0.n());
    }
    
    public final h5j<tmi> u() {
        return (h5j<tmi>)h5j.merge((taj)this.D0.G0, (taj)this.F0.D0.G0);
    }
    
    public final void unbind() {
        this.J0.dispose();
    }
}
