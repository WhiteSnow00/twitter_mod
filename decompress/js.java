import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class js
{
    public static final List<ls> j;
    public static final int k;
    public static final EnumSet<ls> l;
    public final String a;
    public final List<String> b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    
    static {
        final List<ls> list = j = Collections.unmodifiableList((List<? extends ls>)Arrays.asList(ls.E0, ls.F0));
        k = list.size();
        final EnumSet<ls> all = EnumSet.allOf(ls.class);
        (l = all).removeAll(list);
        all.remove(ls.G0);
    }
    
    public js(final a a) {
        this.a = a.a.get(ls.D0);
        this.c = a.a.get(ls.H0);
        this.d = a.a.get(ls.I0);
        this.e = a.a.get(ls.J0);
        this.f = a.a.get(ls.K0);
        this.g = a.a.get(ls.L0);
        this.h = a.a.get(ls.N0);
        this.i = a.a.get(ls.M0);
        final ArrayList list = new ArrayList(a.b);
        b(list);
        this.b = (List<String>)Collections.unmodifiableList((List<?>)list);
    }
    
    public static List<String> b(final List<String> list) {
        int i = 0;
        while (i < list.size()) {
            final String s = list.remove(i);
            if (s == null) {
                continue;
            }
            if (s.contains("\n")) {
                final String[] split = s.split("\n");
                final int length = split.length;
                int n = 0;
                int n2 = i;
                while (true) {
                    i = n2;
                    if (n >= length) {
                        break;
                    }
                    final String b = fmw.b(split[n]);
                    int n3 = n2;
                    if (b != null) {
                        list.add(n2, b);
                        n3 = n2 + 1;
                    }
                    ++n;
                    n2 = n3;
                }
            }
            else {
                final String b2 = fmw.b(s);
                if (b2 == null) {
                    continue;
                }
                list.add(i, b2);
                ++i;
            }
        }
        return list;
    }
    
    public final String a(final int n) {
        if (n >= js.k && n < this.b.size()) {
            final StringBuilder sb = new StringBuilder(this.b.get(n - 1));
            final List<String> b = this.b;
            for (final String s : b.subList(n, b.size())) {
                sb.append(", ");
                sb.append(s);
            }
            return sb.toString();
        }
        String s2;
        if (n <= this.b.size()) {
            s2 = this.b.get(n - 1);
        }
        else {
            s2 = null;
        }
        return s2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("(AddressData: POSTAL_COUNTRY=");
        mag.m(g, this.a, "; ", "LANGUAGE=", (String)null);
        g.append("; ");
        final StringBuilder sb = new StringBuilder(g.toString());
        for (final String s : this.b) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append("; ");
            sb.append(sb2.toString());
        }
        final StringBuilder g2 = w48.g("ADMIN_AREA=");
        aob.h(g2, this.c, "; ", "LOCALITY=");
        aob.h(g2, this.d, "; ", "DEPENDENT_LOCALITY=");
        aob.h(g2, this.e, "; ", "POSTAL_CODE=");
        aob.h(g2, this.f, "; ", "SORTING_CODE=");
        aob.h(g2, this.g, "; ", "ORGANIZATION=");
        aob.h(g2, this.h, "; ", "RECIPIENT=");
        g2.append(this.i);
        g2.append(")");
        sb.append(g2.toString());
        return sb.toString();
    }
    
    public static final class a
    {
        public final Map<ls, String> a;
        public final List<String> b;
        
        public a() {
            this.a = new HashMap();
            this.b = new ArrayList();
        }
        
        @Deprecated
        public final a a(final ls ls, String b) {
            if (js.l.contains(ls)) {
                b = fmw.b(b);
                if (b == null) {
                    this.a.remove(ls);
                }
                else {
                    this.a.put(ls, b);
                }
            }
            else if (ls == ls.G0) {
                if (b == null) {
                    this.b.clear();
                }
                else {
                    this.b.clear();
                    this.b.add(b);
                    js.b(this.b);
                }
            }
            else {
                final int n = js.j.indexOf(ls) + 1;
                if (n > 0) {
                    if (fmw.b(b) == null) {
                        if (n < this.b.size()) {
                            this.b.set(n - 1, null);
                        }
                        else if (n == this.b.size()) {
                            this.b.remove(n - 1);
                            int size = this.b.size();
                            while (--size >= 0 && this.b.get(size) == null) {
                                this.b.remove(size);
                            }
                        }
                    }
                    else {
                        for (int i = this.b.size(); i < n; ++i) {
                            this.b.add(null);
                        }
                        this.b.set(n - 1, b);
                    }
                }
            }
            return this;
        }
    }
}