import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tmr implements g39
{
    public final l9r a;
    
    public tmr(final l9r a) {
        this.a = a;
    }
    
    public final void dispose() {
        final exe a = ((umr)this.a.getValue()).a();
        final swe a2 = a.a;
        a2.O0 = true;
        final Iterator iterator = a.e.values().iterator();
        while (iterator.hasNext()) {
            final we6 c = ((exe$a)iterator.next()).c;
            if (c != null) {
                c.dispose();
            }
        }
        a.a.T();
        a2.O0 = false;
        a.e.clear();
        a.f.clear();
        a.k = 0;
        a.j = 0;
        a.h.clear();
        a.c();
    }
}
