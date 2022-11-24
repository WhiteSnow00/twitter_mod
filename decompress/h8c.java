import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h8c
{
    public final List<String> a;
    
    public h8c(final String... array) {
        e0e.f((Object)array, "keys");
        final List p = ft0.p1((Object[])array);
        this.a = p;
    }
    
    public final List<h7c.a> a(final String s) {
        final List<String> a = this.a;
        final ArrayList list = new ArrayList<h7c$a$b>(nr4.d1((Iterable)a, 10));
        final Iterator<Object> iterator = a.iterator();
        while (iterator.hasNext()) {
            list.add(new h7c$a$b((String)iterator.next()));
        }
        final List l2 = rr4.l2((Collection)list);
        ((ArrayList<h7c$a$b>)l2).add(new h7c$a$b(s));
        return l2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof h8c && e0e.a((Object)this.a, (Object)((h8c)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return rh.x("GraphQlParsingPath(parsingPathKeys=", (List)this.a, ")");
    }
}
