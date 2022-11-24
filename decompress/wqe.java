import android.view.KeyEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wqe implements lnd
{
    public final KeyEvent a;
    
    public wqe(final KeyEvent a) {
        e0e.f((Object)a, "event");
        this.a = a;
    }
    
    @Override
    public final KeyEvent a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof wqe && e0e.a((Object)this.a, (Object)((wqe)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final KeyEvent a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("KeyMultipleEvent(event=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
