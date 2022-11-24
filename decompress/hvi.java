import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvi extends aj1
{
    public static final hvi.hvi$a Companion;
    
    static {
        Companion = new hvi.hvi$a();
    }
    
    public hvi() {
        super(new Intent());
    }
    
    public hvi(final Intent intent) {
        super(intent);
    }
    
    public final hvi a(final boolean b) {
        super.mIntent.putExtra("show_filters", b);
        return this;
    }
    
    public final hvi b(final boolean b) {
        super.mIntent.putExtra("show_preferences", b);
        return this;
    }
}
