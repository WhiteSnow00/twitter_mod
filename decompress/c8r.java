import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class c8r
{
    public final List<hjp> a;
    public final List<String> b;
    
    public c8r(final List<? extends hjp> a, final List<String> b) {
        zzd.f((Object)b, "listOfValidUc");
        this.a = (List<hjp>)a;
        this.b = b;
    }
    
    public void a(final hp9 hp9) {
        zzd.f((Object)hp9, "log");
        new ArrayList<gvj>().add(new gvj((Object)hp9.a, (Object)hp9.d));
        if (jil.valueOf(hp9.a) == jil.B1) {
            final String e = hp9.e;
            if (e != null) {
                if (!this.b.contains(e)) {
                    final z8a z8a = new z8a((Throwable)new IllegalArgumentException("Event anomaly detector: invalid unified card event"));
                    ((HashMap<String, String>)z8a.a).put("unified_card_event", e);
                    e9a.c(z8a);
                }
            }
        }
        final List<hjp> a = this.a;
        final ArrayList list = new ArrayList<Boolean>(kr4.h1((Iterable)a, 10));
        final Iterator<Object> iterator = a.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().a(hp9));
        }
        final boolean empty = list.isEmpty();
        final boolean b = true;
        int n = 0;
        Label_0225: {
            if (empty) {
                n = (b ? 1 : 0);
            }
            else {
                final Iterator<Boolean> iterator2 = list.iterator();
                do {
                    n = (b ? 1 : 0);
                    if (iterator2.hasNext()) {
                        continue;
                    }
                    break Label_0225;
                } while (iterator2.next() ^ true);
                n = 0;
            }
        }
        if (n != 0) {
            final ArrayList<gvj> list2 = new ArrayList<gvj>();
            for (final hjp hjp : this.a) {
                list2.add(new gvj((Object)hjp.b(), (Object)hjp.c()));
            }
            final z8a z8a2 = new z8a((Throwable)new IllegalArgumentException("Event anomaly detector out of order state"));
            ((HashMap<String, String>)z8a2.a).put("next_state", hp9.a);
            ((HashMap<String, ArrayList<gvj>>)z8a2.a).put("current_states", list2);
            ((HashMap<String, String>)z8a2.a).put("card_type", hp9.c);
            ((HashMap<String, String>)z8a2.a).put("impression_id", hp9.b);
            ((HashMap<String, ArrayList>)z8a2.a).put("past_events", new ArrayList());
            e9a.c(z8a2);
        }
    }
}
