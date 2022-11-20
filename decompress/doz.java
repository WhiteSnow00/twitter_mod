import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class doz
{
    public static final void a(final Object o, final Object o2) {
        final aoz aoz = (aoz)o;
        final ynz ynz = (ynz)o2;
        if (!((AbstractMap)aoz).isEmpty()) {
            final Iterator iterator = aoz.entrySet().iterator();
            if (iterator.hasNext()) {
                final Map.Entry entry = (Map.Entry)iterator.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }
    
    public static final Object b(final Object o, final Object o2) {
        final aoz aoz = (aoz)o;
        final aoz aoz2 = (aoz)o2;
        aoz aoz3 = aoz;
        if (!((AbstractMap)aoz2).isEmpty()) {
            aoz aoz4 = aoz;
            if (!aoz.D0) {
                if (((AbstractMap)aoz).isEmpty()) {
                    aoz4 = new aoz();
                }
                else {
                    aoz4 = new aoz((Map)aoz);
                }
            }
            aoz4.c();
            aoz3 = aoz4;
            if (!((AbstractMap)aoz2).isEmpty()) {
                aoz4.putAll((Map)aoz2);
                aoz3 = aoz4;
            }
        }
        return aoz3;
    }
}
