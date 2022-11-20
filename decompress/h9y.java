import java.util.Iterator;
import java.util.Set;
import android.content.Context;
import android.util.Log;
import java.io.File;
import android.content.res.AssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h9y
{
    public final dxy a;
    
    public h9y(final dxy a) {
        this.a = a;
    }
    
    public static final int b(final AssetManager assetManager, final File file) {
        final int intValue = (int)q3j.n0((Object)assetManager, "addAssetPath", (Class)Integer.class, (Class)String.class, (Object)file.getPath());
        final StringBuilder sb = new StringBuilder(39);
        sb.append("addAssetPath completed with ");
        sb.append(intValue);
        Log.d("SplitCompat", sb.toString());
        return intValue;
    }
    
    public final void a(final Context context, final Set<File> set) {
        synchronized (this) {
            final AssetManager assets = context.getAssets();
            final Iterator<File> iterator = set.iterator();
            while (iterator.hasNext()) {
                b(assets, iterator.next());
            }
        }
    }
}
