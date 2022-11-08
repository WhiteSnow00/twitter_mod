import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fhs
{
    public static final c Companion;
    public static final dto<fhs, Object> d;
    public final bd0 a;
    public final long b;
    public final mis c;
    
    static {
        Companion = new c();
        fhs.d = (eto.eto$c)eto.a((gub)fhs$a.C0, (rtb)fhs$b.C0);
    }
    
    public fhs(final bd0 a, final long n, final mis mis) {
        this.a = a;
        this.b = h6q.q(n, a.C0.length());
        mis c;
        if (mis != null) {
            c = new mis(h6q.q(mis.a, a.C0.length()));
        }
        else {
            c = null;
        }
        this.c = c;
    }
    
    public fhs(String s, long b, final int n) {
        if ((n & 0x1) != 0x0) {
            s = "";
        }
        if ((n & 0x2) != 0x0) {
            Objects.requireNonNull(mis.Companion);
            b = mis.b;
        }
        this(new bd0(s, (List)null, 6), b, null);
    }
    
    public static fhs a(final fhs fhs, bd0 a, long b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = fhs.a;
        }
        if ((n & 0x2) != 0x0) {
            b = fhs.b;
        }
        mis c;
        if ((n & 0x4) != 0x0) {
            c = fhs.c;
        }
        else {
            c = null;
        }
        Objects.requireNonNull(fhs);
        zzd.f((Object)a, "annotatedString");
        return new fhs(a, b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof fhs)) {
            return false;
        }
        final long b2 = this.b;
        final fhs fhs = (fhs)o;
        if (!mis.b(b2, fhs.b) || !zzd.a((Object)this.c, (Object)fhs.c) || !zzd.a((Object)this.a, (Object)fhs.a)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int i = mis.i(this.b);
        final mis c = this.c;
        int j;
        if (c != null) {
            j = mis.i(c.a);
        }
        else {
            j = 0;
        }
        return (i + hashCode * 31) * 31 + j;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("TextFieldValue(text='");
        g.append(this.a);
        g.append("', selection=");
        g.append((Object)mis.j(this.b));
        g.append(", composition=");
        g.append(this.c);
        g.append(')');
        return g.toString();
    }
    
    public static final class c
    {
    }
}
