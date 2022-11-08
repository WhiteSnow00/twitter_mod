import android.text.Editable;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjs
{
    public final TextView a;
    public final Editable b;
    
    public fjs(final TextView a, final Editable b) {
        zzd.g((Object)a, "view");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof fjs) {
                final fjs fjs = (fjs)o;
                if (zzd.a((Object)this.a, (Object)fjs.a) && zzd.a((Object)this.b, (Object)fjs.b)) {
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
        final Editable b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("TextViewAfterTextChangeEvent(view=");
        g.append(this.a);
        g.append(", editable=");
        g.append(this.b);
        g.append(")");
        return g.toString();
    }
}
