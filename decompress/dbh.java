import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbh extends yah
{
    public static final dbh c;
    
    static {
        c = new dbh();
    }
    
    public dbh() {
        super(3, 4);
    }
    
    public final void a(final h0s h0s) {
        e0e.f((Object)h0s, "database");
        if (Build$VERSION.SDK_INT >= 23) {
            ((oqb)h0s).y("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
