// 
// Decompiled by Procyon v0.6.0
// 

public final class rb4 extends tcn$b
{
    public static final rb4 a;
    
    static {
        a = new rb4();
    }
    
    public final void a(lzr lzr) {
        czd.f((Object)lzr, "db");
        lzr = lzr;
        ((mpb)lzr).u();
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            sb.append(System.currentTimeMillis() - frx.a);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            ((mpb)lzr).x(sb.toString());
            ((mpb)lzr).z();
        }
        finally {
            ((mpb)lzr).A();
        }
    }
}
