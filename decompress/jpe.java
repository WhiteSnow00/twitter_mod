import android.view.KeyEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpe implements lmd
{
    public final KeyEvent a;
    
    public jpe(final KeyEvent a) {
        czd.f((Object)a, "event");
        this.a = a;
    }
    
    @Override
    public final KeyEvent a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof jpe && czd.a((Object)this.a, (Object)((jpe)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final KeyEvent a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("KeyDownEvent(event=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
