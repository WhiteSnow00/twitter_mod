import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kbv implements Iterable<hbv>, yrc
{
    public static final kbv E0;
    public static final int[] F0;
    public final List<hbv> D0;
    
    static {
        final gdd$b e0 = gdd.E0;
        final int a = c5j.a;
        E0 = new kbv((List<hbv>)e0);
        F0 = new int[0];
    }
    
    public kbv(final List<hbv> list) {
        this.D0 = rif.x((List)list);
    }
    
    public kbv(final hbv... array) {
        this.D0 = rif.y((Object[])array);
    }
    
    public static int[] g(final kbv kbv) {
        final int n = 0;
        int size;
        if (kbv != null) {
            size = kbv.D0.size();
        }
        else {
            size = 0;
        }
        if (size != 0) {
            final int[] array = new int[size];
            final Iterator<hbv> iterator = kbv.iterator();
            int n2 = n;
            while (iterator.hasNext()) {
                array[n2] = iterator.next().a;
                ++n2;
            }
            return array;
        }
        return kbv.F0;
    }
    
    public static int i(final kbv kbv) {
        final hbv hbv = (hbv)fq4.p((Iterable)kbv);
        int a;
        if (hbv != null) {
            a = hbv.a;
        }
        else {
            a = 0;
        }
        return a;
    }
    
    public static String j(final kbv kbv) {
        if (kbv == null) {
            return null;
        }
        for (final hbv hbv : kbv) {
            if (hbv != null && ikr.g((CharSequence)hbv.b)) {
                return hbv.b;
            }
        }
        return null;
    }
    
    @Override
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
            return ze.G("[", i, "]");
        }
        return j;
    }
    
    @Override
    public final Iterator<hbv> iterator() {
        return this.D0.iterator();
    }
    
    public final boolean l() {
        return this.D0.isEmpty();
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("[");
        final Iterator<hbv> iterator = this.D0.iterator();
        while (iterator.hasNext()) {
            j.append(iterator.next());
            j.append(", ");
        }
        j.append("]");
        return j.toString();
    }
}
