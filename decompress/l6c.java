import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l6c implements etm
{
    public Status F0;
    public GoogleSignInAccount G0;
    
    public l6c(final GoogleSignInAccount g0, @RecentlyNonNull final Status f0) {
        this.G0 = g0;
        this.F0 = f0;
    }
    
    public final Status k() {
        return this.F0;
    }
}
