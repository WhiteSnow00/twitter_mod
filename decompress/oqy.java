import android.os.Bundle;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oqy extends jvy
{
    public final /* synthetic */ int G0;
    public final /* synthetic */ wxy H0;
    public final /* synthetic */ Object I0;
    
    @Override
    public final void a() {
        switch (this.G0) {
            default: {
                final doy f = this.H0.f;
                Objects.requireNonNull(f, "null reference");
                f.getCurrentScreenClass((roy)this.I0);
                return;
            }
            case 0: {
                final doy f2 = this.H0.f;
                Objects.requireNonNull(f2, "null reference");
                f2.setUserId((String)this.I0, super.C0);
            }
        }
    }
    
    @Override
    public final void b() {
        switch (this.G0) {
            default: {
                return;
            }
            case 1: {
                ((omy)this.I0).m((Bundle)null);
            }
        }
    }
}
