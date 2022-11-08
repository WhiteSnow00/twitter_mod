import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pnz
{
    public static final void a(final Object o, final Object o2) {
        final mnz mnz = (mnz)o;
        final knz knz = (knz)o2;
        if (!mnz.isEmpty()) {
            final Iterator iterator = mnz.entrySet().iterator();
            if (iterator.hasNext()) {
                final Map.Entry entry = (Map.Entry)iterator.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }
    
    public static final Object b(final Object o, final Object o2) {
        final mnz mnz = (mnz)o;
        final mnz mnz2 = (mnz)o2;
        mnz mnz3 = mnz;
        if (!mnz2.isEmpty()) {
            mnz mnz4 = mnz;
            if (!mnz.C0) {
                if (mnz.isEmpty()) {
                    mnz4 = new mnz();
                }
                else {
                    mnz4 = new mnz(mnz);
                }
            }
            mnz4.c();
            mnz3 = mnz4;
            if (!mnz2.isEmpty()) {
                mnz4.putAll(mnz2);
                mnz3 = mnz4;
            }
        }
        return mnz3;
    }
}
