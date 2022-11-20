import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s5x extends t5x
{
    public final View a;
    
    public s5x(final View a) {
        czd.g((Object)a, "view");
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof s5x && czd.a((Object)this.a, (Object)((s5x)o).a));
    }
    
    public final int hashCode() {
        final View a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    public final String toString() {
        final StringBuilder j = fu8.j("ViewAttachDetachedEvent(view=");
        j.append(this.a);
        j.append(")");
        return j.toString();
    }
}
