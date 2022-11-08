import java.util.Iterator;
import java.util.Comparator;
import android.text.SpannableStringBuilder;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class huh<T extends xes> implements Iterable<fuh<T>>
{
    public final List<fuh<T>> C0;
    public final Map<T, euh> D0;
    public final int E0;
    public SpannableStringBuilder F0;
    
    public huh() {
        this.F0 = new SpannableStringBuilder();
        final int a = w4j.a;
        this.C0 = (rth$b)rth.b((Comparator)w4j$b.C0, 0);
        this.D0 = tth.a(0);
        this.E0 = 0;
    }
    
    public huh(final xwm<T> xwm) {
        this.F0 = new SpannableStringBuilder((CharSequence)xwm.C0);
        final Map d = wxm.d(xwm.D0);
        final int a = w4j.a;
        final List b = rth.b((Comparator)w4j$b.C0, 0);
        for (final Map.Entry<K, euh> entry : d.entrySet()) {
            b.add(new fuh(entry.getValue(), (xes)entry.getKey()));
        }
        this.C0 = (rth$b)b;
        this.D0 = d;
        this.E0 = xwm.E0;
    }
    
    @Override
    public final Iterator<fuh<T>> iterator() {
        return ((List<fuh<T>>)this.C0).iterator();
    }
    
    public final int l(final T t) {
        final euh euh = this.D0.get(t);
        if (euh != null) {
            return euh.a;
        }
        return -1;
    }
    
    public final void m(final int n, final int n2) {
        final Iterator<Object> iterator = ((List<Object>)this.C0).iterator();
        while (iterator.hasNext()) {
            iterator.next().C0.a(n, n2);
        }
    }
}
