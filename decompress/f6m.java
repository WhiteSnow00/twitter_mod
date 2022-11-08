import androidx.recyclerview.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f6m
{
    public final RecyclerView a;
    public final int b;
    public final int c;
    
    public f6m(final RecyclerView a, final int b, final int c) {
        zzd.g((Object)a, "view");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof f6m) {
                final f6m f6m = (f6m)o;
                if (zzd.a((Object)this.a, (Object)f6m.a) && this.b == f6m.b && this.c == f6m.c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final RecyclerView a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return (hashCode * 31 + this.b) * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("RecyclerViewScrollEvent(view=");
        g.append(this.a);
        g.append(", dx=");
        g.append(this.b);
        g.append(", dy=");
        return gd.y(g, this.c, ")");
    }
}
