// 
// Decompiled by Procyon v0.6.0
// 

public final class ea1 extends i07$e$c
{
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;
    
    public ea1(final int a, final String b, final int c, final long d, final long e, final boolean f, final int g, final String h, final String i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final int b() {
        return this.c;
    }
    
    public final long c() {
        return this.e;
    }
    
    public final String d() {
        return this.h;
    }
    
    public final String e() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof i07$e$c) {
            final i07$e$c i07$e$c = (i07$e$c)o;
            if (this.a != i07$e$c.a() || !this.b.equals(i07$e$c.e()) || this.c != i07$e$c.b() || this.d != i07$e$c.g() || this.e != i07$e$c.c() || this.f != i07$e$c.i() || this.g != i07$e$c.h() || !this.h.equals(i07$e$c.d()) || !this.i.equals(i07$e$c.f())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final String f() {
        return this.i;
    }
    
    public final long g() {
        return this.d;
    }
    
    public final int h() {
        return this.g;
    }
    
    public final int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final int c = this.c;
        final long d = this.d;
        final int n = (int)(d ^ d >>> 32);
        final long e = this.e;
        final int n2 = (int)(e ^ e >>> 32);
        int n3;
        if (this.f) {
            n3 = 1231;
        }
        else {
            n3 = 1237;
        }
        return ((((((((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ c) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }
    
    public final boolean i() {
        return this.f;
    }
    
    public final String toString() {
        final StringBuilder j = fu8.j("Device{arch=");
        j.append(this.a);
        j.append(", model=");
        j.append(this.b);
        j.append(", cores=");
        j.append(this.c);
        j.append(", ram=");
        j.append(this.d);
        j.append(", diskSpace=");
        j.append(this.e);
        j.append(", simulator=");
        j.append(this.f);
        j.append(", state=");
        j.append(this.g);
        j.append(", manufacturer=");
        j.append(this.h);
        j.append(", modelClass=");
        return ed.B(j, this.i, "}");
    }
    
    public static final class a extends i07$e$c$a
    {
        public Integer a;
        public String b;
        public Integer c;
        public Long d;
        public Long e;
        public Boolean f;
        public Integer g;
        public String h;
        public String i;
        
        public final i07$e$c a() {
            String s;
            if (this.a == null) {
                s = " arch";
            }
            else {
                s = "";
            }
            String h = s;
            if (this.b == null) {
                h = hmg.h(s, " model");
            }
            String h2 = h;
            if (this.c == null) {
                h2 = hmg.h(h, " cores");
            }
            String h3 = h2;
            if (this.d == null) {
                h3 = hmg.h(h2, " ram");
            }
            String h4 = h3;
            if (this.e == null) {
                h4 = hmg.h(h3, " diskSpace");
            }
            String h5 = h4;
            if (this.f == null) {
                h5 = hmg.h(h4, " simulator");
            }
            String h6 = h5;
            if (this.g == null) {
                h6 = hmg.h(h5, " state");
            }
            String h7 = h6;
            if (this.h == null) {
                h7 = hmg.h(h6, " manufacturer");
            }
            String h8 = h7;
            if (this.i == null) {
                h8 = hmg.h(h7, " modelClass");
            }
            if (h8.isEmpty()) {
                return new ea1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
            throw new IllegalStateException(hmg.h("Missing required properties:", h8));
        }
    }
}
