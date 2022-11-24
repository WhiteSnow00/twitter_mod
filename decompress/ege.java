import java.util.Objects;
import java.util.Arrays;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class ege<T> extends wkr<T>
{
    public static final ege.ege$a Companion;
    public static final bbm c;
    public static final bbm d;
    public static final bbm e;
    
    static {
        Companion = new ege.ege$a();
        c = new bbm("^([A-Z][a-z]+)+$");
        d = new bbm("[A-Z]");
        e = new bbm("^([a-z]+)(_[a-z]+)*$");
    }
    
    @SafeVarargs
    public ege(final T t, final Map.Entry<String, ? extends T>... array) {
        super((Object)t, (Map.Entry[])Arrays.copyOf(array, ((Map.Entry[])array).length));
    }
    
    public final T getFromString(final String s) {
        e0e.f((Object)s, "string");
        Objects.requireNonNull(ege.Companion);
        final boolean c = ege.c.c((CharSequence)s);
        final T t = null;
        String substring;
        if (c) {
            final bbm d = ege.d;
            final dge f0 = dge.F0;
            Objects.requireNonNull(d);
            e0e.f((Object)f0, "transform");
            int n = 0;
            dng a = d.a((CharSequence)s, 0);
            String s2;
            if (a == null) {
                s2 = s.toString();
            }
            else {
                final int length = s.length();
                final StringBuilder sb = new StringBuilder(length);
                dng next;
                int n2;
                do {
                    sb.append(s, n, a.a().o());
                    sb.append((CharSequence)f0.invoke((Object)a));
                    n2 = a.a().n() + 1;
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
                e0e.e((Object)s2, "sb.toString()");
            }
            substring = s2.substring(1);
            e0e.e((Object)substring, "this as java.lang.String).substring(startIndex)");
        }
        else {
            substring = null;
        }
        Objects.requireNonNull(ege.Companion);
        String i1;
        if (ege.e.c((CharSequence)s)) {
            i1 = rr4.I1((Iterable)wlr.N1((CharSequence)s, new String[] { "_" }), (CharSequence)"", (CharSequence)null, (CharSequence)null, (stb)cge.F0, 30);
        }
        else {
            i1 = null;
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
                if (i1 != null) {
                    o = super.b.get((Object)i1);
                }
            }
        }
        Object a2;
        if ((a2 = o) == null) {
            a2 = super.a;
            e0e.e(a2, "mDefaultValue");
        }
        return (T)a2;
    }
}
