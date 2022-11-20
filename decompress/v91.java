// 
// Decompiled by Procyon v0.6.0
// 

public final class v91 extends i07
{
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final i07$e h;
    public final i07$d i;
    
    public v91(final String b, final String c, final int d, final String e, final String f, final String g, final i07$e h, final i07$d i) {
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
    
    public final i07$d e() {
        return this.i;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof i07) {
            final i07 i07 = (i07)o;
            if (this.b.equals(i07.g()) && this.c.equals(i07.c()) && this.d == i07.f() && this.e.equals(i07.d()) && this.f.equals(i07.a()) && this.g.equals(i07.b())) {
                final i07$e h = this.h;
                if (h == null) {
                    if (i07.h() != null) {
                        return false;
                    }
                }
                else if (!h.equals(i07.h())) {
                    return false;
                }
                final i07$d j = this.i;
                if (j == null) {
                    if (i07.e() == null) {
                        return b;
                    }
                }
                else if (j.equals(i07.e())) {
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
    
    public final i07$e h() {
        return this.h;
    }
    
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final int d = this.d;
        final int hashCode3 = this.e.hashCode();
        final int hashCode4 = this.f.hashCode();
        final int hashCode5 = this.g.hashCode();
        final i07$e h = this.h;
        int hashCode6 = 0;
        int hashCode7;
        if (h == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = h.hashCode();
        }
        final i07$d i = this.i;
        if (i != null) {
            hashCode6 = i.hashCode();
        }
        return (((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ d) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode7) * 1000003 ^ hashCode6;
    }
    
    public final String toString() {
        final StringBuilder j = fu8.j("CrashlyticsReport{sdkVersion=");
        j.append(this.b);
        j.append(", gmpAppId=");
        j.append(this.c);
        j.append(", platform=");
        j.append(this.d);
        j.append(", installationUuid=");
        j.append(this.e);
        j.append(", buildVersion=");
        j.append(this.f);
        j.append(", displayVersion=");
        j.append(this.g);
        j.append(", session=");
        j.append(this.h);
        j.append(", ndkPayload=");
        j.append(this.i);
        j.append("}");
        return j.toString();
    }
    
    public static final class a extends i07$b
    {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public String e;
        public String f;
        public i07$e g;
        public i07$d h;
        
        public a() {
        }
        
        public a(final i07 i07) {
            this.a = i07.g();
            this.b = i07.c();
            this.c = i07.f();
            this.d = i07.d();
            this.e = i07.a();
            this.f = i07.b();
            this.g = i07.h();
            this.h = i07.e();
        }
        
        public final i07 a() {
            String s;
            if (this.a == null) {
                s = " sdkVersion";
            }
            else {
                s = "";
            }
            String h = s;
            if (this.b == null) {
                h = hmg.h(s, " gmpAppId");
            }
            String h2 = h;
            if (this.c == null) {
                h2 = hmg.h(h, " platform");
            }
            String h3 = h2;
            if (this.d == null) {
                h3 = hmg.h(h2, " installationUuid");
            }
            String h4 = h3;
            if (this.e == null) {
                h4 = hmg.h(h3, " buildVersion");
            }
            String h5 = h4;
            if (this.f == null) {
                h5 = hmg.h(h4, " displayVersion");
            }
            if (h5.isEmpty()) {
                return new v91(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            }
            throw new IllegalStateException(hmg.h("Missing required properties:", h5));
        }
    }
}
