import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hu6
{
    public final Object a = new HashMap();
    public final Object b = new vgy(1);
    
    public hu6(final n7j n7j) {
        zzd.f((Object)n7j, "observableFuture");
        final rpg rpg = new rpg();
        this.a = rpg;
        this.b = rpg;
        n7j.i((u93)new dgk((Object)this, 23));
        n7j.g((u93)new jp3((Object)this, 23));
        n7j.f((u93)new en((Object)this, 25));
        n7j.j((u93)new fpa(this, 24));
        Objects.requireNonNull((log)rpg);
    }
    
    public final aey a(final k6z k6z, final aey aey) {
        haz.c(k6z);
        if (aey instanceof ley) {
            final ley ley = (ley)aey;
            final ArrayList d0 = ley.D0;
            final String c0 = ley.C0;
            Object o;
            if (((Map)this.a).containsKey(c0)) {
                o = ((Map)this.a).get(c0);
            }
            else {
                o = this.b;
            }
            return ((egy)o).a(c0, k6z, (List)d0);
        }
        return aey;
    }
    
    public final void b(final egy egy) {
        final Iterator iterator = egy.a.iterator();
        while (iterator.hasNext()) {
            ((Map)this.a).put(Integer.valueOf(((gky)iterator.next()).C0).toString(), egy);
        }
    }
}
