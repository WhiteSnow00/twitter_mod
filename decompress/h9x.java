import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h9x
{
    public final View a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    
    public h9x(final View a, final int b, final int c, final int d, final int e, final int f, final int g, final int h, final int i) {
        e0e.g((Object)a, "view");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof h9x) {
                final h9x h9x = (h9x)o;
                if (e0e.a((Object)this.a, (Object)h9x.a) && this.b == h9x.b && this.c == h9x.c && this.d == h9x.d && this.e == h9x.e && this.f == h9x.f && this.g == h9x.g && this.h == h9x.h && this.i == h9x.i) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final View a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return (((((((hashCode * 31 + this.b) * 31 + this.c) * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h) * 31 + this.i;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("ViewLayoutChangeEvent(view=");
        f.append(this.a);
        f.append(", left=");
        f.append(this.b);
        f.append(", top=");
        f.append(this.c);
        f.append(", right=");
        f.append(this.d);
        f.append(", bottom=");
        f.append(this.e);
        f.append(", oldLeft=");
        f.append(this.f);
        f.append(", oldTop=");
        f.append(this.g);
        f.append(", oldRight=");
        f.append(this.h);
        f.append(", oldBottom=");
        return ad.y(f, this.i, ")");
    }
}
