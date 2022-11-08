// 
// Decompiled by Procyon v0.6.0
// 

public final class z91 extends d17
{
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final d17$e h;
    public final d17$d i;
    
    public z91(final String b, final String c, final int d, final String e, final String f, final String g, final d17$e h, final d17$d i) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final String a() {
        return this.f;
    }
    
    public final String b() {
        return this.g;
    }
    
    public final String c() {
        return this.c;
    }
    
    public final String d() {
        return this.e;
    }
    
    public final d17$d e() {
        return this.i;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof d17) {
            final d17 d17 = (d17)o;
            if (this.b.equals(d17.g()) && this.c.equals(d17.c()) && this.d == d17.f() && this.e.equals(d17.d()) && this.f.equals(d17.a()) && this.g.equals(d17.b())) {
                final d17$e h = this.h;
                if (h == null) {
                    if (d17.h() != null) {
                        return false;
                    }
                }
                else if (!h.equals(d17.h())) {
                    return false;
                }
                final d17$d i = this.i;
                if (i == null) {
                    if (d17.e() == null) {
                        return b;
                    }
                }
                else if (i.equals(d17.e())) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int f() {
        return this.d;
    }
    
    public final String g() {
        return this.b;
    }
    
    public final d17$e h() {
        return this.h;
    }
    
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final int d = this.d;
        final int hashCode3 = this.e.hashCode();
        final int hashCode4 = this.f.hashCode();
        final int hashCode5 = this.g.hashCode();
        final d17$e h = this.h;
        int hashCode6 = 0;
        int hashCode7;
        if (h == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = h.hashCode();
        }
        final d17$d i = this.i;
        if (i != null) {
            hashCode6 = i.hashCode();
        }
        return (((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ d) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode7) * 1000003 ^ hashCode6;
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("CrashlyticsReport{sdkVersion=");
        g.append(this.b);
        g.append(", gmpAppId=");
        g.append(this.c);
        g.append(", platform=");
        g.append(this.d);
        g.append(", installationUuid=");
        g.append(this.e);
        g.append(", buildVersion=");
        g.append(this.f);
        g.append(", displayVersion=");
        g.append(this.g);
        g.append(", session=");
        g.append(this.h);
        g.append(", ndkPayload=");
        g.append(this.i);
        g.append("}");
        return g.toString();
    }
    
    public static final class a extends d17$b
    {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public String e;
        public String f;
        public d17$e g;
        public d17$d h;
        
        public a() {
        }
        
        public a(final d17 d17) {
            this.a = d17.g();
            this.b = d17.c();
            this.c = d17.f();
            this.d = d17.d();
            this.e = d17.a();
            this.f = d17.b();
            this.g = d17.h();
            this.h = d17.e();
        }
        
        public final d17 a() {
            String s;
            if (this.a == null) {
                s = " sdkVersion";
            }
            else {
                s = "";
            }
            String c = s;
            if (this.b == null) {
                c = l7k.c(s, " gmpAppId");
            }
            String c2 = c;
            if (this.c == null) {
                c2 = l7k.c(c, " platform");
            }
            String c3 = c2;
            if (this.d == null) {
                c3 = l7k.c(c2, " installationUuid");
            }
            String c4 = c3;
            if (this.e == null) {
                c4 = l7k.c(c3, " buildVersion");
            }
            String c5 = c4;
            if (this.f == null) {
                c5 = l7k.c(c4, " displayVersion");
            }
            if (c5.isEmpty()) {
                return new z91(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            }
            throw new IllegalStateException(l7k.c("Missing required properties:", c5));
        }
    }
}
