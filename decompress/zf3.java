import androidx.work.impl.WorkDatabase;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zf3 extends cg3
{
    public final /* synthetic */ irx D0;
    public final /* synthetic */ UUID E0;
    
    public zf3(final irx d0, final UUID e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void c() {
        final WorkDatabase c = this.D0.c;
        ((gcn)c).c();
        try {
            this.a(this.D0, this.E0.toString());
            ((gcn)c).q();
            ((gcn)c).l();
            this.b(this.D0);
        }
        finally {
            ((gcn)c).l();
        }
    }
}
