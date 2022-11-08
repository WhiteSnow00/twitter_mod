import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f51
{
    @RecentlyNonNull
    public static final com.google.android.gms.common.api.a<f51.f51$a> a;
    @RecentlyNonNull
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> b;
    @RecentlyNonNull
    public static final a7y c;
    public static final com.google.android.gms.common.api.a.a<g7y, f51.f51$a> d;
    public static final com.google.android.gms.common.api.a.a<h6y, GoogleSignInOptions> e;
    
    static {
        final com.google.android.gms.common.api.a.g g = new com.google.android.gms.common.api.a.g();
        final com.google.android.gms.common.api.a.g g2 = new com.google.android.gms.common.api.a.g();
        final h5y h5y = f51.d = new h5y();
        final z5y z5y = f51.e = new z5y();
        a = new com.google.android.gms.common.api.a("Auth.CREDENTIALS_API", (com.google.android.gms.common.api.a.a)h5y, g);
        b = new com.google.android.gms.common.api.a("Auth.GOOGLE_SIGN_IN_API", (com.google.android.gms.common.api.a.a)z5y, g2);
        c = new a7y();
    }
}
