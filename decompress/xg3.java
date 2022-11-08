import android.graphics.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xg3
{
    public static final xg3 a;
    
    static {
        a = new xg3();
    }
    
    public final void a(final Canvas canvas, final boolean b) {
        zzd.f((Object)canvas, "canvas");
        if (b) {
            canvas.enableZ();
        }
        else {
            canvas.disableZ();
        }
    }
}
