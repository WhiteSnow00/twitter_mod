import android.os.BaseBundle;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t52 extends dl1
{
    public static final t52.t52$a Companion;
    public final String c;
    public final boolean d;
    
    static {
        Companion = new t52.t52$a();
    }
    
    public t52(final Bundle bundle) {
        super(bundle);
        this.c = ((BaseBundle)((zl1)this).a).getString("tweet_id");
        this.d = ((zl1)this).a.getBoolean("add_remove_sheet");
    }
}
