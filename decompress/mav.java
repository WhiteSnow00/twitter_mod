import java.util.Objects;
import java.io.IOException;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mav
{
    public static final alp<mav> k;
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final int f;
    public final y8v g;
    public final szi h;
    public final String i;
    public final p7c j;
    
    static {
        mav.k = new a();
    }
    
    public mav(final int n) {
        this(n, "", 0L, "", null, -1, null, null, null, null);
    }
    
    public mav(final int a, final String b, final long c, final String d, final String e, final int f, final y8v g, final szi h, final String i, final p7c j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (o == null) {
                return b2;
            }
            b2 = b;
            if (!(o instanceof mav)) {
                return b2;
            }
            final mav mav = (mav)o;
            boolean b3 = false;
            Label_0169: {
                Label_0166: {
                    if (this != mav) {
                        if (this.a == mav.a && this.b.equals(mav.b) && this.c == mav.c && this.d.equals(mav.d)) {
                            final String e = this.e;
                            final String e2 = mav.e;
                            final Pattern a = pjr.a;
                            if (zzd.a((Object)e, (Object)e2) && this.f == mav.f && w4j.a((Object)this.g, (Object)mav.g) && w4j.a((Object)this.h, (Object)mav.h)) {
                                break Label_0166;
                            }
                        }
                        b3 = false;
                        break Label_0169;
                    }
                }
                b3 = true;
            }
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.h) + (w4j.f((Object)this.g) + jhd.j((long)this.f, l7k.e(this.e, l7k.a(this.d, jhd.j(this.c, l7k.a(this.b, jhd.j((long)this.a, 0, 31), 31), 31), 31), 31), 31)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("message: ");
        g.append(this.b);
        g.append("\n code: ");
        g.append(this.a);
        g.append("\n timeStamp: ");
        g.append(this.c);
        g.append("\n attribute: ");
        g.append(this.d);
        g.append("\n title: ");
        g.append(this.e);
        g.append("\n retryAfter: ");
        g.append(this.f);
        g.append("\n bounceError: ");
        g.append(this.g);
        g.append("\n nudge: ");
        g.append(this.h);
        return g.toString();
    }
    
    public static final class a extends s4j<mav>
    {
        public final Object d(final elp elp, final int n) throws IOException, ClassNotFoundException {
            return new mav(elp.z(), elp.C(), elp.A(), elp.C(), elp.I(), elp.z(), (y8v)y8v.d.a(elp), (szi)((s4j)szi.e).a(elp), elp.I(), (p7c)((s4j)p7c.h).a(elp));
        }
        
        public final void f(flp flp, final Object o) throws IOException {
            final mav mav = (mav)o;
            flp = flp.z(mav.a).G(mav.b).A(mav.c).G(mav.d).G(mav.e).z(mav.f);
            final y8v g = mav.g;
            final y8v.a d = y8v.d;
            Objects.requireNonNull(flp);
            d.c(flp, (Object)g);
            final int a = w4j.a;
            ((s4j)szi.e).c(flp, (Object)mav.h);
            flp = flp.G(mav.i);
            final p7c j = mav.j;
            final p7c$a h = p7c.h;
            Objects.requireNonNull(flp);
            ((s4j)h).c(flp, (Object)j);
        }
    }
}
