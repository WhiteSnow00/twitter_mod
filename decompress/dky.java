import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dky extends ohy
{
    public dky() {
        super.a.add(qly.H0);
        super.a.add(qly.y1);
        super.a.add(qly.B1);
    }
    
    @Override
    public final kfy a(final String s, final y7z y7z, final List list) {
        final qly g0 = qly.G0;
        final int ordinal = ((Enum)vbz.e(s)).ordinal();
        if (ordinal != 1) {
            if (ordinal == 47) {
                final qly y1 = qly.y1;
                vbz.h("NOT", 1, list);
                return (kfy)new icy(Boolean.valueOf(y7z.d((kfy)list.get(0)).j() ^ true));
            }
            if (ordinal != 50) {
                this.b(s);
                throw null;
            }
            final qly b1 = qly.B1;
            vbz.h("OR", 2, list);
            final kfy d = y7z.d((kfy)list.get(0));
            if (d.j()) {
                return d;
            }
            return y7z.d((kfy)list.get(1));
        }
        else {
            final qly h0 = qly.H0;
            vbz.h("AND", 2, list);
            final kfy d2 = y7z.d((kfy)list.get(0));
            if (!d2.j()) {
                return d2;
            }
            return y7z.d((kfy)list.get(1));
        }
    }
}
