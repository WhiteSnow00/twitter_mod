import android.content.res.Resources$NotFoundException;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v6z
{
    public static String a(Context context) {
        try {
            context = (Context)context.getResources().getResourcePackageName(2131952555);
        }
        catch (final Resources$NotFoundException ex) {
            context = (Context)context.getPackageName();
        }
        return (String)context;
    }
}
