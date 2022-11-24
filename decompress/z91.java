// 
// Decompiled by Procyon v0.6.0
// 

public final class z91 extends o17
{
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final o17$e h;
    public final o17$d i;
    
    public z91(final String b, final String c, final int d, final String e, final String f, final String g, final o17$e h, final o17$d i) {
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
    
    public final o17$d e() {
        return this.i;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o17) {
            final o17 o2 = (o17)o;
            if (this.b.equals(o2.g()) && this.c.equals(o2.c()) && this.d == o2.f() && this.e.equals(o2.d()) && this.f.equals(o2.a()) && this.g.equals(o2.b())) {
                final o17$e h = this.h;
                if (h == null) {
                    if (o2.h() != null) {
                        return false;
                    }
                }
                else if (!h.equals(o2.h())) {
                    return false;
                }
                final o17$d i = this.i;
                if (i == null) {
                    if (o2.e() == null) {
                        return b;
                    }
                }
                else if (i.equals(o2.e())) {
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
    
    public final o17$e h() {
        return this.h;
    }
    
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final int d = this.d;
        final int hashCode3 = this.e.hashCode();
        final int hashCode4 = this.f.hashCode();
        final int hashCode5 = this.g.hashCode();
        final o17$e h = this.h;
        int hashCode6 = 0;
        int hashCode7;
        if (h == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = h.hashCode();
        }
        final o17$d i = this.i;
        if (i != null) {
            hashCode6 = i.hashCode();
        }
        return (((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ d) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode7) * 1000003 ^ hashCode6;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("CrashlyticsReport{sdkVersion=");
        f.append(this.b);
        f.append(", gmpAppId=");
        f.append(this.c);
        f.append(", platform=");
        f.append(this.d);
        f.append(", installationUuid=");
        f.append(this.e);
        f.append(", buildVersion=");
        f.append(this.f);
        f.append(", displayVersion=");
        f.append(this.g);
        f.append(", session=");
        f.append(this.h);
        f.append(", ndkPayload=");
        f.append(this.i);
        f.append("}");
        return f.toString();
    }
    
    public static final class a extends o17$b
    {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public String e;
        public String f;
        public o17$e g;
        public o17$d h;
        
        public a() {
        }
        
        public a(final o17 o17) {
            this.a = o17.g();
            this.b = o17.c();
            this.c = o17.f();
            this.d = o17.d();
            this.e = o17.a();
            this.f = o17.b();
            this.g = o17.h();
            this.h = o17.e();
        }
        
        public final o17 a() {
            String s;
            if (this.a == null) {
                s = " sdkVersion";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.b == null) {
                l = mqb.l(s, " gmpAppId");
            }
            String i = l;
            if (this.c == null) {
                i = mqb.l(l, " platform");
            }
            String j = i;
            if (this.d == null) {
                j = mqb.l(i, " installationUuid");
            }
            String k = j;
            if (this.e == null) {
                k = mqb.l(j, " buildVersion");
            }
            String m = k;
            if (this.f == null) {
                m = mqb.l(k, " displayVersion");
            }
            if (m.isEmpty()) {
                return new z91(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            }
            throw new IllegalStateException(mqb.l("Missing required properties:", m));
        }
    }
}
