import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fj1 extends kk1<xh4<vh4>>
{
    public final void f(final t78<xh4<vh4>> t78) {
        final mb mb = (mb)t78;
        if (!mb.g()) {
            return;
        }
        final xh4 xh4 = (xh4)((t78)mb).d();
        Bitmap e = null;
        if (xh4 != null) {
            e = e;
            if (xh4.h() instanceof uh4) {
                e = ((uh4)xh4.h()).e();
            }
        }
        try {
            this.g(e);
        }
        finally {
            xh4.e(xh4);
        }
    }
    
    public abstract void g(final Bitmap p0);
}
