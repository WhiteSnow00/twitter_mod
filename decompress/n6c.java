import com.google.android.gms.common.api.Status;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n6c implements m6c
{
    public final mcs<GoogleSignInAccount> a(final Intent intent) {
        final lag a = m8y.a;
        l6c l6c;
        if (intent == null) {
            l6c = new l6c(null, Status.M0);
        }
        else {
            final Status status = (Status)intent.getParcelableExtra("googleSignInStatus");
            final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount == null) {
                Status m0;
                if ((m0 = status) == null) {
                    m0 = Status.M0;
                }
                l6c = new l6c(null, m0);
            }
            else {
                l6c = new l6c(googleSignInAccount, Status.K0);
            }
        }
        final GoogleSignInAccount g0 = l6c.G0;
        mcs mcs;
        if (l6c.F0.p() && g0 != null) {
            mcs = mds.e((Object)g0);
        }
        else {
            mcs = mds.d((Exception)iuk.T(l6c.F0));
        }
        return (mcs<GoogleSignInAccount>)mcs;
    }
}
