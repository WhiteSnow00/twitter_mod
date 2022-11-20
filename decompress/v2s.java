import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v2s implements e7b<Map<Float, Object>>
{
    public final u2s<Object> D0;
    public final float E0;
    
    public v2s(final u2s<Object> d0, final float e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final Object a(Object o, final go6 go6) {
        final Map map = (Map)o;
        final dy6 d0 = dy6.D0;
        final Float c = uli.c(map, this.D0.f());
        czd.c((Object)c);
        final float floatValue = c;
        final float floatValue2 = ((Number)this.D0.e.getValue()).floatValue();
        final Set keySet = map.keySet();
        final ftb ftb = (ftb)this.D0.m.getValue();
        final float e0 = this.E0;
        final float floatValue3 = ((Number)this.D0.n.getValue()).floatValue();
        final ArrayList list = new ArrayList();
        final Iterator iterator = keySet.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b = false;
            if (!hasNext) {
                break;
            }
            final Object next = iterator.next();
            if (((Number)next).floatValue() <= floatValue2 + 0.001) {
                b = true;
            }
            if (!b) {
                continue;
            }
            list.add(next);
        }
        final Float q0 = mq4.q0((Iterable)list);
        final ArrayList<Object> list2 = new ArrayList<Object>();
        final Iterator iterator2 = keySet.iterator();
        while (iterator2.hasNext()) {
            o = iterator2.next();
            if (((Number)o).floatValue() >= floatValue2 - 0.001) {
                list2.add(o);
            }
        }
        final Float s0 = mq4.s0((Iterable)list2);
        List list3;
        if (q0 == null) {
            list3 = s9i.t(s0);
        }
        else if (s0 == null) {
            list3 = s9i.r(q0);
        }
        else if (q0 == (float)s0) {
            list3 = s9i.r(q0);
        }
        else {
            list3 = s9i.s(q0, s0);
        }
        final int size = list3.size();
        float floatValue6 = 0.0f;
        Label_0527: {
            if (size != 0) {
                Label_0521: {
                    if (size != 1) {
                        final float floatValue4 = list3.get(0).floatValue();
                        final float floatValue5 = list3.get(1).floatValue();
                        if (floatValue <= floatValue2) {
                            if (e0 < floatValue3) {
                                floatValue6 = floatValue5;
                                if (floatValue2 < ((Number)ftb.invoke((Object)floatValue4, (Object)floatValue5)).floatValue()) {
                                    floatValue6 = floatValue4;
                                }
                                break Label_0521;
                            }
                        }
                        else {
                            if (e0 <= -floatValue3) {
                                floatValue6 = floatValue4;
                                break Label_0527;
                            }
                            floatValue6 = floatValue4;
                            if (floatValue2 <= ((Number)ftb.invoke((Object)floatValue5, (Object)floatValue4)).floatValue()) {
                                break Label_0527;
                            }
                        }
                        floatValue6 = floatValue5;
                    }
                    else {
                        floatValue6 = list3.get(0).floatValue();
                    }
                }
            }
            else {
                floatValue6 = floatValue;
            }
        }
        o = map.get(new Float(floatValue6));
        if (o != null && (boolean)this.D0.b.invoke(o)) {
            o = u2s.d((u2s)this.D0, o, (zb0)null, go6, 2, (Object)null);
            if (o != d0) {
                o = fzv.a;
            }
        }
        else {
            final u2s<Object> d2 = this.D0;
            o = d2.b(floatValue, d2.a, go6);
            if (o != d0) {
                o = fzv.a;
            }
        }
        return o;
    }
}
