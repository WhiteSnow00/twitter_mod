import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class poz extends oey
{
    public final aby G0;
    
    public poz(final aby g0) {
        this.G0 = g0;
    }
    
    public final kfy o(String s, final y7z y7z, final List list) {
        int n = 0;
        Label_0160: {
            switch (s.hashCode()) {
                case 1570616835: {
                    if (s.equals("setEventName")) {
                        n = 4;
                        break Label_0160;
                    }
                    break;
                }
                case 920706790: {
                    if (s.equals("setParamValue")) {
                        n = 5;
                        break Label_0160;
                    }
                    break;
                }
                case 700587132: {
                    if (s.equals("getParams")) {
                        n = 2;
                        break Label_0160;
                    }
                    break;
                }
                case 146575578: {
                    if (s.equals("getParamValue")) {
                        n = 1;
                        break Label_0160;
                    }
                    break;
                }
                case 45521504: {
                    if (s.equals("getTimestamp")) {
                        n = 3;
                        break Label_0160;
                    }
                    break;
                }
                case 21624207: {
                    if (s.equals("getEventName")) {
                        n = 0;
                        break Label_0160;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n == 0) {
            vbz.h("getEventName", 0, list);
            return (kfy)new wgy(this.G0.b.a);
        }
        if (n == 1) {
            vbz.h("getParamValue", 1, list);
            s = y7z.d((kfy)((ArrayList<kfy>)list).get(0)).k();
            final ray b = this.G0.b;
            Object value;
            if (b.c.containsKey(s)) {
                value = b.c.get(s);
            }
            else {
                value = null;
            }
            return lfz.b(value);
        }
        if (n == 2) {
            vbz.h("getParams", 0, list);
            final HashMap c = this.G0.b.c;
            final oey oey = new oey();
            for (final String s2 : c.keySet()) {
                oey.i(s2, lfz.b(c.get(s2)));
            }
            return (kfy)oey;
        }
        if (n == 3) {
            vbz.h("getTimestamp", 0, list);
            return (kfy)new ddy(Double.valueOf(this.G0.b.b));
        }
        if (n != 4) {
            if (n != 5) {
                return super.o(s, y7z, list);
            }
            vbz.h("setParamValue", 2, list);
            final ArrayList<kfy> list2 = (ArrayList<kfy>)list;
            s = y7z.d((kfy)list2.get(0)).k();
            final kfy d = y7z.d((kfy)list2.get(1));
            final ray b2 = this.G0.b;
            final Object f = vbz.f(d);
            if (f == null) {
                b2.c.remove(s);
            }
            else {
                b2.c.put(s, f);
            }
            return d;
        }
        else {
            vbz.h("setEventName", 1, list);
            final kfy d2 = y7z.d((kfy)((ArrayList<kfy>)list).get(0));
            if (!kfy.x0.equals((Object)d2) && !kfy.y0.equals(d2)) {
                this.G0.b.a = d2.k();
                return (kfy)new wgy(d2.k());
            }
            throw new IllegalArgumentException("Illegal event name");
        }
    }
}
