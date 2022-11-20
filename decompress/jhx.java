import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhx implements ihx, khx
{
    public final pd3 a;
    public boolean b;
    
    public jhx(final xbm xbm, final pd3 a) {
        this.b = false;
        this.a = a;
        xbm.i((oj)new ifc(this, 10));
    }
    
    public final boolean a() {
        if (this.b) {
            this.a.onLongPress(null);
            return true;
        }
        return false;
    }
    
    public final boolean b() {
        if (this.b) {
            this.a.onSingleTapUp(null);
            return true;
        }
        return false;
    }
    
    public final boolean c() {
        if (this.b) {
            this.a.c();
            return true;
        }
        return false;
    }
    
    public final boolean d() {
        if (this.b) {
            this.a.l();
            return true;
        }
        return false;
    }
    
    public final boolean e() {
        return this.b;
    }
    
    public final void start() {
        if (this.b) {
            ho0.z("Another client is already observing volume presses.");
        }
        else {
            this.b = true;
        }
    }
    
    public final void stop() {
        this.b = false;
    }
}
