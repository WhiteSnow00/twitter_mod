import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jr4 extends wxv
{
    public final List<List<zwv>> b;
    
    public jr4(final List<? extends List<? extends zwv>> b) {
        this.b = (List<List<zwv>>)b;
    }
    
    public final List<zwv> a() {
        return nr4.e1((Iterable)this.b);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof jr4 && e0e.a((Object)this.b, (Object)((jr4)o).b));
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
    
    public static final class a extends z4j<jr4>
    {
        public List<? extends List<? extends zwv>> a;
        
        public final Object i() {
            final List<? extends List<? extends zwv>> a = this.a;
            e0e.c((Object)a);
            return new jr4(a);
        }
        
        public final boolean k() {
            final List<? extends List<? extends zwv>> a = this.a;
            if (a == null) {
                return false;
            }
            e0e.c((Object)a);
            final Iterator<Object> iterator = (Iterator<Object>)a.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public static final class b extends ss2<jr4, a>
    {
        public static final b c;
        
        static {
            c = new b();
        }
        
        public b() {
            super(0);
        }
        
        public final void f(final smp smp, final Object o) {
            final jr4 jr4 = (jr4)o;
            e0e.f((Object)smp, "output");
            e0e.f((Object)jr4, "layout");
            ((k5j)new ar4$a((nmp)new ar4$a((nmp)zwv.a))).c(smp, (Object)jr4.b);
            final int a = o5j.a;
        }
        
        public final z4j g() {
            return new a();
        }
        
        public final void h(final rmp rmp, final z4j z4j, final int n) {
            final a a = (a)z4j;
            e0e.f((Object)rmp, "input");
            e0e.f((Object)a, "builder");
            final Object a2 = ((k5j)new ar4$a((nmp)new ar4$a((nmp)zwv.a))).a(rmp);
            vmw.g(a2);
            e0e.e(a2, "input.readNotNullObject(\u2026          )\n            )");
            a.a = (List<? extends List<? extends zwv>>)a2;
        }
    }
}
