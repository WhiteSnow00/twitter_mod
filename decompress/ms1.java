import androidx.constraintlayout.widget.ConstraintLayout$b;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ms1
{
    public final ArrayList<tj6> a;
    public a b;
    public uj6 c;
    
    public ms1(final uj6 c) {
        this.a = new ArrayList<tj6>();
        this.b = new a();
        this.c = c;
    }
    
    public final boolean a(final b b, final tj6 tj6, int j) {
        final tj6.a f0 = tj6.a.F0;
        final a b2 = this.b;
        final tj6.a[] u = tj6.U;
        b2.a = u[0];
        b2.b = u[1];
        b2.c = tj6.x();
        this.b.d = tj6.q();
        final a b3 = this.b;
        b3.i = false;
        b3.j = j;
        final tj6.a a = b3.a;
        final tj6.a h0 = tj6.a.H0;
        final boolean b4 = a == h0;
        if (b3.b == h0) {
            j = 1;
        }
        else {
            j = 0;
        }
        final boolean b5 = b4 && tj6.Y > 0.0f;
        if (j != 0 && tj6.Y > 0.0f) {
            j = 1;
        }
        else {
            j = 0;
        }
        if (b5 && tj6.t[0] == 4) {
            b3.a = f0;
        }
        if (j != 0 && tj6.t[1] == 4) {
            b3.b = f0;
        }
        ((ConstraintLayout$b)b).b(tj6, b3);
        tj6.X(this.b.e);
        tj6.S(this.b.f);
        final a b6 = this.b;
        tj6.E = b6.h;
        tj6.P(b6.g);
        final a b7 = this.b;
        b7.j = 0;
        return b7.i;
    }
    
    public final void b(uj6 c, final int x0, final int n, final int n2) {
        final int d0 = ((tj6)c).d0;
        final int e0 = ((tj6)c).e0;
        ((tj6)c).V(0);
        ((tj6)c).U(0);
        ((tj6)c).X(n);
        ((tj6)c).S(n2);
        ((tj6)c).V(d0);
        ((tj6)c).U(e0);
        c = this.c;
        c.x0 = x0;
        c.a0();
    }
    
    public final void c(final uj6 uj6) {
        this.a.clear();
        for (int size = ((hpx)uj6).u0.size(), i = 0; i < size; ++i) {
            final tj6 tj6 = ((hpx)uj6).u0.get(i);
            final tj6.a[] u = tj6.U;
            final tj6.a a = u[0];
            final tj6.a h0 = tj6.a.H0;
            if (a == h0 || u[1] == h0) {
                this.a.add(tj6);
            }
        }
        uj6.j0();
    }
    
    public static final class a
    {
        public tj6.a a;
        public tj6.a b;
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
