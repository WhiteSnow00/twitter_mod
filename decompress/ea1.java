import java.util.Objects;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ea1 extends o17$d$a
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
        if (o instanceof o17$d$a) {
            final o17$d$a o17$d$a = (o17$d$a)o;
            if (this.a.equals(o17$d$a.b())) {
                final byte[] b2 = this.b;
                byte[] array;
                if (o17$d$a instanceof ea1) {
                    array = ((ea1)o17$d$a).b;
                }
                else {
                    array = o17$d$a.a();
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
        final StringBuilder f = ehk.f("File{filename=");
        f.append(this.a);
        f.append(", contents=");
        f.append(Arrays.toString(this.b));
        f.append("}");
        return f.toString();
    }
    
    public static final class a extends o17$d$a$a
    {
        public String a;
        public byte[] b;
        
        public final o17$d$a a() {
            String s;
            if (this.a == null) {
                s = " filename";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.b == null) {
                l = mqb.l(s, " contents");
            }
            if (l.isEmpty()) {
                return new ea1(this.a, this.b);
            }
            throw new IllegalStateException(mqb.l("Missing required properties:", l));
        }
        
        public final o17$d$a$a b(final byte[] b) {
            Objects.requireNonNull(b, "Null contents");
            this.b = b;
            return this;
        }
        
        public final o17$d$a$a c(final String a) {
            Objects.requireNonNull(a, "Null filename");
            this.a = a;
            return this;
        }
    }
}
