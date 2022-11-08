// 
// Decompiled by Procyon v0.6.0
// 

public final class pa1 extends d17$e$d$a$b$d
{
    public final String a;
    public final int b;
    public final bed<d17$e$d$a$b$d$b> c;
    
    public pa1(final String a, final int b, final bed c, final pa1$a pa1$a) {
        this.a = a;
        this.b = b;
        this.c = (bed<d17$e$d$a$b$d$b>)c;
    }
    
    public final bed<d17$e$d$a$b$d$b> a() {
        return this.c;
    }
    
    public final int b() {
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
        if (o instanceof d17$e$d$a$b$d) {
            final d17$e$d$a$b$d d17$e$d$a$b$d = (d17$e$d$a$b$d)o;
            if (!this.a.equals(d17$e$d$a$b$d.c()) || this.b != d17$e$d$a$b$d.b() || !this.c.equals((Object)d17$e$d$a$b$d.a())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("Thread{name=");
        g.append(this.a);
        g.append(", importance=");
        g.append(this.b);
        g.append(", frames=");
        g.append(this.c);
        g.append("}");
        return g.toString();
    }
    
    public static final class b extends d17$e$d$a$b$d$a
    {
        public String a;
        public Integer b;
        public bed<d17$e$d$a$b$d$b> c;
        
        public final d17$e$d$a$b$d a() {
            String s;
            if (this.a == null) {
                s = " name";
            }
            else {
                s = "";
            }
            String c = s;
            if (this.b == null) {
                c = l7k.c(s, " importance");
            }
            String c2 = c;
            if (this.c == null) {
                c2 = l7k.c(c, " frames");
            }
            if (c2.isEmpty()) {
                return new pa1(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(l7k.c("Missing required properties:", c2));
        }
    }
}
