import java.util.Objects;
import android.text.TextUtils;
import com.google.android.exoplayer2.n;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cc8
{
    public final String a;
    public final n b;
    public final n c;
    public final int d;
    public final int e;
    
    public cc8(final String a, final n b, final n c, final int d, final int e) {
        omy.g(d == 0 || e == 0);
        if (!TextUtils.isEmpty((CharSequence)a)) {
            this.a = a;
            Objects.requireNonNull(b);
            this.b = b;
            Objects.requireNonNull(c);
            this.c = c;
            this.d = d;
            this.e = e;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && cc8.class == o.getClass()) {
            final cc8 cc8 = (cc8)o;
            if (this.d != cc8.d || this.e != cc8.e || !this.a.equals(cc8.a) || !this.b.equals((Object)cc8.b) || !this.c.equals((Object)cc8.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + hmg.f(this.a, ((this.d + 527) * 31 + this.e) * 31, 31)) * 31;
    }
}
