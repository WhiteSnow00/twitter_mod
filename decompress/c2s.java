import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c2s implements h8b<Map<Float, Object>>
{
    public final /* synthetic */ b2s<Object> C0;
    public final /* synthetic */ float D0;
    
    public c2s(final b2s<Object> c0, final float d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final Object a(Object o, final ap6 ap6) {
        final Map map = (Map)o;
        final zy6 c0 = zy6.C0;
        final Float c2 = m8y.c(map, this.C0.f());
        zzd.c((Object)c2);
        final float floatValue = c2;
        final float floatValue2 = ((Number)((nhq)this.C0.e).getValue()).floatValue();
        final Set keySet = map.keySet();
        final gub gub = (gub)((nhq)this.C0.m).getValue();
        final float d0 = this.D0;
        final float floatValue3 = ((Number)((nhq)this.C0.n).getValue()).floatValue();
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
        final Float q1 = or4.Q1((Iterable)list);
        final ArrayList<Number> list2 = new ArrayList<Number>();
        for (final Object next2 : keySet) {
            if (((Number)next2).floatValue() >= floatValue2 - 0.001) {
                list2.add((Number)next2);
            }
        }
        final Float s1 = or4.S1((Iterable)list2);
        List list3;
        if (q1 == null) {
            list3 = tdy.w0((Object)s1);
        }
        else if (s1 == null) {
            list3 = tdy.u0((Object)q1);
        }
        else if (q1 == (float)s1) {
            list3 = tdy.u0((Object)q1);
        }
        else {
            list3 = tdy.v0((Object[])new Float[] { q1, s1 });
        }
        final int size = list3.size();
        float floatValue6 = 0.0f;
        Label_0534: {
            if (size != 0) {
                Label_0527: {
                    if (size != 1) {
                        final float floatValue4 = list3.get(0).floatValue();
                        final float floatValue5 = list3.get(1).floatValue();
                        if (floatValue <= floatValue2) {
                            if (d0 < floatValue3) {
                                floatValue6 = floatValue5;
                                if (floatValue2 < ((Number)gub.invoke((Object)floatValue4, (Object)floatValue5)).floatValue()) {
                                    floatValue6 = floatValue4;
                                }
                                break Label_0527;
                            }
                        }
                        else {
                            if (d0 <= -floatValue3) {
                                floatValue6 = floatValue4;
                                break Label_0534;
                            }
                            floatValue6 = floatValue4;
                            if (floatValue2 <= ((Number)gub.invoke((Object)floatValue5, (Object)floatValue4)).floatValue()) {
                                break Label_0534;
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
        if (o != null && (boolean)this.C0.b.invoke(o)) {
            o = b2s.d((b2s)this.C0, o, (dc0)null, ap6, 2, (Object)null);
            if (o != c0) {
                o = oyv.a;
            }
        }
        else {
            final b2s<Object> c3 = this.C0;
            o = c3.b(floatValue, c3.a, ap6);
            if (o != c0) {
                o = oyv.a;
            }
        }
        return o;
    }
}
