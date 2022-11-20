import android.content.Context;
import android.content.ActivityNotFoundException;
import java.util.Objects;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s7
{
    public final f a;
    public final o5w b;
    public final wj6 c;
    public final u7 d;
    public final pft e;
    public final ah7 f;
    public final obi<?> g;
    
    public s7(final f a, final o5w b, final wj6 c, final u7 d, final pft e, final ah7 f, final obi<?> g) {
        czd.f((Object)a, "activity");
        czd.f((Object)b, "uriNavigator");
        czd.f((Object)c, "contactOptionSheetLauncher");
        czd.f((Object)d, "aboutModuleEventLogger");
        czd.f((Object)f, "dmChatLauncher");
        czd.f((Object)g, "navigator");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void a(final String s, final Uri uri, final int n, final qsb<? super Exception, fzv> qsb) {
        try {
            ((Context)this.a).startActivity(new Intent(s, uri));
        }
        catch (final Exception ex) {
            Objects.requireNonNull(this.e);
            czd.e((Object)m1f.e().c(2131954025, 0), "get().showText(messageRes, Toast.LENGTH_SHORT)");
            qsb.invoke((Object)ex);
        }
        catch (final ActivityNotFoundException ex2) {
            Objects.requireNonNull(this.e);
            czd.e((Object)m1f.e().c(n, 0), "get().showText(messageRes, Toast.LENGTH_SHORT)");
        }
    }
}
