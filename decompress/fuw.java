import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fuw extends wxv
{
    public final List<zwv> b;
    
    public fuw(final List<? extends zwv> b) {
        e0e.f((Object)b, "components");
        this.b = (List<zwv>)b;
    }
    
    public final List<zwv> a() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fuw && e0e.a((Object)this.b, (Object)((fuw)o).b));
    }
    
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final Iterator<zwv> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().getName());
            sb.append(" + ");
        }
        final String string = sb.toString();
        e0e.e((Object)string, "sb.toString()");
        return string;
    }
    
    public static final class a extends z4j<fuw>
    {
        public List<? extends zwv> a;
        
        public final Object i() {
            final List<? extends zwv> a = this.a;
            e0e.c((Object)a);
            return new fuw(a);
        }
        
        public final boolean k() {
            final List<? extends zwv> a = this.a;
            return (a == null || a.isEmpty()) ^ true;
        }
    }
}
