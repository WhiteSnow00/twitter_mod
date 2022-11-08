import java.util.Iterator;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oav<OBJECT> extends ysm<tsc<OBJECT, pav>>
{
    public int a;
    
    public final long a(final ism<tsc<OBJECT, pav>> ism) {
        return this.e(ism);
    }
    
    public final String b() {
        return String.format(Locale.ENGLISH, "%s_count%d", oav.class.getSimpleName(), 1);
    }
    
    public final boolean c(final ism<tsc<OBJECT, pav>> ism) {
        if (ism.e() == null) {
            return false;
        }
        if (this.a == 1) {
            return false;
        }
        final pav pav = (pav)((tsc)ism.e()).h;
        if (!hr4.s((Iterable)pav)) {
            final Iterator<mav> iterator = pav.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().f >= 0) {
                    ++this.a;
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean d(final jci jci, final ism<tsc<OBJECT, pav>> ism) {
        return this.e(ism) == 0;
    }
    
    public final int e(final ism<tsc<OBJECT, pav>> ism) {
        final Object e = ism.e();
        int n = -1;
        if (e == null) {
            return -1;
        }
        final pav pav = (pav)((tsc)ism.e()).h;
        int n2 = n;
        if (!hr4.s((Iterable)pav)) {
            final Iterator<mav> iterator = pav.iterator();
            while (true) {
                n2 = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final int f = iterator.next().f;
                if (f < n) {
                    continue;
                }
                n = f;
            }
        }
        return n2;
    }
}
