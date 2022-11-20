import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.dynamite.DynamiteModule;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g5c extends b<GoogleSignInOptions>
{
    public static int k = 1;
    
    public g5c(final Context context, final GoogleSignInOptions googleSignInOptions) {
        super(context, a51.b, (a.d)googleSignInOptions, new b.a(new chw(), Looper.getMainLooper()));
    }
    
    @RecentlyNonNull
    public final ubs<Void> g() {
        final t2y h = super.h;
        final Context a = super.a;
        final boolean b = this.l() == 3;
        s7y.a.a("Signing out", new Object[0]);
        s7y.b(a);
        Object o;
        if (b) {
            final Status i0 = Status.I0;
            eli.r(i0, "Result must not be null");
            o = new zfr((c)h);
            ((BasePendingResult)o).g((psm)i0);
        }
        else {
            o = new g7y((c)h);
            h.E0.j(1, (com.google.android.gms.common.api.internal.a)o);
        }
        return f2k.a((e2k<psm>)o);
    }
    
    public final int l() {
        synchronized (this) {
            if (g5c.k == 1) {
                final Context a = super.a;
                final int c = p4c.c;
                final p4c e = p4c.e;
                final int c2 = e.c(a, 12451000);
                if (c2 == 0) {
                    g5c.k = 4;
                }
                else if (e.b(a, c2, (String)null) == null && DynamiteModule.a(a, "com.google.android.gms.auth.api.fallback") != 0) {
                    g5c.k = 3;
                }
                else {
                    g5c.k = 2;
                }
            }
            return g5c.k;
        }
    }
}
