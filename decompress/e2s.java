import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e2s extends pwv
{
    public final List<List<tvv>> b;
    
    public e2s(final List<? extends List<? extends tvv>> b) {
        this.b = (List<List<tvv>>)b;
    }
    
    public final List<tvv> a() {
        return kr4.i1((Iterable)this.b);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof e2s && zzd.a((Object)this.b, (Object)((e2s)o).b));
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
    
    public static final class a extends h4j<e2s>
    {
        public List<? extends List<? extends tvv>> a;
        
        public final Object i() {
            final List<? extends List<? extends tvv>> a = this.a;
            zzd.c((Object)a);
            return new e2s(a);
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
    
    public static final class b extends js2<e2s, a>
    {
        public static final b c;
        
        static {
            c = new b();
        }
        
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) {
            final e2s e2s = (e2s)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)e2s, "layout");
            ((s4j)new xq4$a((alp)new xq4$a((alp)tvv.a))).c(flp, (Object)e2s.b);
            final int a = w4j.a;
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) {
            final a a = (a)h4j;
            zzd.f((Object)elp, "input");
            zzd.f((Object)a, "builder");
            final Object a2 = ((s4j)new xq4$a((alp)new xq4$a((alp)tvv.a))).a(elp);
            pf8.r(a2);
            zzd.e(a2, "input.readNotNullObject(\u2026          )\n            )");
            a.a = (List<? extends List<? extends tvv>>)a2;
        }
    }
}
