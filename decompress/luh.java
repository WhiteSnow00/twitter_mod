import java.util.Iterator;
import java.util.Comparator;
import android.text.SpannableStringBuilder;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class luh<T extends sfs> implements Iterable<juh<T>>
{
    public final List<juh<T>> D0;
    public final Map<T, iuh> E0;
    public final int F0;
    public SpannableStringBuilder G0;
    
    public luh() {
        this.G0 = new SpannableStringBuilder();
        final int a = c5j.a;
        this.D0 = (vth$b)vth.b((Comparator)c5j$b.D0, 0);
        this.E0 = xth.a(0);
        this.F0 = 0;
    }
    
    public luh(final oxm<T> oxm) {
        this.G0 = new SpannableStringBuilder((CharSequence)oxm.D0);
        final Map d = nym.d(oxm.E0);
        final int a = c5j.a;
        final List b = vth.b((Comparator)c5j$b.D0, 0);
        for (final Map.Entry<K, iuh> entry : d.entrySet()) {
            b.add(new juh((iuh)entry.getValue(), (sfs)entry.getKey()));
        }
        this.D0 = (vth$b)b;
        this.E0 = d;
        this.F0 = oxm.F0;
    }
    
    public /* bridge */ int g(final m6a m6a) {
        return this.l(m6a);
    }
    
    @Override
    public final Iterator<juh<T>> iterator() {
        return ((List<juh<T>>)this.D0).iterator();
    }
    
    public final int l(final T t) {
        final iuh iuh = this.E0.get(t);
        if (iuh != null) {
            return iuh.a;
        }
        return -1;
    }
    
    public final void m(final int n, final int n2) {
        final Iterator<Object> iterator = ((List<Object>)this.D0).iterator();
        while (iterator.hasNext()) {
            iterator.next().D0.a(n, n2);
        }
    }
}
