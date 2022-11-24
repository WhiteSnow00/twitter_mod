// 
// Decompiled by Procyon v0.6.0
// 

public final class ta1 extends o17$e$e
{
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    
    public ta1(final int a, final String b, final String c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final String a() {
        return this.c;
    }
    
    public final int b() {
        return this.a;
    }
    
    public final String c() {
        return this.b;
    }
    
    public final boolean d() {
        return this.d;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o17$e$e) {
            final o17$e$e o17$e$e = (o17$e$e)o;
            if (this.a != o17$e$e.b() || !this.b.equals(o17$e$e.c()) || !this.c.equals(o17$e$e.a()) || this.d != o17$e$e.d()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        int n;
        if (this.d) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return (((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("OperatingSystem{platform=");
        f.append(this.a);
        f.append(", version=");
        f.append(this.b);
        f.append(", buildVersion=");
        f.append(this.c);
        f.append(", jailbroken=");
        return xj0.B(f, this.d, "}");
    }
    
    public static final class a extends o17$e$e$a
    {
        public Integer a;
        public String b;
        public String c;
        public Boolean d;
        
        public final o17$e$e a() {
            String s;
            if (this.a == null) {
                s = " platform";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.b == null) {
                l = mqb.l(s, " version");
            }
            String i = l;
            if (this.c == null) {
                i = mqb.l(l, " buildVersion");
            }
            String j = i;
            if (this.d == null) {
                j = mqb.l(i, " jailbroken");
            }
            if (j.isEmpty()) {
                return new ta1(this.a, this.b, this.c, this.d);
            }
            throw new IllegalStateException(mqb.l("Missing required properties:", j));
        }
    }
}
