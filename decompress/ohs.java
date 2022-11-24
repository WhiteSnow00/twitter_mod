import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ohs
{
    public final pis a;
    public final eis b;
    public final sis c;
    public final boolean d;
    public final boolean e;
    public final yjs f;
    public final ngj g;
    public final rtv h;
    public final sqe i;
    public final stb<sis, vzv> j;
    
    public ohs(final pis a, final eis b, final sis c, final boolean d, final boolean e, final yjs f, final ngj g, final rtv h, final stb j) {
        final sqe a2 = (sqe)vqe.a;
        e0e.f((Object)a, "state");
        e0e.f((Object)b, "selectionManager");
        e0e.f((Object)c, "value");
        e0e.f((Object)f, "preparedSelectionState");
        e0e.f((Object)g, "offsetMapping");
        e0e.f((Object)a2, "keyMapping");
        e0e.f((Object)j, "onValueChange");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = (sqe)a2;
        this.j = (stb<sis, vzv>)j;
    }
    
    public final void a(final List<? extends sr9> list) {
        final it9 c = this.a.c;
        final List l2 = rr4.l2((Collection)list);
        ((ArrayList<u0b>)l2).add(0, new u0b());
        this.j.invoke((Object)c.a(l2));
    }
}
