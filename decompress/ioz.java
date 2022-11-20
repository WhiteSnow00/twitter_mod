import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ioz
{
    public l7z a;
    public ArrayList b;
    public ArrayList c;
    public long d;
    public final poz e;
    
    public ioz(final poz e) {
        this.e = e;
    }
    
    public final boolean a(final long n, final h5z h5z) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (!this.c.isEmpty() && this.c.get(0).v() / 1000L / 60L / 60L != h5z.v() / 1000L / 60L / 60L) {
            return false;
        }
        final long d = this.d + h5z.c();
        this.e.K();
        if (d >= Math.max(0, (int)uzy.j.a((Object)null))) {
            return false;
        }
        this.d = d;
        this.c.add(h5z);
        this.b.add(n);
        final int size = this.c.size();
        this.e.K();
        return size < Math.max(1, (int)uzy.k.a((Object)null));
    }
}
