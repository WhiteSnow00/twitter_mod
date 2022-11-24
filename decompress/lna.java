import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lna extends wxv
{
    public final List<List<zwv>> b;
    public final List<zwv> c;
    
    public lna(final List<? extends List<? extends zwv>> b) {
        this.b = (List<List<zwv>>)b;
        this.c = (ArrayList)nr4.e1((Iterable)b);
    }
    
    public final List<zwv> a() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof lna && e0e.a((Object)this.b, (Object)((lna)o).b));
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
                shw.U0();
                throw null;
            }
            final List list = next;
            sb.append("[");
            final Iterator iterator2 = list.iterator();
            int n2 = 0;
            while (iterator2.hasNext()) {
                final Object next2 = iterator2.next();
                if (n2 < 0) {
                    shw.U0();
                    throw null;
                }
                sb.append(((zwv)next2).getName());
                if (n2 < shw.F((List)list)) {
                    sb.append(" + ");
                }
                ++n2;
            }
            sb.append("]");
            if (n < shw.F((List)this.b)) {
                sb.append(" + ");
            }
            ++n;
        }
        final String string = sb.toString();
        e0e.e((Object)string, "sb.toString()");
        return string;
    }
    
    public static final class a extends z4j<lna>
    {
        public List<? extends List<? extends zwv>> a;
        
        public final Object i() {
            final List<? extends List<? extends zwv>> a = this.a;
            e0e.c((Object)a);
            return new lna(a);
        }
        
        public final boolean k() {
            final List<? extends List<? extends zwv>> a = this.a;
            if (a == null) {
                return false;
            }
            e0e.c((Object)a);
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
