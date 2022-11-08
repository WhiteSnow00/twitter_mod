import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lah extends gah
{
    public static final lah c;
    
    static {
        c = new lah();
    }
    
    public lah() {
        super(3, 4);
    }
    
    public final void a(final tyr tyr) {
        zzd.f((Object)tyr, "database");
        if (Build$VERSION.SDK_INT >= 23) {
            ((qqb)tyr).x("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
