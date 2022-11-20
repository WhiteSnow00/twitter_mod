import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z6c extends yjf
{
    public final l6t X0;
    public final umd Y0;
    
    public z6c(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final l6t x0, final umd y0, final t8p t8p) {
        super(intent, r8x, resources, kas, pwe, jn, cnb, faf, hag, layoutInflater, xba, userIdentifier, xbv, pwe2, f6g, v8p, vam, obi, i7p, t8p);
        this.X0 = x0;
        this.Y0 = y0;
    }
    
    @Override
    public final a W4(final Intent intent, final xbv xbv) {
        return new a(this.Y0);
    }
    
    @Override
    public final CharSequence X4(final Intent intent) {
        return this.X0.a();
    }
    
    @Override
    public final CharSequence Y4(final Intent intent) {
        return this.X0.getTitle();
    }
}
