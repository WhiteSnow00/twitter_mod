import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class snw implements gjp<rnw>
{
    public final List<rnw> a;
    
    public snw() {
        this.a = new ArrayList();
    }
    
    public final void c(final String s, final Object o) {
        this.a.add(new rnw(s, o));
    }
    
    public final Iterator<rnw> iterator() {
        return this.a.iterator();
    }
}
