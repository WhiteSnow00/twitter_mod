// 
// Decompiled by Procyon v0.6.0
// 

public final class pah extends gah
{
    public static final pah c;
    
    static {
        c = new pah();
    }
    
    public pah() {
        super(8, 9);
    }
    
    public final void a(final tyr tyr) {
        zzd.f((Object)tyr, "database");
        ((qqb)tyr).x("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
