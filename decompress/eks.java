import android.view.KeyEvent;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eks
{
    public final TextView a;
    public final int b;
    public final KeyEvent c;
    
    public eks(final TextView a, final int b, final KeyEvent c) {
        czd.g((Object)a, "view");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof eks) {
                final eks eks = (eks)o;
                if (czd.a((Object)this.a, (Object)eks.a) && this.b == eks.b && czd.a((Object)this.c, (Object)eks.c)) {
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
        final int b = this.b;
        final KeyEvent c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + b) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("TextViewEditorActionEvent(view=");
        j.append(this.a);
        j.append(", actionId=");
        j.append(this.b);
        j.append(", keyEvent=");
        j.append(this.c);
        j.append(")");
        return j.toString();
    }
}
