import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cly extends h0z
{
    public final String a;
    public final long b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final byte[] f;
    
    public cly(final String a, final long b, final int c, final boolean d, final boolean e, final byte[] f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final int a() {
        return this.c;
    }
    
    @Override
    public final long b() {
        return this.b;
    }
    
    @Override
    public final String c() {
        return this.a;
    }
    
    @Override
    public final boolean d() {
        return this.e;
    }
    
    @Override
    public final boolean e() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof h0z) {
            final h0z h0z = (h0z)o;
            final String a = this.a;
            if (a == null) {
                if (h0z.c() != null) {
                    return false;
                }
            }
            else if (!a.equals(h0z.c())) {
                return false;
            }
            if (this.b == h0z.b() && this.c == h0z.a() && this.d == h0z.e() && this.e == h0z.d()) {
                final byte[] f = this.f;
                byte[] array;
                if (h0z instanceof cly) {
                    array = ((cly)h0z).f;
                }
                else {
                    array = h0z.f();
                }
                if (Arrays.equals(f, array)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final byte[] f() {
        return this.f;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final int c = this.c;
        final boolean d = this.d;
        int n2 = 1237;
        int n3;
        if (!d) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        if (this.e) {
            n2 = 1231;
        }
        return (((((hashCode ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ c) * 1000003 ^ n3) * 1000003 ^ n2) * 1000003 ^ Arrays.hashCode(this.f);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final long b = this.b;
        final int c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final String string = Arrays.toString(this.f);
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 126 + String.valueOf(string).length());
        aob.h(sb, "ZipEntry{name=", a, ", size=");
        sb.append(b);
        sb.append(", compressionMethod=");
        sb.append(c);
        q1a.j(sb, ", isPartial=", d, ", isEndOfArchive=", e);
        return xa0.B(sb, ", headerBytes=", string, "}");
    }
}
