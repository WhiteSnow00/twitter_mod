import java.util.Objects;
import com.twitter.core.ui.styles.icons.implementation.Icon;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w6s
{
    public final x6s a;
    public final Icon b;
    public final Icon c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    
    public w6s(final x6s a, final Icon b, final Icon c, final int d, final int e, final int f, final int g) {
        zzd.f((Object)b, "iconStroke");
        zzd.f((Object)c, "icon");
        k1b.i(f, "surface");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static w6s a(final w6s w6s) {
        final x6s a = w6s.a;
        final Icon b = w6s.b;
        final Icon c = w6s.c;
        final int d = w6s.d;
        final int e = w6s.e;
        final int f = w6s.f;
        final int g = w6s.g;
        Objects.requireNonNull(w6s);
        zzd.f((Object)a, "key");
        zzd.f((Object)b, "iconStroke");
        zzd.f((Object)c, "icon");
        k1b.i(f, "surface");
        return new w6s(a, b, c, d, e, f, g);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w6s)) {
            return false;
        }
        final w6s w6s = (w6s)o;
        return this.a == w6s.a && zzd.a((Object)this.b, (Object)w6s.b) && zzd.a((Object)this.c, (Object)w6s.c) && this.d == w6s.d && this.e == w6s.e && this.f == w6s.f && this.g == w6s.g;
    }
    
    @Override
    public final int hashCode() {
        return w48.e(this.f, (((this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31 + this.d) * 31 + this.e) * 31, 31) + this.g;
    }
    
    @Override
    public final String toString() {
        final x6s a = this.a;
        final Icon b = this.b;
        final Icon c = this.c;
        final int d = this.d;
        final int e = this.e;
        final int f = this.f;
        final int g = this.g;
        final StringBuilder sb = new StringBuilder();
        sb.append("TabCustomizationItem(key=");
        sb.append(a);
        sb.append(", iconStroke=");
        sb.append(b);
        sb.append(", icon=");
        sb.append(c);
        sb.append(", nameTabStringRes=");
        sb.append(d);
        sb.append(", position=");
        sb.append(e);
        sb.append(", surface=");
        sb.append(tok.m(f));
        sb.append(", contentDescriptionTabStringRes=");
        sb.append(g);
        sb.append(")");
        return sb.toString();
    }
}
