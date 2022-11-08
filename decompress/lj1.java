import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lj1 extends qk1<wi4<ui4>>
{
    public final void f(final h88<wi4<ui4>> h88) {
        final ob ob = (ob)h88;
        if (!ob.g()) {
            return;
        }
        final wi4 wi4 = ((h88<wi4>)ob).d();
        Bitmap e = null;
        if (wi4 != null) {
            e = e;
            if (wi4.h() instanceof ti4) {
                e = ((ti4)wi4.h()).e();
            }
        }
        try {
            this.g(e);
        }
        finally {
            wi4.e(wi4);
        }
    }
    
    public abstract void g(final Bitmap p0);
}
