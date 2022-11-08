import android.view.View;
import android.graphics.Bitmap;
import java.util.HashSet;
import com.twitter.profiles.HeaderImageView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rd1
{
    public static final a Companion;
    public final Context a;
    public final HeaderImageView b;
    public final s7l c;
    public HashSet<Bitmap> d;
    
    static {
        Companion = new a();
    }
    
    public rd1(final Context a, View viewById) {
        zzd.f((Object)a, "context");
        zzd.f((Object)viewById, "profileHeaderLayout");
        this.a = a;
        viewById = viewById.findViewById(2131430732);
        zzd.e((Object)viewById, "profileHeaderLayout.find\u2026ById(R.id.profile_header)");
        this.b = (HeaderImageView)viewById;
        this.c = new s7l(a);
    }
    
    public static final class a
    {
    }
}
