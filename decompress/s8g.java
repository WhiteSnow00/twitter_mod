import android.os.Build$VERSION;
import android.text.TextUtils;
import android.content.LocusId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s8g
{
    public final String a;
    public final LocusId b;
    
    public s8g(final String a) {
        if (!TextUtils.isEmpty((CharSequence)a)) {
            this.a = a;
            if (Build$VERSION.SDK_INT >= 29) {
                this.b = s8g.a.a(a);
            }
            else {
                this.b = null;
            }
            return;
        }
        throw new IllegalArgumentException("id cannot be empty");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (s8g.class != o.getClass()) {
            return false;
        }
        final s8g s8g = (s8g)o;
        final String a = this.a;
        if (a == null) {
            if (s8g.a != null) {
                b = false;
            }
            return b;
        }
        return a.equals(s8g.a);
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
        return 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("LocusIdCompat[");
        final int length = this.a.length();
        final StringBuilder sb = new StringBuilder();
        sb.append(length);
        sb.append("_chars");
        f.append(sb.toString());
        f.append("]");
        return f.toString();
    }
    
    public static final class a
    {
        public static LocusId a(final String s) {
            return new LocusId(s);
        }
    }
}
