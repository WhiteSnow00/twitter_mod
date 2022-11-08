import java.util.Objects;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ea1 extends d17$d$a
{
    public final String a;
    public final byte[] b;
    
    public ea1(final String a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    public final byte[] a() {
        return this.b;
    }
    
    public final String b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof d17$d$a) {
            final d17$d$a d17$d$a = (d17$d$a)o;
            if (this.a.equals(d17$d$a.b())) {
                final byte[] b2 = this.b;
                byte[] array;
                if (d17$d$a instanceof ea1) {
                    array = ((ea1)d17$d$a).b;
                }
                else {
                    array = d17$d$a.a();
                }
                if (Arrays.equals(b2, array)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("File{filename=");
        g.append(this.a);
        g.append(", contents=");
        g.append(Arrays.toString(this.b));
        g.append("}");
        return g.toString();
    }
    
    public static final class a extends d17$d$a$a
    {
        public String a;
        public byte[] b;
        
        public final d17$d$a a() {
            String s;
            if (this.a == null) {
                s = " filename";
            }
            else {
                s = "";
            }
            String c = s;
            if (this.b == null) {
                c = l7k.c(s, " contents");
            }
            if (c.isEmpty()) {
                return new ea1(this.a, this.b);
            }
            throw new IllegalStateException(l7k.c("Missing required properties:", c));
        }
        
        public final d17$d$a$a b(final byte[] b) {
            Objects.requireNonNull(b, "Null contents");
            this.b = b;
            return this;
        }
        
        public final d17$d$a$a c(final String a) {
            Objects.requireNonNull(a, "Null filename");
            this.a = a;
            return this;
        }
    }
}
