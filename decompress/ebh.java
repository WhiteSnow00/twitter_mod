// 
// Decompiled by Procyon v0.6.0
// 

public final class ebh extends yah
{
    public static final ebh c;
    
    static {
        c = new ebh();
    }
    
    public ebh() {
        super(4, 5);
    }
    
    public final void a(final h0s h0s) {
        e0e.f((Object)h0s, "database");
        final oqb oqb = (oqb)h0s;
        oqb.y("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        oqb.y("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
