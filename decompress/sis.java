import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sis
{
    public static final c Companion;
    public static final ouo<sis, Object> d;
    public final xc0 a;
    public final long b;
    public final zjs c;
    
    static {
        Companion = new c();
        sis.d = (puo.puo$c)puo.a((hub<? super quo, ? super Object, ?>)sis$a.F0, (stb<? super Object, ?>)sis$b.F0);
    }
    
    public sis(String s, long b, final int n) {
        if ((n & 0x1) != 0x0) {
            s = "";
        }
        if ((n & 0x2) != 0x0) {
            Objects.requireNonNull(zjs.Companion);
            b = zjs.b;
        }
        this(new xc0(s, (List)null, 6), b, null);
    }
    
    public sis(final xc0 a, final long n, final zjs zjs) {
        this.a = a;
        this.b = p4j.s(n, a.F0.length());
        zjs c;
        if (zjs != null) {
            c = new zjs(p4j.s(zjs.a, a.F0.length()));
        }
        else {
            c = null;
        }
        this.c = c;
    }
    
    public static sis a(final sis sis, xc0 a, long b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = sis.a;
        }
        if ((n & 0x2) != 0x0) {
            b = sis.b;
        }
        zjs c;
        if ((n & 0x4) != 0x0) {
            c = sis.c;
        }
        else {
            c = null;
        }
        Objects.requireNonNull(sis);
        e0e.f((Object)a, "annotatedString");
        return new sis(a, b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof sis)) {
            return false;
        }
        final long b2 = this.b;
        final sis sis = (sis)o;
        if (!zjs.b(b2, sis.b) || !e0e.a((Object)this.c, (Object)sis.c) || !e0e.a((Object)this.a, (Object)sis.a)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int i = zjs.i(this.b);
        final zjs c = this.c;
        int j;
        if (c != null) {
            j = zjs.i(c.a);
        }
        else {
            j = 0;
        }
        return (i + hashCode * 31) * 31 + j;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("TextFieldValue(text='");
        f.append(this.a);
        f.append("', selection=");
        f.append((Object)zjs.j(this.b));
        f.append(", composition=");
        f.append(this.c);
        f.append(')');
        return f.toString();
    }
    
    public static final class c
    {
    }
}
