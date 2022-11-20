import android.view.KeyEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpe
{
    public final KeyEvent a;
    
    public kpe(final KeyEvent a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final KeyEvent a = this.a;
        final boolean b = o instanceof kpe;
        boolean b2 = false;
        if (b) {
            if (czd.a((Object)a, (Object)((kpe)o).a)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final KeyEvent a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("KeyEvent(nativeKeyEvent=");
        sb.append(a);
        sb.append(')');
        return sb.toString();
    }
}
