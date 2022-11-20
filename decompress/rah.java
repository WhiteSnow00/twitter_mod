// 
// Decompiled by Procyon v0.6.0
// 

public final class rah extends iah
{
    public static final rah c;
    
    static {
        c = new rah();
    }
    
    public rah() {
        super(8, 9);
    }
    
    public final void a(final lzr lzr) {
        czd.f((Object)lzr, "database");
        ((mpb)lzr).x("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
