import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cnz extends edy
{
    public final q9y D0;
    
    public cnz(final q9y d0) {
        this.D0 = d0;
    }
    
    @Override
    public final aey o(String j, final k6z k6z, final List list) {
        int n = 0;
        Label_0160: {
            switch (j.hashCode()) {
                case 1570616835: {
                    if (j.equals("setEventName")) {
                        n = 4;
                        break Label_0160;
                    }
                    break;
                }
                case 920706790: {
                    if (j.equals("setParamValue")) {
                        n = 5;
                        break Label_0160;
                    }
                    break;
                }
                case 700587132: {
                    if (j.equals("getParams")) {
                        n = 2;
                        break Label_0160;
                    }
                    break;
                }
                case 146575578: {
                    if (j.equals("getParamValue")) {
                        n = 1;
                        break Label_0160;
                    }
                    break;
                }
                case 45521504: {
                    if (j.equals("getTimestamp")) {
                        n = 3;
                        break Label_0160;
                    }
                    break;
                }
                case 21624207: {
                    if (j.equals("getEventName")) {
                        n = 0;
                        break Label_0160;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n == 0) {
            haz.h("getEventName", 0, list);
            return (aey)new mfy(this.D0.b.a);
        }
        if (n == 1) {
            haz.h("getParamValue", 1, list);
            final String i = k6z.b((aey)((ArrayList<aey>)list).get(0)).j();
            final h9y b = this.D0.b;
            Object value;
            if (b.c.containsKey(i)) {
                value = b.c.get(i);
            }
            else {
                value = null;
            }
            return ydz.b(value);
        }
        if (n == 2) {
            haz.h("getParams", 0, list);
            final HashMap c = this.D0.b.c;
            final edy edy = new edy();
            for (final String s : c.keySet()) {
                edy.m(s, ydz.b(c.get(s)));
            }
            return (aey)edy;
        }
        if (n == 3) {
            haz.h("getTimestamp", 0, list);
            return (aey)new tby(Double.valueOf(this.D0.b.b));
        }
        if (n != 4) {
            if (n != 5) {
                return super.o(j, k6z, list);
            }
            haz.h("setParamValue", 2, list);
            final ArrayList<aey> list2 = (ArrayList<aey>)list;
            j = k6z.b((aey)list2.get(0)).j();
            final aey b2 = k6z.b((aey)list2.get(1));
            final h9y b3 = this.D0.b;
            final Object f = haz.f(b2);
            if (f == null) {
                b3.c.remove(j);
            }
            else {
                b3.c.put(j, f);
            }
            return b2;
        }
        else {
            haz.h("setEventName", 1, list);
            final aey b4 = k6z.b((aey)((ArrayList<aey>)list).get(0));
            if (!aey.u0.equals(b4) && !aey.v0.equals(b4)) {
                this.D0.b.a = b4.j();
                return (aey)new mfy(b4.j());
            }
            throw new IllegalArgumentException("Illegal event name");
        }
    }
}
