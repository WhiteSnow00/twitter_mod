import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jf1 implements pxd<Object>
{
    public final List<jf1.jf1$a> D0;
    
    public jf1() {
        this.D0 = new ArrayList();
    }
    
    public final void a(final jf1.jf1$a jf1$a) {
        czd.f((Object)jf1$a, "backNavigationCallback");
        this.D0.add(jf1$a);
    }
    
    public final void b(final jf1.jf1$a jf1$a) {
        czd.f((Object)jf1$a, "backNavigationCallback");
        this.D0.remove(jf1$a);
    }
    
    @Override
    public final boolean j() {
        for (final Object next : this.D0) {
            if (((jf1.jf1$a)next).Q0()) {
                return next != null;
            }
        }
        Object next = null;
        return next != null;
    }
}
