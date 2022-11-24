// 
// Decompiled by Procyon v0.6.0
// 

public final class da1 extends o17$d
{
    public final fed<o17$d$a> a;
    public final String b;
    
    public da1(final fed a, final String b, final da1$a da1$a) {
        this.a = (fed<o17$d$a>)a;
        this.b = b;
    }
    
    public final fed<o17$d$a> a() {
        return this.a;
    }
    
    public final String b() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o17$d) {
            final o17$d o17$d = (o17$d)o;
            if (this.a.equals((Object)o17$d.a())) {
                final String b2 = this.b;
                if (b2 == null) {
                    if (o17$d.b() == null) {
                        return b;
                    }
                }
                else if (b2.equals(o17$d.b())) {
                    return b;
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
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ hashCode2;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("FilesPayload{files=");
        f.append(this.a);
        f.append(", orgId=");
        return m51.y(f, this.b, "}");
    }
}
