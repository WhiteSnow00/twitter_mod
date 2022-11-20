import java.util.Set;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwf implements kqe<String, vwf>
{
    public final Map<String, vwf> a;
    
    public mwf() {
        this.a = new ts0();
    }
    
    public final void a() {
        ((d8q)this.a).clear();
    }
    
    public final void c(final n93<vwf> n93) {
        final Iterator iterator = ((ts0$e)this.a.values()).iterator();
        while (iterator.hasNext()) {
            ((za8$a)n93).a((Object)iterator.next());
        }
    }
    
    public final vwf d(final String s) {
        return ((d8q<K, vwf>)this.a).getOrDefault(s, null);
    }
    
    public final vwf e(final String s, final vwf vwf) {
        return ((d8q<String, vwf>)this.a).put(s, vwf);
    }
    
    public final /* bridge */ Object get(final Object o) {
        return this.d((String)o);
    }
    
    public final Set<String> keySet() {
        return this.a.keySet();
    }
    
    public final /* bridge */ Object put(final Object o, final Object o2) {
        return this.e((String)o, (vwf)o2);
    }
    
    public final Object remove(final Object o) {
        return ((d8q<K, vwf>)this.a).remove(o);
    }
}
