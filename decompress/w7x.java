import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w7x
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
    
    public w7x(final View a, final int b, final int c, final int d, final int e, final int f, final int g, final int h, final int i) {
        zzd.g((Object)a, "view");
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
            if (o instanceof w7x) {
                final w7x w7x = (w7x)o;
                if (zzd.a((Object)this.a, (Object)w7x.a) && this.b == w7x.b && this.c == w7x.c && this.d == w7x.d && this.e == w7x.e && this.f == w7x.f && this.g == w7x.g && this.h == w7x.h && this.i == w7x.i) {
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
        final StringBuilder g = w48.g("ViewLayoutChangeEvent(view=");
        g.append(this.a);
        g.append(", left=");
        g.append(this.b);
        g.append(", top=");
        g.append(this.c);
        g.append(", right=");
        g.append(this.d);
        g.append(", bottom=");
        g.append(this.e);
        g.append(", oldLeft=");
        g.append(this.f);
        g.append(", oldTop=");
        g.append(this.g);
        g.append(", oldRight=");
        g.append(this.h);
        g.append(", oldBottom=");
        return gd.y(g, this.i, ")");
    }
}
