import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qrc
{
    public final CharSequence a;
    public final xrc$b b;
    public final src c;
    public final List<fvj<String, String>> d;
    
    public qrc(final CharSequence a, final xrc$b b, final src c, final List<fvj<String, String>> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final String a(final vrc vrc) {
        final String string = vrc.toString();
        final CharSequence a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append((Object)a);
        return sb.toString();
    }
    
    public static class a<T extends a>
    {
        public final List<l6i> a;
        public final StringBuilder b;
        public final ArrayList<fvj<String, String>> c;
        public src d;
        public xrc$b e;
        
        public a() {
            this.a = new ArrayList();
            this.b = new StringBuilder();
            this.c = new ArrayList<fvj<String, String>>();
            this.d = null;
            this.e = xrc$b.E0;
        }
        
        public final T b(final String s, final double n) {
            this.d(s, String.valueOf(n));
            final int a = w4j.a;
            return (T)this;
        }
        
        public final T c(final String s, final long n) {
            this.d(s, String.valueOf(n));
            final int a = w4j.a;
            return (T)this;
        }
        
        public final T d(final String s, final String s2) {
            this.a.add(new ks1(s, s2));
            final int a = w4j.a;
            return (T)this;
        }
        
        public final T e(final String s, final Collection<?> collection) {
            final String[] array = new String[collection.size()];
            final Iterator iterator = collection.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                array[n] = String.valueOf(iterator.next());
                ++n;
            }
            this.h(s, array);
            final int a = w4j.a;
            return (T)this;
        }
        
        public final T f(final String s, final boolean b) {
            this.d(s, String.valueOf(b));
            final int a = w4j.a;
            return (T)this;
        }
        
        public final T g(final String s, final long[] array) {
            final int length = array.length;
            final String[] array2 = new String[length];
            for (int i = 0; i < length; ++i) {
                array2[i] = String.valueOf(array[i]);
            }
            this.h(s, array2);
            final int a = w4j.a;
            return (T)this;
        }
        
        public final T h(final String s, final String[] array) {
            this.d(s, pjr.i((CharSequence)",", (Object[])array));
            final int a = w4j.a;
            return (T)this;
        }
        
        public final T i(final Map<String, ?> map) {
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                this.d(entry.getKey(), String.valueOf(entry.getValue()));
            }
            final int a = w4j.a;
            return (T)this;
        }
        
        public final void j(final StringBuilder sb) {
            if (!this.a.isEmpty()) {
                sb.append('?');
                for (int size = this.a.size(), i = 0; i < size; ++i) {
                    final l6i l6i = this.a.get(i);
                    sb.append(er1.h(l6i.getName()));
                    sb.append('=');
                    sb.append(er1.h(l6i.getValue()));
                    if (i < size - 1) {
                        sb.append('&');
                    }
                }
            }
        }
        
        public final qrc k() {
            final StringBuilder sb = new StringBuilder();
            sb.append((CharSequence)this.b);
            if (this.e.D0) {
                Object d = this.d;
                if (d != null) {
                    this.j(sb);
                    return new qrc(sb, this.e, (src)d, this.c);
                }
                if (!this.a.isEmpty()) {
                    d = new ajr(dml.t((List)this.a), wj6.a);
                    ((ac)d).e("application/x-www-form-urlencoded");
                    return new qrc(sb, this.e, (src)d, this.c);
                }
            }
            else {
                if (this.d != null) {
                    throw new UnsupportedOperationException("HttpEntity not allowed in GET");
                }
                this.j(sb);
            }
            Object d = null;
            return new qrc(sb, this.e, (src)d, this.c);
        }
        
        public final T l(final String s, final String s2) {
            this.c.add((fvj<String, String>)new fvj((Object)s, (Object)s2));
            final int a = w4j.a;
            return (T)this;
        }
        
        public final T m(final String s) {
            this.n(s, "/");
            final int a = w4j.a;
            return (T)this;
        }
        
        public final T n(String s, final String s2) {
            if (s.charAt(0) != '/') {
                this.b.append('/');
            }
            final StringBuilder b = this.b;
            final char[] a = er1.a;
            StringBuilder sb = null;
            final int length = s.length();
            int i = 0;
            while (true) {
                while (i < length) {
                    int n;
                    for (n = i; n < length && er1.b(s.charAt(n), s2); ++n) {}
                    if (n == length) {
                        if (i != 0) {
                            sb.append(s, i, length);
                            s = sb.toString();
                        }
                        b.append(s);
                        final int a2 = w4j.a;
                        return (T)this;
                    }
                    StringBuilder sb2;
                    if ((sb2 = sb) == null) {
                        sb2 = new StringBuilder();
                    }
                    if (n > i) {
                        sb2.append(s, i, n);
                    }
                    int n2;
                    for (n2 = n + 1; n2 < length && !er1.b(s.charAt(n2), s2); ++n2) {}
                    final byte[] bytes = s.substring(n, n2).getBytes(StandardCharsets.UTF_8);
                    final int length2 = bytes.length;
                    int n3 = 0;
                    while (true) {
                        sb = sb2;
                        i = n2;
                        if (n3 >= length2) {
                            break;
                        }
                        final byte b2 = bytes[n3];
                        sb2.append('%');
                        final char[] a3 = er1.a;
                        sb2.append(a3[(b2 & 0xF0) >> 4]);
                        sb2.append(a3[b2 & 0xF]);
                        ++n3;
                    }
                }
                if (sb == null) {
                    continue;
                }
                s = sb.toString();
                continue;
            }
        }
    }
}
