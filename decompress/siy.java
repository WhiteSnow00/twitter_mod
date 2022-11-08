import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class siy extends egy
{
    public siy() {
        super.a.add(gky.E0);
        super.a.add(gky.v1);
        super.a.add(gky.y1);
    }
    
    public final aey a(final String s, final k6z k6z, final List list) {
        final gky d0 = gky.D0;
        final int ordinal = ((Enum)haz.e(s)).ordinal();
        if (ordinal != 1) {
            if (ordinal == 47) {
                final gky v1 = gky.v1;
                haz.h("NOT", 1, list);
                return (aey)new yay(Boolean.valueOf(k6z.b((aey)list.get(0)).i() ^ true));
            }
            if (ordinal != 50) {
                this.b(s);
                throw null;
            }
            final gky y1 = gky.y1;
            haz.h("OR", 2, list);
            final aey b = k6z.b((aey)list.get(0));
            if (b.i()) {
                return b;
            }
            return k6z.b((aey)list.get(1));
        }
        else {
            final gky e0 = gky.E0;
            haz.h("AND", 2, list);
            final aey b2 = k6z.b((aey)list.get(0));
            if (!b2.i()) {
                return b2;
            }
            return k6z.b((aey)list.get(1));
        }
    }
}
