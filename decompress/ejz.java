import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.HashMap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejz
{
    public ejz(final Context context, final txp txp, final String s) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        zw4.a(context);
        ueg.a().b((Callable<Object>)new xiz(s));
        final ueg a = ueg.a();
        Objects.requireNonNull(txp);
        a.b((Callable<Object>)new tiz((Object)txp, 0));
    }
}
