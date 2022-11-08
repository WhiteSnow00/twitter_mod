// 
// Decompiled by Procyon v0.6.0
// 

public final class gt4 implements tvv
{
    public final String b;
    public final boolean c;
    public final String d;
    public final dtg e;
    public final String f;
    public final int g;
    public final w5w h;
    public final String i;
    public final String j;
    public final wr8 k;
    public final waa l;
    
    public gt4(final String b, final boolean c, final String d, final dtg e, final String f, final int g, final w5w h, final String i, final String j, final wr8 k) {
        final waa i2 = waa.I0;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = i2;
    }
    
    public final wr8 a() {
        return this.k;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof gt4)) {
            return false;
        }
        final gt4 gt4 = (gt4)o;
        return zzd.a((Object)this.b, (Object)gt4.b) && this.c == gt4.c && zzd.a((Object)this.d, (Object)gt4.d) && zzd.a((Object)this.e, (Object)gt4.e) && zzd.a((Object)this.f, (Object)gt4.f) && this.g == gt4.g && zzd.a((Object)this.h, (Object)gt4.h) && zzd.a((Object)this.i, (Object)gt4.i) && zzd.a((Object)this.j, (Object)gt4.j) && zzd.a((Object)this.k, (Object)gt4.k) && this.l == gt4.l;
    }
    
    public final waa getName() {
        return this.l;
    }
    
    @Override
    public final int hashCode() {
        final String b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        final String d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final dtg e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final String f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final int g = this.g;
        final w5w h = this.h;
        int hashCode6;
        if (h == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = h.hashCode();
        }
        final String i = this.i;
        int hashCode7;
        if (i == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = i.hashCode();
        }
        final String j = this.j;
        int hashCode8;
        if (j == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = j.hashCode();
        }
        final wr8 k = this.k;
        if (k != null) {
            hashCode = k.hashCode();
        }
        return this.l.hashCode() + (((((((((hashCode2 * 31 + c) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + g) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final boolean c = this.c;
        final String d = this.d;
        final dtg e = this.e;
        final String f = this.f;
        final int g = this.g;
        final w5w h = this.h;
        final String i = this.i;
        final String j = this.j;
        final wr8 k = this.k;
        final waa l = this.l;
        final StringBuilder y = rb0.y("CommerceDropDetailsComponent(dropId=", b, ", isUserSubscribed=", c, ", dropTime=");
        y.append(d);
        y.append(", coverMedia=");
        y.append(e);
        y.append(", productName=");
        lf.y(y, f, ", subscriberCount=", g, ", externalUrl=");
        y.append(h);
        y.append(", merchantUserId=");
        y.append(i);
        y.append(", productKey=");
        y.append(j);
        y.append(", destination=");
        y.append(k);
        y.append(", name=");
        y.append(l);
        y.append(")");
        return y.toString();
    }
    
    public static final class b extends js2<gt4, gt4$a>
    {
        public static final b c;
        
        static {
            c = new b();
        }
        
        public b() {
            super(1);
        }
        
        public final void f(final flp flp, final Object o) {
            final gt4 gt4 = (gt4)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)gt4, "commerceDropDetailsComponent");
            flp.G(gt4.b);
            flp.C((Object)gt4.k, (alp)wr8.a);
            flp.G(gt4.d);
            flp.t(gt4.c);
            flp.C((Object)gt4.e, (alp)dtg.o1);
            flp.G(gt4.f);
            flp.z(gt4.g);
            flp.C((Object)gt4.h, (alp)w5w.K0);
            flp.G(gt4.i);
            flp.G(gt4.j);
        }
        
        public final h4j g() {
            return (h4j)new gt4$a((String)null, (Boolean)null, (String)null, (String)null, (dtg)null, (Integer)null, (w5w)null, (String)null, (String)null, 511, (hg8)null);
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) {
            final gt4$a gt4$a = (gt4$a)h4j;
            zzd.f((Object)elp, "input");
            zzd.f((Object)gt4$a, "builder");
            gt4$a.b = elp.I();
            ((tvv.a)gt4$a).a = (wr8)((s4j)wr8.a).a(elp);
            gt4$a.d = elp.I();
            gt4$a.c = elp.u();
            gt4$a.f = (dtg)((s4j)dtg.o1).a(elp);
            gt4$a.e = elp.I();
            gt4$a.g = elp.z();
            gt4$a.h = (w5w)((s4j)w5w.K0).a(elp);
            final String s = null;
            String i;
            if (n >= 1) {
                i = elp.I();
            }
            else {
                i = null;
            }
            gt4$a.i = i;
            String j = s;
            if (n >= 1) {
                j = elp.I();
            }
            gt4$a.j = j;
        }
    }
}
