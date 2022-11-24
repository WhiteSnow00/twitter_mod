import java.util.Objects;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ec1 extends jbr$c
{
    public final String a;
    public final String b;
    public final boolean c;
    
    public ec1(final boolean c) {
        final String release = Build$VERSION.RELEASE;
        final String codename = Build$VERSION.CODENAME;
        Objects.requireNonNull(release, "Null osRelease");
        this.a = release;
        Objects.requireNonNull(codename, "Null osCodeName");
        this.b = codename;
        this.c = c;
    }
    
    public final boolean a() {
        return this.c;
    }
    
    public final String b() {
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
        if (o instanceof jbr$c) {
            final jbr$c jbr$c = (jbr$c)o;
            if (!this.a.equals(jbr$c.c()) || !this.b.equals(jbr$c.b()) || this.c != jbr$c.a()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        int n;
        if (this.c) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("OsData{osRelease=");
        f.append(this.a);
        f.append(", osCodeName=");
        f.append(this.b);
        f.append(", isRooted=");
        return xj0.B(f, this.c, "}");
    }
}
