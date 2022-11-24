// 
// Decompiled by Procyon v0.6.0
// 

public final class oa1 extends o17$e$d$a$b$c
{
    public final String a;
    public final String b;
    public final long c;
    
    public oa1(final String a, final String b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final long a() {
        return this.c;
    }
    
    public final String b() {
        return this.b;
    }
    
    public final String c() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o17$e$d$a$b$c) {
            final o17$e$d$a$b$c o17$e$d$a$b$c = (o17$e$d$a$b$c)o;
            if (!this.a.equals(o17$e$d$a$b$c.c()) || !this.b.equals(o17$e$d$a$b$c.b()) || this.c != o17$e$d$a$b$c.a()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final long c = this.c;
        return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ (int)(c ^ c >>> 32);
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("Signal{name=");
        f.append(this.a);
        f.append(", code=");
        f.append(this.b);
        f.append(", address=");
        return ang.c(f, this.c, "}");
    }
    
    public static final class a extends o17$e$d$a$b$c$a
    {
        public String a;
        public String b;
        public Long c;
        
        public final o17$e$d$a$b$c a() {
            String s;
            if (this.a == null) {
                s = " name";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.b == null) {
                l = mqb.l(s, " code");
            }
            String i = l;
            if (this.c == null) {
                i = mqb.l(l, " address");
            }
            if (i.isEmpty()) {
                return new oa1(this.a, this.b, this.c);
            }
            throw new IllegalStateException(mqb.l("Missing required properties:", i));
        }
    }
}
