import java.util.TreeMap;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o000 extends fdy
{
    public final b200 H0;
    
    public o000(final b200 h0) {
        super("internal.registerCallback");
        this.H0 = h0;
    }
    
    public final kfy a(final y7z y7z, final List list) {
        vbz.h(super.F0, 3, list);
        y7z.d((kfy)list.get(0)).k();
        final kfy d = y7z.d((kfy)list.get(1));
        if (!(d instanceof dfy)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        final kfy d2 = y7z.d((kfy)list.get(2));
        if (!(d2 instanceof oey)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        final oey oey = (oey)d2;
        if (oey.g("type")) {
            final String k = oey.n("type").k();
            int b;
            if (oey.g("priority")) {
                b = vbz.b(oey.n("priority").h());
            }
            else {
                b = 1000;
            }
            final b200 h0 = this.H0;
            final dfy dfy = (dfy)d;
            Objects.requireNonNull(h0);
            TreeMap treeMap;
            if ("create".equals(k)) {
                treeMap = h0.b;
            }
            else {
                if (!"edit".equals(k)) {
                    throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(k)));
                }
                treeMap = h0.a;
            }
            int n = b;
            if (treeMap.containsKey(b)) {
                n = treeMap.lastKey() + 1;
            }
            treeMap.put(n, dfy);
            return (kfy)kfy.x0;
        }
        throw new IllegalArgumentException("Undefined rule type");
    }
}
