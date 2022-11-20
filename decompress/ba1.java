// 
// Decompiled by Procyon v0.6.0
// 

public final class ba1 extends i07$e
{
    public final String a;
    public final String b;
    public final long c;
    public final Long d;
    public final boolean e;
    public final i07$e$a f;
    public final i07$e$f g;
    public final i07$e$e h;
    public final i07$e$c i;
    public final fdd<i07$e$d> j;
    public final int k;
    
    public ba1(final String a, final String b, final long c, final Long d, final boolean e, final i07$e$a f, final i07$e$f g, final i07$e$e h, final i07$e$c i, final fdd j, final int k, final ba1$a ba1$a) {
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
        this.k = k;
    }
    
    public final i07$e$a a() {
        return this.f;
    }
    
    public final i07$e$c b() {
        return this.i;
    }
    
    public final Long c() {
        return this.d;
    }
    
    public final fdd<i07$e$d> d() {
        return this.j;
    }
    
    public final String e() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof i07$e) {
            final i07$e i07$e = (i07$e)o;
            if (this.a.equals(i07$e.e()) && this.b.equals(i07$e.g()) && this.c == i07$e.i()) {
                final Long d = this.d;
                if (d == null) {
                    if (i07$e.c() != null) {
                        return false;
                    }
                }
                else if (!d.equals(i07$e.c())) {
                    return false;
                }
                if (this.e == i07$e.k() && this.f.equals(i07$e.a())) {
                    final i07$e$f g = this.g;
                    if (g == null) {
                        if (i07$e.j() != null) {
                            return false;
                        }
                    }
                    else if (!g.equals(i07$e.j())) {
                        return false;
                    }
                    final i07$e$e h = this.h;
                    if (h == null) {
                        if (i07$e.h() != null) {
                            return false;
                        }
                    }
                    else if (!h.equals(i07$e.h())) {
                        return false;
                    }
                    final i07$e$c i = this.i;
                    if (i == null) {
                        if (i07$e.b() != null) {
                            return false;
                        }
                    }
                    else if (!i.equals(i07$e.b())) {
                        return false;
                    }
                    final fdd<i07$e$d> j = this.j;
                    if (j == null) {
                        if (i07$e.d() != null) {
                            return false;
                        }
                    }
                    else if (!j.equals(i07$e.d())) {
                        return false;
                    }
                    if (this.k == i07$e.f()) {
                        return b;
                    }
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int f() {
        return this.k;
    }
    
    public final String g() {
        return this.b;
    }
    
    public final i07$e$e h() {
        return this.h;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final long c = this.c;
        final int n = (int)(c ^ c >>> 32);
        final Long d = this.d;
        int hashCode3 = 0;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        int n2;
        if (this.e) {
            n2 = 1231;
        }
        else {
            n2 = 1237;
        }
        final int hashCode5 = this.f.hashCode();
        final i07$e$f g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        final i07$e$e h = this.h;
        int hashCode7;
        if (h == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = h.hashCode();
        }
        final i07$e$c i = this.i;
        int hashCode8;
        if (i == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = i.hashCode();
        }
        final fdd<i07$e$d> j = this.j;
        if (j != null) {
            hashCode3 = j.hashCode();
        }
        return ((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n) * 1000003 ^ hashCode4) * 1000003 ^ n2) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode3) * 1000003 ^ this.k;
    }
    
    public final long i() {
        return this.c;
    }
    
    public final i07$e$f j() {
        return this.g;
    }
    
    public final boolean k() {
        return this.e;
    }
    
    public final i07$e$b l() {
        return new b(this);
    }
    
    public final String toString() {
        final StringBuilder j = fu8.j("Session{generator=");
        j.append(this.a);
        j.append(", identifier=");
        j.append(this.b);
        j.append(", startedAt=");
        j.append(this.c);
        j.append(", endedAt=");
        j.append(this.d);
        j.append(", crashed=");
        j.append(this.e);
        j.append(", app=");
        j.append(this.f);
        j.append(", user=");
        j.append(this.g);
        j.append(", os=");
        j.append(this.h);
        j.append(", device=");
        j.append(this.i);
        j.append(", events=");
        j.append(this.j);
        j.append(", generatorType=");
        return wc0.A(j, this.k, "}");
    }
    
    public static final class b extends i07$e$b
    {
        public String a;
        public String b;
        public Long c;
        public Long d;
        public Boolean e;
        public i07$e$a f;
        public i07$e$f g;
        public i07$e$e h;
        public i07$e$c i;
        public fdd<i07$e$d> j;
        public Integer k;
        
        public b() {
        }
        
        public b(final i07$e i07$e) {
            this.a = i07$e.e();
            this.b = i07$e.g();
            this.c = i07$e.i();
            this.d = i07$e.c();
            this.e = i07$e.k();
            this.f = i07$e.a();
            this.g = i07$e.j();
            this.h = i07$e.h();
            this.i = i07$e.b();
            this.j = i07$e.d();
            this.k = i07$e.f();
        }
        
        public final i07$e a() {
            String s;
            if (this.a == null) {
                s = " generator";
            }
            else {
                s = "";
            }
            String h = s;
            if (this.b == null) {
                h = hmg.h(s, " identifier");
            }
            String h2 = h;
            if (this.c == null) {
                h2 = hmg.h(h, " startedAt");
            }
            String h3 = h2;
            if (this.e == null) {
                h3 = hmg.h(h2, " crashed");
            }
            String h4 = h3;
            if (this.f == null) {
                h4 = hmg.h(h3, " app");
            }
            String h5 = h4;
            if (this.k == null) {
                h5 = hmg.h(h4, " generatorType");
            }
            if (h5.isEmpty()) {
                return new ba1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null);
            }
            throw new IllegalStateException(hmg.h("Missing required properties:", h5));
        }
        
        public final i07$e$b b(final boolean b) {
            this.e = b;
            return this;
        }
    }
}
