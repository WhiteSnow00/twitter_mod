import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kks
{
    public final TextView a;
    public final CharSequence b;
    public final int c;
    public final int d;
    public final int e;
    
    public kks(final TextView a, final CharSequence b, final int c, final int d, final int e) {
        czd.g((Object)a, "view");
        czd.g((Object)b, "text");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof kks) {
                final kks kks = (kks)o;
                if (czd.a((Object)this.a, (Object)kks.a) && czd.a((Object)this.b, (Object)kks.b) && this.c == kks.c && this.d == kks.d && this.e == kks.e) {
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
        final StringBuilder j = fu8.j("TextViewTextChangeEvent(view=");
        j.append(this.a);
        j.append(", text=");
        j.append(this.b);
        j.append(", start=");
        j.append(this.c);
        j.append(", before=");
        j.append(this.d);
        j.append(", count=");
        return wc0.A(j, this.e, ")");
    }
}
