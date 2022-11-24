import android.os.Parcelable$Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v1y implements Comparator
{
    public static final v1y F0;
    
    static {
        F0 = new v1y();
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final Scope scope = (Scope)o;
        final Scope scope2 = (Scope)o2;
        final Parcelable$Creator creator = GoogleSignInAccount.CREATOR;
        return scope.G0.compareTo(scope2.G0);
    }
}
