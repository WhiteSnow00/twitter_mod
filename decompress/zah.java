// 
// Decompiled by Procyon v0.6.0
// 

public final class zah extends yah
{
    public static final zah c;
    
    static {
        c = new zah();
    }
    
    public zah() {
        super(11, 12);
    }
    
    public final void a(final h0s h0s) {
        e0e.f((Object)h0s, "database");
        ((oqb)h0s).y("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
