import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v1k
{
    public final List<mqe> a;
    public final int b;
    public int c;
    public final List<mqe> d;
    public final HashMap<Integer, c9c> e;
    public final h5s f;
    
    public v1k(final List<mqe> a, int i) {
        this.a = a;
        this.b = i;
        final int n = 0;
        if (i >= 0) {
            i = 1;
        }
        else {
            i = 0;
        }
        if (i != 0) {
            this.d = new ArrayList();
            final HashMap<Integer, c9c> e = new HashMap<Integer, c9c>();
            final int size = a.size();
            int n2 = 0;
            mqe mqe;
            for (i = n; i < size; ++i) {
                mqe = this.a.get(i);
                e.put(mqe.c, new c9c(i, n2, mqe.d));
                n2 += mqe.d;
            }
            this.e = e;
            this.f = (h5s)jty.N((ptb)new v1k$a(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }
    
    public final int a(final mqe mqe) {
        e0e.f((Object)mqe, "keyInfo");
        final c9c c9c = this.e.get(mqe.c);
        int b;
        if (c9c != null) {
            b = c9c.b;
        }
        else {
            b = -1;
        }
        return b;
    }
    
    public final void b(final mqe mqe, final int n) {
        this.e.put(mqe.c, new c9c(-1, n, 0));
    }
    
    public final boolean c(int n, int n2) {
        final c9c c9c = this.e.get(n);
        if (c9c != null) {
            final int b = c9c.b;
            n = n2 - c9c.c;
            c9c.c = n2;
            if (n != 0) {
                final Collection<c9c> values = this.e.values();
                e0e.e((Object)values, "groupInfos.values");
                for (final c9c c9c2 : values) {
                    if (c9c2.b >= b && !e0e.a((Object)c9c2, (Object)c9c)) {
                        n2 = c9c2.b + n;
                        if (n2 < 0) {
                            continue;
                        }
                        c9c2.b = n2;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public final int d(final mqe mqe) {
        e0e.f((Object)mqe, "keyInfo");
        final c9c c9c = this.e.get(mqe.c);
        int n;
        if (c9c != null) {
            n = c9c.c;
        }
        else {
            n = mqe.d;
        }
        return n;
    }
}
