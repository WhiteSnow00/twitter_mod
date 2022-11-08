import android.graphics.Bitmap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z02 implements p0l<wi4<ui4>>
{
    public final p0l<wi4<ui4>> a;
    public final int b;
    public final int c;
    public final boolean d;
    
    public z02(final p0l<wi4<ui4>> a, final int b, final int c, final boolean d) {
        ri4.j(Boolean.valueOf(b <= c));
        Objects.requireNonNull(a);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final dk6<wi4<ui4>> dk6, final q0l q0l) {
        if (q0l.n() && !this.d) {
            this.a.a((dk6)dk6, q0l);
        }
        else {
            this.a.a((dk6)new a(dk6, this.b, this.c), q0l);
        }
    }
    
    public static final class a extends vm8<wi4<ui4>, wi4<ui4>>
    {
        public final int c;
        public final int d;
        
        public a(final dk6<wi4<ui4>> dk6, final int c, final int d) {
            super((dk6)dk6);
            this.c = c;
            this.d = d;
        }
        
        public final void i(final Object o, final int n) {
            final wi4 wi4 = (wi4)o;
            if (wi4 != null) {
                if (wi4.i()) {
                    final ui4 ui4 = (ui4)wi4.h();
                    if (!ui4.isClosed()) {
                        if (ui4 instanceof zi4) {
                            final Bitmap f0 = ((zi4)ui4).F0;
                            if (f0 != null) {
                                final int n2 = f0.getHeight() * f0.getRowBytes();
                                if (n2 >= this.c) {
                                    if (n2 <= this.d) {
                                        f0.prepareToDraw();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            super.b.c((Object)wi4, n);
        }
    }
}
