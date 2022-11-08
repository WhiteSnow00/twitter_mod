import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oeg implements x02
{
    public final peg C0;
    public final int D0;
    public int E0;
    public final jqk F0;
    public int G0;
    
    public oeg(final int e0, final jqk f0) {
        this.C0 = new y02();
        this.D0 = 0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void b(final Object o) {
        final Bitmap bitmap = (Bitmap)o;
        final int b = this.C0.b((Object)bitmap);
        if (b <= this.E0) {
            this.F0.c();
            this.C0.d((Object)bitmap);
            synchronized (this) {
                this.G0 += b;
            }
        }
    }
    
    public final void f(final d4h d4h) {
        this.g((int)((1.0 - d4h.C0) * this.D0));
    }
    
    public final void g(final int n) {
        synchronized (this) {
            while (this.G0 > n) {
                final Bitmap bitmap = (Bitmap)((peg)this.C0).c();
                if (bitmap == null) {
                    break;
                }
                this.G0 -= this.C0.b((Object)bitmap);
                this.F0.d();
            }
        }
    }
    
    public final Object get(int b) {
        synchronized (this) {
            final int g0 = this.G0;
            final int d0 = this.D0;
            if (g0 > d0) {
                this.g(d0);
            }
            Bitmap bitmap = (Bitmap)this.C0.a(b);
            if (bitmap != null) {
                b = this.C0.b((Object)bitmap);
                this.G0 -= b;
                this.F0.h();
                monitorexit(this);
            }
            else {
                this.F0.f();
                bitmap = Bitmap.createBitmap(1, b, Bitmap$Config.ALPHA_8);
            }
            return bitmap;
        }
    }
}
