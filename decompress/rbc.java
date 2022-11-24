import java.util.Iterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rbc extends b
{
    public static final rbc.rbc$b b;
    public final Map<String, String> a;
    
    static {
        b = new rbc.rbc$b();
    }
    
    public rbc(final Map<String, String> a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && rbc.class == o.getClass() && o5j.a((Object)this.a, (Object)((rbc)o).a));
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.a);
    }
    
    public static final class a extends z4j<rbc>
    {
        public final List<String> a;
        public final Map<String, String> b;
        public final Map<String, String> c;
        
        public a() {
            this.a = new ArrayList();
            this.b = new HashMap();
            this.c = new HashMap();
        }
        
        public final Object i() {
            rbc rbc;
            if (this.a.isEmpty()) {
                rbc = new rbc(Collections.emptyMap());
            }
            else {
                for (final Map.Entry<String, V> entry : this.c.entrySet()) {
                    for (final String s : this.a) {
                        final HashMap b = this.b;
                        final StringBuilder f = ehk.f(s);
                        f.append(entry.getKey());
                        b.put(f.toString(), entry.getValue());
                    }
                }
                rbc = new rbc(this.b);
            }
            return rbc;
        }
    }
}
