// 
// Decompiled by Procyon v0.6.0
// 

public final class mah extends gah
{
    public static final mah c;
    
    static {
        c = new mah();
    }
    
    public mah() {
        super(4, 5);
    }
    
    public final void a(final tyr tyr) {
        zzd.f((Object)tyr, "database");
        final qqb qqb = (qqb)tyr;
        qqb.x("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        qqb.x("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
