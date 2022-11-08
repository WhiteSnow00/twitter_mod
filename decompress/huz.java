import android.os.BaseBundle;
import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class huz
{
    public final Context a;
    
    public huz(final Context a) {
        this.a = a;
    }
    
    public static String a(final Context context) {
        try {
            final Bundle metaData = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (metaData == null) {
                return null;
            }
            return ((BaseBundle)metaData).getString("local_testing_dir");
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
}
