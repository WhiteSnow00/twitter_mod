// 
// Decompiled by Procyon v0.6.0
// 

public final class bc1 extends jbr
{
    public final jbr$a a;
    public final jbr$c b;
    public final jbr$b c;
    
    public bc1(final jbr$a a, final jbr$c b, final jbr$b c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final jbr$a a() {
        return this.a;
    }
    
    public final jbr$b b() {
        return this.c;
    }
    
    public final jbr$c c() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof jbr) {
            final jbr jbr = (jbr)o;
            if (!this.a.equals(jbr.a()) || !this.b.equals(jbr.c()) || !this.c.equals(jbr.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("StaticSessionData{appData=");
        f.append(this.a);
        f.append(", osData=");
        f.append(this.b);
        f.append(", deviceData=");
        f.append(this.c);
        f.append("}");
        return f.toString();
    }
}
