// 
// Decompiled by Procyon v0.6.0
// 

public final class uc4 extends ldn$b
{
    public static final uc4 a;
    
    static {
        a = new uc4();
    }
    
    public final void a(h0s h0s) {
        e0e.f((Object)h0s, "db");
        h0s = h0s;
        ((oqb)h0s).v();
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            sb.append(System.currentTimeMillis() - wrx.a);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            ((oqb)h0s).y(sb.toString());
            ((oqb)h0s).A();
        }
        finally {
            ((oqb)h0s).B();
        }
    }
}
