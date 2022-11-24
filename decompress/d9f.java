import tv.periscope.model.chat.Message$a;
import java.util.ArrayList;
import tv.periscope.model.chat.a$a;
import tv.periscope.model.chat.Message;
import tv.periscope.chatman.api.Occupant;
import tv.periscope.model.chat.c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d9f implements fw1
{
    public final int a;
    public final f9f b;
    
    public d9f(final f9f b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void accept(final Object o, final Object o2) {
        switch (this.a) {
            default: {
                final f9f b = this.b;
                final qwc qwc = (qwc)o;
                final i6 i6 = (i6)o2;
                b.L0.N(((l7h)qwc).a);
                return;
            }
            case 1: {
                final f9f b2 = this.b;
                final q54 q54 = (q54)o;
                final i6 i7 = (i6)o2;
                b2.L0.I(q54.a, q54.b, q54.c);
                if (b2.W0) {
                    b2.L0.W(c.V0);
                    b2.W0 = false;
                }
                return;
            }
            case 0: {
                final f9f b3 = this.b;
                final ckb ckb = (ckb)o;
                final i6 i8 = (i6)o2;
                final o44 l0 = b3.L0;
                final ArrayList a = ckb.a;
                if (!l0.x1 && a.size() > 0) {
                    l0.x1 = true;
                    String n = null;
                    if (a.size() > 4) {
                        n = l0.G0.getString(2131956350, new Object[] { ((Occupant)a.get(0)).username, ((Occupant)a.get(1)).username, ((Occupant)a.get(2)).username, a.size() - 3 });
                    }
                    else if (a.size() == 4) {
                        n = l0.G0.getString(2131956349, new Object[] { ((Occupant)a.get(0)).username, ((Occupant)a.get(1)).username, ((Occupant)a.get(2)).username });
                    }
                    else if (a.size() == 3) {
                        n = l0.G0.getString(2131956733, new Object[] { ((Occupant)a.get(0)).username, ((Occupant)a.get(1)).username, ((Occupant)a.get(2)).username });
                    }
                    else if (a.size() == 2) {
                        n = l0.G0.getString(2131956775, new Object[] { ((Occupant)a.get(0)).username, ((Occupant)a.get(1)).username });
                    }
                    else if (a.size() == 1) {
                        n = l0.G0.getString(2131956505, new Object[] { ((Occupant)a.get(0)).username });
                    }
                    final d24 k0 = l0.K0;
                    final Message$a g = Message.g();
                    g.b(c.c1);
                    final a$a a$a = (a$a)g;
                    a$a.n = n;
                    k0.c(a$a.a());
                }
            }
        }
    }
}
