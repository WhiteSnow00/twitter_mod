import java.util.Locale;
import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u02 implements z73
{
    public final String a;
    public final klo b;
    public final x6d c;
    public final z73 d;
    public final String e;
    public final int f;
    public final Object g;
    
    public u02(final String a, final klo b, final x6d c, final z73 d, final String e, final Object g) {
        Objects.requireNonNull(a);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final Integer value = a.hashCode();
        int hashCode = 0;
        final Integer value2 = 0;
        final Integer value3 = b.hashCode();
        int hashCode2;
        if (value == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = value.hashCode();
        }
        int hashCode3;
        if (value2 == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = value2.hashCode();
        }
        int hashCode4;
        if (value3 == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = value3.hashCode();
        }
        int hashCode5;
        if (c == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = c.hashCode();
        }
        int hashCode6;
        if (d == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = d.hashCode();
        }
        if (e != null) {
            hashCode = e.hashCode();
        }
        this.f = (((((hashCode2 + 31) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
        this.g = g;
        RealtimeSinceBootClock.get().now();
    }
    
    public final String a() {
        return this.a;
    }
    
    public final boolean b(final Uri uri) {
        return this.a.contains(uri.toString());
    }
    
    public final boolean c() {
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof u02;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final u02 u02 = (u02)o;
        boolean b3 = b2;
        if (this.f == u02.f) {
            b3 = b2;
            if (this.a.equals(u02.a)) {
                b3 = b2;
                if (q5j.a((Object)null, (Object)null)) {
                    b3 = b2;
                    if (q5j.a((Object)this.b, (Object)u02.b)) {
                        b3 = b2;
                        if (q5j.a((Object)this.c, (Object)u02.c)) {
                            b3 = b2;
                            if (q5j.a((Object)this.d, (Object)u02.d)) {
                                b3 = b2;
                                if (q5j.a((Object)this.e, (Object)u02.e)) {
                                    b3 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.a, null, this.b, this.c, this.d, this.e, this.f);
    }
}
