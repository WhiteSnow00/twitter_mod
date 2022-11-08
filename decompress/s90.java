import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s90 implements gqg
{
    public final ab0 a;
    
    public s90(final ab0 a) {
        zzd.f((Object)a, "scope");
        this.a = a;
    }
    
    @Override
    public final int a(final wzd wzd, final List<? extends ezd> list, int intValue) {
        zzd.f((Object)wzd, "<this>");
        final Integer n = (Integer)tjp.P0(tjp.N0(or4.w1((Iterable)list), (rtb)new s90$b(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
    
    @Override
    public final hqg b(final jqg jqg, final List<? extends dqg> list, final long n) {
        zzd.f((Object)jqg, "$this$measure");
        zzd.f((Object)list, "measurables");
        final ArrayList list2 = new ArrayList<qgk>(kr4.h1((Iterable)list, 10));
        final Iterator<dqg> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(iterator.next().W(n));
        }
        final boolean empty = list2.isEmpty();
        final qgk qgk = null;
        final int n2 = 0;
        int n3 = 1;
        qgk qgk2;
        if (empty) {
            qgk2 = null;
        }
        else {
            qgk value = list2.get(0);
            int c0 = value.C0;
            final int s = tdy.S((List)list2);
            qgk2 = value;
            if (1 <= s) {
                int n4 = 1;
                while (true) {
                    final qgk value2 = list2.get(n4);
                    final int c2 = value2.C0;
                    int n5 = c0;
                    if (c0 < c2) {
                        value = value2;
                        n5 = c2;
                    }
                    qgk2 = value;
                    if (n4 == s) {
                        break;
                    }
                    ++n4;
                    c0 = n5;
                }
            }
        }
        final qgk qgk3 = qgk2;
        int c3;
        if (qgk3 != null) {
            c3 = qgk3.C0;
        }
        else {
            c3 = 0;
        }
        qgk qgk4;
        if (list2.isEmpty()) {
            qgk4 = qgk;
        }
        else {
            qgk value3 = list2.get(0);
            int d0 = value3.D0;
            final int s2 = tdy.S((List)list2);
            qgk4 = value3;
            if (1 <= s2) {
                while (true) {
                    final qgk value4 = list2.get(n3);
                    final int d2 = value4.D0;
                    int n6;
                    if ((n6 = d0) < d2) {
                        value3 = value4;
                        n6 = d2;
                    }
                    qgk4 = value3;
                    if (n3 == s2) {
                        break;
                    }
                    ++n3;
                    d0 = n6;
                }
            }
        }
        final qgk qgk5 = qgk4;
        int d3 = n2;
        if (qgk5 != null) {
            d3 = qgk5.D0;
        }
        ((nhq)this.a.a).setValue((Object)new iud(lr0.b(c3, d3)));
        return jqg.J(c3, d3, (Map<ex, Integer>)a3a.C0, (rtb<? super qgk$a, oyv>)new s90$c((List)list2));
    }
    
    @Override
    public final int c(final wzd wzd, final List<? extends ezd> list, int intValue) {
        zzd.f((Object)wzd, "<this>");
        final Integer n = (Integer)tjp.P0(tjp.N0(or4.w1((Iterable)list), (rtb)new s90$e(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
    
    @Override
    public final int d(final wzd wzd, final List<? extends ezd> list, int intValue) {
        zzd.f((Object)wzd, "<this>");
        final Integer n = (Integer)tjp.P0(tjp.N0(or4.w1((Iterable)list), (rtb)new s90$a(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
    
    @Override
    public final int e(final wzd wzd, final List<? extends ezd> list, int intValue) {
        zzd.f((Object)wzd, "<this>");
        final Integer n = (Integer)tjp.P0(tjp.N0(or4.w1((Iterable)list), (rtb)new s90$d(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
}
