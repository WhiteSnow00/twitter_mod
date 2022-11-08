import com.twitter.util.user.UserIdentifier;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gd8
{
    public static Intent a(final Context context) {
        return bn.a().a(context, (zm)((h4j)new vfg$a()).e());
    }
    
    public static Intent b(final Context context, final vqa<Intent> vqa) {
        final qh qh = new qh(context, 3);
        Intent intent;
        if (UserIdentifier.getCurrent().isLoggedOutUser()) {
            intent = (Intent)qh.a();
        }
        else {
            intent = (Intent)vqa.a();
        }
        return intent;
    }
    
    public static Intent c(final Context context, final vqa<Intent> vqa) {
        Intent a;
        if (UserIdentifier.getCurrent().isLoggedOutUser()) {
            a = a(context);
        }
        else {
            a = (Intent)vqa.a();
        }
        return a;
    }
}
