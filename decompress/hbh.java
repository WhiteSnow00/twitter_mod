// 
// Decompiled by Procyon v0.6.0
// 

public final class hbh extends yah
{
    public static final hbh c;
    
    static {
        c = new hbh();
    }
    
    public hbh() {
        super(8, 9);
    }
    
    public final void a(final h0s h0s) {
        e0e.f((Object)h0s, "database");
        ((oqb)h0s).y("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
