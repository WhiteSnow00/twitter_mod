import java.util.Objects;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hc1 extends z1u
{
    public final String a;
    public final byte[] b;
    public final zzk c;
    
    public hc1(final String a, final byte[] b, final zzk c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final String b() {
        return this.a;
    }
    
    public final byte[] c() {
        return this.b;
    }
    
    public final zzk d() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof z1u) {
            final z1u z1u = (z1u)o;
            if (this.a.equals(z1u.b())) {
                final byte[] b2 = this.b;
                byte[] array;
                if (z1u instanceof hc1) {
                    array = ((hc1)z1u).b;
                }
                else {
                    array = z1u.c();
                }
                if (Arrays.equals(b2, array) && this.c.equals(z1u.d())) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b)) * 1000003 ^ this.c.hashCode();
    }
    
    public static final class a extends z1u$a
    {
        public String a;
        public byte[] b;
        public zzk c;
        
        public final z1u$a a(final String a) {
            Objects.requireNonNull(a, "Null backendName");
            this.a = a;
            return this;
        }
        
        public final z1u b() {
            String s;
            if (this.a == null) {
                s = " backendName";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.c == null) {
                l = mqb.l(s, " priority");
            }
            if (l.isEmpty()) {
                return new hc1(this.a, this.b, this.c);
            }
            throw new IllegalStateException(mqb.l("Missing required properties:", l));
        }
    }
}
