import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k90 implements r02
{
    public final o02 a;
    public j90 b;
    public ia0 c;
    public final k90$a d;
    
    public k90(final o02 a, final j90 b) {
        final ia0$a d = (ia0$a)new ia0$a(this) {
            public final k90 a;
            
            public final void a() {
            }
            
            public final cj4<Bitmap> b(final int n) {
                return this.a.a.g(n);
            }
        };
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = new ia0(b, (ia0$a)d);
    }
    
    public final boolean a(final int n, final Bitmap bitmap) {
        try {
            this.c.d(n, bitmap);
            return true;
        }
        catch (final IllegalStateException ex) {
            fr0.p((Class)k90.class, (Throwable)ex, "Rendering of frame unsuccessful. Frame number: %d", new Object[] { n });
            return false;
        }
    }
}
