import android.os.BaseBundle;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihw extends zzb
{
    public static final ihw.ihw$b Companion;
    public final String e;
    public final String f;
    
    static {
        Companion = new ihw.ihw$b();
    }
    
    public ihw(final Bundle bundle) {
        super(bundle);
        final String string = ((BaseBundle)bundle).getString("keySubtaskId");
        if (string == null) {
            throw new IllegalStateException();
        }
        this.e = string;
        final String string2 = ((BaseBundle)bundle).getString("keyFlowToken");
        if (string2 != null) {
            this.f = string2;
            return;
        }
        throw new IllegalStateException();
    }
}
