// 
// Decompiled by Procyon v0.6.0
// 

public final class rd4
{
    public static final b Companion;
    public static final alp<rd4> i;
    public final boolean a;
    public final String b;
    public final qd4 c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final kk3 h;
    
    static {
        Companion = new b();
        rd4.i = new a();
    }
    
    public rd4(final boolean a, final String b, final qd4 c, final Integer d, final Integer e, final Integer f, final Integer g, final kk3 h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void a(final tfe tfe) {
        tfe.r0();
        tfe.e("is_rtl", this.a);
        final String b = this.b;
        if (b != null) {
            tfe.u0("impression_id", b);
        }
        if (this.c != null) {
            tfe.i0("tweet_click_coordinates");
            tfe.P("x_value", this.c.a);
            tfe.P("y_value", this.c.b);
            tfe.h();
        }
        final Integer d = this.d;
        if (d != null) {
            d.intValue();
            tfe.T("tweet_height", this.d);
        }
        final Integer e = this.e;
        if (e != null) {
            e.intValue();
            tfe.T("tweet_width", this.e);
        }
        final Integer f = this.f;
        if (f != null) {
            f.intValue();
            tfe.T("card_height", this.f);
        }
        final Integer g = this.g;
        if (g != null) {
            g.intValue();
            tfe.T("card_width", this.g);
        }
        if (this.h != null) {
            tfe.i0("card_offset");
            tfe.T("x_value", this.h.a);
            tfe.T("y_value", this.h.b);
            tfe.h();
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rd4)) {
            return false;
        }
        final rd4 rd4 = (rd4)o;
        return this.a == rd4.a && zzd.a((Object)this.b, (Object)rd4.b) && zzd.a((Object)this.c, (Object)rd4.c) && zzd.a((Object)this.d, (Object)rd4.d) && zzd.a((Object)this.e, (Object)rd4.e) && zzd.a((Object)this.f, (Object)rd4.f) && zzd.a((Object)this.g, (Object)rd4.g) && zzd.a((Object)this.h, (Object)rd4.h);
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        final String b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final qd4 c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final Integer d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final Integer e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final Integer f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final Integer g = this.g;
        int hashCode7;
        if (g == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = g.hashCode();
        }
        final kk3 h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return ((((((a * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String b = this.b;
        final qd4 c = this.c;
        final Integer d = this.d;
        final Integer e = this.e;
        final Integer f = this.f;
        final Integer g = this.g;
        final kk3 h = this.h;
        final StringBuilder s = b8b.s("ClickCoordinatesScribeDetails(isRtl=", a, ", impressionId=", b, ", clickCoordinate=");
        s.append(c);
        s.append(", tweetHeight=");
        s.append(d);
        s.append(", tweetWidth=");
        s.append(e);
        s.append(", cardHeight=");
        s.append(f);
        s.append(", cardWidth=");
        s.append(g);
        s.append(", cardOffset=");
        s.append(h);
        s.append(")");
        return s.toString();
    }
    
    public static final class a extends s4j<rd4>
    {
        public final Object d(final elp elp, final int n) {
            zzd.f((Object)elp, "input");
            final boolean u = elp.u();
            final String i = elp.I();
            final hx6$k d = hx6.d;
            final Float n2 = (Float)((bow)d).a(elp);
            final Float n3 = (Float)((bow)d).a(elp);
            qd4 qd4;
            if (n2 != null && n3 != null) {
                qd4 = new qd4((float)n2, (float)n3);
            }
            else {
                qd4 = null;
            }
            final hx6$i b = hx6.b;
            final Integer n4 = (Integer)((bow)b).a(elp);
            final Integer n5 = (Integer)((bow)b).a(elp);
            final Integer n6 = (Integer)((bow)b).a(elp);
            final Integer n7 = (Integer)((bow)b).a(elp);
            final Integer n8 = (Integer)((bow)b).a(elp);
            final Integer n9 = (Integer)((bow)b).a(elp);
            kk3 kk3;
            if (n8 != null && n9 != null) {
                kk3 = new kk3(n8, n9);
            }
            else {
                kk3 = null;
            }
            return new rd4(u, i, qd4, n4, n5, n6, n7, kk3);
        }
        
        public final void f(final flp flp, final Object o) {
            final rd4 rd4 = (rd4)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)rd4, "details");
            flp.t(rd4.a);
            flp.G(rd4.b);
            final qd4 c = rd4.c;
            final Object o2 = null;
            Float value;
            if (c != null) {
                value = c.a;
            }
            else {
                value = null;
            }
            final hx6$k d = hx6.d;
            ((bow)d).c(flp, (Object)value);
            final int a = w4j.a;
            final qd4 c2 = rd4.c;
            Float value2;
            if (c2 != null) {
                value2 = c2.b;
            }
            else {
                value2 = null;
            }
            ((bow)d).c(flp, (Object)value2);
            final Integer d2 = rd4.d;
            final hx6$i b = hx6.b;
            ((bow)b).c(flp, (Object)d2);
            ((bow)b).c(flp, (Object)rd4.e);
            ((bow)b).c(flp, (Object)rd4.f);
            ((bow)b).c(flp, (Object)rd4.g);
            final kk3 h = rd4.h;
            Integer value3;
            if (h != null) {
                value3 = h.a;
            }
            else {
                value3 = null;
            }
            ((bow)b).c(flp, (Object)value3);
            final kk3 h2 = rd4.h;
            Object value4 = o2;
            if (h2 != null) {
                value4 = h2.a;
            }
            ((bow)b).c(flp, value4);
        }
    }
    
    public static final class b
    {
    }
}
