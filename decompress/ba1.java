// 
// Decompiled by Procyon v0.6.0
// 

public final class ba1 extends o17$a
{
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    
    public ba1(final int a, final String b, final int c, final int d, final long e, final long f, final long g, final String h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final int a() {
        return this.d;
    }
    
    public final int b() {
        return this.a;
    }
    
    public final String c() {
        return this.b;
    }
    
    public final long d() {
        return this.e;
    }
    
    public final int e() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o17$a) {
            final o17$a o17$a = (o17$a)o;
            if (this.a == o17$a.b() && this.b.equals(o17$a.c()) && this.c == o17$a.e() && this.d == o17$a.a() && this.e == o17$a.d() && this.f == o17$a.f() && this.g == o17$a.g()) {
                final String h = this.h;
                if (h == null) {
                    if (o17$a.h() == null) {
                        return b;
                    }
                }
                else if (h.equals(o17$a.h())) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final long f() {
        return this.f;
    }
    
    public final long g() {
        return this.g;
    }
    
    public final String h() {
        return this.h;
    }
    
    public final int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final int c = this.c;
        final int d = this.d;
        final long e = this.e;
        final int n = (int)(e ^ e >>> 32);
        final long f = this.f;
        final int n2 = (int)(f ^ f >>> 32);
        final long g = this.g;
        final int n3 = (int)(g ^ g >>> 32);
        final String h = this.h;
        int hashCode2;
        if (h == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = h.hashCode();
        }
        return (((((((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ c) * 1000003 ^ d) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ hashCode2;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("ApplicationExitInfo{pid=");
        f.append(this.a);
        f.append(", processName=");
        f.append(this.b);
        f.append(", reasonCode=");
        f.append(this.c);
        f.append(", importance=");
        f.append(this.d);
        f.append(", pss=");
        f.append(this.e);
        f.append(", rss=");
        f.append(this.f);
        f.append(", timestamp=");
        f.append(this.g);
        f.append(", traceFile=");
        return m51.y(f, this.h, "}");
    }
    
    public static final class a extends o17$a$a
    {
        public Integer a;
        public String b;
        public Integer c;
        public Integer d;
        public Long e;
        public Long f;
        public Long g;
        public String h;
        
        public final o17$a a() {
            String s;
            if (this.a == null) {
                s = " pid";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.b == null) {
                l = mqb.l(s, " processName");
            }
            String i = l;
            if (this.c == null) {
                i = mqb.l(l, " reasonCode");
            }
            String j = i;
            if (this.d == null) {
                j = mqb.l(i, " importance");
            }
            String k = j;
            if (this.e == null) {
                k = mqb.l(j, " pss");
            }
            String m = k;
            if (this.f == null) {
                m = mqb.l(k, " rss");
            }
            String l2 = m;
            if (this.g == null) {
                l2 = mqb.l(m, " timestamp");
            }
            if (l2.isEmpty()) {
                return new ba1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            }
            throw new IllegalStateException(mqb.l("Missing required properties:", l2));
        }
    }
}
