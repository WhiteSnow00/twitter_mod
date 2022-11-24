import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ojs
{
    public final xc0 a;
    public final kks b;
    public final List<xc0$b<phk>> c;
    public final int d;
    public final boolean e;
    public final int f;
    public final rp8 g;
    public final cwe h;
    public final qkb$b i;
    public final long j;
    
    public ojs(final xc0 a, final kks b, final List c, final int d, final boolean e, final int f, final rp8 g, final cwe h, final qkb$b i, final long j, final wg8 wg8) {
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
        if (this == o) {
            return true;
        }
        if (!(o instanceof ojs)) {
            return false;
        }
        final xc0 a = this.a;
        final ojs ojs = (ojs)o;
        return e0e.a((Object)a, (Object)ojs.a) && e0e.a((Object)this.b, (Object)ojs.b) && e0e.a((Object)this.c, (Object)ojs.c) && this.d == ojs.d && this.e == ojs.e && this.f == ojs.f && e0e.a((Object)this.g, (Object)ojs.g) && this.h == ojs.h && e0e.a((Object)this.i, (Object)ojs.i) && vj6.b(this.j, ojs.j);
    }
    
    @Override
    public final int hashCode() {
        final int o = go9.o((List)this.c, (this.b.hashCode() + this.a.hashCode() * 31) * 31, 31);
        final int d = this.d;
        int n;
        if (this.e) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return vj6.k(this.j) + (this.i.hashCode() + (this.h.hashCode() + (this.g.hashCode() + (((o + d) * 31 + n) * 31 + this.f) * 31) * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("TextLayoutInput(text=");
        f.append(this.a);
        f.append(", style=");
        f.append(this.b);
        f.append(", placeholders=");
        f.append(this.c);
        f.append(", maxLines=");
        f.append(this.d);
        f.append(", softWrap=");
        f.append(this.e);
        f.append(", overflow=");
        final int f2 = this.f;
        final int n = 0;
        String s;
        if (f2 == 1) {
            s = "Clip";
        }
        else if (f2 == 2) {
            s = "Ellipsis";
        }
        else {
            int n2 = n;
            if (f2 == 3) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "Visible";
            }
            else {
                s = "Invalid";
            }
        }
        f.append((Object)s);
        f.append(", density=");
        f.append(this.g);
        f.append(", layoutDirection=");
        f.append(this.h);
        f.append(", fontFamilyResolver=");
        f.append(this.i);
        f.append(", constraints=");
        f.append((Object)vj6.l(this.j));
        f.append(')');
        return f.toString();
    }
}
