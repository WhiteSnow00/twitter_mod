import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f1k
{
    public final List<ppe> a;
    public final int b;
    public int c;
    public final List<ppe> d;
    public final HashMap<Integer, a8c> e;
    public final n4s f;
    
    public f1k(final List<ppe> a, int b) {
        this.a = a;
        this.b = b;
        int i = 0;
        if (b >= 0) {
            b = 1;
        }
        else {
            b = 0;
        }
        if (b != 0) {
            this.d = new ArrayList();
            final HashMap<Integer, a8c> e = new HashMap<Integer, a8c>();
            final int size = a.size();
            b = 0;
            while (i < size) {
                final ppe ppe = this.a.get(i);
                e.put(ppe.c, new a8c(i, b, ppe.d));
                b += ppe.d;
                ++i;
            }
            this.e = e;
            this.f = (n4s)pps.n((nsb)new f1k$a(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }
    
    public final int a(final ppe ppe) {
        czd.f((Object)ppe, "keyInfo");
        final a8c a8c = this.e.get(ppe.c);
        int b;
        if (a8c != null) {
            b = a8c.b;
        }
        else {
            b = -1;
        }
        return b;
    }
    
    public final void b(final ppe ppe, final int n) {
        this.e.put(ppe.c, new a8c(-1, n, 0));
    }
    
    public final boolean c(int b, int n) {
        final a8c a8c = this.e.get(b);
        if (a8c != null) {
            b = a8c.b;
            final int n2 = n - a8c.c;
            a8c.c = n;
            if (n2 != 0) {
                final Collection<a8c> values = this.e.values();
                czd.e((Object)values, "groupInfos.values");
                for (final a8c a8c2 : values) {
                    if (a8c2.b >= b && !czd.a((Object)a8c2, (Object)a8c)) {
                        n = a8c2.b + n2;
                        if (n < 0) {
                            continue;
                        }
                        a8c2.b = n;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public final int d(final ppe ppe) {
        czd.f((Object)ppe, "keyInfo");
        final a8c a8c = this.e.get(ppe.c);
        int n;
        if (a8c != null) {
            n = a8c.c;
        }
        else {
            n = ppe.d;
        }
        return n;
    }
}
