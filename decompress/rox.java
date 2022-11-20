import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rox
{
    public static int f;
    public ArrayList<ni6> a;
    public int b;
    public int c;
    public ArrayList<a> d;
    public int e;
    
    public rox(final int c) {
        this.a = new ArrayList<ni6>();
        this.d = null;
        this.e = -1;
        final int f = rox.f;
        rox.f = f + 1;
        this.b = f;
        this.c = c;
    }
    
    public final boolean a(final ni6 ni6) {
        if (this.a.contains(ni6)) {
            return false;
        }
        this.a.add(ni6);
        return true;
    }
    
    public final void b(final ArrayList<rox> list) {
        final int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < list.size(); ++i) {
                final rox rox = list.get(i);
                if (this.e == rox.b) {
                    this.d(this.c, rox);
                }
            }
        }
        if (size == 0) {
            list.remove(this);
        }
    }
    
    public final int c(final bdf bdf, int n) {
        final int size = this.a.size();
        final int n2 = 0;
        if (size == 0) {
            return 0;
        }
        final ArrayList<ni6> a = this.a;
        final oi6 oi6 = (oi6)a.get(0).V;
        bdf.u();
        ((ni6)oi6).f(bdf, false);
        for (int i = 0; i < a.size(); ++i) {
            ((ni6)a.get(i)).f(bdf, false);
        }
        if (n == 0 && oi6.D0 > 0) {
            bo3.a(oi6, bdf, (ArrayList)a, 0);
        }
        if (n == 1 && oi6.E0 > 0) {
            bo3.a(oi6, bdf, (ArrayList)a, 1);
        }
        try {
            bdf.q();
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        this.d = new ArrayList<a>();
        for (int j = n2; j < a.size(); ++j) {
            this.d.add(new a((ni6)a.get(j), bdf));
        }
        int n3;
        if (n == 0) {
            n3 = bdf.o((Object)((ni6)oi6).J);
            n = bdf.o((Object)((ni6)oi6).L);
            bdf.u();
        }
        else {
            n3 = bdf.o((Object)((ni6)oi6).K);
            n = bdf.o((Object)((ni6)oi6).M);
            bdf.u();
        }
        return n - n3;
    }
    
    public final void d(final int n, final rox rox) {
        for (final ni6 ni6 : this.a) {
            rox.a(ni6);
            if (n == 0) {
                ni6.s0 = rox.b;
            }
            else {
                ni6.t0 = rox.b;
            }
        }
        this.e = rox.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final int c = this.c;
        String s;
        if (c == 0) {
            s = "Horizontal";
        }
        else if (c == 1) {
            s = "Vertical";
        }
        else if (c == 2) {
            s = "Both";
        }
        else {
            s = "Unknown";
        }
        sb.append(s);
        sb.append(" [");
        String s2 = wc0.A(sb, this.b, "] <");
        for (final ni6 ni6 : this.a) {
            final StringBuilder b = kgi.b(s2, " ");
            b.append(ni6.j0);
            s2 = b.toString();
        }
        return hmg.h(s2, " >");
    }
    
    public final class a
    {
        public a(final ni6 ni6, final bdf bdf) {
            new WeakReference(ni6);
            bdf.o((Object)ni6.J);
            bdf.o((Object)ni6.K);
            bdf.o((Object)ni6.L);
            bdf.o((Object)ni6.M);
            bdf.o((Object)ni6.N);
        }
    }
}
