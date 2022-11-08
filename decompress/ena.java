import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ena extends pwv
{
    public final List<List<tvv>> b;
    public final List<tvv> c;
    
    public ena(final List<? extends List<? extends tvv>> b) {
        this.b = (List<List<tvv>>)b;
        this.c = (ArrayList)kr4.i1((Iterable)b);
    }
    
    public final List<tvv> a() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ena && zzd.a((Object)this.b, (Object)((ena)o).b));
    }
    
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final Iterator<Object> iterator = this.b.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final List next = iterator.next();
            if (n < 0) {
                tdy.V0();
                throw null;
            }
            final List list = next;
            sb.append("[");
            final Iterator iterator2 = list.iterator();
            int n2 = 0;
            while (iterator2.hasNext()) {
                final Object next2 = iterator2.next();
                if (n2 < 0) {
                    tdy.V0();
                    throw null;
                }
                sb.append(((tvv)next2).getName());
                if (n2 < tdy.S((List)list)) {
                    sb.append(" + ");
                }
                ++n2;
            }
            sb.append("]");
            if (n < tdy.S((List)this.b)) {
                sb.append(" + ");
            }
            ++n;
        }
        final String string = sb.toString();
        zzd.e((Object)string, "sb.toString()");
        return string;
    }
    
    public static final class a extends h4j<ena>
    {
        public List<? extends List<? extends tvv>> a;
        
        public final Object i() {
            final List<? extends List<? extends tvv>> a = this.a;
            zzd.c((Object)a);
            return new ena(a);
        }
        
        public final boolean l() {
            final List<? extends List<? extends tvv>> a = this.a;
            if (a == null) {
                return false;
            }
            zzd.c((Object)a);
            final Iterator<Object> iterator = a.iterator();
            int i;
            do {
                final boolean hasNext = iterator.hasNext();
                final int n = 1;
                if (!hasNext) {
                    return true;
                }
                final List list = iterator.next();
                i = n;
                if (list == null) {
                    continue;
                }
                if (list.isEmpty()) {
                    i = n;
                }
                else {
                    i = 0;
                }
            } while (i == 0);
            return false;
        }
    }
}
