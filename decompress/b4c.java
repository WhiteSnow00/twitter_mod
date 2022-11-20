import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b4c extends ouh
{
    public b4c(final int n, final whq whq) {
        synchronized (yhq.c) {
            final ArrayList h = yhq.h;
            List p2;
            if (h.isEmpty() ^ true) {
                p2 = mq4.P0((Collection)h);
            }
            else {
                p2 = null;
            }
            Object o;
            if (p2 != null) {
                if ((o = mq4.D0(p2)) == null) {
                    o = new b4c$a(p2);
                }
            }
            else {
                o = null;
            }
            monitorexit(yhq.c);
            super(n, whq, (qsb)null, (qsb)o);
        }
    }
    
    public final void c() {
        synchronized (yhq.c) {
            ((thq)this).n();
        }
    }
    
    public final void j(final thq thq) {
        czd.f((Object)thq, "snapshot");
        qiq.a();
        throw null;
    }
    
    public final void k(final thq thq) {
        czd.f((Object)thq, "snapshot");
        qiq.a();
        throw null;
    }
    
    public final void l() {
        yhq.a();
    }
    
    public final thq s(final qsb<Object, fzv> qsb) {
        final b4c$c b4c$c = new b4c$c((qsb)qsb);
        final qsb<whq, fzv> a = (qsb<whq, fzv>)yhq.a;
        return (thq)yhq.f((qsb<? super whq, ?>)new aiq((qsb)b4c$c));
    }
    
    public final uhq u() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }
    
    public final ouh z(final qsb<Object, fzv> qsb, final qsb<Object, fzv> qsb2) {
        final b4c$b b4c$b = new b4c$b((qsb)qsb, (qsb)qsb2);
        final qsb<whq, fzv> a = (qsb<whq, fzv>)yhq.a;
        return (ouh)yhq.f((qsb<? super whq, ?>)new aiq((qsb)b4c$b));
    }
}
