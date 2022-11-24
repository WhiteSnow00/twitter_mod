import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class plb
{
    public final List<olb> a;
    
    public plb(final olb... array) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final int length = array.length;
        final int n = 0;
        for (final olb olb : array) {
            final String c = olb.c();
            Object value;
            if ((value = linkedHashMap.get(c)) == null) {
                value = new ArrayList<olb>();
                linkedHashMap.put(c, value);
            }
            ((List<olb>)value).add(olb);
        }
        final ArrayList list = new ArrayList();
        for (final Map.Entry<String, V> entry : linkedHashMap.entrySet()) {
            final String s = entry.getKey();
            final List list2 = (List)entry.getValue();
            final int size = list2.size();
            boolean b = true;
            if (size != 1) {
                b = false;
            }
            if (!b) {
                final StringBuilder sb = new StringBuilder();
                sb.append('\'');
                sb.append(s);
                sb.append("' must be unique. Actual [ [");
                throw new IllegalArgumentException(qee.s(sb, rr4.I1((Iterable)list2, (CharSequence)null, (CharSequence)null, (CharSequence)null, (stb)null, 63), ']').toString());
            }
            pr4.j1((Collection)list, (Iterable)list2);
        }
        final ArrayList a = new ArrayList(list);
        this.a = a;
        for (int size2 = a.size(), n2 = n; n2 < size2 && !((olb)a.get(n2)).a(); ++n2) {}
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof plb && e0e.a((Object)this.a, (Object)((plb)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
