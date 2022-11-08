import androidx.work.impl.WorkDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vqx implements imb
{
    public final lbs a;
    public final gmb b;
    public final csx c;
    
    static {
        y9g.g("WMFgUpdater");
    }
    
    public vqx(final WorkDatabase workDatabase, final gmb b, final lbs a) {
        this.b = b;
        this.a = a;
        this.c = workDatabase.y();
    }
}
