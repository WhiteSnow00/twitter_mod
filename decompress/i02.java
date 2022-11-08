import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i02
{
    public int a;
    public long b;
    public final int c;
    public final int d;
    public final uqm<Bitmap> e;
    
    public i02(final int c, final int d) {
        final boolean b = false;
        ri4.j(Boolean.valueOf(c > 0));
        boolean b2 = b;
        if (d > 0) {
            b2 = true;
        }
        ri4.j(Boolean.valueOf(b2));
        this.c = c;
        this.d = d;
        this.e = new i02$a(this);
    }
    
    public final void a(final Bitmap bitmap) {
        synchronized (this) {
            final int d = g12.d(bitmap);
            ri4.n(this.a > 0, (Object)"No bitmaps registered.");
            final long n = d;
            final boolean b = n <= this.b;
            final long b2 = this.b;
            if (b) {
                this.b -= n;
                --this.a;
                return;
            }
            throw new IllegalArgumentException(ri4.E("Bitmap size bigger than the total registered size: %d, %d", new Object[] { d, b2 }));
        }
    }
    
    public final int b() {
        synchronized (this) {
            return this.d;
        }
    }
}
