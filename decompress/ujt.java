import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ujt
{
    public final yjt a;
    public final List<vjt> b;
    public final uv1<wjt> c;
    
    public ujt(final yjt a, final List<vjt> b) {
        e0e.f((Object)a, "name");
        e0e.f((Object)b, "tooltips");
        this.a = a;
        this.b = b;
        this.c = (uv1<wjt>)new uv1();
        this.a();
    }
    
    public final void a() {
        final Iterator<Object> iterator = this.b.iterator();
        while (true) {
            vjt next;
            do {
                final boolean hasNext = iterator.hasNext();
                final vzv vzv = null;
                if (!hasNext) {
                    next = null;
                    final vjt vjt = next;
                    vzv a = vzv;
                    if (vjt != null) {
                        final wjt b = vjt.b;
                        a = vzv;
                        if (b != null) {
                            this.c.onNext((Object)b);
                            a = vzv.a;
                        }
                    }
                    if (a == null) {
                        this.c.onNext((Object)wjt.i1);
                    }
                    return;
                }
                next = iterator.next();
            } while (!(next.a() ^ true));
            continue;
        }
    }
}
