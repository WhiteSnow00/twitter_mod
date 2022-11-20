import android.view.MotionEvent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebs
{
    public final nnl<dbs$a> a;
    public boolean b;
    public boolean c;
    
    public ebs() {
        this.a = (nnl<dbs$a>)new nnl();
        this.b = false;
        this.c = false;
    }
    
    public final dbs$a a(final Context context, final MotionEvent motionEvent) {
        final int x = syo.d(context).x;
        final float x2 = motionEvent.getX();
        final float n = (float)x;
        if (x2 < 0.175f * n) {
            return dbs$a.E0;
        }
        if (motionEvent.getX() > n * 0.825f) {
            return dbs$a.D0;
        }
        return dbs$a.F0;
    }
}
