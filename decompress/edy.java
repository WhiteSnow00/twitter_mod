import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public class edy implements aey, vcy
{
    public final HashMap C0;
    
    public edy() {
        this.C0 = new HashMap();
    }
    
    public final aey e() {
        final edy edy = new edy();
        for (final Map.Entry<String, aey> entry : this.C0.entrySet()) {
            if (entry.getValue() instanceof vcy) {
                edy.C0.put(entry.getKey(), entry.getValue());
            }
            else {
                edy.C0.put(entry.getKey(), entry.getValue().e());
            }
        }
        return (aey)edy;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof edy && this.C0.equals(((edy)o).C0));
    }
    
    public final boolean g(final String s) {
        return this.C0.containsKey(s);
    }
    
    public final Double h() {
        return Double.NaN;
    }
    
    @Override
    public final int hashCode() {
        return this.C0.hashCode();
    }
    
    public final Boolean i() {
        return Boolean.TRUE;
    }
    
    public final String j() {
        return "[object Object]";
    }
    
    public final Iterator l() {
        return (Iterator)new lcy((Iterator)this.C0.keySet().iterator());
    }
    
    public final void m(final String s, final aey aey) {
        if (aey == null) {
            this.C0.remove(s);
            return;
        }
        this.C0.put(s, aey);
    }
    
    public final aey n(final String s) {
        if (this.C0.containsKey(s)) {
            return this.C0.get(s);
        }
        return (aey)aey.u0;
    }
    
    public aey o(final String s, final k6z k6z, final List list) {
        if ("toString".equals(s)) {
            return (aey)new mfy(this.toString());
        }
        return bfe.D((vcy)this, (aey)new mfy(s), k6z, list);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if (!this.C0.isEmpty()) {
            for (final String s : this.C0.keySet()) {
                sb.append(String.format("%s: %s,", s, this.C0.get(s)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
