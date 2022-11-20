import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sbq<Item>
{
    public final View a;
    public final pf<Item> b;
    public final xk6<Item> c;
    public final List<Integer> d;
    
    public sbq(final View a, final pf<Item> b, final xk6<Item> c) {
        czd.f((Object)a, "view");
        czd.f((Object)b, "accessibilityActionsFactory");
        czd.f((Object)c, "contentDescriptionFactory");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new ArrayList();
    }
    
    public final void a(final Item item) {
        this.a.setContentDescription((CharSequence)this.c.a(item));
        final Object a = ((ypa)this.b).a((Object)item);
        czd.e(a, "accessibilityActionsFactory.create(item)");
        for (final nf nf : (Iterable)a) {
            this.d.add(j6x.a(this.a, (CharSequence)nf.b(), (ah)new y4w((Object)nf, (Object)item, 2)));
        }
    }
    
    public final void b() {
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            j6x.v(this.a, ((Number)iterator.next()).intValue());
        }
        this.d.clear();
    }
}
