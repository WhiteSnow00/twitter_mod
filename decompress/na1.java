// 
// Decompiled by Procyon v0.6.0
// 

public final class na1 extends o17$e$d$a$b$b
{
    public final String a;
    public final String b;
    public final fed<o17$e$d$a$b$d$b> c;
    public final o17$e$d$a$b$b d;
    public final int e;
    
    public na1(final String a, final String b, final fed c, final o17$e$d$a$b$b d, final int e, final na1$a object) {
        this.a = a;
        this.b = b;
        this.c = (fed<o17$e$d$a$b$d$b>)c;
        this.d = d;
        this.e = e;
    }
    
    public final o17$e$d$a$b$b a() {
        return this.d;
    }
    
    public final fed<o17$e$d$a$b$d$b> b() {
        return this.c;
    }
    
    public final int c() {
        return this.e;
    }
    
    public final String d() {
        return this.b;
    }
    
    public final String e() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o17$e$d$a$b$b) {
            final o17$e$d$a$b$b o17$e$d$a$b$b = (o17$e$d$a$b$b)o;
            if (this.a.equals(o17$e$d$a$b$b.e())) {
                final String b2 = this.b;
                if (b2 == null) {
                    if (o17$e$d$a$b$b.d() != null) {
                        return false;
                    }
                }
                else if (!b2.equals(o17$e$d$a$b$b.d())) {
                    return false;
                }
                if (this.c.equals((Object)o17$e$d$a$b$b.b())) {
                    final o17$e$d$a$b$b d = this.d;
                    if (d == null) {
                        if (o17$e$d$a$b$b.a() != null) {
                            return false;
                        }
                    }
                    else if (!d.equals(o17$e$d$a$b$b.a())) {
                        return false;
                    }
                    if (this.e == o17$e$d$a$b$b.c()) {
                        return b;
                    }
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int hashCode4 = this.c.hashCode();
        final o17$e$d$a$b$b d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode2) * 1000003 ^ this.e;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("Exception{type=");
        f.append(this.a);
        f.append(", reason=");
        f.append(this.b);
        f.append(", frames=");
        f.append(this.c);
        f.append(", causedBy=");
        f.append(this.d);
        f.append(", overflowCount=");
        return ad.y(f, this.e, "}");
    }
    
    public static final class b extends o17$e$d$a$b$b$a
    {
        public String a;
        public String b;
        public fed<o17$e$d$a$b$d$b> c;
        public o17$e$d$a$b$b d;
        public Integer e;
        
        public final o17$e$d$a$b$b a() {
            String s;
            if (this.a == null) {
                s = " type";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.c == null) {
                l = mqb.l(s, " frames");
            }
            String i = l;
            if (this.e == null) {
                i = mqb.l(l, " overflowCount");
            }
            if (i.isEmpty()) {
                return new na1(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(mqb.l("Missing required properties:", i));
        }
    }
}
