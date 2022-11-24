import java.util.Objects;
import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dc1 extends jbr$b
{
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;
    
    public dc1(final int a, final int c, final long d, final long e, final boolean f, final int g) {
        final String model = Build.MODEL;
        final String manufacturer = Build.MANUFACTURER;
        final String product = Build.PRODUCT;
        this.a = a;
        Objects.requireNonNull(model, "Null model");
        this.b = model;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        Objects.requireNonNull(manufacturer, "Null manufacturer");
        this.h = manufacturer;
        Objects.requireNonNull(product, "Null modelClass");
        this.i = product;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final int b() {
        return this.c;
    }
    
    public final long c() {
        return this.e;
    }
    
    public final boolean d() {
        return this.f;
    }
    
    public final String e() {
        return this.h;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof jbr$b) {
            final jbr$b jbr$b = (jbr$b)o;
            if (this.a != jbr$b.a() || !this.b.equals(jbr$b.f()) || this.c != jbr$b.b() || this.d != jbr$b.i() || this.e != jbr$b.c() || this.f != jbr$b.d() || this.g != jbr$b.h() || !this.h.equals(jbr$b.e()) || !this.i.equals(jbr$b.g())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final String f() {
        return this.b;
    }
    
    public final String g() {
        return this.i;
    }
    
    public final int h() {
        return this.g;
    }
    
    public final int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final int c = this.c;
        final long d = this.d;
        final int n = (int)(d ^ d >>> 32);
        final long e = this.e;
        final int n2 = (int)(e ^ e >>> 32);
        int n3;
        if (this.f) {
            n3 = 1231;
        }
        else {
            n3 = 1237;
        }
        return ((((((((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ c) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }
    
    public final long i() {
        return this.d;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("DeviceData{arch=");
        f.append(this.a);
        f.append(", model=");
        f.append(this.b);
        f.append(", availableProcessors=");
        f.append(this.c);
        f.append(", totalRam=");
        f.append(this.d);
        f.append(", diskSpace=");
        f.append(this.e);
        f.append(", isEmulator=");
        f.append(this.f);
        f.append(", state=");
        f.append(this.g);
        f.append(", manufacturer=");
        f.append(this.h);
        f.append(", modelClass=");
        return m51.y(f, this.i, "}");
    }
}
