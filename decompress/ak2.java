import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;
import tv.periscope.model.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ak2 implements y4e<b>
{
    public final m29 a;
    public final List<b> b;
    public final Set<g4e> c;
    public final bk2 d;
    
    public ak2(final bk2 d) {
        this.a = new m29();
        this.b = new LinkedList();
        this.c = new HashSet();
        this.d = d;
    }
    
    public final int a() {
        return this.b.size();
    }
    
    public final void b(final g4e g4e) {
        this.c.add(g4e);
    }
    
    public final void e(final g4e g4e) {
        this.c.remove(g4e);
    }
    
    public final Object getItem(final int n) {
        return this.b.get(n);
    }
    
    public final long getItemId(final int n) {
        return this.b.get(n).w().hashCode();
    }
    
    public final boolean hasStableIds() {
        return true;
    }
}
