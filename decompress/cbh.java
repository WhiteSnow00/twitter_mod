// 
// Decompiled by Procyon v0.6.0
// 

public final class cbh extends yah
{
    public static final cbh c;
    
    static {
        c = new cbh();
    }
    
    public cbh() {
        super(1, 2);
    }
    
    public final void a(final h0s h0s) {
        e0e.f((Object)h0s, "database");
        final oqb oqb = (oqb)h0s;
        oqb.y("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        oqb.y("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        oqb.y("DROP TABLE IF EXISTS alarmInfo");
        oqb.y("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
