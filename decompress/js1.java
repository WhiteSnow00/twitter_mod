import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class js1
{
    public final ArrayList<hj6> a;
    public a b;
    public ij6 c;
    
    public js1(final ij6 c) {
        this.a = new ArrayList<hj6>();
        this.b = new a();
        this.c = c;
    }
    
    public final boolean a(final b b, final hj6 hj6, int j) {
        final hj6$a c0 = hj6$a.C0;
        final a b2 = this.b;
        final hj6$a[] u = hj6.U;
        b2.a = u[0];
        b2.b = u[1];
        b2.c = hj6.x();
        this.b.d = hj6.q();
        final a b3 = this.b;
        b3.i = false;
        b3.j = j;
        final hj6$a a = b3.a;
        final hj6$a e0 = hj6$a.E0;
        final boolean b4 = a == e0;
        if (b3.b == e0) {
            j = 1;
        }
        else {
            j = 0;
        }
        final boolean b5 = b4 && hj6.Y > 0.0f;
        if (j != 0 && hj6.Y > 0.0f) {
            j = 1;
        }
        else {
            j = 0;
        }
        if (b5 && hj6.t[0] == 4) {
            b3.a = c0;
        }
        if (j != 0 && hj6.t[1] == 4) {
            b3.b = c0;
        }
        ((ConstraintLayout.b)b).b(hj6, b3);
        hj6.X(this.b.e);
        hj6.S(this.b.f);
        final a b6 = this.b;
        hj6.E = b6.h;
        hj6.P(b6.g);
        final a b7 = this.b;
        b7.j = 0;
        return b7.i;
    }
    
    public final void b(ij6 c, final int x0, final int n, final int n2) {
        final int d0 = c.d0;
        final int e0 = c.e0;
        c.V(0);
        c.U(0);
        c.X(n);
        c.S(n2);
        c.V(d0);
        c.U(e0);
        c = this.c;
        c.x0 = x0;
        c.a0();
    }
    
    public final void c(final ij6 ij6) {
        this.a.clear();
        for (int size = ij6.u0.size(), i = 0; i < size; ++i) {
            final hj6 hj6 = ij6.u0.get(i);
            final hj6$a[] u = hj6.U;
            final hj6$a hj6$a = u[0];
            final hj6$a e0 = hj6$a.E0;
            if (hj6$a == e0 || u[1] == e0) {
                this.a.add(hj6);
            }
        }
        ij6.j0();
    }
    
    public static final class a
    {
        public hj6$a a;
        public hj6$a b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }
    
    public interface b
    {
    }
}
