// 
// Decompiled by Procyon v0.6.0
// 

public final class gbh extends yah
{
    public static final gbh c;
    
    static {
        c = new gbh();
    }
    
    public gbh() {
        super(7, 8);
    }
    
    public final void a(final h0s h0s) {
        e0e.f((Object)h0s, "database");
        ((oqb)h0s).y("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
