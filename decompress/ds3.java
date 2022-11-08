import androidx.fragment.app.Fragment;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ds3 extends pkf
{
    public final cs3 W0;
    
    public ds3(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final cs3 w0, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, a8p);
        this.W0 = w0;
    }
    
    public final pkf.a W4(final Intent intent, final cbv cbv) {
        final fs3 fs3 = new fs3();
        final es3.a a = new es3.a();
        a.z(true);
        a.y(true);
        ((qrs$a)a).v((String)this.W0.a.getValue());
        ((Fragment)fs3).N1(((zl1)((h4j)a).e()).a);
        return new pkf.a(fs3);
    }
    
    public final CharSequence Y4(final Intent intent) {
        return ((x9)this).H4(2131955023);
    }
}
