import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pjs
{
    public final TextView a;
    public final CharSequence b;
    public final int c;
    public final int d;
    public final int e;
    
    public pjs(final TextView a, final CharSequence b, final int c, final int d, final int e) {
        zzd.g((Object)a, "view");
        zzd.g((Object)b, "text");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof pjs) {
                final pjs pjs = (pjs)o;
                if (zzd.a((Object)this.a, (Object)pjs.a) && zzd.a((Object)this.b, (Object)pjs.b) && this.c == pjs.c && this.d == pjs.d && this.e == pjs.e) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final TextView a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final CharSequence b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (((hashCode2 * 31 + hashCode) * 31 + this.c) * 31 + this.d) * 31 + this.e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("TextViewTextChangeEvent(view=");
        g.append(this.a);
        g.append(", text=");
        g.append(this.b);
        g.append(", start=");
        g.append(this.c);
        g.append(", before=");
        g.append(this.d);
        g.append(", count=");
        return gd.y(g, this.e, ")");
    }
}
