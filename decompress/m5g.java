import java.util.HashSet;
import java.util.ArrayList;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m5g implements o5g
{
    public static final Locale[] b;
    public final Locale[] a;
    
    static {
        b = new Locale[0];
        new Locale("en", "XA");
        new Locale("ar", "XB");
        final int b2 = l5g.b;
        final String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        }
        else if (split.length > 1) {
            new Locale(split[0], split[1]);
        }
        else {
            if (split.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(split[0]);
        }
    }
    
    public m5g(final Locale... array) {
        if (array.length == 0) {
            this.a = m5g.b;
        }
        else {
            final ArrayList list = new ArrayList();
            final HashSet set = new HashSet();
            for (int i = 0; i < array.length; ++i) {
                final Locale locale = array[i];
                if (locale == null) {
                    throw new NullPointerException(ffa.k("list[", i, "] is null"));
                }
                if (!set.contains(locale)) {
                    final Locale locale2 = (Locale)locale.clone();
                    list.add(locale2);
                    locale2.getLanguage();
                    final String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        locale2.getCountry();
                    }
                    set.add(locale2);
                }
            }
            this.a = list.toArray(new Locale[0]);
        }
    }
    
    public final Object a() {
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof m5g)) {
            return false;
        }
        final Locale[] a = ((m5g)o).a;
        if (this.a.length != a.length) {
            return false;
        }
        int n = 0;
        while (true) {
            final Locale[] a2 = this.a;
            if (n >= a2.length) {
                return true;
            }
            if (!a2[n].equals(a[n])) {
                return false;
            }
            ++n;
        }
    }
    
    public final Locale get(final int n) {
        if (n >= 0) {
            final Locale[] a = this.a;
            if (n < a.length) {
                return a[n];
            }
        }
        return null;
    }
    
    @Override
    public final int hashCode() {
        final Locale[] a = this.a;
        final int length = a.length;
        int n = 1;
        for (int i = 0; i < length; ++i) {
            n = n * 31 + a[i].hashCode();
        }
        return n;
    }
    
    public final int size() {
        return this.a.length;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("[");
        int n = 0;
        while (true) {
            final Locale[] a = this.a;
            if (n >= a.length) {
                break;
            }
            g.append(a[n]);
            if (n < this.a.length - 1) {
                g.append(',');
            }
            ++n;
        }
        g.append("]");
        return g.toString();
    }
}
