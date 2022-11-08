import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pav implements Iterable<mav>, usc
{
    public static final pav D0;
    public static final int[] E0;
    public final List<mav> C0;
    
    static {
        final ced$b d0 = ced.D0;
        final int a = w4j.a;
        D0 = new pav((List<mav>)d0);
        E0 = new int[0];
    }
    
    public pav(final List<mav> list) {
        this.C0 = ijf.x((List)list);
    }
    
    public pav(final mav... array) {
        this.C0 = ijf.y((Object[])array);
    }
    
    public static int[] g(final pav pav) {
        final int n = 0;
        int size;
        if (pav != null) {
            size = pav.C0.size();
        }
        else {
            size = 0;
        }
        if (size != 0) {
            final int[] array = new int[size];
            final Iterator<mav> iterator = pav.iterator();
            int n2 = n;
            while (iterator.hasNext()) {
                array[n2] = iterator.next().a;
                ++n2;
            }
            return array;
        }
        return pav.E0;
    }
    
    public static int i(final pav pav) {
        final mav mav = (mav)hr4.p((Iterable)pav);
        int a;
        if (mav != null) {
            a = mav.a;
        }
        else {
            a = 0;
        }
        return a;
    }
    
    public static String j(final pav pav) {
        if (pav == null) {
            return null;
        }
        for (final mav mav : pav) {
            if (mav != null && pjr.g((CharSequence)mav.b)) {
                return mav.b;
            }
        }
        return null;
    }
    
    public final String e() {
        final int i = i(this);
        final String j = j(this);
        if (i != 0 && j != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(i);
            sb.append("] ");
            sb.append(j);
            return sb.toString();
        }
        if (i != 0) {
            return ffa.k("[", i, "]");
        }
        return j;
    }
    
    @Override
    public final Iterator<mav> iterator() {
        return this.C0.iterator();
    }
    
    public final boolean l() {
        return this.C0.isEmpty();
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("[");
        final Iterator<mav> iterator = this.C0.iterator();
        while (iterator.hasNext()) {
            g.append(iterator.next());
            g.append(", ");
        }
        g.append("]");
        return g.toString();
    }
}
