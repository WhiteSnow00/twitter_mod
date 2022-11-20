import java.util.Objects;
import java.util.Arrays;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class gfe<T> extends akr<T>
{
    public static final gfe.gfe$a Companion;
    public static final oam c;
    public static final oam d;
    public static final oam e;
    
    static {
        Companion = new gfe.gfe$a();
        c = new oam("^([A-Z][a-z]+)+$");
        d = new oam("[A-Z]");
        e = new oam("^([a-z]+)(_[a-z]+)*$");
    }
    
    @SafeVarargs
    public gfe(final T t, final Map.Entry<String, ? extends T>... array) {
        super((Object)t, (Map.Entry[])Arrays.copyOf(array, ((Map.Entry[])array).length));
    }
    
    public final T getFromString(final String s) {
        czd.f((Object)s, "string");
        Objects.requireNonNull(gfe.Companion);
        final boolean c = gfe.c.c((CharSequence)s);
        final T t = null;
        String substring;
        if (c) {
            final oam d = gfe.d;
            final ffe d2 = ffe.D0;
            Objects.requireNonNull(d);
            czd.f((Object)d2, "transform");
            int n = 0;
            jmg a = d.a((CharSequence)s, 0);
            String s2;
            if (a == null) {
                s2 = s.toString();
            }
            else {
                final int length = s.length();
                final StringBuilder sb = new StringBuilder(length);
                jmg next;
                int n2;
                do {
                    sb.append(s, n, a.a().o());
                    sb.append((CharSequence)d2.invoke((Object)a));
                    n2 = a.a().m() + 1;
                    next = a.next();
                    if (n2 >= length) {
                        break;
                    }
                    a = next;
                    n = n2;
                } while (next != null);
                if (n2 < length) {
                    sb.append(s, n2, length);
                }
                s2 = sb.toString();
                czd.e((Object)s2, "sb.toString()");
            }
            substring = s2.substring(1);
            czd.e((Object)substring, "this as java.lang.String).substring(startIndex)");
        }
        else {
            substring = null;
        }
        Objects.requireNonNull(gfe.Companion);
        String m0;
        if (gfe.e.c((CharSequence)s)) {
            m0 = mq4.m0((Iterable)zkr.y0((CharSequence)s, new String[] { "_" }), (CharSequence)"", (CharSequence)null, (CharSequence)null, (qsb)efe.D0, 30);
        }
        else {
            m0 = null;
        }
        Object o;
        if ((o = super.b.get((Object)s)) == null) {
            Object value;
            if (substring != null) {
                value = super.b.get((Object)substring);
            }
            else {
                value = null;
            }
            o = value;
            if (value == null) {
                o = t;
                if (m0 != null) {
                    o = super.b.get((Object)m0);
                }
            }
        }
        Object a2;
        if ((a2 = o) == null) {
            a2 = super.a;
            czd.e(a2, "mDefaultValue");
        }
        return (T)a2;
    }
}
