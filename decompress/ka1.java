// 
// Decompiled by Procyon v0.6.0
// 

public final class ka1 extends o17$e$d$a
{
    public final o17$e$d$a$b a;
    public final fed<o17$c> b;
    public final fed<o17$c> c;
    public final Boolean d;
    public final int e;
    
    public ka1(final o17$e$d$a$b a, final fed b, final fed c, final Boolean d, final int e, final ka1$a ka1$a) {
        this.a = a;
        this.b = (fed<o17$c>)b;
        this.c = (fed<o17$c>)c;
        this.d = d;
        this.e = e;
    }
    
    public final Boolean a() {
        return this.d;
    }
    
    public final fed<o17$c> b() {
        return this.b;
    }
    
    public final o17$e$d$a$b c() {
        return this.a;
    }
    
    public final fed<o17$c> d() {
        return this.c;
    }
    
    public final int e() {
        return this.e;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o17$e$d$a) {
            final o17$e$d$a o17$e$d$a = (o17$e$d$a)o;
            if (this.a.equals(o17$e$d$a.c())) {
                final fed<o17$c> b2 = this.b;
                if (b2 == null) {
                    if (o17$e$d$a.b() != null) {
                        return false;
                    }
                }
                else if (!b2.equals((Object)o17$e$d$a.b())) {
                    return false;
                }
                final fed<o17$c> c = this.c;
                if (c == null) {
                    if (o17$e$d$a.d() != null) {
                        return false;
                    }
                }
                else if (!c.equals((Object)o17$e$d$a.d())) {
                    return false;
                }
                final Boolean d = this.d;
                if (d == null) {
                    if (o17$e$d$a.a() != null) {
                        return false;
                    }
                }
                else if (!d.equals(o17$e$d$a.a())) {
                    return false;
                }
                if (this.e == o17$e$d$a.e()) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final o17$e$d$a$a f() {
        return new b(this);
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final fed<o17$c> b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final fed<o17$c> c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Boolean d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode2) * 1000003 ^ this.e;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("Application{execution=");
        f.append(this.a);
        f.append(", customAttributes=");
        f.append(this.b);
        f.append(", internalKeys=");
        f.append(this.c);
        f.append(", background=");
        f.append(this.d);
        f.append(", uiOrientation=");
        return ad.y(f, this.e, "}");
    }
    
    public static final class b extends o17$e$d$a$a
    {
        public o17$e$d$a$b a;
        public fed<o17$c> b;
        public fed<o17$c> c;
        public Boolean d;
        public Integer e;
        
        public b() {
        }
        
        public b(final o17$e$d$a o17$e$d$a) {
            this.a = o17$e$d$a.c();
            this.b = (fed<o17$c>)o17$e$d$a.b();
            this.c = (fed<o17$c>)o17$e$d$a.d();
            this.d = o17$e$d$a.a();
            this.e = o17$e$d$a.e();
        }
        
        public final o17$e$d$a a() {
            String s;
            if (this.a == null) {
                s = " execution";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.e == null) {
                l = mqb.l(s, " uiOrientation");
            }
            if (l.isEmpty()) {
                return new ka1(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(mqb.l("Missing required properties:", l));
        }
        
        public final o17$e$d$a$a b(final int n) {
            this.e = n;
            return this;
        }
    }
}
