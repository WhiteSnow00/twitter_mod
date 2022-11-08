import android.graphics.Canvas;
import java.util.Collection;
import android.graphics.Path;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arp
{
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    public final List<f> g;
    public final List<g> h;
    
    public arp() {
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.f(0.0f, 0.0f);
    }
    
    public final void a(final float n, final float n2, final float n3, final float n4, float n5, float g) {
        final arp.arp$d arp$d = new arp.arp$d(n, n2, n3, n4);
        arp$d.f = n5;
        arp$d.g = g;
        this.g.add(arp$d);
        final arp.arp$b arp$b = new arp.arp$b(arp$d);
        final float n6 = n5 + g;
        final boolean b = g < 0.0f;
        g = n5;
        if (b) {
            g = (n5 + 180.0f) % 360.0f;
        }
        if (b) {
            n5 = (180.0f + n6) % 360.0f;
        }
        else {
            n5 = n6;
        }
        this.b(g);
        this.h.add(arp$b);
        this.e = n5;
        n5 = (n3 - n) / 2.0f;
        final double n7 = n6;
        this.c = n5 * (float)Math.cos(Math.toRadians(n7)) + (n + n3) * 0.5f;
        this.d = (n4 - n2) / 2.0f * (float)Math.sin(Math.toRadians(n7)) + (n2 + n4) * 0.5f;
    }
    
    public final void b(final float e) {
        final float e2 = this.e;
        if (e2 == e) {
            return;
        }
        final float g = (e - e2 + 360.0f) % 360.0f;
        if (g > 180.0f) {
            return;
        }
        final float c = this.c;
        final float d = this.d;
        final arp.arp$d arp$d = new arp.arp$d(c, d, c, d);
        arp$d.f = this.e;
        arp$d.g = g;
        this.h.add(new arp.arp$b(arp$d));
        this.e = e;
    }
    
    public final void c(final Matrix matrix, final Path path) {
        for (int size = this.g.size(), i = 0; i < size; ++i) {
            ((f)this.g.get(i)).a(matrix, path);
        }
    }
    
    public final g d(Matrix matrix) {
        this.b(this.f);
        matrix = new Matrix(matrix);
        return (g)new arp$a((List)new ArrayList(this.h), matrix);
    }
    
    public final void e(final float n, final float n2) {
        final arp.arp$e arp$e = new arp.arp$e();
        arp$e.b = n;
        arp$e.c = n2;
        this.g.add(arp$e);
        final arp.arp$c arp$c = new arp.arp$c(arp$e, this.c, this.d);
        final float b = arp$c.b();
        final float b2 = arp$c.b();
        this.b(b + 270.0f);
        this.h.add(arp$c);
        this.e = b2 + 270.0f;
        this.c = n;
        this.d = n2;
    }
    
    public final void f(final float n, final float n2) {
        this.g(n, n2, 270.0f, 0.0f);
    }
    
    public final void g(final float n, final float n2, final float e, final float n3) {
        this.a = n;
        this.b = n2;
        this.c = n;
        this.d = n2;
        this.e = e;
        this.f = (e + n3) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
    
    public abstract static class f
    {
        public final Matrix a;
        
        public f() {
            this.a = new Matrix();
        }
        
        public abstract void a(final Matrix p0, final Path p1);
    }
    
    public abstract static class g
    {
        public static final Matrix a;
        
        static {
            a = new Matrix();
        }
        
        public abstract void a(final Matrix p0, final lqp p1, final int p2, final Canvas p3);
    }
}
