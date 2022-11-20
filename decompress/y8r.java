import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class y8r
{
    public final List<yjp> a;
    public final List<String> b;
    
    public y8r(final List<? extends yjp> a, final List<String> b) {
        czd.f((Object)b, "listOfValidUc");
        this.a = (List<yjp>)a;
        this.b = b;
    }
    
    public void a(final no9 no9) {
        czd.f((Object)no9, "log");
        new ArrayList<lvj>().add(new lvj((Object)no9.a, (Object)no9.d));
        if (wil.valueOf(no9.a) == wil.C1) {
            final String e = no9.e;
            if (e != null) {
                if (!this.b.contains(e)) {
                    final h8a h8a = new h8a((Throwable)new IllegalArgumentException("Event anomaly detector: invalid unified card event"));
                    ((HashMap<String, String>)h8a.a).put("unified_card_event", e);
                    m8a.c(h8a);
                }
            }
        }
        final List<yjp> a = this.a;
        final ArrayList list = new ArrayList<Boolean>(iq4.H((Iterable)a, 10));
        final Iterator<Object> iterator = a.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().a(no9));
        }
        final boolean empty = list.isEmpty();
        final boolean b = true;
        int n = 0;
        Label_0239: {
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
                    break Label_0239;
                } while (iterator2.next() ^ true);
                n = 0;
            }
        }
        if (n != 0) {
            final ArrayList<lvj> list2 = new ArrayList<lvj>();
            for (final yjp yjp : this.a) {
                list2.add(new lvj((Object)yjp.b(), (Object)yjp.c()));
            }
            final h8a h8a2 = new h8a((Throwable)new IllegalArgumentException("Event anomaly detector out of order state"));
            ((HashMap<String, String>)h8a2.a).put("next_state", no9.a);
            ((HashMap<String, ArrayList<lvj>>)h8a2.a).put("current_states", list2);
            ((HashMap<String, String>)h8a2.a).put("card_type", no9.c);
            ((HashMap<String, String>)h8a2.a).put("impression_id", no9.b);
            ((HashMap<String, ArrayList>)h8a2.a).put("past_events", new ArrayList());
            m8a.c(h8a2);
        }
    }
}
