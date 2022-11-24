import android.location.Location;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d7g
{
    public final Location a;
    public final x7g b;
    public final int c;
    
    public d7g(final Location a, final x7g b) {
        this.a = a;
        this.b = b;
        int c;
        if (a == null) {
            c = 2;
        }
        else if (b != null && !b.a.isEmpty()) {
            c = 1;
        }
        else {
            c = 3;
        }
        this.c = c;
    }
}
