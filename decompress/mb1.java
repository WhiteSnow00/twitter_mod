import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mb1 extends m8g
{
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final lci g;
    
    public mb1(final long a, final Integer b, final long c, final byte[] d, final String e, final long f, final lci g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final Integer a() {
        return this.b;
    }
    
    public final long b() {
        return this.a;
    }
    
    public final long c() {
        return this.c;
    }
    
    public final lci d() {
        return this.g;
    }
    
    public final byte[] e() {
        return this.d;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof m8g) {
            final m8g m8g = (m8g)o;
            if (this.a == m8g.b()) {
                final Integer b2 = this.b;
                if (b2 == null) {
                    if (m8g.a() != null) {
                        return false;
                    }
                }
                else if (!b2.equals(m8g.a())) {
                    return false;
                }
                if (this.c == m8g.c()) {
                    final byte[] d = this.d;
                    byte[] array;
                    if (m8g instanceof mb1) {
                        array = ((mb1)m8g).d;
                    }
                    else {
                        array = m8g.e();
                    }
                    if (Arrays.equals(d, array)) {
                        final String e = this.e;
                        if (e == null) {
                            if (m8g.f() != null) {
                                return false;
                            }
                        }
                        else if (!e.equals(m8g.f())) {
                            return false;
                        }
                        if (this.f == m8g.g()) {
                            final lci g = this.g;
                            if (g == null) {
                                if (m8g.d() == null) {
                                    return b;
                                }
                            }
                            else if (g.equals(m8g.d())) {
                                return b;
                            }
                        }
                    }
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final String f() {
        return this.e;
    }
    
    public final long g() {
        return this.f;
    }
    
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final Integer b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final long c = this.c;
        final int n2 = (int)(c ^ c >>> 32);
        final int hashCode3 = Arrays.hashCode(this.d);
        final String e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final long f = this.f;
        final int n3 = (int)(f >>> 32 ^ f);
        final lci g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((((((n ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n3) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("LogEvent{eventTimeMs=");
        g.append(this.a);
        g.append(", eventCode=");
        g.append(this.b);
        g.append(", eventUptimeMs=");
        g.append(this.c);
        g.append(", sourceExtension=");
        g.append(Arrays.toString(this.d));
        g.append(", sourceExtensionJsonProto3=");
        g.append(this.e);
        g.append(", timezoneOffsetSeconds=");
        g.append(this.f);
        g.append(", networkConnectionInfo=");
        g.append(this.g);
        g.append("}");
        return g.toString();
    }
    
    public static final class a extends m8g$a
    {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public lci g;
    }
}
